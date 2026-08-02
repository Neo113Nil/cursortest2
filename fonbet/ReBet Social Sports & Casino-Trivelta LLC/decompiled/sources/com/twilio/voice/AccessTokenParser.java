package com.twilio.voice;

import android.util.Base64;
import java.util.HashMap;

/* loaded from: classes4.dex */
class AccessTokenParser {
    private static final Logger logger = Logger.getLogger(AccessTokenParser.class);
    final String twilioVoiceHomeRegionSpecifier = "twr";
    final int numberOfSegmentsInAccessToken = 3;
    final int numberOfSegmentsInridgeToken = 5;
    String rawToken = null;
    String homeRegion = null;

    public AccessTokenParser(String str) {
        parse(str);
    }

    public void extractHeader(String str) {
        logger.i("JWT token HEADER: " + str);
        String[] split = str.replace("{", "").replace("}", "").split(",");
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < split.length; i10++) {
            String[] split2 = split[i10].split(":");
            hashMap.put(split2[0].replace("\"", ""), split2[1].replace("\"", ""));
        }
        String str2 = (String) hashMap.get("twr");
        this.homeRegion = str2;
        if (str2 == null || !str2.equalsIgnoreCase("null")) {
            return;
        }
        this.homeRegion = null;
    }

    public String getHomeRegion() {
        return this.homeRegion;
    }

    public void parse(String str) {
        this.rawToken = str;
        if (str != null) {
            String[] split = str.trim().split("\\.");
            if (split.length != 3 && split.length != 5) {
                throw new AccessTokenParseException("Access token must have 3 or 5 segments");
            }
            for (int i10 = 0; i10 < split.length; i10++) {
                split[i10] = new String(Base64.decode(split[i10].getBytes(), 8));
            }
            extractHeader(split[0]);
        }
    }
}

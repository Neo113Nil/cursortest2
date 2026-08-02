package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class Fc {
    public static final String d = "Ironsrc";
    public static final String e = "7";
    public static final String f = Omid.getVersion();
    public static final String g = "omidVersion";
    public static final String h = "omidPartnerName";
    public static final String i = "omidPartnerVersion";
    public static final String j = "omidActiveAdSessions";
    private static final String k = "Invalid OMID impressionOwner";
    private static final String l = "Invalid OMID videoEventsOwner";
    private static final String m = "Missing OMID impressionOwner";
    private static final String n = "Missing OMID videoEventsOwner";
    private static final String o = "OMID has not been activated";
    private static final String p = "Missing OMID creativeType";
    private static final String q = "Missing adview id in OMID params";
    private static final String r = "No adview found with the provided adViewId";
    private static final String s = "OMID Session has already started";
    private static final String t = "OMID Session has not started";
    private final Partner a = Partner.createPartner(d, e);
    private boolean c = false;
    private final HashMap<String, AdSession> b = new HashMap<>();

    static class a {
        private static final String i = "isolateVerificationScripts";
        private static final String j = "impressionOwner";
        private static final String k = "videoEventsOwner";
        private static final String l = "customReferenceData";
        private static final String m = "creativeType";
        private static final String n = "impressionType";
        public static final String o = "adViewId";
        public boolean a;
        public Owner b;
        public Owner c;
        public String d;
        public ImpressionType e;
        public CreativeType f;
        public String g;
        public Owner h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(Fc.m);
            }
            try {
                aVar.b = Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
                String optString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(optString)) {
                    throw new IllegalArgumentException(Fc.n);
                }
                try {
                    aVar.c = Owner.valueOf(optString2.toUpperCase(Locale.getDefault()));
                    aVar.d = jSONObject.optString("customReferenceData", "");
                    aVar.f = b(jSONObject);
                    aVar.e = c(jSONObject);
                    aVar.g = e(jSONObject);
                    aVar.h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e) {
                    C2556n4.d().a(e);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                }
            } catch (IllegalArgumentException e2) {
                C2556n4.d().a(e2);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(Fc.p + optString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (optString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(Fc.p + optString);
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(Fc.p + optString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (optString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(Fc.p + optString);
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e) {
                C2556n4.d().a(e);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("adViewId", "");
            if (TextUtils.isEmpty(optString)) {
                throw new IllegalArgumentException(Fc.q + optString);
            }
            return optString;
        }
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.c) {
            return;
        }
        Omid.activate(context);
        this.c = true;
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String optString = jSONObject.optString("adViewId");
        AdSession adSession = this.b.get(optString);
        if (adSession == null) {
            throw new IllegalStateException(t);
        }
        adSession.finish();
        this.b.remove(optString);
    }

    public void c(JSONObject jSONObject) throws IllegalArgumentException, IllegalStateException {
        a(jSONObject);
        AdSession adSession = this.b.get(jSONObject.optString("adViewId"));
        if (adSession == null) {
            throw new IllegalStateException(t);
        }
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        if (jSONObject.optBoolean("signalLoaded")) {
            createAdEvents.loaded();
        }
        createAdEvents.impressionOccurred();
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }

    public C2477ie a() {
        C2477ie c2477ie = new C2477ie();
        c2477ie.b(g, SDKUtils.encodeString(f));
        c2477ie.b(h, SDKUtils.encodeString(d));
        c2477ie.b(i, SDKUtils.encodeString(e));
        c2477ie.b(j, SDKUtils.encodeString(Arrays.toString(this.b.keySet().toArray())));
        return c2477ie;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (this.c) {
            if (!TextUtils.isEmpty(aVar.g)) {
                String str = aVar.g;
                if (!this.b.containsKey(str)) {
                    G8 a2 = C2524l8.a().a(str);
                    if (a2 != null) {
                        AdSession a3 = a(aVar, a2);
                        a3.start();
                        this.b.put(str, a3);
                        return;
                    }
                    throw new IllegalStateException(r);
                }
                throw new IllegalStateException(s);
            }
            throw new IllegalStateException(q);
        }
        throw new IllegalStateException(o);
    }

    private AdSession a(a aVar, G8 g8) throws IllegalArgumentException {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f, aVar.e, aVar.b, aVar.c, aVar.a), AdSessionContext.createHtmlAdSessionContext(this.a, g8.getPresentingView(), null, aVar.d));
        createAdSession.registerAdView(g8.getPresentingView());
        return createAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.c) {
            throw new IllegalStateException(o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(t);
        }
    }
}

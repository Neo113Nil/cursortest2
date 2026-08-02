package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.ironsource.C4452n4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.c5g;
import xsna.cqi;
import xsna.q2z;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class LevelPlaySegment {
    public static final a Companion = new a(null);
    public static final String IAPT = "iapt";
    public static final String LEVEL = "lvl";
    public static final String PAYING = "pay";
    public static final String SEGMENT_NAME = "segName";
    public static final String USER_CREATION_DATE = "ucd";
    private static final int h = 999999;
    private static final double i = 999999.99d;
    private static final int j = 5;
    private static final String k = "custom";
    private boolean c;
    private String d;
    private long g;
    private final ArrayList<Pair<String, String>> a = new ArrayList<>();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private int e = -1;
    private double f = -1.0d;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(String str) {
        if (str == null) {
            return false;
        }
        return new Regex("^[a-zA-Z0-9]*$").f(str);
    }

    public final ArrayList<Pair<String, String>> getCustoms$mediationsdk_release() {
        return this.a;
    }

    public final double getIapTotal() {
        return this.f;
    }

    public final int getLevel() {
        return this.e;
    }

    public final ArrayList<Pair<String, String>> getSegmentData() {
        IronLog.API.info("");
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        int i2 = this.e;
        if (i2 != -1) {
            arrayList.add(new Pair<>("lvl", String.valueOf(i2)));
        }
        if (this.c) {
            arrayList.add(new Pair<>("pay", String.valueOf(isPaying())));
        }
        double d = this.f;
        if (d != -1.0d) {
            arrayList.add(new Pair<>("iapt", String.valueOf(d)));
        }
        long j2 = this.g;
        if (j2 != 0) {
            arrayList.add(new Pair<>("ucd", String.valueOf(j2)));
        }
        String str = this.d;
        if (str != null && !TextUtils.isEmpty(str)) {
            q2z.a(SEGMENT_NAME, str, arrayList);
        }
        ArrayList<Pair<String, String>> arrayList2 = this.a;
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList3.add(new Pair(cqi.c(pair.i(), "custom_"), pair.j()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public final String getSegmentName() {
        return this.d;
    }

    public final long getUserCreationDate() {
        return this.g;
    }

    public final boolean isPaying() {
        return this.b.get();
    }

    public final void setCustom(String str, String str2) {
        IronLog.API.info("");
        try {
            if (a(str) && a(str, 1, 32) && a(str2) && a(str2, 1, 32)) {
                if (this.a.size() >= 5) {
                    this.a.remove(0);
                }
                this.a.add(new Pair<>(str, str2));
                return;
            }
            IronLog.INTERNAL.warning(str + ", " + str2 + " must be alphanumeric and 1-32 in length");
        } catch (Exception e) {
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void setIapTotal(double d) {
        IronLog.API.info("");
        if (ConnectivityTracker.DEFAULT_UPLINK_BITRATE <= d && d <= i) {
            double d2 = 100;
            this.f = Math.floor(d * d2) / d2;
            return;
        }
        IronLog.INTERNAL.warning(d + " must be between 0-999999.99");
    }

    public final void setLevel(int i2) {
        IronLog.API.info("");
        if (1 <= i2 && i2 < 1000000) {
            this.e = i2;
            return;
        }
        IronLog.INTERNAL.warning(i2 + " must be between 1-999999");
    }

    public final void setPaying(boolean z) {
        IronLog.API.info("");
        this.c = true;
        this.b.set(z);
    }

    public final void setSegmentName(String str) {
        IronLog.API.info("");
        if (a(str) && a(str, 1, 32)) {
            this.d = str;
            return;
        }
        IronLog.INTERNAL.warning(str + " must be alphanumeric and 1-32 in length");
    }

    public final void setUserCreationDate(long j2) {
        IronLog.API.info("");
        if (j2 > 0) {
            this.g = j2;
            return;
        }
        IronLog.INTERNAL.warning(j2 + " is an invalid timestamp");
    }

    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put(next.d(), next.g());
            } catch (JSONException e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    private final boolean a(String str, int i2, int i3) {
        return str != null && str.length() >= i2 && str.length() <= i3;
    }
}

package com.unity3d.mediation.segment;

import android.text.TextUtils;
import com.ironsource.C4157k4;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.k13;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlaySegment {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String IAPT = "iapt";

    @NotNull
    public static final String LEVEL = "lvl";

    @NotNull
    public static final String PAYING = "pay";

    @NotNull
    public static final String SEGMENT_NAME = "segName";

    @NotNull
    public static final String USER_CREATION_DATE = "ucd";
    private static final int h = 999999;
    private static final double i = 999999.99d;
    private static final int j = 5;

    @NotNull
    private static final String k = "custom";
    private boolean c;

    @Nullable
    private String d;
    private long g;

    @NotNull
    private final ArrayList<Pair<String, String>> a = new ArrayList<>();

    @NotNull
    private final AtomicBoolean b = new AtomicBoolean(false);
    private int e = -1;
    private double f = -1.0d;

    private final boolean a(String str, int i2, int i3) {
        return str != null && str.length() >= i2 && str.length() <= i3;
    }

    @NotNull
    public final ArrayList<Pair<String, String>> getCustoms$mediationsdk_release() {
        return this.a;
    }

    public final double getIapTotal() {
        return this.f;
    }

    public final int getLevel() {
        return this.e;
    }

    @NotNull
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
            arrayList.add(new Pair<>(SEGMENT_NAME, str));
        }
        ArrayList<Pair<String, String>> arrayList2 = this.a;
        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList3.add(new Pair(mz1.m(pair.a, "custom_"), pair.b));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Nullable
    public final String getSegmentName() {
        return this.d;
    }

    public final long getUserCreationDate() {
        return this.g;
    }

    public final boolean isPaying() {
        return this.b.get();
    }

    public final void setCustom(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
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
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public final void setIapTotal(double d) {
        IronLog.API.info("");
        if (0.0d <= d && d <= i) {
            this.f = Math.floor(d * 100.0d) / 100.0d;
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

    public final void setSegmentName(@Nullable String str) {
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

    @NotNull
    public final JSONObject toJson() {
        IronLog.API.info("");
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = getSegmentData().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put((String) next.a, (String) next.b);
            } catch (JSONException e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
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
}

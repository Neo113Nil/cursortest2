package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.vxd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.aa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3959aa {
    public static final String m = "age";
    public static final String n = "gen";
    public static final String o = "lvl";
    public static final String p = "pay";
    public static final String q = "iapt";
    public static final String r = "ucd";
    private static final String s = "segName";
    private String a;
    private String g;
    private int b = 999999;
    private double c = 999999.99d;
    private final String d = Payload.CUSTOM;
    private final int e = 5;
    private int f = -1;
    private int h = -1;
    private AtomicBoolean i = null;
    private double j = -1.0d;
    private long k = 0;
    private ArrayList<Pair<String, String>> l = new ArrayList<>();

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.l.size() >= 5) {
                    this.l.remove(0);
                }
                this.l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public double c() {
        return this.j;
    }

    public AtomicBoolean d() {
        return this.i;
    }

    public int e() {
        return this.h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f != -1) {
            arrayList.add(new Pair<>("age", fc6.h(this.f, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.g)) {
            arrayList.add(new Pair<>(n, this.g));
        }
        if (this.h != -1) {
            arrayList.add(new Pair<>("lvl", fc6.h(this.h, "", new StringBuilder())));
        }
        if (this.i != null) {
            arrayList.add(new Pair<>("pay", this.i + ""));
        }
        if (this.j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.j + ""));
        }
        if (this.k != 0) {
            arrayList.add(new Pair<>("ucd", lnb.l(this.k, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.a)) {
            arrayList.add(new Pair<>("segName", this.a));
        }
        arrayList.addAll(this.l);
        return arrayList;
    }

    public String g() {
        return this.a;
    }

    public long h() {
        return this.k;
    }

    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = f().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put((String) next.first, next.second);
            } catch (JSONException e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    @Deprecated
    public String b() {
        return this.g;
    }

    public void a(int i) {
        if (i > 0 && i < this.b) {
            this.h = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder t = lnb.t(i, "setLevel( ", " ) level must be between 1-");
        t.append(this.b);
        logger.log(ironSourceTag, t.toString(), 2);
    }

    public void a(boolean z) {
        AtomicBoolean atomicBoolean = this.i;
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean();
            this.i = atomicBoolean;
        }
        atomicBoolean.set(z);
    }

    public void a(double d) {
        if (d > 0.0d && d < this.c) {
            this.j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d + " ) iapt must be between 0-" + this.c, 2);
    }

    public void a(long j) {
        if (j > 0) {
            this.k = j;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, vxd.m("setUserCreationDate( ", j, " ) is an invalid timestamp"), 2);
        }
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, lnb.o("setSegmentName( ", str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
    }

    @Deprecated
    public int a() {
        return this.f;
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}

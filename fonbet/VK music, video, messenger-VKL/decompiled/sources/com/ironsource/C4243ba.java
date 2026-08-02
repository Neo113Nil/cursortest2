package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.efz;
import xsna.h5s;
import xsna.ji;
import xsna.lby;
import xsna.qlb0;
import xsna.zr;

/* renamed from: com.ironsource.ba, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4243ba {
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
    private final String d = "custom";
    private final int e = 5;
    private int f = -1;
    private int h = -1;
    private AtomicBoolean i = null;
    private double j = -1.0d;
    private long k = 0;
    private ArrayList<Pair<String, String>> l = new ArrayList<>();

    @Deprecated
    public int a() {
        return this.f;
    }

    @Deprecated
    public String b() {
        return this.g;
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
            arrayList.add(new Pair<>("age", h5s.c(this.f, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.g)) {
            arrayList.add(new Pair<>(n, this.g));
        }
        if (this.h != -1) {
            arrayList.add(new Pair<>("lvl", h5s.c(this.h, "", new StringBuilder())));
        }
        if (this.i != null) {
            arrayList.add(new Pair<>("pay", this.i + ""));
        }
        if (this.j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.j + ""));
        }
        if (this.k != 0) {
            arrayList.add(new Pair<>("ucd", efz.b(this.k, "", new StringBuilder())));
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
                C4452n4.d().a(e);
                IronLog.INTERNAL.error("exception " + e.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i) {
        if (i > 0 && i < this.b) {
            this.h = i;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder b = ji.b(i, "setLevel( ", " ) level must be between 1-");
        b.append(this.b);
        logger.log(ironSourceTag, b.toString(), 2);
    }

    public void a(boolean z) {
        if (this.i == null) {
            this.i = new AtomicBoolean();
        }
        this.i.set(z);
    }

    public void a(double d) {
        if (d > ConnectivityTracker.DEFAULT_UPLINK_BITRATE && d < this.c) {
            this.j = Math.floor(d * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder a = lby.a("setIAPTotal( ", d, " ) iapt must be between 0-");
        a.append(this.c);
        logger.log(ironSourceTag, a.toString(), 2);
    }

    public void a(long j) {
        if (j > 0) {
            this.k = j;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, qlb0.a(j, "setUserCreationDate( ", " ) is an invalid timestamp"), 2);
        }
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, zr.a("setSegmentName( ", str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
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
            C4452n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    private boolean a(String str, int i, int i2) {
        return str != null && str.length() >= i && str.length() <= i2;
    }
}

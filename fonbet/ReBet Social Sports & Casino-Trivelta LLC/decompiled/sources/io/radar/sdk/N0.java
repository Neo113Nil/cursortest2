package io.radar.sdk;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.plaid.internal.EnumC3631g;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class N0 {

    /* renamed from: u, reason: collision with root package name */
    public static final a f49715u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final N0 f49716v;

    /* renamed from: w, reason: collision with root package name */
    public static final N0 f49717w;

    /* renamed from: x, reason: collision with root package name */
    public static final N0 f49718x;

    /* renamed from: a, reason: collision with root package name */
    public int f49719a;

    /* renamed from: b, reason: collision with root package name */
    public int f49720b;

    /* renamed from: c, reason: collision with root package name */
    public int f49721c;

    /* renamed from: d, reason: collision with root package name */
    public int f49722d;

    /* renamed from: e, reason: collision with root package name */
    public int f49723e;

    /* renamed from: f, reason: collision with root package name */
    public b f49724f;

    /* renamed from: g, reason: collision with root package name */
    public int f49725g;

    /* renamed from: h, reason: collision with root package name */
    public int f49726h;

    /* renamed from: i, reason: collision with root package name */
    public Date f49727i;

    /* renamed from: j, reason: collision with root package name */
    public Date f49728j;

    /* renamed from: k, reason: collision with root package name */
    public d f49729k;

    /* renamed from: l, reason: collision with root package name */
    public e f49730l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f49731m;

    /* renamed from: n, reason: collision with root package name */
    public int f49732n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f49733o;

    /* renamed from: p, reason: collision with root package name */
    public int f49734p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f49735q;

    /* renamed from: r, reason: collision with root package name */
    public int f49736r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f49737s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f49738t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 io.radar.sdk.N0, still in use, count: 2, list:
              (r2v6 io.radar.sdk.N0) from 0x0100: MOVE (r13v2 io.radar.sdk.N0) = (r2v6 io.radar.sdk.N0) (LINE:257)
              (r2v6 io.radar.sdk.N0) from 0x00e4: MOVE (r13v5 io.radar.sdk.N0) = (r2v6 io.radar.sdk.N0) (LINE:229)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final io.radar.sdk.N0 a(org.json.JSONObject r24) {
            /*
                Method dump skipped, instructions count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.radar.sdk.N0.a.a(org.json.JSONObject):io.radar.sdk.N0");
        }

        public a() {
        }
    }

    public enum b {
        HIGH(3),
        MEDIUM(2),
        LOW(1),
        NONE(0);


        /* renamed from: b, reason: collision with root package name */
        public static final a f49739b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f49744a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(Integer num) {
                for (b bVar : b.values()) {
                    int b10 = bVar.b();
                    if (num != null && num.intValue() == b10) {
                        return bVar;
                    }
                }
                return b.MEDIUM;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final b b(String str) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1078030475:
                            if (str.equals("medium")) {
                                return b.MEDIUM;
                            }
                            break;
                        case 107348:
                            if (str.equals("low")) {
                                return b.LOW;
                            }
                            break;
                        case 3202466:
                            if (str.equals("high")) {
                                return b.HIGH;
                            }
                            break;
                        case 3387192:
                            if (str.equals(ViewProps.NONE)) {
                                return b.NONE;
                            }
                            break;
                    }
                }
                return b.MEDIUM;
            }

            public a() {
            }
        }

        /* renamed from: io.radar.sdk.N0$b$b, reason: collision with other inner class name */
        public /* synthetic */ class C0736b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.HIGH.ordinal()] = 1;
                iArr[b.MEDIUM.ordinal()] = 2;
                iArr[b.LOW.ordinal()] = 3;
                iArr[b.NONE.ordinal()] = 4;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(int i10) {
            this.f49744a = i10;
        }

        public final int b() {
            return this.f49744a;
        }

        public final String c() {
            int i10 = C0736b.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "high";
            }
            if (i10 == 2) {
                return "medium";
            }
            if (i10 == 3) {
                return "low";
            }
            if (i10 == 4) {
                return ViewProps.NONE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public enum d {
        ALL(2),
        STOPS(1),
        NONE(0);


        /* renamed from: b, reason: collision with root package name */
        public static final a f49756b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f49760a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(Integer num) {
                for (d dVar : d.values()) {
                    int b10 = dVar.b();
                    if (num != null && num.intValue() == b10) {
                        return dVar;
                    }
                }
                return d.NONE;
            }

            public final d b(String str) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 96673) {
                        if (hashCode != 3387192) {
                            if (hashCode == 109770929 && str.equals("stops")) {
                                return d.STOPS;
                            }
                        } else if (str.equals(ViewProps.NONE)) {
                            return d.NONE;
                        }
                    } else if (str.equals("all")) {
                        return d.ALL;
                    }
                }
                return d.NONE;
            }

            public a() {
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[d.values().length];
                iArr[d.STOPS.ordinal()] = 1;
                iArr[d.NONE.ordinal()] = 2;
                iArr[d.ALL.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        d(int i10) {
            this.f49760a = i10;
        }

        public final int b() {
            return this.f49760a;
        }

        public final String c() {
            int i10 = b.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "stops";
            }
            if (i10 == 2) {
                return ViewProps.NONE;
            }
            if (i10 == 3) {
                return "all";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public enum e {
        NONE(0),
        STOPS_AND_EXITS(1),
        ALL(2);


        /* renamed from: b, reason: collision with root package name */
        public static final a f49761b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final int f49765a;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(Integer num) {
                for (e eVar : e.values()) {
                    int b10 = eVar.b();
                    if (num != null && num.intValue() == b10) {
                        return eVar;
                    }
                }
                return e.STOPS_AND_EXITS;
            }

            public final e b(String str) {
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != 96673) {
                        if (hashCode != 3387192) {
                            if (hashCode == 1965468495 && str.equals("stopsAndExits")) {
                                return e.STOPS_AND_EXITS;
                            }
                        } else if (str.equals(ViewProps.NONE)) {
                            return e.NONE;
                        }
                    } else if (str.equals("all")) {
                        return e.ALL;
                    }
                }
                return e.STOPS_AND_EXITS;
            }

            public a() {
            }
        }

        public /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[e.values().length];
                iArr[e.ALL.ordinal()] = 1;
                iArr[e.STOPS_AND_EXITS.ordinal()] = 2;
                iArr[e.NONE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        e(int i10) {
            this.f49765a = i10;
        }

        public final int b() {
            return this.f49765a;
        }

        public final String c() {
            int i10 = b.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "all";
            }
            if (i10 == 2) {
                return "stopsAndExits";
            }
            if (i10 == 3) {
                return ViewProps.NONE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        b bVar = b.HIGH;
        d dVar = d.NONE;
        e eVar = e.ALL;
        f49716v = new N0(30, 30, 30, 30, 20, bVar, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 70, null, null, dVar, eVar, false, 0, false, 0, true, 0, true, false);
        b bVar2 = b.MEDIUM;
        d dVar2 = d.STOPS;
        f49717w = new N0(0, 0, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE, 30, 20, bVar2, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 70, null, null, dVar2, eVar, true, 100, true, 100, true, 10, false, false);
        f49718x = new N0(3600, 1200, 1200, 360, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, bVar2, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 70, null, null, dVar2, eVar, false, 0, false, 0, true, 10, false, false);
    }

    public N0(int i10, int i11, int i12, int i13, int i14, b desiredAccuracy, int i15, int i16, Date date, Date date2, d replay, e sync, boolean z10, int i17, boolean z11, int i18, boolean z12, int i19, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(desiredAccuracy, "desiredAccuracy");
        Intrinsics.checkNotNullParameter(replay, "replay");
        Intrinsics.checkNotNullParameter(sync, "sync");
        this.f49719a = i10;
        this.f49720b = i11;
        this.f49721c = i12;
        this.f49722d = i13;
        this.f49723e = i14;
        this.f49724f = desiredAccuracy;
        this.f49725g = i15;
        this.f49726h = i16;
        this.f49727i = date;
        this.f49728j = date2;
        this.f49729k = replay;
        this.f49730l = sync;
        this.f49731m = z10;
        this.f49732n = i17;
        this.f49733o = z11;
        this.f49734p = i18;
        this.f49735q = z12;
        this.f49736r = i19;
        this.f49737s = z13;
        this.f49738t = z14;
    }

    public static final N0 a(JSONObject jSONObject) {
        return f49715u.a(jSONObject);
    }

    public final boolean b() {
        return this.f49738t;
    }

    public final b c() {
        return this.f49724f;
    }

    public final int d() {
        return this.f49721c;
    }

    public final int e() {
        return this.f49719a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f49719a == n02.f49719a && this.f49720b == n02.f49720b && this.f49721c == n02.f49721c && this.f49722d == n02.f49722d && this.f49723e == n02.f49723e && this.f49724f == n02.f49724f && this.f49725g == n02.f49725g && this.f49726h == n02.f49726h && Intrinsics.areEqual(this.f49727i, n02.f49727i) && Intrinsics.areEqual(this.f49728j, n02.f49728j) && this.f49729k == n02.f49729k && this.f49730l == n02.f49730l && this.f49731m == n02.f49731m && this.f49732n == n02.f49732n && this.f49733o == n02.f49733o && this.f49734p == n02.f49734p && this.f49735q == n02.f49735q && this.f49736r == n02.f49736r && this.f49737s == n02.f49737s && this.f49738t == n02.f49738t;
    }

    public final int f() {
        return this.f49723e;
    }

    public final int g() {
        return this.f49722d;
    }

    public final int h() {
        return this.f49720b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f49719a) * 31) + Integer.hashCode(this.f49720b)) * 31) + Integer.hashCode(this.f49721c)) * 31) + Integer.hashCode(this.f49722d)) * 31) + Integer.hashCode(this.f49723e)) * 31) + this.f49724f.hashCode()) * 31) + Integer.hashCode(this.f49725g)) * 31) + Integer.hashCode(this.f49726h)) * 31;
        Date date = this.f49727i;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f49728j;
        int hashCode3 = (((((hashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.f49729k.hashCode()) * 31) + this.f49730l.hashCode()) * 31;
        boolean z10 = this.f49731m;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int hashCode4 = (((hashCode3 + i10) * 31) + Integer.hashCode(this.f49732n)) * 31;
        boolean z11 = this.f49733o;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode5 = (((hashCode4 + i11) * 31) + Integer.hashCode(this.f49734p)) * 31;
        boolean z12 = this.f49735q;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int hashCode6 = (((hashCode5 + i12) * 31) + Integer.hashCode(this.f49736r)) * 31;
        boolean z13 = this.f49737s;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode6 + i13) * 31;
        boolean z14 = this.f49738t;
        return i14 + (z14 ? 1 : z14 ? 1 : 0);
    }

    public final boolean i() {
        return this.f49737s;
    }

    public final int j() {
        return this.f49734p;
    }

    public final d k() {
        return this.f49729k;
    }

    public final Date l() {
        return this.f49727i;
    }

    public final int m() {
        return this.f49726h;
    }

    public final int n() {
        return this.f49725g;
    }

    public final Date o() {
        return this.f49728j;
    }

    public final int p() {
        return this.f49732n;
    }

    public final e q() {
        return this.f49730l;
    }

    public final boolean r() {
        return this.f49735q;
    }

    public final int s() {
        return this.f49736r;
    }

    public final boolean t() {
        return this.f49733o;
    }

    public String toString() {
        return "RadarTrackingOptions(desiredStoppedUpdateInterval=" + this.f49719a + ", fastestStoppedUpdateInterval=" + this.f49720b + ", desiredMovingUpdateInterval=" + this.f49721c + ", fastestMovingUpdateInterval=" + this.f49722d + ", desiredSyncInterval=" + this.f49723e + ", desiredAccuracy=" + this.f49724f + ", stopDuration=" + this.f49725g + ", stopDistance=" + this.f49726h + ", startTrackingAfter=" + this.f49727i + ", stopTrackingAfter=" + this.f49728j + ", replay=" + this.f49729k + ", sync=" + this.f49730l + ", useStoppedGeofence=" + this.f49731m + ", stoppedGeofenceRadius=" + this.f49732n + ", useMovingGeofence=" + this.f49733o + ", movingGeofenceRadius=" + this.f49734p + ", syncGeofences=" + this.f49735q + ", syncGeofencesLimit=" + this.f49736r + ", foregroundServiceEnabled=" + this.f49737s + ", beacons=" + this.f49738t + ')';
    }

    public final boolean u() {
        return this.f49731m;
    }

    public final void v(d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f49729k = dVar;
    }

    public final void w(Date date) {
        this.f49727i = date;
    }

    public final void x(Date date) {
        this.f49728j = date;
    }

    public final void y(e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f49730l = eVar;
    }

    public final JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("desiredStoppedUpdateInterval", this.f49719a);
        jSONObject.put("fastestStoppedUpdateInterval", this.f49720b);
        jSONObject.put("desiredMovingUpdateInterval", this.f49721c);
        jSONObject.put("fastestMovingUpdateInterval", this.f49722d);
        jSONObject.put("desiredSyncInterval", this.f49723e);
        jSONObject.put("desiredAccuracy", this.f49724f.c());
        jSONObject.put("stopDuration", this.f49725g);
        jSONObject.put("stopDistance", this.f49726h);
        Date date = this.f49727i;
        jSONObject.put("startTrackingAfter", date != null ? Long.valueOf(date.getTime()) : null);
        Date date2 = this.f49728j;
        jSONObject.put("stopTrackingAfter", date2 != null ? Long.valueOf(date2.getTime()) : null);
        jSONObject.put("replay", this.f49729k.c());
        jSONObject.put(BaseJavaModule.METHOD_TYPE_SYNC, this.f49730l.c());
        jSONObject.put("useStoppedGeofence", this.f49731m);
        jSONObject.put("stoppedGeofenceRadius", this.f49732n);
        jSONObject.put("useMovingGeofence", this.f49733o);
        jSONObject.put("movingGeofenceRadius", this.f49734p);
        jSONObject.put("syncGeofences", this.f49735q);
        jSONObject.put("syncGeofencesLimit", this.f49736r);
        jSONObject.put("foregroundServiceEnabled", this.f49737s);
        jSONObject.put("beacons", this.f49738t);
        return jSONObject;
    }

    public static final class c {

        /* renamed from: k, reason: collision with root package name */
        public static final a f49745k = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f49746a;

        /* renamed from: b, reason: collision with root package name */
        public final String f49747b;

        /* renamed from: c, reason: collision with root package name */
        public final Integer f49748c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f49749d;

        /* renamed from: e, reason: collision with root package name */
        public final String f49750e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f49751f;

        /* renamed from: g, reason: collision with root package name */
        public final Integer f49752g;

        /* renamed from: h, reason: collision with root package name */
        public final String f49753h;

        /* renamed from: i, reason: collision with root package name */
        public String f49754i;

        /* renamed from: j, reason: collision with root package name */
        public String f49755j;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                return new c(jSONObject.isNull("text") ? null : jSONObject.optString("text"), jSONObject.isNull("title") ? null : jSONObject.optString("title"), jSONObject.isNull("icon") ? null : Integer.valueOf(jSONObject.optInt("icon")), jSONObject.optBoolean("updatesOnly"), jSONObject.isNull("activity") ? null : jSONObject.optString("activity"), jSONObject.isNull("importance") ? null : Integer.valueOf(jSONObject.optInt("importance")), jSONObject.isNull(StackTraceHelper.ID_KEY) ? null : Integer.valueOf(jSONObject.optInt(StackTraceHelper.ID_KEY)), jSONObject.isNull("channelName") ? null : jSONObject.optString("channelName"), jSONObject.isNull("iconString") ? null : jSONObject.optString("iconString"), jSONObject.isNull("iconColor") ? null : jSONObject.optString("iconColor"));
            }

            public a() {
            }
        }

        public c(String str, String str2, Integer num, boolean z10, String str3, Integer num2, Integer num3, String str4, String str5, String str6) {
            this.f49746a = str;
            this.f49747b = str2;
            this.f49748c = num;
            this.f49749d = z10;
            this.f49750e = str3;
            this.f49751f = num2;
            this.f49752g = num3;
            this.f49753h = str4;
            this.f49754i = str5;
            this.f49755j = str6;
        }

        public static final c a(JSONObject jSONObject) {
            return f49745k.a(jSONObject);
        }

        public final String b() {
            return this.f49750e;
        }

        public final String c() {
            return this.f49753h;
        }

        public final Integer d() {
            return this.f49748c;
        }

        public final String e() {
            return this.f49755j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f49746a, cVar.f49746a) && Intrinsics.areEqual(this.f49747b, cVar.f49747b) && Intrinsics.areEqual(this.f49748c, cVar.f49748c) && this.f49749d == cVar.f49749d && Intrinsics.areEqual(this.f49750e, cVar.f49750e) && Intrinsics.areEqual(this.f49751f, cVar.f49751f) && Intrinsics.areEqual(this.f49752g, cVar.f49752g) && Intrinsics.areEqual(this.f49753h, cVar.f49753h) && Intrinsics.areEqual(this.f49754i, cVar.f49754i) && Intrinsics.areEqual(this.f49755j, cVar.f49755j);
        }

        public final String f() {
            return this.f49754i;
        }

        public final Integer g() {
            return this.f49752g;
        }

        public final Integer h() {
            return this.f49751f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.f49746a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f49747b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f49748c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            boolean z10 = this.f49749d;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode3 + i10) * 31;
            String str3 = this.f49750e;
            int hashCode4 = (i11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.f49751f;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f49752g;
            int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str4 = this.f49753h;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f49754i;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f49755j;
            return hashCode8 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String i() {
            return this.f49746a;
        }

        public final String j() {
            return this.f49747b;
        }

        public final boolean k() {
            return this.f49749d;
        }

        public final void l(String str) {
            this.f49755j = str;
        }

        public final void m(String str) {
            this.f49754i = str;
        }

        public final JSONObject n() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("text", this.f49746a);
            jSONObject.put("title", this.f49747b);
            jSONObject.put("icon", this.f49748c);
            jSONObject.put("iconString", this.f49754i);
            jSONObject.put("iconColor", this.f49755j);
            jSONObject.put("activity", this.f49750e);
            jSONObject.put("updatesOnly", this.f49749d);
            jSONObject.put("importance", this.f49751f);
            jSONObject.put(StackTraceHelper.ID_KEY, this.f49752g);
            jSONObject.put("channelName", this.f49753h);
            return jSONObject;
        }

        public String toString() {
            return "RadarTrackingOptionsForegroundService(text=" + this.f49746a + ", title=" + this.f49747b + ", icon=" + this.f49748c + ", updatesOnly=" + this.f49749d + ", activity=" + this.f49750e + ", importance=" + this.f49751f + ", id=" + this.f49752g + ", channelName=" + this.f49753h + ", iconString=" + this.f49754i + ", iconColor=" + this.f49755j + ')';
        }

        public /* synthetic */ c(String str, String str2, Integer num, boolean z10, String str3, Integer num2, Integer num3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) != 0 ? null : num3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6);
        }
    }
}

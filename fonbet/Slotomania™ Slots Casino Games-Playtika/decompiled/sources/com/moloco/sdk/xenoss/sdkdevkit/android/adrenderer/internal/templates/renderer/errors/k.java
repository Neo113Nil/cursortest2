package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class k extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g {
    public static final int i = 0;
    public final String h;

    public static final class a extends k {
        public static final a j = new a();
        public static final int k = 0;

        public a() {
            super("net::ERR_BLOCKED_BY_ORTB", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2086682310;
        }

        public String toString() {
            return "ERR_BLOCKED_BY_ORTB";
        }
    }

    public static final class b extends k {
        public static final b j = new b();
        public static final int k = 0;

        public b() {
            super("net::ERR_CLEARTEXT_NOT_PERMITTED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1499225977;
        }

        public String toString() {
            return "ERR_CLEARTEXT_NOT_PERMITTED";
        }
    }

    public static final class c extends k {
        public static final c j = new c();
        public static final int k = 0;

        public c() {
            super("net::ERR_FAILED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 1678282877;
        }

        public String toString() {
            return "ERR_FAILED";
        }
    }

    public static final class d extends k {
        public static final d j = new d();
        public static final int k = 0;

        public d() {
            super("net::ERR_HTTP2_PING_FAILED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 505018197;
        }

        public String toString() {
            return "ERR_HTTP2_PING_FAILED";
        }
    }

    public static final class e extends k {
        public static final e j = new e();
        public static final int k = 0;

        public e() {
            super("net::ERR_HTTP2_PROTOCOL_ERROR", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 1437709814;
        }

        public String toString() {
            return "ERR_HTTP2_PROTOCOL_ERROR";
        }
    }

    public static final class f extends k {
        public static final f j = new f();
        public static final int k = 0;

        public f() {
            super("net::ERR_NETWORK_CHANGED", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -1485714141;
        }

        public String toString() {
            return "ERR_NETWORK_CHANGED";
        }
    }

    public static final class g extends k {
        public static final g j = new g();
        public static final int k = 0;

        public g() {
            super("net::ERR_QUIC_PROTOCOL_ERROR", null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return -1472226974;
        }

        public String toString() {
            return "ERR_QUIC_PROTOCOL_ERROR";
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
    public String c() {
        return this.h;
    }

    public k(String str) {
        super(-1, str, true, false, null);
        this.h = str;
    }
}

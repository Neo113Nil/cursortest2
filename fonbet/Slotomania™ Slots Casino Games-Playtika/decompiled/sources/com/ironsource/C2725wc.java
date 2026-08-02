package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2725wc implements Ed {
    private final String a;

    /* renamed from: com.ironsource.wc$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "IronSource";

        private a() {
        }
    }

    public C2725wc(String networkInstanceId) {
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.a = networkInstanceId;
    }

    @Override // com.ironsource.Ed
    public String value() {
        if (this.a.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.a, "0") || Intrinsics.areEqual(this.a, "IronSource")) {
            return "IronSource";
        }
        return "IronSource_" + this.a;
    }
}

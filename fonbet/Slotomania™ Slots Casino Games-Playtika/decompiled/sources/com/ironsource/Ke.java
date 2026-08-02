package com.ironsource;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Ke implements Je {
    private final J8 a;

    public static final class a {
        public static final a a = new a();
        public static final String b = "sessionNumber";
        public static final String c = "firstSessionTimestamp";

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ke() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.Le
    public void a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context, a.b, i);
    }

    @Override // com.ironsource.Le
    public int b(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.a.b(context, a.b, i);
    }

    public Ke(J8 sdkSharedPref) {
        Intrinsics.checkNotNullParameter(sdkSharedPref, "sdkSharedPref");
        this.a = sdkSharedPref;
    }

    @Override // com.ironsource.InterfaceC2620qe
    public long a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC2620qe
    public void b(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a.a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ Ke(J8 j8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Me() : j8);
    }
}

package com.ironsource;

import android.content.Context;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Ke implements Je {
    private final K8 a;

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
        this.a.a(context, a.b, i);
    }

    @Override // com.ironsource.Le
    public int b(Context context, int i) {
        return this.a.b(context, a.b, i);
    }

    public Ke(K8 k8) {
        this.a = k8;
    }

    @Override // com.ironsource.InterfaceC4516qe
    public long a(Context context, long j) {
        return this.a.b(context, "firstSessionTimestamp", j);
    }

    @Override // com.ironsource.InterfaceC4516qe
    public void b(Context context, long j) {
        this.a.a(context, "firstSessionTimestamp", j);
    }

    public /* synthetic */ Ke(K8 k8, int i, zcl zclVar) {
        this((i & 1) != 0 ? new Me() : k8);
    }
}

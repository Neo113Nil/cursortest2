package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Zb extends W {
    private final String s;
    private final List<NetworkSettings> t;
    private final Pb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Zb(String str, List<? extends NetworkSettings> list, Pb configs) {
        super(IronSource.a.NATIVE_AD, str, list, configs.d(), configs.b(), (int) (configs.c() / 1000), configs.a(), configs.f(), -1, new O0(O0.a.MANUAL, configs.d().j(), configs.d().b(), -1L), new J0(-1L), configs.h(), configs.i(), configs.k(), configs.j(), false, 32768, null);
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.s = str;
        this.t = list;
        this.u = configs;
    }

    public final Zb a(String str, List<? extends NetworkSettings> list, Pb configs) {
        Intrinsics.checkNotNullParameter(configs, "configs");
        return new Zb(str, list, configs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zb)) {
            return false;
        }
        Zb zb = (Zb) obj;
        return Intrinsics.areEqual(this.s, zb.s) && Intrinsics.areEqual(this.t, zb.t) && Intrinsics.areEqual(this.u, zb.u);
    }

    public int hashCode() {
        String str = this.s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.t;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.u.hashCode();
    }

    @Override // com.ironsource.W
    public List<NetworkSettings> j() {
        return this.t;
    }

    @Override // com.ironsource.W
    public String o() {
        return this.s;
    }

    public final String s() {
        return this.s;
    }

    public final List<NetworkSettings> t() {
        return this.t;
    }

    public String toString() {
        return "NativeAdManagerData(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ")";
    }

    public final Pb u() {
        return this.u;
    }

    public final Pb v() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Zb a(Zb zb, String str, List list, Pb pb, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zb.s;
        }
        if ((i & 2) != 0) {
            list = zb.t;
        }
        if ((i & 4) != 0) {
            pb = zb.u;
        }
        return zb.a(str, list, pb);
    }
}

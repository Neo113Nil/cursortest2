package com.ironsource;

import com.ironsource.O0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import xsna.epx;

/* renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4227ac extends W {
    private final String s;
    private final List<NetworkSettings> t;
    private final Qb u;

    /* JADX WARN: Multi-variable type inference failed */
    public C4227ac(String str, List<? extends NetworkSettings> list, Qb qb) {
        super(IronSource.a.NATIVE_AD, str, list, qb.d(), qb.b(), (int) (qb.c() / 1000), qb.a(), qb.f(), -1, new O0(O0.a.MANUAL, qb.d().j(), qb.d().b(), -1L), new J0(-1L), qb.h(), qb.i(), qb.k(), qb.j(), false, 32768, null);
        this.s = str;
        this.t = list;
        this.u = qb;
    }

    public final C4227ac a(String str, List<? extends NetworkSettings> list, Qb qb) {
        return new C4227ac(str, list, qb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4227ac)) {
            return false;
        }
        C4227ac c4227ac = (C4227ac) obj;
        return epx.f(this.s, c4227ac.s) && epx.f(this.t, c4227ac.t) && epx.f(this.u, c4227ac.u);
    }

    public int hashCode() {
        String str = this.s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.t;
        return this.u.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
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

    public final Qb u() {
        return this.u;
    }

    public final Qb v() {
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4227ac a(C4227ac c4227ac, String str, List list, Qb qb, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4227ac.s;
        }
        if ((i & 2) != 0) {
            list = c4227ac.t;
        }
        if ((i & 4) != 0) {
            qb = c4227ac.u;
        }
        return c4227ac.a(str, list, qb);
    }
}

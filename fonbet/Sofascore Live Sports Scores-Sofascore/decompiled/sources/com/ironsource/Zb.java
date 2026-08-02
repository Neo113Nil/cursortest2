package com.ironsource;

import com.ironsource.M0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zb extends W {

    @Nullable
    private final String s;

    @Nullable
    private final List<NetworkSettings> t;

    @NotNull
    private final Pb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Zb(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Pb pb) {
        super(IronSource.a.NATIVE_AD, str, list, pb.d(), pb.b(), (int) (pb.c() / 1000), pb.a(), pb.f(), -1, new M0(M0.a.MANUAL, pb.d().j(), pb.d().b(), -1L), new I0(-1L), pb.h(), pb.i(), pb.k(), pb.j(), false, 32768, null);
        pb.getClass();
        this.s = str;
        this.t = list;
        this.u = pb;
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

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zb)) {
            return false;
        }
        Zb zb = (Zb) obj;
        return Intrinsics.c(this.s, zb.s) && Intrinsics.c(this.t, zb.t) && Intrinsics.c(this.u, zb.u);
    }

    public int hashCode() {
        String str = this.s;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkSettings> list = this.t;
        return this.u.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // com.ironsource.W
    @Nullable
    public List<NetworkSettings> j() {
        return this.t;
    }

    @Override // com.ironsource.W
    @Nullable
    public String o() {
        return this.s;
    }

    @Nullable
    public final String s() {
        return this.s;
    }

    @Nullable
    public final List<NetworkSettings> t() {
        return this.t;
    }

    @NotNull
    public String toString() {
        return "NativeAdManagerData(userId=" + this.s + ", providerList=" + this.t + ", configs=" + this.u + ")";
    }

    @NotNull
    public final Pb u() {
        return this.u;
    }

    @NotNull
    public final Pb v() {
        return this.u;
    }

    @NotNull
    public final Zb a(@Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull Pb pb) {
        pb.getClass();
        return new Zb(str, list, pb);
    }
}

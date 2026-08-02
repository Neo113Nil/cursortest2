package defpackage;

import android.content.Context;
import com.sofascore.model.mvvm.model.BaseballInningInfo;
import com.sofascore.results.R;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class b91 implements zl9 {

    @NotNull
    public static final a91 Companion = new a91();
    public final int a;
    public final boolean b;
    public final BaseballInningInfo c;
    public final int d;
    public final int e;
    public final int f;

    public /* synthetic */ b91(int i, int i2, boolean z, BaseballInningInfo baseballInningInfo, int i3, int i4, int i5) {
        if (31 != (i & 31)) {
            oea.z(i, 31, z81.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = z;
        this.c = baseballInningInfo;
        this.d = i3;
        this.e = i4;
        if ((i & 32) == 0) {
            this.f = baseballInningInfo.getMockId();
        } else {
            this.f = i5;
        }
    }

    @Override // defpackage.zl9
    public final String b(Context context) {
        context.getClass();
        String i = wv8.i(c91.a(this.c, context), " • ", fc6.g(this.d, this.e, " - "));
        return hkg.c0(context) ? n9e.G(i, " • ") : i;
    }

    @Override // defpackage.zl9
    public final String c(Context context) {
        context.getClass();
        BaseballInningInfo baseballInningInfo = this.c;
        Integer valueOf = Integer.valueOf(yid.m(baseballInningInfo.getRuns()));
        String string = context.getString(R.string.baseball_runs_number_short);
        string.getClass();
        String e = yid.e(2, string, valueOf);
        Integer valueOf2 = Integer.valueOf(yid.m(baseballInningInfo.getHits()));
        String string2 = context.getString(R.string.baseball_hits_number_short);
        string2.getClass();
        String e2 = yid.e(2, string2, valueOf2);
        Integer valueOf3 = Integer.valueOf(yid.m(baseballInningInfo.getErrors()));
        String string3 = context.getString(R.string.baseball_errors_number_short);
        string3.getClass();
        return CollectionsKt.f0(b.j(e, e2, yid.e(2, string3, valueOf3)), ", ", null, null, null, 62);
    }

    @Override // defpackage.zl9
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.zl9
    public final int e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b91)) {
            return false;
        }
        b91 b91Var = (b91) obj;
        return this.a == b91Var.a && this.b == b91Var.b && Intrinsics.c(this.c, b91Var.c) && this.d == b91Var.d && this.e == b91Var.e;
    }

    @Override // defpackage.zl9
    public final int getId() {
        return this.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wv8.a(this.d, (this.c.hashCode() + dmi.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseballHalfInningGroupItem(teamId=");
        sb.append(this.a);
        sb.append(", isLive=");
        sb.append(this.b);
        sb.append(", inningInfo=");
        sb.append(this.c);
        sb.append(", homeScore=");
        sb.append(this.d);
        sb.append(", awayScore=");
        return fc6.h(this.e, ")", sb);
    }

    public b91(int i, boolean z, BaseballInningInfo baseballInningInfo, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = baseballInningInfo;
        this.d = i2;
        this.e = i3;
        this.f = baseballInningInfo.getMockId();
    }
}

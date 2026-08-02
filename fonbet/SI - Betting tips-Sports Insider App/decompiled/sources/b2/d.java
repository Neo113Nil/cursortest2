package b2;

import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.g0;
import androidx.lifecycle.g1;
import androidx.lifecycle.x;
import gf.t;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import y1.b0;
import y1.s;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final y1.l f2956a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f2957b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2958c;

    /* renamed from: d, reason: collision with root package name */
    public x f2959d;

    /* renamed from: e, reason: collision with root package name */
    public final s f2960e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2961f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2962g;

    /* renamed from: h, reason: collision with root package name */
    public final q2.e f2963h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2964i;
    public final g0 j;

    /* renamed from: k, reason: collision with root package name */
    public x f2965k;

    /* renamed from: l, reason: collision with root package name */
    public final g1 f2966l;

    /* renamed from: m, reason: collision with root package name */
    public final t f2967m;

    public d(y1.l owner) {
        Intrinsics.checkNotNullParameter(owner, "entry");
        this.f2956a = owner;
        this.f2957b = owner.f25583b;
        this.f2958c = owner.f25584c;
        this.f2959d = owner.f25585d;
        this.f2960e = owner.f25586e;
        this.f2961f = owner.f25587f;
        this.f2962g = owner.f25588g;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f2963h = new q2.e(new r2.a(owner, new me.a(10, owner)));
        t b10 = gf.k.b(new b(0));
        this.j = new g0(owner);
        this.f2965k = x.f2254b;
        this.f2966l = (g1) b10.getValue();
        this.f2967m = gf.k.b(new b(1));
    }

    public final Bundle a() {
        Bundle from = this.f2958c;
        if (from == null) {
            return null;
        }
        n0.c().getClass();
        Bundle source = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(from, "from");
        source.putAll(from);
        return source;
    }

    public final void b() {
        if (!this.f2964i) {
            q2.e eVar = this.f2963h;
            eVar.a();
            this.f2964i = true;
            if (this.f2960e != null) {
                d1.e(this.f2956a);
            }
            eVar.b(this.f2962g);
        }
        int ordinal = this.f2959d.ordinal();
        int ordinal2 = this.f2965k.ordinal();
        g0 g0Var = this.j;
        if (ordinal < ordinal2) {
            g0Var.g(this.f2959d);
        } else {
            g0Var.g(this.f2965k);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Reflection.getOrCreateKotlinClass(this.f2956a.getClass()).getSimpleName());
        sb2.append("(" + this.f2961f + ')');
        sb2.append(" destination=");
        sb2.append(this.f2957b);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}

package o1;

import androidx.collection.M;
import androidx.collection.Y;
import kotlin.jvm.internal.Intrinsics;
import l1.C7833m0;
import org.jetbrains.annotations.NotNull;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8627a {

    /* renamed from: a, reason: collision with root package name */
    private d f77475a;

    /* renamed from: b, reason: collision with root package name */
    private d f77476b;

    /* renamed from: c, reason: collision with root package name */
    private M<d> f77477c;

    /* renamed from: d, reason: collision with root package name */
    private M<d> f77478d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f77479e;

    public final boolean i(@NotNull d dVar) {
        if (!this.f77479e) {
            C7833m0.a("Only add dependencies during a tracking");
            throw null;
        }
        M<d> m11 = this.f77477c;
        if (m11 != null) {
            m11.d(dVar);
        } else if (this.f77475a != null) {
            M<d> a11 = Y.a();
            d dVar2 = this.f77475a;
            Intrinsics.f(dVar2);
            a11.d(dVar2);
            a11.d(dVar);
            this.f77477c = a11;
            this.f77475a = null;
        } else {
            this.f77475a = dVar;
        }
        if (this.f77478d != null) {
            return !r0.l(dVar);
        }
        if (this.f77476b != dVar) {
            return true;
        }
        this.f77476b = null;
        return false;
    }
}

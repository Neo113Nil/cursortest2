package r50;

import Kk.C3532b;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: r50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9174a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f82896a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f82897b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f82898c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f82899d;

    public C9174a(boolean z11, boolean z12, Rect rect, Rect rect2) {
        this.f82896a = z11;
        this.f82897b = z12;
        this.f82898c = rect;
        this.f82899d = rect2;
    }

    public final boolean a() {
        return this.f82897b;
    }

    public final boolean b() {
        return this.f82896a;
    }

    public final Rect c() {
        return this.f82899d;
    }

    public final Rect d() {
        return this.f82898c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9174a)) {
            return false;
        }
        C9174a c9174a = (C9174a) obj;
        return this.f82896a == c9174a.f82896a && this.f82897b == c9174a.f82897b && Intrinsics.d(this.f82898c, c9174a.f82898c) && Intrinsics.d(this.f82899d, c9174a.f82899d);
    }

    public final int hashCode() {
        int a11 = C3532b.a(Boolean.hashCode(this.f82896a) * 31, 31, this.f82897b);
        Rect rect = this.f82898c;
        int hashCode = (a11 + (rect == null ? 0 : rect.hashCode())) * 31;
        Rect rect2 = this.f82899d;
        return hashCode + (rect2 != null ? rect2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SheetOptions(expanded=" + this.f82896a + ", dashHidden=" + this.f82897b + ", mainPaddings=" + this.f82898c + ", footerPaddings=" + this.f82899d + ")";
    }
}

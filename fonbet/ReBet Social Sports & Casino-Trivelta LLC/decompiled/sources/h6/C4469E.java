package h6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h6.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4469E {

    /* renamed from: a, reason: collision with root package name */
    public int f47727a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC4468D f47728b = EnumC4468D.SUCCESS;

    public final int a() {
        return this.f47727a;
    }

    public final EnumC4468D b() {
        return this.f47728b;
    }

    public final void c(int i10) {
        this.f47727a = i10;
    }

    public final void d(EnumC4468D enumC4468D) {
        Intrinsics.checkNotNullParameter(enumC4468D, "<set-?>");
        this.f47728b = enumC4468D;
    }
}

package v5;

import Kk.C3532b;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.EnumC10431c;
import xe.C10720e0;
import xe.I;
import xe.L0;
import z5.C10984b;
import z5.InterfaceC10985c;

/* renamed from: v5.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10229c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L0 f102135a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f102136b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f102137c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final I f102138d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C10984b.a f102139e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final EnumC10431c f102140f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f102141g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f102142h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102143i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102144j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102145k;

    public C10229c() {
        this(0);
    }

    public final boolean a() {
        return this.f102142h;
    }

    @NotNull
    public final Bitmap.Config b() {
        return this.f102141g;
    }

    @NotNull
    public final I c() {
        return this.f102137c;
    }

    @NotNull
    public final EnumC10228b d() {
        return this.f102144j;
    }

    @NotNull
    public final I e() {
        return this.f102136b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10229c)) {
            return false;
        }
        C10229c c10229c = (C10229c) obj;
        return Intrinsics.d(this.f102135a, c10229c.f102135a) && Intrinsics.d(this.f102136b, c10229c.f102136b) && Intrinsics.d(this.f102137c, c10229c.f102137c) && Intrinsics.d(this.f102138d, c10229c.f102138d) && Intrinsics.d(this.f102139e, c10229c.f102139e) && this.f102140f == c10229c.f102140f && this.f102141g == c10229c.f102141g && this.f102142h == c10229c.f102142h && this.f102143i == c10229c.f102143i && this.f102144j == c10229c.f102144j && this.f102145k == c10229c.f102145k;
    }

    @NotNull
    public final I f() {
        return this.f102135a;
    }

    @NotNull
    public final EnumC10228b g() {
        return this.f102143i;
    }

    @NotNull
    public final EnumC10228b h() {
        return this.f102145k;
    }

    public final int hashCode() {
        int hashCode = (this.f102138d.hashCode() + ((this.f102137c.hashCode() + ((this.f102136b.hashCode() + (this.f102135a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f102139e.getClass();
        return this.f102145k.hashCode() + ((this.f102144j.hashCode() + ((this.f102143i.hashCode() + C3532b.a(C3532b.a((this.f102141g.hashCode() + ((this.f102140f.hashCode() + ((C10984b.a.class.hashCode() + hashCode) * 31)) * 31)) * 31, 31, this.f102142h), 923521, false)) * 31)) * 31);
    }

    @NotNull
    public final EnumC10431c i() {
        return this.f102140f;
    }

    @NotNull
    public final I j() {
        return this.f102138d;
    }

    @NotNull
    public final InterfaceC10985c k() {
        return this.f102139e;
    }

    public C10229c(int i11) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 x11 = De.s.f6650a.x();
        He.b bVar = He.b.f10879b;
        C10984b.a aVar = InterfaceC10985c.f107258a;
        EnumC10431c enumC10431c = EnumC10431c.AUTOMATIC;
        Bitmap.Config b11 = A5.k.b();
        EnumC10228b enumC10228b = EnumC10228b.ENABLED;
        this.f102135a = x11;
        this.f102136b = bVar;
        this.f102137c = bVar;
        this.f102138d = bVar;
        this.f102139e = aVar;
        this.f102140f = enumC10431c;
        this.f102141g = b11;
        this.f102142h = true;
        this.f102143i = enumC10228b;
        this.f102144j = enumC10228b;
        this.f102145k = enumC10228b;
    }
}

package v5;

import Kk.C3532b;
import We.z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.C10435g;
import w5.EnumC10434f;

/* renamed from: v5.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10239m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f102248a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Bitmap.Config f102249b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorSpace f102250c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C10435g f102251d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC10434f f102252e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f102253f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f102254g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f102255h;

    /* renamed from: i, reason: collision with root package name */
    private final String f102256i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final z f102257j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C10244r f102258k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C10240n f102259l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102260m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102261n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final EnumC10228b f102262o;

    public C10239m(@NotNull Context context, @NotNull Bitmap.Config config, ColorSpace colorSpace, @NotNull C10435g c10435g, @NotNull EnumC10434f enumC10434f, boolean z11, boolean z12, boolean z13, String str, @NotNull z zVar, @NotNull C10244r c10244r, @NotNull C10240n c10240n, @NotNull EnumC10228b enumC10228b, @NotNull EnumC10228b enumC10228b2, @NotNull EnumC10228b enumC10228b3) {
        this.f102248a = context;
        this.f102249b = config;
        this.f102250c = colorSpace;
        this.f102251d = c10435g;
        this.f102252e = enumC10434f;
        this.f102253f = z11;
        this.f102254g = z12;
        this.f102255h = z13;
        this.f102256i = str;
        this.f102257j = zVar;
        this.f102258k = c10244r;
        this.f102259l = c10240n;
        this.f102260m = enumC10228b;
        this.f102261n = enumC10228b2;
        this.f102262o = enumC10228b3;
    }

    public static C10239m a(C10239m c10239m) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = c10239m.f102248a;
        ColorSpace colorSpace = c10239m.f102250c;
        C10435g c10435g = c10239m.f102251d;
        EnumC10434f enumC10434f = c10239m.f102252e;
        boolean z11 = c10239m.f102253f;
        boolean z12 = c10239m.f102254g;
        boolean z13 = c10239m.f102255h;
        String str = c10239m.f102256i;
        z zVar = c10239m.f102257j;
        C10244r c10244r = c10239m.f102258k;
        C10240n c10240n = c10239m.f102259l;
        EnumC10228b enumC10228b = c10239m.f102260m;
        EnumC10228b enumC10228b2 = c10239m.f102261n;
        EnumC10228b enumC10228b3 = c10239m.f102262o;
        c10239m.getClass();
        return new C10239m(context, config, colorSpace, c10435g, enumC10434f, z11, z12, z13, str, zVar, c10244r, c10240n, enumC10228b, enumC10228b2, enumC10228b3);
    }

    public final boolean b() {
        return this.f102253f;
    }

    public final boolean c() {
        return this.f102254g;
    }

    public final ColorSpace d() {
        return this.f102250c;
    }

    @NotNull
    public final Bitmap.Config e() {
        return this.f102249b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10239m)) {
            return false;
        }
        C10239m c10239m = (C10239m) obj;
        return Intrinsics.d(this.f102248a, c10239m.f102248a) && this.f102249b == c10239m.f102249b && Intrinsics.d(this.f102250c, c10239m.f102250c) && Intrinsics.d(this.f102251d, c10239m.f102251d) && this.f102252e == c10239m.f102252e && this.f102253f == c10239m.f102253f && this.f102254g == c10239m.f102254g && this.f102255h == c10239m.f102255h && Intrinsics.d(this.f102256i, c10239m.f102256i) && Intrinsics.d(this.f102257j, c10239m.f102257j) && Intrinsics.d(this.f102258k, c10239m.f102258k) && Intrinsics.d(this.f102259l, c10239m.f102259l) && this.f102260m == c10239m.f102260m && this.f102261n == c10239m.f102261n && this.f102262o == c10239m.f102262o;
    }

    @NotNull
    public final Context f() {
        return this.f102248a;
    }

    public final String g() {
        return this.f102256i;
    }

    @NotNull
    public final EnumC10228b h() {
        return this.f102261n;
    }

    public final int hashCode() {
        int hashCode = (this.f102249b.hashCode() + (this.f102248a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f102250c;
        int a11 = C3532b.a(C3532b.a(C3532b.a((this.f102252e.hashCode() + ((this.f102251d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f102253f), 31, this.f102254g), 31, this.f102255h);
        String str = this.f102256i;
        return this.f102262o.hashCode() + ((this.f102261n.hashCode() + ((this.f102260m.hashCode() + ((this.f102259l.hashCode() + ((this.f102258k.hashCode() + ((this.f102257j.hashCode() + ((a11 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final z i() {
        return this.f102257j;
    }

    @NotNull
    public final EnumC10228b j() {
        return this.f102262o;
    }

    @NotNull
    public final C10240n k() {
        return this.f102259l;
    }

    public final boolean l() {
        return this.f102255h;
    }

    @NotNull
    public final EnumC10434f m() {
        return this.f102252e;
    }

    @NotNull
    public final C10435g n() {
        return this.f102251d;
    }

    @NotNull
    public final C10244r o() {
        return this.f102258k;
    }
}

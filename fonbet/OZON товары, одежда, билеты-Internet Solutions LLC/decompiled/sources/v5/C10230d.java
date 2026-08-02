package v5;

import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import w5.EnumC10431c;
import w5.EnumC10434f;
import w5.InterfaceC10436h;
import xe.I;
import z5.InterfaceC10985c;

/* renamed from: v5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10230d {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5434v f102146a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10436h f102147b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC10434f f102148c;

    /* renamed from: d, reason: collision with root package name */
    private final I f102149d;

    /* renamed from: e, reason: collision with root package name */
    private final I f102150e;

    /* renamed from: f, reason: collision with root package name */
    private final I f102151f;

    /* renamed from: g, reason: collision with root package name */
    private final I f102152g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC10985c f102153h;

    /* renamed from: i, reason: collision with root package name */
    private final EnumC10431c f102154i;

    /* renamed from: j, reason: collision with root package name */
    private final Bitmap.Config f102155j;

    /* renamed from: k, reason: collision with root package name */
    private final Boolean f102156k;

    /* renamed from: l, reason: collision with root package name */
    private final Boolean f102157l;

    /* renamed from: m, reason: collision with root package name */
    private final EnumC10228b f102158m;

    /* renamed from: n, reason: collision with root package name */
    private final EnumC10228b f102159n;

    /* renamed from: o, reason: collision with root package name */
    private final EnumC10228b f102160o;

    public C10230d(AbstractC5434v abstractC5434v, InterfaceC10436h interfaceC10436h, EnumC10434f enumC10434f, I i11, I i12, I i13, I i14, InterfaceC10985c interfaceC10985c, EnumC10431c enumC10431c, Bitmap.Config config, Boolean bool, Boolean bool2, EnumC10228b enumC10228b, EnumC10228b enumC10228b2, EnumC10228b enumC10228b3) {
        this.f102146a = abstractC5434v;
        this.f102147b = interfaceC10436h;
        this.f102148c = enumC10434f;
        this.f102149d = i11;
        this.f102150e = i12;
        this.f102151f = i13;
        this.f102152g = i14;
        this.f102153h = interfaceC10985c;
        this.f102154i = enumC10431c;
        this.f102155j = config;
        this.f102156k = bool;
        this.f102157l = bool2;
        this.f102158m = enumC10228b;
        this.f102159n = enumC10228b2;
        this.f102160o = enumC10228b3;
    }

    public final Boolean a() {
        return this.f102156k;
    }

    public final Boolean b() {
        return this.f102157l;
    }

    public final Bitmap.Config c() {
        return this.f102155j;
    }

    public final I d() {
        return this.f102151f;
    }

    public final EnumC10228b e() {
        return this.f102159n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10230d)) {
            return false;
        }
        C10230d c10230d = (C10230d) obj;
        return Intrinsics.d(this.f102146a, c10230d.f102146a) && Intrinsics.d(this.f102147b, c10230d.f102147b) && this.f102148c == c10230d.f102148c && Intrinsics.d(this.f102149d, c10230d.f102149d) && Intrinsics.d(this.f102150e, c10230d.f102150e) && Intrinsics.d(this.f102151f, c10230d.f102151f) && Intrinsics.d(this.f102152g, c10230d.f102152g) && Intrinsics.d(this.f102153h, c10230d.f102153h) && this.f102154i == c10230d.f102154i && this.f102155j == c10230d.f102155j && Intrinsics.d(this.f102156k, c10230d.f102156k) && Intrinsics.d(this.f102157l, c10230d.f102157l) && this.f102158m == c10230d.f102158m && this.f102159n == c10230d.f102159n && this.f102160o == c10230d.f102160o;
    }

    public final I f() {
        return this.f102150e;
    }

    public final I g() {
        return this.f102149d;
    }

    public final AbstractC5434v h() {
        return this.f102146a;
    }

    public final int hashCode() {
        AbstractC5434v abstractC5434v = this.f102146a;
        int hashCode = (abstractC5434v != null ? abstractC5434v.hashCode() : 0) * 31;
        InterfaceC10436h interfaceC10436h = this.f102147b;
        int hashCode2 = (hashCode + (interfaceC10436h != null ? interfaceC10436h.hashCode() : 0)) * 31;
        EnumC10434f enumC10434f = this.f102148c;
        int hashCode3 = (hashCode2 + (enumC10434f != null ? enumC10434f.hashCode() : 0)) * 31;
        I i11 = this.f102149d;
        int hashCode4 = (hashCode3 + (i11 != null ? i11.hashCode() : 0)) * 31;
        I i12 = this.f102150e;
        int hashCode5 = (hashCode4 + (i12 != null ? i12.hashCode() : 0)) * 31;
        I i13 = this.f102151f;
        int hashCode6 = (hashCode5 + (i13 != null ? i13.hashCode() : 0)) * 31;
        I i14 = this.f102152g;
        int hashCode7 = (hashCode6 + (i14 != null ? i14.hashCode() : 0)) * 31;
        InterfaceC10985c interfaceC10985c = this.f102153h;
        int hashCode8 = (hashCode7 + (interfaceC10985c != null ? interfaceC10985c.hashCode() : 0)) * 31;
        EnumC10431c enumC10431c = this.f102154i;
        int hashCode9 = (hashCode8 + (enumC10431c != null ? enumC10431c.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f102155j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f102156k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f102157l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        EnumC10228b enumC10228b = this.f102158m;
        int hashCode13 = (hashCode12 + (enumC10228b != null ? enumC10228b.hashCode() : 0)) * 31;
        EnumC10228b enumC10228b2 = this.f102159n;
        int hashCode14 = (hashCode13 + (enumC10228b2 != null ? enumC10228b2.hashCode() : 0)) * 31;
        EnumC10228b enumC10228b3 = this.f102160o;
        return hashCode14 + (enumC10228b3 != null ? enumC10228b3.hashCode() : 0);
    }

    public final EnumC10228b i() {
        return this.f102158m;
    }

    public final EnumC10228b j() {
        return this.f102160o;
    }

    public final EnumC10431c k() {
        return this.f102154i;
    }

    public final EnumC10434f l() {
        return this.f102148c;
    }

    public final InterfaceC10436h m() {
        return this.f102147b;
    }

    public final I n() {
        return this.f102152g;
    }

    public final InterfaceC10985c o() {
        return this.f102153h;
    }
}

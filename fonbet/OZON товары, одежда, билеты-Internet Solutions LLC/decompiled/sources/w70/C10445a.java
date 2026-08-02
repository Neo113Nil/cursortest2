package w70;

import B0.C2454a;
import G.g;
import Ve.Om;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.onboarding.ui.DisclosureItem;

/* renamed from: w70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10445a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f103610a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f103611b;

    /* renamed from: c, reason: collision with root package name */
    private final int f103612c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f103613d;

    /* renamed from: e, reason: collision with root package name */
    private final int f103614e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList f103615f;

    public C10445a(Integer num, @NotNull String disclosureTitle, int i11, @NotNull String disclosureSubTitle, int i12, @NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(disclosureTitle, "disclosureTitle");
        Intrinsics.checkNotNullParameter(disclosureSubTitle, "disclosureSubTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f103610a = num;
        this.f103611b = disclosureTitle;
        this.f103612c = i11;
        this.f103613d = disclosureSubTitle;
        this.f103614e = i12;
        this.f103615f = items;
    }

    @NotNull
    public final String a() {
        return this.f103613d;
    }

    @NotNull
    public final String b() {
        return this.f103611b;
    }

    public final Integer c() {
        return this.f103610a;
    }

    @NotNull
    public final List<DisclosureItem> d() {
        return this.f103615f;
    }

    public final int e() {
        return this.f103614e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10445a)) {
            return false;
        }
        C10445a c10445a = (C10445a) obj;
        return Intrinsics.d(this.f103610a, c10445a.f103610a) && Intrinsics.d(this.f103611b, c10445a.f103611b) && this.f103612c == c10445a.f103612c && Intrinsics.d(this.f103613d, c10445a.f103613d) && this.f103614e == c10445a.f103614e && this.f103615f.equals(c10445a.f103615f);
    }

    public final int f() {
        return this.f103612c;
    }

    public final int hashCode() {
        Integer num = this.f103610a;
        return this.f103615f.hashCode() + C2454a.a(this.f103614e, g.a(C2454a.a(this.f103612c, g.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f103611b), 31), 31, this.f103613d), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclosureContentScreenState(iconSrc=");
        sb2.append(this.f103610a);
        sb2.append(", disclosureTitle=");
        sb2.append(this.f103611b);
        sb2.append(", titleGravity=");
        sb2.append(this.f103612c);
        sb2.append(", disclosureSubTitle=");
        sb2.append(this.f103613d);
        sb2.append(", subtitleGravity=");
        sb2.append(this.f103614e);
        sb2.append(", items=");
        return Om.a(")", sb2, this.f103615f);
    }
}

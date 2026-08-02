package x70;

import B0.C2454a;
import B90.C2618u;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: x70.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10674a {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final C10674a f105085i = new C10674a(C7714v.b0(new C2275a(R.drawable.ic_m_protection_success_filled, R.string.fintech_disclosure_subtitle_1), new C2275a(R.drawable.ic_m_settings_filled, R.string.fintech_disclosure_subtitle_2)));

    /* renamed from: a, reason: collision with root package name */
    private final Integer f105086a;

    /* renamed from: b, reason: collision with root package name */
    private final int f105087b;

    /* renamed from: c, reason: collision with root package name */
    private final int f105088c;

    /* renamed from: d, reason: collision with root package name */
    private final int f105089d;

    /* renamed from: e, reason: collision with root package name */
    private final int f105090e;

    /* renamed from: f, reason: collision with root package name */
    private final int f105091f;

    /* renamed from: g, reason: collision with root package name */
    private final int f105092g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<C2275a> f105093h;

    /* renamed from: x70.a$a, reason: collision with other inner class name */
    public static final class C2275a {

        /* renamed from: a, reason: collision with root package name */
        private final int f105094a;

        /* renamed from: b, reason: collision with root package name */
        private final int f105095b;

        public C2275a(int i11, int i12) {
            this.f105094a = i11;
            this.f105095b = i12;
        }

        public final int a() {
            return this.f105094a;
        }

        public final int b() {
            return this.f105095b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2275a)) {
                return false;
            }
            C2275a c2275a = (C2275a) obj;
            return this.f105094a == c2275a.f105094a && this.f105095b == c2275a.f105095b;
        }

        public final int hashCode() {
            return Integer.hashCode(R.color.oz_semantic_ctrl_neutral_pale_100) + C2454a.a(this.f105095b, Integer.hashCode(this.f105094a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DisclosureItems(iconSrc=");
            sb2.append(this.f105094a);
            sb2.append(", text=");
            return K00.b.e(this.f105095b, ", iconBgColor=2131101743)", sb2);
        }
    }

    public C10674a() {
        throw null;
    }

    public C10674a(List items) {
        Integer valueOf = Integer.valueOf(R.drawable.privacy_placeholder);
        Intrinsics.checkNotNullParameter(items, "items");
        this.f105086a = valueOf;
        this.f105087b = R.string.fintech_disclosure_title;
        this.f105088c = 8388611;
        this.f105089d = R.string.fintech_disclosure_subtitle;
        this.f105090e = 8388611;
        this.f105091f = R.string.fintech_disclosure_request_enable;
        this.f105092g = R.string.fintech_disclosure_request_disable;
        this.f105093h = items;
    }

    public final int b() {
        return this.f105092g;
    }

    public final int c() {
        return this.f105087b;
    }

    public final int d() {
        return this.f105089d;
    }

    public final int e() {
        return this.f105091f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10674a)) {
            return false;
        }
        C10674a c10674a = (C10674a) obj;
        return Intrinsics.d(this.f105086a, c10674a.f105086a) && this.f105087b == c10674a.f105087b && this.f105088c == c10674a.f105088c && this.f105089d == c10674a.f105089d && this.f105090e == c10674a.f105090e && this.f105091f == c10674a.f105091f && this.f105092g == c10674a.f105092g && Intrinsics.d(this.f105093h, c10674a.f105093h);
    }

    public final Integer f() {
        return this.f105086a;
    }

    @NotNull
    public final List<C2275a> g() {
        return this.f105093h;
    }

    public final int h() {
        return this.f105090e;
    }

    public final int hashCode() {
        Integer num = this.f105086a;
        return this.f105093h.hashCode() + C2454a.a(this.f105092g, C2454a.a(this.f105091f, C2454a.a(this.f105090e, C2454a.a(this.f105089d, C2454a.a(this.f105088c, C2454a.a(this.f105087b, (num == null ? 0 : num.hashCode()) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final int i() {
        return this.f105088c;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclosureConfig(icon=");
        sb2.append(this.f105086a);
        sb2.append(", disclocureTitle=");
        sb2.append(this.f105087b);
        sb2.append(", titleGravity=");
        sb2.append(this.f105088c);
        sb2.append(", disclosureSubTitle=");
        sb2.append(this.f105089d);
        sb2.append(", subtitleGravity=");
        sb2.append(this.f105090e);
        sb2.append(", enableButtonText=");
        sb2.append(this.f105091f);
        sb2.append(", disableButtonText=");
        sb2.append(this.f105092g);
        sb2.append(", items=");
        return C2618u.h(sb2, this.f105093h, ")");
    }
}

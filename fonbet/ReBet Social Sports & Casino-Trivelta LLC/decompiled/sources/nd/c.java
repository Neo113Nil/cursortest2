package nd;

import android.graphics.drawable.Drawable;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import rd.C6218a;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f57270a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f57271b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f57272c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f57273d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f57274e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f57275f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f57276g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f57277h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f57278i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final a f57279a = new a("LEFT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f57280b = new a("RIGHT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f57281c;

        static {
            a[] a10 = a();
            $VALUES = a10;
            f57281c = EnumEntriesKt.enumEntries(a10);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{f57279a, f57280b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final b f57282a = new b("TOP", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f57283b = new b("BOTTOM", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f57284c;

        static {
            b[] a10 = a();
            $VALUES = a10;
            f57284c = EnumEntriesKt.enumEntries(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f57282a, f57283b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public c(int i10) {
        this.f57270a = i10;
    }

    public static /* synthetic */ void m(c cVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            drawable = cVar.f57272c;
        }
        if ((i10 & 2) != 0) {
            drawable2 = cVar.f57273d;
        }
        if ((i10 & 4) != 0) {
            drawable3 = cVar.f57274e;
        }
        if ((i10 & 8) != 0) {
            drawable4 = cVar.f57275f;
        }
        cVar.l(drawable, drawable2, drawable3, drawable4);
    }

    public final Drawable a() {
        return this.f57273d;
    }

    public final Drawable b() {
        return this.f57272c;
    }

    public final Drawable c() {
        return this.f57275f;
    }

    public final Drawable d() {
        return this.f57274e;
    }

    public final int e() {
        return this.f57270a;
    }

    public final Integer f() {
        return this.f57276g;
    }

    public final Integer g() {
        return this.f57277h;
    }

    public final Boolean h() {
        return this.f57278i;
    }

    public final void i(a position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f57278i = Boolean.valueOf(position == a.f57280b);
    }

    public final void j(b position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f57277h = position == b.f57282a ? Integer.valueOf(C6218a.p()) : 0;
    }

    public final void k(Drawable drawable) {
        this.f57272c = drawable;
        this.f57271b = drawable;
    }

    public final void l(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f57272c = drawable;
        this.f57273d = drawable2;
        this.f57274e = drawable3;
        this.f57275f = drawable4;
    }

    public final void n(Integer num) {
        this.f57276g = num;
    }

    public final void o(int i10) {
        this.f57277h = Integer.valueOf(C6218a.s() - i10);
    }

    public final void p(int i10) {
        this.f57277h = Integer.valueOf(i10);
    }
}

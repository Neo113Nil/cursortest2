package uj;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f100822a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f100823b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f100824c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f100825d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f100826e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f100827f;

    public interface a {

        /* renamed from: uj.f$a$a, reason: collision with other inner class name */
        public static final class C2211a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f100828a;

            public C2211a(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f100828a = name;
            }

            @Override // uj.f.a
            public final int getBackgroundColor() {
                return R.color.ozon_logger_android_bgSecondaryTransparent;
            }

            @Override // uj.f.a
            @NotNull
            public final String getName() {
                return this.f100828a;
            }

            @Override // uj.f.a
            public final int getTextColor() {
                return R.color.ozon_logger_android_textSecondaryTransparent;
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f100829a;

            public b(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f100829a = name;
            }

            @Override // uj.f.a
            public final int getBackgroundColor() {
                return R.color.ozon_logger_android_bgNegativeSecondaryTransparent;
            }

            @Override // uj.f.a
            @NotNull
            public final String getName() {
                return this.f100829a;
            }

            @Override // uj.f.a
            public final int getTextColor() {
                return R.color.ozon_logger_android_textNegative;
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f100830a;

            public c(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f100830a = name;
            }

            @Override // uj.f.a
            public final int getBackgroundColor() {
                return R.color.ozon_logger_android_bgPositiveSecondaryTransparent;
            }

            @Override // uj.f.a
            @NotNull
            public final String getName() {
                return this.f100830a;
            }

            @Override // uj.f.a
            public final int getTextColor() {
                return R.color.ozon_logger_android_textPositive;
            }
        }

        public static final class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final String f100831a;

            public d(@NotNull String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.f100831a = name;
            }

            @Override // uj.f.a
            public final int getBackgroundColor() {
                return R.color.ozon_logger_android_bgWarningSecondaryTransparent;
            }

            @Override // uj.f.a
            @NotNull
            public final String getName() {
                return this.f100831a;
            }

            @Override // uj.f.a
            public final int getTextColor() {
                return R.color.ozon_logger_android_textWarning;
            }
        }

        int getBackgroundColor();

        @NotNull
        String getName();

        int getTextColor();
    }

    public f(@NotNull String id2, @NotNull String title, @NotNull String fields, @NotNull String date, @NotNull a levelTag, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(levelTag, "levelTag");
        this.f100822a = id2;
        this.f100823b = title;
        this.f100824c = fields;
        this.f100825d = date;
        this.f100826e = levelTag;
        this.f100827f = z11;
    }

    @NotNull
    public final String a() {
        return this.f100825d;
    }

    @NotNull
    public final String b() {
        return this.f100824c;
    }

    @NotNull
    public final String c() {
        return this.f100822a;
    }

    @NotNull
    public final a d() {
        return this.f100826e;
    }

    @NotNull
    public final String e() {
        return this.f100823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f100822a, fVar.f100822a) && Intrinsics.d(this.f100823b, fVar.f100823b) && Intrinsics.d(this.f100824c, fVar.f100824c) && Intrinsics.d(this.f100825d, fVar.f100825d) && Intrinsics.d(this.f100826e, fVar.f100826e) && this.f100827f == fVar.f100827f;
    }

    public final boolean f() {
        return this.f100827f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100827f) + ((this.f100826e.hashCode() + g.a(g.a(g.a(this.f100822a.hashCode() * 31, 31, this.f100823b), 31, this.f100824c), 31, this.f100825d)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LogUiItem(id=");
        sb2.append(this.f100822a);
        sb2.append(", title=");
        sb2.append(this.f100823b);
        sb2.append(", fields=");
        sb2.append(this.f100824c);
        sb2.append(", date=");
        sb2.append(this.f100825d);
        sb2.append(", levelTag=");
        sb2.append(this.f100826e);
        sb2.append(", isLocal=");
        return Pk0.a.a(")", sb2, this.f100827f);
    }
}

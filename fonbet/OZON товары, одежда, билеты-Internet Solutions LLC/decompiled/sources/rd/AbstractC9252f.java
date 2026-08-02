package rd;

import B3.D;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* renamed from: rd.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9252f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sd.c f83303a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f83304b;

    /* renamed from: rd.f$a */
    public static final class a extends AbstractC9252f {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final a f83305c = new a(s.f81865l, "Function");
    }

    /* renamed from: rd.f$b */
    public static final class b extends AbstractC9252f {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final b f83306c = new b(s.f81862i, "KFunction");
    }

    /* renamed from: rd.f$c */
    public static final class c extends AbstractC9252f {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final c f83307c = new c(s.f81862i, "KSuspendFunction");
    }

    /* renamed from: rd.f$d */
    public static final class d extends AbstractC9252f {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public static final d f83308c = new d(s.f81859f, "SuspendFunction");
    }

    public AbstractC9252f(@NotNull Sd.c packageFqName, @NotNull String classNamePrefix) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f83303a = packageFqName;
        this.f83304b = classNamePrefix;
    }

    @NotNull
    public final String a() {
        return this.f83304b;
    }

    @NotNull
    public final Sd.c b() {
        return this.f83303a;
    }

    @NotNull
    public final Sd.f c(int i11) {
        Sd.f f7 = Sd.f.f(this.f83304b + i11);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return f7;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f83303a);
        sb2.append('.');
        return D.c(sb2, this.f83304b, 'N');
    }
}

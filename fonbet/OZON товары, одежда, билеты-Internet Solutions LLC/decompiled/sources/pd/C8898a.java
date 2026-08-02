package pd;

import Cd.E;
import Cd.F;
import Ld.y;
import Sd.b;
import Sd.c;
import U7.d;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yd.C10884b;

/* renamed from: pd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8898a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f80398a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final b f80399b;

    /* renamed from: pd.a$a, reason: collision with other inner class name */
    public static final class C1354a implements y.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f80400a;

        C1354a(I i11) {
            this.f80400a = i11;
        }

        @Override // Ld.y.c
        public final void a() {
        }

        @Override // Ld.y.c
        public final y.a b(b classId, C10884b source) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            Intrinsics.checkNotNullParameter(source, "source");
            if (!classId.equals(E.a())) {
                return null;
            }
            this.f80400a.f71783a = true;
            return null;
        }
    }

    static {
        List<c> b02 = C7714v.b0(F.f4690a, F.f4697h, F.f4698i, F.f4692c, F.f4693d, F.f4695f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (c topLevelFqName : b02) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            c e11 = topLevelFqName.e();
            linkedHashSet.add(new b(e11, d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")));
        }
        f80398a = linkedHashSet;
        c topLevelFqName2 = F.f4696g;
        Intrinsics.checkNotNullExpressionValue(topLevelFqName2, "REPEATABLE_ANNOTATION");
        Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
        c e12 = topLevelFqName2.e();
        f80399b = new b(e12, d.a(e12, "parent(...)", topLevelFqName2, "shortName(...)"));
    }

    @NotNull
    public static b a() {
        return f80399b;
    }

    @NotNull
    public static LinkedHashSet b() {
        return f80398a;
    }

    public static boolean c(@NotNull y klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        I i11 = new I();
        klass.d(new C1354a(i11));
        return i11.f71783a;
    }
}

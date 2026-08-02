package z00;

import P00.k;
import P00.l;
import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z00.f;

/* renamed from: z00.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C10970a {

    /* renamed from: z00.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C2313a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106878a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.PARSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f106878a = iArr;
        }
    }

    public static final f.c a(@NotNull k kVar) {
        f.c.a.b c2318b;
        f.c.a.b.C2315a.EnumC2317b enumC2317b;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        if (!kVar.d().isEmpty()) {
            return null;
        }
        T00.e h11 = kVar.f().h();
        Integer c11 = h11 != null ? h11.c() : null;
        Integer d11 = h11 != null ? h11.d() : null;
        String j11 = h11 != null ? h11.j() : null;
        List<R00.f> c12 = kVar.c();
        ArrayList arrayList = new ArrayList(C7714v.z(c12, 10));
        for (R00.f fVar : c12) {
            if (fVar instanceof R00.d) {
                String d12 = fVar.d();
                R00.d dVar = (R00.d) fVar;
                int i11 = C2313a.f106878a[dVar.h().ordinal()];
                if (i11 == 1) {
                    enumC2317b = f.c.a.b.C2315a.EnumC2317b.PARSE;
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    enumC2317b = f.c.a.b.C2315a.EnumC2317b.MAP;
                }
                c2318b = new f.c.a.b.C2315a(d12, enumC2317b, dVar.i());
            } else {
                if (!(fVar instanceof R00.e)) {
                    throw new IllegalArgumentException("Unknown widgetIncident implementation");
                }
                c2318b = new f.c.a.b.C2318b(fVar.d(), ((R00.e) fVar).h());
            }
            arrayList.add(c2318b);
        }
        f.c.a aVar = new f.c.a(c11, d11, j11, arrayList);
        f.c.C2320c c2320c = new f.c.C2320c(Integer.valueOf(kVar.g().b()), kVar.g().d());
        H00.c.e(b.f106879b);
        return new f.c(kVar.h(), h11 != null ? h11.h() : null, aVar, c2320c, Long.valueOf(System.currentTimeMillis()), 8);
    }
}

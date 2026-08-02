package ge;

import Nd.l;
import Od.C3680a;
import Td.f;
import fe.AbstractC6541u;
import ie.o;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* renamed from: ge.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6721d extends AbstractC6541u implements qd.c {

    /* renamed from: ge.d$a */
    public static final class a {
        @NotNull
        public static C6721d a(@NotNull Sd.c fqName, @NotNull o storageManager, @NotNull InterfaceC9815F module, @NotNull InputStream inputStream) {
            l lVar;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(module, "module");
            Intrinsics.checkNotNullParameter(inputStream, "inputStream");
            Intrinsics.checkNotNullParameter(inputStream, "<this>");
            try {
                C3680a c3680a = C3680a.f20214f;
                C3680a a11 = C3680a.C0407a.a(inputStream);
                if (a11.g()) {
                    f c11 = f.c();
                    Od.b.a(c11);
                    lVar = (l) ((Td.b) l.f19245k).d(inputStream, c11);
                } else {
                    lVar = null;
                }
                Pair pair = new Pair(lVar, a11);
                inputStream.close();
                l lVar2 = (l) pair.a();
                C3680a c3680a2 = (C3680a) pair.b();
                if (lVar2 != null) {
                    return new C6721d(fqName, storageManager, module, lVar2, c3680a2);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C3680a.f20214f + ", actual " + c3680a2 + ". Please update Kotlin");
            } finally {
            }
        }
    }

    @Override // wd.N, wd.r
    @NotNull
    public final String toString() {
        return "builtins package fragment for " + c() + " from " + Zd.e.j(this);
    }
}

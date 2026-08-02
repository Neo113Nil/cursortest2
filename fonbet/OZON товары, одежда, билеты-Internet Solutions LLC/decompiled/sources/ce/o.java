package ce;

import Bd.InterfaceC2627a;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* loaded from: classes.dex */
public interface o {

    public static final class a {
        public static /* synthetic */ Collection a(o oVar, d dVar, int i11) {
            if ((i11 & 1) != 0) {
                dVar = d.f57022l;
            }
            l.f57043a.getClass();
            return oVar.e(dVar, k.f57042a);
        }
    }

    InterfaceC9842h d(@NotNull Sd.f fVar, @NotNull InterfaceC2627a interfaceC2627a);

    @NotNull
    Collection<InterfaceC9845k> e(@NotNull d dVar, @NotNull Function1<? super Sd.f, Boolean> function1);
}

package p40;

import Ae.InterfaceC2395h;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface n {

    public static final class a {
        public static boolean a(@NotNull n nVar, @NotNull Q90.c featureToggles) {
            Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
            List<String> stringArrayData = featureToggles.q(S90.c.MOB_APP_SHOW_REQUIRED_VERSION).b().getStringArrayData();
            if (stringArrayData != null) {
                return stringArrayData.contains(nVar.b().name());
            }
            return false;
        }
    }

    @NotNull
    InterfaceC2395h<h> a(boolean z11);

    @NotNull
    EnumC8852a b();

    @NotNull
    InterfaceC2395h<g> c(r rVar, boolean z11);
}

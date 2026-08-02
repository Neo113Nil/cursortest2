package ru.ozon.uni.utils;

import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/e;", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "uniTestTag", "(Landroidx/compose/ui/e;Lru/ozon/uni/atoms/data/TestInfo;LS0/k;I)Landroidx/compose/ui/e;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTestInfoTestTagKt {
    @NotNull
    public static final e uniTestTag(@NotNull e eVar, @NotNull TestInfo testInfo, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(testInfo, "testInfo");
        if (!UniGlobalConfig.INSTANCE.getEnableTestTags()) {
            return eVar;
        }
        String packageName = ((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getPackageName();
        interfaceC3967k.o(-45170701);
        boolean z11 = (((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(testInfo)) || (i11 & 48) == 32;
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new UniTestInfoTestTagKt$uniTestTag$1$1(testInfo);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Intrinsics.f(packageName);
        return eVar.l0(new UniTestInfoTagElement(testInfo, (Function1) C11, packageName));
    }
}

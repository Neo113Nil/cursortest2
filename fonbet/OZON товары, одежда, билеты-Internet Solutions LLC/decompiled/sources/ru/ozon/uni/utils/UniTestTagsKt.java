package ru.ozon.uni.utils;

import C1.m;
import I1.o;
import S0.InterfaceC3967k;
import U7.d;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\f\u001a\u00020\u0000\"\u0012\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0005*\u00020\u0006*\u00020\u00002\u0006\u0010\b\u001a\u00028\u00002\u001a\b\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r\"&\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/e;", "", "testTag", "uniResourceIdTestTag", "(Landroidx/compose/ui/e;Ljava/lang/String;LS0/k;I)Landroidx/compose/ui/e;", "", "", "T", "tag", "", "Lru/ozon/uni/utils/UniTestTagParameter;", "customInfo", "uniTestTag", "(Landroidx/compose/ui/e;Ljava/lang/Enum;Ljava/util/Map;LS0/k;II)Landroidx/compose/ui/e;", "LC1/m;", "ModifierLocalUniCustomTestTags", "LC1/m;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTestTagsKt {

    @NotNull
    private static final m<Map<Object, String>> ModifierLocalUniCustomTestTags = new m<>(UniTestTagsKt$ModifierLocalUniCustomTestTags$1.INSTANCE);

    @NotNull
    public static final e uniResourceIdTestTag(@NotNull e eVar, @NotNull String testTag, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        String e11 = UniGlobalConfig.INSTANCE.getEnablePackageNamePrefixInTestTags() ? d.e(((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getPackageName(), ":id/") : "";
        interfaceC3967k.o(-324895011);
        boolean n11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(testTag)) || (i11 & 48) == 32) | interfaceC3967k.n(e11);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new UniTestTagsKt$uniResourceIdTestTag$1$1(e11, testTag);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        return o.c(eVar, false, (Function1) C11);
    }

    @NotNull
    public static final <T extends Enum<T>> e uniTestTag(@NotNull e eVar, @NotNull T tag, Map<UniTestTagParameter<T>, String> map, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if ((i12 & 2) != 0) {
            map = U.c();
        }
        if (!UniGlobalConfig.INSTANCE.getEnableTestTags()) {
            return eVar;
        }
        String packageName = ((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getPackageName();
        interfaceC3967k.o(-45092115);
        boolean z11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.F(tag)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.n(map)) || (i11 & 384) == 256);
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new UniTestTagsKt$uniTestTag$1$1(tag, map);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Intrinsics.f(packageName);
        return eVar.l0(new UniTestTagElement(tag, (Function1) C11, map, packageName));
    }
}

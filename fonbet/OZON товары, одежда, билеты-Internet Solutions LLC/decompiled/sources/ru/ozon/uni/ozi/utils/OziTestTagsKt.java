package ru.ozon.uni.ozi.utils;

import C1.k;
import C1.m;
import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.foundation.utils.TestTagsKt;
import ru.ozon.uni.ozi.config.OziConfigKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aS\u0010\u000b\u001a\u00020\u0000\"\u0012\b\u0000\u0010\u0007*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0006*\u00020\u00002*\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\t0\b\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0011\u001a\u00020\u0000\"\u0012\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0006*\u00020\u0005*\u00020\u00002\u0006\u0010\r\u001a\u00028\u00002\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/e;", "", "testTag", "oziResourceIdTestTag", "(Landroidx/compose/ui/e;Ljava/lang/String;LS0/k;I)Landroidx/compose/ui/e;", "", "", "T", "", "Lkotlin/Pair;", "pairs", "oziCustomTestTags", "(Landroidx/compose/ui/e;[Lkotlin/Pair;)Landroidx/compose/ui/e;", "tag", "", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "customInfo", "oziTestTag", "(Landroidx/compose/ui/e;Ljava/lang/Enum;Ljava/util/Map;LS0/k;II)Landroidx/compose/ui/e;", "LC1/m;", "ModifierLocalOziCustomTestTags", "LC1/m;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziTestTagsKt {

    @NotNull
    private static final m<Map<Object, String>> ModifierLocalOziCustomTestTags = new m<>(OziTestTagsKt$ModifierLocalOziCustomTestTags$1.INSTANCE);

    @NotNull
    public static final <T extends Enum<T>> e oziCustomTestTags(@NotNull e eVar, @NotNull Pair<? extends T, String>... pairs) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return OziConfigKt.getGlobalOziConfig().getEnableOziTestTags() ? k.a(eVar, ModifierLocalOziCustomTestTags, new OziTestTagsKt$oziCustomTestTags$1(pairs)) : eVar;
    }

    @NotNull
    public static final e oziResourceIdTestTag(@NotNull e eVar, @NotNull String testTag, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        return eVar.l0(TestTagsKt.resourceIdTestTag(e.f40358c0, testTag, OziConfigKt.getGlobalOziConfig().getEnablePackageNamePrefixInTestTags(), interfaceC3967k, (i11 & 112) | 6, 0));
    }

    @NotNull
    public static final <T extends Enum<T>> e oziTestTag(@NotNull e eVar, @NotNull T tag, Map<OziTestTagParameter<T>, String> map, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if ((i12 & 2) != 0) {
            map = U.c();
        }
        if (!OziConfigKt.getGlobalOziConfig().getEnableOziTestTags()) {
            return eVar;
        }
        String packageName = ((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getPackageName();
        interfaceC3967k.o(-1174653585);
        boolean z11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.F(tag)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && interfaceC3967k.n(map)) || (i11 & 384) == 256);
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new OziTestTagsKt$oziTestTag$1$1(tag, map);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        Intrinsics.f(packageName);
        return eVar.l0(new OziTestTagElement(tag, (Function1) C11, map, packageName));
    }
}

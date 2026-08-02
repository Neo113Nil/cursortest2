package ru.ozon.uni.foundation.utils;

import I1.o;
import S0.InterfaceC3967k;
import U7.d;
import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/e;", "", "testTag", "", "enablePackageNamePrefixInTestTags", "resourceIdTestTag", "(Landroidx/compose/ui/e;Ljava/lang/String;ZLS0/k;II)Landroidx/compose/ui/e;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TestTagsKt {
    @NotNull
    public static final e resourceIdTestTag(@NotNull e eVar, @NotNull String testTag, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        String e11 = z11 ? d.e(((Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d())).getPackageName(), ":id/") : "";
        interfaceC3967k.o(354705240);
        boolean n11 = ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(testTag)) || (i11 & 48) == 32) | interfaceC3967k.n(e11);
        Object C11 = interfaceC3967k.C();
        if (n11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new TestTagsKt$resourceIdTestTag$1$1(e11, testTag);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        return o.c(eVar, false, (Function1) C11);
    }
}

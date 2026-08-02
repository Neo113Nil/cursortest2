package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Vg.c;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d00.C6020f;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.composer.compose.widget.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "deserializer", "Lkotlin/Function1;", "Lk20/g;", "LVg/c;", "customActionHandlersStore", "Ln20/i;", "commonPromoBannerWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/jvm/functions/Function1;)Ln20/i;", "", "InitBackgroundColor", "(LS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonPromoBannerConfigKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void InitBackgroundColor(InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(1398742718);
        if (i11 == 0 && u11.b()) {
            u11.j();
        } else {
            Object parent = ((View) u11.m(AndroidCompositionLocals_androidKt.h())).getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.setBackground(null);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CommonPromoBannerConfigKt$InitBackgroundColor$1(i11));
        }
    }

    @NotNull
    public static final i commonPromoBannerWidget(@NotNull JsonParser deserializer, Function1<? super C7475g, ? extends c> function1) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return C6020f.a("common", "promoBanner", k.a(4), new CommonPromoBannerConfigKt$commonPromoBannerWidget$1(deserializer, function1));
    }
}

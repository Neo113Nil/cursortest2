package ru.ozon.app.android.regulardraw.ui;

import S0.InterfaceC3967k;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/platform/ComposeView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CompatibleGraphicsLayerKt$SoftwareLayerComposable$1$1 extends AbstractC7737t implements Function1<Context, ComposeView> {
    final /* synthetic */ Function2<InterfaceC3967k, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CompatibleGraphicsLayerKt$SoftwareLayerComposable$1$1(Function2<? super InterfaceC3967k, ? super Integer, Unit> function2) {
        super(1);
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ComposeView invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        Function2<InterfaceC3967k, Integer, Unit> function2 = this.$content;
        composeView.setLayerType(1, null);
        composeView.a(function2);
        return composeView;
    }
}

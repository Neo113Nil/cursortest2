package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/ShapeDrawable;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class RichContentRecyclerAdapter$imageListBg$2 extends AbstractC7737t implements Function0<ShapeDrawable> {
    final /* synthetic */ RichContentRecyclerAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RichContentRecyclerAdapter$imageListBg$2(RichContentRecyclerAdapter richContentRecyclerAdapter) {
        super(0);
        this.this$0 = richContentRecyclerAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ShapeDrawable invoke() {
        Context context;
        Context context2;
        context = this.this$0.context;
        CornersConfig cornersConfig = CornersConfig.ALL;
        float dpf_6 = Dimens.INSTANCE.getDPF_6();
        context2 = this.this$0.context;
        return ContextExtKt.createRoundRectShape$default(context, dpf_6, cornersConfig, 0, ThemeExtKt.themeColor(context2, R$attr.bgPrimary), null, 20, null);
    }
}

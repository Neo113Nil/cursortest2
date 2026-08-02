package ru.ozon.app.android.commonwidgets.widgets.valuestotal.core;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.data.ValuesTotalDTO;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.presentation.ValuesTotalVO;
import ru.ozon.app.android.commonwidgets.widgets.valuestotal.presentation.ValuesTotalViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/valuestotal/core/ValuesTotalViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/data/ValuesTotalDTO;", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalVO;", "<init>", "()V", "mapper", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/core/ValuesTotalMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/valuestotal/core/ValuesTotalMapper;", "layout", "", "getLayout", "()Ljava/lang/Integer;", "holderProducer", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/valuestotal/presentation/ValuesTotalViewHolder;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValuesTotalViewMapper extends WidgetViewMapper<ValuesTotalDTO, ValuesTotalVO> {

    @NotNull
    private final ValuesTotalMapper mapper = new ValuesTotalMapper();
    private final int layout = R$layout.widget_values_total;

    @NotNull
    private final Function2<View, ComposerReferences, ValuesTotalViewHolder> holderProducer = ValuesTotalViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ValuesTotalVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ValuesTotalDTO, d, List<ValuesTotalVO>> getMapper() {
        return this.mapper;
    }
}

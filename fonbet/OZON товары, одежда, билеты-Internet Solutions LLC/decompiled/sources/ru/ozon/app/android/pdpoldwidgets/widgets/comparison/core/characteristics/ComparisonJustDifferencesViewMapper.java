package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdp.ui.configurators.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.justDifferences.JustDifferencesVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.justDifferences.JustDifferencesViewHolder;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.data.ComparisonDTO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005R2\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonJustDifferencesViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/data/ComparisonDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/justDifferences/JustDifferencesVO;", "<init>", "()V", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/justDifferences/JustDifferencesViewHolder;", "holderProducer", "getHolderProducer", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonJustDifferencesViewMapper extends WidgetViewMapper<ComparisonDTO, JustDifferencesVO> {

    @NotNull
    private final Function2<ComparisonDTO, d, List<JustDifferencesVO>> mapper = new ComparisonJustDifferencesViewMapper$mapper$1(this);
    private final int layout = R$layout.pdp_widget_comparison_just_differences;

    @NotNull
    private final Function2<View, ComposerReferences, JustDifferencesViewHolder> holderProducer = ComparisonJustDifferencesViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<JustDifferencesVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ComparisonDTO, d, List<JustDifferencesVO>> getMapper() {
        return this.mapper;
    }
}

package ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.core;

import GZ.g;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.data.CrosslinkDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation.CrosslinkVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.presentation.CrosslinkViewHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/data/CrosslinkDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkVO;", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(LGZ/g;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "LGZ/g;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkMapper;", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkMapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkMapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/presentation/CrosslinkViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrosslinkViewMapper extends WidgetViewMapper<CrosslinkDTO, CrosslinkVO> {

    @NotNull
    private final Function2<View, ComposerReferences, CrosslinkViewHolder> holderProducer;

    @NotNull
    private final HandlersInhibitor inhibitor;
    private final int layout;

    @NotNull
    private final CrosslinkMapper mapper;

    @NotNull
    private final g ozonRouter;

    public CrosslinkViewMapper(@NotNull g ozonRouter, @NotNull HandlersInhibitor inhibitor) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.ozonRouter = ozonRouter;
        this.inhibitor = inhibitor;
        this.mapper = new CrosslinkMapper();
        this.layout = R$layout.pdp_widget_crosslink;
        this.holderProducer = new CrosslinkViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<CrosslinkVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<CrosslinkDTO, d, List<CrosslinkVO>> getMapper() {
        return this.mapper;
    }
}

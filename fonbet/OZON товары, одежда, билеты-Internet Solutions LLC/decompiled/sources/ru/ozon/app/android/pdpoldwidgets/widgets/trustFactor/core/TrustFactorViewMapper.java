package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.core;

import GZ.g;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.data.TrustFactorDTO;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorVO;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.TrustFactorViewHolder;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R,\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/data/TrustFactorDTO;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LGZ/g;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorMapper;", "mapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorMapper;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorMapper;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrustFactorViewMapper extends WidgetViewMapper<TrustFactorDTO, TrustFactorVO> {

    @NotNull
    private final Function2<View, ComposerReferences, TrustFactorViewHolder> holderProducer;
    private final int layout;

    @NotNull
    private final TrustFactorMapper mapper;

    @NotNull
    private final g ozonRouter;

    public TrustFactorViewMapper(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
        this.layout = R$layout.widget_trust_factor;
        this.mapper = new TrustFactorMapper();
        this.holderProducer = new TrustFactorViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        List<TrustFactorDTO.TrustFactorItem> trustFactors;
        TrustFactorDTO trustFactorDTO = state instanceof TrustFactorDTO ? (TrustFactorDTO) state : null;
        return (trustFactorDTO == null || (trustFactors = trustFactorDTO.getTrustFactors()) == null || !(trustFactors.isEmpty() ^ true)) ? false : true;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TrustFactorVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TrustFactorDTO, d, List<TrustFactorVO>> getMapper() {
        return this.mapper;
    }
}

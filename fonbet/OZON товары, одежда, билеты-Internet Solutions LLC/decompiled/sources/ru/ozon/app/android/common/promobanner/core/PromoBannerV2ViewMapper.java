package ru.ozon.app.android.common.promobanner.core;

import A00.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.promobanner.data.PromoBannerV2DTO;
import ru.ozon.app.android.common.promobanner.presentation.PromoBannerV2VO;
import ru.ozon.app.android.common.promobanner.presentation.PromoBannerV2WidgetVH;
import ru.ozon.app.android.common.promobanner.presentation.UpdatePromoBannerV2;
import ru.ozon.app.android.common.ui.promobanner.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R.\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/promobanner/core/PromoBannerV2ViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2VO;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/app/android/common/promobanner/core/PromoBannerV2Mapper;", "mapper", "Lru/ozon/app/android/common/promobanner/core/PromoBannerV2Mapper;", "getMapper", "()Lru/ozon/app/android/common/promobanner/core/PromoBannerV2Mapper;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/common/promobanner/presentation/PromoBannerV2WidgetVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/common/promobanner/presentation/UpdatePromoBannerV2;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "LA00/a$J$a;", "updateConsumer", "getUpdateConsumer", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromoBannerV2ViewMapper extends WidgetViewMapper<PromoBannerV2DTO, PromoBannerV2VO> {

    @NotNull
    private final Function2<View, ComposerReferences, PromoBannerV2WidgetVH> holderProducer;
    private final int layout;

    @NotNull
    private final PromoBannerV2Mapper mapper;

    @NotNull
    private final List<Class<UpdatePromoBannerV2>> supportedUpdates;

    @NotNull
    private final Function2<a.J.InterfaceC0007a, PromoBannerV2VO, PromoBannerV2VO> updateConsumer;

    public PromoBannerV2ViewMapper(@NotNull HandlersInhibitor handlersInhibitor) {
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.mapper = new PromoBannerV2Mapper();
        this.layout = R$layout.widget_promo_banner_v2;
        this.holderProducer = new PromoBannerV2ViewMapper$holderProducer$1(handlersInhibitor);
        this.supportedUpdates = C7714v.a0(UpdatePromoBannerV2.class);
        this.updateConsumer = PromoBannerV2ViewMapper$updateConsumer$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<PromoBannerV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<UpdatePromoBannerV2>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<a.J.InterfaceC0007a, PromoBannerV2VO, PromoBannerV2VO> getUpdateConsumer() {
        return this.updateConsumer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PromoBannerV2DTO, d, List<PromoBannerV2VO>> getMapper() {
        return this.mapper;
    }
}

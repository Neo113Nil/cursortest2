package ru.ozon.app.android.common.activate_code;

import A00.a;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.activate_code.core.ActivateCodeMapper;
import ru.ozon.app.android.common.activate_code.data.ActivateCodeDTO;
import ru.ozon.app.android.common.activate_code.presentation.ActivateCodeVO;
import ru.ozon.app.android.common.ui.activate_code.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;
import ru.ozon.app.android.marketing.coupon.domain.CouponInteractor;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR6\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\fj\u0002`\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R<\u0010\u001c\u001a$\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001aj\b\u0012\u0004\u0012\u00020\u0003`\u001b0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R(\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R0\u0010$\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b%\u0010\u0012¨\u0006&"}, d2 = {"Lru/ozon/app/android/common/activate_code/ActivateCodeViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/common/activate_code/data/ActivateCodeDTO;", "Lru/ozon/app/android/common/activate_code/presentation/ActivateCodeVO;", "Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "interactor", "Lru/ozon/app/android/marketing/coupon/data/CouponStorage;", "couponStorage", "<init>", "(Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;Lru/ozon/app/android/marketing/coupon/data/CouponStorage;)V", "Lru/ozon/app/android/marketing/coupon/domain/CouponInteractor;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "updateConsumer", "getUpdateConsumer", "activate-code_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActivateCodeViewMapper extends WidgetViewMapper<ActivateCodeDTO, ActivateCodeVO> {

    @NotNull
    private final Function2<View, ComposerReferences, k<ActivateCodeVO>> holderProducer;

    @NotNull
    private final CouponInteractor interactor;
    private final int layout;

    @NotNull
    private final Function2<ActivateCodeDTO, d, List<ActivateCodeVO>> mapper;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates;
    private final Function2<a.J.InterfaceC0007a, ActivateCodeVO, ActivateCodeVO> updateConsumer;

    public ActivateCodeViewMapper(@NotNull CouponInteractor interactor, @NotNull CouponStorage couponStorage) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(couponStorage, "couponStorage");
        this.interactor = interactor;
        this.mapper = new ActivateCodeMapper();
        this.layout = R$layout.widget_activate_code;
        this.holderProducer = new ActivateCodeViewMapper$holderProducer$1(this, couponStorage);
        this.supportedUpdates = C7714v.a0(ActivateCodeActivated.class);
        this.updateConsumer = ActivateCodeViewMapper$updateConsumer$1.INSTANCE;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ActivateCodeVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ActivateCodeDTO, d, List<ActivateCodeVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    public Function2<a.J.InterfaceC0007a, ActivateCodeVO, ActivateCodeVO> getUpdateConsumer() {
        return this.updateConsumer;
    }
}

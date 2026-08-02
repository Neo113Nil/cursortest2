package ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase;

import A00.a;
import Kk.c;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentDtoWrapper$Purchase;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.di.InstallmentPurchaseWidgetsComponent;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseView;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.purchase.InstallmentPurchaseWidgetViewHolder;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0017j\b\u0012\u0004\u0012\u00020\u0002`\u00182\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%R,\u0010*\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R(\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070.0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/di/InstallmentPurchaseWidgetsComponent;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentDtoWrapper$Purchase;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;)Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;", "newItem", "", "getPayload", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Purchase;)Ljava/lang/Object;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseView;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/purchase/InstallmentPurchaseWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/purchase/InstallmentPurchaseMapper;", "mapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstallmentPurchaseViewMapper extends WidgetViewMapper2<InstallmentPurchaseWidgetsComponent, InstallmentDtoWrapper$Purchase, InstallmentVO.Purchase> {

    @NotNull
    private final Function2<View, ComposerReferences, InstallmentPurchaseWidgetViewHolder> holderProducer = new InstallmentPurchaseViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(InstallmentPurchaseViewMapper$OnboardingEvent$Show.class, InstallmentPurchaseViewMapper$OnboardingEvent$Empty.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof InstallmentDtoWrapper$Purchase;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, InstallmentPurchaseWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<InstallmentPurchaseWidgetsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return InstallmentPurchaseWidgetsComponent.INSTANCE.getInstance(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public InstallmentPurchaseView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new InstallmentPurchaseView(context, component().getAppType() == AppType.SELECT);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public InstallmentPurchaseMapper getMapper() {
        return component().getInstallmentPurchaseMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull InstallmentVO.Purchase oldItem, @NotNull InstallmentVO.Purchase newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        InstallmentVO.Purchase.NeedShowOnboardingData needShowOnboardingData = newItem.getNeedShowOnboardingData();
        if (needShowOnboardingData instanceof InstallmentVO.Purchase.NeedShowOnboardingData.Show) {
            return new InstallmentPurchaseViewMapper$OnboardingPayload$Show(((InstallmentVO.Purchase.NeedShowOnboardingData.Show) newItem.getNeedShowOnboardingData()).getAdditionalHeight());
        }
        if (needShowOnboardingData instanceof InstallmentVO.Purchase.NeedShowOnboardingData.Empty) {
            return new Object() { // from class: ru.ozon.app.android.pdp.widgets.installmentPurchase.core.purchase.InstallmentPurchaseViewMapper$OnboardingPayload$Empty
                public boolean equals(Object other) {
                    return this == other || (other instanceof InstallmentPurchaseViewMapper$OnboardingPayload$Empty);
                }

                public int hashCode() {
                    return -255022116;
                }

                @NotNull
                public String toString() {
                    return "Empty";
                }
            };
        }
        throw new o();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public InstallmentVO.Purchase handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull InstallmentVO.Purchase oldItem) {
        InstallmentVO.Purchase copy;
        InstallmentVO.Purchase copy2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof InstallmentPurchaseViewMapper$OnboardingEvent$Show) {
            copy2 = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.price : null, (r29 & 4) != 0 ? oldItem.action : null, (r29 & 8) != 0 ? oldItem.animationTimer : null, (r29 & 16) != 0 ? oldItem.animationTokenizedEvent : null, (r29 & 32) != 0 ? oldItem.onboarding : null, (r29 & 64) != 0 ? oldItem.showTopRounding : false, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.hasPeriods : false, (r29 & 256) != 0 ? oldItem.needShowOnboardingData : new InstallmentVO.Purchase.NeedShowOnboardingData.Show(((InstallmentPurchaseViewMapper$OnboardingEvent$Show) update).getAdditionalOnboardingHeight()), (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.tokenizedEvent : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.priceIcon : null, (r29 & 2048) != 0 ? oldItem.background : null, (r29 & 4096) != 0 ? oldItem.chevronIcon : null);
            return copy2;
        }
        if (!(update instanceof InstallmentPurchaseViewMapper$OnboardingEvent$Empty)) {
            return null;
        }
        copy = oldItem.copy((r29 & 1) != 0 ? oldItem.id : 0L, (r29 & 2) != 0 ? oldItem.price : null, (r29 & 4) != 0 ? oldItem.action : null, (r29 & 8) != 0 ? oldItem.animationTimer : null, (r29 & 16) != 0 ? oldItem.animationTokenizedEvent : null, (r29 & 32) != 0 ? oldItem.onboarding : null, (r29 & 64) != 0 ? oldItem.showTopRounding : false, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? oldItem.hasPeriods : false, (r29 & 256) != 0 ? oldItem.needShowOnboardingData : InstallmentVO.Purchase.NeedShowOnboardingData.Empty.INSTANCE, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? oldItem.tokenizedEvent : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? oldItem.priceIcon : null, (r29 & 2048) != 0 ? oldItem.background : null, (r29 & 4096) != 0 ? oldItem.chevronIcon : null);
        return copy;
    }
}

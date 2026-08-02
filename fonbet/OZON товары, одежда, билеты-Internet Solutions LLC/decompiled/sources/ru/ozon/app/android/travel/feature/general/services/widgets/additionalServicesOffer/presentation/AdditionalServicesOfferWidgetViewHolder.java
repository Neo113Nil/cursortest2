package ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation;

import Sc.o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.services.databinding.WidgetAdditionalServicesOfferBinding;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.AdditionalServicesOfferVO;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.adapter.AdditionalServicesOfferAdapter;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/travel/feature/general/services/databinding/WidgetAdditionalServicesOfferBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/services/databinding/WidgetAdditionalServicesOfferBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/adapter/AdditionalServicesOfferAdapter;", "additionalServicesOfferAdapter", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/adapter/AdditionalServicesOfferAdapter;", "", "marginShaded", "I", "", "cardElevation", "F", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdditionalServicesOfferWidgetViewHolder extends k<AdditionalServicesOfferVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AdditionalServicesOfferAdapter additionalServicesOfferAdapter;

    @NotNull
    private final WidgetAdditionalServicesOfferBinding binding;
    private final float cardElevation;

    @NotNull
    private final View containerView;
    private final int marginShaded;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdditionalServicesOfferVO.AdditionalServicesOfferTheme.values().length];
            try {
                iArr[AdditionalServicesOfferVO.AdditionalServicesOfferTheme.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdditionalServicesOfferVO.AdditionalServicesOfferTheme.SHADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalServicesOfferWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        WidgetAdditionalServicesOfferBinding bind = WidgetAdditionalServicesOfferBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(references, this).buildHandler();
        this.actionHandler = buildHandler;
        AdditionalServicesOfferAdapter additionalServicesOfferAdapter = new AdditionalServicesOfferAdapter(buildHandler);
        this.additionalServicesOfferAdapter = additionalServicesOfferAdapter;
        this.marginShaded = ResourceExtKt.toPx(16, getContext());
        this.cardElevation = ResourceExtKt.toPxF(12, getContext());
        RecyclerView recyclerView = bind.additionalServicesOfferRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(additionalServicesOfferAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AdditionalServicesOfferVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView additionalServicesOfferTitleTAV = this.binding.additionalServicesOfferTitleTAV;
        Intrinsics.checkNotNullExpressionValue(additionalServicesOfferTitleTAV, "additionalServicesOfferTitleTAV");
        TextAtomHolderKt.bind$default(additionalServicesOfferTitleTAV, item.getTitle(), null, 2, null);
        this.additionalServicesOfferAdapter.setItems(item.getOffers());
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getTheme().ordinal()];
        if (i11 == 1) {
            LinearLayout linearLayout = this.binding.additionalServicesOfferLL;
            Intrinsics.f(linearLayout);
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
            linearLayout.setLayoutParams(marginLayoutParams);
            linearLayout.setElevation(0.0f);
            return;
        }
        if (i11 != 2) {
            throw new o();
        }
        LinearLayout linearLayout2 = this.binding.additionalServicesOfferLL;
        Intrinsics.f(linearLayout2);
        ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(this.marginShaded);
        marginLayoutParams2.setMarginEnd(this.marginShaded);
        linearLayout2.setLayoutParams(marginLayoutParams2);
        linearLayout2.setElevation(this.cardElevation);
    }
}

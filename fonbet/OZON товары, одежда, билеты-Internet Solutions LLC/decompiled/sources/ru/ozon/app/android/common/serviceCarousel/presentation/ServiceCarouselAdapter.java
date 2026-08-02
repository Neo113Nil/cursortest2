package ru.ozon.app.android.common.serviceCarousel.presentation;

import UZ.a;
import WZ.g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import gk0.q;
import java.util.Map;
import jk0.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.serviceCarousel.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0000\u0018\u0000 72\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00017B\u008d\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020 2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010)R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R,\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00100R\"\u00101\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00105\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselAdapter;", "Ljk0/i;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemVO;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "", "analyticsTrack", "Lkotlin/Function0;", "Ll20/d;", "widgetInfoProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function2;", "LUZ/a;", "LWZ/g;", "pageIdModifier", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselDiffUtil;", "diffCallback", "", "isPreCreateWidgetsCategoryMainPageFresh", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function2;Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselDiffUtil;Z)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselItemViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Landroidx/lifecycle/J;", "Lkotlin/jvm/functions/Function2;", "Z", "isKeepPermanentPageViewId", "()Z", "setKeepPermanentPageViewId", "(Z)V", "layoutRes", "I", "Companion", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ServiceCarouselAdapter extends i<ServiceCarouselItemVO, ServiceCarouselItemViewHolder> {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int dp4 = ResourceExtKt.toPx(4);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final Function1<Map<String, String>, Unit> analyticsTrack;

    @NotNull
    private final J containerViewLifecycleOwner;
    private boolean isKeepPermanentPageViewId;
    private final boolean isPreCreateWidgetsCategoryMainPageFresh;
    private final int layoutRes;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;

    @NotNull
    private final Function2<a, g, g> pageIdModifier;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Function0<d> widgetInfoProvider;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselAdapter$Companion;", "", "<init>", "()V", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ServiceCarouselAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Map<String, String>, Unit> analyticsTrack, @NotNull Function0<d> widgetInfoProvider, @NotNull ComposerReferences refs, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull J containerViewLifecycleOwner, @NotNull Function2<? super a, ? super g, g> pageIdModifier, @NotNull ServiceCarouselDiffUtil diffCallback, boolean z11) {
        super(diffCallback, containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(analyticsTrack, "analyticsTrack");
        Intrinsics.checkNotNullParameter(widgetInfoProvider, "widgetInfoProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(pageIdModifier, "pageIdModifier");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.actionHandler = actionHandler;
        this.analyticsTrack = analyticsTrack;
        this.widgetInfoProvider = widgetInfoProvider;
        this.refs = refs;
        this.onBoardingViewModel = onBoardingViewModel;
        this.containerViewLifecycleOwner = containerViewLifecycleOwner;
        this.pageIdModifier = pageIdModifier;
        this.isPreCreateWidgetsCategoryMainPageFresh = z11;
        this.layoutRes = R$layout.widget_service_carousel_item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return R$layout.widget_service_carousel_item;
    }

    public final void setKeepPermanentPageViewId(boolean z11) {
        this.isKeepPermanentPageViewId = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ServiceCarouselItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        d invoke = this.widgetInfoProvider.invoke();
        if (invoke != null) {
            ServiceCarouselItemVO item = getItem(position);
            Intrinsics.f(item);
            k.bindItem$default(holder, item, invoke, null, 4, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ServiceCarouselItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View h11;
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = null;
        if (this.isPreCreateWidgetsCategoryMainPageFresh && (h11 = q.f64554a.h(this.layoutRes)) != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i11 = dp4;
            layoutParams.setMargins(i11, 0, i11, 0);
            h11.setLayoutParams(layoutParams);
            view = h11;
        }
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(this.layoutRes, parent, false);
        }
        View view2 = view;
        Intrinsics.f(view2);
        return new ServiceCarouselItemViewHolder(view2, this.actionHandler, this.analyticsTrack, this.refs, this.onBoardingViewModel, this.containerViewLifecycleOwner, this.pageIdModifier, Boolean.valueOf(this.isKeepPermanentPageViewId));
    }
}

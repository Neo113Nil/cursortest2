package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation;

import NV.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 32\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00013B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010%\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\n\u0010!\u001a\u00060\u001fj\u0002` 2\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00120,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3ViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3Layout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "onBoardingViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "onBoardingDisplayRepository", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3Layout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;LWZ/l;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;)V", "", "viewPosition", "", "showOnboardingIfExist", "(I)V", "item", "initDelegate", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;)I", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;Ll20/d;)V", "onDetach", "()V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3Layout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV3ViewHolder extends k<NaviBlocksV3VO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NaviBlocksV3Layout containerView;

    @NotNull
    private final OnBoardingDisplayRepository onBoardingDisplayRepository;

    @NotNull
    private final BaseOnBoardingViewModel onBoardingViewModel;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final float ONBOARDING_CORNER_RADIUS = ResourceExtKt.toPxF(12);
    private static final int ONBOARDING_BOTTOM_MARGIN = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3ViewHolder$Companion;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NaviBlocksV3ViewHolder(@NotNull NaviBlocksV3Layout containerView, @NotNull ComposerReferences refs, @NotNull BaseOnBoardingViewModel onBoardingViewModel, @NotNull l tokenizedAnalytics, @NotNull OnBoardingDisplayRepository onBoardingDisplayRepository) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onBoardingViewModel, "onBoardingViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(onBoardingDisplayRepository, "onBoardingDisplayRepository");
        this.containerView = containerView;
        this.refs = refs;
        this.onBoardingViewModel = onBoardingViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.onBoardingDisplayRepository = onBoardingDisplayRepository;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1$lambda$0(BlockV3VO blockV3VO, NaviBlocksV3ViewHolder naviBlocksV3ViewHolder, View view) {
        AtomAction action = blockV3VO.getAction();
        if (action != null) {
            naviBlocksV3ViewHolder.actionHandler.invoke(action);
        }
    }

    private final int initDelegate(NaviBlocksV3VO item) {
        Object obj;
        Iterator<T> it = item.getBlocks().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            BlockV3VO blockV3VO = (BlockV3VO) obj;
            if (blockV3VO.getOnboarding() != null) {
                OnBoardingDisplayRepository onBoardingDisplayRepository = this.onBoardingDisplayRepository;
                String onboardingKey = blockV3VO.getOnboarding().getOnboardingKey();
                if (onboardingKey != null && onBoardingDisplayRepository.canShow(onboardingKey)) {
                    break;
                }
            }
        }
        BlockV3VO blockV3VO2 = (BlockV3VO) obj;
        int S11 = C7714v.S(blockV3VO2, item.getBlocks());
        OnBoardingDTO onboarding = blockV3VO2 != null ? blockV3VO2.getOnboarding() : null;
        if (this.onboardingDelegate != null || onboarding == null || S11 == -1) {
            return -1;
        }
        String onboardingKey2 = onboarding.getOnboardingKey();
        if (onboardingKey2 == null) {
            return -1;
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey2, this.refs, this.containerView, onboarding, this, this.onBoardingViewModel, this.tokenizedAnalytics, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        onBoardingDelegateImpl.setOnShownListener(new NaviBlocksV3ViewHolder$initDelegate$1$1(this));
        this.onboardingDelegate = onBoardingDelegateImpl;
        return S11;
    }

    private final void showOnboardingIfExist(final int viewPosition) {
        if (this.onboardingDelegate == null) {
            return;
        }
        final NaviBlocksV3Layout naviBlocksV3Layout = this.containerView;
        naviBlocksV3Layout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3ViewHolder$showOnboardingIfExist$$inlined$afterMeasured$1
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
            
                r1 = r2.onboardingDelegate;
             */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onGlobalLayout() {
                OnBoardingDelegate onBoardingDelegate;
                int i11;
                float f7;
                NaviBlocksV3Layout naviBlocksV3Layout2;
                if (naviBlocksV3Layout.getMeasuredWidth() <= 0 || naviBlocksV3Layout.getMeasuredHeight() <= 0) {
                    return;
                }
                naviBlocksV3Layout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                NaviBlocksV3Layout naviBlocksV3Layout3 = (NaviBlocksV3Layout) naviBlocksV3Layout;
                BlockV3View blockV3View = null;
                if (this.getBoundedData() != null && viewPosition != -1) {
                    naviBlocksV3Layout2 = this.containerView;
                    blockV3View = (BlockV3View) C7705l.K(viewPosition, naviBlocksV3Layout2.getViewBlocks());
                }
                if (blockV3View == null || onBoardingDelegate == null) {
                    return;
                }
                NaviBlocksV3ViewHolder naviBlocksV3ViewHolder = this;
                Integer valueOf = Integer.valueOf(blockV3View.getLeft());
                Integer valueOf2 = Integer.valueOf(naviBlocksV3Layout3.getMeasuredWidth() - blockV3View.getRight());
                i11 = NaviBlocksV3ViewHolder.ONBOARDING_BOTTOM_MARGIN;
                Integer valueOf3 = Integer.valueOf(i11);
                f7 = NaviBlocksV3ViewHolder.ONBOARDING_CORNER_RADIUS;
                onBoardingDelegate.bind(naviBlocksV3ViewHolder, new OnBoardingCutConfig(valueOf, null, valueOf2, valueOf3, null, null, Float.valueOf(f7), false, 50, null), new NaviBlocksV3ViewHolder$showOnboardingIfExist$1$1(this, viewPosition));
            }
        });
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        String tag;
        super.onDetach();
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null && (tag = c11.getTag()) != null) {
            this.onBoardingViewModel.removePageFromCache(tag);
        }
        OnBoardingDelegate onBoardingDelegate = this.onboardingDelegate;
        if (onBoardingDelegate != null) {
            onBoardingDelegate.unbind();
        }
        this.onboardingDelegate = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NaviBlocksV3VO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
        int i11 = 0;
        for (Object obj : item.getBlocks()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            BlockV3VO blockV3VO = (BlockV3VO) obj;
            BlockV3View blockV3View = (BlockV3View) C7705l.K(i11, this.containerView.getViewBlocks());
            if (blockV3View != null) {
                Drawable background = blockV3View.getBackground();
                Intrinsics.g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) background).setCornerRadius(ResourceExtKt.toPxF(blockV3VO.getCornerRadius().getPx()));
                blockV3View.bind(blockV3VO);
                blockV3View.setOnClickListener(new a(6, blockV3VO, this));
            }
            i11 = i12;
        }
        showOnboardingIfExist(initDelegate(item));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NaviBlocksV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((NaviBlocksV3ViewHolder) item, trackingData, viewedPond);
        Iterator<T> it = item.getBlocks().iterator();
        while (it.hasNext()) {
            t tokenizedEvent = ((BlockV3VO) it.next()).getTokenizedEvent();
            if (tokenizedEvent != null) {
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
            }
        }
    }
}

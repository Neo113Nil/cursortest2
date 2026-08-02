package ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders;

import Az.ViewOnClickListenerC2453a;
import Hk0.c;
import JE.a;
import Nx.ViewOnClickListenerC3676a;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.List;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.databinding.ItemUgcDoubleBlockBinding;
import ru.ozon.app.android.ugc.databinding.ItemUgcSingleBlockBinding;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersSingleBlockItemBinder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersDoubleBlockItemViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.recycler.UgcCountersSingleBlockItemViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views.UgcCountersExpandingBlockView;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.views.UgcCountersImageBlockView;
import ru.ozon.app.android.video.preload.PlayerPreloader;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BQ\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020-2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b1\u00102J;\u00109\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u0001052\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00162\u0006\u00104\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010AR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ER\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010L\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010N\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010HR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u0004\u0018\u00010V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010[\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00160Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R(\u0010_\u001a\u0016\u0012\u0004\u0012\u00020Z\u0012\u0006\u0012\u0004\u0018\u00010^\u0012\u0004\u0012\u00020\u00160]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006a"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersLlBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/binders/UgcCountersSingleBlockItemBinder;", "Landroid/widget/LinearLayout;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/video/preload/PlayerPreloader;", "playerPreloader", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "imagesPreCreationConfig", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "<init>", "(Landroid/widget/LinearLayout;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;Lru/ozon/app/android/video/preload/PlayerPreloader;Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;)V", "item", "", "bindBlocks", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;)V", "itemVO", "setupOnboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onboarding", "initOnboardingDelegate", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "showOnboarding", "()V", "", "color", "setBackgroundColor", "(Ljava/lang/String;)V", "", "leftMargin", "Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "createSingleBlockBinding", "(I)Lru/ozon/app/android/ugc/databinding/ItemUgcSingleBlockBinding;", "Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;", "createDoubleBlockBinding", "(I)Lru/ozon/app/android/ugc/databinding/ItemUgcDoubleBlockBinding;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersExpandingBlockView;", "createExpandingBlockView", "(I)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersExpandingBlockView;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView;", "createImageBlockView", "(I)Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/views/UgcCountersImageBlockView;", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "onFinish", "bind", "(Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/widgets/ugccounters/onboarding/UgcCountersOnboardingViewModel;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImagesPreCreationConfig;", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "", "isImagesUploaded", "Z", "onImageLoadSuccessful", "Lkotlin/jvm/functions/Function0;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingDelegate", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegate;", "onboardingBlockIndex", "I", "defaultBackgroundColor", "Ljava/lang/String;", "isBlocksInitialized", "", "lastItemId", "Ljava/lang/Long;", "Landroid/graphics/drawable/ShapeDrawable;", "preCreationBgImageDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function2;", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "imageBlockClickAction", "Lkotlin/jvm/functions/Function2;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersLlBinder extends BaseWidgetPlaceholderBinder<UgcCountersVO> implements UgcCountersSingleBlockItemBinder {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LinearLayout containerView;

    @NotNull
    private String defaultBackgroundColor;

    @NotNull
    private final Function2<AtomAction, PreloadVideoInfo, Unit> imageBlockClickAction;
    private final UgcCountersImagesPreCreationConfig imagesPreCreationConfig;
    private boolean isBlocksInitialized;
    private boolean isImagesUploaded;
    private Long lastItemId;
    private Function0<Unit> onImageLoadSuccessful;
    private int onboardingBlockIndex;
    private OnBoardingDelegate onboardingDelegate;

    @NotNull
    private final UgcCountersOnboardingViewModel onboardingViewModel;
    private final ShapeDrawable preCreationBgImageDrawable;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final k<UgcCountersVO> viewHolderOwner;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public UgcCountersLlBinder(@NotNull LinearLayout containerView, @NotNull ComposerReferences refs, @NotNull UgcCountersOnboardingViewModel onboardingViewModel, @NotNull PlayerPreloader playerPreloader, UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig, @NotNull k<UgcCountersVO> viewHolderOwner, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(onboardingViewModel, "onboardingViewModel");
        Intrinsics.checkNotNullParameter(playerPreloader, "playerPreloader");
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        this.containerView = containerView;
        this.refs = refs;
        this.onboardingViewModel = onboardingViewModel;
        this.imagesPreCreationConfig = ugcCountersImagesPreCreationConfig;
        this.viewHolderOwner = viewHolderOwner;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.onboardingBlockIndex = -1;
        this.defaultBackgroundColor = UniColors.LAYER_FLOOR_1.getToken();
        this.preCreationBgImageDrawable = ugcCountersImagesPreCreationConfig != null ? UgcCountersImageBlockView.INSTANCE.createPreCreationBgImageDrawable(ugcCountersImagesPreCreationConfig) : null;
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        this.imageBlockClickAction = new UgcCountersLlBinder$imageBlockClickAction$1(playerPreloader, this);
    }

    private final void bindBlocks(UgcCountersVO item) {
        if (this.isBlocksInitialized) {
            Long l11 = this.lastItemId;
            long id2 = item.getId();
            if (l11 != null && l11.longValue() == id2) {
                return;
            }
        }
        this.containerView.removeAllViews();
        int i11 = 0;
        for (Object obj : item.getItems()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            UgcCountersVO.Item item2 = (UgcCountersVO.Item) obj;
            UgcCountersVO.Block block = item2.getBlock();
            int dp_8 = i11 > 0 ? Dimens.INSTANCE.getDP_8() : 0;
            if (block instanceof UgcCountersVO.Block.Single) {
                UgcCountersVO.Block.Single single = (UgcCountersVO.Block.Single) block;
                UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock$default(this, createSingleBlockBinding(dp_8), single, 0.0f, 0.0f, single.getAction() != null ? new a(2, this, (UgcCountersVO.Block.Single) block) : null, 12, null);
            } else if (block instanceof UgcCountersVO.Block.Double) {
                ItemUgcDoubleBlockBinding createDoubleBlockBinding = createDoubleBlockBinding(dp_8);
                UgcCountersVO.Block.Double r14 = (UgcCountersVO.Block.Double) block;
                UgcCountersVO.Block.Single firstBlock = r14.getFirstBlock();
                ItemUgcSingleBlockBinding ugcDoubleBlockFirstInclude = createDoubleBlockBinding.ugcDoubleBlockFirstInclude;
                Intrinsics.checkNotNullExpressionValue(ugcDoubleBlockFirstInclude, "ugcDoubleBlockFirstInclude");
                UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock$default(this, ugcDoubleBlockFirstInclude, firstBlock, 0.0f, 0.0f, firstBlock.getAction() != null ? new ViewOnClickListenerC2453a(4, this, firstBlock) : null, 4, null);
                UgcCountersVO.Block.Single secondBlock = r14.getSecondBlock();
                ItemUgcSingleBlockBinding ugcDoubleBlockSecondInclude = createDoubleBlockBinding.ugcDoubleBlockSecondInclude;
                Intrinsics.checkNotNullExpressionValue(ugcDoubleBlockSecondInclude, "ugcDoubleBlockSecondInclude");
                UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock$default(this, ugcDoubleBlockSecondInclude, secondBlock, 0.0f, 0.0f, secondBlock.getAction() != null ? new c(2, this, secondBlock) : null, 8, null);
                View view = createDoubleBlockBinding.ugcDoubleBlockSeparatorV;
                Context context = this.containerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                view.setBackgroundColor(ContextExtKt.parseColor(context, item2.getWidgetBackgroundColor()));
            } else if (block instanceof UgcCountersVO.Block.Expanding) {
                UgcCountersVO.Block.Expanding expanding = (UgcCountersVO.Block.Expanding) block;
                createExpandingBlockView(dp_8).bind(expanding, expanding.getAction() != null ? new ViewOnClickListenerC3676a(1, this, (UgcCountersVO.Block.Expanding) block) : null);
            } else {
                if (!(block instanceof UgcCountersVO.Block.Images)) {
                    throw new o();
                }
                createImageBlockView(dp_8).bind((UgcCountersVO.Block.Images) block, item2.getWidgetBackgroundColor(), new UgcCountersLlBinder$bindBlocks$1$5(this));
            }
            i11 = i12;
        }
        this.isBlocksInitialized = true;
        this.lastItemId = Long.valueOf(item.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindBlocks$lambda$9$lambda$2$lambda$1(UgcCountersLlBinder ugcCountersLlBinder, UgcCountersVO.Block block, View view) {
        ugcCountersLlBinder.actionHandler.invoke(((UgcCountersVO.Block.Single) block).getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindBlocks$lambda$9$lambda$4$lambda$3(UgcCountersLlBinder ugcCountersLlBinder, UgcCountersVO.Block.Single single, View view) {
        ugcCountersLlBinder.actionHandler.invoke(single.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindBlocks$lambda$9$lambda$6$lambda$5(UgcCountersLlBinder ugcCountersLlBinder, UgcCountersVO.Block.Single single, View view) {
        ugcCountersLlBinder.actionHandler.invoke(single.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindBlocks$lambda$9$lambda$8$lambda$7(UgcCountersLlBinder ugcCountersLlBinder, UgcCountersVO.Block block, View view) {
        ugcCountersLlBinder.actionHandler.invoke(((UgcCountersVO.Block.Expanding) block).getAction());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ItemUgcDoubleBlockBinding createDoubleBlockBinding(int leftMargin) {
        ItemUgcDoubleBlockBinding createItemUgcDoubleBlockBinding = UgcCountersDoubleBlockItemViewHolder.INSTANCE.createItemUgcDoubleBlockBinding(this.containerView);
        LinearLayout constraintLayout = createItemUgcDoubleBlockBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = leftMargin;
            if (i11 == leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            constraintLayout.setLayoutParams(marginLayoutParams);
        }
        this.containerView.addView(createItemUgcDoubleBlockBinding.getConstraintLayout());
        return createItemUgcDoubleBlockBinding;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final UgcCountersExpandingBlockView createExpandingBlockView(int leftMargin) {
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UgcCountersExpandingBlockView ugcCountersExpandingBlockView = new UgcCountersExpandingBlockView(context);
        ViewGroup.LayoutParams layoutParams = ugcCountersExpandingBlockView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = leftMargin;
            if (i11 == leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = ugcCountersExpandingBlockView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = ugcCountersExpandingBlockView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = ugcCountersExpandingBlockView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            ugcCountersExpandingBlockView.setLayoutParams(marginLayoutParams);
        }
        this.containerView.addView(ugcCountersExpandingBlockView);
        return ugcCountersExpandingBlockView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 != (r3 != null ? r3.bottomMargin : 0)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final UgcCountersImageBlockView createImageBlockView(int leftMargin) {
        Context context = this.containerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UgcCountersImageBlockView ugcCountersImageBlockView = new UgcCountersImageBlockView(context, this.imageBlockClickAction, this.imagesPreCreationConfig, this.preCreationBgImageDrawable);
        ViewGroup.LayoutParams layoutParams = ugcCountersImageBlockView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = leftMargin;
            if (i11 == leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = ugcCountersImageBlockView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = ugcCountersImageBlockView.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = ugcCountersImageBlockView.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            ugcCountersImageBlockView.setLayoutParams(marginLayoutParams);
        }
        this.containerView.addView(ugcCountersImageBlockView);
        return ugcCountersImageBlockView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r7 != (r4 != null ? r4.bottomMargin : 0)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ItemUgcSingleBlockBinding createSingleBlockBinding(int leftMargin) {
        ItemUgcSingleBlockBinding createItemUgcSingleBlockBinding = UgcCountersSingleBlockItemViewHolder.INSTANCE.createItemUgcSingleBlockBinding(this.containerView);
        ConstraintLayout constraintLayout = createItemUgcSingleBlockBinding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.leftMargin = leftMargin;
            if (i11 == leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = constraintLayout.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = constraintLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            constraintLayout.setLayoutParams(marginLayoutParams);
        }
        this.containerView.addView(createItemUgcSingleBlockBinding.getConstraintLayout());
        return createItemUgcSingleBlockBinding;
    }

    private final void initOnboardingDelegate(OnBoardingDTO onboarding) {
        String onboardingKey = onboarding.getOnboardingKey();
        if (onboardingKey == null) {
            onboardingKey = "rpProduct.ugcCounters_onboarding";
        }
        OnBoardingDelegateImpl onBoardingDelegateImpl = new OnBoardingDelegateImpl(onboardingKey, this.refs, getViewHolderOwner().itemView, onboarding, getViewHolderOwner(), this.onboardingViewModel, null, 0.0f, 192, null);
        onBoardingDelegateImpl.setOnShownListener(new UgcCountersLlBinder$initOnboardingDelegate$1$1(this));
        this.onboardingDelegate = onBoardingDelegateImpl;
    }

    private final void setBackgroundColor(String color) {
        if (Intrinsics.d(this.defaultBackgroundColor, color)) {
            return;
        }
        LinearLayout linearLayout = this.containerView;
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        linearLayout.setBackgroundColor(ContextExtKt.parseColor(context, color));
        this.defaultBackgroundColor = color;
    }

    private final void setupOnboarding(UgcCountersVO itemVO) {
        String tag;
        Pair<OnBoardingDTO, Integer> firstNonShownOnboarding;
        UgcCountersOnboardingViewModel ugcCountersOnboardingViewModel = this.onboardingViewModel;
        List<UgcCountersVO.Item> items = itemVO.getItems();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            OnBoardingDTO onboarding = ((UgcCountersVO.Item) obj).getBlock().getOnboarding();
            Pair<OnBoardingDTO, Integer> pair = onboarding != null ? new Pair<>(onboarding, Integer.valueOf(i11)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
            i11 = i12;
        }
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (tag = c11.getTag()) == null || (firstNonShownOnboarding = ugcCountersOnboardingViewModel.getFirstNonShownOnboarding(arrayList, tag, "rpProduct.ugcCounters_onboarding")) == null) {
            return;
        }
        OnBoardingDTO a11 = firstNonShownOnboarding.a();
        this.onboardingBlockIndex = firstNonShownOnboarding.b().intValue();
        if (this.onboardingDelegate == null) {
            initOnboardingDelegate(a11);
        }
        LinearLayout linearLayout = this.containerView;
        if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
            linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder$setupOnboarding$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    UgcCountersLlBinder.this.showOnboarding();
                }
            });
        } else {
            showOnboarding();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding() {
        List<UgcCountersVO.Item> items;
        UgcCountersVO.Item item;
        LinearLayout linearLayout = this.containerView;
        View childAt = linearLayout.getChildAt(this.onboardingBlockIndex);
        if (childAt == null) {
            return;
        }
        UgcCountersVO boundData = getViewHolderOwner().getBoundData();
        UgcCountersVO.Block block = (boundData == null || (items = boundData.getItems()) == null || (item = (UgcCountersVO.Item) C7714v.Q(this.onboardingBlockIndex, items)) == null) ? null : item.getBlock();
        OnBoardingDelegate onBoardingDelegate = this.onboardingDelegate;
        if (onBoardingDelegate != null) {
            onBoardingDelegate.bind(getViewHolderOwner(), new OnBoardingCutConfig(Integer.valueOf(childAt.getLeft()), null, Integer.valueOf(linearLayout.getWidth() - childAt.getRight()), null, null, null, null, false, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, null), new UgcCountersLlBinder$showOnboarding$1$1(block, this));
        }
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(UgcCountersVO ugcCountersVO, d dVar, Object obj, Function0 function0) {
        bind2(ugcCountersVO, dVar, obj, (Function0<Unit>) function0);
    }

    @Override // ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersSingleBlockItemBinder
    public void bindSingleBlock(@NotNull ItemUgcSingleBlockBinding itemUgcSingleBlockBinding, @NotNull UgcCountersVO.Block.Single single, float f7, float f11, View.OnClickListener onClickListener) {
        UgcCountersSingleBlockItemBinder.DefaultImpls.bindSingleBlock(this, itemUgcSingleBlockBinding, single, f7, f11, onClickListener);
    }

    @NotNull
    public k<UgcCountersVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        this.widgetImagePlaceholderAdapter.cacheViewIfNeeded(this.containerView, "UgcCountersWidget", (String) pair.b(), info, (String) pair.a(), new UgcCountersLlBinder$onVisibleAreaChanged$1(this));
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull UgcCountersVO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((UgcCountersLlBinder) item, info, payload, onFinish);
        this.isImagesUploaded = false;
        setBackgroundColor(item.getBackgroundColor());
        bindBlocks(item);
        if (!this.isImagesUploaded) {
            this.onImageLoadSuccessful = onFinish;
        } else if (onFinish != null) {
            onFinish.invoke();
        }
        setupOnboarding(item);
    }
}

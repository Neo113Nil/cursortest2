package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import Ae.C2399j;
import Ae.C2408n0;
import B90.I;
import BM.a;
import Ci.C2779a;
import Ci.b;
import Ci.g;
import Hy.RunnableC3170a;
import Ql.c;
import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import a00.C4908c;
import a00.C4911f;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Handler;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.C5316f0;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.domain.gallery.di.GalleryLauncherComponentKt;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.MediaPickerButtonVisibilityStateKey;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.MediaPickerVisibilityStateKey;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ViewIntent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentViewMapper;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.SoftInputChangeDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002_b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001d\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\u0017J\u0019\u0010#\u001a\u00020\u00132\b\b\u0002\u0010\"\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0011\u0010(\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0013H\u0002¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010+\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010\u0017J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00132\u0006\u00101\u001a\u00020%H\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00109R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00109R\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00109R\u0018\u0010H\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010M\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001b\u0010V\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010Q\u001a\u0004\bV\u00100R \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00130W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010<R\u0014\u0010`\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\r0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\r0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010gR4\u0010l\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020%\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020j\u0018\u00010i0Jj\u0002`k0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010g¨\u0006m"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "formViewModel", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "uploadViewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "isSelect", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;LWZ/l;Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;Lru/ozon/app/android/composer/ComposerReferences;Z)V", "Landroidx/lifecycle/J;", "lifecycle", "", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetach", "()V", "item", "Ll20/d;", "info", "", "payload", "bind", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Ll20/d;Ljava/lang/Object;)V", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Ll20/d;)V", "initMediaObservers", "removeMediaObservers", "withReScroll", "scrollToInput", "(Z)V", "", "inputBottomAndKeyboardDistance", "()I", "cursorLineBottomOnScreen", "()Ljava/lang/Integer;", "initKeyboardListener", "removeKeyboardListener", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "isKeyboardVisible", "()Z", "itemsCountLeft", "openMediaPicker", "(I)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/presentation/ReviewFormViewModel;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/UploadingAttachmentsViewModel;", "LWZ/l;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Z", "Ljava/lang/Runnable;", "scrollToInputRunnable", "Ljava/lang/Runnable;", "scrolledToInput", "Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "keyboardWithButtonY", "I", "bottomContainerHeight", "composerBottomPadding", "Ljava/lang/Integer;", "lastKeyboardVisibleState", "shouldRestoreKeyboard", "lastFocusedInputView", "Landroid/view/View;", "Lkotlin/Pair;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$HintVO;", "", "userVisibleHint", "Lkotlin/Pair;", "Landroid/os/Handler;", "handler$delegate", "LSc/j;", "getHandler", "()Landroid/os/Handler;", "handler", "isFooterSticky$delegate", "isFooterSticky", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "restoreKeyboard", "ru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVH$lifecycleObserver$1", "lifecycleObserver", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVH$lifecycleObserver$1;", "ru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVH$scrollListener$1", "scrollListener", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVH$scrollListener$1;", "Landroidx/lifecycle/W;", "hasMediaItemsObserver", "Landroidx/lifecycle/W;", "isMediaLimitReachedObserver", "Lkotlin/reflect/d;", "Lru/ozon/app/android/mediaupload/attachments/AttachmentVO;", "Lru/ozon/app/android/pdp/ui/configurators/ugc/reviewForm/IntToAttachment;", "openMediaPickerObserver", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class ReviewFormCommentVH extends k<ReviewFormCommentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private int bottomContainerHeight;
    private Integer composerBottomPadding;
    private RecyclerView composerRecyclerView;

    @NotNull
    private final ReviewFormCommentView containerView;

    @NotNull
    private final ReviewFormViewModel formViewModel;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handler;

    @NotNull
    private final W<Boolean> hasMediaItemsObserver;

    @NotNull
    private final D insetsListener;

    /* renamed from: isFooterSticky$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isFooterSticky;

    @NotNull
    private final W<Boolean> isMediaLimitReachedObserver;
    private final boolean isSelect;
    private int keyboardWithButtonY;
    private View lastFocusedInputView;
    private boolean lastKeyboardVisibleState;

    @NotNull
    private final ReviewFormCommentVH$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final W<Pair<Integer, d<? extends AttachmentVO>>> openMediaPickerObserver;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final Runnable restoreKeyboard;

    @NotNull
    private final ReviewFormCommentVH$scrollListener$1 scrollListener;
    private Runnable scrollToInputRunnable;
    private boolean scrolledToInput;
    private boolean shouldRestoreKeyboard;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final UploadingAttachmentsViewModel uploadViewModel;
    private Pair<ReviewFormCommentVO.HintVO, String> userVisibleHint;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "text", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
        AnonymousClass1() {
            super(4);
        }

        @Override // fd.InterfaceC6512o
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
            invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
            return Unit.f71690a;
        }

        public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
            t hintEvent;
            ReviewFormCommentVO boundData = ReviewFormCommentVH.this.getBoundData();
            if (boundData != null) {
                ReviewFormCommentVH reviewFormCommentVH = ReviewFormCommentVH.this;
                boundData.setValue(String.valueOf(charSequence));
                reviewFormCommentVH.containerView.changeMinLines(charSequence != null ? charSequence.length() : 0);
                Pair<ReviewFormCommentVO.HintVO, String> updateHints = reviewFormCommentVH.containerView.updateHints(boundData.getHints(), charSequence);
                if (updateHints != null && !updateHints.equals(reviewFormCommentVH.userVisibleHint) && (hintEvent = updateHints.e().getHintEvent()) != null) {
                    TokenizedAnalyticsExtKt.processViewEvents(reviewFormCommentVH.tokenizedAnalytics, hintEvent);
                }
                reviewFormCommentVH.userVisibleHint = updateHints;
                ReviewFormViewModel reviewFormViewModel = reviewFormCommentVH.formViewModel;
                String uploadKey = boundData.getUploadKey();
                String valueOf = String.valueOf(charSequence);
                Pair pair = reviewFormCommentVH.userVisibleHint;
                reviewFormViewModel.onViewIntent(new ViewIntent.CommentUpdated(uploadKey, valueOf, pair != null ? (String) pair.f() : null));
            }
            if (ReviewFormCommentVH.this.containerView.getTextArea().getState() == TextAreaView.State.ACTIVE && ReviewFormCommentVH.this.lastKeyboardVisibleState) {
                ReviewFormCommentVH.scrollToInput$default(ReviewFormCommentVH.this, false, 1, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.I, ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH$lifecycleObserver$1] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH$scrollListener$1] */
    public ReviewFormCommentVH(@NotNull ReviewFormViewModel formViewModel, @NotNull UploadingAttachmentsViewModel uploadViewModel, @NotNull l tokenizedAnalytics, @NotNull ReviewFormCommentView containerView, @NotNull ComposerReferences refs, boolean z11) {
        super(containerView);
        Intrinsics.checkNotNullParameter(formViewModel, "formViewModel");
        Intrinsics.checkNotNullParameter(uploadViewModel, "uploadViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.formViewModel = formViewModel;
        this.uploadViewModel = uploadViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.containerView = containerView;
        this.refs = refs;
        this.isSelect = z11;
        this.handler = Sc.k.b(ReviewFormCommentVH$handler$2.INSTANCE);
        this.isFooterSticky = LazyUtilsKt.unsafeLazy(new ReviewFormCommentVH$isFooterSticky$2(this));
        this.actionHandler = new ActionHandler.Builder(refs, this).onClick(new ReviewFormCommentVH$actionHandler$1(this)).buildHandler();
        this.insetsListener = new I(this, 3);
        this.restoreKeyboard = new RunnableC3170a(this, 9);
        ?? r22 = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                ComposerReferences composerReferences;
                View view;
                Runnable runnable;
                Intrinsics.checkNotNullParameter(owner, "owner");
                composerReferences = ReviewFormCommentVH.this.refs;
                composerReferences.getContainer().g().getLifecycle().e(this);
                view = ReviewFormCommentVH.this.lastFocusedInputView;
                if (view != null) {
                    runnable = ReviewFormCommentVH.this.restoreKeyboard;
                    view.removeCallbacks(runnable);
                }
                ReviewFormCommentVH.this.composerRecyclerView = null;
                ReviewFormCommentVH.this.lastFocusedInputView = null;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onPause(J owner) {
                View rootView;
                boolean isKeyboardVisible;
                Intrinsics.checkNotNullParameter(owner, "owner");
                rootView = ReviewFormCommentVH.this.getRootView();
                if (rootView == null) {
                    return;
                }
                View findFocus = rootView.findFocus();
                ReviewFormCommentVH reviewFormCommentVH = ReviewFormCommentVH.this;
                isKeyboardVisible = reviewFormCommentVH.isKeyboardVisible();
                reviewFormCommentVH.shouldRestoreKeyboard = isKeyboardVisible && findFocus != null;
                ReviewFormCommentVH.this.lastFocusedInputView = findFocus;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
            
                r4 = r3.this$0.getRootView();
             */
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onResume(J owner) {
                ComposerReferences composerReferences;
                boolean z12;
                View rootView;
                Runnable runnable;
                View view;
                Intrinsics.checkNotNullParameter(owner, "owner");
                ReviewFormCommentVH reviewFormCommentVH = ReviewFormCommentVH.this;
                composerReferences = reviewFormCommentVH.refs;
                ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
                reviewFormCommentVH.composerRecyclerView = (c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view);
                z12 = ReviewFormCommentVH.this.shouldRestoreKeyboard;
                if (!z12 || rootView == null) {
                    return;
                }
                runnable = ReviewFormCommentVH.this.restoreKeyboard;
                rootView.postDelayed(runnable, 300L);
            }
        };
        this.lifecycleObserver = r22;
        this.scrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVH$scrollListener$1
            private boolean retried;

            @Override // androidx.recyclerview.widget.RecyclerView.t
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                int inputBottomAndKeyboardDistance;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (newState == 0) {
                    if (ReviewFormCommentVH.this.lastKeyboardVisibleState) {
                        inputBottomAndKeyboardDistance = ReviewFormCommentVH.this.inputBottomAndKeyboardDistance();
                        if (inputBottomAndKeyboardDistance > Dimens.INSTANCE.getDP_8() && !this.retried) {
                            this.retried = true;
                            ReviewFormCommentVH.this.scrollToInput(false);
                            return;
                        }
                    }
                    this.retried = false;
                    recyclerView.removeOnScrollListener(this);
                }
            }
        };
        this.hasMediaItemsObserver = new W() { // from class: sW.a
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                ReviewFormCommentVH.hasMediaItemsObserver$lambda$2(ReviewFormCommentVH.this, ((Boolean) obj).booleanValue());
            }
        };
        this.isMediaLimitReachedObserver = new W() { // from class: sW.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                ReviewFormCommentVH.isMediaLimitReachedObserver$lambda$3(ReviewFormCommentVH.this, ((Boolean) obj).booleanValue());
            }
        };
        this.openMediaPickerObserver = new a(this, 2);
        refs.getContainer().g().getLifecycle().a(r22);
        containerView.doOnTextChanged(new AnonymousClass1());
        OzonTextInput ozonTextInput = (OzonTextInput) kotlin.sequences.l.l(kotlin.sequences.l.h(C5316f0.b(containerView.getTextArea()), ReviewFormCommentVH$special$$inlined$filterIsInstance$1.INSTANCE));
        if (ozonTextInput != null) {
            ozonTextInput.setOnTouchListener(new View.OnTouchListener() { // from class: sW.c
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$6$lambda$5;
                    lambda$6$lambda$5 = ReviewFormCommentVH.lambda$6$lambda$5(ReviewFormCommentVH.this, view, motionEvent);
                    return lambda$6$lambda$5;
                }
            });
        }
    }

    private final Integer cursorLineBottomOnScreen() {
        Layout layout;
        OzonTextInput inputView = this.containerView.getInputView();
        if (inputView == null || (layout = inputView.getLayout()) == null) {
            return null;
        }
        int selectionStart = inputView.getSelectionStart();
        if (selectionStart < 0) {
            selectionStart = 0;
        }
        int totalPaddingTop = inputView.getTotalPaddingTop() + (layout.getLineBottom(layout.getLineForOffset(selectionStart)) - inputView.getScrollY());
        int[] iArr = new int[2];
        inputView.getLocationOnScreen(iArr);
        return Integer.valueOf(iArr[1] + totalPaddingTop);
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getRootView() {
        Dialog dialog;
        Window window;
        View decorView;
        C4911f container = this.refs.getContainer();
        ComponentCallbacksC5392m c11 = container.c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        BottomSheetComposerFragment bottomSheetComposerFragment = parentFragment instanceof BottomSheetComposerFragment ? (BottomSheetComposerFragment) parentFragment : null;
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            return decorView;
        }
        r a11 = container.a();
        if (a11 != null) {
            return ContextExtKt.getRootView(a11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hasMediaItemsObserver$lambda$2(ReviewFormCommentVH reviewFormCommentVH, boolean z11) {
        reviewFormCommentVH.refs.getController().update(new MediaPickerVisibilityStateKey(z11));
    }

    private final void initKeyboardListener() {
        View rootView = getRootView();
        if (rootView != null) {
            Y.J(rootView, this.insetsListener);
        }
    }

    private final void initMediaObservers() {
        C4908c g10 = this.refs.getContainer().g();
        this.uploadViewModel.getHasItems().observe(g10, this.hasMediaItemsObserver);
        this.uploadViewModel.isMediaLimitReached().observe(g10, this.isMediaLimitReachedObserver);
        this.uploadViewModel.getOpenPickScreen().observe(g10, this.openMediaPickerObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int inputBottomAndKeyboardDistance() {
        int i11;
        Integer cursorLineBottomOnScreen = cursorLineBottomOnScreen();
        if (cursorLineBottomOnScreen != null) {
            i11 = cursorLineBottomOnScreen.intValue();
        } else {
            Rect rect = new Rect();
            this.containerView.getTextArea().getGlobalVisibleRect(rect);
            i11 = rect.bottom;
        }
        return (Dimens.INSTANCE.getDP_4() + i11) - this.keyboardWithButtonY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$0(ReviewFormCommentVH reviewFormCommentVH, View view, C5353y0 c5353y0) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        int i11 = c.a(view, "view", c5353y0, "insets", 8).f42129d;
        boolean p11 = c5353y0.p(8);
        if (reviewFormCommentVH.composerBottomPadding == null) {
            RecyclerView recyclerView3 = reviewFormCommentVH.composerRecyclerView;
            reviewFormCommentVH.composerBottomPadding = recyclerView3 != null ? Integer.valueOf(recyclerView3.getPaddingBottom()) : null;
        }
        if (p11 != reviewFormCommentVH.lastKeyboardVisibleState) {
            reviewFormCommentVH.lastKeyboardVisibleState = p11;
            int i12 = 0;
            if (p11) {
                reviewFormCommentVH.bottomContainerHeight = ComposerViewExtensionKt.composerBottomContainer(view).getHeight();
                reviewFormCommentVH.keyboardWithButtonY = (view.getHeight() - i11) - (reviewFormCommentVH.isFooterSticky() ? reviewFormCommentVH.bottomContainerHeight : 0);
                if (reviewFormCommentVH.inputBottomAndKeyboardDistance() > 0 && (recyclerView2 = reviewFormCommentVH.composerRecyclerView) != null && recyclerView2.getScrollState() == 0 && !reviewFormCommentVH.scrolledToInput) {
                    reviewFormCommentVH.scrolledToInput = true;
                    scrollToInput$default(reviewFormCommentVH, false, 1, null);
                }
            } else {
                reviewFormCommentVH.scrolledToInput = false;
            }
            if (!reviewFormCommentVH.isFooterSticky() && (recyclerView = reviewFormCommentVH.composerRecyclerView) != null) {
                if (reviewFormCommentVH.lastKeyboardVisibleState) {
                    i12 = (i11 - BottomNavigationConfig.DEFAULT.getHeight()) - reviewFormCommentVH.bottomContainerHeight;
                } else {
                    Integer num = reviewFormCommentVH.composerBottomPadding;
                    if (num != null) {
                        i12 = num.intValue();
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i12);
            }
        }
        return Y.u(view, c5353y0);
    }

    private final boolean isFooterSticky() {
        return ((Boolean) this.isFooterSticky.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKeyboardVisible() {
        View rootView = getRootView();
        if (rootView == null) {
            return false;
        }
        C5353y0 n11 = Y.n(rootView);
        Boolean valueOf = n11 != null ? Boolean.valueOf(n11.p(8)) : null;
        if (valueOf != null) {
            return valueOf.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void isMediaLimitReachedObserver$lambda$3(ReviewFormCommentVH reviewFormCommentVH, boolean z11) {
        reviewFormCommentVH.refs.getController().update(new MediaPickerButtonVisibilityStateKey(!z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$6$lambda$5(ReviewFormCommentVH reviewFormCommentVH, View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (motionEvent.getAction() == 1 && reviewFormCommentVH.lastKeyboardVisibleState) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            view.performClick();
            scrollToInput$default(reviewFormCommentVH, false, 1, null);
        }
        return false;
    }

    private final void openMediaPicker(int itemsCountLeft) {
        ReviewFormCommentVH$openMediaPicker$cameraClickHandler$1 reviewFormCommentVH$openMediaPicker$cameraClickHandler$1 = ReviewFormCommentVH$openMediaPicker$cameraClickHandler$1.INSTANCE;
        Ci.k b11 = C2779a.b();
        Ci.k a11 = Ci.k.a(b11, this.isSelect ? R.style.OzonGallerySelectTheme : R.style.OzonGalleryTheme, null, b.a(b11.d(), g.a(b11.d().f(), reviewFormCommentVH$openMediaPicker$cameraClickHandler$1, new ReviewFormCommentVH$openMediaPicker$config$1$1(reviewFormCommentVH$openMediaPicker$cameraClickHandler$1), Ci.l.RESULT_API_ONLY, 19), null, itemsCountLeft, 1918), null, null, 118);
        Bi.k galleryLauncher = GalleryLauncherComponentKt.getGalleryLauncher(this.refs.getComposerWidgetComponentStorage());
        if (galleryLauncher != null) {
            galleryLauncher.b(a11, new ReviewFormCommentVH$openMediaPicker$1(this.uploadViewModel));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openMediaPickerObserver$lambda$4(ReviewFormCommentVH reviewFormCommentVH, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        reviewFormCommentVH.openMediaPicker(((Number) pair.a()).intValue());
    }

    private final void removeKeyboardListener() {
        View rootView = getRootView();
        if (rootView != null) {
            Y.J(rootView, null);
        }
    }

    private final void removeMediaObservers() {
        this.uploadViewModel.getHasItems().removeObserver(this.hasMediaItemsObserver);
        this.uploadViewModel.isMediaLimitReached().removeObserver(this.isMediaLimitReachedObserver);
        this.uploadViewModel.getOpenPickScreen().removeObserver(this.openMediaPickerObserver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restoreKeyboard$lambda$1(ReviewFormCommentVH reviewFormCommentVH) {
        View view = reviewFormCommentVH.lastFocusedInputView;
        if (view != null) {
            ViewExtKt.showKeyboard(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToInput(final boolean withReScroll) {
        Runnable runnable = this.scrollToInputRunnable;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: sW.d
            @Override // java.lang.Runnable
            public final void run() {
                ReviewFormCommentVH.scrollToInput$lambda$10(ReviewFormCommentVH.this, withReScroll);
            }
        };
        getHandler().postDelayed(runnable2, 300L);
        this.scrollToInputRunnable = runnable2;
    }

    static /* synthetic */ void scrollToInput$default(ReviewFormCommentVH reviewFormCommentVH, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        reviewFormCommentVH.scrollToInput(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scrollToInput$lambda$10(ReviewFormCommentVH reviewFormCommentVH, boolean z11) {
        int inputBottomAndKeyboardDistance;
        RecyclerView recyclerView = reviewFormCommentVH.composerRecyclerView;
        if (recyclerView == null || (inputBottomAndKeyboardDistance = reviewFormCommentVH.inputBottomAndKeyboardDistance()) <= Dimens.INSTANCE.getDP_8() || recyclerView.getScrollState() != 0 || !recyclerView.canScrollVertically(1)) {
            return;
        }
        ReviewFormCommentVH$scrollListener$1 reviewFormCommentVH$scrollListener$1 = reviewFormCommentVH.scrollListener;
        if (z11) {
            recyclerView.addOnScrollListener(reviewFormCommentVH$scrollListener$1);
        } else {
            recyclerView.removeOnScrollListener(reviewFormCommentVH$scrollListener$1);
        }
        recyclerView.smoothScrollBy(0, inputBottomAndKeyboardDistance);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        initKeyboardListener();
        C2399j.C(new C2408n0(this.refs.getController().getEventsFlow(), new ReviewFormCommentVH$onAttachViewModel$1(this, null)), K.a(this));
        ReviewFormCommentVO boundData = getBoundData();
        if (boundData == null || !boundData.getIsModal()) {
            return;
        }
        initMediaObservers();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        Runnable runnable = this.scrollToInputRunnable;
        if (runnable != null) {
            getHandler().removeCallbacks(runnable);
        }
        removeKeyboardListener();
        removeMediaObservers();
        String inputText = this.containerView.getTextArea().getInputText();
        if (inputText != null) {
            this.refs.getController().update(new CommentUpdateKey(inputText));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewFormCommentVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof ReviewFormCommentViewMapper.ExpandUpdatedPayload) && !(payload instanceof ReviewFormCommentViewMapper.PickerButtonVisibilityPayload)) {
            bind(item, info);
        } else {
            this.containerView.pickerButtonShowOrGone(item);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReviewFormCommentVO item, @NotNull l20.d info) {
        ComponentCallbacksC5392m c11;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.setTextArea(item, new ReviewFormCommentVH$bind$1(item, this));
        this.containerView.bindMediaPickerButton(item, this.actionHandler);
        if (item.getIsModal()) {
            initMediaObservers();
        }
        SoftInputChangeDelegate softInputChangeDelegate = new SoftInputChangeDelegate(isFooterSticky() ? 16 : 32);
        r a11 = this.refs.getContainer().a();
        if (a11 == null || (c11 = this.refs.getContainer().c()) == null) {
            return;
        }
        softInputChangeDelegate.register(a11, c11);
    }
}

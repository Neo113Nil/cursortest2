package ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons;

import B90.T;
import Vg.d;
import WB.b;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.InterfaceC5431s;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;
import ru.ozon.app.android.returns.cancels.cancelReasons.data.SelectCancelReasonDTO;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.common.SelectCancelReasonCommentProvider;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.extensions.AtomActionExtKt;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.models.SelectCancelReasonVO;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;
import v10.C10183a;
import zG.ViewOnTouchListenerC11006a;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u000fH\u0017¢\u0006\u0004\b#\u0010\u0013J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u000f0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/reasons/SelectCancelReasonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$SelectCancelReasonsVO;", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/reasons/SelectCancelReasonView;", "cancelReasonView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;", "commentProvider", "<init>", "(Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/reasons/SelectCancelReasonView;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/common/SelectCancelReasonCommentProvider;)V", "item", "", "bindInput", "(Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$SelectCancelReasonsVO;)V", "sendCommentAction", "()V", "Landroid/view/ViewGroup;", "getComposerStickyContainer", "()Landroid/view/ViewGroup;", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "", "getComment", "()Ljava/lang/String;", "", "isChangeComment", "()Z", "isKeyboardVisible", "initTextWatcher", "onAttach", "onDetach", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/models/SelectCancelReasonVO$SelectCancelReasonsVO;Ll20/d;)V", "Lru/ozon/app/android/returns/cancels/cancelReasons/presentation/reasons/SelectCancelReasonView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "isSkipUpdateAfterKeyboardHide", "Z", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "bottomNavigationStateController", "Lru/ozon/app/android/navigation/newrouter/ui/BottomNavigationStateController;", "Landroid/view/View$OnLayoutChangeListener;", "textAreaOnLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Landroidx/core/view/D;", "insetsListener", "Landroidx/core/view/D;", "Landroid/view/View$OnTouchListener;", "touchListener", "Landroid/view/View$OnTouchListener;", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonViewHolder extends k<SelectCancelReasonVO.SelectCancelReasonsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;
    private final BottomNavigationStateController bottomNavigationStateController;

    @NotNull
    private final SelectCancelReasonView cancelReasonView;

    @NotNull
    private final D insetsListener;
    private boolean isSkipUpdateAfterKeyboardHide;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final View.OnLayoutChangeListener textAreaOnLayoutChangeListener;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons.SelectCancelReasonViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function0<String> {
        AnonymousClass1(Object obj) {
            super(0, obj, SelectCancelReasonViewHolder.class, "getComment", "getComment()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return ((SelectCancelReasonViewHolder) this.receiver).getComment();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCancelReasonViewHolder(@NotNull SelectCancelReasonView cancelReasonView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs, @NotNull SelectCancelReasonCommentProvider commentProvider) {
        super(cancelReasonView);
        Intrinsics.checkNotNullParameter(cancelReasonView, "cancelReasonView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(commentProvider, "commentProvider");
        this.cancelReasonView = cancelReasonView;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new SelectCancelReasonViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(new SelectCancelReasonViewHolder$atomsAdapter$1$1(this));
        this.atomsAdapter = atomsAdapter;
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        BottomNavigationStateController bottomNavigationStateController = null;
        if (c11 != null) {
            BottomNavigationStateController bottomNavigationStateController2 = null;
            while (true) {
                if (bottomNavigationStateController2 != null) {
                    bottomNavigationStateController = bottomNavigationStateController2;
                    break;
                }
                if ((c11 != null ? c11.getParentFragment() : null) == null) {
                    break;
                }
                InterfaceC5431s parentFragment = c11.getParentFragment();
                if (!(parentFragment instanceof BottomNavigationStateController)) {
                    parentFragment = null;
                }
                bottomNavigationStateController2 = (BottomNavigationStateController) parentFragment;
                c11 = c11.getParentFragment();
            }
        }
        this.bottomNavigationStateController = bottomNavigationStateController;
        this.textAreaOnLayoutChangeListener = new b(this, 1);
        this.insetsListener = new T(this);
        this.touchListener = new ViewOnTouchListenerC11006a();
        this.cancelReasonView.getVerticalAtomsLayout().setAdapter(this.atomsAdapter);
        commentProvider.setGetComment(new AnonymousClass1(this));
        initTextWatcher();
    }

    private final void bindInput(SelectCancelReasonVO.SelectCancelReasonsVO item) {
        SelectCancelReasonView selectCancelReasonView = this.cancelReasonView;
        SelectCancelReasonDTO.InputDTO input = item.getInput();
        selectCancelReasonView.getTextAreaView().setVisibility(input != null ? 0 : 8);
        if (input == null) {
            return;
        }
        TextAreaView textAreaView = selectCancelReasonView.getTextAreaView();
        if (!Intrinsics.d(input.getValue(), textAreaView.getInputText())) {
            textAreaView.setInputText(input.getValue());
        }
        if (!Intrinsics.d(input.getPlaceHolder(), textAreaView.getLabel())) {
            textAreaView.setLabel(input.getPlaceHolder());
        }
        if (input.getMaxCount() != null) {
            Integer maxCount = input.getMaxCount();
            int maxLength = textAreaView.getMaxLength();
            if (maxCount != null && maxCount.intValue() == maxLength) {
                return;
            }
            textAreaView.setMaxLength(input.getMaxCount().intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getComment() {
        String inputText = this.cancelReasonView.getTextAreaView().getInputText();
        if (inputText == null) {
            inputText = "";
        }
        String obj = h.z0(inputText).toString();
        if (isChangeComment()) {
            return obj;
        }
        return null;
    }

    private final RecyclerView getComposerRecyclerView() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return C10183a.i(view);
    }

    private final ViewGroup getComposerStickyContainer() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return C10183a.c(view);
    }

    private final void initTextWatcher() {
        TextAreaView.INSTANCE.doOnTextChanged(this.cancelReasonView.getTextAreaView(), new SelectCancelReasonViewHolder$initTextWatcher$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5353y0 insetsListener$lambda$3(SelectCancelReasonViewHolder selectCancelReasonViewHolder, View view, C5353y0 windowInsetsCompat) {
        View view2;
        RecyclerView j11;
        Iterable<View> children;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
        boolean p11 = windowInsetsCompat.p(8);
        ViewGroup composerStickyContainer = selectCancelReasonViewHolder.getComposerStickyContainer();
        if (composerStickyContainer != null && (children = ViewGroupExtKt.children(composerStickyContainer)) != null) {
            Iterator<View> it = children.iterator();
            while (it.hasNext()) {
                it.next().setVisibility(!p11 ? 0 : 8);
            }
        }
        if (p11) {
            BottomNavigationStateController bottomNavigationStateController = selectCancelReasonViewHolder.bottomNavigationStateController;
            if (bottomNavigationStateController != null) {
                bottomNavigationStateController.hideBottomNavigation();
            }
        } else {
            BottomNavigationStateController bottomNavigationStateController2 = selectCancelReasonViewHolder.bottomNavigationStateController;
            if (bottomNavigationStateController2 != null) {
                bottomNavigationStateController2.showBottomNavigation();
            }
        }
        if (!p11 && !selectCancelReasonViewHolder.isSkipUpdateAfterKeyboardHide) {
            selectCancelReasonViewHolder.sendCommentAction();
        }
        selectCancelReasonViewHolder.isSkipUpdateAfterKeyboardHide = false;
        if (p11) {
            ComponentCallbacksC5392m c11 = selectCancelReasonViewHolder.refs.getContainer().c();
            if (c11 != null && (view2 = c11.getView()) != null && (j11 = C10183a.j(view2)) != null) {
                j11.scrollBy(0, selectCancelReasonViewHolder.cancelReasonView.getHeight());
            }
            selectCancelReasonViewHolder.cancelReasonView.getTextAreaView().addOnLayoutChangeListener(selectCancelReasonViewHolder.textAreaOnLayoutChangeListener);
        } else {
            selectCancelReasonViewHolder.cancelReasonView.getTextAreaView().removeOnLayoutChangeListener(selectCancelReasonViewHolder.textAreaOnLayoutChangeListener);
        }
        return Y.u(view, windowInsetsCompat);
    }

    private final boolean isChangeComment() {
        SelectCancelReasonDTO.InputDTO input;
        SelectCancelReasonVO.SelectCancelReasonsVO boundData = getBoundData();
        String value = (boundData == null || (input = boundData.getInput()) == null) ? null : input.getValue();
        if (value == null) {
            value = "";
        }
        String obj = h.z0(value).toString();
        return !Intrinsics.d(obj, h.z0(this.cancelReasonView.getTextAreaView().getInputText() != null ? r2 : "").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isKeyboardVisible() {
        C5353y0 n11 = Y.n(this.cancelReasonView);
        if (n11 == null) {
            return false;
        }
        return n11.p(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendCommentAction() {
        SelectCancelReasonVO.SelectCancelReasonsVO boundData;
        SelectCancelReasonDTO.InputDTO input;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        AtomAction addState;
        if (!isChangeComment() || (boundData = getBoundData()) == null || (input = boundData.getInput()) == null || (common = input.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, input.getCommon().getTrackingInfo())) == null || (addState = AtomActionExtKt.addState(atomAction, boundData, getComment())) == null) {
            return;
        }
        this.actionHandler.invoke(addState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void textAreaOnLayoutChangeListener$lambda$1(SelectCancelReasonViewHolder selectCancelReasonViewHolder, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        View view2;
        RecyclerView j11;
        ComponentCallbacksC5392m c11 = selectCancelReasonViewHolder.refs.getContainer().c();
        if (c11 == null || (view2 = c11.getView()) == null || (j11 = C10183a.j(view2)) == null) {
            return;
        }
        j11.scrollBy(0, view.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$4(View view, MotionEvent motionEvent) {
        Intrinsics.f(view);
        KeyboardUtilsKt.hideKeyboard(view);
        return false;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    @SuppressLint({"ClickableViewAccessibility"})
    public void onAttach() {
        Window window;
        View decorView;
        super.onAttach();
        r a11 = this.refs.getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Y.J(decorView, this.insetsListener);
        }
        RecyclerView composerRecyclerView = getComposerRecyclerView();
        if (composerRecyclerView != null) {
            composerRecyclerView.setOnTouchListener(this.touchListener);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    @SuppressLint({"ClickableViewAccessibility"})
    public void onDetach() {
        Window window;
        View decorView;
        r a11 = this.refs.getContainer().a();
        if (a11 != null && (window = a11.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            Y.J(decorView, null);
        }
        RecyclerView composerRecyclerView = getComposerRecyclerView();
        if (composerRecyclerView != null) {
            composerRecyclerView.setOnTouchListener(null);
        }
        BottomNavigationStateController bottomNavigationStateController = this.bottomNavigationStateController;
        if (bottomNavigationStateController != null) {
            bottomNavigationStateController.showBottomNavigation();
        }
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectCancelReasonVO.SelectCancelReasonsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.atomsAdapter.bind(getContext(), item.getCancelReasons());
        bindInput(item);
        DSDisclaimerHolderKt.bindOrGone(this.cancelReasonView.getDisclaimerView(), item.getDisclaimer(), this.actionHandler);
    }
}

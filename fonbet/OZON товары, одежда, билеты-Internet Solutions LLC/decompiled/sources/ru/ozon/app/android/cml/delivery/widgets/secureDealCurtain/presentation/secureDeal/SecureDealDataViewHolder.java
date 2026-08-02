package ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal;

import Ae.C2399j;
import Ae.C2408n0;
import An.C2439a;
import El.C2971a;
import Go.d;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.annotation.SuppressLint;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.common.ext.OzonTextInputLayoutExtKt;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeVO;
import ru.ozon.app.android.cml.delivery.molecules.input.presentation.InputMoleculeView;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainAsyncUpdateUiState;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.SecureDealCurtainViewModel;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.SecureDealDataViewHolder;
import ru.ozon.app.android.cml.delivery.widgets.secureDealCurtain.presentation.secureDeal.view.SecureDealDataView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u0010J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J)\u0010)\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000eH\u0016¢\u0006\u0004\b+\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010/R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000e008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0004\u0018\u0001018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataView;", "view", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataView;LWZ/l;Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "initInput", "()V", "clearInput", "item", "updateComposerRecyclerTouchListener", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;)V", "Landroid/view/View$OnTouchListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setRecyclerViewTouchListener", "(Landroid/view/View$OnTouchListener;)V", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainAsyncUpdateUiState;", "uiState", "handleAsyncUpdateState", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainAsyncUpdateUiState;)V", "", "resolveInputValue", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;)Ljava/lang/String;", "onAttach", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/SecureDealDataVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/secureDeal/view/SecureDealDataView;", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/secureDealCurtain/presentation/SecureDealCurtainViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "cardActionHandler", "Lkotlin/jvm/functions/Function1;", "touchListener", "Landroid/view/View$OnTouchListener;", "", "areComposerRecyclerListenersSet", "Z", "getInputAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "inputAction", "Landroidx/recyclerview/widget/RecyclerView;", "getComposerRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "composerRecyclerView", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SecureDealDataViewHolder extends k<SecureDealDataVO> {
    private boolean areComposerRecyclerListenersSet;

    @NotNull
    private final Function1<AtomAction, Unit> cardActionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @SuppressLint({"ClickableViewAccessibility"})
    @NotNull
    private final View.OnTouchListener touchListener;

    @NotNull
    private final SecureDealDataView view;

    @NotNull
    private final SecureDealCurtainViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureDealDataViewHolder(@NotNull SecureDealDataView view, @NotNull l tokenizedAnalytics, @NotNull SecureDealCurtainViewModel viewModel, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.refs = refs;
        this.cardActionHandler = new ActionHandler.Builder(refs, this).onClick(new SecureDealDataViewHolder$cardActionHandler$1(this)).buildHandler();
        this.touchListener = new d(this, 1);
    }

    private final void clearInput() {
        OzonTextInputLayout mainView = this.view.getInputView().getInput().getMainView();
        mainView.setTextWatcher(null);
        OzonTextInputLayoutExtKt.getEditText(mainView).setOnFocusChangeListener(null);
        OzonTextInputLayoutExtKt.getEditText(mainView).setOnEditorActionListener(null);
    }

    private final RecyclerView getComposerRecyclerView() {
        View view;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null) {
            return null;
        }
        return ComposerViewExtensionKt.composerRecyclerView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction getInputAction() {
        InputMoleculeVO topBlockInput;
        CommonControlSettings common;
        AtomActionDTO action;
        SecureDealDataVO boundData = getBoundData();
        if (boundData == null || (topBlockInput = boundData.getTopBlockInput()) == null || (common = topBlockInput.getCommon()) == null || (action = common.getAction()) == null) {
            return null;
        }
        return AtomActionMapperKt.toAtomAction(action, null);
    }

    private final void handleAsyncUpdateState(SecureDealCurtainAsyncUpdateUiState uiState) {
        if (uiState != null) {
            if (uiState instanceof SecureDealCurtainAsyncUpdateUiState.Loading) {
                C2439a.b(0L, null, 3, this.refs.getController());
                return;
            }
            if (uiState instanceof SecureDealCurtainAsyncUpdateUiState.Loaded) {
                SecureDealCurtainAsyncUpdateUiState.Loaded loaded = (SecureDealCurtainAsyncUpdateUiState.Loaded) uiState;
                Map<String, String> trackingPayloads = loaded.getTrackingPayloads();
                if (trackingPayloads != null) {
                    this.tokenizedAnalytics.e(trackingPayloads);
                }
                this.refs.getController().update(loaded.getUpdate());
                return;
            }
            if (!(uiState instanceof SecureDealCurtainAsyncUpdateUiState.Error)) {
                throw new o();
            }
            this.refs.getController().hideLoader();
            ViewGroup b11 = C2971a.b(this.refs);
            if (b11 != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
            }
        }
    }

    private final void initInput() {
        final InputMoleculeView inputView = this.view.getInputView();
        inputView.setOnTextChanged(new SecureDealDataViewHolder$initInput$1$1(this));
        OzonTextInputLayoutExtKt.getEditText(inputView.getInput().getMainView()).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: sq.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean initInput$lambda$3$lambda$1;
                initInput$lambda$3$lambda$1 = SecureDealDataViewHolder.initInput$lambda$3$lambda$1(InputMoleculeView.this, textView, i11, keyEvent);
                return initInput$lambda$3$lambda$1;
            }
        });
        final View.OnFocusChangeListener onFocusChangeListener = OzonTextInputLayoutExtKt.getEditText(inputView.getInput().getMainView()).getOnFocusChangeListener();
        OzonTextInputLayoutExtKt.getEditText(inputView.getInput().getMainView()).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sq.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                SecureDealDataViewHolder.initInput$lambda$3$lambda$2(onFocusChangeListener, inputView, view, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initInput$lambda$3$lambda$1(InputMoleculeView inputMoleculeView, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return false;
        }
        inputMoleculeView.hideKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInput$lambda$3$lambda$2(View.OnFocusChangeListener onFocusChangeListener, InputMoleculeView inputMoleculeView, View view, boolean z11) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (z11) {
            return;
        }
        inputMoleculeView.hideKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$handleAsyncUpdateState(SecureDealDataViewHolder secureDealDataViewHolder, SecureDealCurtainAsyncUpdateUiState secureDealCurtainAsyncUpdateUiState, kotlin.coroutines.d dVar) {
        secureDealDataViewHolder.handleAsyncUpdateState(secureDealCurtainAsyncUpdateUiState);
        return Unit.f71690a;
    }

    private final String resolveInputValue(SecureDealDataVO item) {
        String str;
        String obj;
        InputMoleculeVO topBlockInput = item.getTopBlockInput();
        String value = topBlockInput != null ? topBlockInput.getValue() : null;
        String dealSum = this.viewModel.getDealSum();
        Editable text = OzonTextInputLayoutExtKt.getEditText(this.view.getInputView().getInput().getMainView()).getText();
        if (text == null || (obj = text.toString()) == null) {
            str = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            int length = obj.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = obj.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb2.append(charAt);
                }
            }
            str = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        }
        if (!Intrinsics.d(str, value)) {
            return value;
        }
        if (Intrinsics.d(str, dealSum)) {
            return null;
        }
        return dealSum;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setRecyclerViewTouchListener(View.OnTouchListener listener) {
        RecyclerView composerRecyclerView = getComposerRecyclerView();
        if (composerRecyclerView != null) {
            composerRecyclerView.setOnTouchListener(listener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean touchListener$lambda$0(SecureDealDataViewHolder secureDealDataViewHolder, View view, MotionEvent motionEvent) {
        secureDealDataViewHolder.view.getInputView().removeFocus();
        return false;
    }

    private final void updateComposerRecyclerTouchListener(SecureDealDataVO item) {
        if (item.getTopBlockInput() != null && !this.areComposerRecyclerListenersSet) {
            setRecyclerViewTouchListener(this.touchListener);
            this.areComposerRecyclerListenersSet = true;
        } else if (item.getTopBlockInput() == null) {
            setRecyclerViewTouchListener(null);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.view.setRecycledViewPool(this.refs.getComposerViewPoolProvider().getViewPool());
        initInput();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.uiStateFlow(), getLifecycle(), AbstractC5434v.b.CREATED), new SecureDealDataViewHolder$onAttach$1(this)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        clearInput();
        setRecyclerViewTouchListener(null);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SecureDealDataVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setWidgetInfo(info, item.getInputDelay());
        this.view.bind(item, resolveInputValue(item), this.cardActionHandler);
        updateComposerRecyclerTouchListener(item);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull SecureDealDataVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((SecureDealDataViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

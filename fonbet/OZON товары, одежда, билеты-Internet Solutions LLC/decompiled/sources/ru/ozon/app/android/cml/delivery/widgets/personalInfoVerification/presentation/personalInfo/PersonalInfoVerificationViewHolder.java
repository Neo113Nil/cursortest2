package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo;

import Ae.C2399j;
import Ae.C2408n0;
import El.C2971a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoAsyncUpdateUiState;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.PersonalInfoVerificationViewHolder;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.personalInfo.view.PersonalInfoVerificationView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00017B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J)\u0010&\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00100-j\u0002`/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/view/PersonalInfoVerificationView;", "view", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "viewModel", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/view/PersonalInfoVerificationView;Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;", "uiState", "", "handleAsyncUpdateState", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoAsyncUpdateUiState;)V", "", "isAdding", "addOrRemoveKeyboardListener", "(Z)V", "", "keyboardY", "inputBottomAndKeyboardDistance", "(I)I", "onAttach", "()V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/view/PersonalInfoVerificationView;", "Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/PersonalInfoVerificationViewModel;", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "patronymicSelectionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "keyboardVisibilityListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "isPatronymicCheckBoxSelected", "()Z", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoVerificationViewHolder extends k<PersonalInfoVerificationVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ViewTreeObserver.OnGlobalLayoutListener keyboardVisibilityListener;

    @NotNull
    private final Function1<AtomAction, Unit> patronymicSelectionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PersonalInfoVerificationView view;

    @NotNull
    private final PersonalInfoVerificationViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/personalInfoVerification/presentation/personalInfo/PersonalInfoVerificationViewHolder$Companion;", "", "<init>", "()V", "TOGGLE_CHECK_BOX_ACTION_ID", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInfoVerificationViewHolder(@NotNull PersonalInfoVerificationView view, @NotNull PersonalInfoVerificationViewModel viewModel, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        this.patronymicSelectionHandler = new PersonalInfoVerificationViewHolder$patronymicSelectionHandler$1(this);
        this.keyboardVisibilityListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: iq.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                PersonalInfoVerificationViewHolder.keyboardVisibilityListener$lambda$2(PersonalInfoVerificationViewHolder.this);
            }
        };
    }

    private final void addOrRemoveKeyboardListener(boolean isAdding) {
        if (isAdding) {
            this.view.getViewTreeObserver().addOnGlobalLayoutListener(this.keyboardVisibilityListener);
        } else {
            this.view.getViewTreeObserver().removeOnGlobalLayoutListener(this.keyboardVisibilityListener);
        }
    }

    private final void handleAsyncUpdateState(PersonalInfoAsyncUpdateUiState uiState) {
        if (uiState != null) {
            if (uiState instanceof PersonalInfoAsyncUpdateUiState.Loaded) {
                PersonalInfoAsyncUpdateUiState.Loaded loaded = (PersonalInfoAsyncUpdateUiState.Loaded) uiState;
                Map<String, String> trackingPayloads = loaded.getTrackingPayloads();
                if (trackingPayloads != null) {
                    this.tokenizedAnalytics.e(trackingPayloads);
                }
                this.refs.getController().update(loaded.getUpdate());
                return;
            }
            if (!(uiState instanceof PersonalInfoAsyncUpdateUiState.Error)) {
                throw new o();
            }
            this.refs.getController().hideLoader();
            ViewGroup b11 = C2971a.b(this.refs);
            if (b11 != null) {
                FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
            }
        }
    }

    private final int inputBottomAndKeyboardDistance(int keyboardY) {
        Rect rect = new Rect();
        OzonTextInputLayout activeInput = this.view.getActiveInput();
        if (activeInput != null) {
            activeInput.getGlobalVisibleRect(rect);
        }
        return rect.bottom - keyboardY;
    }

    private final boolean isPatronymicCheckBoxSelected() {
        CellDTO patronymicSettingsCell;
        CellDTO.LeftBlock leftBlock;
        PersonalInfoVerificationVO boundData = getBoundData();
        AtomDTO control = (boundData == null || (patronymicSettingsCell = boundData.getPatronymicSettingsCell()) == null || (leftBlock = patronymicSettingsCell.getLeftBlock()) == null) ? null : leftBlock.getControl();
        CheckBoxDTO checkBoxDTO = control instanceof CheckBoxDTO ? (CheckBoxDTO) control : null;
        return (checkBoxDTO != null ? checkBoxDTO.getStatus() : null) == CheckBoxDTO.CheckboxStatus.SELECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardVisibilityListener$lambda$2(PersonalInfoVerificationViewHolder personalInfoVerificationViewHolder) {
        View view;
        View view2;
        View view3;
        LinearLayout composerBottomContainer;
        C5353y0 n11 = Y.n(personalInfoVerificationViewHolder.view);
        if (n11 == null) {
            return;
        }
        int i11 = n11.f(8).f42129d;
        Integer valueOf = Integer.valueOf(i11 - n11.f(2).f42129d);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        ComponentCallbacksC5392m c11 = personalInfoVerificationViewHolder.refs.getContainer().c();
        int height = (c11 == null || (view3 = c11.getView()) == null || (composerBottomContainer = ComposerViewExtensionKt.composerBottomContainer(view3)) == null) ? 0 : composerBottomContainer.getHeight();
        ComponentCallbacksC5392m c12 = personalInfoVerificationViewHolder.refs.getContainer().c();
        int inputBottomAndKeyboardDistance = personalInfoVerificationViewHolder.inputBottomAndKeyboardDistance((((c12 == null || (view2 = c12.getView()) == null) ? 0 : view2.getHeight()) - i11) - height);
        ComponentCallbacksC5392m c13 = personalInfoVerificationViewHolder.refs.getContainer().c();
        if (c13 == null || (view = c13.getView()) == null) {
            return;
        }
        ViewExtKt.updatePadding$default(ComposerViewExtensionKt.composerContainer(view), 0, 0, 0, intValue, 7, null);
        ComposerViewExtensionKt.composerRecyclerView(view).scrollBy(0, inputBottomAndKeyboardDistance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttach$handleAsyncUpdateState(PersonalInfoVerificationViewHolder personalInfoVerificationViewHolder, PersonalInfoAsyncUpdateUiState personalInfoAsyncUpdateUiState, d dVar) {
        personalInfoVerificationViewHolder.handleAsyncUpdateState(personalInfoAsyncUpdateUiState);
        return Unit.f71690a;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        C2399j.C(new C2408n0(C5427n.a(this.viewModel.uiStateFlow(), getLifecycle(), AbstractC5434v.b.CREATED), new PersonalInfoVerificationViewHolder$onAttach$1(this)), K.a(this));
        this.view.setOnInputValueChange(new PersonalInfoVerificationViewHolder$onAttach$2(this.viewModel));
        addOrRemoveKeyboardListener(true);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        this.view.setOnInputValueChange(null);
        addOrRemoveKeyboardListener(false);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PersonalInfoVerificationVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setWidgetInfo(info, isPatronymicCheckBoxSelected());
        this.view.bind(item, isPatronymicCheckBoxSelected(), this.patronymicSelectionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull PersonalInfoVerificationVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((PersonalInfoVerificationViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

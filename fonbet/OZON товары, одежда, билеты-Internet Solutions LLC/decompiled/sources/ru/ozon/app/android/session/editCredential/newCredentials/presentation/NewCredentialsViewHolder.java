package ru.ozon.app.android.session.editCredential.newCredentials.presentation;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import GZ.g;
import Ib0.c;
import LZ.b;
import Ob0.a;
import Sc.InterfaceC4003e;
import Sc.o;
import Sc.s;
import a00.C4911f;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.K;
import androidx.lifecycle.W;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.session.databinding.WidgetEditCredentialsBinding;
import ru.ozon.app.android.session.editCredential.newCredentials.data.ResponseModel;
import ru.ozon.app.android.session.editCredential.newCredentials.presentation.viewmodel.NewCredentialsViewModel;
import ru.ozon.app.android.uikit.text.OzonPhoneNumberFormattingTextWatcher;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.input.textinput.data.OzonTextInputLayoutModel;
import ru.ozon.uni.android.input.textinput.data.TextInputStyle;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInputLayout;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ?2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001?BO\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0018*\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u00020\u0018*\u00020%2\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00022\n\u0010+\u001a\u00060)j\u0002`*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010+\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u0010\u001aR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModel;", "viewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LOb0/a;", "ozonIdApi", "LGZ/g;", "ozonRouter", "<init>", "(Landroid/view/View;La00/f;Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModel;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ll10/b;Lru/ozon/app/android/composer/ComposerNavigator;LOb0/a;LGZ/g;)V", "", "onButtonClick", "()V", "Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel;", "model", "handleEvent", "(Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel;)V", "", "otpToken", "startOtpFlow", "(Ljava/lang/String;)V", "keyboardUp", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "item", "bindCaptionText", "(Landroid/widget/TextView;Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "onDetach", "La00/f;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/viewmodel/NewCredentialsViewModel;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LOb0/a;", "LGZ/g;", "Lru/ozon/app/android/session/databinding/WidgetEditCredentialsBinding;", "binding", "Lru/ozon/app/android/session/databinding/WidgetEditCredentialsBinding;", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsLoaderDelegate;", "loaderDelegate", "Lru/ozon/app/android/session/editCredential/newCredentials/presentation/NewCredentialsLoaderDelegate;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NewCredentialsViewHolder extends k<NewCredentialsVO> {

    @NotNull
    private final WidgetEditCredentialsBinding binding;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final NewCredentialsLoaderDelegate loaderDelegate;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final C4911f ownerContainer;

    @NotNull
    private final a ozonIdApi;

    @NotNull
    private final g ozonRouter;

    @NotNull
    private final NewCredentialsViewModel viewModel;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements W, InterfaceC7732n {
        AnonymousClass2() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
                return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC7732n
        public final InterfaceC4003e<?> getFunctionDelegate() {
            return new C7735q(1, NewCredentialsViewHolder.this, NewCredentialsViewHolder.class, "handleEvent", "handleEvent(Lru/ozon/app/android/session/editCredential/newCredentials/data/ResponseModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.W
        public final void onChanged(ResponseModel p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            NewCredentialsViewHolder.this.handleEvent(p02);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$3", f = "NewCredentialsViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements Function2<A00.a, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = NewCredentialsViewHolder.this.new AnonymousClass3(dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(A00.a aVar, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            A00.a aVar2 = (A00.a) this.L$0;
            if (aVar2 instanceof a.C2372m) {
                NewCredentialsViewHolder.this.loaderDelegate.onListSubmitCompleted(((a.C2372m) aVar2).d());
            }
            return Unit.f71690a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputType.values().length];
            try {
                iArr[InputType.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCredentialsViewHolder(@NotNull View containerView, @NotNull C4911f ownerContainer, @NotNull NewCredentialsViewModel viewModel, @NotNull HandlersInhibitor handlersInhibitor, @NotNull InterfaceC7851b controller, @NotNull ComposerNavigator navigator, @NotNull Ob0.a ozonIdApi, @NotNull g ozonRouter) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ozonIdApi, "ozonIdApi");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ownerContainer = ownerContainer;
        this.viewModel = viewModel;
        this.handlersInhibitor = handlersInhibitor;
        this.controller = controller;
        this.navigator = navigator;
        this.ozonIdApi = ozonIdApi;
        this.ozonRouter = ozonRouter;
        WidgetEditCredentialsBinding bind = WidgetEditCredentialsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.loaderDelegate = new NewCredentialsLoaderDelegate(controller, 0L, 2, null);
        bind.noAvailable.setOnClickListener(new CC.a(this, 17));
        viewModel.getLiveData().observe(ownerContainer.g(), new AnonymousClass2());
        C2399j.C(new C2408n0(controller.getEventsFlow(), new AnonymousClass3(null)), K.a(ownerContainer.g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(NewCredentialsViewHolder newCredentialsViewHolder, View view) {
        NewCredentialsVO boundData = newCredentialsViewHolder.getBoundData();
        if (boundData == null) {
            return;
        }
        ComposerNavigator composerNavigator = newCredentialsViewHolder.navigator;
        String hintButtonDeeplink = boundData.getHintButtonDeeplink();
        if (hintButtonDeeplink == null) {
            hintButtonDeeplink = "";
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(composerNavigator, hintButtonDeeplink, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$4(NewCredentialsViewHolder newCredentialsViewHolder, View view) {
        HandlersInhibitor.run$default(newCredentialsViewHolder.handlersInhibitor, 0L, new NewCredentialsViewHolder$bind$3$1(newCredentialsViewHolder), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$5(NewCredentialsViewHolder newCredentialsViewHolder, NewCredentialsVO newCredentialsVO, View view) {
        HandlersInhibitor.run$default(newCredentialsViewHolder.handlersInhibitor, 0L, new NewCredentialsViewHolder$bind$4$1(newCredentialsViewHolder, newCredentialsVO), 1, null);
    }

    private final void bindCaptionText(TextView textView, NewCredentialsVO newCredentialsVO) {
        String caption = newCredentialsVO.getCaption();
        textView.setVisibility(caption == null || caption.length() == 0 ? 8 : 0);
        textView.setText(newCredentialsVO.getCaption());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(ResponseModel model) {
        Unit unit;
        OzonSpannableString ozonSpannableString;
        if (model instanceof ResponseModel.Completed) {
            ComposerExtKt.setResult$default(this.ownerContainer, null, 0, new NewCredentialsViewHolder$handleEvent$1(model), 3, null);
            ComposerExtKt.closeFlow(this.ownerContainer);
            unit = Unit.f71690a;
        } else if (model instanceof ResponseModel.Deeplink) {
            ComposerNavigator.DefaultImpls.openDeeplink$default(this.navigator, ((ResponseModel.Deeplink) model).getDeeplink(), null, 2, null);
            unit = Unit.f71690a;
        } else {
            int i11 = 8;
            if (model instanceof ResponseModel.ValidationShowError) {
                TextView textView = this.binding.errorTv;
                Intrinsics.f(textView);
                ViewExtKt.show(textView);
                textView.setText(((ResponseModel.ValidationShowError) model).getMessage());
                this.binding.hintIl.setStatus(OzonTextInputLayoutModel.Status.ERROR);
                TextView captionTv = this.binding.captionTv;
                Intrinsics.checkNotNullExpressionValue(captionTv, "captionTv");
                captionTv.setVisibility(8);
                unit = Unit.f71690a;
            } else if (model instanceof ResponseModel.ValidationHideError) {
                TextView textView2 = this.binding.errorTv;
                Intrinsics.f(textView2);
                ViewExtKt.gone(textView2);
                textView2.setText((CharSequence) null);
                TextView captionTv2 = this.binding.captionTv;
                Intrinsics.checkNotNullExpressionValue(captionTv2, "captionTv");
                CharSequence text = this.binding.captionTv.getText();
                if (text != null && text.length() != 0) {
                    i11 = 0;
                }
                captionTv2.setVisibility(i11);
                this.binding.hintIl.setStatus(OzonTextInputLayoutModel.Status.NEUTRAL);
                unit = Unit.f71690a;
            } else if (model instanceof ResponseModel.Error) {
                ViewGroup rootView = ContextExtKt.getRootView(this.ownerContainer.a());
                if (rootView != null) {
                    FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                    String message = ((ResponseModel.Error) model).getMessage();
                    if (message == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(message)) == null) {
                        ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString("");
                    }
                    FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, null, null, null, null, null, null, null, null, null, null, null, this.ownerContainer.g(), 65530, null).show();
                    unit = Unit.f71690a;
                } else {
                    unit = null;
                }
            } else if (model instanceof ResponseModel.Reload) {
                InterfaceC7851b.a.a(this.controller, ((ResponseModel.Reload) model).getDeeplink(), null, null, null, 14);
                unit = Unit.f71690a;
            } else if (Intrinsics.d(model, ResponseModel.ShowLoader.INSTANCE)) {
                this.loaderDelegate.onShowLoaderRequested();
                unit = Unit.f71690a;
            } else if (Intrinsics.d(model, ResponseModel.HideLoader.INSTANCE)) {
                this.loaderDelegate.onHideLoaderRequested();
                unit = Unit.f71690a;
            } else {
                if (!(model instanceof ResponseModel.OtpFlow)) {
                    throw new o();
                }
                startOtpFlow(((ResponseModel.OtpFlow) model).getOtpToken());
                unit = Unit.f71690a;
            }
        }
        WhenExtKt.getExhaustive(unit);
    }

    private final void keyboardUp(View view) {
        view.postDelayed(new OL.a(view, 1), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void keyboardUp$lambda$9(View view) {
        view.requestFocus();
        KeyboardUtilsKt.showKeyboard(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonClick() {
        NewCredentialsViewModel newCredentialsViewModel = this.viewModel;
        NewCredentialsVO boundData = getBoundData();
        if (boundData == null) {
            return;
        }
        newCredentialsViewModel.onButtonClick(boundData, String.valueOf(this.binding.hintIl.getInputViewGroup().getInputText()));
    }

    private final void startOtpFlow(final String otpToken) {
        NewCredentialsVO boundData = getBoundData();
        if (boundData == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        final NewCredentialsVO newCredentialsVO = boundData;
        this.ozonRouter.c(new b(new C8880a(this.ozonIdApi.g(new Pb0.e(this, otpToken, newCredentialsVO) { // from class: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$startOtpFlow$otpFlowConfig$1
            private final r activity;
            private final c onOtpFlowResult;
            private final String otpToken;

            {
                C4911f c4911f;
                c4911f = this.ownerContainer;
                this.activity = c4911f.i();
                this.otpToken = otpToken;
                this.onOtpFlowResult = new c() { // from class: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$startOtpFlow$otpFlowConfig$1$onOtpFlowResult$1
                    @Override // Ib0.c
                    public void onOtpFlowResult(c.a otpFlowResult) {
                        NewCredentialsViewModel newCredentialsViewModel;
                        Intrinsics.checkNotNullParameter(otpFlowResult, "otpFlowResult");
                        newCredentialsViewModel = NewCredentialsViewHolder.this.viewModel;
                        newCredentialsViewModel.onOtpFlowResult(newCredentialsVO, otpFlowResult);
                    }
                };
            }

            @Override // Pb0.e
            public c getOnOtpFlowResult() {
                return this.onOtpFlowResult;
            }

            @Override // Pb0.e
            public String getOtpToken() {
                return this.otpToken;
            }

            @Override // Pb0.e
            public r getActivity() {
                return this.activity;
            }
        }), null, null)), null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.loaderDelegate.onDetach();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        NewCredentialsVO boundData = getBoundData();
        String hintButtonText = boundData != null ? boundData.getHintButtonText() : null;
        if (hintButtonText == null || hintButtonText.length() == 0) {
            return;
        }
        super.onVisibleAreaChanged(info);
        ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ru.ozon.app.android.uikit.utils.ViewExtKt.expandToNonOverlapArea(constraintLayout, info);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01eb  */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull NewCredentialsVO item, @NotNull l20.d info) {
        OzonTextInputLayoutModel.KeyboardType keyboardType;
        String confirmButtonText;
        String secondaryButtonText;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetEditCredentialsBinding widgetEditCredentialsBinding = this.binding;
        widgetEditCredentialsBinding.hintIl.setStyle(TextInputStyle.INSTANCE.createInput600Style());
        widgetEditCredentialsBinding.hintIl.setLabelText(String.valueOf(item.getHint()));
        widgetEditCredentialsBinding.titleTv.setText(item.getTitle());
        TextView captionTv = widgetEditCredentialsBinding.captionTv;
        Intrinsics.checkNotNullExpressionValue(captionTv, "captionTv");
        bindCaptionText(captionTv, item);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (item.getSubtitle() != null) {
            TextAtomV2View subtitleTv = widgetEditCredentialsBinding.subtitleTv;
            Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
            TextHolderKt.bindOrGone$default(subtitleTv, new TextDTO(item.getSubtitle(), null, null, null, null, null, TextPreset.PRESET_CUSTOM, UniTextStyles.BODY_500_MEDIUM.getToken(), UniColors.TEXT_SECONDARY.getToken(), null, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, 261694, null), null, 2, null);
        } else {
            TextAtomV2View subtitleTv2 = widgetEditCredentialsBinding.subtitleTv;
            Intrinsics.checkNotNullExpressionValue(subtitleTv2, "subtitleTv");
            ViewExtKt.gone(subtitleTv2);
        }
        OzonTextInputLayout hintIl = widgetEditCredentialsBinding.hintIl;
        Intrinsics.checkNotNullExpressionValue(hintIl, "hintIl");
        String hint = item.getHint();
        int i11 = 1;
        ViewExtKt.showOrGone(hintIl, Boolean.valueOf(!(hint == null || hint.length() == 0)));
        InputType inputType = item.getInputType();
        int i12 = inputType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[inputType.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                keyboardType = OzonTextInputLayoutModel.KeyboardType.PHONE;
                this.binding.hintIl.setKeyboardType(keyboardType);
                OzonTextInput inputView = this.binding.hintIl.getInputViewGroup().getInputView();
                inputView.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$bind$lambda$3$$inlined$addTextChangedListener$default$1
                    @Override // android.text.TextWatcher
                    public void afterTextChanged(Editable s11) {
                        NewCredentialsViewModel newCredentialsViewModel;
                        newCredentialsViewModel = NewCredentialsViewHolder.this.viewModel;
                        newCredentialsViewModel.onTextChanged(String.valueOf(s11));
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence text, int start, int before, int count) {
                    }
                });
                if (inputType == InputType.PHONE) {
                    inputView.addTextChangedListener(new OzonPhoneNumberFormattingTextWatcher(null == true ? 1 : 0, i11, defaultConstructorMarker));
                    inputView.setText("7");
                    Editable text = inputView.getText();
                    inputView.setSelection(text != null ? text.length() : 0);
                }
                confirmButtonText = item.getConfirmButtonText();
                if (confirmButtonText != null || confirmButtonText.length() == 0) {
                    ButtonV3View confirmBtn = this.binding.confirmBtn;
                    Intrinsics.checkNotNullExpressionValue(confirmBtn, "confirmBtn");
                    ViewExtKt.gone(confirmBtn);
                } else {
                    ButtonV3View confirmBtn2 = this.binding.confirmBtn;
                    Intrinsics.checkNotNullExpressionValue(confirmBtn2, "confirmBtn");
                    ButtonV3HolderKt.bindOrGone$default(confirmBtn2, new ButtonV3DTO(null, ButtonV3DTO.Sizes.SIZE_600, item.getConfirmButtonText(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262137, null), null, 2, null);
                    this.binding.confirmBtn.setOnClickListener(new CD.a(this, 11));
                }
                secondaryButtonText = item.getSecondaryButtonText();
                if (secondaryButtonText != null || secondaryButtonText.length() == 0) {
                    ButtonV3View secondaryBtn = this.binding.secondaryBtn;
                    Intrinsics.checkNotNullExpressionValue(secondaryBtn, "secondaryBtn");
                    ViewExtKt.gone(secondaryBtn);
                } else {
                    ButtonV3View secondaryBtn2 = this.binding.secondaryBtn;
                    Intrinsics.checkNotNullExpressionValue(secondaryBtn2, "secondaryBtn");
                    ButtonV3HolderKt.bindOrGone$default(secondaryBtn2, new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_SECONDARY, ButtonV3DTO.Sizes.SIZE_600, item.getSecondaryButtonText(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262136, null), null, 2, null);
                    this.binding.secondaryBtn.setOnClickListener(new LB.a(6, this, item));
                }
                TextView noAvailable = this.binding.noAvailable;
                Intrinsics.checkNotNullExpressionValue(noAvailable, "noAvailable");
                TextViewExtKt.setTextOrGone(noAvailable, item.getHintButtonText());
                if (inputType == null) {
                    keyboardUp(this.binding.hintIl.getInputViewGroup().getInputView());
                } else {
                    KeyboardUtilsKt.hideKeyboard(this.binding.hintIl.getInputViewGroup().getInputView());
                }
                ConstraintLayout constraintLayout = this.binding.getConstraintLayout();
                String hintButtonText = item.getHintButtonText();
                constraintLayout.setLayoutParams(new ConstraintLayout.b(-1, (hintButtonText != null || hintButtonText.length() == 0) ? -2 : -1));
            }
            if (i12 != 2) {
                throw new o();
            }
        }
        keyboardType = OzonTextInputLayoutModel.KeyboardType.TEXT;
        this.binding.hintIl.setKeyboardType(keyboardType);
        OzonTextInput inputView2 = this.binding.hintIl.getInputViewGroup().getInputView();
        inputView2.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.app.android.session.editCredential.newCredentials.presentation.NewCredentialsViewHolder$bind$lambda$3$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                NewCredentialsViewModel newCredentialsViewModel;
                newCredentialsViewModel = NewCredentialsViewHolder.this.viewModel;
                newCredentialsViewModel.onTextChanged(String.valueOf(s11));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text2, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text2, int start, int before, int count) {
            }
        });
        if (inputType == InputType.PHONE) {
        }
        confirmButtonText = item.getConfirmButtonText();
        if (confirmButtonText != null) {
        }
        ButtonV3View confirmBtn3 = this.binding.confirmBtn;
        Intrinsics.checkNotNullExpressionValue(confirmBtn3, "confirmBtn");
        ViewExtKt.gone(confirmBtn3);
        secondaryButtonText = item.getSecondaryButtonText();
        if (secondaryButtonText != null) {
        }
        ButtonV3View secondaryBtn3 = this.binding.secondaryBtn;
        Intrinsics.checkNotNullExpressionValue(secondaryBtn3, "secondaryBtn");
        ViewExtKt.gone(secondaryBtn3);
        TextView noAvailable2 = this.binding.noAvailable;
        Intrinsics.checkNotNullExpressionValue(noAvailable2, "noAvailable");
        TextViewExtKt.setTextOrGone(noAvailable2, item.getHintButtonText());
        if (inputType == null) {
        }
        ConstraintLayout constraintLayout2 = this.binding.getConstraintLayout();
        String hintButtonText2 = item.getHintButtonText();
        constraintLayout2.setLayoutParams(new ConstraintLayout.b(-1, (hintButtonText2 != null || hintButtonText2.length() == 0) ? -2 : -1));
    }
}

package ru.ozon.app.android.partpayment.smssign.view;

import Bl.b;
import FG.a;
import Sc.o;
import WZ.t;
import android.text.Editable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.Y;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.partpayment.databinding.WidgetSmsSignBinding;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignVH;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewModel;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.R$anim;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.view.input.MobilizationSmsCodeEditText;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.callback.OnDismissListener;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.flashbar.main.Flashbar;
import ru.ozon.uni.android.flashbar.model.Action;
import ru.ozon.uni.android.flashbar.view.DismissEvent;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003*\u0001+\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R \u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\f0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/view/SmsSignVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Landroid/view/View;Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "wrongPin", "()V", "requestProblem", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;Ll20/d;)V", "onViewInVisibleBounds", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/partpayment/databinding/WidgetSmsSignBinding;", "binding", "Lru/ozon/app/android/partpayment/databinding/WidgetSmsSignBinding;", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$TimerInfoVO;", "timerInfo", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewModel$TimerInfoVO;", "currentItem", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVO;", "Landroid/view/animation/Animation;", "shakeAnimation", "Landroid/view/animation/Animation;", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "shownFlashbar", "Lru/ozon/uni/android/flashbar/main/Flashbar;", "ru/ozon/app/android/partpayment/smssign/view/SmsSignVH$textWatcher$1", "textWatcher", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignVH$textWatcher$1;", "Lkotlin/Function1;", "", "onEnteredCallback", "Lkotlin/jvm/functions/Function1;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SmsSignVH extends k<SmsSignVO> {

    @NotNull
    private final WidgetSmsSignBinding binding;

    @NotNull
    private final View containerView;
    private SmsSignVO currentItem;

    @NotNull
    private final Function1<CharSequence, Unit> onEnteredCallback;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final Animation shakeAnimation;
    private Flashbar shownFlashbar;

    @NotNull
    private final SmsSignVH$textWatcher$1 textWatcher;
    private SmsSignViewModel.TimerInfoVO timerInfo;

    @NotNull
    private final SmsSignViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [ru.ozon.app.android.partpayment.smssign.view.SmsSignVH$textWatcher$1] */
    public SmsSignVH(@NotNull View containerView, @NotNull SmsSignViewModel viewModel, @NotNull ComposerReferences references) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        this.containerView = containerView;
        this.viewModel = viewModel;
        this.references = references;
        WidgetSmsSignBinding bind = WidgetSmsSignBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R$anim.shake);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(...)");
        this.shakeAnimation = loadAnimation;
        this.textWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.partpayment.smssign.view.SmsSignVH$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                ComposerReferences composerReferences;
                Intrinsics.checkNotNullParameter(s11, "s");
                composerReferences = SmsSignVH.this.references;
                composerReferences.getController().d(new SmsSignViewMapper.PinUpdate(s11.toString()));
            }
        };
        this.onEnteredCallback = new SmsSignVH$onEnteredCallback$1(this);
        bind.subMessageTv.setOnClickListener(new a(this, 12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SmsSignVH smsSignVH, View view) {
        t event;
        SmsSignVO smsSignVO = smsSignVH.currentItem;
        if (smsSignVO != null && (event = smsSignVO.getEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(smsSignVH.references.getTokenizedAnalytics(), event, null, 2, null);
        }
        SmsSignViewModel.TimerInfoVO timerInfoVO = smsSignVH.timerInfo;
        if (timerInfoVO == null || !timerInfoVO.getAllowResend()) {
            return;
        }
        smsSignVH.viewModel.resendPin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$2(SmsSignVH smsSignVH, SmsSignViewModel.TimerInfoVO timerInfoVO) {
        smsSignVH.timerInfo = timerInfoVO;
        smsSignVH.binding.subMessageTv.setText(timerInfoVO.getTimerText());
        smsSignVH.binding.subMessageTv.setTextAppearance(timerInfoVO.getSendButtonTextAppearance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttach$lambda$3(SmsSignVH smsSignVH, SmsSignViewModel.Action action) {
        if (Intrinsics.d(action, SmsSignViewModel.Action.WrongPin.INSTANCE)) {
            smsSignVH.wrongPin();
        } else {
            if (!Intrinsics.d(action, SmsSignViewModel.Action.RequestProblem.INSTANCE)) {
                throw new o();
            }
            smsSignVH.requestProblem();
        }
        WhenExtKt.getExhaustive(Unit.f71690a);
    }

    private final void requestProblem() {
        Flashbar flashbar = this.shownFlashbar;
        if (flashbar != null) {
            flashbar.dismiss();
        }
        ViewGroup b11 = b.b(this.references);
        if (b11 != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.common_message_request_problem));
            int i11 = R$drawable.ic_warning;
            Flashbar create$default = FlashbarFactory.create$default(flashbarFactory, b11, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, new Action(StringProvider.getString(ru.ozon.app.android.partpayment.R$string.retry), false, new SmsSignVH$requestProblem$1$1(this), 2, null), null, null, null, -1L, null, new OnDismissListener() { // from class: ru.ozon.app.android.partpayment.smssign.view.SmsSignVH$requestProblem$1$2
                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissProgress(float f7) {
                    OnDismissListener.DefaultImpls.onDismissProgress(this, f7);
                }

                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissed(DismissEvent event) {
                    WidgetSmsSignBinding widgetSmsSignBinding;
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == DismissEvent.SWIPE) {
                        widgetSmsSignBinding = SmsSignVH.this.binding;
                        MobilizationSmsCodeEditText mobilizationSmsCodeEditText = widgetSmsSignBinding.pinEt;
                        if (mobilizationSmsCodeEditText != null) {
                            mobilizationSmsCodeEditText.setText("");
                        }
                    }
                }

                @Override // ru.ozon.uni.android.flashbar.callback.OnDismissListener
                public void onDismissing(boolean z11) {
                    OnDismissListener.DefaultImpls.onDismissing(this, z11);
                }
            }, this.references.getContainer().g(), 24026, null);
            this.shownFlashbar = create$default;
            create$default.show();
        }
    }

    private final void wrongPin() {
        this.binding.pinEt.startAnimation(this.shakeAnimation);
        this.binding.pinEt.setText("");
        this.references.getController().d(new SmsSignViewMapper.PinUpdate(""));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.viewModel.getTimerInfo().observe(this, new W() { // from class: fC.b
            @Override // androidx.lifecycle.W
            public final void onChanged(Object obj) {
                SmsSignVH.onAttach$lambda$2(SmsSignVH.this, (SmsSignViewModel.TimerInfoVO) obj);
            }
        });
        this.viewModel.getAction().observe(this, new ZR.a(this, 1));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        t event;
        super.onViewInVisibleBounds();
        SmsSignVO smsSignVO = this.currentItem;
        if (smsSignVO == null || (event = smsSignVO.getEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), event, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SmsSignVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.currentItem = item;
        if (!item.getIsTimerStarted()) {
            this.timerInfo = null;
            this.viewModel.resetTimer(item.getTimer().getDuration());
            this.references.getController().d(new SmsSignViewMapper.TimerStateUpdate(true));
        }
        WidgetSmsSignBinding widgetSmsSignBinding = this.binding;
        widgetSmsSignBinding.titleTv.setText(item.getTitle());
        widgetSmsSignBinding.messageTv.setText(item.getHint());
        widgetSmsSignBinding.messageTv.setMovementMethod(LinkMovementMethod.getInstance());
        final MobilizationSmsCodeEditText mobilizationSmsCodeEditText = widgetSmsSignBinding.pinEt;
        mobilizationSmsCodeEditText.setCodeLength(item.getCodeLength());
        mobilizationSmsCodeEditText.removeTextChangedListener(this.textWatcher);
        mobilizationSmsCodeEditText.setOnCodeEnteredListener(null);
        mobilizationSmsCodeEditText.setText(item.getPin());
        mobilizationSmsCodeEditText.setOnCodeEnteredListener(this.onEnteredCallback);
        mobilizationSmsCodeEditText.addTextChangedListener(this.textWatcher);
        int i11 = Y.f42258g;
        if (mobilizationSmsCodeEditText.isLaidOut()) {
            return;
        }
        if (!mobilizationSmsCodeEditText.isLaidOut() || mobilizationSmsCodeEditText.isLayoutRequested()) {
            mobilizationSmsCodeEditText.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.partpayment.smssign.view.SmsSignVH$bind$lambda$6$lambda$5$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    MobilizationSmsCodeEditText.this.requestFocus();
                    Intrinsics.f(MobilizationSmsCodeEditText.this);
                    KeyboardUtilsKt.showKeyboard(MobilizationSmsCodeEditText.this);
                }
            });
        } else {
            mobilizationSmsCodeEditText.requestFocus();
            KeyboardUtilsKt.showKeyboard(mobilizationSmsCodeEditText);
        }
    }
}

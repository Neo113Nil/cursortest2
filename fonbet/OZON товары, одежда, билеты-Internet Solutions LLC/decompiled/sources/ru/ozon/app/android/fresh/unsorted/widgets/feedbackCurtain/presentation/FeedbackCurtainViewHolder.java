package ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.presentation;

import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import android.app.Dialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.lifecycle.V;
import eF.C6328c;
import i10.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetFeedbackCurtainBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.feedbackCurtain.data.FeedbackEvent;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010$\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u000e\u0010#\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"H\u0016¢\u0006\u0004\b$\u0010%J#\u0010)\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010(\u001a\u00060&j\u0002`'H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0016\u00109\u001a\u0004\u0018\u0001068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "hideKeyboard", "()Ljava/lang/Boolean;", "", "sendInfo", "()V", "sendClickAnalytics", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackEvent;", "event", "collect", "(Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/data/FeedbackEvent;)V", "showSuccess", "showError", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainVO;Ll20/d;)V", "onViewInVisibleBounds", "LWZ/l;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetFeedbackCurtainBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetFeedbackCurtainBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/fresh/unsorted/widgets/feedbackCurtain/presentation/FeedbackCurtainViewModel;", "widgetViewModel", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FeedbackCurtainViewHolder extends k<FeedbackCurtainVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetFeedbackCurtainBinding binding;
    private FeedbackCurtainVO item;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedbackEvent.values().length];
            try {
                iArr[FeedbackEvent.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FeedbackEvent.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackCurtainViewHolder(@NotNull View containerView, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences refs) {
        super(containerView);
        Window window;
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.refs = refs;
        WidgetFeedbackCurtainBinding bind = WidgetFeedbackCurtainBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new FeedbackCurtainViewHolder$actionHandler$1(this)).buildHandler();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        ComponentCallbacksC5392m parentFragment = c11 != null ? c11.getParentFragment() : null;
        Intrinsics.g(parentFragment, "null cannot be cast to non-null type ru.ozon.app.android.composer.universalscreen.view.BottomSheetComposerFragment");
        Dialog dialog = ((BottomSheetComposerFragment) parentFragment).getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bind$lambda$1(FeedbackCurtainViewHolder feedbackCurtainViewHolder, TextView textView, int i11, KeyEvent keyEvent) {
        if (i11 != 6) {
            return true;
        }
        feedbackCurtainViewHolder.sendClickAnalytics();
        feedbackCurtainViewHolder.sendInfo();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collect(FeedbackEvent event) {
        this.refs.getController().hideLoader();
        hideKeyboard();
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i11 == 1) {
            showSuccess();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            showError();
        }
    }

    private final FeedbackCurtainViewModel getWidgetViewModel() {
        return (FeedbackCurtainViewModel) getWidgetViewModel();
    }

    private final Boolean hideKeyboard() {
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null) {
            return Boolean.valueOf(KeyboardUtilsKt.hideKeyboard(c11));
        }
        return null;
    }

    private final void sendClickAnalytics() {
        t tokenizedEvent;
        FeedbackCurtainVO feedbackCurtainVO = this.item;
        if (feedbackCurtainVO == null || (tokenizedEvent = feedbackCurtainVO.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendInfo() {
        ButtonV3Atom.LargeButton button;
        AtomActionDTO action;
        Map<String, String> params;
        FeedbackCurtainVO feedbackCurtainVO = this.item;
        LinkedHashMap linkedHashMap = (feedbackCurtainVO == null || (button = feedbackCurtainVO.getButton()) == null || (action = button.getAction()) == null || (params = action.getParams()) == null) ? new LinkedHashMap() : U.u(params);
        this.refs.getController().e(new l.a.C1079a(0L, null, 3));
        hideKeyboard();
        FeedbackCurtainViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.sendTextWithParams(String.valueOf(this.binding.etField.getText()), linkedHashMap);
        }
    }

    private final void showError() {
        ViewGroup rootView;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.feedback_failure_msg)), null, null, Integer.valueOf(R$drawable.ic_m_cross_compact), null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_NEGATIVE.getValue(), null, null, null, null, null, null, null, null, c11, 65370, null).show();
    }

    private final void showSuccess() {
        ViewGroup rootView;
        Dialog dialog;
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        BottomSheetComposerFragment bottomSheetComposerFragment = (BottomSheetComposerFragment) (c11 != null ? c11.getParentFragment() : null);
        if (bottomSheetComposerFragment != null && (dialog = bottomSheetComposerFragment.getDialog()) != null) {
            dialog.dismiss();
        }
        r a11 = this.refs.getContainer().a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(StringProvider.getString(R$string.your_answer_sended)), null, null, Integer.valueOf(R$drawable.ic_m_check), null, StyleParser.OzColor.OZ_SEMANTIC_TEXT_POSITIVE.getValue(), null, null, null, null, null, null, null, null, a11, 65370, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        V<FeedbackEvent> events;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        FeedbackCurtainViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel == null || (events = widgetViewModel.getEvents()) == null) {
            return;
        }
        events.observe(lifecycle, new FeedbackCurtainViewHolder$sam$androidx_lifecycle_Observer$0(new FeedbackCurtainViewHolder$onAttachViewModel$1(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        ComponentCallbacksC5392m c11 = this.refs.getContainer().c();
        if (c11 != null) {
            AppCompatEditText etField = this.binding.etField;
            Intrinsics.checkNotNullExpressionValue(etField, "etField");
            KeyboardUtilsKt.showKeyboard(c11, etField);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FeedbackCurtainVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        LargeButtonView btnAction = this.binding.btnAction;
        Intrinsics.checkNotNullExpressionValue(btnAction, "btnAction");
        LargeButtonHolderKt.bind(btnAction, item.getButton(), this.actionHandler);
        TextAtomView textAtomView = this.binding.textAtomView;
        Intrinsics.checkNotNullExpressionValue(textAtomView, "textAtomView");
        TextAtomHolderKt.bind$default(textAtomView, item.getTitle(), null, 2, null);
        this.binding.ltField.setHint(item.getHint());
        this.binding.etField.setImeOptions(6);
        this.binding.etField.setRawInputType(1);
        this.binding.etField.setOnEditorActionListener(new C6328c(this, 1));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FeedbackCurtainVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((FeedbackCurtainViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}

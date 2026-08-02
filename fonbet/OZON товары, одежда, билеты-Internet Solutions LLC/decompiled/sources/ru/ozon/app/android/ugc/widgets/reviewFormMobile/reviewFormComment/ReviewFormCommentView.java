package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5316f0;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.l;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentVO;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormComment.ReviewFormCommentView;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00062\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001b\u001a\u00020\u001a2&\u0010\u0019\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010 2\b\u0010\b\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u000eJ)\u0010'\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\f0\u0010¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R$\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0013\u0010@\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020:8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bA\u0010B*\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;", "", "text", "", "getMinLines", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Ljava/lang/String;)I", "", "onDetachedFromWindow", "()V", "itemVO", "Lkotlin/Function1;", "", "onInputViewClick", "Lkotlin/Pair;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO$HintVO;", "setTextArea", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "Lkotlin/Function4;", "", "action", "Landroid/text/TextWatcher;", "doOnTextChanged", "(Lfd/o;)Landroid/text/TextWatcher;", "textSize", "changeMinLines", "(I)V", "", "hints", "updateHints", "(Ljava/util/List;Ljava/lang/CharSequence;)Lkotlin/Pair;", "requestFocusAndShowKeyboard", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindMediaPickerButton", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;Lkotlin/jvm/functions/Function1;)V", "pickerButtonShowOrGone", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentVO;)V", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/SuggestsAnimator;", "animator", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/SuggestsAnimator;", "inputMinLines", "Ljava/lang/Integer;", "initialFocusRequested", "Z", "inputViewClickAction", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/textArea/TextAreaView;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/android/textArea/TextAreaView;", "getTextArea", "()Lru/ozon/uni/android/textArea/TextAreaView;", "LSc/j;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "mediaPickerButtonDelegate", "LSc/j;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "getInputView", "()Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "inputView", "getMediaPickerButton", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getMediaPickerButton$delegate", "(Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormComment/ReviewFormCommentView;)Ljava/lang/Object;", "mediaPickerButton", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewFormCommentView extends FrameLayout {
    private SuggestsAnimator animator;
    private boolean initialFocusRequested;
    private Integer inputMinLines;
    private Function1<? super Boolean, Unit> inputViewClickAction;

    @NotNull
    private final InterfaceC4008j<IconButtonV3View> mediaPickerButtonDelegate;

    @NotNull
    private final TextAreaView textArea;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFormCommentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAreaView textAreaView = new TextAreaView(context, null, 0, 6, null);
        textAreaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Dimens dimens = Dimens.INSTANCE;
        textAreaView.setPadding(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        this.textArea = textAreaView;
        this.mediaPickerButtonDelegate = DelegatesKt.lazyUnsafe(new ReviewFormCommentView$special$$inlined$lazyView$1(textAreaView, context));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(textAreaView);
        OzonTextInput inputView = getInputView();
        final View.OnFocusChangeListener onFocusChangeListener = inputView != null ? inputView.getOnFocusChangeListener() : null;
        OzonTextInput inputView2 = getInputView();
        if (inputView2 != null) {
            inputView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: sW.e
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    ReviewFormCommentView._init_$lambda$4(onFocusChangeListener, this, view, z11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(View.OnFocusChangeListener onFocusChangeListener, ReviewFormCommentView reviewFormCommentView, View view, boolean z11) {
        Function1<? super Boolean, Unit> function1;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        if (!z11 || (function1 = reviewFormCommentView.inputViewClickAction) == null) {
            return;
        }
        function1.invoke(Boolean.valueOf(reviewFormCommentView.initialFocusRequested));
    }

    private final int getMinLines(ReviewFormCommentVO reviewFormCommentVO, String str) {
        if (reviewFormCommentVO.getIsModal() && (str == null || str.length() == 0)) {
            if (reviewFormCommentVO.getIsExpanded() || !reviewFormCommentVO.isPickerButtonShown()) {
                return 2;
            }
            return reviewFormCommentVO.getMinLines();
        }
        if (str == null || str.length() == 0) {
            return reviewFormCommentVO.getMinLines();
        }
        return 3;
    }

    public final void bindMediaPickerButton(@NotNull ReviewFormCommentVO itemVO, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        if (itemVO.getMediaPickerButton() != null || this.mediaPickerButtonDelegate.isInitialized()) {
            IconButtonV3DTO mediaPickerButton = itemVO.getMediaPickerButton();
            if (mediaPickerButton != null) {
                IconButtonV3HolderKt.bind(getMediaPickerButton(), mediaPickerButton, onAction);
            }
            ViewExtKt.showOrGone(getMediaPickerButton(), Boolean.valueOf(itemVO.isPickerButtonShown()));
            this.textArea.setHasBottomBar(true);
            OzonTextInput inputView = getInputView();
            if (inputView != null) {
                ViewGroup.LayoutParams layoutParams = inputView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                bVar.f41662z = Dimens.INSTANCE.getDP_8();
                inputView.setLayoutParams(bVar);
            }
        }
    }

    public final void changeMinLines(int textSize) {
        int intValue;
        TextAreaView textAreaView = this.textArea;
        if (textSize > 0) {
            intValue = 3;
        } else {
            Integer num = this.inputMinLines;
            intValue = num != null ? num.intValue() : 1;
        }
        textAreaView.setMinLines(intValue);
    }

    @NotNull
    public final TextWatcher doOnTextChanged(@NotNull InterfaceC6512o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return TextAreaView.INSTANCE.doOnTextChanged(this.textArea, action);
    }

    public final OzonTextInput getInputView() {
        return (OzonTextInput) l.l(l.h(C5316f0.b(this.textArea), ReviewFormCommentView$special$$inlined$filterIsInstance$1.INSTANCE));
    }

    @NotNull
    public final IconButtonV3View getMediaPickerButton() {
        return this.mediaPickerButtonDelegate.getValue();
    }

    @NotNull
    public final TextAreaView getTextArea() {
        return this.textArea;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SuggestsAnimator suggestsAnimator = this.animator;
        if (suggestsAnimator != null) {
            suggestsAnimator.detach();
        }
        this.animator = null;
    }

    public final void pickerButtonShowOrGone(@NotNull ReviewFormCommentVO itemVO) {
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        ViewExtKt.showOrGone(getMediaPickerButton(), Boolean.valueOf(itemVO.isPickerButtonShown()));
        TextAreaView textAreaView = this.textArea;
        textAreaView.setMinLines(getMinLines(itemVO, textAreaView.getInputText()));
    }

    public final void requestFocusAndShowKeyboard() {
        OzonTextInput inputView;
        if (this.initialFocusRequested || (inputView = getInputView()) == null) {
            return;
        }
        inputView.requestFocus();
        this.initialFocusRequested = true;
        ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.showKeyboard(inputView);
    }

    public final Pair<ReviewFormCommentVO.HintVO, String> setTextArea(@NotNull ReviewFormCommentVO itemVO, @NotNull Function1<? super Boolean, Unit> onInputViewClick) {
        Intrinsics.checkNotNullParameter(itemVO, "itemVO");
        Intrinsics.checkNotNullParameter(onInputViewClick, "onInputViewClick");
        TextAreaView textAreaView = this.textArea;
        this.inputViewClickAction = onInputViewClick;
        textAreaView.setFocusable(false);
        textAreaView.setLabel(itemVO.getPlaceholder());
        this.inputMinLines = Integer.valueOf(getMinLines(itemVO, itemVO.getValue()));
        textAreaView.setMaxLines(itemVO.getMaxLines());
        textAreaView.setMinLines(getMinLines(itemVO, itemVO.getValue()));
        textAreaView.setMaxLength(itemVO.getMaxInputLength());
        textAreaView.setHasInfoIcon(false);
        textAreaView.setDeleteAllButtonAllowed(false);
        String value = itemVO.getValue();
        if (value != null) {
            textAreaView.setInputText(value);
        }
        ReviewFormCommentVO.SuggestsVO suggests = itemVO.getSuggests();
        if (suggests != null) {
            TextView textView = (TextView) textAreaView.findViewById(R$id.inputLabel);
            OzonTextInput inputView = getInputView();
            if (inputView != null) {
                Intrinsics.f(textView);
                SuggestsAnimator suggestsAnimator = new SuggestsAnimator(inputView, textView, suggests.getPlaceholders(), itemVO.getPlaceholder(), suggests.getDelay());
                this.animator = suggestsAnimator;
                suggestsAnimator.attach();
            }
        }
        return updateHints(itemVO.getHints(), itemVO.getValue());
    }

    public final Pair<ReviewFormCommentVO.HintVO, String> updateHints(List<ReviewFormCommentVO.HintVO> hints, CharSequence text) {
        Pair<ReviewFormCommentVO.HintVO, String> pair;
        ReviewFormCommentVO.HintVO e11;
        String captionColor;
        ReviewFormCommentVO.HintVO e12;
        TextAreaView textAreaView = this.textArea;
        Integer num = null;
        if (hints != null) {
            int i11 = 0;
            pair = null;
            for (Object obj : hints) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ReviewFormCommentVO.HintVO hintVO = (ReviewFormCommentVO.HintVO) obj;
                if (text != null && !h.K(text) && text.length() >= hintVO.getMinInputLength()) {
                    pair = new Pair<>(hintVO, i11 == 0 ? "low" : i11 == C7714v.P(hints) ? "high" : "medium");
                }
                i11 = i12;
            }
        } else {
            pair = null;
        }
        textAreaView.setCaption((pair == null || (e12 = pair.e()) == null) ? null : e12.getCaption());
        if (pair != null && (e11 = pair.e()) != null && (captionColor = e11.getCaptionColor()) != null) {
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = textAreaView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = styleParser.parseColor(context, captionColor);
        }
        textAreaView.setCaptionColor(num);
        return pair;
    }
}

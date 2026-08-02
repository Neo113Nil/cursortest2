package ru.ozon.fintech.ui.radio;

import C.D;
import E30.g;
import H30.z;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.v3.holders.selectionControls.RadioButtonHolderKt;

@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/ui/radio/RadioWrapperView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lru/ozon/fintech/ui/radio/RadioWrapperState;", "root", FormPageDTO.Field.FIELD_TYPE_RADIO, "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "clickListener", "Landroid/view/View$OnClickListener;", "bindState", "", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setRounded", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadioWrapperView extends FrameLayout {

    @NotNull
    private final View.OnClickListener clickListener;

    @NotNull
    private RadioButtonView radio;

    @NotNull
    private FrameLayout root;
    private RadioWrapperState state;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioWrapperView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void clickListener$lambda$1(RadioWrapperView radioWrapperView, View view) {
        RadioWrapperState radioWrapperState = radioWrapperView.state;
        Function2<String, Boolean, Unit> onClick = radioWrapperState != null ? radioWrapperState.getOnClick() : null;
        RadioWrapperState radioWrapperState2 = radioWrapperView.state;
        String actionId = radioWrapperState2 != null ? radioWrapperState2.getActionId() : null;
        RadioWrapperState radioWrapperState3 = radioWrapperView.state;
        g.b(new a(), onClick, actionId, radioWrapperState3 != null ? Boolean.valueOf(radioWrapperState3.getCloseOnClick()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit clickListener$lambda$1$lambda$0(Function2 onClick, String actionId, boolean z11) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        onClick.invoke(actionId, Boolean.valueOf(z11));
        return Unit.f71690a;
    }

    private final void setRounded() {
        this.root.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.ozon.fintech.ui.radio.RadioWrapperView$setRounded$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                RadioWrapperState radioWrapperState;
                Integer radius;
                radioWrapperState = RadioWrapperView.this.state;
                int d11 = D.d((radioWrapperState == null || (radius = radioWrapperState.getRadius()) == null) ? 0 : radius.intValue());
                if (view != null && outline != null && view.getWidth() != 0 && view.getHeight() != 0) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d11);
                }
                if (view != null) {
                    view.setTag(new Pair("radius", Integer.valueOf(d11)));
                }
            }
        });
    }

    public final void bindState(@NotNull RadioWrapperState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        z.a(this, state.getPaddings());
        FrameLayout frameLayout = this.root;
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, state.getBackColor());
        frameLayout.setBackgroundColor(parseColor != null ? parseColor.intValue() : 0);
        if (state.getRadio() != null) {
            RadioButtonHolderKt.bind$default(this.radio, state.getRadio(), null, 2, null);
            this.radio.setClickable(false);
        }
        if (Intrinsics.d(state.getActionEnabled(), Boolean.TRUE)) {
            this.root.setOnClickListener(this.clickListener);
        } else {
            this.root.setOnClickListener(null);
            this.root.setClickable(false);
        }
        setRounded();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        RadioWrapperState radioWrapperState = this.state;
        if (radioWrapperState != null ? Intrinsics.d(radioWrapperState.getActionEnabled(), Boolean.TRUE) : false) {
            return super.dispatchTouchEvent(ev);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadioWrapperView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RadioWrapperView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioWrapperView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.clickListener = new FG.a(this, 20);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.root = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(this.root);
        this.root.setClipToOutline(true);
        RadioButtonView radioButtonView = new RadioButtonView(context, null, 0, 6, null);
        this.radio = radioButtonView;
        radioButtonView.setClickable(false);
        this.root.addView(this.radio);
        setRounded();
    }
}

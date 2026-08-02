package ru.ozon.app.android.cart.ui.rightIconButtonView;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTOKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 K2\u00020\u0001:\u0001KB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b0\u001c¢\u0006\u0004\b\u001f\u0010 R*\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u00102\u001a\u0002012\u0006\u0010!\u001a\u0002018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b2\u00103\"\u0004\b4\u00105R$\u00107\u001a\u0002062\u0006\u0010!\u001a\u0002068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00068\u0002@BX\u0083\u000e¢\u0006\f\n\u0004\b;\u0010,\"\u0004\b<\u0010\u0014R(\u0010=\u001a\u0004\u0018\u00010\u001a2\b\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010B\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010G\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/constraintlayout/widget/d;", "", "setConstrainsForTextView", "(Landroidx/constraintlayout/widget/d;)V", "setConstrainsForIcon", "showHover", "()V", "hideHover", "styleRes", "applyStyle", "(I)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "dto", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindOrGone", "(Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;Lkotlin/jvm/functions/Function1;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isSelectApp", "Z", "()Z", "setSelectApp", "(Z)V", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "transparentColor", "I", "actionHandler", "Lkotlin/jvm/functions/Function1;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "size", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "setSize", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;)V", "Lru/ozon/uni/android/uikitsdk/Color;", "backColor", "Lru/ozon/uni/android/uikitsdk/Color;", "setBackColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "titleColor", "setTitleColor", "boundedData", "Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "getBoundedData", "()Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonDTO;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "text", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getText", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Lru/ozon/uni/android/atom/icon/IconView;", "icon", "Lru/ozon/uni/android/atom/icon/IconView;", "getIcon", "()Lru/ozon/uni/android/atom/icon/IconView;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RightIconButtonView extends ConstraintLayout {
    private AtomAction action;
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private Color backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;
    private RightIconButtonDTO boundedData;

    @NotNull
    private final GradientDrawable foregroundDrawable;

    @NotNull
    private final IconView icon;
    private boolean isSelectApp;

    @NotNull
    private ButtonV3DTO.Sizes size;

    @NotNull
    private final TextAtomV2View text;
    private int titleColor;
    private final int transparentColor;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float RADIUS_16 = UiExtKt.toPxF(16);
    private static final int DP_12 = ResourceExtKt.toPx(12);
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_4 = ResourceExtKt.toPx(4);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonView$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<d, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            invoke2(dVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(d updateConstraints) {
            Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
            RightIconButtonView.this.setConstrainsForTextView(updateConstraints);
            RightIconButtonView.this.setConstrainsForIcon(updateConstraints);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cart/ui/rightIconButtonView/RightIconButtonView$Companion;", "", "<init>", "()V", "", "FOREGROUND_OPACITY", "I", "", "ENABLED_ALPHA", "F", "DISABLED_ALPHA", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ RightIconButtonView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$7(RightIconButtonView rightIconButtonView, View view) {
        Function1<? super AtomAction, Unit> function1;
        AtomAction atomAction = rightIconButtonView.action;
        if (atomAction == null || (function1 = rightIconButtonView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void applyStyle(int styleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(styleRes, R$styleable.ButtonV3View);
        Intrinsics.f(obtainStyledAttributes);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context, R$styleable.ButtonV3View_backgroundGradient, R$styleable.ButtonV3View_backgroundColor, this.transparentColor));
        setTitleColor(obtainStyledAttributes.getColor(R$styleable.ButtonV3View_titleTextColor, this.transparentColor));
        obtainStyledAttributes.recycle();
    }

    private final void hideHover() {
        setForeground(null);
    }

    private final void setBackColor(Color color) {
        this.backColor = color;
        color.applyTo(this.backgroundDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstrainsForIcon(d dVar) {
        ConstraintSetExtKt.startToEnd(dVar, this.icon.getId(), this.text.getId(), DP_4);
        ConstraintSetExtKt.topToTop$default(dVar, this.icon.getId(), this.text.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.icon.getId(), this.text.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.icon.getId(), 0, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setConstrainsForTextView(d dVar) {
        ConstraintSetExtKt.startToStart$default(dVar, this.text.getId(), 0, 0, 4, null);
        int id2 = this.text.getId();
        int i11 = DP_8;
        ConstraintSetExtKt.topToTop(dVar, id2, 0, i11);
        ConstraintSetExtKt.bottomToBottom(dVar, this.text.getId(), 0, i11);
        ConstraintSetExtKt.endToStart$default(dVar, this.text.getId(), this.icon.getId(), 0, 4, null);
        dVar.C(this.text.getId(), true);
        dVar.c0(0.0f, this.text.getId());
    }

    private final void setSize(ButtonV3DTO.Sizes sizes) {
        this.size = sizes;
        float pxF = UiExtKt.toPxF(sizes.getCornerRadius());
        this.foregroundDrawable.setCornerRadius(pxF);
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
    }

    private final void setTitleColor(int i11) {
        this.titleColor = i11;
        this.text.setTextColor(i11);
        this.foregroundDrawable.setColor(this.titleColor);
    }

    private final void showHover() {
        if (isEnabled()) {
            setForeground(this.foregroundDrawable);
        }
    }

    public final void bindOrGone(RightIconButtonDTO dto, @NotNull Function1<? super AtomAction, Unit> onAction) {
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.boundedData = dto;
        if (dto == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        TextHolderKt.bind$default(this.text, dto.getText(), null, 2, null);
        IconHolderKt.bindOrGone$default(this.icon, dto.getIcon(), null, 2, null);
        this.actionHandler = onAction;
        CommonControlSettings common = dto.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, dto.getCommon().getTrackingInfo());
        this.action = atomAction;
        setEnabled(atomAction != null);
        setClickable(isEnabled());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, dto.getBackgroundColor());
        if (parseColor != null) {
            setBackColor(new Color.Solid(parseColor.intValue()));
        } else {
            setBackColor(new Color.Solid(a.getColor(getContext(), R$color.bg_secondary)));
        }
        Float valueOf = isEnabled() ? Float.valueOf(1.0f) : null;
        setAlpha(valueOf != null ? valueOf.floatValue() : 0.4f);
    }

    public final RightIconButtonDTO getBoundedData() {
        return this.boundedData;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            showHover();
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            hideHover();
        }
        return super.onTouchEvent(event);
    }

    public final void setSelectApp(boolean z11) {
        if (z11 != this.isSelectApp) {
            this.isSelectApp = z11;
            if (z11) {
                GradientDrawable gradientDrawable = this.foregroundDrawable;
                float f7 = RADIUS_16;
                gradientDrawable.setCornerRadius(f7);
                GradientDrawable gradientDrawable2 = this.backgroundDrawable;
                gradientDrawable2.setCornerRadius(f7);
                setBackground(gradientDrawable2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightIconButtonView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setAlpha(26);
        this.foregroundDrawable = gradientDrawable2;
        int color = a.getColor(context, R.color.transparent);
        this.transparentColor = color;
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_500;
        this.size = sizes;
        this.backColor = new Color.Solid(color);
        this.titleColor = color;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.text = textAtomV2View;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView);
        this.icon = iconView;
        setSize(sizes);
        applyStyle(ButtonV3DTOKt.getStyleTypesResource(ButtonV3DTO.StyleTypes.CUSTOM));
        setBackColor(new Color.Solid(a.getColor(context, R$color.bg_secondary)));
        setTitleColor(a.getColor(context, R$color.text_primary));
        setBackground(gradientDrawable);
        setPadding(DP_12, getPaddingTop(), DP_8, getPaddingBottom());
        ConstraintLayoutExtKt.updateConstraints(this, new AnonymousClass1());
        setOnClickListener(new CX.a(this, 7));
    }
}

package ru.ozon.app.android.uikit.view.atoms.cells.subtitled;

import Ax.ViewOnClickListenerC2451a;
import Sc.InterfaceC3999a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000fJ\u0019\u0010\u0017\u001a\u00020\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010+R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R\u0014\u0010:\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R(\u0010A\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/uikit/view/atoms/cells/subtitled/CellWithReverseSubtitleCounterView;", "Lru/ozon/app/android/uikit/view/atoms/cells/BaseCellWithSubtitleView;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isEnabled", "", "setEnabled", "(Z)V", "color", "setCounterTextColor", "(I)V", "setCounterBackgroundColor", "(Ljava/lang/Integer;)V", "hide", "hideDisclosure", "setDisclosureColor", "dp16", "I", "dp12", "dp8", "dp4", "dp2", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleTav", "counterTav", "Landroidx/appcompat/widget/AppCompatImageView;", "disclosureAciv", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "separator", "Landroid/view/View;", "actionViewId", "getActionViewId", "()I", "Lkotlin/Function0;", "onClickListener", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "getTitleTextAtomView", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "titleTextAtomView", "getSubtitleTextAtomView", "subtitleTextAtomView", "getSeparatorView", "()Landroid/view/View;", "separatorView", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getCounter", "()Ljava/lang/CharSequence;", "setCounter", "(Ljava/lang/CharSequence;)V", "counter", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithReverseSubtitleCounterView extends BaseCellWithSubtitleView implements AtomView {
    private final int actionViewId;

    @NotNull
    private final TextAtomView counterTav;

    @NotNull
    private final AppCompatImageView disclosureAciv;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp4;
    private final int dp8;
    private Function0<Unit> onClickListener;

    @NotNull
    private final View separator;

    @NotNull
    private final TextAtomView subtitleTav;

    @NotNull
    private final TextAtomView titleTav;

    public /* synthetic */ CellWithReverseSubtitleCounterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(CellWithReverseSubtitleCounterView cellWithReverseSubtitleCounterView, View view) {
        Function0<Unit> function0;
        if (!cellWithReverseSubtitleCounterView.isEnabled() || (function0 = cellWithReverseSubtitleCounterView.onClickListener) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    public int getActionViewId() {
        return this.actionViewId;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    @NotNull
    /* renamed from: getSeparatorView, reason: from getter */
    public View getSeparator() {
        return this.separator;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView
    @NotNull
    /* renamed from: getSubtitleTextAtomView, reason: from getter */
    public TextAtomView getSubtitleTav() {
        return this.subtitleTav;
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView
    @NotNull
    /* renamed from: getTitleTextAtomView, reason: from getter */
    public TextAtomView getTitleTav() {
        return this.titleTav;
    }

    public final void hideDisclosure(boolean hide) {
        ViewExtKt.showOrGone(this.disclosureAciv, Boolean.valueOf(!hide));
    }

    public final void setCounter(CharSequence charSequence) {
        TextAtomView textAtomView = this.counterTav;
        textAtomView.setText(charSequence);
        ViewExtKt.showOrGone(textAtomView, Boolean.valueOf(charSequence != null));
    }

    public final void setCounterBackgroundColor(Integer color) {
        if (color == null) {
            ViewExtKt.clearBackgroundTint(this.counterTav);
        } else {
            ViewExtKt.setBackgroundTint(this.counterTav, color.intValue());
        }
    }

    public final void setCounterTextColor(int color) {
        this.counterTav.setTextColor(color);
    }

    public final void setDisclosureColor(Integer color) {
        ThemeExtKt.tint(this.disclosureAciv, color);
    }

    @Override // ru.ozon.app.android.uikit.view.atoms.cells.BaseCellWithSubtitleView, ru.ozon.app.android.uikit.view.atoms.cells.BaseCellView, android.view.View
    public void setEnabled(boolean isEnabled) {
        super.setEnabled(isEnabled);
        setBackgroundResource(isEnabled ? R$drawable.ripple_rect_white_bluewave : R$color.oz_white_1);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithReverseSubtitleCounterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        int px2 = ResourceExtKt.toPx(12, context);
        this.dp12 = px2;
        int px3 = ResourceExtKt.toPx(8, context);
        this.dp8 = px3;
        int px4 = ResourceExtKt.toPx(4, context);
        this.dp4 = px4;
        int px5 = ResourceExtKt.toPx(2, context);
        this.dp2 = px5;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41662z = px2;
        textAtomView.setLayoutParams(bVar);
        textAtomView.setTextAppearance(R$style.TextStyle_Body_M_Secondary);
        this.titleTav = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView2.setId(View.generateViewId());
        textAtomView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        textAtomView2.setTextAppearance(R$style.TextStyle_Body_L);
        this.subtitleTav = textAtomView2;
        TextAtomView textAtomView3 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        textAtomView3.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, ResourceExtKt.toPx(20, context));
        bVar2.f41595B = px;
        textAtomView3.setLayoutParams(bVar2);
        textAtomView3.setGravity(17);
        textAtomView3.setPadding(px3, 0, px3, 0);
        textAtomView3.setBackground(textAtomView3.getResources().getDrawable(ru.ozon.app.android.uikit.R$drawable.bg_cell_counter, context.getTheme()));
        textAtomView3.setTextAppearance(R$style.TextStyle_Caption_Bold);
        this.counterTav = textAtomView3;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(px, px));
        appCompatImageView.setImageResource(ru.ozon.uni.core.R$drawable.ic_s_disclosure);
        this.disclosureAciv = appCompatImageView;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, ResourceExtKt.toPx(1, context)));
        view.setBackgroundColor(view.getResources().getColor(R$color.oz_semantic_separator, context.getTheme()));
        this.separator = view;
        this.actionViewId = appCompatImageView.getId();
        setOnClickListener(new ViewOnClickListenerC2451a(this, 15));
        addView(textAtomView);
        addView(textAtomView2);
        addView(textAtomView3);
        addView(appCompatImageView);
        addView(view);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.bottomToTop$default(dVar, textAtomView.getId(), textAtomView2.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, textAtomView.getId(), textAtomView3.getId(), px4);
        ConstraintSetExtKt.startToStart(dVar, textAtomView.getId(), 0, px);
        ConstraintSetExtKt.topToTop(dVar, textAtomView.getId(), 0, px2);
        ConstraintSetExtKt.bottomToBottom(dVar, textAtomView2.getId(), 0, px2);
        ConstraintSetExtKt.endToEnd$default(dVar, textAtomView2.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, textAtomView2.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom(dVar, textAtomView2.getId(), textAtomView.getId(), px5);
        ConstraintSetExtKt.bottomToBottom$default(dVar, textAtomView3.getId(), appCompatImageView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, textAtomView3.getId(), appCompatImageView.getId(), px4);
        ConstraintSetExtKt.topToTop$default(dVar, textAtomView3.getId(), appCompatImageView.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd(dVar, appCompatImageView.getId(), 0, px);
        ConstraintSetExtKt.topToTop$default(dVar, appCompatImageView.getId(), textAtomView.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, view.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, view.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, view.getId(), textAtomView.getId(), 0, 4, null);
        dVar.f(this);
    }
}

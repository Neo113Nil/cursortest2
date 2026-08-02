package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.view;

import Lc.a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.feature.general.booking.R$id;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ7\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001aj\u0002`\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 2\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u001aj\u0002`\u001c¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\rJ\r\u0010%\u001a\u00020\u000b¢\u0006\u0004\b%\u0010\rR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/view/HotelsBookAdditionsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "addViews", "()V", "placeViews", "setupTouchDelegate", "", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;", "hotelsBookAdditionsVO", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "bindButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lkotlin/jvm/functions/Function1;)V", "switchToCollapsed", "switchToExpanded", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleTav", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "buttonSibv", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "Landroidx/recyclerview/widget/RecyclerView;", "fieldsRv", "Landroidx/recyclerview/widget/RecyclerView;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookAdditionsView extends ConstraintLayout {

    @NotNull
    private final SmallIconButtonView buttonSibv;

    @NotNull
    private final RecyclerView fieldsRv;

    @NotNull
    private final TextAtomV2View subtitleTav;

    @NotNull
    private final TextAtomV2View titleTav;

    public /* synthetic */ HotelsBookAdditionsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void addViews() {
        addView(this.titleTav);
        addView(this.subtitleTav);
        addView(this.buttonSibv);
        addView(this.fieldsRv);
    }

    private final void placeViews() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int px = ResourceExtKt.toPx(8, context);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.startToStart$default(dVar, this.titleTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.titleTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.titleTav.getId(), this.buttonSibv.getId(), px);
        dVar.c0(0.0f, this.titleTav.getId());
        dVar.C(this.titleTav.getId(), true);
        ConstraintSetExtKt.startToStart$default(dVar, this.subtitleTav.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.subtitleTav.getId(), this.titleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.endToStart(dVar, this.subtitleTav.getId(), this.buttonSibv.getId(), px);
        dVar.c0(0.0f, this.subtitleTav.getId());
        dVar.C(this.subtitleTav.getId(), true);
        ConstraintSetExtKt.topToTop$default(dVar, this.buttonSibv.getId(), this.titleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.buttonSibv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.buttonSibv.getId(), this.subtitleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.fieldsRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.fieldsRv.getId(), this.subtitleTav.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.fieldsRv.getId(), 0, 0, 4, null);
        dVar.f(this);
    }

    private final void setupTouchDelegate() {
        if (getTouchDelegate() == null) {
            setTouchDelegate(new TouchDelegate(new Rect(0, 0, getWidth(), getPaddingBottom() + this.subtitleTav.getBottom()), this.buttonSibv));
        }
    }

    public final void bind(@NotNull HotelsBookAdditionsVO hotelsBookAdditionsVO, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(hotelsBookAdditionsVO, "hotelsBookAdditionsVO");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        TextHolderKt.bind$default(this.titleTav, hotelsBookAdditionsVO.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleTav, hotelsBookAdditionsVO.getSubtitle(), null, 2, null);
        if (hotelsBookAdditionsVO.getIsOpen()) {
            bindButton(hotelsBookAdditionsVO.getExpandedIconButton(), actionHandler);
            switchToExpanded();
        } else {
            bindButton(hotelsBookAdditionsVO.getCollapsedIconButton(), actionHandler);
            switchToCollapsed();
        }
    }

    public final void bindButton(@NotNull ButtonV3Atom.SmallIconButton button, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        WrappedIconButtonHolderKt.bind(this.buttonSibv, button, actionHandler);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        setupTouchDelegate();
    }

    public final void switchToCollapsed() {
        ViewExtKt.gone(this.fieldsRv);
    }

    public final void switchToExpanded() {
        ViewExtKt.show(this.fieldsRv);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsBookAdditionsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        q qVar = q.f64554a;
        TextAtomV2View textAtomV2View = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        a.d(textAtomV2View, R$id.hotelsBookAdditionsTitleTav, -2, -2, false);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) qVar.i(N.b(TextAtomV2View.class), context2);
        Context context3 = context2;
        textAtomV2View2 = textAtomV2View2 == null ? new TextAtomV2View(context3, null, 0, 6, null) : textAtomV2View2;
        a.d(textAtomV2View2, R$id.hotelsBookAdditionsSubtitleTav, -2, -2, false);
        this.subtitleTav = textAtomV2View2;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) qVar.g(N.b(SmallIconButtonView.class), context3);
        smallIconButtonView.setId(R$id.hotelsBookAdditionsButtonSibv);
        smallIconButtonView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.buttonSibv = smallIconButtonView;
        RecyclerView recyclerView = new RecyclerView(context3);
        recyclerView.setId(R$id.hotelsBookAdditionsFieldsRv);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        this.fieldsRv = recyclerView;
        addViews();
        placeViews();
    }
}

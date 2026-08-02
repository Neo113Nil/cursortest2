package ru.ozon.app.android.courieronmap.presentation.view;

import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.courieronmap.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0001HB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ/\u0010\"\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001e2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u000b2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000b0\u001f¢\u0006\u0004\b)\u0010*J\u001b\u0010.\u001a\u00020\u000b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00102\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00102\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/view/CourierInfoViewV1;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/courieronmap/presentation/view/CourierInfoViewListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initView", "()V", "setupConstraints", "getHeaderHeight", "()I", "Lkotlin/Pair;", "getCallCourierContainerParams", "()Lkotlin/Pair;", "", "x", "y", "setPositionToCourierContainer", "(Ljava/lang/Float;Ljava/lang/Float;)V", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "dto", "bindCourierTitle", "(Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "bindCourierSubtitle", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onAction", "bindCourierCourierCallButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Lkotlin/jvm/functions/Function1;)V", "Landroidx/recyclerview/widget/RecyclerView$n;", "decor", "addItemDecorationToCourierInfoScrollVRC", "(Landroidx/recyclerview/widget/RecyclerView$n;)V", "actionHandler", "addActionHandlerToCourierInfoScrollVRC", "(Lkotlin/jvm/functions/Function1;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "list", "bindCourierInfoScrollVRC", "(Ljava/util/List;)V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "courierTitleTv$delegate", "LSc/j;", "getCourierTitleTv", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "courierTitleTv", "courierSubtitleTv$delegate", "getCourierSubtitleTv", "courierSubtitleTv", "Lru/ozon/app/android/atoms/v3/containers/VerticalRecyclerContainer;", "courierInfoScrollVRC$delegate", "getCourierInfoScrollVRC", "()Lru/ozon/app/android/atoms/v3/containers/VerticalRecyclerContainer;", "courierInfoScrollVRC", "Landroid/widget/FrameLayout;", "callCourierContainer$delegate", "getCallCourierContainer", "()Landroid/widget/FrameLayout;", "callCourierContainer", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "callCourierBtn$delegate", "getCallCourierBtn", "()Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/LargeButtonView;", "callCourierBtn", "Companion", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CourierInfoViewV1 extends ConstraintLayout implements CourierInfoViewListener {

    /* renamed from: callCourierBtn$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j callCourierBtn;

    /* renamed from: callCourierContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j callCourierContainer;

    /* renamed from: courierInfoScrollVRC$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j courierInfoScrollVRC;

    /* renamed from: courierSubtitleTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j courierSubtitleTv;

    /* renamed from: courierTitleTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j courierTitleTv;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MARGIN_8 = ResourceExtKt.toPx(8);
    private static final int MARGIN_13 = ResourceExtKt.toPx(13);
    private static final int MARGIN_16 = ResourceExtKt.toPx(16);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/courieronmap/presentation/view/CourierInfoViewV1$Companion;", "", "<init>", "()V", "MARGIN_8", "", "getMARGIN_8", "()I", "MARGIN_13", "getMARGIN_13", "MARGIN_16", "getMARGIN_16", "courieronmap_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getMARGIN_13() {
            return CourierInfoViewV1.MARGIN_13;
        }

        public final int getMARGIN_16() {
            return CourierInfoViewV1.MARGIN_16;
        }

        public final int getMARGIN_8() {
            return CourierInfoViewV1.MARGIN_8;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CourierInfoViewV1(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final LargeButtonView getCallCourierBtn() {
        return (LargeButtonView) this.callCourierBtn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getCallCourierContainer() {
        return (FrameLayout) this.callCourierContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerticalRecyclerContainer getCourierInfoScrollVRC() {
        return (VerticalRecyclerContainer) this.courierInfoScrollVRC.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getCourierSubtitleTv() {
        return (TextAtomView) this.courierSubtitleTv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextAtomView getCourierTitleTv() {
        return (TextAtomView) this.courierTitleTv.getValue();
    }

    private final void initView() {
        int i11 = MARGIN_16;
        setPadding(i11, i11, i11, 0);
        setBackgroundResource(R$drawable.bg_bottom_sheet_courier_info);
        setClickable(true);
        setFocusable(true);
        addView(getCourierTitleTv());
        addView(getCourierSubtitleTv());
        addView(getCourierInfoScrollVRC());
        addView(getCallCourierContainer());
        getCallCourierContainer().addView(getCallCourierBtn());
    }

    private final void setupConstraints() {
        ConstraintLayoutExtKt.updateConstraints(this, new CourierInfoViewV1$setupConstraints$1(this));
    }

    public final void addActionHandlerToCourierInfoScrollVRC(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getCourierInfoScrollVRC().setOnAction(actionHandler);
    }

    public final void addItemDecorationToCourierInfoScrollVRC(@NotNull RecyclerView.n decor) {
        Intrinsics.checkNotNullParameter(decor, "decor");
        getCourierInfoScrollVRC().addItemDecoration(decor);
    }

    public final void bindCourierCourierCallButton(ButtonV3Atom.LargeButton dto, Function1<? super AtomAction, Unit> onAction) {
        LargeButtonHolderKt.bindOrGone(getCallCourierBtn(), dto, onAction);
    }

    public final void bindCourierInfoScrollVRC(@NotNull List<? extends AtomDTO> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        getCourierInfoScrollVRC().bind(list);
    }

    public final void bindCourierSubtitle(TextAtom dto) {
        TextAtomHolderKt.bindOrGone$default(getCourierSubtitleTv(), dto, null, 2, null);
    }

    public final void bindCourierTitle(TextAtom dto) {
        TextAtomHolderKt.bindOrGone$default(getCourierTitleTv(), dto, null, 2, null);
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewListener
    @NotNull
    public Pair<Integer, Integer> getCallCourierContainerParams() {
        return new Pair<>(Integer.valueOf(getCallCourierContainer().getWidth()), Integer.valueOf(getCallCourierContainer().getHeight()));
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewListener
    public int getHeaderHeight() {
        int i11 = 0;
        for (TextAtomView textAtomView : C7714v.b0(getCourierTitleTv(), getCourierSubtitleTv())) {
            ViewGroup.LayoutParams layoutParams = textAtomView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i11 += textAtomView.getHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + MARGIN_8;
        }
        return i11;
    }

    @Override // ru.ozon.app.android.courieronmap.presentation.view.CourierInfoViewListener
    public void setPositionToCourierContainer(Float x11, Float y11) {
        if (x11 != null) {
            getCallCourierContainer().setX(x11.floatValue());
        }
        if (y11 != null) {
            getCallCourierContainer().setY(y11.floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourierInfoViewV1(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.courierTitleTv = k.b(new CourierInfoViewV1$courierTitleTv$2(context));
        this.courierSubtitleTv = k.b(new CourierInfoViewV1$courierSubtitleTv$2(context));
        this.courierInfoScrollVRC = k.b(new CourierInfoViewV1$courierInfoScrollVRC$2(context));
        this.callCourierContainer = k.b(new CourierInfoViewV1$callCourierContainer$2(context));
        this.callCourierBtn = k.b(new CourierInfoViewV1$callCourierBtn$2(context));
        initView();
        setupConstraints();
    }
}

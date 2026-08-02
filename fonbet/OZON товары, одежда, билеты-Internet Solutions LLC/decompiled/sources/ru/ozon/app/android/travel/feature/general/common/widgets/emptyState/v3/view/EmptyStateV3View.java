package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.view;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.recyclerview.widget.m;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.EmptyStateV3VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.decorator.EmptyStateV3ButtonsDecoration;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.util.EmptyStateV3ShowLoaderHelperKt;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u0014\u0010.\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010&R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010&R\u0014\u00103\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u0014\u00104\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010&R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010<\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b;\u00107¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/view/EmptyStateV3View;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "applyCenterIfSpace", "()V", "applyFixedBottomButtons", "applyFixedBottomPlaceholderAndButtons", "Landroid/widget/Space;", "createSpacer", "()Landroid/widget/Space;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/presentation/EmptyStateV3VO;Lkotlin/jvm/functions/Function1;)V", "", "buttonId", "showButtonLoader", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "clearButtonId", "hideButtonLoader", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "", "dp16", "I", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "placeholderAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Landroid/view/View;", "topSpacer", "Landroid/view/View;", "Lru/ozon/uni/android/atom/image/Image;", "imageView", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "messageTav", "placeholderSpacer", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "placeholderView", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buttonsSpacer", "buttonsLayout", "bottomSpacer", "Landroid/view/ViewGroup;", "getRoot", "()Landroid/view/ViewGroup;", "root", "getContentView", "contentView", "getButtons", "buttons", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3View extends LinearLayout {

    @NotNull
    private final View bottomSpacer;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final VerticalAtomsLayout buttonsLayout;

    @NotNull
    private final View buttonsSpacer;
    private final int dp16;

    @NotNull
    private final Image imageView;

    @NotNull
    private final TextAtomV2View messageTav;

    @NotNull
    private final AtomsAdapter placeholderAdapter;

    @NotNull
    private final View placeholderSpacer;

    @NotNull
    private final VerticalAtomsLayout placeholderView;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private final View topSpacer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmptyStateV3VO.LayoutType.values().length];
            try {
                iArr[EmptyStateV3VO.LayoutType.CENTER_IF_SPACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmptyStateV3VO.LayoutType.FIXED_BOTTOM_BUTTONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmptyStateV3VO.LayoutType.FIXED_BOTTOM_PLACEHOLDER_AND_BUTTONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV3View(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.placeholderAdapter = atomsAdapter;
        AtomsAdapter atomsAdapter2 = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter2;
        Space createSpacer = createSpacer();
        addView(createSpacer);
        this.topSpacer = createSpacer;
        q qVar = q.f64554a;
        Image image = (Image) qVar.i(N.b(Image.class), context);
        if (image == null) {
            context2 = context;
            image = new Image(context, null, 0, 6, null);
        } else {
            context2 = context;
        }
        image.setId(100);
        image.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        addView(image);
        this.imageView = image;
        View g10 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View = (TextAtomV2View) g10;
        textAtomV2View.setId(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        textAtomV2View.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(g10);
        this.titleTav = textAtomV2View;
        View g11 = qVar.g(N.b(TextAtomV2View.class), context2);
        TextAtomV2View textAtomV2View2 = (TextAtomV2View) g11;
        textAtomV2View2.setId(300);
        textAtomV2View2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textAtomV2View2.setTextIsSelectable(false);
        addView(g11);
        this.messageTav = textAtomV2View2;
        Space createSpacer2 = createSpacer();
        addView(createSpacer2);
        this.placeholderSpacer = createSpacer2;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context2, null, 0, 6, null);
        verticalAtomsLayout.setId(CounterView.COUNTER_MAX_DEFAULT);
        verticalAtomsLayout.setOrientation(1);
        verticalAtomsLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        verticalAtomsLayout.setAdapter(atomsAdapter);
        addView(verticalAtomsLayout);
        this.placeholderView = verticalAtomsLayout;
        Space createSpacer3 = createSpacer();
        addView(createSpacer3);
        this.buttonsSpacer = createSpacer3;
        VerticalAtomsLayout verticalAtomsLayout2 = new VerticalAtomsLayout(context2, null, 0, 6, null);
        verticalAtomsLayout2.setId(400);
        verticalAtomsLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        verticalAtomsLayout2.setNestedScrollingEnabled(false);
        verticalAtomsLayout2.setDecorator(new EmptyStateV3ButtonsDecoration(context2));
        verticalAtomsLayout2.setAdapter(atomsAdapter2);
        verticalAtomsLayout2.setPadding(px, px, px, 0);
        addView(verticalAtomsLayout2);
        this.buttonsLayout = verticalAtomsLayout2;
        Space createSpacer4 = createSpacer();
        addView(createSpacer4);
        this.bottomSpacer = createSpacer4;
        setOrientation(1);
        setGravity(1);
    }

    private final void applyCenterIfSpace() {
        ViewExtKt.show(this.topSpacer);
        ViewExtKt.gone(this.placeholderSpacer);
        ViewExtKt.gone(this.buttonsSpacer);
        ViewExtKt.show(this.bottomSpacer);
    }

    private final void applyFixedBottomButtons() {
        ViewExtKt.show(this.topSpacer);
        ViewExtKt.gone(this.placeholderSpacer);
        ViewExtKt.show(this.buttonsSpacer);
        ViewExtKt.gone(this.bottomSpacer);
    }

    private final void applyFixedBottomPlaceholderAndButtons() {
        ViewExtKt.show(this.topSpacer);
        ViewExtKt.show(this.placeholderSpacer);
        ViewExtKt.gone(this.buttonsSpacer);
        ViewExtKt.gone(this.bottomSpacer);
    }

    private final Space createSpacer() {
        Space space = new Space(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.weight = 1.0f;
        space.setLayoutParams(layoutParams);
        return space;
    }

    public final void bind(@NotNull EmptyStateV3VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        ImageHolderKt.bindOrGone$default(this.imageView, item.getImage(), null, 2, null);
        TextHolderKt.bind$default(this.titleTav, item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.messageTav, item.getMessage(), null, 2, null);
        List<ButtonV3DTO> buttons = item.getButtons();
        if (buttons != null) {
            AtomsAdapter atomsAdapter = this.buttonsAdapter;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, buttons);
        }
        this.buttonsAdapter.setOnAction(actionHandler);
        int i11 = WhenMappings.$EnumSwitchMapping$0[item.getLayoutType().ordinal()];
        if (i11 == 1) {
            applyCenterIfSpace();
        } else if (i11 == 2) {
            applyFixedBottomButtons();
        } else {
            if (i11 != 3) {
                throw new o();
            }
            applyFixedBottomPlaceholderAndButtons();
        }
    }

    @NotNull
    public final ViewGroup getButtons() {
        return this.buttonsLayout;
    }

    @NotNull
    public final ViewGroup getContentView() {
        return this.placeholderView;
    }

    @NotNull
    public final ViewGroup getRoot() {
        return this;
    }

    public final void hideButtonLoader(String buttonId, @NotNull Function0<Unit> clearButtonId) {
        Intrinsics.checkNotNullParameter(clearButtonId, "clearButtonId");
        EmptyStateV3ShowLoaderHelperKt.hideLoader(getRoot(), getButtons(), buttonId);
        clearButtonId.invoke();
    }

    public final void showButtonLoader(String buttonId) {
        EmptyStateV3ShowLoaderHelperKt.showLoader(getRoot(), getButtons(), buttonId);
    }
}

package ru.ozon.app.android.travel.molecules.view.emptyState.v2;

import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.ui.molecules.R$id;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2View;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/BaseEmptyStateV2View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2VO;Lkotlin/jvm/functions/Function1;)V", "addViews", "()V", "", "isButtonsBottom", "setButtonsBottomPosition", "(Z)V", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter$delegate", "LSc/j;", "getButtonsAdapter", "()Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Landroid/widget/Space;", "topSpacer", "Landroid/widget/Space;", "spacer", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "buttonsVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyStateV2View extends BaseEmptyStateV2View {

    /* renamed from: buttonsAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonsAdapter;

    @NotNull
    private final VerticalAtomsLayout buttonsVAL;

    @NotNull
    private final Space spacer;

    @NotNull
    private final Space topSpacer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v2/EmptyStateV2View$Companion;", "", "<init>", "()V", "WRAP_CONSTRAINT", "", "WEIGHT_EXPAND", "", "WEIGHT_COLLAPSE", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateV2View(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonsAdapter = LazyUtilsKt.unsafeLazy(EmptyStateV2View$buttonsAdapter$2.INSTANCE);
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(-2, 0));
        this.topSpacer = space;
        Space space2 = new Space(context);
        space2.setLayoutParams(new LinearLayout.LayoutParams(-2, 0));
        this.spacer = space2;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(R$id.emptyStateV2buttonsVAL);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ResourceExtKt.toPx(16, context);
        layoutParams.gravity = 1;
        verticalAtomsLayout.setLayoutParams(layoutParams);
        verticalAtomsLayout.setAdapter(getButtonsAdapter());
        verticalAtomsLayout.setDecorator(new EmptyStateV2Decoration(context));
        this.buttonsVAL = verticalAtomsLayout;
        addViews();
    }

    private final AtomsAdapter getButtonsAdapter() {
        return (AtomsAdapter) this.buttonsAdapter.getValue();
    }

    @Override // ru.ozon.app.android.travel.molecules.view.emptyState.v2.BaseEmptyStateV2View
    protected void addViews() {
        addView(this.topSpacer);
        super.addViews();
        addView(this.spacer);
        addView(this.buttonsVAL);
    }

    @Override // ru.ozon.app.android.travel.molecules.view.emptyState.v2.BaseEmptyStateV2View
    public void bind(@NotNull EmptyStateV2VO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind(item, onAction);
        this.buttonsVAL.setVisibility(item.getIsButtonsVisible() ? 0 : 8);
        AtomsAdapter buttonsAdapter = getButtonsAdapter();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        buttonsAdapter.bind(context, item.getButtons());
        getButtonsAdapter().setOnAction(onAction);
    }

    public final void setButtonsBottomPosition(boolean isButtonsBottom) {
        VerticalAtomsLayout verticalAtomsLayout = this.buttonsVAL;
        ViewGroup.LayoutParams layoutParams = verticalAtomsLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = isButtonsBottom ? -1 : -2;
        verticalAtomsLayout.setLayoutParams(layoutParams);
        Space space = this.spacer;
        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        layoutParams3.weight = isButtonsBottom ? 1.0f : 0.0f;
        space.setLayoutParams(layoutParams3);
        Space space2 = this.topSpacer;
        ViewGroup.LayoutParams layoutParams4 = space2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.weight = isButtonsBottom ? 1.0f : 0.0f;
        space2.setLayoutParams(layoutParams5);
    }
}

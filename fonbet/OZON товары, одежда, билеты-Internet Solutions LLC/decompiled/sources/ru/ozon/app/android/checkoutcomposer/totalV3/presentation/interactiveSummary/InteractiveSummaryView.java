package ru.ozon.app.android.checkoutcomposer.totalV3.presentation.interactiveSummary;

import Ey.ViewOnClickListenerC2975b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3VO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ&\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015J\b\u0010\u001e\u001a\u00020\u0017H\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleIconView", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryTitleIconView;", "getTitleIconView", "()Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryTitleIconView;", "subtitleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getSubtitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "infoView", "getInfoView", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "commonControls", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "bind", "dto", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3VO$InteractiveSummaryVO;", "onAction", "addTitleIconView", "addSubtitleView", "addInfoView", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InteractiveSummaryView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private CommonControlSettings commonControls;

    @NotNull
    private final TextAtomV2View infoView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final InteractiveSummaryTitleIconView titleIconView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DP_4 = UiExtKt.toPx(4);

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/interactiveSummary/InteractiveSummaryView$Companion;", "", "<init>", "()V", "DP_4", "", "getDP_4", "()I", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDP_4() {
            return InteractiveSummaryView.DP_4;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InteractiveSummaryView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(InteractiveSummaryView interactiveSummaryView, View view) {
        AtomAction atomAction;
        Function1<? super AtomAction, Unit> function1;
        CommonControlSettings commonControlSettings = interactiveSummaryView.commonControls;
        if (commonControlSettings == null || (atomAction = commonControlSettings.toAtomAction()) == null || (function1 = interactiveSummaryView.actionHandler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }

    private final void addInfoView() {
        addView(this.infoView);
        ConstraintLayoutExtKt.updateConstraints(this, new InteractiveSummaryView$addInfoView$1(this));
        TextAtomV2View textAtomV2View = this.infoView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41599F = 0.0f;
        textAtomV2View.setLayoutParams(bVar);
    }

    private final void addSubtitleView() {
        addView(this.subtitleView);
        ConstraintLayoutExtKt.updateConstraints(this, new InteractiveSummaryView$addSubtitleView$1(this));
        TextAtomV2View textAtomV2View = this.subtitleView;
        ViewGroup.LayoutParams layoutParams = textAtomV2View.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41598E = 0.0f;
        textAtomV2View.setLayoutParams(bVar);
    }

    private final void addTitleIconView() {
        addView(this.titleIconView);
        ConstraintLayoutExtKt.updateConstraints(this, new InteractiveSummaryView$addTitleIconView$1(this));
        InteractiveSummaryTitleIconView interactiveSummaryTitleIconView = this.titleIconView;
        ViewGroup.LayoutParams layoutParams = interactiveSummaryTitleIconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41603J = 1;
        bVar.f41598E = 0.0f;
        interactiveSummaryTitleIconView.setLayoutParams(bVar);
    }

    public final void bind(@NotNull TotalV3VO.InteractiveSummaryVO dto, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.titleIconView.bind(dto.getTitle(), dto.getIcon());
        TextHolderKt.bindOrGone$default(this.subtitleView, dto.getSubtitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.infoView, dto.getInfo(), null, 2, null);
        this.actionHandler = onAction;
        this.commonControls = dto.getCommon();
    }

    @NotNull
    public final TextAtomV2View getInfoView() {
        return this.infoView;
    }

    @NotNull
    public final TextAtomV2View getSubtitleView() {
        return this.subtitleView;
    }

    @NotNull
    public final InteractiveSummaryTitleIconView getTitleIconView() {
        return this.titleIconView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveSummaryView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        InteractiveSummaryTitleIconView interactiveSummaryTitleIconView = new InteractiveSummaryTitleIconView(context, null, 0, 6, null);
        interactiveSummaryTitleIconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        interactiveSummaryTitleIconView.setId(View.generateViewId());
        this.titleIconView = interactiveSummaryTitleIconView;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setTextIsSelectable(false);
        this.subtitleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View2.setId(View.generateViewId());
        textAtomV2View2.setTextIsSelectable(false);
        this.infoView = textAtomV2View2;
        int i12 = DP_4;
        ViewExtKt.updatePadding$default(this, 0, i12, 0, i12, 5, null);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        addTitleIconView();
        addSubtitleView();
        addInfoView();
        setOnClickListener(new ViewOnClickListenerC2975b(this, 11));
    }
}

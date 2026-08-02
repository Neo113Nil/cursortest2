package ru.ozon.app.android.returns.list.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/list/presentation/views/ReturnHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "dp1", "dp8", "dp11", "dp14", "dp16", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "getSubtitleView", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "separatorView", "Landroid/view/View;", "getSeparatorView", "()Landroid/view/View;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnHeaderView extends ConstraintLayout {
    private final int dp1;
    private final int dp11;
    private final int dp14;
    private final int dp16;
    private final int dp8;

    @NotNull
    private final IconView iconView;

    @NotNull
    private final View separatorView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;

    public /* synthetic */ ReturnHeaderView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    @NotNull
    public final IconView getIconView() {
        return this.iconView;
    }

    @NotNull
    public final View getSeparatorView() {
        return this.separatorView;
    }

    @NotNull
    public final TextAtomV2View getSubtitleView() {
        return this.subtitleView;
    }

    @NotNull
    public final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnHeaderView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(1, context);
        this.dp1 = px;
        int px2 = ResourceExtKt.toPx(8, context);
        this.dp8 = px2;
        int px3 = ResourceExtKt.toPx(11, context);
        this.dp11 = px3;
        int px4 = ResourceExtKt.toPx(14, context);
        this.dp14 = px4;
        int px5 = ResourceExtKt.toPx(16, context);
        this.dp16 = px5;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        textAtomV2View2.setLayoutParams(new ConstraintLayout.b(-2, -2));
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(View.generateViewId());
        iconView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        addView(iconView);
        this.iconView = iconView;
        View view = new View(context);
        view.setId(View.generateViewId());
        view.setLayoutParams(new ConstraintLayout.b(0, px));
        addView(view);
        this.separatorView = view;
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.endToEnd(dVar, iconView.getId(), 0, px5);
        ConstraintSetExtKt.topToTop(dVar, iconView.getId(), 0, px5);
        ConstraintSetExtKt.startToStart(dVar, textAtomV2View.getId(), 0, px5);
        ConstraintSetExtKt.endToStart$default(dVar, textAtomV2View.getId(), iconView.getId(), 0, 4, null);
        ConstraintSetExtKt.topToTop(dVar, textAtomV2View.getId(), 0, px5);
        ConstraintSetExtKt.bottomToTop$default(dVar, textAtomV2View.getId(), textAtomV2View2.getId(), 0, 4, null);
        dVar.Z(textAtomV2View.getId(), 4, px2);
        dVar.C(textAtomV2View.getId(), true);
        dVar.c0(0.0f, textAtomV2View.getId());
        ConstraintSetExtKt.startToStart(dVar, textAtomV2View2.getId(), 0, px5);
        ConstraintSetExtKt.endToEnd(dVar, textAtomV2View2.getId(), 0, px5);
        ConstraintSetExtKt.topToBottom$default(dVar, textAtomV2View2.getId(), textAtomV2View.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToTop$default(dVar, textAtomV2View2.getId(), view.getId(), 0, 4, null);
        dVar.C(textAtomV2View2.getId(), true);
        dVar.c0(0.0f, textAtomV2View2.getId());
        ConstraintSetExtKt.startToStart(dVar, view.getId(), 0, px5);
        ConstraintSetExtKt.endToEnd(dVar, view.getId(), 0, px5);
        ConstraintSetExtKt.topToBottom(dVar, view.getId(), textAtomV2View2.getId(), px3);
        ConstraintSetExtKt.bottomToBottom(dVar, view.getId(), 0, px4);
        dVar.f(this);
    }
}

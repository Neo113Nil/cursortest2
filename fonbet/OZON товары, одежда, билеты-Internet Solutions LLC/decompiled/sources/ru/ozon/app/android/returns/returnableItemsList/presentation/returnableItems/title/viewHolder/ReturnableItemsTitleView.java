package ru.ozon.app.android.returns.returnableItemsList.presentation.returnableItems.title.viewHolder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.R$id;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/returnableItemsList/presentation/returnableItems/title/viewHolder/ReturnableItemsTitleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "titleMarginHorizontal", "subTitleMarginHorizontal", "titleTv", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getTitleTv", "()Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "subtitleIconIv", "Landroidx/appcompat/widget/AppCompatImageView;", "getSubtitleIconIv", "()Landroidx/appcompat/widget/AppCompatImageView;", "subtitleTv", "getSubtitleTv", "setupConstraints", "", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnableItemsTitleView extends ConstraintLayout {
    private final int subTitleMarginHorizontal;

    @NotNull
    private final AppCompatImageView subtitleIconIv;

    @NotNull
    private final TextAtomView subtitleTv;
    private final int titleMarginHorizontal;

    @NotNull
    private final TextAtomView titleTv;

    public /* synthetic */ ReturnableItemsTitleView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.titleTv);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.titleTv);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.titleTv);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, this.subtitleIconIv, this.subtitleTv);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.subtitleIconIv);
        ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, this.subtitleIconIv, this.subtitleTv);
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.subtitleTv);
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(dVar, this.subtitleTv, this.titleTv);
        ConstraintSetExtKt.layoutConstraintStartToEndOf(dVar, this.subtitleTv, this.subtitleIconIv);
        dVar.f(this);
    }

    @NotNull
    public final AppCompatImageView getSubtitleIconIv() {
        return this.subtitleIconIv;
    }

    @NotNull
    public final TextAtomView getSubtitleTv() {
        return this.subtitleTv;
    }

    @NotNull
    public final TextAtomView getTitleTv() {
        return this.titleTv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnableItemsTitleView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.titleMarginHorizontal = px;
        int px2 = ResourceExtKt.toPx(16, context);
        this.subTitleMarginHorizontal = px2;
        TextAtomView textAtomView = new TextAtomView(context, null, 0, 6, null);
        textAtomView.setId(View.generateViewId());
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.setMargins(px, ((ViewGroup.MarginLayoutParams) bVar).topMargin, px, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin);
        textAtomView.setLayoutParams(bVar);
        textAtomView.setTextColorOrDefault(Integer.valueOf(ThemeExtKt.themeColor(context, R$attr.textPrimary)));
        this.titleTv = textAtomView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(-2, -2);
        bVar2.setMargins(px2, ((ViewGroup.MarginLayoutParams) bVar2).topMargin, ((ViewGroup.MarginLayoutParams) bVar2).rightMargin, ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin);
        appCompatImageView.setLayoutParams(bVar2);
        this.subtitleIconIv = appCompatImageView;
        TextAtomView textAtomView2 = new TextAtomView(context, null, 0, 6, null);
        textAtomView2.setId(View.generateViewId());
        ConstraintLayout.b bVar3 = new ConstraintLayout.b(0, -2);
        int px3 = ResourceExtKt.toPx(6, context);
        int px4 = ResourceExtKt.toPx(4, context);
        int i13 = ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
        bVar3.setMarginStart(px3);
        ((ViewGroup.MarginLayoutParams) bVar3).topMargin = px4;
        bVar3.setMarginEnd(px2);
        ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin = i13;
        bVar3.f41594A = px2;
        textAtomView2.setLayoutParams(bVar3);
        this.subtitleTv = textAtomView2;
        setId(R$id.rerurnableItemTitleCl);
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        addView(textAtomView);
        addView(appCompatImageView);
        addView(textAtomView2);
        setupConstraints();
    }
}

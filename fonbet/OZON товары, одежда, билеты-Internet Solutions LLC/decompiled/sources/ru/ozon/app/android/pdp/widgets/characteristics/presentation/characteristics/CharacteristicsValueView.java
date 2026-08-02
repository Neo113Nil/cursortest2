package ru.ozon.app.android.pdp.widgets.characteristics.presentation.characteristics;

import Bi.b;
import D40.a;
import F3.G;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/characteristics/CharacteristicsValueView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "titleTav", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleTav", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "valueTav", "getValueTav", "copyButtonIv", "Landroid/widget/ImageView;", "getCopyButtonIv", "()Landroid/widget/ImageView;", "middleGuideline", "Landroidx/constraintlayout/widget/Guideline;", "clickableAreaL", "Landroid/view/View;", "getClickableAreaL", "()Landroid/view/View;", "setupConstraints", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsValueView extends ConstraintLayout {

    @NotNull
    private final View clickableAreaL;

    @NotNull
    private final ImageView copyButtonIv;

    @NotNull
    private final Guideline middleGuideline;

    @NotNull
    private final TextAtomV2View titleTav;

    @NotNull
    private final TextAtomV2View valueTav;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CharacteristicsValueView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        G.g(textAtomV2View, R$id.titleTav, 0, -2);
        this.titleTav = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        ConstraintLayout.b d11 = b.d(textAtomV2View2, R$id.valueTav, -2, -2);
        d11.f41616W = true;
        d11.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d11);
        textAtomV2View2.setTextIsSelectable(false);
        this.valueTav = textAtomV2View2;
        ImageView imageView = new ImageView(context);
        imageView.setId(R$id.characteristicsCopyButtonIv);
        Dimens dimens = Dimens.INSTANCE;
        imageView.setLayoutParams(new ConstraintLayout.b(dimens.getDP_16(), dimens.getDP_16()));
        this.copyButtonIv = imageView;
        Guideline guideline = new Guideline(context);
        ConstraintLayout.b a11 = a.a(guideline, R$id.middleGuideline, -2, -2);
        a11.f41615V = 1;
        a11.f41624c = 0.5f;
        guideline.setLayoutParams(a11);
        this.middleGuideline = guideline;
        View view = new View(context);
        view.setId(R$id.clickableAreaL);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.clickableAreaL = view;
        ViewGroup.LayoutParams bVar = new ConstraintLayout.b(-1, -2);
        setPadding(getPaddingLeft(), dimens.getDP_12(), getPaddingRight(), dimens.getDP_12());
        setLayoutParams(bVar);
        addView(textAtomV2View);
        addView(textAtomV2View2);
        addView(imageView);
        addView(guideline);
        addView(view);
        setupConstraints();
    }

    private final void setupConstraints() {
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, this.titleTav.getId());
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.titleTav.getId());
        int id2 = this.titleTav.getId();
        int id3 = this.middleGuideline.getId();
        Dimens dimens = Dimens.INSTANCE;
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToStart(dVar, id2, id3, dimens.getDP_8());
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.valueTav.getId());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd$default(dVar, this.valueTav.getId(), this.middleGuideline.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.endToEnd(dVar, this.valueTav.getId(), 0, dimens.getDP_6() + dimens.getDP_16());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd(dVar, this.copyButtonIv.getId(), this.valueTav.getId(), dimens.getDP_4());
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.topToTop$default(dVar, this.copyButtonIv.getId(), this.valueTav.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.bottomToBottom$default(dVar, this.copyButtonIv.getId(), this.valueTav.getId(), 0, 4, null);
        ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt.startToEnd$default(dVar, this.clickableAreaL.getId(), this.middleGuideline.getId(), 0, 4, null);
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, this.clickableAreaL.getId());
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, this.clickableAreaL.getId());
        ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, this.clickableAreaL.getId());
        dVar.f(this);
    }

    @NotNull
    public final View getClickableAreaL() {
        return this.clickableAreaL;
    }

    @NotNull
    public final ImageView getCopyButtonIv() {
        return this.copyButtonIv;
    }

    @NotNull
    public final TextAtomV2View getTitleTav() {
        return this.titleTav;
    }

    @NotNull
    public final TextAtomV2View getValueTav() {
        return this.valueTav;
    }
}

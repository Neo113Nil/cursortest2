package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import android.widget.Space;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.ui.favoriteMoleculeV4.view.ProductFavoriteMoleculeV4ButtonView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes9.dex */
final class FlightDetailsTitleView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ FlightDetailsTitleView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlightDetailsTitleView$setupConstraints$1(FlightDetailsTitleView flightDetailsTitleView) {
        super(1);
        this.this$0 = flightDetailsTitleView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        TextAtomV2View titleTav;
        int i11;
        TextAtomV2View titleTav2;
        int i12;
        TextAtomV2View titleTav3;
        IconButtonV3View sharingButtonIbv;
        int i13;
        TextAtomV2View titleTav4;
        int i14;
        TextAtomV2View subtitleTav;
        TextAtomV2View titleTav5;
        int i15;
        TextAtomV2View subtitleTav2;
        TextAtomV2View titleTav6;
        TextAtomV2View subtitleTav3;
        IconButtonV3View sharingButtonIbv2;
        int i16;
        TextAtomV2View subtitleTav4;
        int i17;
        IconButtonV3View sharingButtonIbv3;
        TextAtomV2View titleTav7;
        IconButtonV3View sharingButtonIbv4;
        IconButtonV3View favoriteIconButtonIbv;
        IconButtonV3View sharingButtonIbv5;
        TextAtomV2View titleTav8;
        IconButtonV3View favoriteIconButtonIbv2;
        TextAtomV2View titleTav9;
        IconButtonV3View favoriteIconButtonIbv3;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView;
        IconButtonV3View favoriteIconButtonIbv4;
        TextAtomV2View titleTav10;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView2;
        TextAtomV2View titleTav11;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView3;
        Space space;
        ProductFavoriteMoleculeV4ButtonView productFavoriteMoleculeV4ButtonView4;
        TextAtomV2View titleTav12;
        Space space2;
        TextAtomV2View titleTav13;
        Space space3;
        int i18;
        Space space4;
        TextAtomV2View titleTav14;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        titleTav = this.this$0.getTitleTav();
        i11 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, titleTav, i11);
        titleTav2 = this.this$0.getTitleTav();
        i12 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, titleTav2, i12);
        titleTav3 = this.this$0.getTitleTav();
        sharingButtonIbv = this.this$0.getSharingButtonIbv();
        i13 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, titleTav3, sharingButtonIbv, i13);
        titleTav4 = this.this$0.getTitleTav();
        int id2 = titleTav4.getId();
        i14 = this.this$0.dp16;
        applyConstraint.Z(id2, 7, i14);
        subtitleTav = this.this$0.getSubtitleTav();
        titleTav5 = this.this$0.getTitleTav();
        i15 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, subtitleTav, titleTav5, i15);
        subtitleTav2 = this.this$0.getSubtitleTav();
        titleTav6 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, subtitleTav2, titleTav6);
        subtitleTav3 = this.this$0.getSubtitleTav();
        sharingButtonIbv2 = this.this$0.getSharingButtonIbv();
        i16 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, subtitleTav3, sharingButtonIbv2, i16);
        subtitleTav4 = this.this$0.getSubtitleTav();
        int id3 = subtitleTav4.getId();
        i17 = this.this$0.dp16;
        applyConstraint.Z(id3, 7, i17);
        sharingButtonIbv3 = this.this$0.getSharingButtonIbv();
        titleTav7 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, sharingButtonIbv3, titleTav7);
        sharingButtonIbv4 = this.this$0.getSharingButtonIbv();
        favoriteIconButtonIbv = this.this$0.getFavoriteIconButtonIbv();
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, sharingButtonIbv4, favoriteIconButtonIbv);
        sharingButtonIbv5 = this.this$0.getSharingButtonIbv();
        titleTav8 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, sharingButtonIbv5, titleTav8);
        favoriteIconButtonIbv2 = this.this$0.getFavoriteIconButtonIbv();
        titleTav9 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, favoriteIconButtonIbv2, titleTav9);
        favoriteIconButtonIbv3 = this.this$0.getFavoriteIconButtonIbv();
        productFavoriteMoleculeV4ButtonView = this.this$0.favoriteButtonV;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, favoriteIconButtonIbv3, productFavoriteMoleculeV4ButtonView);
        favoriteIconButtonIbv4 = this.this$0.getFavoriteIconButtonIbv();
        titleTav10 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, favoriteIconButtonIbv4, titleTav10);
        productFavoriteMoleculeV4ButtonView2 = this.this$0.favoriteButtonV;
        titleTav11 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, productFavoriteMoleculeV4ButtonView2, titleTav11);
        productFavoriteMoleculeV4ButtonView3 = this.this$0.favoriteButtonV;
        space = this.this$0.space;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, productFavoriteMoleculeV4ButtonView3, space);
        productFavoriteMoleculeV4ButtonView4 = this.this$0.favoriteButtonV;
        titleTav12 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, productFavoriteMoleculeV4ButtonView4, titleTav12);
        space2 = this.this$0.space;
        titleTav13 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, space2, titleTav13);
        space3 = this.this$0.space;
        i18 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, space3, i18);
        space4 = this.this$0.space;
        titleTav14 = this.this$0.getTitleTav();
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, space4, titleTav14);
    }
}

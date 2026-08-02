package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.view;

import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class HotelsRoomListV5RoomLoaderView$setupConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ HotelsRoomListV5RoomLoaderView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsRoomListV5RoomLoaderView$setupConstraints$1(HotelsRoomListV5RoomLoaderView hotelsRoomListV5RoomLoaderView) {
        super(1);
        this.this$0 = hotelsRoomListV5RoomLoaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        RoundedShimmerView roundedShimmerView;
        int i11;
        RoundedShimmerView roundedShimmerView2;
        int i12;
        RoundedShimmerView roundedShimmerView3;
        int i13;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        int i14;
        RoundedShimmerView roundedShimmerView6;
        int i15;
        RoundedShimmerView roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8;
        int i16;
        RoundedShimmerView roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10;
        RoundedShimmerView roundedShimmerView11;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        int i17;
        RoundedShimmerView roundedShimmerView14;
        RoundedShimmerView roundedShimmerView15;
        int i18;
        RoundedShimmerView roundedShimmerView16;
        RoundedShimmerView roundedShimmerView17;
        RecyclerView recyclerView;
        RoundedShimmerView roundedShimmerView18;
        int i19;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        RecyclerView recyclerView4;
        RecyclerView recyclerView5;
        int i21;
        RecyclerView recyclerView6;
        RecyclerView recyclerView7;
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        roundedShimmerView = this.this$0.hotelsRoomsListV5ImagePlaceholderSv;
        i11 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, roundedShimmerView, i11);
        roundedShimmerView2 = this.this$0.hotelsRoomsListV5ImagePlaceholderSv;
        i12 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView2, i12);
        roundedShimmerView3 = this.this$0.hotelsRoomsListV5ImagePlaceholderSv;
        i13 = this.this$0.dp2;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView3, i13);
        roundedShimmerView4 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        roundedShimmerView5 = this.this$0.hotelsRoomsListV5ImagePlaceholderSv;
        i14 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView4, roundedShimmerView5, i14);
        roundedShimmerView6 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        i15 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, roundedShimmerView6, i15);
        roundedShimmerView7 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        roundedShimmerView8 = this.this$0.hotelsRoomsListV5DetailPlaceholderSv;
        i16 = this.this$0.dp24;
        ConstraintLayoutExtensionsKt.endToStart(applyConstraint, roundedShimmerView7, roundedShimmerView8, i16);
        roundedShimmerView9 = this.this$0.hotelsRoomsListV5DetailPlaceholderSv;
        roundedShimmerView10 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, roundedShimmerView9, roundedShimmerView10);
        roundedShimmerView11 = this.this$0.hotelsRoomsListV5DetailPlaceholderSv;
        roundedShimmerView12 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, roundedShimmerView11, roundedShimmerView12);
        roundedShimmerView13 = this.this$0.hotelsRoomsListV5DetailPlaceholderSv;
        i17 = this.this$0.dp16;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, roundedShimmerView13, i17);
        roundedShimmerView14 = this.this$0.hotelsRoomsListV5AccommodationPlaceholderSv;
        roundedShimmerView15 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        i18 = this.this$0.dp8;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, roundedShimmerView14, roundedShimmerView15, i18);
        roundedShimmerView16 = this.this$0.hotelsRoomsListV5AccommodationPlaceholderSv;
        roundedShimmerView17 = this.this$0.hotelsRoomsListV5NamePlaceholderSv;
        ConstraintLayoutExtensionsKt.startToStart(applyConstraint, roundedShimmerView16, roundedShimmerView17);
        recyclerView = this.this$0.hotelsRoomsListV5RoomBadgesPlaceholderRv;
        roundedShimmerView18 = this.this$0.hotelsRoomsListV5AccommodationPlaceholderSv;
        i19 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView, roundedShimmerView18, i19);
        recyclerView2 = this.this$0.hotelsRoomsListV5RoomBadgesPlaceholderRv;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView2);
        recyclerView3 = this.this$0.hotelsRoomsListV5RoomBadgesPlaceholderRv;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView3);
        recyclerView4 = this.this$0.hotelsRoomsListV5TariffsPlaceholderRv;
        recyclerView5 = this.this$0.hotelsRoomsListV5RoomBadgesPlaceholderRv;
        i21 = this.this$0.dp12;
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, recyclerView4, recyclerView5, i21);
        recyclerView6 = this.this$0.hotelsRoomsListV5TariffsPlaceholderRv;
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, recyclerView6);
        recyclerView7 = this.this$0.hotelsRoomsListV5TariffsPlaceholderRv;
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, recyclerView7);
    }
}

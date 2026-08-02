package ru.ozon.app.android.travel.feature.tours.widgets.toursRoomsList.v2.presentation.room.images;

import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToursRoomsListV2ImagesAdapter$onViewAttachedToWindow$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ j $holder;
    final /* synthetic */ ToursRoomsListV2ImagesAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursRoomsListV2ImagesAdapter$onViewAttachedToWindow$1(ToursRoomsListV2ImagesAdapter toursRoomsListV2ImagesAdapter, j jVar) {
        super(0);
        this.this$0 = toursRoomsListV2ImagesAdapter;
        this.$holder = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function1 function1;
        function1 = this.this$0.imageItemClickListener;
        function1.invoke(Integer.valueOf(this.this$0.getFixedPosition(((ToursRoomsListV2ImagesViewHolder) this.$holder).getAdapterPosition())));
    }
}

package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation;

import GZ.g;
import LZ.b;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import pZ.C8880a;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;
import ru.ozon.app.android.gallery.StorageAnalytic;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV2ViewHolder$ProductGalleryAdapter$initPhoto$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ GalleryV2VO.ImageGalleryItem $item;
    final /* synthetic */ GalleryV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV2ViewHolder$ProductGalleryAdapter$initPhoto$1$1$1(GalleryV2ViewHolder galleryV2ViewHolder, GalleryV2VO.ImageGalleryItem imageGalleryItem) {
        super(0);
        this.this$0 = galleryV2ViewHolder;
        this.$item = imageGalleryItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g gVar;
        GalleryRequest.GalleryItem galleryV2Item;
        int indexOf = this.this$0.getAllItems().indexOf(this.$item);
        t popupTokenizedEvent = this.this$0.getGalleryV2Wrapper().getPopupTokenizedEvent();
        List<GalleryV2VO.GalleryItem> allItems = this.this$0.getAllItems();
        GalleryV2ViewHolder galleryV2ViewHolder = this.this$0;
        ArrayList arrayList = new ArrayList(C7714v.z(allItems, 10));
        Iterator<T> it = allItems.iterator();
        while (it.hasNext()) {
            galleryV2Item = galleryV2ViewHolder.toGalleryV2Item((GalleryV2VO.GalleryItem) it.next());
            arrayList.add(galleryV2Item);
        }
        GalleryRequest galleryRequest = new GalleryRequest(arrayList, indexOf, null, null, popupTokenizedEvent, null, 44, null);
        StorageAnalytic.INSTANCE.setTokenizedAnalytics(this.this$0.refs.getTokenizedAnalytics());
        gVar = this.this$0.ozonRouter;
        gVar.c(new b(new C8880a(GalleryActivity.INSTANCE.newIntent(this.this$0.getContext(), galleryRequest), null, null)), null);
    }
}

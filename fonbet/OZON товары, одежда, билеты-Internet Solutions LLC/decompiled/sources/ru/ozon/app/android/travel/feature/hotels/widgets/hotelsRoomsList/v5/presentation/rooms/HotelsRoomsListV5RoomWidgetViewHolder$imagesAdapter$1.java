package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import WZ.l;
import WZ.t;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsRoomsListV5RoomWidgetViewHolder$imagesAdapter$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ ComposerReferences $references;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ HotelsRoomsListV5RoomWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsRoomsListV5RoomWidgetViewHolder$imagesAdapter$1(HotelsRoomsListV5RoomWidgetViewHolder hotelsRoomsListV5RoomWidgetViewHolder, l lVar, ComposerReferences composerReferences) {
        super(1);
        this.this$0 = hotelsRoomsListV5RoomWidgetViewHolder;
        this.$tokenizedAnalytics = lVar;
        this.$references = composerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11) {
        t galleryTrackingInfo;
        List<ImageVO> images;
        HotelsRoomsListV5RoomVO boundData = this.this$0.getBoundData();
        if (boundData != null && (images = boundData.getImages()) != null) {
            r i12 = this.$references.getContainer().i();
            List<ImageVO> list = images;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new GalleryRequest.GalleryItem.Image(((ImageVO) it.next()).getUrl(), null, false, 6, null));
            }
            i12.startActivity(GalleryActivity.INSTANCE.newIntent(i12, new GalleryRequest(arrayList, i11)));
        }
        HotelsRoomsListV5RoomVO boundData2 = this.this$0.getBoundData();
        if (boundData2 == null || (galleryTrackingInfo = boundData2.getGalleryTrackingInfo()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, galleryTrackingInfo, null, 2, null);
    }
}

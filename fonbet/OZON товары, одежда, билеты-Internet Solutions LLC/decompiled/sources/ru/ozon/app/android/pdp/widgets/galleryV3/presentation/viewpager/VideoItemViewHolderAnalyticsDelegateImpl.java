package ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryV3VideoState;
import ru.ozon.app.android.video.TokenizedVideoEvents;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u000bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/VideoItemViewHolderAnalyticsDelegateImpl;", "", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;", "", "onVideoStateChanged", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "item", "processBindViewEvent", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;)V", "bindItem", "processOpenViewEvent", "processStartEvent", "processEndIfRepeatEvent", "Lkotlin/jvm/functions/Function1;", "", "", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/VideoItemViewHolderAnalyticsDelegateImpl$ItemWrapper;", "cacheOpenItem", "Ljava/util/Map;", "cacheStartItem", "cacheEndItem", "ItemWrapper", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoItemViewHolderAnalyticsDelegateImpl {

    @NotNull
    private final Map<String, ItemWrapper> cacheEndItem;

    @NotNull
    private final Map<String, ItemWrapper> cacheOpenItem;

    @NotNull
    private final Map<String, ItemWrapper> cacheStartItem;

    @NotNull
    private final Function1<GalleryV3VideoState, Unit> onVideoStateChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoItemViewHolderAnalyticsDelegateImpl(@NotNull Function1<? super GalleryV3VideoState, Unit> onVideoStateChanged) {
        Intrinsics.checkNotNullParameter(onVideoStateChanged, "onVideoStateChanged");
        this.onVideoStateChanged = onVideoStateChanged;
        this.cacheOpenItem = new LinkedHashMap();
        this.cacheStartItem = new LinkedHashMap();
        this.cacheEndItem = new LinkedHashMap();
    }

    public void processBindViewEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String link = item.getVideo().getLink();
        if (this.cacheOpenItem.get(link) == null) {
            this.cacheOpenItem.put(link, new ItemWrapper(item, false, 2, null));
        }
    }

    public void processEndIfRepeatEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String link = item.getVideo().getLink();
        ItemWrapper itemWrapper = this.cacheEndItem.get(link);
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (itemWrapper == null) {
            this.cacheEndItem.put(link, new ItemWrapper(item, false, 2, defaultConstructorMarker));
            return;
        }
        if (!item.equals(itemWrapper.getItem()) || itemWrapper.getIsSentEvent()) {
            return;
        }
        TokenizedVideoEvents galleryTokenizedVideoEvents = item.getGalleryTokenizedVideoEvents();
        if (galleryTokenizedVideoEvents != null) {
            this.onVideoStateChanged.invoke(new GalleryV3VideoState.End(galleryTokenizedVideoEvents));
        }
        this.cacheEndItem.put(link, ItemWrapper.copy$default(itemWrapper, null, true, 1, null));
    }

    public void processOpenViewEvent(@NotNull GalleryV3VO.Item.OzonVideo bindItem) {
        Intrinsics.checkNotNullParameter(bindItem, "bindItem");
        String link = bindItem.getVideo().getLink();
        ItemWrapper itemWrapper = this.cacheOpenItem.get(link);
        if (!Intrinsics.d(itemWrapper != null ? itemWrapper.getItem() : null, bindItem) || itemWrapper.getIsSentEvent()) {
            return;
        }
        TokenizedVideoEvents galleryTokenizedVideoEvents = itemWrapper.getItem().getGalleryTokenizedVideoEvents();
        if (galleryTokenizedVideoEvents != null) {
            this.onVideoStateChanged.invoke(new GalleryV3VideoState.Open(galleryTokenizedVideoEvents));
        }
        this.cacheOpenItem.put(link, ItemWrapper.copy$default(itemWrapper, null, true, 1, null));
    }

    public void processStartEvent(@NotNull GalleryV3VO.Item.OzonVideo item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String link = item.getVideo().getLink();
        if (this.cacheStartItem.get(link) == null) {
            this.cacheStartItem.put(link, new ItemWrapper(item, false, 2, null));
            TokenizedVideoEvents galleryTokenizedVideoEvents = item.getGalleryTokenizedVideoEvents();
            if (galleryTokenizedVideoEvents != null) {
                this.onVideoStateChanged.invoke(new GalleryV3VideoState.Start(galleryTokenizedVideoEvents));
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/VideoItemViewHolderAnalyticsDelegateImpl$ItemWrapper;", "", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "item", "", "isSentEvent", "<init>", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;Z)V", "copy", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;Z)Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/viewpager/VideoItemViewHolderAnalyticsDelegateImpl$ItemWrapper;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "getItem", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item$OzonVideo;", "Z", "()Z", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class ItemWrapper {
        private final boolean isSentEvent;

        @NotNull
        private final GalleryV3VO.Item.OzonVideo item;

        public ItemWrapper(@NotNull GalleryV3VO.Item.OzonVideo item, boolean z11) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.isSentEvent = z11;
        }

        public static /* synthetic */ ItemWrapper copy$default(ItemWrapper itemWrapper, GalleryV3VO.Item.OzonVideo ozonVideo, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonVideo = itemWrapper.item;
            }
            if ((i11 & 2) != 0) {
                z11 = itemWrapper.isSentEvent;
            }
            return itemWrapper.copy(ozonVideo, z11);
        }

        @NotNull
        public final ItemWrapper copy(@NotNull GalleryV3VO.Item.OzonVideo item, boolean isSentEvent) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new ItemWrapper(item, isSentEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemWrapper)) {
                return false;
            }
            ItemWrapper itemWrapper = (ItemWrapper) other;
            return Intrinsics.d(this.item, itemWrapper.item) && this.isSentEvent == itemWrapper.isSentEvent;
        }

        @NotNull
        public final GalleryV3VO.Item.OzonVideo getItem() {
            return this.item;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSentEvent) + (this.item.hashCode() * 31);
        }

        /* renamed from: isSentEvent, reason: from getter */
        public final boolean getIsSentEvent() {
            return this.isSentEvent;
        }

        @NotNull
        public String toString() {
            return "ItemWrapper(item=" + this.item + ", isSentEvent=" + this.isSentEvent + ")";
        }

        public /* synthetic */ ItemWrapper(GalleryV3VO.Item.OzonVideo ozonVideo, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(ozonVideo, (i11 & 2) != 0 ? false : z11);
        }
    }
}

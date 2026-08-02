package ru.ozon.app.android.gallery;

import Sc.o;
import android.annotation.SuppressLint;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.L;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.gallery.ItemVO;
import ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment;
import ru.ozon.app.android.gallery.details.Photo360GalleryFragment;
import ru.ozon.app.android.gallery.details.PhotoGalleryFragment;
import ru.ozon.app.android.video.VideoPosition;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/gallery/GalleryPagerAdapter;", "Landroidx/fragment/app/L;", "", "Lru/ozon/app/android/gallery/ItemVO;", "items", "Landroidx/fragment/app/G;", "fragmentManager", "Lru/ozon/app/android/video/VideoPosition;", "videoPosition", "", "widgetName", "<init>", "(Ljava/util/List;Landroidx/fragment/app/G;Lru/ozon/app/android/video/VideoPosition;Ljava/lang/String;)V", "", "position", "Landroidx/fragment/app/m;", "getItem", "(I)Landroidx/fragment/app/m;", "getCount", "()I", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/video/VideoPosition;", "Ljava/lang/String;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
/* loaded from: classes12.dex */
public final class GalleryPagerAdapter extends L {

    @NotNull
    private final List<ItemVO> items;
    private final VideoPosition videoPosition;
    private final String widgetName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GalleryPagerAdapter(@NotNull List<? extends ItemVO> items, @NotNull G fragmentManager, VideoPosition videoPosition, String str) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.items = items;
        this.videoPosition = videoPosition;
        this.widgetName = str;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.items.size();
    }

    @Override // androidx.fragment.app.L
    @NotNull
    public ComponentCallbacksC5392m getItem(int position) {
        ItemVO itemVO = this.items.get(position);
        if (itemVO instanceof ItemVO.OzonVideo) {
            return OzonVideoGalleryFragment.INSTANCE.newInstance((ItemVO.OzonVideo) itemVO, this.widgetName, this.videoPosition);
        }
        if (itemVO instanceof ItemVO.Image) {
            return PhotoGalleryFragment.INSTANCE.newInstance((ItemVO.Image) itemVO);
        }
        if (itemVO instanceof ItemVO.Photo360) {
            return Photo360GalleryFragment.INSTANCE.newInstance((ItemVO.Photo360) itemVO);
        }
        throw new o();
    }
}

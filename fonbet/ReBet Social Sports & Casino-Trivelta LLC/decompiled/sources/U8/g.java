package U8;

import android.os.Parcelable;
import com.giphy.sdk.core.models.Asset;
import com.giphy.sdk.core.models.Assets;
import com.giphy.sdk.core.models.Image;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.Video;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public static final float a(Asset asset) {
        return asset.getWidth() / asset.getHeight();
    }

    public static final float b(Image image) {
        return image.getWidth() / image.getHeight();
    }

    public static final float c(Media media) {
        Intrinsics.checkNotNullParameter(media, "<this>");
        Image original = media.getImages().getOriginal();
        if (original == null) {
            return 0.0f;
        }
        int width = original.getWidth();
        int height = original.getHeight();
        if (height == 0) {
            return 0.0f;
        }
        return width / height;
    }

    public static final float d(Media media) {
        Assets assets;
        Assets assets2;
        Assets assets3;
        Assets assets4;
        Intrinsics.checkNotNullParameter(media, "<this>");
        Video video = media.getVideo();
        Asset asset = null;
        Asset size360p = (video == null || (assets4 = video.getAssets()) == null) ? null : assets4.getSize360p();
        Video video2 = media.getVideo();
        Asset size1080p = (video2 == null || (assets3 = video2.getAssets()) == null) ? null : assets3.getSize1080p();
        Video video3 = media.getVideo();
        Asset size720p = (video3 == null || (assets2 = video3.getAssets()) == null) ? null : assets2.getSize720p();
        Video video4 = media.getVideo();
        if (video4 != null && (assets = video4.getAssets()) != null) {
            asset = assets.getSize480p();
        }
        Parcelable[] parcelableArr = {size360p, size1080p, size720p, asset, media.getImages().getOriginal(), media.getImages().getPreview(), media.getImages().getFixedWidth()};
        for (int i10 = 0; i10 < 7; i10++) {
            Parcelable parcelable = parcelableArr[i10];
            if (parcelable instanceof Asset) {
                return a((Asset) parcelable);
            }
            if (parcelable instanceof Image) {
                return b((Image) parcelable);
            }
        }
        return 1.7777778f;
    }
}

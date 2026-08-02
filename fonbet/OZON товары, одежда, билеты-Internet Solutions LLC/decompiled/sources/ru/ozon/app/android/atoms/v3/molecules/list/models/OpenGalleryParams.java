package ru.ozon.app.android.atoms.v3.molecules.list.models;

import B0.A0;
import G.g;
import K00.b;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/OpenGalleryParams;", "", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/atoms/v3/molecules/list/models/OpenGalleryParams$GalleryImage;", "imageItems", "", "currentPosition", "<init>", "(Landroid/content/Context;Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/util/List;", "getImageItems", "()Ljava/util/List;", "I", "getCurrentPosition", "GalleryImage", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OpenGalleryParams {

    @NotNull
    private final Context context;
    private final int currentPosition;

    @NotNull
    private final List<GalleryImage> imageItems;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/atoms/v3/molecules/list/models/OpenGalleryParams$GalleryImage;", "", "", ImagesContract.URL, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryImage {

        @NotNull
        private final String url;

        public GalleryImage(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GalleryImage) && Intrinsics.d(this.url, ((GalleryImage) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("GalleryImage(url=", this.url, ")");
        }
    }

    public OpenGalleryParams(@NotNull Context context, @NotNull List<GalleryImage> imageItems, int i11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageItems, "imageItems");
        this.context = context;
        this.imageItems = imageItems;
        this.currentPosition = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenGalleryParams)) {
            return false;
        }
        OpenGalleryParams openGalleryParams = (OpenGalleryParams) other;
        return Intrinsics.d(this.context, openGalleryParams.context) && Intrinsics.d(this.imageItems, openGalleryParams.imageItems) && this.currentPosition == openGalleryParams.currentPosition;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    @NotNull
    public final List<GalleryImage> getImageItems() {
        return this.imageItems;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentPosition) + g.b(this.context.hashCode() * 31, 31, this.imageItems);
    }

    @NotNull
    public String toString() {
        Context context = this.context;
        List<GalleryImage> list = this.imageItems;
        int i11 = this.currentPosition;
        StringBuilder sb2 = new StringBuilder("OpenGalleryParams(context=");
        sb2.append(context);
        sb2.append(", imageItems=");
        sb2.append(list);
        sb2.append(", currentPosition=");
        return b.e(i11, ")", sb2);
    }
}

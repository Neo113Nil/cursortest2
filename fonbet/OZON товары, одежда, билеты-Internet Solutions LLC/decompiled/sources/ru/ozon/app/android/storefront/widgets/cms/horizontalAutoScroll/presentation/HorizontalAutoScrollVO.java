package ru.ozon.app.android.storefront.widgets.cms.horizontalAutoScroll.presentation;

import An.C2439a;
import B0.C2454a;
import G.g;
import Lh.b;
import WZ.t;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001/BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;", "images", "", "backgroundColorToken", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "Landroid/os/Parcelable;", "scrollState", "<init>", "(JLjava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Landroid/os/Parcelable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColorToken", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Landroid/os/Parcelable;", "getScrollState", "()Landroid/os/Parcelable;", "setScrollState", "(Landroid/os/Parcelable;)V", "ImageItem", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HorizontalAutoScrollVO implements c {
    private final AtomAction action;

    @NotNull
    private final String backgroundColorToken;
    private final long id;

    @NotNull
    private final List<ImageItem> images;
    private Parcelable scrollState;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001a\u0010\f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/horizontalAutoScroll/presentation/HorizontalAutoScrollVO$ImageItem;", "", "", ImagesContract.URL, "Landroid/graphics/Bitmap;", "bitmap", "", "width", "tintColorToken", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "I", "getWidth", "getTintColorToken", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageItem {

        @NotNull
        private final Bitmap bitmap;

        @NotNull
        private final String tintColorToken;

        @NotNull
        private final String url;
        private final int width;

        public ImageItem(@NotNull String url, @NotNull Bitmap bitmap, int i11, @NotNull String tintColorToken) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(tintColorToken, "tintColorToken");
            this.url = url;
            this.bitmap = bitmap;
            this.width = i11;
            this.tintColorToken = tintColorToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageItem)) {
                return false;
            }
            ImageItem imageItem = (ImageItem) other;
            return Intrinsics.d(this.url, imageItem.url) && Intrinsics.d(this.bitmap, imageItem.bitmap) && this.width == imageItem.width && Intrinsics.d(this.tintColorToken, imageItem.tintColorToken);
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final String getTintColorToken() {
            return this.tintColorToken;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.tintColorToken.hashCode() + C2454a.a(this.width, (this.bitmap.hashCode() + (this.url.hashCode() * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "ImageItem(url=" + this.url + ", bitmap=" + this.bitmap + ", width=" + this.width + ", tintColorToken=" + this.tintColorToken + ")";
        }
    }

    public HorizontalAutoScrollVO(long j11, @NotNull List<ImageItem> images, @NotNull String backgroundColorToken, AtomAction atomAction, t tVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(backgroundColorToken, "backgroundColorToken");
        this.id = j11;
        this.images = images;
        this.backgroundColorToken = backgroundColorToken;
        this.action = atomAction;
        this.tokenizedEvent = tVar;
        this.scrollState = parcelable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalAutoScrollVO)) {
            return false;
        }
        HorizontalAutoScrollVO horizontalAutoScrollVO = (HorizontalAutoScrollVO) other;
        return this.id == horizontalAutoScrollVO.id && Intrinsics.d(this.images, horizontalAutoScrollVO.images) && Intrinsics.d(this.backgroundColorToken, horizontalAutoScrollVO.backgroundColorToken) && Intrinsics.d(this.action, horizontalAutoScrollVO.action) && Intrinsics.d(this.tokenizedEvent, horizontalAutoScrollVO.tokenizedEvent) && Intrinsics.d(this.scrollState, horizontalAutoScrollVO.scrollState);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final String getBackgroundColorToken() {
        return this.backgroundColorToken;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ImageItem> getImages() {
        return this.images;
    }

    public final Parcelable getScrollState() {
        return this.scrollState;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(g.b(Long.hashCode(this.id) * 31, 31, this.images), 31, this.backgroundColorToken);
        AtomAction atomAction = this.action;
        int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Parcelable parcelable = this.scrollState;
        return hashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    public final void setScrollState(Parcelable parcelable) {
        this.scrollState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<ImageItem> list = this.images;
        String str = this.backgroundColorToken;
        AtomAction atomAction = this.action;
        t tVar = this.tokenizedEvent;
        Parcelable parcelable = this.scrollState;
        StringBuilder b11 = b.b(j11, "HorizontalAutoScrollVO(id=", ", images=", list);
        C2439a.c(", backgroundColorToken=", str, ", action=", b11, atomAction);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", scrollState=");
        b11.append(parcelable);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ HorizontalAutoScrollVO(long j11, List list, String str, AtomAction atomAction, t tVar, Parcelable parcelable, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, list, str, atomAction, tVar, (i11 & 32) != 0 ? null : parcelable);
    }
}

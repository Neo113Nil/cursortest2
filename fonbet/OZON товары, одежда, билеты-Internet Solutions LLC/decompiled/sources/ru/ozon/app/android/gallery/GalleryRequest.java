package ru.ozon.app.android.gallery;

import B0.C2454a;
import Bi.b;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.TokenizedVideoEvents;
import ru.ozon.app.android.video.VideoPosition;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002/0BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b.\u0010-¨\u00061"}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequest;", "Landroid/os/Parcelable;", "", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "items", "", "currentPosition", "Lru/ozon/app/android/video/VideoPosition;", "videoPosition", "", "widgetName", "LWZ/t;", "popupTokenizedFullEvent", "popupCloseTokenizedFullEvent", "<init>", "(Ljava/util/List;ILru/ozon/app/android/video/VideoPosition;Ljava/lang/String;LWZ/t;LWZ/t;)V", "(Ljava/util/List;I)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "I", "getCurrentPosition", "Lru/ozon/app/android/video/VideoPosition;", "getVideoPosition", "()Lru/ozon/app/android/video/VideoPosition;", "Ljava/lang/String;", "getWidgetName", "LWZ/t;", "getPopupTokenizedFullEvent", "()LWZ/t;", "getPopupCloseTokenizedFullEvent", "Companion", "GalleryItem", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GalleryRequest implements Parcelable {
    private final int currentPosition;

    @NotNull
    private final List<GalleryItem> items;
    private final t popupCloseTokenizedFullEvent;
    private final t popupTokenizedFullEvent;
    private final VideoPosition videoPosition;
    private final String widgetName;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<GalleryRequest> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequest$Companion;", "", "<init>", "()V", "", "", "imageUrls", "", "position", "LWZ/t;", "popupTokenizedFullEvent", "widgetName", "Lru/ozon/app/android/gallery/GalleryRequest;", "createFromImageUrls", "(Ljava/util/List;ILWZ/t;Ljava/lang/String;)Lru/ozon/app/android/gallery/GalleryRequest;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ GalleryRequest createFromImageUrls$default(Companion companion, List list, int i11, t tVar, String str, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                tVar = null;
            }
            if ((i12 & 8) != 0) {
                str = null;
            }
            return companion.createFromImageUrls(list, i11, tVar, str);
        }

        @NotNull
        public final GalleryRequest createFromImageUrls(@NotNull List<String> imageUrls, int position, t popupTokenizedFullEvent, String widgetName) {
            Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
            List<String> list = imageUrls;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new GalleryItem.Image((String) it.next(), null, false, 6, null));
            }
            return new GalleryRequest(arrayList, position, null, widgetName, popupTokenizedFullEvent, null, 36, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryRequest> {
        @Override // android.os.Parcelable.Creator
        public final GalleryRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i11 = 0;
            while (i11 != readInt) {
                i11 = b.a(GalleryRequest.class, parcel, arrayList, i11, 1);
            }
            return new GalleryRequest(arrayList, parcel.readInt(), (VideoPosition) parcel.readParcelable(GalleryRequest.class.getClassLoader()), parcel.readString(), (t) parcel.readParcelable(GalleryRequest.class.getClassLoader()), (t) parcel.readParcelable(GalleryRequest.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryRequest[] newArray(int i11) {
            return new GalleryRequest[i11];
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Image", "OzonVideo", "Photo360", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$Image;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$OzonVideo;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$Photo360;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class GalleryItem implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u0006\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$Image;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "", "imageUrl", "previewImageUrl", "", "isApparel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getPreviewImageUrl", "Z", "()Z", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image extends GalleryItem {

            @NotNull
            public static final Parcelable.Creator<Image> CREATOR = new Creator();

            @NotNull
            private final String imageUrl;
            private final boolean isApparel;
            private final String previewImageUrl;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Image> {
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Image(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i11) {
                    return new Image[i11];
                }
            }

            public /* synthetic */ Image(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.imageUrl, image.imageUrl) && Intrinsics.d(this.previewImageUrl, image.previewImageUrl) && this.isApparel == image.isApparel;
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public int hashCode() {
                int hashCode = this.imageUrl.hashCode() * 31;
                String str = this.previewImageUrl;
                return Boolean.hashCode(this.isApparel) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            /* renamed from: isApparel, reason: from getter */
            public boolean getIsApparel() {
                return this.isApparel;
            }

            @NotNull
            public String toString() {
                String str = this.imageUrl;
                String str2 = this.previewImageUrl;
                return a.a(")", C3660k.d("Image(imageUrl=", str, ", previewImageUrl=", str2, ", isApparel="), this.isApparel);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.imageUrl);
                dest.writeString(this.previewImageUrl);
                dest.writeInt(this.isApparel ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Image(@NotNull String imageUrl, String str, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                this.imageUrl = imageUrl;
                this.previewImageUrl = str;
                this.isApparel = z11;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b\u000b\u0010%¨\u0006,"}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$OzonVideo;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "", "previewImageUrl", "videoUrl", "", "fullScreen", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "galleryTokenizedVideoEvents", "isApparel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLWZ/t;Lru/ozon/app/android/video/TokenizedVideoEvents;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLWZ/t;Lru/ozon/app/android/video/TokenizedVideoEvents;Z)Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$OzonVideo;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPreviewImageUrl", "getVideoUrl", "Z", "getFullScreen", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getGalleryTokenizedVideoEvents", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OzonVideo extends GalleryItem {

            @NotNull
            public static final Parcelable.Creator<OzonVideo> CREATOR = new Creator();
            private final boolean fullScreen;
            private final TokenizedVideoEvents galleryTokenizedVideoEvents;
            private final boolean isApparel;

            @NotNull
            private final String previewImageUrl;
            private final t tokenizedEvent;

            @NotNull
            private final String videoUrl;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OzonVideo> {
                @Override // android.os.Parcelable.Creator
                public final OzonVideo createFromParcel(Parcel parcel) {
                    boolean z11;
                    t tVar;
                    boolean z12;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    boolean z13 = false;
                    if (parcel.readInt() != 0) {
                        z11 = false;
                        z13 = true;
                    } else {
                        z11 = false;
                    }
                    t tVar2 = (t) parcel.readParcelable(OzonVideo.class.getClassLoader());
                    TokenizedVideoEvents tokenizedVideoEvents = (TokenizedVideoEvents) parcel.readParcelable(OzonVideo.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z12 = true;
                        tVar = tVar2;
                    } else {
                        tVar = tVar2;
                        z12 = z11;
                    }
                    return new OzonVideo(readString, readString2, z13, tVar, tokenizedVideoEvents, z12);
                }

                @Override // android.os.Parcelable.Creator
                public final OzonVideo[] newArray(int i11) {
                    return new OzonVideo[i11];
                }
            }

            public /* synthetic */ OzonVideo(String str, String str2, boolean z11, t tVar, TokenizedVideoEvents tokenizedVideoEvents, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? null : tVar, (i11 & 16) != 0 ? null : tokenizedVideoEvents, (i11 & 32) != 0 ? false : z12);
            }

            public static /* synthetic */ OzonVideo copy$default(OzonVideo ozonVideo, String str, String str2, boolean z11, t tVar, TokenizedVideoEvents tokenizedVideoEvents, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = ozonVideo.previewImageUrl;
                }
                if ((i11 & 2) != 0) {
                    str2 = ozonVideo.videoUrl;
                }
                if ((i11 & 4) != 0) {
                    z11 = ozonVideo.fullScreen;
                }
                if ((i11 & 8) != 0) {
                    tVar = ozonVideo.tokenizedEvent;
                }
                if ((i11 & 16) != 0) {
                    tokenizedVideoEvents = ozonVideo.galleryTokenizedVideoEvents;
                }
                if ((i11 & 32) != 0) {
                    z12 = ozonVideo.isApparel;
                }
                TokenizedVideoEvents tokenizedVideoEvents2 = tokenizedVideoEvents;
                boolean z13 = z12;
                return ozonVideo.copy(str, str2, z11, tVar, tokenizedVideoEvents2, z13);
            }

            @NotNull
            public final OzonVideo copy(@NotNull String previewImageUrl, @NotNull String videoUrl, boolean fullScreen, t tokenizedEvent, TokenizedVideoEvents galleryTokenizedVideoEvents, boolean isApparel) {
                Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
                Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                return new OzonVideo(previewImageUrl, videoUrl, fullScreen, tokenizedEvent, galleryTokenizedVideoEvents, isApparel);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OzonVideo)) {
                    return false;
                }
                OzonVideo ozonVideo = (OzonVideo) other;
                return Intrinsics.d(this.previewImageUrl, ozonVideo.previewImageUrl) && Intrinsics.d(this.videoUrl, ozonVideo.videoUrl) && this.fullScreen == ozonVideo.fullScreen && Intrinsics.d(this.tokenizedEvent, ozonVideo.tokenizedEvent) && Intrinsics.d(this.galleryTokenizedVideoEvents, ozonVideo.galleryTokenizedVideoEvents) && this.isApparel == ozonVideo.isApparel;
            }

            public final boolean getFullScreen() {
                return this.fullScreen;
            }

            public final TokenizedVideoEvents getGalleryTokenizedVideoEvents() {
                return this.galleryTokenizedVideoEvents;
            }

            @NotNull
            public final String getPreviewImageUrl() {
                return this.previewImageUrl;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            @NotNull
            public final String getVideoUrl() {
                return this.videoUrl;
            }

            public int hashCode() {
                int a11 = C3532b.a(g.a(this.previewImageUrl.hashCode() * 31, 31, this.videoUrl), 31, this.fullScreen);
                t tVar = this.tokenizedEvent;
                int hashCode = (a11 + (tVar == null ? 0 : tVar.hashCode())) * 31;
                TokenizedVideoEvents tokenizedVideoEvents = this.galleryTokenizedVideoEvents;
                return Boolean.hashCode(this.isApparel) + ((hashCode + (tokenizedVideoEvents != null ? tokenizedVideoEvents.hashCode() : 0)) * 31);
            }

            /* renamed from: isApparel, reason: from getter */
            public boolean getIsApparel() {
                return this.isApparel;
            }

            @NotNull
            public String toString() {
                String str = this.previewImageUrl;
                String str2 = this.videoUrl;
                boolean z11 = this.fullScreen;
                t tVar = this.tokenizedEvent;
                TokenizedVideoEvents tokenizedVideoEvents = this.galleryTokenizedVideoEvents;
                boolean z12 = this.isApparel;
                StringBuilder d11 = C3660k.d("OzonVideo(previewImageUrl=", str, ", videoUrl=", str2, ", fullScreen=");
                d11.append(z11);
                d11.append(", tokenizedEvent=");
                d11.append(tVar);
                d11.append(", galleryTokenizedVideoEvents=");
                d11.append(tokenizedVideoEvents);
                d11.append(", isApparel=");
                d11.append(z12);
                d11.append(")");
                return d11.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.previewImageUrl);
                dest.writeString(this.videoUrl);
                dest.writeInt(this.fullScreen ? 1 : 0);
                dest.writeParcelable(this.tokenizedEvent, flags);
                dest.writeParcelable(this.galleryTokenizedVideoEvents, flags);
                dest.writeInt(this.isApparel ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OzonVideo(@NotNull String previewImageUrl, @NotNull String videoUrl, boolean z11, t tVar, TokenizedVideoEvents tokenizedVideoEvents, boolean z12) {
                super(null);
                Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
                Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
                this.previewImageUrl = previewImageUrl;
                this.videoUrl = videoUrl;
                this.fullScreen = z11;
                this.tokenizedEvent = tVar;
                this.galleryTokenizedVideoEvents = tokenizedVideoEvents;
                this.isApparel = z12;
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem$Photo360;", "Lru/ozon/app/android/gallery/GalleryRequest$GalleryItem;", "", "imageUrl", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "LWZ/t;", "buttonEvent", "", "isApparel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;LWZ/t;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "LWZ/t;", "getButtonEvent", "()LWZ/t;", "Z", "()Z", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Photo360 extends GalleryItem {

            @NotNull
            public static final Parcelable.Creator<Photo360> CREATOR = new Creator();
            private final ButtonV3Atom.SmallButton button;
            private final t buttonEvent;

            @NotNull
            private final String description;

            @NotNull
            private final String imageUrl;
            private final boolean isApparel;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Photo360> {
                @Override // android.os.Parcelable.Creator
                public final Photo360 createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Photo360(parcel.readString(), parcel.readString(), (ButtonV3Atom.SmallButton) parcel.readParcelable(Photo360.class.getClassLoader()), (t) parcel.readParcelable(Photo360.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Photo360[] newArray(int i11) {
                    return new Photo360[i11];
                }
            }

            public /* synthetic */ Photo360(String str, String str2, ButtonV3Atom.SmallButton smallButton, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, smallButton, (i11 & 8) != 0 ? null : tVar, (i11 & 16) != 0 ? false : z11);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Photo360)) {
                    return false;
                }
                Photo360 photo360 = (Photo360) other;
                return Intrinsics.d(this.imageUrl, photo360.imageUrl) && Intrinsics.d(this.description, photo360.description) && Intrinsics.d(this.button, photo360.button) && Intrinsics.d(this.buttonEvent, photo360.buttonEvent) && this.isApparel == photo360.isApparel;
            }

            public final ButtonV3Atom.SmallButton getButton() {
                return this.button;
            }

            public final t getButtonEvent() {
                return this.buttonEvent;
            }

            @NotNull
            public final String getDescription() {
                return this.description;
            }

            @NotNull
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public int hashCode() {
                int a11 = g.a(this.imageUrl.hashCode() * 31, 31, this.description);
                ButtonV3Atom.SmallButton smallButton = this.button;
                int hashCode = (a11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
                t tVar = this.buttonEvent;
                return Boolean.hashCode(this.isApparel) + ((hashCode + (tVar != null ? tVar.hashCode() : 0)) * 31);
            }

            /* renamed from: isApparel, reason: from getter */
            public boolean getIsApparel() {
                return this.isApparel;
            }

            @NotNull
            public String toString() {
                String str = this.imageUrl;
                String str2 = this.description;
                ButtonV3Atom.SmallButton smallButton = this.button;
                t tVar = this.buttonEvent;
                boolean z11 = this.isApparel;
                StringBuilder d11 = C3660k.d("Photo360(imageUrl=", str, ", description=", str2, ", button=");
                d11.append(smallButton);
                d11.append(", buttonEvent=");
                d11.append(tVar);
                d11.append(", isApparel=");
                return a.a(")", d11, z11);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.imageUrl);
                dest.writeString(this.description);
                dest.writeParcelable(this.button, flags);
                dest.writeParcelable(this.buttonEvent, flags);
                dest.writeInt(this.isApparel ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Photo360(@NotNull String imageUrl, @NotNull String description, ButtonV3Atom.SmallButton smallButton, t tVar, boolean z11) {
                super(null);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                Intrinsics.checkNotNullParameter(description, "description");
                this.imageUrl = imageUrl;
                this.description = description;
                this.button = smallButton;
                this.buttonEvent = tVar;
                this.isApparel = z11;
            }
        }

        public /* synthetic */ GalleryItem(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private GalleryItem() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryRequest(@NotNull List<? extends GalleryItem> items, int i11, VideoPosition videoPosition, String str, t tVar, t tVar2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.currentPosition = i11;
        this.videoPosition = videoPosition;
        this.widgetName = str;
        this.popupTokenizedFullEvent = tVar;
        this.popupCloseTokenizedFullEvent = tVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryRequest)) {
            return false;
        }
        GalleryRequest galleryRequest = (GalleryRequest) other;
        return Intrinsics.d(this.items, galleryRequest.items) && this.currentPosition == galleryRequest.currentPosition && Intrinsics.d(this.videoPosition, galleryRequest.videoPosition) && Intrinsics.d(this.widgetName, galleryRequest.widgetName) && Intrinsics.d(this.popupTokenizedFullEvent, galleryRequest.popupTokenizedFullEvent) && Intrinsics.d(this.popupCloseTokenizedFullEvent, galleryRequest.popupCloseTokenizedFullEvent);
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public final t getPopupCloseTokenizedFullEvent() {
        return this.popupCloseTokenizedFullEvent;
    }

    public final t getPopupTokenizedFullEvent() {
        return this.popupTokenizedFullEvent;
    }

    public final VideoPosition getVideoPosition() {
        return this.videoPosition;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.currentPosition, this.items.hashCode() * 31, 31);
        VideoPosition videoPosition = this.videoPosition;
        int hashCode = (a11 + (videoPosition == null ? 0 : videoPosition.hashCode())) * 31;
        String str = this.widgetName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.popupTokenizedFullEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.popupCloseTokenizedFullEvent;
        return hashCode3 + (tVar2 != null ? tVar2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GalleryRequest(items=" + this.items + ", currentPosition=" + this.currentPosition + ", videoPosition=" + this.videoPosition + ", widgetName=" + this.widgetName + ", popupTokenizedFullEvent=" + this.popupTokenizedFullEvent + ", popupCloseTokenizedFullEvent=" + this.popupCloseTokenizedFullEvent + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator c11 = Bi.a.c(this.items, dest);
        while (c11.hasNext()) {
            dest.writeParcelable((Parcelable) c11.next(), flags);
        }
        dest.writeInt(this.currentPosition);
        dest.writeParcelable(this.videoPosition, flags);
        dest.writeString(this.widgetName);
        dest.writeParcelable(this.popupTokenizedFullEvent, flags);
        dest.writeParcelable(this.popupCloseTokenizedFullEvent, flags);
    }

    public /* synthetic */ GalleryRequest(List list, int i11, VideoPosition videoPosition, String str, t tVar, t tVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i11, (i12 & 4) != 0 ? null : videoPosition, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : tVar, (i12 & 32) != 0 ? null : tVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GalleryRequest(@NotNull List<? extends GalleryItem> items, int i11) {
        this(items, i11, null, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(items, "items");
    }
}

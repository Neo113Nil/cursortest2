package ru.ozon.app.android.gallery;

import Ak.b;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Pk0.a;
import WZ.t;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.TokenizedVideoEvents;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/gallery/ItemVO;", "Landroid/os/Parcelable;", "<init>", "()V", "Image", "OzonVideo", "Photo360", "Lru/ozon/app/android/gallery/ItemVO$Image;", "Lru/ozon/app/android/gallery/ItemVO$OzonVideo;", "Lru/ozon/app/android/gallery/ItemVO$Photo360;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ItemVO implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/gallery/ItemVO$Image;", "Lru/ozon/app/android/gallery/ItemVO;", "", "imageUrl", "", "isApparel", "<init>", "(Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "Z", "()Z", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image extends ItemVO {

        @NotNull
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @NotNull
        private final String imageUrl;
        private final boolean isApparel;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i11) {
                return new Image[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(@NotNull String imageUrl, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.isApparel = z11;
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
            return Intrinsics.d(this.imageUrl, image.imageUrl) && this.isApparel == image.isApparel;
        }

        @NotNull
        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isApparel) + (this.imageUrl.hashCode() * 31);
        }

        /* renamed from: isApparel, reason: from getter */
        public boolean getIsApparel() {
            return this.isApparel;
        }

        @NotNull
        public String toString() {
            return b.f("Image(imageUrl=", this.imageUrl, ", isApparel=", ")", this.isApparel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.imageUrl);
            dest.writeInt(this.isApparel ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0016J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\u000b\u0010#¨\u0006*"}, d2 = {"Lru/ozon/app/android/gallery/ItemVO$OzonVideo;", "Lru/ozon/app/android/gallery/ItemVO;", "", "videoUrl", "previewImageUrl", "", "fullScreen", "LWZ/t;", "tokenizedEvent", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "galleryTokenizedVideoEvents", "isApparel", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLWZ/t;Lru/ozon/app/android/video/TokenizedVideoEvents;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVideoUrl", "getPreviewImageUrl", "Z", "getFullScreen", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/video/TokenizedVideoEvents;", "getGalleryTokenizedVideoEvents", "()Lru/ozon/app/android/video/TokenizedVideoEvents;", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OzonVideo extends ItemVO {

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OzonVideo(@NotNull String videoUrl, @NotNull String previewImageUrl, boolean z11, t tVar, TokenizedVideoEvents tokenizedVideoEvents, boolean z12) {
            super(null);
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            Intrinsics.checkNotNullParameter(previewImageUrl, "previewImageUrl");
            this.videoUrl = videoUrl;
            this.previewImageUrl = previewImageUrl;
            this.fullScreen = z11;
            this.tokenizedEvent = tVar;
            this.galleryTokenizedVideoEvents = tokenizedVideoEvents;
            this.isApparel = z12;
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
            return Intrinsics.d(this.videoUrl, ozonVideo.videoUrl) && Intrinsics.d(this.previewImageUrl, ozonVideo.previewImageUrl) && this.fullScreen == ozonVideo.fullScreen && Intrinsics.d(this.tokenizedEvent, ozonVideo.tokenizedEvent) && Intrinsics.d(this.galleryTokenizedVideoEvents, ozonVideo.galleryTokenizedVideoEvents) && this.isApparel == ozonVideo.isApparel;
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

        @NotNull
        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            int a11 = C3532b.a(g.a(this.videoUrl.hashCode() * 31, 31, this.previewImageUrl), 31, this.fullScreen);
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
            String str = this.videoUrl;
            String str2 = this.previewImageUrl;
            boolean z11 = this.fullScreen;
            t tVar = this.tokenizedEvent;
            TokenizedVideoEvents tokenizedVideoEvents = this.galleryTokenizedVideoEvents;
            boolean z12 = this.isApparel;
            StringBuilder d11 = C3660k.d("OzonVideo(videoUrl=", str, ", previewImageUrl=", str2, ", fullScreen=");
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
            dest.writeString(this.videoUrl);
            dest.writeString(this.previewImageUrl);
            dest.writeInt(this.fullScreen ? 1 : 0);
            dest.writeParcelable(this.tokenizedEvent, flags);
            dest.writeParcelable(this.galleryTokenizedVideoEvents, flags);
            dest.writeInt(this.isApparel ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/gallery/ItemVO$Photo360;", "Lru/ozon/app/android/gallery/ItemVO;", "", "imageUrl", "description", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "button", "LWZ/t;", "buttonEvent", "", "isApparel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;LWZ/t;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getDescription", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "LWZ/t;", "getButtonEvent", "()LWZ/t;", "Z", "()Z", "gallery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Photo360 extends ItemVO {

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
    }

    public /* synthetic */ ItemVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ItemVO() {
    }
}

package ru.ozon.app.android.returns.creation.widgets.photoPicker.data;

import V.e;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "", "imageLocation", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;", ImagesContract.URL, "", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;Ljava/lang/String;)V", "getImageLocation", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ImageLocation", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SignedLinkDTO {
    public static final int $stable = 0;

    @NotNull
    private final ImageLocation imageLocation;

    @NotNull
    private final String url;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;", "", "key", "", "bucket", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getBucket", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageLocation {
        public static final int $stable = 0;

        @NotNull
        private final String bucket;

        @NotNull
        private final String key;

        public ImageLocation(@NotNull String key, @NotNull String bucket) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bucket, "bucket");
            this.key = key;
            this.bucket = bucket;
        }

        public static /* synthetic */ ImageLocation copy$default(ImageLocation imageLocation, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageLocation.key;
            }
            if ((i11 & 2) != 0) {
                str2 = imageLocation.bucket;
            }
            return imageLocation.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getBucket() {
            return this.bucket;
        }

        @NotNull
        public final ImageLocation copy(@NotNull String key, @NotNull String bucket) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bucket, "bucket");
            return new ImageLocation(key, bucket);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageLocation)) {
                return false;
            }
            ImageLocation imageLocation = (ImageLocation) other;
            return Intrinsics.d(this.key, imageLocation.key) && Intrinsics.d(this.bucket, imageLocation.bucket);
        }

        @NotNull
        public final String getBucket() {
            return this.bucket;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return this.bucket.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return e.a("ImageLocation(key=", this.key, ", bucket=", this.bucket, ")");
        }
    }

    public SignedLinkDTO(@NotNull ImageLocation imageLocation, @NotNull String url) {
        Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        Intrinsics.checkNotNullParameter(url, "url");
        this.imageLocation = imageLocation;
        this.url = url;
    }

    public static /* synthetic */ SignedLinkDTO copy$default(SignedLinkDTO signedLinkDTO, ImageLocation imageLocation, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageLocation = signedLinkDTO.imageLocation;
        }
        if ((i11 & 2) != 0) {
            str = signedLinkDTO.url;
        }
        return signedLinkDTO.copy(imageLocation, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageLocation getImageLocation() {
        return this.imageLocation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final SignedLinkDTO copy(@NotNull ImageLocation imageLocation, @NotNull String url) {
        Intrinsics.checkNotNullParameter(imageLocation, "imageLocation");
        Intrinsics.checkNotNullParameter(url, "url");
        return new SignedLinkDTO(imageLocation, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedLinkDTO)) {
            return false;
        }
        SignedLinkDTO signedLinkDTO = (SignedLinkDTO) other;
        return Intrinsics.d(this.imageLocation, signedLinkDTO.imageLocation) && Intrinsics.d(this.url, signedLinkDTO.url);
    }

    @NotNull
    public final ImageLocation getImageLocation() {
        return this.imageLocation;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.imageLocation.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SignedLinkDTO(imageLocation=" + this.imageLocation + ", url=" + this.url + ")";
    }
}

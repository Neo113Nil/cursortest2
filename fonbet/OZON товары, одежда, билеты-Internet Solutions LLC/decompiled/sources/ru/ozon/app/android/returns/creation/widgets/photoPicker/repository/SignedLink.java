package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;", "imageLocation", "", ImagesContract.URL, "<init>", "(Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;", "getImageLocation", "()Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO$ImageLocation;", "Ljava/lang/String;", "getUrl", "Companion", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SignedLink {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final SignedLinkDTO.ImageLocation imageLocation;

    @NotNull
    private final String url;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink$Companion;", "", "<init>", "()V", "fromDTO", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/SignedLink;", "dto", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SignedLink fromDTO(@NotNull SignedLinkDTO dto) {
            Intrinsics.checkNotNullParameter(dto, "dto");
            return new SignedLink(dto.getImageLocation(), dto.getUrl());
        }

        private Companion() {
        }
    }

    public SignedLink(SignedLinkDTO.ImageLocation imageLocation, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.imageLocation = imageLocation;
        this.url = url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedLink)) {
            return false;
        }
        SignedLink signedLink = (SignedLink) other;
        return Intrinsics.d(this.imageLocation, signedLink.imageLocation) && Intrinsics.d(this.url, signedLink.url);
    }

    public final SignedLinkDTO.ImageLocation getImageLocation() {
        return this.imageLocation;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        SignedLinkDTO.ImageLocation imageLocation = this.imageLocation;
        return this.url.hashCode() + ((imageLocation == null ? 0 : imageLocation.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "SignedLink(imageLocation=" + this.imageLocation + ", url=" + this.url + ")";
    }
}

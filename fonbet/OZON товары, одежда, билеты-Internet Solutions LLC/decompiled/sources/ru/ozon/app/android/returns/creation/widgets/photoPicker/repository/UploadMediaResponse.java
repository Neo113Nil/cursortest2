package ru.ozon.app.android.returns.creation.widgets.photoPicker.repository;

import Ak.C2436a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.data.SignedLinkDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/repository/UploadMediaResponse;", "", "files", "", "Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/SignedLinkDTO;", "errors", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getFiles", "()Ljava/util/List;", "getErrors", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UploadMediaResponse {
    public static final int $stable = 8;
    private final List<String> errors;
    private final List<SignedLinkDTO> files;

    public UploadMediaResponse(List<SignedLinkDTO> list, List<String> list2) {
        this.files = list;
        this.errors = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadMediaResponse copy$default(UploadMediaResponse uploadMediaResponse, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = uploadMediaResponse.files;
        }
        if ((i11 & 2) != 0) {
            list2 = uploadMediaResponse.errors;
        }
        return uploadMediaResponse.copy(list, list2);
    }

    public final List<SignedLinkDTO> component1() {
        return this.files;
    }

    public final List<String> component2() {
        return this.errors;
    }

    @NotNull
    public final UploadMediaResponse copy(List<SignedLinkDTO> files, List<String> errors) {
        return new UploadMediaResponse(files, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadMediaResponse)) {
            return false;
        }
        UploadMediaResponse uploadMediaResponse = (UploadMediaResponse) other;
        return Intrinsics.d(this.files, uploadMediaResponse.files) && Intrinsics.d(this.errors, uploadMediaResponse.errors);
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final List<SignedLinkDTO> getFiles() {
        return this.files;
    }

    public int hashCode() {
        List<SignedLinkDTO> list = this.files;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.errors;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return C2436a.b("UploadMediaResponse(files=", this.files, ", errors=", ")", this.errors);
    }
}

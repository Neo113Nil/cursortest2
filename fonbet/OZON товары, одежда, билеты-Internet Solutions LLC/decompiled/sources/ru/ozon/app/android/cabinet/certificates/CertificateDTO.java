package ru.ozon.app.android.cabinet.certificates;

import C.o0;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cabinet/certificates/CertificateDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "accessory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getAccessory", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CertificateDTO {

    @NotNull
    private final String accessory;
    private final String subtitle;

    @NotNull
    private final String title;

    public CertificateDTO(@NotNull String title, String str, @NotNull String accessory) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.title = title;
        this.subtitle = str;
        this.accessory = accessory;
    }

    public static /* synthetic */ CertificateDTO copy$default(CertificateDTO certificateDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = certificateDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = certificateDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = certificateDTO.accessory;
        }
        return certificateDTO.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAccessory() {
        return this.accessory;
    }

    @NotNull
    public final CertificateDTO copy(@NotNull String title, String subtitle, @NotNull String accessory) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        return new CertificateDTO(title, subtitle, accessory);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateDTO)) {
            return false;
        }
        CertificateDTO certificateDTO = (CertificateDTO) other;
        return Intrinsics.d(this.title, certificateDTO.title) && Intrinsics.d(this.subtitle, certificateDTO.subtitle) && Intrinsics.d(this.accessory, certificateDTO.accessory);
    }

    @NotNull
    public final String getAccessory() {
        return this.accessory;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.accessory.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        return o0.c(C3660k.d("CertificateDTO(title=", str, ", subtitle=", str2, ", accessory="), this.accessory, ")");
    }
}

package ru.ozon.app.android.travel.molecules.dto.travelBadge.v1;

import Bi.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/travelBadge/v1/TravelBadgeDTO;", "", "imageLinks", "", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getImageLinks", "()Ljava/util/List;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TravelBadgeDTO {

    @NotNull
    private final List<String> imageLinks;

    @NotNull
    private final String text;

    public TravelBadgeDTO(@NotNull List<String> imageLinks, @NotNull String text) {
        Intrinsics.checkNotNullParameter(imageLinks, "imageLinks");
        Intrinsics.checkNotNullParameter(text, "text");
        this.imageLinks = imageLinks;
        this.text = text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TravelBadgeDTO copy$default(TravelBadgeDTO travelBadgeDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = travelBadgeDTO.imageLinks;
        }
        if ((i11 & 2) != 0) {
            str = travelBadgeDTO.text;
        }
        return travelBadgeDTO.copy(list, str);
    }

    @NotNull
    public final List<String> component1() {
        return this.imageLinks;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final TravelBadgeDTO copy(@NotNull List<String> imageLinks, @NotNull String text) {
        Intrinsics.checkNotNullParameter(imageLinks, "imageLinks");
        Intrinsics.checkNotNullParameter(text, "text");
        return new TravelBadgeDTO(imageLinks, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelBadgeDTO)) {
            return false;
        }
        TravelBadgeDTO travelBadgeDTO = (TravelBadgeDTO) other;
        return Intrinsics.d(this.imageLinks, travelBadgeDTO.imageLinks) && Intrinsics.d(this.text, travelBadgeDTO.text);
    }

    @NotNull
    public final List<String> getImageLinks() {
        return this.imageLinks;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.imageLinks.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return b.e("TravelBadgeDTO(imageLinks=", ", text=", this.text, ")", this.imageLinks);
    }
}

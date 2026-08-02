package ru.ozon.app.android.returns.creation.widgets.methods.data;

import B90.C2618u;
import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.data.DatesDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesElementDTO;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/ElementDTO;", "paddings", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "backgroundColor", "", "dates", "", "Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesDTO$DateDTO;", "<init>", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;Ljava/lang/String;Ljava/util/List;)V", "getPaddings", "()Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "setPaddings", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getDates", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DatesElementDTO implements ElementDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final List<DatesDTO.DateDTO> dates;

    @NotNull
    private PaddingsDTO paddings;

    public DatesElementDTO(@NotNull PaddingsDTO paddings, @NotNull String backgroundColor, @NotNull List<DatesDTO.DateDTO> dates) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(dates, "dates");
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.dates = dates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DatesElementDTO copy$default(DatesElementDTO datesElementDTO, PaddingsDTO paddingsDTO, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddingsDTO = datesElementDTO.paddings;
        }
        if ((i11 & 2) != 0) {
            str = datesElementDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            list = datesElementDTO.dates;
        }
        return datesElementDTO.copy(paddingsDTO, str, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<DatesDTO.DateDTO> component3() {
        return this.dates;
    }

    @NotNull
    public final DatesElementDTO copy(@NotNull PaddingsDTO paddings, @NotNull String backgroundColor, @NotNull List<DatesDTO.DateDTO> dates) {
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(dates, "dates");
        return new DatesElementDTO(paddings, backgroundColor, dates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DatesElementDTO)) {
            return false;
        }
        DatesElementDTO datesElementDTO = (DatesElementDTO) other;
        return Intrinsics.d(this.paddings, datesElementDTO.paddings) && Intrinsics.d(this.backgroundColor, datesElementDTO.backgroundColor) && Intrinsics.d(this.dates, datesElementDTO.dates);
    }

    @NotNull
    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<DatesDTO.DateDTO> getDates() {
        return this.dates;
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO
    @NotNull
    public PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        return this.dates.hashCode() + g.a(this.paddings.hashCode() * 31, 31, this.backgroundColor);
    }

    @Override // ru.ozon.app.android.returns.creation.widgets.methods.data.ElementDTO
    public void setPaddings(@NotNull PaddingsDTO paddingsDTO) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<set-?>");
        this.paddings = paddingsDTO;
    }

    @NotNull
    public String toString() {
        PaddingsDTO paddingsDTO = this.paddings;
        String str = this.backgroundColor;
        List<DatesDTO.DateDTO> list = this.dates;
        StringBuilder sb2 = new StringBuilder("DatesElementDTO(paddings=");
        sb2.append(paddingsDTO);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", dates=");
        return C2618u.h(sb2, list, ")");
    }
}

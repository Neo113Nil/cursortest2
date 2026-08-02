package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data;

import Bi.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/OptionsBlockDTO;", "", "options", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOptions", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsBlockDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final List<CellDTO> options;

    public OptionsBlockDTO(@NotNull List<CellDTO> options, String str) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        this.backgroundColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsBlockDTO copy$default(OptionsBlockDTO optionsBlockDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = optionsBlockDTO.options;
        }
        if ((i11 & 2) != 0) {
            str = optionsBlockDTO.backgroundColor;
        }
        return optionsBlockDTO.copy(list, str);
    }

    @NotNull
    public final List<CellDTO> component1() {
        return this.options;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final OptionsBlockDTO copy(@NotNull List<CellDTO> options, String backgroundColor) {
        Intrinsics.checkNotNullParameter(options, "options");
        return new OptionsBlockDTO(options, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsBlockDTO)) {
            return false;
        }
        OptionsBlockDTO optionsBlockDTO = (OptionsBlockDTO) other;
        return Intrinsics.d(this.options, optionsBlockDTO.options) && Intrinsics.d(this.backgroundColor, optionsBlockDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<CellDTO> getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.options.hashCode() * 31;
        String str = this.backgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return b.e("OptionsBlockDTO(options=", ", backgroundColor=", this.backgroundColor, ")", this.options);
    }
}

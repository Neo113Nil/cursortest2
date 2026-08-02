package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.data;

import C.o0;
import Fj.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/data/RoundedNavBarDTO;", "", "leftButtons", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightButtons", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getLeftButtons", "()Ljava/util/List;", "getRightButtons", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RoundedNavBarDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final List<IconButtonV3DTO> leftButtons;
    private final List<IconButtonV3DTO> rightButtons;

    public RoundedNavBarDTO(List<IconButtonV3DTO> list, List<IconButtonV3DTO> list2, String str) {
        this.leftButtons = list;
        this.rightButtons = list2;
        this.backgroundColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoundedNavBarDTO copy$default(RoundedNavBarDTO roundedNavBarDTO, List list, List list2, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = roundedNavBarDTO.leftButtons;
        }
        if ((i11 & 2) != 0) {
            list2 = roundedNavBarDTO.rightButtons;
        }
        if ((i11 & 4) != 0) {
            str = roundedNavBarDTO.backgroundColor;
        }
        return roundedNavBarDTO.copy(list, list2, str);
    }

    public final List<IconButtonV3DTO> component1() {
        return this.leftButtons;
    }

    public final List<IconButtonV3DTO> component2() {
        return this.rightButtons;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final RoundedNavBarDTO copy(List<IconButtonV3DTO> leftButtons, List<IconButtonV3DTO> rightButtons, String backgroundColor) {
        return new RoundedNavBarDTO(leftButtons, rightButtons, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoundedNavBarDTO)) {
            return false;
        }
        RoundedNavBarDTO roundedNavBarDTO = (RoundedNavBarDTO) other;
        return Intrinsics.d(this.leftButtons, roundedNavBarDTO.leftButtons) && Intrinsics.d(this.rightButtons, roundedNavBarDTO.rightButtons) && Intrinsics.d(this.backgroundColor, roundedNavBarDTO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<IconButtonV3DTO> getLeftButtons() {
        return this.leftButtons;
    }

    public final List<IconButtonV3DTO> getRightButtons() {
        return this.rightButtons;
    }

    public int hashCode() {
        List<IconButtonV3DTO> list = this.leftButtons;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<IconButtonV3DTO> list2 = this.rightButtons;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<IconButtonV3DTO> list = this.leftButtons;
        List<IconButtonV3DTO> list2 = this.rightButtons;
        return o0.c(c.d("RoundedNavBarDTO(leftButtons=", list, ", rightButtons=", ", backgroundColor=", list2), this.backgroundColor, ")");
    }
}

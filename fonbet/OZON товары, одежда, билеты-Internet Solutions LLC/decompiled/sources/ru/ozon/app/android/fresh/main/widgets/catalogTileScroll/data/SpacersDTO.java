package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data;

import B3.p;
import D40.b;
import Lh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/SpacersDTO;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "right", "top", "bottom", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRight", "getTop", "getBottom", "getBetween", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SpacersDTO {
    private final Paddings between;
    private final Paddings bottom;
    private final Paddings left;
    private final Paddings right;
    private final Paddings top;

    public SpacersDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5) {
        this.left = paddings;
        this.right = paddings2;
        this.top = paddings3;
        this.bottom = paddings4;
        this.between = paddings5;
    }

    public static /* synthetic */ SpacersDTO copy$default(SpacersDTO spacersDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paddings = spacersDTO.left;
        }
        if ((i11 & 2) != 0) {
            paddings2 = spacersDTO.right;
        }
        if ((i11 & 4) != 0) {
            paddings3 = spacersDTO.top;
        }
        if ((i11 & 8) != 0) {
            paddings4 = spacersDTO.bottom;
        }
        if ((i11 & 16) != 0) {
            paddings5 = spacersDTO.between;
        }
        Paddings paddings6 = paddings5;
        Paddings paddings7 = paddings3;
        return spacersDTO.copy(paddings, paddings2, paddings7, paddings4, paddings6);
    }

    /* renamed from: component1, reason: from getter */
    public final Paddings getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getRight() {
        return this.right;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getTop() {
        return this.top;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getBottom() {
        return this.bottom;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getBetween() {
        return this.between;
    }

    @NotNull
    public final SpacersDTO copy(Paddings left, Paddings right, Paddings top, Paddings bottom, Paddings between) {
        return new SpacersDTO(left, right, top, bottom, between);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacersDTO)) {
            return false;
        }
        SpacersDTO spacersDTO = (SpacersDTO) other;
        return this.left == spacersDTO.left && this.right == spacersDTO.right && this.top == spacersDTO.top && this.bottom == spacersDTO.bottom && this.between == spacersDTO.between;
    }

    public final Paddings getBetween() {
        return this.between;
    }

    public final Paddings getBottom() {
        return this.bottom;
    }

    public final Paddings getLeft() {
        return this.left;
    }

    public final Paddings getRight() {
        return this.right;
    }

    public final Paddings getTop() {
        return this.top;
    }

    public int hashCode() {
        Paddings paddings = this.left;
        int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
        Paddings paddings2 = this.right;
        int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.top;
        int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.bottom;
        int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
        Paddings paddings5 = this.between;
        return hashCode4 + (paddings5 != null ? paddings5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Paddings paddings = this.left;
        Paddings paddings2 = this.right;
        Paddings paddings3 = this.top;
        Paddings paddings4 = this.bottom;
        Paddings paddings5 = this.between;
        StringBuilder b11 = p.b("SpacersDTO(left=", paddings, ", right=", paddings2, ", top=");
        a.e(b11, paddings3, ", bottom=", paddings4, ", between=");
        return b.b(b11, paddings5, ")");
    }
}

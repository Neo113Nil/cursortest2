package ru.ozon.app.android.storefront.widgets.navigationSlider.data;

import Am.C2438a;
import B0.C2454a;
import J0.P;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navigationSlider/data/Option;", "", "minScreenSize", "", "maxScreenSize", "rowsNum", "elementsNum", "<init>", "(IIII)V", "getMinScreenSize", "()I", "getMaxScreenSize", "getRowsNum", "getElementsNum", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Option {
    public static final int $stable = 0;
    private final int elementsNum;
    private final int maxScreenSize;
    private final int minScreenSize;
    private final int rowsNum;

    public Option(int i11, int i12, int i13, int i14) {
        this.minScreenSize = i11;
        this.maxScreenSize = i12;
        this.rowsNum = i13;
        this.elementsNum = i14;
    }

    public static /* synthetic */ Option copy$default(Option option, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = option.minScreenSize;
        }
        if ((i15 & 2) != 0) {
            i12 = option.maxScreenSize;
        }
        if ((i15 & 4) != 0) {
            i13 = option.rowsNum;
        }
        if ((i15 & 8) != 0) {
            i14 = option.elementsNum;
        }
        return option.copy(i11, i12, i13, i14);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinScreenSize() {
        return this.minScreenSize;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxScreenSize() {
        return this.maxScreenSize;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRowsNum() {
        return this.rowsNum;
    }

    /* renamed from: component4, reason: from getter */
    public final int getElementsNum() {
        return this.elementsNum;
    }

    @NotNull
    public final Option copy(int minScreenSize, int maxScreenSize, int rowsNum, int elementsNum) {
        return new Option(minScreenSize, maxScreenSize, rowsNum, elementsNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Option)) {
            return false;
        }
        Option option = (Option) other;
        return this.minScreenSize == option.minScreenSize && this.maxScreenSize == option.maxScreenSize && this.rowsNum == option.rowsNum && this.elementsNum == option.elementsNum;
    }

    public final int getElementsNum() {
        return this.elementsNum;
    }

    public final int getMaxScreenSize() {
        return this.maxScreenSize;
    }

    public final int getMinScreenSize() {
        return this.minScreenSize;
    }

    public final int getRowsNum() {
        return this.rowsNum;
    }

    public int hashCode() {
        return Integer.hashCode(this.elementsNum) + C2454a.a(this.rowsNum, C2454a.a(this.maxScreenSize, Integer.hashCode(this.minScreenSize) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return P.a(this.rowsNum, this.elementsNum, ", elementsNum=", ")", C2438a.a("Option(minScreenSize=", this.minScreenSize, ", maxScreenSize=", ", rowsNum=", this.maxScreenSize));
    }
}

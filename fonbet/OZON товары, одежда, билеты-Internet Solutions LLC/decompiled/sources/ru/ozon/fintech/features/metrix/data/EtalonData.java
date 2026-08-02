package ru.ozon.fintech.features.metrix.data;

import Cm.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/metrix/data/EtalonData;", "", "etalonCdn", "", "etalonFront", "<init>", "(II)V", "getEtalonCdn", "()I", "getEtalonFront", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EtalonData {

    @i(name = "etalon_128k_cdn")
    private final int etalonCdn;

    @i(name = "etalon_128k_front")
    private final int etalonFront;

    public EtalonData(int i11, int i12) {
        this.etalonCdn = i11;
        this.etalonFront = i12;
    }

    public static /* synthetic */ EtalonData copy$default(EtalonData etalonData, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = etalonData.etalonCdn;
        }
        if ((i13 & 2) != 0) {
            i12 = etalonData.etalonFront;
        }
        return etalonData.copy(i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEtalonCdn() {
        return this.etalonCdn;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEtalonFront() {
        return this.etalonFront;
    }

    @NotNull
    public final EtalonData copy(int etalonCdn, int etalonFront) {
        return new EtalonData(etalonCdn, etalonFront);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EtalonData)) {
            return false;
        }
        EtalonData etalonData = (EtalonData) other;
        return this.etalonCdn == etalonData.etalonCdn && this.etalonFront == etalonData.etalonFront;
    }

    public final int getEtalonCdn() {
        return this.etalonCdn;
    }

    public final int getEtalonFront() {
        return this.etalonFront;
    }

    public int hashCode() {
        return Integer.hashCode(this.etalonFront) + (Integer.hashCode(this.etalonCdn) * 31);
    }

    @NotNull
    public String toString() {
        return e.c("EtalonData(etalonCdn=", this.etalonCdn, ", etalonFront=", ")", this.etalonFront);
    }
}

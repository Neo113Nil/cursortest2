package ru.ozon.fintech.analytic.models;

import B90.C2619v;
import Cm.e;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthRam;", "", "total", "", "free", "<init>", "(DD)V", "getTotal", "()D", "getFree", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthRam {

    @i(name = "free")
    private final double free;

    @i(name = "total")
    private final double total;

    public HealthRam(double d11, double d12) {
        this.total = d11;
        this.free = d12;
    }

    public static /* synthetic */ HealthRam copy$default(HealthRam healthRam, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = healthRam.total;
        }
        if ((i11 & 2) != 0) {
            d12 = healthRam.free;
        }
        return healthRam.copy(d11, d12);
    }

    /* renamed from: component1, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* renamed from: component2, reason: from getter */
    public final double getFree() {
        return this.free;
    }

    @NotNull
    public final HealthRam copy(double total, double free) {
        return new HealthRam(total, free);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthRam)) {
            return false;
        }
        HealthRam healthRam = (HealthRam) other;
        return Double.compare(this.total, healthRam.total) == 0 && Double.compare(this.free, healthRam.free) == 0;
    }

    public final double getFree() {
        return this.free;
    }

    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Double.hashCode(this.free) + (Double.hashCode(this.total) * 31);
    }

    @NotNull
    public String toString() {
        double d11 = this.total;
        return C2619v.c(e.e(d11, "HealthRam(total=", ", free="), this.free, ")");
    }
}

package ru.ozon.fintech.analytic.models;

import Pk0.g;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthDisk;", "", "diskId", "", "total", "", "free", "<init>", "(Ljava/lang/String;DD)V", "getDiskId", "()Ljava/lang/String;", "getTotal", "()D", "getFree", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthDisk {

    @i(name = "disk_id")
    @NotNull
    private final String diskId;

    @i(name = "free")
    private final double free;

    @i(name = "total")
    private final double total;

    public HealthDisk(@NotNull String diskId, double d11, double d12) {
        Intrinsics.checkNotNullParameter(diskId, "diskId");
        this.diskId = diskId;
        this.total = d11;
        this.free = d12;
    }

    public static /* synthetic */ HealthDisk copy$default(HealthDisk healthDisk, String str, double d11, double d12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = healthDisk.diskId;
        }
        if ((i11 & 2) != 0) {
            d11 = healthDisk.total;
        }
        if ((i11 & 4) != 0) {
            d12 = healthDisk.free;
        }
        return healthDisk.copy(str, d11, d12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDiskId() {
        return this.diskId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    /* renamed from: component3, reason: from getter */
    public final double getFree() {
        return this.free;
    }

    @NotNull
    public final HealthDisk copy(@NotNull String diskId, double total, double free) {
        Intrinsics.checkNotNullParameter(diskId, "diskId");
        return new HealthDisk(diskId, total, free);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthDisk)) {
            return false;
        }
        HealthDisk healthDisk = (HealthDisk) other;
        return Intrinsics.d(this.diskId, healthDisk.diskId) && Double.compare(this.total, healthDisk.total) == 0 && Double.compare(this.free, healthDisk.free) == 0;
    }

    @NotNull
    public final String getDiskId() {
        return this.diskId;
    }

    public final double getFree() {
        return this.free;
    }

    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        return Double.hashCode(this.free) + g.a(this.diskId.hashCode() * 31, 31, this.total);
    }

    @NotNull
    public String toString() {
        return "HealthDisk(diskId=" + this.diskId + ", total=" + this.total + ", free=" + this.free + ")";
    }
}

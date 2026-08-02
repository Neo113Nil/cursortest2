package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms;

import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsRoomsList/v5/presentation/rooms/TariffLayoutCache;", "", "", "tariffHeight", "", "fontScale", "densityDpi", "<init>", "(ILjava/lang/Float;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTariffHeight", "Ljava/lang/Float;", "getFontScale", "()Ljava/lang/Float;", "getDensityDpi", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffLayoutCache {
    private final int densityDpi;
    private final Float fontScale;
    private final int tariffHeight;

    public TariffLayoutCache(int i11, Float f7, int i12) {
        this.tariffHeight = i11;
        this.fontScale = f7;
        this.densityDpi = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TariffLayoutCache)) {
            return false;
        }
        TariffLayoutCache tariffLayoutCache = (TariffLayoutCache) other;
        return this.tariffHeight == tariffLayoutCache.tariffHeight && Intrinsics.d(this.fontScale, tariffLayoutCache.fontScale) && this.densityDpi == tariffLayoutCache.densityDpi;
    }

    public final int getDensityDpi() {
        return this.densityDpi;
    }

    public final Float getFontScale() {
        return this.fontScale;
    }

    public final int getTariffHeight() {
        return this.tariffHeight;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.tariffHeight) * 31;
        Float f7 = this.fontScale;
        return Integer.hashCode(this.densityDpi) + ((hashCode + (f7 == null ? 0 : f7.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.tariffHeight;
        Float f7 = this.fontScale;
        int i12 = this.densityDpi;
        StringBuilder sb2 = new StringBuilder("TariffLayoutCache(tariffHeight=");
        sb2.append(i11);
        sb2.append(", fontScale=");
        sb2.append(f7);
        sb2.append(", densityDpi=");
        return b.e(i12, ")", sb2);
    }
}

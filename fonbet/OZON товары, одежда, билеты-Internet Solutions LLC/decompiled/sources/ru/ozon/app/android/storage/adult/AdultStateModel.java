package ru.ozon.app.android.storage.adult;

import G.g;
import N3.C3660k;
import P4.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storage/adult/AdultStateModel;", "", "", "key", "adultValue", "", "expireDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "getAdultValue", "J", "getExpireDate", "()J", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdultStateModel {

    @NotNull
    private final String adultValue;
    private final long expireDate;

    @NotNull
    private final String key;

    public AdultStateModel(@NotNull String key, @NotNull String adultValue, long j11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(adultValue, "adultValue");
        this.key = key;
        this.adultValue = adultValue;
        this.expireDate = j11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdultStateModel)) {
            return false;
        }
        AdultStateModel adultStateModel = (AdultStateModel) other;
        return Intrinsics.d(this.key, adultStateModel.key) && Intrinsics.d(this.adultValue, adultStateModel.adultValue) && this.expireDate == adultStateModel.expireDate;
    }

    @NotNull
    public final String getAdultValue() {
        return this.adultValue;
    }

    public final long getExpireDate() {
        return this.expireDate;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return Long.hashCode(this.expireDate) + g.a(this.key.hashCode() * 31, 31, this.adultValue);
    }

    @NotNull
    public String toString() {
        return f.a(this.expireDate, ")", C3660k.d("AdultStateModel(key=", this.key, ", adultValue=", this.adultValue, ", expireDate="));
    }
}

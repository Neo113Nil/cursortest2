package ru.ozon.app.android.cart.async.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cart/async/data/AsyncDTO;", "", "enabled", "", "operationsDebounceDelay", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOperationsDebounceDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lru/ozon/app/android/cart/async/data/AsyncDTO;", "equals", "other", "hashCode", "toString", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AsyncDTO {
    public static final int $stable = 0;
    private final Boolean enabled;
    private final Integer operationsDebounceDelay;

    public AsyncDTO(Boolean bool, Integer num) {
        this.enabled = bool;
        this.operationsDebounceDelay = num;
    }

    public static /* synthetic */ AsyncDTO copy$default(AsyncDTO asyncDTO, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = asyncDTO.enabled;
        }
        if ((i11 & 2) != 0) {
            num = asyncDTO.operationsDebounceDelay;
        }
        return asyncDTO.copy(bool, num);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getOperationsDebounceDelay() {
        return this.operationsDebounceDelay;
    }

    @NotNull
    public final AsyncDTO copy(Boolean enabled, Integer operationsDebounceDelay) {
        return new AsyncDTO(enabled, operationsDebounceDelay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncDTO)) {
            return false;
        }
        AsyncDTO asyncDTO = (AsyncDTO) other;
        return Intrinsics.d(this.enabled, asyncDTO.enabled) && Intrinsics.d(this.operationsDebounceDelay, asyncDTO.operationsDebounceDelay);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getOperationsDebounceDelay() {
        return this.operationsDebounceDelay;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.operationsDebounceDelay;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AsyncDTO(enabled=" + this.enabled + ", operationsDebounceDelay=" + this.operationsDebounceDelay + ")";
    }
}

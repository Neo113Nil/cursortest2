package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.data.response;

import De.C2859b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/largeOrdersLiftingV2/data/response/LargeOrdersLiftingData;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LargeOrdersLiftingData {
    public static final int $stable = 0;
    private final AtomActionDTO action;

    public LargeOrdersLiftingData(AtomActionDTO atomActionDTO) {
        this.action = atomActionDTO;
    }

    public static /* synthetic */ LargeOrdersLiftingData copy$default(LargeOrdersLiftingData largeOrdersLiftingData, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = largeOrdersLiftingData.action;
        }
        return largeOrdersLiftingData.copy(atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final LargeOrdersLiftingData copy(AtomActionDTO action) {
        return new LargeOrdersLiftingData(action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LargeOrdersLiftingData) && Intrinsics.d(this.action, ((LargeOrdersLiftingData) other).action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        if (atomActionDTO == null) {
            return 0;
        }
        return atomActionDTO.hashCode();
    }

    @NotNull
    public String toString() {
        return C2859b.f("LargeOrdersLiftingData(action=", ")", this.action);
    }
}

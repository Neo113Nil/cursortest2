package ru.ozon.app.android.checkoutcomposer.total.sticky.v3.presentation;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.total.sticky.v3.data.TotalStickyV3DTO;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/presentation/TotalStickyV3StateUpdate;", "LA00/a$J$a;", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;", "updatedDTO", "<init>", "(Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;)V", "Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;", "getUpdatedDTO", "()Lru/ozon/app/android/checkoutcomposer/total/sticky/v3/data/TotalStickyV3DTO;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalStickyV3StateUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final TotalStickyV3DTO updatedDTO;

    public TotalStickyV3StateUpdate(@NotNull TotalStickyV3DTO updatedDTO) {
        Intrinsics.checkNotNullParameter(updatedDTO, "updatedDTO");
        this.updatedDTO = updatedDTO;
    }

    @NotNull
    public final TotalStickyV3DTO getUpdatedDTO() {
        return this.updatedDTO;
    }
}

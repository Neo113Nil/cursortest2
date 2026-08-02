package ru.ozon.app.android.pdp.widgets.cartButtonV5.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\nR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/QuantTypeRepository;", "", "<init>", "()V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "lastCartType", "getLastCartType", "()Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO$CartType;", "setLastCartType", "", "type", "clear", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QuantTypeRepository {
    private CartButtonV5VO.CartType lastCartType;

    public final void clear() {
        this.lastCartType = null;
    }

    public final CartButtonV5VO.CartType getLastCartType() {
        return this.lastCartType;
    }

    public final void setLastCartType(@NotNull CartButtonV5VO.CartType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.lastCartType = type;
    }
}

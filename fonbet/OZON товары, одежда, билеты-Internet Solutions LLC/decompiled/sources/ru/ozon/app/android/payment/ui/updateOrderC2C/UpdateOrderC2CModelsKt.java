package ru.ozon.app.android.payment.ui.updateOrderC2C;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDO;
import ru.ozon.app.android.payment.ui.updateOrderC2C.UpdateOrderDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDO", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDO;", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO;", "payment_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateOrderC2CModelsKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final UpdateOrderDO toDO(@NotNull UpdateOrderDTO updateOrderDTO) {
        Object obj;
        Long l11;
        long j11;
        Intrinsics.checkNotNullParameter(updateOrderDTO, "<this>");
        if (updateOrderDTO.getError() == null) {
            return updateOrderDTO.getRedirectLink() != null ? new UpdateOrderDO.UpdateOrderRedirect(updateOrderDTO.getRedirectLink()) : UpdateOrderDO.UpdateOrderUnknown.INSTANCE;
        }
        Iterator<E> it = UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String key = ((UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE) obj).getKey();
            UpdateOrderDTO.ErrorActionDTO action = updateOrderDTO.getError().getAction();
            if (Intrinsics.d(key, action != null ? action.getType() : null)) {
                break;
            }
        }
        UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE type = (UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE) obj;
        if (type == null) {
            type = UpdateOrderDO.UpdateOrderError.ErrorAction.TYPE.DEFAULT;
        }
        String message = updateOrderDTO.getError().getMessage();
        String lifetime = updateOrderDTO.getError().getLifetime();
        if (Intrinsics.d(lifetime, Restriction.Lifetime.INFINITE.getValue())) {
            j11 = 10000L;
        } else if (Intrinsics.d(lifetime, Restriction.Lifetime.LONG.getValue())) {
            j11 = 6000L;
        } else {
            if (!Intrinsics.d(lifetime, Restriction.Lifetime.SHORT.getValue())) {
                l11 = null;
                String image = updateOrderDTO.getError().getImage();
                String imageTintColor = updateOrderDTO.getError().getImageTintColor();
                UpdateOrderDTO.ErrorActionDTO action2 = updateOrderDTO.getError().getAction();
                String title = action2 == null ? action2.getTitle() : null;
                UpdateOrderDTO.ErrorActionDTO action3 = updateOrderDTO.getError().getAction();
                return new UpdateOrderDO.UpdateOrderError(message, l11, new UpdateOrderDO.UpdateOrderError.ErrorAction(type, title, action3 != null ? action3.getLink() : null), image, imageTintColor, updateOrderDTO.getError().getTrackingInfo());
            }
            j11 = 3000L;
        }
        l11 = j11;
        String image2 = updateOrderDTO.getError().getImage();
        String imageTintColor2 = updateOrderDTO.getError().getImageTintColor();
        UpdateOrderDTO.ErrorActionDTO action22 = updateOrderDTO.getError().getAction();
        if (action22 == null) {
        }
        UpdateOrderDTO.ErrorActionDTO action32 = updateOrderDTO.getError().getAction();
        return new UpdateOrderDO.UpdateOrderError(message, l11, new UpdateOrderDO.UpdateOrderError.ErrorAction(type, title, action32 != null ? action32.getLink() : null), image2, imageTintColor2, updateOrderDTO.getError().getTrackingInfo());
    }
}

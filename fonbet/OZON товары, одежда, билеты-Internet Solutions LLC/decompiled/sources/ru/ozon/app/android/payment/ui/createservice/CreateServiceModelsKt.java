package ru.ozon.app.android.payment.ui.createservice;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceDO;
import ru.ozon.app.android.payment.ui.createservice.CreateServiceDTO;
import ru.ozon.uni.android.flashbar.model.Restriction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toDO", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDO;", "Lru/ozon/app/android/payment/ui/createservice/CreateServiceDTO;", "payment_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateServiceModelsKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CreateServiceDO toDO(@NotNull CreateServiceDTO createServiceDTO) {
        Object obj;
        Long l11;
        long j11;
        Intrinsics.checkNotNullParameter(createServiceDTO, "<this>");
        if (createServiceDTO.getError() == null) {
            return createServiceDTO.getRedirectLink() != null ? new CreateServiceDO.CreateServiceRedirect(createServiceDTO.getRedirectLink(), createServiceDTO.getCancelLink()) : CreateServiceDO.CreateServiceUnknown.INSTANCE;
        }
        Iterator<E> it = CreateServiceDO.CreateServiceError.ErrorAction.TYPE.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String key = ((CreateServiceDO.CreateServiceError.ErrorAction.TYPE) obj).getKey();
            CreateServiceDTO.ErrorActionDTO action = createServiceDTO.getError().getAction();
            if (Intrinsics.d(key, action != null ? action.getType() : null)) {
                break;
            }
        }
        CreateServiceDO.CreateServiceError.ErrorAction.TYPE type = (CreateServiceDO.CreateServiceError.ErrorAction.TYPE) obj;
        if (type == null) {
            type = CreateServiceDO.CreateServiceError.ErrorAction.TYPE.DEFAULT;
        }
        String message = createServiceDTO.getError().getMessage();
        String lifetime = createServiceDTO.getError().getLifetime();
        if (Intrinsics.d(lifetime, Restriction.Lifetime.INFINITE.getValue())) {
            j11 = 10000L;
        } else if (Intrinsics.d(lifetime, Restriction.Lifetime.LONG.getValue())) {
            j11 = 6000L;
        } else {
            if (!Intrinsics.d(lifetime, Restriction.Lifetime.SHORT.getValue())) {
                l11 = null;
                String image = createServiceDTO.getError().getImage();
                String imageTintColor = createServiceDTO.getError().getImageTintColor();
                CreateServiceDTO.ErrorActionDTO action2 = createServiceDTO.getError().getAction();
                String title = action2 == null ? action2.getTitle() : null;
                CreateServiceDTO.ErrorActionDTO action3 = createServiceDTO.getError().getAction();
                return new CreateServiceDO.CreateServiceError(message, l11, new CreateServiceDO.CreateServiceError.ErrorAction(type, title, action3 != null ? action3.getLink() : null), image, imageTintColor, createServiceDTO.getError().getTrackingInfo());
            }
            j11 = 3000L;
        }
        l11 = j11;
        String image2 = createServiceDTO.getError().getImage();
        String imageTintColor2 = createServiceDTO.getError().getImageTintColor();
        CreateServiceDTO.ErrorActionDTO action22 = createServiceDTO.getError().getAction();
        if (action22 == null) {
        }
        CreateServiceDTO.ErrorActionDTO action32 = createServiceDTO.getError().getAction();
        return new CreateServiceDO.CreateServiceError(message, l11, new CreateServiceDO.CreateServiceError.ErrorAction(type, title, action32 != null ? action32.getLink() : null), image2, imageTintColor2, createServiceDTO.getError().getTrackingInfo());
    }
}

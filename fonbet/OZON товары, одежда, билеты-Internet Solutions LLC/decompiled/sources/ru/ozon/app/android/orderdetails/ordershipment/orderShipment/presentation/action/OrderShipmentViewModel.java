package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action;

import GZ.g;
import LZ.b;
import androidx.lifecycle.w0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier.ContactCourierBottomSheetDialog;
import ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.contactcourier.CourierInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import sZ.c;
import uZ.C9992d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/OrderShipmentViewModel;", "Landroidx/lifecycle/w0;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/CourierInfo;", "makeCourierInfo", "(Ljava/util/Map;)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/contactcourier/CourierInfo;", "params", "", "onContactCourierClick", "(Ljava/util/Map;)V", "LGZ/g;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderShipmentViewModel extends w0 {

    @NotNull
    private final g ozonRouter;

    public OrderShipmentViewModel(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    private final CourierInfo makeCourierInfo(Map<String, String> map) {
        String str = map.get(SelectionItemFormDTO.TITLE_FIELD_NAME);
        if (str == null) {
            str = "";
        }
        String str2 = map.get("formattedPhone");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = map.get("link");
        return new CourierInfo(str2, str3 != null ? str3 : "", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onContactCourierClick(Map<String, String> params) {
        if (params != null) {
            this.ozonRouter.c(new b(new C9992d(new c("ContactCourierBottomSheetDialog", ContactCourierBottomSheetDialog.INSTANCE.newInstance(makeCourierInfo(params)), null, false, false, null, false, false, false, 508, null), null, 2, 0 == true ? 1 : 0)), null);
        }
    }
}

package v6;

import android.content.Intent;
import android.os.Message;
import v6.C10262f;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10258b {
    public static C10262f a(Message message) {
        C10262f.a aVar;
        int i11 = message.what;
        String string = message.getData().getString("DATA");
        Object obj = message.obj;
        Intent intent = obj instanceof Intent ? (Intent) obj : null;
        switch (i11) {
            case 0:
                aVar = C10262f.a.SUCCESS_WITH_DATA;
                break;
            case 1:
                aVar = C10262f.a.SUCCESS_WITH_INTENT;
                break;
            case 2:
                aVar = C10262f.a.ERROR_MIRPAY_SETUP_NOT_COMPLETE;
                break;
            case 3:
                aVar = C10262f.a.ERROR_MIRPAY_APP_NEED_TO_UPDATE;
                break;
            case 4:
                aVar = C10262f.a.ERROR_MIRPAY_SECURITY_ISSUE;
                break;
            case 5:
                aVar = C10262f.a.ERROR_MIRPAY_SDK_NEED_TO_UPDATE;
                break;
            case 6:
                aVar = C10262f.a.ERROR_MIRPAY_SDK_WRONG_VERSION;
                break;
            case 7:
                aVar = C10262f.a.ERROR_MIRPAY_ACCESS_DENIED;
                break;
            case 8:
                aVar = C10262f.a.ERROR_MIRPAY_INTERNAL_ERROR;
                break;
            case 9:
                aVar = C10262f.a.ERROR_MIRPAY_DISCONNECTED;
                break;
            case 10:
                aVar = C10262f.a.ERROR_MIRPAY_NO_AVAILABLE_PAYMENT_CARD;
                break;
            case 11:
                aVar = C10262f.a.ERROR_MIRPAY_MERCHANT_TOKEN_VALIDATION_FAILED;
                break;
            default:
                throw new IllegalArgumentException(Ej.b.a(i11, "Unsupported callType: "));
        }
        return new C10262f(aVar, string, intent);
    }
}

package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.internal.zzdd;
import com.google.android.gms.wearable.internal.zzil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eto extends gso {
    public final ArrayList b;

    public eto(jwn jwnVar, ArrayList arrayList) {
        super(jwnVar);
        this.b = arrayList;
    }

    @Override // com.google.android.gms.wearable.internal.zza, com.google.android.gms.wearable.internal.zzgm
    public final void N1(zzil zzilVar) {
        String str;
        int i = zzilVar.a;
        switch (i) {
            case 4000:
                str = "TARGET_NODE_NOT_CONNECTED";
                break;
            case 4001:
                str = "DUPLICATE_LISTENER";
                break;
            case 4002:
                str = "UNKNOWN_LISTENER";
                break;
            case 4003:
                str = "DATA_ITEM_TOO_LARGE";
                break;
            case 4004:
                str = "INVALID_TARGET_NODE";
                break;
            case 4005:
                str = "ASSET_UNAVAILABLE";
                break;
            case 4006:
                str = "DUPLICATE_CAPABILITY";
                break;
            case 4007:
                str = "UNKNOWN_CAPABILITY";
                break;
            case 4008:
                str = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            case 4009:
                str = "UNSUPPORTED_BY_TARGET";
                break;
            case 4010:
                str = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            case 4011:
            default:
                str = CommonStatusCodes.a(i);
                break;
            case 4012:
                str = "MIGRATION_NOT_CANCELLABLE";
                break;
            case 4013:
                str = "NO_MIGRATION_FOUND_TO_CANCEL";
                break;
            case 4014:
                str = "FEATURE_DISABLED";
                break;
            case 4015:
                str = "WIFI_CONNECTION_FAILED";
                break;
        }
        zzdd zzddVar = new zzdd(new Status(i, str, null, null), zzilVar.b);
        BaseImplementation.ResultHolder resultHolder = this.a;
        if (resultHolder != null) {
            resultHolder.a(zzddVar);
            this.a = null;
        }
        if (i != 0) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}

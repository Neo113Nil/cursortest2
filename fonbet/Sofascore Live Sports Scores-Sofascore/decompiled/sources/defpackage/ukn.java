package defpackage;

import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.internal.play_billing.zzcc;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum ukn {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final lun c;
    public final int a;

    static {
        zzcc zzccVar = new zzcc();
        for (ukn uknVar : values()) {
            Integer valueOf = Integer.valueOf(uknVar.a);
            int i = zzccVar.b + 1;
            Object[] objArr = zzccVar.a;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                objArr = Arrays.copyOf(objArr, zzbw.a(length, i2));
                zzccVar.a = objArr;
            }
            int i3 = zzccVar.b;
            int i4 = i3 + i3;
            objArr[i4] = valueOf;
            objArr[i4 + 1] = uknVar;
            zzccVar.b = i3 + 1;
        }
        jrn jrnVar = zzccVar.c;
        if (jrnVar != null) {
            throw jrnVar.a();
        }
        lun i5 = lun.i(zzccVar.b, zzccVar.a, zzccVar);
        jrn jrnVar2 = zzccVar.c;
        if (jrnVar2 != null) {
            throw jrnVar2.a();
        }
        c = i5;
    }

    ukn(int i) {
        this.a = i;
    }
}

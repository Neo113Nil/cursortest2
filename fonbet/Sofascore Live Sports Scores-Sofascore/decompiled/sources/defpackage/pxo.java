package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.measurement.zzmk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pxo implements fj0 {
    public static final /* synthetic */ pxo a = new pxo();

    @Override // defpackage.fj0
    public final ddb apply(Object obj) {
        ApiException apiException = (ApiException) obj;
        throw new zzmk(apiException.a.a, apiException.getMessage(), apiException);
    }
}

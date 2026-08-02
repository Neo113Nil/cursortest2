package defpackage;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.signin.zae;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x1n extends sk0 {
    public final HashMap c;
    public final /* synthetic */ zaar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1n(zaar zaarVar, HashMap hashMap) {
        super(zaarVar, 2);
        this.d = zaarVar;
        this.c = hashMap;
    }

    @Override // defpackage.sk0
    public final void c() {
        zae zaeVar;
        zaar zaarVar = this.d;
        GoogleApiAvailabilityLight googleApiAvailabilityLight = zaarVar.d;
        b2n b2nVar = zaarVar.a.e;
        Context context = zaarVar.c;
        zao zaoVar = new zao(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = this.c;
        for (Api.Client client : hashMap.keySet()) {
            if (!client.requiresGooglePlayServices() || ((u1n) hashMap.get(client)).c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i = 0;
        int i2 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                i2 = zaoVar.a(context, (Api.Client) arrayList.get(i));
                i++;
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                i2 = zaoVar.a(context, (Api.Client) arrayList2.get(i));
                i++;
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            b2nVar.sendMessage(b2nVar.obtainMessage(1, new v1n(this, zaarVar, new ConnectionResult(i2, null, null))));
            return;
        }
        if (zaarVar.m && (zaeVar = zaarVar.k) != null) {
            zaeVar.l();
        }
        for (Api.Client client2 : hashMap.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) hashMap.get(client2);
            if (!client2.requiresGooglePlayServices() || zaoVar.a(context, client2) == 0) {
                client2.connect(connectionProgressReportCallbacks);
            } else {
                b2nVar.sendMessage(b2nVar.obtainMessage(1, new w1n(this, zaarVar, connectionProgressReportCallbacks)));
            }
        }
    }
}

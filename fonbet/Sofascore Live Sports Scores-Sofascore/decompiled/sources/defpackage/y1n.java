package defpackage;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zabd;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.zae;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y1n extends sk0 {
    public final ArrayList c;
    public final /* synthetic */ zaar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1n(zaar zaarVar, ArrayList arrayList) {
        super(zaarVar, 2);
        this.d = zaarVar;
        this.c = arrayList;
    }

    @Override // defpackage.sk0
    public final void c() {
        Set set;
        zaar zaarVar = this.d;
        zabd zabdVar = zaarVar.a;
        zaaz zaazVar = zabdVar.m;
        ClientSettings clientSettings = zaarVar.r;
        if (clientSettings == null) {
            set = Collections.EMPTY_SET;
        } else {
            HashSet hashSet = new HashSet(clientSettings.b);
            Map map = clientSettings.d;
            for (Api api : map.keySet()) {
                if (!zabdVar.g.containsKey(api.b)) {
                    ((zae) map.get(api)).getClass();
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        }
        zaazVar.p = set;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Api.Client) arrayList.get(i)).getRemoteService(zaarVar.o, zabdVar.m.p);
        }
    }
}

package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.p;
import com.unity3d.services.core.di.ServiceProvider;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {
    private final String b;
    private final String c;
    private final p d;

    public j(String str, String str2, p pVar) {
        this.b = str;
        this.c = str2;
        this.d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> a = com.mbridge.msdk.thrid.okhttp.n.a.a(str);
            return (a.isEmpty() && i.b().c(this.b, this.c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : a;
        } catch (UnknownHostException e) {
            if (i.b().c(this.b, this.c, str)) {
                return this.a(str, new UnknownHostException(e.getMessage()));
            }
            throw e;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.d;
        if (pVar != null) {
            pVar.c(ServiceProvider.NAMED_LOCAL);
        }
        return i.b().a(str, unknownHostException);
    }
}

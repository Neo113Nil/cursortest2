package com.ironsource;

import android.util.Pair;
import com.ironsource.InterfaceC4429z7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class G5 implements Runnable {
    private static final String e = "Content-Type";
    private static final String f = "application/json";
    private InterfaceC4429z7 a;
    String b;
    String c;
    ArrayList<C4355v5> d;

    public G5(InterfaceC4429z7 interfaceC4429z7, String str, String str2, ArrayList<C4355v5> arrayList) {
        this.a = interfaceC4429z7;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC4429z7.a a;
        InterfaceC4429z7.a aVar = new InterfaceC4429z7.a(this.d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Od b = Z7.b(this.c, this.b, arrayList);
            a = aVar.a(b.a()).a(b.a);
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            a = aVar.a(e2 instanceof Ec).a(e2);
        }
        InterfaceC4429z7 interfaceC4429z7 = this.a;
        if (interfaceC4429z7 != null) {
            interfaceC4429z7.a(a);
        }
    }
}

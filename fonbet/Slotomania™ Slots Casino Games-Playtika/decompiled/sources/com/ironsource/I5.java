package com.ironsource;

import android.util.Pair;
import com.ironsource.C7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class I5 implements Runnable {
    private static final String e = "Content-Type";
    private static final String f = "application/json";
    private C7 a;
    String b;
    String c;
    ArrayList<C2736x5> d;

    public I5(C7 c7, String str, String str2, ArrayList<C2736x5> arrayList) {
        this.a = c7;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        C7.a a;
        C7.a aVar = new C7.a(this.d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            Pd b = C2345b8.b(this.c, this.b, arrayList);
            a = aVar.a(b.a()).a(b.a);
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error("EventsSender failed to send events - " + e2.getLocalizedMessage());
            a = aVar.a(e2 instanceof Ec).a(e2);
        }
        C7 c7 = this.a;
        if (c7 != null) {
            c7.a(a);
        }
    }
}

package com.ironsource;

import com.ironsource.AbstractC4121i3;
import com.ironsource.C4088g6;
import com.ironsource.C4351v1;
import com.ironsource.C4424z2;
import com.ironsource.InterfaceC4429z7;
import com.ironsource.Vb;
import defpackage.d6b;
import defpackage.fsf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class hh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Vb.a.a((Throwable) obj2, (Vb) obj);
                break;
            case 1:
                C4088g6.a.a((Throwable) obj2, (C4088g6) obj);
                break;
            case 2:
                C4088g6.b.a((C4088g6) obj2, (fsf) obj);
                break;
            case 3:
                ((AbstractC4121i3.c) obj2).b((InterfaceC4429z7.a) obj);
                break;
            case 4:
                C4351v1.a.a((d6b) obj2, (C4351v1.a) obj);
                break;
            default:
                C4424z2.a.a((Throwable) obj2, (C4424z2) obj);
                break;
        }
    }
}

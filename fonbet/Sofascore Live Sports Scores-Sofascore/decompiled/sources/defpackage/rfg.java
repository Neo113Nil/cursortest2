package defpackage;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.internal.AFi1eSDK;
import com.inmobi.media.C3689q;
import com.inmobi.media.InterfaceC3880x9;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class rfg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rfg(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        Intent R_;
        int i = this.a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                kig kigVar = (kig) obj;
                xag xagVar = ((tfg) obj2).z;
                if (xagVar != null) {
                    ((zag) xagVar).i(kigVar, j);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                R_ = AFi1eSDK.R_((AFi1eSDK) obj2, (String) obj, j);
                return R_;
            default:
                return C3689q.a((InterfaceC3880x9) obj2, (Context) obj, j);
        }
    }
}

package defpackage;

import com.inmobi.media.Ah;
import com.inmobi.media.C3862wh;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class am implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Ah c;

    public /* synthetic */ am(int i, Ah ah, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = ah;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Ah ah = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Ah.b(function1, ah);
                break;
            case 1:
                Ah.a(function1, ah);
                break;
            default:
                C3862wh.a(function1, ah);
                break;
        }
    }
}

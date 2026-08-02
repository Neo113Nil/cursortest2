package defpackage;

import com.ironsource.B;
import com.ironsource.C4062eg;
import com.ironsource.C4289rb;
import com.vungle.ads.internal.util.y;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class iy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ iy(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                function0.invoke();
                break;
            case 3:
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                B.b(function0);
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                function0.invoke();
                break;
            case 8:
                C4062eg.b(function0);
                break;
            case 9:
                C4062eg.a(function0);
                break;
            case 10:
                C4289rb.a(function0);
                break;
            default:
                y.b(function0);
                break;
        }
    }
}

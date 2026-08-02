package defpackage;

import androidx.fragment.app.g;
import androidx.fragment.app.s;
import androidx.fragment.app.y;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ys4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;
    public final /* synthetic */ g c;

    public /* synthetic */ ys4(y yVar, g gVar, int i) {
        this.a = i;
        this.b = yVar;
        this.c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g gVar = this.c;
        y yVar = this.b;
        switch (i) {
            case 0:
                if (s.O(2)) {
                    Objects.toString(yVar);
                }
                yVar.c(gVar);
                break;
            default:
                if (s.O(2)) {
                    Objects.toString(yVar);
                }
                yVar.c(gVar);
                break;
        }
    }
}

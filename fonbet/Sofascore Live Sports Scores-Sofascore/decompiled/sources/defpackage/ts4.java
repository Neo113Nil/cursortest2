package defpackage;

import androidx.fragment.app.h;
import androidx.fragment.app.y;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ts4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ y c;

    public /* synthetic */ ts4(h hVar, y yVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        y yVar = this.c;
        h hVar = this.b;
        switch (i) {
            case 0:
                hVar.a(yVar);
                break;
            default:
                hVar.b.remove(yVar);
                hVar.c.remove(yVar);
                break;
        }
    }
}

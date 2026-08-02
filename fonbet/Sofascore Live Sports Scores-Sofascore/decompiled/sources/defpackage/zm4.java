package defpackage;

import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zm4 implements qdb {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zqk b;

    public /* synthetic */ zm4(qv qvVar, zqk zqkVar) {
        this.b = zqkVar;
    }

    @Override // defpackage.qdb
    public final void invoke(Object obj) {
        int i = this.a;
        zqk zqkVar = this.b;
        switch (i) {
            case 0:
                s6c s6cVar = (s6c) ((sv) obj);
                b10 b10Var = s6cVar.p;
                if (b10Var != null) {
                    b bVar = (b) b10Var.c;
                    if (bVar.w == -1) {
                        qm8 a = bVar.a();
                        a.u = zqkVar.a;
                        a.v = zqkVar.b;
                        s6cVar.p = new b10((Object) new b(a), (String) b10Var.d, b10Var.b, 8);
                    }
                }
                int i2 = zqkVar.a;
                break;
            default:
                ((wke) obj).onVideoSizeChanged(zqkVar);
                break;
        }
    }

    public /* synthetic */ zm4(zqk zqkVar) {
        this.b = zqkVar;
    }
}

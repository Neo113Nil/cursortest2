package defpackage;

import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class en2 extends exj {
    public boolean a = false;
    public final ViewGroup b;

    public en2(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void a() {
        hda.R(this.b, false);
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void c() {
        hda.R(this.b, true);
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void d(xwj xwjVar) {
        hda.R(this.b, false);
        this.a = true;
    }

    @Override // defpackage.exj, defpackage.wwj
    public final void e(xwj xwjVar) {
        if (!this.a) {
            hda.R(this.b, false);
        }
        xwjVar.A(this);
    }
}

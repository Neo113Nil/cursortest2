package defpackage;

import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki2 implements xn3, k3f {
    public final /* synthetic */ int a;
    public final /* synthetic */ li2 b;

    public /* synthetic */ ki2(li2 li2Var, int i) {
        this.a = i;
        this.b = li2Var;
    }

    @Override // defpackage.xn3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.d = (wy7) obj;
                break;
            default:
                this.b.d = null;
                break;
        }
    }

    @Override // defpackage.k3f
    public boolean test(Object obj) {
        li2 li2Var = this.b;
        li2Var.getClass();
        long i = ((wy7) obj).i();
        li2Var.c.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(li2Var.b.getApplicationContext().getFilesDir(), "fiam_eligible_campaigns_cache_file");
        return i != 0 ? currentTimeMillis < i : !file.exists() || currentTimeMillis < file.lastModified() + 86400000;
    }
}

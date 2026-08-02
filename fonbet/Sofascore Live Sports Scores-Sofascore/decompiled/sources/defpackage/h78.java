package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h78 {
    public final /* synthetic */ int a;
    public final SparseBooleanArray b;
    public boolean c;

    public h78(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SparseBooleanArray();
                break;
            default:
                this.b = new SparseBooleanArray();
                break;
        }
    }

    public final void a(int i) {
        int i2 = this.a;
        SparseBooleanArray sparseBooleanArray = this.b;
        switch (i2) {
            case 0:
                qx9.t(!this.c);
                sparseBooleanArray.append(i, true);
                break;
            default:
                z1a.E(!this.c);
                sparseBooleanArray.append(i, true);
                break;
        }
    }

    public void b(j78 j78Var) {
        SparseBooleanArray sparseBooleanArray = j78Var.a;
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            z1a.v(i, sparseBooleanArray.size());
            a(sparseBooleanArray.keyAt(i));
        }
    }

    public i78 c() {
        qx9.t(!this.c);
        this.c = true;
        return new i78(this.b);
    }

    public j78 d() {
        z1a.E(!this.c);
        this.c = true;
        return new j78(this.b);
    }
}

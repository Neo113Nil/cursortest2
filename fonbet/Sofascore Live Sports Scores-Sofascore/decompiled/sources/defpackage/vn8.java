package defpackage;

import androidx.fragment.app.FragmentActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vn8 implements yn3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vn8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn3
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                int i2 = FragmentActivity.g;
                ((FragmentActivity) obj2).b.A();
                break;
            case 1:
                int i3 = FragmentActivity.g;
                ((FragmentActivity) obj2).b.A();
                break;
            default:
                ((j8f) ((k8f) obj2)).d((hal) obj);
                break;
        }
    }
}

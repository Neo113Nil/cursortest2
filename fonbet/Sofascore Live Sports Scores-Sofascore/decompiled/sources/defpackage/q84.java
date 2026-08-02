package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q84 extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q84(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kmi kmiVar = (kmi) obj;
                kmiVar.a = true;
                kmiVar.notifyDataSetChanged();
                break;
            case 1:
                qcb qcbVar = (qcb) obj;
                if (qcbVar.z.isShowing()) {
                    qcbVar.show();
                    break;
                }
                break;
            default:
                ((TabLayout) obj).j();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kmi kmiVar = (kmi) obj;
                kmiVar.a = false;
                kmiVar.notifyDataSetInvalidated();
                break;
            case 1:
                ((qcb) obj).dismiss();
                break;
            default:
                ((TabLayout) obj).j();
                break;
        }
    }
}

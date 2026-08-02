package a1;

import android.database.DataSetObserver;
import androidx.appcompat.widget.s2;
import androidx.appcompat.widget.u3;
import c3.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f11a = i5;
        this.f12b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f11a) {
            case 0:
                u3 u3Var = (u3) this.f12b;
                u3Var.f13a = true;
                u3Var.notifyDataSetChanged();
                break;
            case 1:
                s2 s2Var = (s2) this.f12b;
                if (s2Var.f940z.isShowing()) {
                    s2Var.show();
                    break;
                }
                break;
            default:
                ((h) this.f12b).f();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f11a) {
            case 0:
                u3 u3Var = (u3) this.f12b;
                u3Var.f13a = false;
                u3Var.notifyDataSetInvalidated();
                break;
            case 1:
                ((s2) this.f12b).dismiss();
                break;
            default:
                ((h) this.f12b).f();
                break;
        }
    }
}

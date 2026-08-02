package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ys2 extends qzh {
    public final sl6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys2(Context context) {
        super(context);
        context.getClass();
        this.t = new sl6(null);
    }

    @Override // defpackage.qzh, defpackage.ysk
    public final boolean j(int i, Object obj) {
        haf hafVar = pzh.b;
        if (i == 13) {
            return false;
        }
        return super.j(i, obj);
    }

    @Override // defpackage.g7, androidx.recyclerview.widget.l
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.getClass();
        this.k = recyclerView;
        u6b w = qha.w(recyclerView);
        if (w != null) {
            hc6.i(this, w);
        }
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof xs2)) {
            return super.v(obj);
        }
        haf hafVar = pzh.b;
        return 13;
    }

    @Override // defpackage.qzh, defpackage.w0, defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        haf hafVar = pzh.b;
        LayoutInflater layoutInflater = this.r;
        if (i == 0) {
            return new ir1(bcb.a(layoutInflater, viewGroup), false, false, this.t, 0, 22);
        }
        if (i == 5) {
            return new nj8(pvk.a(layoutInflater, viewGroup), false, this.t, 0, 10);
        }
        if (i == 7) {
            return new nj8(qvk.a(layoutInflater, viewGroup), false, this.t, 0, 10);
        }
        if (i == 8) {
            return new ir1(j22.d(layoutInflater, viewGroup), false, this.t, false, 0, 26);
        }
        if (i != 13) {
            return i == 4 ? new k04(p12.e(layoutInflater, viewGroup), this.t, 0, 4) : i == 9 ? new wh(ed.b(layoutInflater, viewGroup), (byte) 0) : super.z(viewGroup, i);
        }
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.check_box_row_view, viewGroup, false);
        inflate.getClass();
        return new wh(inflate);
    }
}

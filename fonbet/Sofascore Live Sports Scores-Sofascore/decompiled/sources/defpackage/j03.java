package defpackage;

import android.view.View;
import android.widget.AdapterView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class j03 implements AdapterView.OnItemClickListener {
    public et5 a;
    public WeakReference b;
    public WeakReference c;
    public AdapterView.OnItemClickListener d;
    public boolean e;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        view.getClass();
        AdapterView.OnItemClickListener onItemClickListener = this.d;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(adapterView, view, i, j);
        }
        View view2 = (View) this.c.get();
        AdapterView adapterView2 = (AdapterView) this.b.get();
        if (view2 == null || adapterView2 == null) {
            return;
        }
        k03.p(this.a, view2, adapterView2);
    }
}

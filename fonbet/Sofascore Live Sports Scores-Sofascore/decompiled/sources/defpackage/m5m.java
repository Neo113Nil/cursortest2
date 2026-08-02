package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class m5m extends RecyclerView.OnScrollListener {
    public final /* synthetic */ BlazeBaseWidget a;

    public m5m(BlazeBaseWidget blazeBaseWidget) {
        this.a = blazeBaseWidget;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        recyclerView.getClass();
        super.onScrolled(recyclerView, i, i2);
        int i3 = BlazeBaseWidget.q;
        this.a.k();
    }
}

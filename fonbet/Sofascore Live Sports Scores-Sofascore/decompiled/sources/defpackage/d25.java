package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class d25 implements krk {
    public final /* synthetic */ int a;
    public final RecyclerView b;

    public /* synthetic */ d25(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}

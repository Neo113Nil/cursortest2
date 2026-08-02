package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f0e extends orf {
    public final /* synthetic */ p03 a;

    public f0e(p03 p03Var) {
        this.a = p03Var;
    }

    @Override // defpackage.krf
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return ((h0e) ((mqi) this.a.e).getValue()).onTouch(recyclerView, motionEvent);
    }
}

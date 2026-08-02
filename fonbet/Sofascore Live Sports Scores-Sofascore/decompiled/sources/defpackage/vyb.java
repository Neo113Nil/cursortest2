package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vyb extends LinearLayoutManager {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialCalendar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyb(MaterialCalendar materialCalendar, int i, int i2) {
        super(i, false);
        this.b = materialCalendar;
        this.a = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(qrf qrfVar, int[] iArr) {
        MaterialCalendar materialCalendar = this.b;
        RecyclerView recyclerView = materialCalendar.i;
        if (this.a == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = materialCalendar.i.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = materialCalendar.i.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.n
    public final void smoothScrollToPosition(RecyclerView recyclerView, qrf qrfVar, int i) {
        nl2 nl2Var = new nl2(recyclerView.getContext(), 7);
        nl2Var.setTargetPosition(i);
        startSmoothScroll(nl2Var);
    }
}

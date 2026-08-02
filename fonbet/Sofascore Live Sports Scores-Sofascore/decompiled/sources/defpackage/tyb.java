package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tyb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ MaterialCalendar c;

    public /* synthetic */ tyb(MaterialCalendar materialCalendar, o oVar, int i) {
        this.a = i;
        this.c = materialCalendar;
        this.b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        o oVar = this.b;
        MaterialCalendar materialCalendar = this.c;
        switch (i) {
            case 0:
                int findFirstVisibleItemPosition = ((LinearLayoutManager) materialCalendar.i.getLayoutManager()).findFirstVisibleItemPosition();
                oVar.g = 2;
                materialCalendar.l(oVar.o(findFirstVisibleItemPosition + 1));
                break;
            default:
                int findLastVisibleItemPosition = ((LinearLayoutManager) materialCalendar.i.getLayoutManager()).findLastVisibleItemPosition();
                oVar.g = 1;
                materialCalendar.l(oVar.o(findLastVisibleItemPosition - 1));
                break;
        }
    }
}

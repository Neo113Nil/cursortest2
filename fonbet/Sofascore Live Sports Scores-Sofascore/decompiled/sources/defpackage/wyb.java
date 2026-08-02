package defpackage;

import android.view.View;
import com.inmobi.media.C3577lh;
import com.sofascore.results.calendar.MaterialCalendarView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class wyb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ wyb(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                int i2 = MaterialCalendarView.C;
                function1.invoke(view);
                break;
            case 1:
                C3577lh.a(function1, view);
                break;
            case 2:
                C3577lh.b(function1, view);
                break;
            case 3:
                C3577lh.c(function1, view);
                break;
            case 4:
                C3577lh.d(function1, view);
                break;
            case 5:
                C3577lh.e(function1, view);
                break;
            case 6:
                C3577lh.f(function1, view);
                break;
            case 7:
                C3577lh.g(function1, view);
                break;
            default:
                C3577lh.h(function1, view);
                break;
        }
    }
}

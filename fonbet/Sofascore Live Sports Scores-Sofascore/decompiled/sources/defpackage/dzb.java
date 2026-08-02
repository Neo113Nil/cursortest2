package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sofascore.results.calendar.MaterialCalendarView;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dzb extends ouk {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Object c;

    public dzb(Function0 function0, MaterialCalendarView materialCalendarView) {
        this.b = function0;
        this.c = materialCalendarView;
    }

    @Override // defpackage.ouk
    public final void a(int i) {
        ezb binding;
        switch (this.a) {
            case 0:
                if (i == 0) {
                    ((Function0) this.b).invoke();
                    binding = ((MaterialCalendarView) this.c).getBinding();
                    binding.e.e(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ouk
    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 1:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b;
                if (((puk) this.c) != null) {
                    float f2 = -f;
                    for (int i3 = 0; i3 < linearLayoutManager.getChildCount(); i3++) {
                        View childAt = linearLayoutManager.getChildAt(i3);
                        if (childAt == null) {
                            Locale locale = Locale.US;
                            a70.r(lnb.j(i3, linearLayoutManager.getChildCount(), "LayoutManager returned a null child at pos ", "/", " while transforming pages"));
                            break;
                        } else {
                            ((puk) this.c).j(childAt, (linearLayoutManager.getPosition(childAt) - i) + f2);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ouk
    public void c(int i) {
        int i2 = this.a;
    }

    public dzb(nuk nukVar) {
        this.b = nukVar;
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }
}

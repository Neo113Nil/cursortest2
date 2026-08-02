package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oy extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ xy j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy(xy xyVar, int i) {
        super(0);
        this.i = i;
        this.j = xyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        int i = this.i;
        xy xyVar = this.j;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) ((eoh) xyVar.q).getValue();
                bool.getClass();
                return bool;
            case 1:
                fib d = fib.d(xyVar.getConfiguration().getLocales());
                if (d.a.a.isEmpty()) {
                    d = fib.d(LocaleList.getDefault());
                }
                int size = d.a.a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale b = d.b(i2);
                    b.getClass();
                    arrayList.add(new dib(b));
                }
                return new eib(arrayList);
            case 2:
                MotionEvent motionEvent = xyVar.w0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    xyVar.x0 = SystemClock.uptimeMillis();
                    xyVar.post(xyVar.C0);
                }
                return Unit.a;
            default:
                xyVar.get_viewTreeOwners();
                return null;
        }
    }
}

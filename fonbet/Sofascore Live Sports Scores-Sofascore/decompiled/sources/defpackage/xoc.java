package defpackage;

import android.view.View;
import com.sofascore.model.util.MonthWithYear;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xoc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zoc b;

    public /* synthetic */ xoc(zoc zocVar, int i) {
        this.a = i;
        this.b = zocVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        zoc zocVar = this.b;
        switch (i) {
            case 0:
                return zoc.n(zocVar, (View) obj);
            default:
                MonthWithYear monthWithYear = (MonthWithYear) obj;
                monthWithYear.getClass();
                zocVar.o(monthWithYear);
                return Unit.a;
        }
    }
}

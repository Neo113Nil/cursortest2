package defpackage;

import com.sofascore.results.view.SofascoreRatingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class hvh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofascoreRatingView b;

    public /* synthetic */ hvh(SofascoreRatingView sofascoreRatingView, int i) {
        this.a = i;
        this.b = sofascoreRatingView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SofascoreRatingView sofascoreRatingView = this.b;
        switch (i) {
            case 0:
                sofascoreRatingView.l = ((Float) obj).floatValue();
                break;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                sofascoreRatingView.n = floatValue;
                sofascoreRatingView.l = floatValue;
                break;
            case 2:
                sofascoreRatingView.m = ((Float) obj).floatValue();
                break;
            case 3:
                float floatValue2 = ((Float) obj).floatValue();
                KProperty[] kPropertyArr = SofascoreRatingView.A;
                sofascoreRatingView.setWidth((int) floatValue2);
                break;
            case 4:
                float floatValue3 = ((Float) obj).floatValue();
                KProperty[] kPropertyArr2 = SofascoreRatingView.A;
                sofascoreRatingView.setWidth((int) floatValue3);
                break;
            case 5:
                sofascoreRatingView.o = ((Float) obj).floatValue();
                sofascoreRatingView.invalidate();
                break;
            case 6:
                double doubleValue = ((Double) obj).doubleValue();
                KProperty[] kPropertyArr3 = SofascoreRatingView.A;
                if (doubleValue > 9.989999771118164d) {
                    doubleValue = 10.0d;
                }
                sofascoreRatingView.setText(dti.n(doubleValue, 2));
                sofascoreRatingView.invalidate();
                break;
            default:
                float floatValue4 = ((Float) obj).floatValue();
                KProperty[] kPropertyArr4 = SofascoreRatingView.A;
                sofascoreRatingView.setWidth((int) floatValue4);
                break;
        }
        return Unit.a;
    }
}

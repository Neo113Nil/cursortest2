package defpackage;

import com.sofascore.results.view.SofascoreSmallRatingView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class lvh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SofascoreSmallRatingView b;

    public /* synthetic */ lvh(SofascoreSmallRatingView sofascoreSmallRatingView, int i) {
        this.a = i;
        this.b = sofascoreSmallRatingView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        SofascoreSmallRatingView sofascoreSmallRatingView = this.b;
        float floatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                sofascoreSmallRatingView.k = floatValue;
                sofascoreSmallRatingView.l = floatValue;
                sofascoreSmallRatingView.j = floatValue;
                break;
            case 1:
                sofascoreSmallRatingView.j = floatValue;
                break;
            default:
                sofascoreSmallRatingView.m = floatValue;
                sofascoreSmallRatingView.invalidate();
                break;
        }
        return Unit.a;
    }
}

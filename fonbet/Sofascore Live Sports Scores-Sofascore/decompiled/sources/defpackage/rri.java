package defpackage;

import android.view.View;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.TvChannel;
import com.sofascore.results.tv.TVChannelEditorActivity;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rri implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TVChannelEditorActivity b;

    public /* synthetic */ rri(TVChannelEditorActivity tVChannelEditorActivity, int i) {
        this.a = i;
        this.b = tVChannelEditorActivity;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        TVChannelEditorActivity tVChannelEditorActivity = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TvChannel tvChannel = (TvChannel) obj3;
                int i2 = TVChannelEditorActivity.N;
                ((View) obj).getClass();
                tvChannel.getClass();
                if (tvChannel.getIsSelected()) {
                    tVChannelEditorActivity.Q(tvChannel);
                } else {
                    tVChannelEditorActivity.M(tvChannel);
                }
                tVChannelEditorActivity.N().w(tvChannel);
                break;
            default:
                xtc xtcVar = (xtc) obj;
                of3 of3Var = (of3) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i3 = TVChannelEditorActivity.N;
                xtcVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((av8) of3Var).g(xtcVar) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
                    Country country = (Country) ((eoh) tVChannelEditorActivity.M).getValue();
                    td4.k(country != null ? country.getIso2Alpha() : null, xtcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, av8Var, (intValue << 3) & 112, 12);
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.commentary.Comment;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yv5 extends p43 {
    public final /* synthetic */ int i;
    public final /* synthetic */ aw5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv5(aw5 aw5Var, sc scVar, Event event, k43 k43Var, int i) {
        super(scVar, event, k43Var);
        this.i = i;
        event.getClass();
        k43Var.getClass();
        switch (i) {
            case 1:
                this.j = aw5Var;
                super(scVar, event, k43Var);
                break;
            default:
                this.j = aw5Var;
                break;
        }
    }

    @Override // defpackage.p43, defpackage.p8
    public final /* bridge */ /* synthetic */ void b(int i, int i2, Object obj) {
        switch (this.i) {
            case 0:
                b(i, i2, (Comment) obj);
                break;
            default:
                b(i, i2, (Comment) obj);
                break;
        }
    }

    @Override // defpackage.p43
    /* renamed from: d */
    public final void b(int i, int i2, Comment comment) {
        int i3 = this.i;
        Context context = this.b;
        aw5 aw5Var = this.j;
        sc scVar = this.c;
        comment.getClass();
        switch (i3) {
            case 0:
                super.b(i, i2, comment);
                boolean G = aw5Var.G(comment, i);
                ConstraintLayout constraintLayout = (ConstraintLayout) scVar.m;
                LinearLayout linearLayout = (LinearLayout) scVar.b;
                linearLayout.getClass();
                sea.v(linearLayout, comment.getGroupId() == null, G, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    int s = ao2.s(8, context);
                    int s2 = ao2.s(8, context);
                    int s3 = G ? ao2.s(16, context) : ao2.s(8, context);
                    marginLayoutParams.setMarginStart(0);
                    marginLayoutParams.topMargin = s;
                    marginLayoutParams.setMarginEnd(s2);
                    marginLayoutParams.bottomMargin = s3;
                    constraintLayout.setLayoutParams(marginLayoutParams);
                    z8e.V(context.getColor(R.color.surface_2), constraintLayout);
                    constraintLayout.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
            default:
                super.b(i, i2, comment);
                LinearLayout linearLayout2 = (LinearLayout) scVar.b;
                linearLayout2.getClass();
                sea.v(linearLayout2, comment.getGroupId() == null, aw5Var.G(comment, i), 0, 4, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
                linearLayout2.getClass();
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                if (layoutParams2 == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    break;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.topMargin = i == 0 ? ao2.s(8, context) : ao2.s(4, context);
                    linearLayout2.setLayoutParams(marginLayoutParams2);
                    ((ConstraintLayout) scVar.m).setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                }
        }
    }
}

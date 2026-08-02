package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.blaze.blazesdk.custom_views.BlazeTextWithIconButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.model.mvvm.model.Event;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class xem implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xem(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                efm efmVar = (efm) obj3;
                n4m n4mVar = (n4m) obj2;
                boolean z = efm.j;
                efmVar.j(n4mVar, new bfm((BlazeTextWithIconButton) obj, efmVar, n4mVar, 1));
                break;
            default:
                bhi bhiVar = (bhi) obj3;
                Event event = (Event) obj2;
                String str = (String) obj;
                Context context = bhiVar.getContext();
                context.getClass();
                int id = event.getId();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putInt("id", id);
                ia0 ia0Var = ia0.q;
                FirebaseAnalytics d = me4.d((f5d) me4.e(), "video_stream_click", firebaseBundle, context);
                d.a.e(n9e.K(firebaseBundle), null, "video_stream_click", false);
                js2 js2Var = bhiVar.f;
                ((ShapeableImageView) js2Var.n).setVisibility(4);
                tgj.E((ProgressBar) js2Var.j, 0L, null, 15);
                tgj.E((ImageView) js2Var.b, 0L, null, 15);
                if (str != null) {
                    bhiVar.s(str, ok3.D(event));
                    break;
                }
                break;
        }
    }
}

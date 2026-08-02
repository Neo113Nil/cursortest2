package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.sofascore.results.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ag implements pyf, pcd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ag(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pyf
    public final void onAdRendered(of ofVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                s53 s53Var = (s53) obj2;
                Iterator it = ((List) ((f4a) obj).b).iterator();
                if (it.hasNext()) {
                    wt3.z(it.next());
                    throw null;
                }
                s53Var.onAdRendered(ofVar);
                return;
            default:
                d7j d7jVar = (d7j) obj2;
                d7jVar.n(ofVar);
                lcd lcdVar = d7jVar.f;
                if (lcdVar != null) {
                    xjd xjdVar = new xjd(d7jVar, 10);
                    ImageView imageView = (ImageView) lcdVar.findViewById(R.id.nimbus_test_demand);
                    if (imageView == null) {
                        imageView = new ImageView(lcdVar.getContext());
                        imageView.setImageResource(R.drawable.ic_nimbus_settings);
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        imageView.setClickable(true);
                        imageView.setAdjustViewBounds(true);
                        Context context = lcdVar.getContext();
                        context.getClass();
                        int S = kda.S(context, 16);
                        Context context2 = lcdVar.getContext();
                        context2.getClass();
                        int S2 = kda.S(context2, 48);
                        Context context3 = lcdVar.getContext();
                        context3.getClass();
                        imageView.setPadding(S, 0, S2, kda.S(context3, 8));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388693);
                        Context context4 = lcdVar.getContext();
                        context4.getClass();
                        layoutParams.setMarginStart(kda.S(context4, 48));
                        Context context5 = lcdVar.getContext();
                        context5.getClass();
                        layoutParams.bottomMargin = kda.S(context5, 20);
                        Unit unit = Unit.a;
                        lcdVar.addView(imageView, layoutParams);
                    }
                    imageView.setOnClickListener(new eyd(28, lcdVar, xjdVar));
                }
                ((pyf) obj).onAdRendered(d7jVar);
                return;
        }
    }

    @Override // defpackage.pcd
    public final void onError(qcd qcdVar) {
        switch (this.a) {
            case 0:
                ((s53) this.b).onError(qcdVar);
                break;
            default:
                ((pcd) ((pyf) this.c)).onError(qcdVar);
                break;
        }
    }
}

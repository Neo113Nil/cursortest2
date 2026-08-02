package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wy1 extends o8 {
    public final mqi d;
    public final List e;
    public int f;

    public wy1(Context context) {
        super(context, null, 0);
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) root;
        this.d = ypa.b(new vs1(18));
        this.e = b.j(Integer.valueOf(R.drawable.user_1_placeholder), Integer.valueOf(R.drawable.user_2_placeholder), Integer.valueOf(R.drawable.user_3_placeholder), Integer.valueOf(R.drawable.user_4_placeholder));
        if (Build.VERSION.SDK_INT < 31) {
            j(linearLayout);
            return;
        }
        RenderEffect createBlurEffect = RenderEffect.createBlurEffect(30.0f, 30.0f, Shader.TileMode.CLAMP);
        createBlurEffect.getClass();
        linearLayout.setRenderEffect(createBlurEffect);
    }

    private final BlurMaskFilter getTextBlur() {
        return (BlurMaskFilter) this.d.getValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.blurred_ranking_list_view;
    }

    public final void j(ViewGroup viewGroup) {
        Iterator it = new tsk(viewGroup).iterator();
        while (true) {
            usk uskVar = (usk) it;
            if (!uskVar.hasNext()) {
                return;
            }
            View view = (View) uskVar.next();
            if (view instanceof ViewGroup) {
                j((ViewGroup) view);
            } else if (view instanceof TextView) {
                ((TextView) view).getPaint().setMaskFilter(getTextBlur());
                view.invalidate();
            } else if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                int i = this.f;
                this.f = i + 1;
                List list = this.e;
                Object obj = list.get(i % list.size());
                apf a = ajh.a(imageView.getContext());
                ht9 ht9Var = new ht9(imageView.getContext());
                ht9Var.c = obj;
                vt9.f(ht9Var, imageView);
                awj[] awjVarArr = {new ty1(5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getContext().getColor(R.color.surface_0), 2)};
                sl6 sl6Var = st9.a;
                st9.b(ht9Var, ph0.X(awjVarArr));
                a.a(ht9Var.a());
            }
        }
    }
}

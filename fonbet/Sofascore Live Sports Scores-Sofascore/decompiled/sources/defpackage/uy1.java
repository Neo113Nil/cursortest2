package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class uy1 extends o8 {
    public final vy1 d;
    public final BlurMaskFilter e;
    public final mqi f;
    public final int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy1(Context context, j6c j6cVar) {
        super(context, null, 0);
        j6cVar.getClass();
        View root = getRoot();
        if (root == null) {
            yhk.s("rootView");
            throw null;
        }
        LinearLayout linearLayout = (LinearLayout) root;
        this.d = new vy1(linearLayout, 0);
        float f = 20.0f;
        this.e = new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.NORMAL);
        this.f = ypa.b(new c6(context, 10));
        this.g = ao2.s(80, context);
        linearLayout.removeAllViews();
        gv9 gv9Var = j6cVar.a;
        int i = 2;
        Integer num = (Integer) CollectionsKt.a0(2, gv9Var);
        if (num != null) {
            Integer num2 = (Integer) CollectionsKt.a0(0, gv9Var);
            int intValue = num2 != null ? num2.intValue() : 0;
            Integer num3 = (Integer) CollectionsKt.a0(1, gv9Var);
            int intValue2 = intValue + (num3 != null ? num3.intValue() : 0);
            for (n8b n8bVar : j6cVar.b.subList(intValue2, num.intValue() + intValue2)) {
                View inflate = getInflater().inflate(R.layout.blurred_lineups_player, (ViewGroup) null, false);
                int i2 = R.id.player_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.player_logo, inflate);
                if (imageView != null) {
                    i2 = R.id.player_name;
                    TextView textView = (TextView) nq8.B(R.id.player_name, inflate);
                    if (textView != null) {
                        View view = (LinearLayout) inflate;
                        as9.l(imageView, n8bVar.a, new ty1(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, context.getColor(R.color.terrain_football_lineups), i));
                        textView.setText(n8bVar.b);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.g);
                        layoutParams.weight = 1.0f;
                        view.setLayoutParams(layoutParams);
                        this.d.b.addView(view);
                    }
                }
                yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                throw null;
            }
        }
        j(this.d.b);
    }

    private final LayoutInflater getInflater() {
        return (LayoutInflater) this.f.getValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.blurred_lineups_field;
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
                ((TextView) view).getPaint().setMaskFilter(this.e);
                view.invalidate();
            }
        }
    }
}

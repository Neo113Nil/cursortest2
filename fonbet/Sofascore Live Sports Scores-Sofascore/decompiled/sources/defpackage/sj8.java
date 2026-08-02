package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sj8 extends t2 {
    public final f99 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj8(Context context) {
        super(context);
        context.getClass();
        f99 b = f99.b(LayoutInflater.from(context), getBinding().a);
        Drawable mutate = b.b.getBackground().mutate();
        int color = context.getColor(R.color.terrain_football);
        itc itcVar = itc.a;
        v9g.J(mutate, color);
        this.j = b;
        FrameLayout frameLayout = b.a;
        frameLayout.getClass();
        t2.j(this, R.string.football_match_heatmap, Integer.valueOf(R.drawable.football_terrain_icon_horizontal), R.color.surface_P, frameLayout, false, "FOOTBALL_HEATMAP", null, null, TTAdConstant.TARGET_URL_NOT_CONTAINS_TTCLID_CODE);
        ImageView imageView = (ImageView) getBinding().c.d;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        Context context2 = getContext();
        context2.getClass();
        int s = ao2.s(24, context2);
        layoutParams.width = s;
        layoutParams.height = s;
        imageView.setLayoutParams(layoutParams);
        TextView textView = (TextView) getBinding().c.g;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            throw null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        Context context3 = textView.getContext();
        context3.getClass();
        int s2 = ao2.s(16, context3);
        int i = marginLayoutParams.topMargin;
        int marginEnd = marginLayoutParams.getMarginEnd();
        int i2 = marginLayoutParams.bottomMargin;
        marginLayoutParams.setMarginStart(s2);
        marginLayoutParams.topMargin = i;
        marginLayoutParams.setMarginEnd(marginEnd);
        marginLayoutParams.bottomMargin = i2;
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(R.style.DisplayMedium);
    }
}

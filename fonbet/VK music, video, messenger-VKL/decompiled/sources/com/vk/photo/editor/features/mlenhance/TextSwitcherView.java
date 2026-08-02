package com.vk.photo.editor.features.mlenhance;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bem0;
import xsna.bpn0;
import xsna.d0u0;
import xsna.e43;
import xsna.fyd0;
import xsna.oo6;
import xsna.yqd0;

/* compiled from: TextSwitcherView.kt */
/* loaded from: classes4.dex */
public final class TextSwitcherView extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public List<String> b;
    public final TextView c;
    public final TextView d;
    public int e;
    public oo6 f;
    public final bpn0 g;

    public TextSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = e43.l(context.getString(R.string.editor_ml_enhance_loader_text_1), context.getString(R.string.editor_ml_enhance_loader_text_2), context.getString(R.string.editor_ml_enhance_loader_text_3), context.getString(R.string.editor_ml_enhance_loader_text_4), context.getString(R.string.editor_ml_enhance_loader_text_5), context.getString(R.string.editor_ml_enhance_loader_text_6));
        this.e = -1;
        this.g = new bpn0(new bem0(3));
        LayoutInflater.from(context).inflate(R.layout.ml_text_switcher, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.text1);
        this.c = textView;
        TextView textView2 = (TextView) findViewById(R.id.text2);
        this.d = textView2;
        textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        textView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private final Handler getMainHandler() {
        return (Handler) this.g.getValue();
    }

    private final void setTexts(List<String> list) {
        this.b = list;
        this.c.setText(list.get(0));
        this.d.setText(list.get(1));
    }

    public final void a() {
        int size = (this.e + 1) % this.b.size();
        this.e = size;
        int i = size % 2;
        TextView textView = this.d;
        TextView textView2 = this.c;
        if (i == 0) {
            textView2.setText(this.b.get(size));
            d0u0.a(textView.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L), new fyd0(this, 12)).start();
        } else {
            textView.setText(this.b.get(size));
            d0u0.a(textView2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(150L), new yqd0(this, 9)).start();
        }
        oo6 oo6Var = new oo6(this, 9);
        getMainHandler().postDelayed(oo6Var, 2000L);
        this.f = oo6Var;
    }

    public final void b() {
        oo6 oo6Var = this.f;
        if (oo6Var != null) {
            getMainHandler().removeCallbacks(oo6Var);
        }
        a();
    }

    public final void c() {
        oo6 oo6Var = this.f;
        if (oo6Var != null) {
            getMainHandler().removeCallbacks(oo6Var);
        }
        this.f = null;
    }
}

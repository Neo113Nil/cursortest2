package com.sofascore.results.event.details.view.odds;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.results.R;
import defpackage.ald;
import defpackage.ao2;
import defpackage.eq3;
import defpackage.hs1;
import defpackage.ke0;
import defpackage.nq8;
import defpackage.o8;
import defpackage.rld;
import defpackage.yhk;
import defpackage.zu3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sofascore/results/event/details/view/odds/GambleRegulationFooterView;", "Lo8;", "", "getLayoutId", "()I", "colorRes", "", "setTextColor", "(I)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GambleRegulationFooterView extends o8 {
    public static final /* synthetic */ int e = 0;
    public final hs1 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GambleRegulationFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        View root = getRoot();
        int i2 = R.id.regulation_additional_text;
        TextView textView = (TextView) nq8.B(R.id.regulation_additional_text, root);
        if (textView != null) {
            i2 = R.id.regulation_australia;
            TextView textView2 = (TextView) nq8.B(R.id.regulation_australia, root);
            if (textView2 != null) {
                i2 = R.id.regulation_main_text;
                TextView textView3 = (TextView) nq8.B(R.id.regulation_main_text, root);
                if (textView3 != null) {
                    this.d = new hs1((LinearLayout) root, textView, textView2, textView3, 2);
                    return;
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.gambling_regulation_footer_view;
    }

    public final void j(Boolean bool, boolean z) {
        Drawable drawable;
        hs1 hs1Var = this.d;
        TextView textView = hs1Var.e;
        TextView textView2 = hs1Var.d;
        Context context = getContext();
        context.getClass();
        textView.setText(rld.f(context, Intrinsics.c(bool, Boolean.TRUE)));
        TextView textView3 = hs1Var.c;
        textView3.setVisibility(8);
        if (zu3.d.hasMcc(Integer.valueOf(ke0.c))) {
            textView2.setVisibility(0);
            Context context2 = getContext();
            context2.getClass();
            textView2.setText(rld.i(context2));
            return;
        }
        if (zu3.c.hasMcc(Integer.valueOf(ke0.c))) {
            textView3.setVisibility(0);
            textView3.setText(getContext().getString(R.string.toolbar_subtitle_template, getContext().getString(R.string.responsible_gambling_argentina_title), getContext().getString(R.string.responsible_gambling_argentina_text)));
            return;
        }
        if (rld.h(ke0.c, true) == null || !z) {
            return;
        }
        Context context3 = getContext();
        context3.getClass();
        int s = ao2.s(24, context3);
        ald h = rld.h(ke0.c, true);
        if (h != null) {
            textView3.setVisibility(0);
            int i = h.c;
            textView3.setGravity(i == 6 ? 8388613 : i == 3 ? 17 : 8388611);
            textView3.setText(getContext().getString(h.a));
            Integer num = h.b;
            if (num != null) {
                Drawable drawable2 = getContext().getDrawable(num.intValue());
                if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                    drawable = null;
                } else {
                    drawable.setTintList(eq3.q(R.color.n_lv_3, getContext()));
                    drawable.setBounds(0, 0, s, s);
                }
                textView3.setCompoundDrawables(drawable, null, null, null);
            }
        }
    }

    public final void setTextColor(int colorRes) {
        int color = getContext().getColor(colorRes);
        hs1 hs1Var = this.d;
        hs1Var.c.setTextColor(color);
        hs1Var.e.setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GambleRegulationFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }
}

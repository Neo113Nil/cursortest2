package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u6i extends p8 {
    public final z3f c;
    public final k6i d;
    public final g2i e;
    public final int f;
    public final int g;
    public final int h;
    public final joa i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u6i(z3f z3fVar, k6i k6iVar, g2i g2iVar) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) z3fVar.c;
        constraintLayout.getClass();
        this.c = z3fVar;
        this.d = k6iVar;
        this.e = g2iVar;
        this.f = ao2.s(8, this.b);
        this.g = ao2.s(16, this.b);
        this.h = ao2.s(80, this.b);
        this.i = ypa.a(ysa.c, new w1i(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.graphics.drawable.Drawable, android.view.View$OnClickListener, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        ViewGroup viewGroup;
        Pair pair;
        ?? r10;
        boolean z;
        n6i n6iVar = (n6i) obj;
        n6iVar.getClass();
        z3f z3fVar = this.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) z3fVar.c;
        constraintLayout.getClass();
        sea.v(constraintLayout, ((Boolean) this.d.invoke()).booleanValue(), false, 0, 0, 0, null, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) z3fVar.c;
        LinearLayout linearLayout = (LinearLayout) z3fVar.b;
        constraintLayout2.getClass();
        boolean z2 = n6iVar.b;
        List list = n6iVar.a;
        constraintLayout2.setPaddingRelative(constraintLayout2.getPaddingStart(), constraintLayout2.getPaddingTop(), z2 ? this.g : this.f, constraintLayout2.getPaddingBottom());
        String str = n6iVar.c;
        if (str != null) {
            TextView textView = (TextView) z3fVar.d;
            joa joaVar = l5i.a;
            Context context = constraintLayout2.getContext();
            context.getClass();
            textView.setText(l5i.c(context, 12, str));
        }
        ?? r7 = 0;
        int i3 = 0;
        for (Object obj2 : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            d8i d8iVar = (d8i) obj2;
            if (i3 < linearLayout.getChildCount()) {
                View childAt = linearLayout.getChildAt(i3);
                if (childAt == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.FrameLayout");
                    return;
                } else {
                    FrameLayout frameLayout = (FrameLayout) childAt;
                    frameLayout.setVisibility(r7);
                    viewGroup = frameLayout;
                }
            } else {
                View inflate = LayoutInflater.from(constraintLayout2.getContext()).inflate(R.layout.item_race_stat_column_header, linearLayout, (boolean) r7);
                if (inflate == null) {
                    yhk.s("rootView");
                    return;
                } else {
                    FrameLayout frameLayout2 = (FrameLayout) inflate;
                    linearLayout.addView(frameLayout2);
                    viewGroup = frameLayout2;
                }
            }
            View childAt2 = viewGroup.getChildAt(r7);
            childAt2.getClass();
            TextView textView2 = (TextView) childAt2;
            textView2.setText(d8iVar.a.intValue());
            int i5 = this.h;
            if (z2 && i3 == 0) {
                pair = new Pair(Integer.valueOf(i5), 8388611);
            } else if (z2) {
                pair = new Pair(Integer.valueOf(i5), 8388613);
            } else {
                int i6 = d8iVar.c;
                Context context2 = viewGroup.getContext();
                context2.getClass();
                pair = new Pair(Integer.valueOf(ao2.H(i6, context2)), 17);
            }
            int intValue = ((Number) pair.a).intValue();
            int intValue2 = ((Number) pair.b).intValue();
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = intValue;
            viewGroup.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = intValue2;
            textView2.setLayoutParams(layoutParams4);
            if (!n6iVar.d) {
                r10 = 0;
                z = false;
            } else if (d8iVar == d8i.o || d8iVar == d8i.p) {
                viewGroup.setSelected(true);
                Context context3 = viewGroup.getContext();
                context3.getClass();
                int s = ao2.s(12, context3);
                Context context4 = viewGroup.getContext();
                context4.getClass();
                int s2 = ao2.s(4, context4);
                Context context5 = viewGroup.getContext();
                context5.getClass();
                int s3 = ao2.s(12, context5);
                Context context6 = viewGroup.getContext();
                context6.getClass();
                textView2.setPadding(s, s2, s3, ao2.s(4, context6));
                textView2.setBackgroundResource(R.drawable.rounded_rect_12dp_primary_stroke);
                textView2.setOnClickListener(new eyd(22, this, d8iVar));
                haa.K(textView2, (Drawable) this.i.getValue(), ua5.a, null, null);
                z = false;
                i3 = i4;
                r7 = z;
            } else {
                z = false;
                r10 = 0;
            }
            viewGroup.setSelected(z);
            textView2.setBackground(r10);
            textView2.setOnClickListener(r10);
            textView2.setPadding(z ? 1 : 0, z ? 1 : 0, z ? 1 : 0, z ? 1 : 0);
            haa.K(textView2, r10, ua5.a, r10, r10);
            i3 = i4;
            r7 = z;
        }
        z8e.J(linearLayout, list.size() - 1);
    }
}

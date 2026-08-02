package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u7i extends p8 {
    public final djf c;
    public final int d;
    public final int e;
    public final /* synthetic */ a8i f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u7i(a8i a8iVar, djf djfVar) {
        super(r1);
        this.f = a8iVar;
        LinearLayout linearLayout = (LinearLayout) djfVar.b;
        linearLayout.getClass();
        this.c = djfVar;
        this.d = ao2.v(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, this.b);
        this.e = ao2.v(156, this.b);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        String name;
        u7i u7iVar = this;
        t7i t7iVar = (t7i) obj;
        t7iVar.getClass();
        a8i a8iVar = u7iVar.f;
        tug tugVar = a8iVar.z;
        djf djfVar = u7iVar.c;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) djfVar.f;
        tugVar.d(scrollInterceptorHorizontalScrollView);
        j5i j5iVar = t7iVar.a;
        Integer num = t7iVar.d;
        ArrayList arrayList = t7iVar.b;
        List list = t7iVar.c;
        j5i j5iVar2 = j5i.b;
        TextView textView = (TextView) djfVar.g;
        Context context = u7iVar.b;
        if (j5iVar == j5iVar2) {
            UniqueStage uniqueStage = a8iVar.l;
            if (uniqueStage == null || (name = uniqueStage.getName()) == null) {
                str2 = null;
            } else {
                joa joaVar = l5i.a;
                str2 = l5i.c(context, 12, name);
            }
            textView.setText(str2);
        } else {
            textView.setText(R.string.formula_constructor);
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = list != null ? u7iVar.d : u7iVar.e;
        textView.setLayoutParams(layoutParams);
        int m = yid.m(list != null ? Integer.valueOf(list.size()) : null) + arrayList.size();
        boolean z4 = yid.m(list != null ? Integer.valueOf(list.size()) : null) > 0;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            k3i k3iVar = (k3i) next;
            String string = context.getString(k3iVar.a);
            string.getClass();
            if (k3iVar == k3i.e) {
                str = string;
                z3 = true;
            } else {
                str = string;
                z3 = false;
            }
            u7iVar.d(i3, str, z4, z3, num != null && i3 == num.intValue(), z4);
            u7iVar = this;
            i3 = i4;
        }
        if (list != null) {
            int i5 = 0;
            for (Object obj2 : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                int size = arrayList.size() + i5;
                joa joaVar2 = l5i.a;
                String j = l5i.j((Stage) obj2);
                if (!z4 || size >= m - 1) {
                    z = z4;
                    z2 = false;
                } else {
                    z = z4;
                    z2 = true;
                }
                d(size, j, z2, false, num != null && size == num.intValue(), z);
                z4 = z;
                i5 = i6;
            }
        }
        z8e.J((LinearLayout) djfVar.c, m - 1);
        scrollInterceptorHorizontalScrollView.post(new ecg(8, this, a8iVar));
        tugVar.a(scrollInterceptorHorizontalScrollView, new chf(1, this, u7i.class, "updateScrollIndicators", "updateScrollIndicators(I)V", 0, 16));
    }

    public final void d(int i, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        TextView textView;
        LinearLayout linearLayout = (LinearLayout) this.c.c;
        if (i < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                yhk.s("null cannot be cast to non-null type android.widget.TextView");
                return;
            } else {
                textView = (TextView) childAt;
                textView.setVisibility(0);
            }
        } else {
            View inflate = LayoutInflater.from(this.b).inflate(R.layout.header_stage_standings_item, (ViewGroup) linearLayout, false);
            if (inflate == null) {
                yhk.s("rootView");
                return;
            } else {
                TextView textView2 = (TextView) inflate;
                linearLayout.addView(textView2);
                textView = textView2;
            }
        }
        textView.setText(str);
        textView.setSelected(z3);
        if (z) {
            textView.setBackgroundResource(R.drawable.bg_end_divider);
        } else {
            textView.setBackground(null);
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        a8i a8iVar = this.f;
        layoutParams.width = z2 ? a8iVar.r : a8iVar.q;
        textView.setLayoutParams(layoutParams);
        if (z4) {
            textView.setOnClickListener(new l8(a8iVar, i, 11));
        } else {
            textView.setOnClickListener(null);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, textView.isSelected() ? R.drawable.ic_arrow_drop_down_16 : 0);
        textView.setCompoundDrawableTintList(ColorStateList.valueOf(textView.getContext().getColor(R.color.primary_default)));
    }

    public final void e(int i) {
        djf djfVar = this.c;
        int width = ((LinearLayout) djfVar.c).getWidth() - ((ScrollInterceptorHorizontalScrollView) djfVar.f).getWidth();
        boolean c0 = hkg.c0(this.b);
        int i2 = 4;
        ((ImageView) djfVar.d).setVisibility((!c0 ? i == 0 : i >= width) ? 0 : 4);
        ImageView imageView = (ImageView) djfVar.e;
        if (!c0 ? i < width : i != 0) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }
}

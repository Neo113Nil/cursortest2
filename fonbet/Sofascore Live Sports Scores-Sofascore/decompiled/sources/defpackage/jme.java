package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jme extends r7 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jme(z82 z82Var, tug tugVar, int i) {
        super(z82Var, tugVar);
        this.f = i;
    }

    @Override // defpackage.r7, defpackage.p8
    public final void b(int i, int i2, Object obj) {
        FrameLayout e;
        FrameLayout e2;
        ImageView imageView;
        int i3 = this.f;
        Context context = this.b;
        int i4 = 0;
        Throwable th = null;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (i3) {
            case 0:
                tle tleVar = (tle) obj;
                tleVar.getClass();
                tug tugVar = (tug) obj3;
                z82 z82Var = (z82) obj2;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) z82Var.e;
                tugVar.d(scrollInterceptorHorizontalScrollView);
                ok2 ok2Var = tleVar.a;
                LinearLayout linearLayout = (LinearLayout) z82Var.f;
                tugVar.a(scrollInterceptorHorizontalScrollView, null);
                ((TextView) z82Var.d).setText(context.getString(R.string.all));
                ArrayList arrayList = ok2Var.b;
                Iterator it = arrayList.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        b.q();
                        throw null;
                    }
                    pk2 pk2Var = (pk2) next;
                    if (i5 < linearLayout.getChildCount()) {
                        View childAt = linearLayout.getChildAt(i5);
                        if (childAt == null) {
                            yhk.s("null cannot be cast to non-null type android.widget.FrameLayout");
                            return;
                        } else {
                            e = (FrameLayout) childAt;
                            e.setVisibility(0);
                        }
                    } else {
                        e = e();
                        linearLayout.addView(e);
                    }
                    r7.n(e, (String) pk2Var.c.invoke(tleVar.b), pk2Var.e, true);
                    i5 = i6;
                }
                z8e.J(linearLayout, arrayList.size() - 1);
                ((MaterialDivider) z82Var.c).setVisibility(0);
                ((ConstraintLayout) z82Var.b).post(new gjc(13, z82Var, this));
                return;
            default:
                yle yleVar = (yle) obj;
                yleVar.getClass();
                tug tugVar2 = (tug) obj3;
                z82 z82Var2 = (z82) obj2;
                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) z82Var2.e;
                tugVar2.d(scrollInterceptorHorizontalScrollView2);
                ArrayList arrayList2 = yleVar.a.b;
                LinearLayout linearLayout2 = (LinearLayout) z82Var2.f;
                LinearLayout linearLayout3 = (LinearLayout) z82Var2.g;
                tugVar2.a(scrollInterceptorHorizontalScrollView2, null);
                ((TextView) z82Var2.d).setText(o3a.K(yleVar.b));
                int i7 = 0;
                for (Object obj4 : yleVar.d) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        Throwable th2 = th;
                        b.q();
                        throw th2;
                    }
                    int intValue = ((Number) obj4).intValue();
                    if (i7 < linearLayout3.getChildCount()) {
                        View childAt2 = linearLayout3.getChildAt(i7);
                        if (childAt2 == null) {
                            yhk.s("null cannot be cast to non-null type android.widget.ImageView");
                            return;
                        } else {
                            imageView = (ImageView) childAt2;
                            imageView.setVisibility(i4);
                        }
                    } else {
                        imageView = new ImageView(context);
                        Context context2 = imageView.getContext();
                        context2.getClass();
                        int s = ao2.s(16, context2);
                        Context context3 = imageView.getContext();
                        context3.getClass();
                        imageView.setLayoutParams(new LinearLayout.LayoutParams(s, ao2.s(16, context3)));
                        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                        if (layoutParams == null) {
                            yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            return;
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        Context context4 = imageView.getContext();
                        context4.getClass();
                        marginLayoutParams.setMarginStart(ao2.s(2, context4));
                        imageView.setLayoutParams(marginLayoutParams);
                        linearLayout3.addView(imageView);
                    }
                    as9.o(imageView, intValue);
                    imageView.setImageTintList(null);
                    th = null;
                    i7 = i8;
                    i4 = 0;
                }
                z8e.J(linearLayout3, r7.size() - 1);
                Iterator it2 = arrayList2.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        b.q();
                        throw null;
                    }
                    pk2 pk2Var2 = (pk2) next2;
                    if (i9 < linearLayout2.getChildCount()) {
                        View childAt3 = linearLayout2.getChildAt(i9);
                        if (childAt3 == null) {
                            yhk.s("null cannot be cast to non-null type android.widget.FrameLayout");
                            return;
                        } else {
                            e2 = (FrameLayout) childAt3;
                            e2.setVisibility(0);
                        }
                    } else {
                        e2 = e();
                        linearLayout2.addView(e2);
                    }
                    r7.n(e2, (String) pk2Var2.c.invoke(yleVar.c), pk2Var2.e, false);
                    i9 = i10;
                }
                z8e.J(linearLayout2, arrayList2.size() - 1);
                ((MaterialDivider) z82Var2.c).setVisibility(yleVar.e ? 0 : 8);
                ((ConstraintLayout) z82Var2.b).post(new gjc(16, z82Var2, this));
                return;
        }
    }
}

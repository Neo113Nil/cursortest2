package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import java.util.Iterator;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cn1 extends p8 {
    public final yzc c;
    public final ez0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn1(View view, yzc yzcVar) {
        super(view);
        view.getClass();
        yzcVar.getClass();
        this.c = yzcVar;
        this.d = ez0.a(view);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        TextView textView;
        zm1 zm1Var = (zm1) obj;
        zm1Var.getClass();
        ez0 ez0Var = this.d;
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) ez0Var.d;
        LinearLayout linearLayout = (LinearLayout) ez0Var.c;
        Context context = constraintLayout.getContext();
        ((TextView) ez0Var.e).setText(zm1Var.n);
        context.getClass();
        if (hkg.c0(context)) {
            constraintLayout.setLayoutDirection(1);
        }
        constraintLayout.getClass();
        int i3 = 0;
        scrollInterceptorHorizontalScrollView.setOnTouchListener(new an1(new GestureDetector(context, new wsk(linearLayout, scrollInterceptorHorizontalScrollView, constraintLayout)), 0));
        scrollInterceptorHorizontalScrollView.post(new p3(6, context, this, zm1Var));
        if (linearLayout.getChildCount() != 0) {
            linearLayout.removeAllViews();
        }
        Iterator it = zm1Var.o.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                b.q();
                throw null;
            }
            y12 y12Var = (y12) next;
            if (i4 < linearLayout.getChildCount()) {
                View childAt = linearLayout.getChildAt(i4);
                if (childAt == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.TextView");
                    return;
                } else {
                    textView = (TextView) childAt;
                    textView.setVisibility(0);
                }
            } else {
                Context context2 = linearLayout.getContext();
                context2.getClass();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context2, null);
                Context context3 = linearLayout.getContext();
                context3.getClass();
                appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(ao2.s(42, context3), -1));
                appCompatTextView.setTextAppearance(R.style.DisplaySmall);
                appCompatTextView.setGravity(17);
                appCompatTextView.setTextDirection(3);
                linearLayout.addView(appCompatTextView);
                textView = appCompatTextView;
            }
            String str = y12Var.i;
            if (str == null || str.length() == 0) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(y12Var.i);
            }
            i4 = i5;
        }
        scrollInterceptorHorizontalScrollView.setOnScrollChangeListener(new bn1(i3, this, zm1Var));
    }
}

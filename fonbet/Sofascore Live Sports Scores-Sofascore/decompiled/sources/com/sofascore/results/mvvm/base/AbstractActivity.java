package com.sofascore.results.mvvm.base;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.tabs.TabLayout;
import com.sofascore.common.mvvm.UnderlinedToolbar;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import defpackage.ao2;
import defpackage.haa;
import defpackage.hkg;
import defpackage.i5h;
import defpackage.l0;
import defpackage.r0;
import defpackage.t25;
import defpackage.tsk;
import defpackage.ua5;
import defpackage.wca;
import defpackage.z3f;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/mvvm/base/AbstractActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractActivity extends BaseActivity {
    public static final /* synthetic */ int I = 0;

    public static void M(AbstractActivity abstractActivity, z3f z3fVar, String str, String str2, String str3, int i) {
        Object obj;
        if ((i & 4) != 0) {
            str2 = null;
        }
        int i2 = 0;
        boolean z = (i & 16) == 0;
        if ((i & 32) != 0) {
            str3 = null;
        }
        abstractActivity.getClass();
        UnderlinedToolbar underlinedToolbar = (UnderlinedToolbar) z3fVar.c;
        abstractActivity.H(underlinedToolbar);
        ((AppCompatTextView) z3fVar.d).setText(str);
        LinearLayout linearLayout = (LinearLayout) z3fVar.b;
        Iterator it = i5h.q(new tsk(linearLayout)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.c(((View) obj).getTag(), "TOOLBAR_SUBTITLE")) {
                    break;
                }
            }
        }
        TextView textView = obj instanceof TextView ? (TextView) obj : null;
        if (str2 != null) {
            if (textView == null) {
                textView = new TextView(abstractActivity);
                textView.setTextAppearance(R.style.SpecificAndroidHeaderSubtitle);
                textView.setText((CharSequence) null);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                textView.setTextDirection(3);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxLines(1);
                textView.setTag("TOOLBAR_SUBTITLE");
                if (str3 != null) {
                    Context context = underlinedToolbar.getContext();
                    context.getClass();
                    textView.setCompoundDrawablePadding(ao2.s(8, context));
                    ua5 ua5Var = ua5.a;
                    Context context2 = underlinedToolbar.getContext();
                    context2.getClass();
                    int s = ao2.s(12, context2);
                    t25.a(s);
                    haa.q(textView, str3, ua5Var, new t25(s));
                }
                linearLayout.addView(textView);
            }
            textView.post(new r0(i2, textView, str2));
        } else {
            linearLayout.removeView(textView);
        }
        if (z && hkg.b0(abstractActivity)) {
            underlinedToolbar.setUnderlined(true);
        }
    }

    public static void O(TabLayout tabLayout, Integer num, int i) {
        tabLayout.getClass();
        if (num != null) {
            tabLayout.setBackgroundColor(num.intValue());
        }
        tabLayout.setSelectedTabIndicatorColor(i);
    }

    public static void P(TabLayout tabLayout, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = -1;
        }
        tabLayout.setSelectedTabIndicatorColor(i);
    }

    public abstract void N();

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wca.x(getLifecycle()).c(new l0(this, null, 1));
    }
}

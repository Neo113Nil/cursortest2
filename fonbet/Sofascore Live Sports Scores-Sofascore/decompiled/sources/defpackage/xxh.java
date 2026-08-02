package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sofascore.results.main.start.StartActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xxh extends y3g {
    public vxh d;
    public final wxh e;

    public xxh(StartActivity startActivity) {
        super(startActivity);
        this.e = new wxh(this, startActivity);
    }

    @Override // defpackage.y3g
    public final void C(ilg ilgVar) {
        this.c = ilgVar;
        View findViewById = ((StartActivity) this.b).findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.d != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        vxh vxhVar = new vxh(this, findViewById, 1);
        this.d = vxhVar;
        viewTreeObserver.addOnPreDrawListener(vxhVar);
    }

    @Override // defpackage.y3g
    public final void v() {
        int i;
        StartActivity startActivity = (StartActivity) this.b;
        Resources.Theme theme = startActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(com.sofascore.results.R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            startActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = startActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.e);
        }
    }
}

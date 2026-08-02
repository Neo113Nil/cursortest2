package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class da4 {
    public final Intent a;
    public final p4h b;
    public ActivityOptions c;
    public Bundle d;
    public int e;
    public final boolean f;

    public da4(ja4 ja4Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.b = new p4h(20);
        this.e = 0;
        this.f = true;
        if (ja4Var != null) {
            intent.setPackage(ja4Var.d.getPackageName());
            aa4 aa4Var = ja4Var.c;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", aa4Var);
            intent.putExtras(bundle);
        }
    }

    public final ea4 a() {
        Intent intent = this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f);
        this.b.getClass();
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.d;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.e);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ActivityOptions activityOptions = this.c;
            if (activityOptions == null) {
                activityOptions = ActivityOptions.makeBasic();
                this.c = activityOptions;
            }
            q9.J(activityOptions);
        }
        if (i >= 36) {
            if (this.c == null) {
                this.c = ActivityOptions.makeBasic();
            }
            aa.i(this.c, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions2 = this.c;
        return new ea4(intent, activityOptions2 != null ? activityOptions2.toBundle() : null);
    }

    public da4 b(int i) {
        c(i, 0);
        return this;
    }

    public final void c(int i, int i2) {
        if (i <= 0) {
            a70.p("Invalid value for the initialHeightPx argument");
            return;
        }
        if (i2 < 0 || i2 > 2) {
            a70.p("Invalid value for the activityHeightResizeBehavior argument");
            return;
        }
        Intent intent = this.a;
        intent.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i);
        intent.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i2);
    }

    public da4 d(int i) {
        if (i > 0) {
            this.a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_WIDTH_PX", i);
            return this;
        }
        a70.p("Invalid value for the initialWidthPx argument");
        return null;
    }

    public final void e() {
        this.e = 2;
        this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    public final void f(boolean z) {
        this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z);
    }

    public da4() {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = new p4h(20);
        this.e = 0;
        this.f = true;
    }
}

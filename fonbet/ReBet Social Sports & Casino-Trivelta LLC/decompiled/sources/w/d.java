package w;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import l0.AbstractC5338c;
import w.C6694a;
import zendesk.core.Constants;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f67200a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f67201b;

    public static class a {
        public static ActivityOptions a() {
            return ActivityOptions.makeBasic();
        }
    }

    public static class b {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public static class c {
        public static void a(ActivityOptions activityOptions, boolean z10) {
            activityOptions.setShareIdentityEnabled(z10);
        }
    }

    public d(Intent intent, Bundle bundle) {
        this.f67200a = intent;
        this.f67201b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f67200a.setData(uri);
        AbstractC5338c.startActivity(context, this.f67200a, this.f67201b);
    }

    /* renamed from: w.d$d, reason: collision with other inner class name */
    public static final class C0946d {

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f67204c;

        /* renamed from: d, reason: collision with root package name */
        public ActivityOptions f67205d;

        /* renamed from: e, reason: collision with root package name */
        public ArrayList f67206e;

        /* renamed from: f, reason: collision with root package name */
        public SparseArray f67207f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f67208g;

        /* renamed from: j, reason: collision with root package name */
        public boolean f67211j;

        /* renamed from: a, reason: collision with root package name */
        public final Intent f67202a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        public final C6694a.C0945a f67203b = new C6694a.C0945a();

        /* renamed from: h, reason: collision with root package name */
        public int f67209h = 0;

        /* renamed from: i, reason: collision with root package name */
        public boolean f67210i = true;

        public C0946d() {
        }

        public d a() {
            if (!this.f67202a.hasExtra("android.support.customtabs.extra.SESSION")) {
                l(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f67204c;
            if (arrayList != null) {
                this.f67202a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f67206e;
            if (arrayList2 != null) {
                this.f67202a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f67202a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f67210i);
            this.f67202a.putExtras(this.f67203b.a().a());
            Bundle bundle = this.f67208g;
            if (bundle != null) {
                this.f67202a.putExtras(bundle);
            }
            if (this.f67207f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f67207f);
                this.f67202a.putExtras(bundle2);
            }
            this.f67202a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f67209h);
            int i10 = Build.VERSION.SDK_INT;
            d();
            if (i10 >= 34) {
                m();
            }
            ActivityOptions activityOptions = this.f67205d;
            return new d(this.f67202a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        public C0946d b(boolean z10) {
            this.f67202a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", !z10);
            return this;
        }

        public C0946d c(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("Invalid value for the colorScheme argument");
            }
            this.f67202a.putExtra("androidx.browser.customtabs.extra.COLOR_SCHEME", i10);
            return this;
        }

        public final void d() {
            String a10 = b.a();
            if (TextUtils.isEmpty(a10)) {
                return;
            }
            Bundle bundleExtra = this.f67202a.hasExtra("com.android.browser.headers") ? this.f67202a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey(Constants.ACCEPT_LANGUAGE)) {
                return;
            }
            bundleExtra.putString(Constants.ACCEPT_LANGUAGE, a10);
            this.f67202a.putExtra("com.android.browser.headers", bundleExtra);
        }

        public C0946d e(C6694a c6694a) {
            this.f67208g = c6694a.a();
            return this;
        }

        public C0946d f(boolean z10) {
            this.f67202a.putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_DOWNLOAD_BUTTON", !z10);
            return this;
        }

        public C0946d g(Context context, int i10, int i11) {
            this.f67202a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.c.a(context, i10, i11).b());
            return this;
        }

        public C0946d h(int i10, int i11) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Invalid value for the initialHeightPx argument");
            }
            if (i11 < 0 || i11 > 2) {
                throw new IllegalArgumentException("Invalid value for the activityHeightResizeBehavior argument");
            }
            this.f67202a.putExtra("androidx.browser.customtabs.extra.INITIAL_ACTIVITY_HEIGHT_PX", i10);
            this.f67202a.putExtra("androidx.browser.customtabs.extra.ACTIVITY_HEIGHT_RESIZE_BEHAVIOR", i11);
            return this;
        }

        public C0946d i(boolean z10) {
            this.f67210i = z10;
            return this;
        }

        public C0946d j(boolean z10) {
            this.f67202a.putExtra("android.support.customtabs.extra.SEND_TO_EXTERNAL_HANDLER", z10);
            return this;
        }

        public C0946d k(f fVar) {
            this.f67202a.setPackage(fVar.d().getPackageName());
            l(fVar.c(), fVar.e());
            return this;
        }

        public final void l(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f67202a.putExtras(bundle);
        }

        public final void m() {
            if (this.f67205d == null) {
                this.f67205d = a.a();
            }
            c.a(this.f67205d, this.f67211j);
        }

        public C0946d n(boolean z10) {
            this.f67202a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z10 ? 1 : 0);
            return this;
        }

        public C0946d o(Context context, int i10, int i11) {
            this.f67205d = ActivityOptions.makeCustomAnimation(context, i10, i11);
            return this;
        }

        public C0946d p(int i10) {
            this.f67203b.e(i10);
            return this;
        }

        public C0946d(f fVar) {
            if (fVar != null) {
                k(fVar);
            }
        }
    }
}

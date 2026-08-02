package s;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.fragment.app.r;

/* renamed from: s.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9557e {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Intent f98031a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f98032b;

    C9557e(@NonNull Intent intent, Bundle bundle) {
        this.f98031a = intent;
        this.f98032b = bundle;
    }

    public final void a(@NonNull r rVar, @NonNull Uri uri) {
        Intent intent = this.f98031a;
        intent.setData(uri);
        androidx.core.content.a.startActivity(rVar, intent, this.f98032b);
    }

    /* renamed from: s.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Intent f98033a;

        /* renamed from: b, reason: collision with root package name */
        private final C9553a f98034b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f98035c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f98036d;

        public a() {
            this.f98033a = new Intent("android.intent.action.VIEW");
            this.f98034b = new C9553a();
            this.f98036d = true;
        }

        @NonNull
        public final void a() {
            this.f98033a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        }

        @NonNull
        public final C9557e b() {
            Intent intent = this.f98033a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f98036d);
            this.f98034b.getClass();
            intent.putExtras(new Bundle());
            return new C9557e(intent, this.f98035c);
        }

        @NonNull
        public final void c() {
            this.f98033a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        }

        @NonNull
        public final void d(@NonNull r rVar, int i11, int i12) {
            this.f98033a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.c.a(rVar, i11, i12).c());
        }

        @NonNull
        public final void e() {
            this.f98033a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        }

        @NonNull
        public final void f(@NonNull r rVar, int i11, int i12) {
            this.f98035c = androidx.core.app.c.a(rVar, i11, i12).c();
        }

        public a(g gVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f98033a = intent;
            this.f98034b = new C9553a();
            this.f98036d = true;
            if (gVar != null) {
                intent.setPackage(gVar.b().getPackageName());
                IBinder a11 = gVar.a();
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", a11);
                intent.putExtras(bundle);
            }
        }
    }
}

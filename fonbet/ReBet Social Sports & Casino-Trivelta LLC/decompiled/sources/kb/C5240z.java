package kb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzafc;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kb.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5240z extends AbstractC5223h {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f54415a;

    /* renamed from: kb.z$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final FirebaseAuth f54416a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f54417b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f54418c;

        public a a(String str, String str2) {
            this.f54418c.putString(str, str2);
            return this;
        }

        public C5240z b() {
            return new C5240z(this.f54417b);
        }

        public a c(List list) {
            this.f54417b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }

        public a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f54417b = bundle;
            Bundle bundle2 = new Bundle();
            this.f54418c = bundle2;
            this.f54416a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.i().q().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzafc.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.o());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.i().p());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.k());
        }
    }

    /* renamed from: kb.z$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f54419a;

        /* renamed from: b, reason: collision with root package name */
        public String f54420b;

        /* renamed from: c, reason: collision with root package name */
        public String f54421c;

        /* renamed from: d, reason: collision with root package name */
        public String f54422d;

        public AuthCredential a() {
            return zze.O(this.f54419a, this.f54420b, this.f54421c, this.f54422d);
        }

        public b b(String str) {
            this.f54420b = str;
            return this;
        }

        public b c(String str, String str2) {
            this.f54420b = str;
            this.f54422d = str2;
            return this;
        }

        public b(String str) {
            this.f54419a = str;
        }
    }

    public static AuthCredential d(String str, String str2, String str3) {
        return zze.N(str, str2, str3);
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        AbstractC3191o.g(str);
        AbstractC3191o.m(firebaseAuth);
        if (!"facebook.com".equals(str) || zzagl.zza(firebaseAuth.i())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(AbstractC3191o.g(str));
    }

    @Override // kb.AbstractC5223h
    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f54415a);
        activity.startActivity(intent);
    }

    @Override // kb.AbstractC5223h
    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f54415a);
        activity.startActivity(intent);
    }

    @Override // kb.AbstractC5223h
    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f54415a);
        activity.startActivity(intent);
    }

    public C5240z(Bundle bundle) {
        this.f54415a = bundle;
    }
}

package d8;

import T7.C1665e;
import T7.C1667g;
import T7.Z;
import android.app.Activity;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.Profile;
import com.facebook.login.LoginClient;
import g6.C4331C;
import g6.C4351k;
import g6.C4357q;
import g6.InterfaceC4350j;
import g6.InterfaceC4354n;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k.AbstractC5140a;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public class w {

    /* renamed from: j, reason: collision with root package name */
    public static final b f45121j;

    /* renamed from: k, reason: collision with root package name */
    public static final Set f45122k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f45123l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile w f45124m;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f45127c;

    /* renamed from: e, reason: collision with root package name */
    public String f45129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f45130f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f45132h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f45133i;

    /* renamed from: a, reason: collision with root package name */
    public n f45125a = n.NATIVE_WITH_FALLBACK;

    /* renamed from: b, reason: collision with root package name */
    public EnumC4028d f45126b = EnumC4028d.FRIENDS;

    /* renamed from: d, reason: collision with root package name */
    public String f45128d = "rerequest";

    /* renamed from: g, reason: collision with root package name */
    public y f45131g = y.FACEBOOK;

    public static final class a implements InterfaceC4024I {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f45134a;

        public a(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f45134a = activity;
        }

        @Override // d8.InterfaceC4024I
        public Activity a() {
            return this.f45134a;
        }

        @Override // d8.InterfaceC4024I
        public void startActivityForResult(Intent intent, int i10) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            a().startActivityForResult(intent, i10);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final x b(LoginClient.Request request, AccessToken newToken, AuthenticationToken authenticationToken) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(newToken, "newToken");
            Set permissions = request.getPermissions();
            Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(newToken.getPermissions()));
            if (request.getIsRerequest()) {
                mutableSet.retainAll(permissions);
            }
            Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.filterNotNull(permissions));
            mutableSet2.removeAll(mutableSet);
            return new x(newToken, authenticationToken, mutableSet, mutableSet2);
        }

        public w c() {
            if (w.f45124m == null) {
                synchronized (this) {
                    w.f45124m = new w();
                    Unit unit = Unit.INSTANCE;
                }
            }
            w wVar = w.f45124m;
            if (wVar != null) {
                return wVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            throw null;
        }

        public final Set d() {
            return SetsKt.setOf((Object[]) new String[]{"ads_management", "create_event", "rsvp_event"});
        }

        public final boolean e(String str) {
            return str != null && (StringsKt.startsWith$default(str, "publish", false, 2, (Object) null) || StringsKt.startsWith$default(str, "manage", false, 2, (Object) null) || w.f45122k.contains(str));
        }

        public b() {
        }
    }

    public final class c extends AbstractC5140a {

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC4350j f45135d;

        /* renamed from: e, reason: collision with root package name */
        public String f45136e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ w f45137f;

        public c(w this$0, InterfaceC4350j interfaceC4350j, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f45137f = this$0;
            this.f45135d = interfaceC4350j;
            this.f45136e = str;
        }

        @Override // k.AbstractC5140a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, Collection permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            LoginClient.Request j10 = this.f45137f.j(new o(permissions, null, 2, null));
            String str = this.f45136e;
            if (str != null) {
                j10.a0(str);
            }
            this.f45137f.y(context, j10);
            Intent n10 = this.f45137f.n(j10);
            if (this.f45137f.E(n10)) {
                return n10;
            }
            C4357q c4357q = new C4357q("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            this.f45137f.q(context, LoginClient.Result.a.ERROR, null, c4357q, false, j10);
            throw c4357q;
        }

        @Override // k.AbstractC5140a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC4350j.a parseResult(int i10, Intent intent) {
            w.A(this.f45137f, i10, intent, null, 4, null);
            int b10 = C1665e.c.Login.b();
            InterfaceC4350j interfaceC4350j = this.f45135d;
            if (interfaceC4350j != null) {
                interfaceC4350j.a(b10, i10, intent);
            }
            return new InterfaceC4350j.a(b10, i10, intent);
        }

        public final void c(InterfaceC4350j interfaceC4350j) {
            this.f45135d = interfaceC4350j;
        }
    }

    public static final class d implements InterfaceC4024I {

        /* renamed from: a, reason: collision with root package name */
        public final T7.B f45138a;

        /* renamed from: b, reason: collision with root package name */
        public final Activity f45139b;

        public d(T7.B fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.f45138a = fragment;
            this.f45139b = fragment.a();
        }

        @Override // d8.InterfaceC4024I
        public Activity a() {
            return this.f45139b;
        }

        @Override // d8.InterfaceC4024I
        public void startActivityForResult(Intent intent, int i10) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.f45138a.d(intent, i10);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f45140a = new e();

        /* renamed from: b, reason: collision with root package name */
        public static t f45141b;

        public final synchronized t a(Context context) {
            if (context == null) {
                context = C4331C.l();
            }
            if (context == null) {
                return null;
            }
            if (f45141b == null) {
                f45141b = new t(context, C4331C.m());
            }
            return f45141b;
        }
    }

    static {
        b bVar = new b(null);
        f45121j = bVar;
        f45122k = bVar.d();
        String cls = w.class.toString();
        Intrinsics.checkNotNullExpressionValue(cls, "LoginManager::class.java.toString()");
        f45123l = cls;
    }

    public w() {
        Z.o();
        SharedPreferences sharedPreferences = C4331C.l().getSharedPreferences("com.facebook.loginManager", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getApplicationContext().getSharedPreferences(PREFERENCE_LOGIN_MANAGER, Context.MODE_PRIVATE)");
        this.f45127c = sharedPreferences;
        if (!C4331C.f46937q || C1667g.a() == null) {
            return;
        }
        w.c.a(C4331C.l(), "com.android.chrome", new C4027c());
        w.c.b(C4331C.l(), C4331C.l().getPackageName());
    }

    public static /* synthetic */ boolean A(w wVar, int i10, Intent intent, InterfaceC4354n interfaceC4354n, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onActivityResult");
        }
        if ((i11 & 4) != 0) {
            interfaceC4354n = null;
        }
        return wVar.z(i10, intent, interfaceC4354n);
    }

    public static final boolean D(w this$0, InterfaceC4354n interfaceC4354n, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.z(i10, intent, interfaceC4354n);
    }

    public static final boolean P(w this$0, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return A(this$0, i10, intent, null, 4, null);
    }

    public static w o() {
        return f45121j.c();
    }

    public final void B(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        O(new a(activity), k());
    }

    public final void C(InterfaceC4350j interfaceC4350j, final InterfaceC4354n interfaceC4354n) {
        if (!(interfaceC4350j instanceof C1665e)) {
            throw new C4357q("Unexpected CallbackManager, please use the provided Factory.");
        }
        ((C1665e) interfaceC4350j).c(C1665e.c.Login.b(), new C1665e.a() { // from class: d8.u
            @Override // T7.C1665e.a
            public final boolean a(int i10, Intent intent) {
                boolean D10;
                D10 = w.D(w.this, interfaceC4354n, i10, intent);
                return D10;
            }
        });
    }

    public final boolean E(Intent intent) {
        return C4331C.l().getPackageManager().resolveActivity(intent, 0) != null;
    }

    public final w F(String authType) {
        Intrinsics.checkNotNullParameter(authType, "authType");
        this.f45128d = authType;
        return this;
    }

    public final w G(EnumC4028d defaultAudience) {
        Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
        this.f45126b = defaultAudience;
        return this;
    }

    public final void H(boolean z10) {
        SharedPreferences.Editor edit = this.f45127c.edit();
        edit.putBoolean("express_login_allowed", z10);
        edit.apply();
    }

    public final w I(boolean z10) {
        this.f45132h = z10;
        return this;
    }

    public final w J(n loginBehavior) {
        Intrinsics.checkNotNullParameter(loginBehavior, "loginBehavior");
        this.f45125a = loginBehavior;
        return this;
    }

    public final w K(y targetApp) {
        Intrinsics.checkNotNullParameter(targetApp, "targetApp");
        this.f45131g = targetApp;
        return this;
    }

    public final w L(String str) {
        this.f45129e = str;
        return this;
    }

    public final w M(boolean z10) {
        this.f45130f = z10;
        return this;
    }

    public final w N(boolean z10) {
        this.f45133i = z10;
        return this;
    }

    public final void O(InterfaceC4024I interfaceC4024I, LoginClient.Request request) {
        y(interfaceC4024I.a(), request);
        C1665e.f11105b.c(C1665e.c.Login.b(), new C1665e.a() { // from class: d8.v
            @Override // T7.C1665e.a
            public final boolean a(int i10, Intent intent) {
                boolean P10;
                P10 = w.P(w.this, i10, intent);
                return P10;
            }
        });
        if (Q(interfaceC4024I, request)) {
            return;
        }
        C4357q c4357q = new C4357q("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        q(interfaceC4024I.a(), LoginClient.Result.a.ERROR, null, c4357q, false, request);
        throw c4357q;
    }

    public final boolean Q(InterfaceC4024I interfaceC4024I, LoginClient.Request request) {
        Intent n10 = n(request);
        if (!E(n10)) {
            return false;
        }
        try {
            interfaceC4024I.startActivityForResult(n10, LoginClient.INSTANCE.b());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final c i(InterfaceC4350j interfaceC4350j, String str) {
        return new c(this, interfaceC4350j, str);
    }

    public LoginClient.Request j(o loginConfig) {
        String a10;
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        EnumC4025a enumC4025a = EnumC4025a.S256;
        try {
            C4017B c4017b = C4017B.f45022a;
            a10 = C4017B.b(loginConfig.a(), enumC4025a);
        } catch (C4357q unused) {
            enumC4025a = EnumC4025a.PLAIN;
            a10 = loginConfig.a();
        }
        EnumC4025a enumC4025a2 = enumC4025a;
        String str = a10;
        n nVar = this.f45125a;
        Set set = CollectionsKt.toSet(loginConfig.c());
        EnumC4028d enumC4028d = this.f45126b;
        String str2 = this.f45128d;
        String m10 = C4331C.m();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(nVar, set, enumC4028d, str2, m10, uuid, this.f45131g, loginConfig.b(), loginConfig.a(), str, enumC4025a2);
        request.g0(AccessToken.INSTANCE.g());
        request.e0(this.f45129e);
        request.h0(this.f45130f);
        request.d0(this.f45132h);
        request.i0(this.f45133i);
        return request;
    }

    public LoginClient.Request k() {
        n nVar = n.DIALOG_ONLY;
        HashSet hashSet = new HashSet();
        EnumC4028d enumC4028d = this.f45126b;
        String m10 = C4331C.m();
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        LoginClient.Request request = new LoginClient.Request(nVar, hashSet, enumC4028d, "reauthorize", m10, uuid, this.f45131g, null, null, null, null, 1920, null);
        request.d0(this.f45132h);
        request.i0(this.f45133i);
        return request;
    }

    public final void l(AccessToken accessToken, AuthenticationToken authenticationToken, LoginClient.Request request, C4357q c4357q, boolean z10, InterfaceC4354n interfaceC4354n) {
        if (accessToken != null) {
            AccessToken.INSTANCE.i(accessToken);
            Profile.INSTANCE.a();
        }
        if (authenticationToken != null) {
            AuthenticationToken.INSTANCE.a(authenticationToken);
        }
        if (interfaceC4354n != null) {
            x b10 = (accessToken == null || request == null) ? null : f45121j.b(request, accessToken, authenticationToken);
            if (z10 || (b10 != null && b10.c().isEmpty())) {
                interfaceC4354n.onCancel();
                return;
            }
            if (c4357q != null) {
                interfaceC4354n.a(c4357q);
            } else {
                if (accessToken == null || b10 == null) {
                    return;
                }
                H(true);
                interfaceC4354n.onSuccess(b10);
            }
        }
    }

    public final EnumC4028d m() {
        return this.f45126b;
    }

    public Intent n(LoginClient.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intent intent = new Intent();
        intent.setClass(C4331C.l(), FacebookActivity.class);
        intent.setAction(request.getLoginBehavior().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    public final n p() {
        return this.f45125a;
    }

    public final void q(Context context, LoginClient.Result.a aVar, Map map, Exception exc, boolean z10, LoginClient.Request request) {
        t a10 = e.f45140a.a(context);
        if (a10 == null) {
            return;
        }
        if (request == null) {
            t.k(a10, "fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", null, 4, null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("try_login_activity", z10 ? "1" : "0");
        a10.f(request.getAuthId(), hashMap, aVar, map, exc, request.getIsFamilyLogin() ? "foa_mobile_login_complete" : "fb_mobile_login_complete");
    }

    public final void r(T7.B fragment, Collection collection, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LoginClient.Request j10 = j(new o(collection, null, 2, null));
        if (str != null) {
            j10.a0(str);
        }
        O(new d(fragment), j10);
    }

    public final void s(Activity activity, o loginConfig) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(loginConfig, "loginConfig");
        if (activity instanceof j.e) {
            Log.w(f45123l, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        O(new a(activity), j(loginConfig));
    }

    public final void t(Activity activity, Collection collection) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        s(activity, new o(collection, null, 2, null));
    }

    public final void u(Activity activity, Collection collection, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        LoginClient.Request j10 = j(new o(collection, null, 2, null));
        if (str != null) {
            j10.a0(str);
        }
        O(new a(activity), j10);
    }

    public final void v(Fragment fragment, Collection collection, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        r(new T7.B(fragment), collection, str);
    }

    public final void w(androidx.fragment.app.Fragment fragment, Collection collection, String str) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        r(new T7.B(fragment), collection, str);
    }

    public void x() {
        AccessToken.INSTANCE.i(null);
        AuthenticationToken.INSTANCE.a(null);
        Profile.INSTANCE.c(null);
        H(false);
    }

    public final void y(Context context, LoginClient.Request request) {
        t a10 = e.f45140a.a(context);
        if (a10 == null || request == null) {
            return;
        }
        a10.i(request, request.getIsFamilyLogin() ? "foa_mobile_login_start" : "fb_mobile_login_start");
    }

    public boolean z(int i10, Intent intent, InterfaceC4354n interfaceC4354n) {
        LoginClient.Result.a aVar;
        boolean z10;
        AccessToken accessToken;
        AuthenticationToken authenticationToken;
        Map map;
        LoginClient.Request request;
        AuthenticationToken authenticationToken2;
        LoginClient.Result.a aVar2 = LoginClient.Result.a.ERROR;
        C4357q c4357q = null;
        if (intent != null) {
            intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
            LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (result != null) {
                LoginClient.Request request2 = result.request;
                LoginClient.Result.a aVar3 = result.com.twilio.voice.EventKeys.ERROR_CODE java.lang.String;
                if (i10 != -1) {
                    r5 = i10 == 0;
                    accessToken = null;
                    authenticationToken2 = null;
                } else if (aVar3 == LoginClient.Result.a.SUCCESS) {
                    accessToken = result.token;
                    authenticationToken2 = result.authenticationToken;
                } else {
                    authenticationToken2 = null;
                    c4357q = new C4351k(result.errorMessage);
                    accessToken = null;
                }
                map = result.loggingExtras;
                request = request2;
                z10 = r5;
                authenticationToken = authenticationToken2;
                aVar = aVar3;
            }
            aVar = aVar2;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
            z10 = false;
        } else {
            if (i10 == 0) {
                aVar = LoginClient.Result.a.CANCEL;
                z10 = true;
                accessToken = null;
                authenticationToken = null;
                map = null;
                request = null;
            }
            aVar = aVar2;
            accessToken = null;
            authenticationToken = null;
            map = null;
            request = null;
            z10 = false;
        }
        if (c4357q == null && accessToken == null && !z10) {
            c4357q = new C4357q("Unexpected call to LoginManager.onActivityResult");
        }
        C4357q c4357q2 = c4357q;
        q(null, aVar, map, c4357q2, true, request);
        l(accessToken, authenticationToken, request, c4357q2, z10, interfaceC4354n);
        return true;
    }
}

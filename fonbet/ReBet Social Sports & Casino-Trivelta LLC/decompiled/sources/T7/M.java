package T7;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.twilio.voice.PublisherMetadata;
import d8.EnumC4028d;
import g6.C4331C;
import g6.C4357q;
import g6.C4358s;
import io.agora.utils2.internal.CommonUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class M {

    @NotNull
    private static final Integer[] KNOWN_PROTOCOL_VERSIONS;

    /* renamed from: a, reason: collision with root package name */
    public static final M f11009a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f11010b;

    /* renamed from: c, reason: collision with root package name */
    public static final List f11011c;

    /* renamed from: d, reason: collision with root package name */
    public static final List f11012d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f11013e;

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f11014f;

    public static final class a extends e {
        @Override // T7.M.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // T7.M.e
        public String d() {
            return "com.facebook.arstudio.player";
        }

        public Void g() {
            return null;
        }
    }

    public static final class b extends e {
        @Override // T7.M.e
        public String c() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // T7.M.e
        public String d() {
            return "com.instagram.android";
        }

        @Override // T7.M.e
        public String e() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    public static final class c extends e {
        @Override // T7.M.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // T7.M.e
        public String d() {
            return "com.facebook.katana";
        }

        @Override // T7.M.e
        public void f() {
            if (g()) {
                Log.w(M.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }

        public final boolean g() {
            return C4331C.l().getApplicationInfo().targetSdkVersion >= 30;
        }
    }

    public static final class d extends e {
        @Override // T7.M.e
        public /* bridge */ /* synthetic */ String c() {
            return (String) g();
        }

        @Override // T7.M.e
        public String d() {
            return "com.facebook.orca";
        }

        public Void g() {
            return null;
        }
    }

    public static final class f {

        /* renamed from: c, reason: collision with root package name */
        public static final a f11016c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public e f11017a;

        /* renamed from: b, reason: collision with root package name */
        public int f11018b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(e eVar, int i10) {
                f fVar = new f(null);
                fVar.f11017a = eVar;
                fVar.f11018b = i10;
                return fVar;
            }

            public final f b() {
                f fVar = new f(null);
                fVar.f11018b = -1;
                return fVar;
            }

            public a() {
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e c() {
            return this.f11017a;
        }

        public final int d() {
            return this.f11018b;
        }

        public f() {
        }
    }

    public static final class g extends e {
        @Override // T7.M.e
        public String c() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // T7.M.e
        public String d() {
            return "com.facebook.wakizashi";
        }
    }

    static {
        M m10 = new M();
        f11009a = m10;
        f11010b = M.class.getName();
        f11011c = m10.f();
        f11012d = m10.e();
        f11013e = m10.d();
        f11014f = new AtomicBoolean(false);
        KNOWN_PROTOCOL_VERSIONS = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final Bundle A(Intent resultIntent) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            int z10 = z(resultIntent);
            Bundle extras = resultIntent.getExtras();
            if (C(z10) && extras != null) {
                return extras.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
            }
            return extras;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final boolean B(Intent resultIntent) {
        if (Y7.a.d(M.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            Bundle q10 = q(resultIntent);
            Boolean valueOf = q10 == null ? null : Boolean.valueOf(q10.containsKey("error"));
            return valueOf == null ? resultIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE") : valueOf.booleanValue();
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return false;
        }
    }

    public static final boolean C(int i10) {
        if (Y7.a.d(M.class)) {
            return false;
        }
        try {
            return ArraysKt.contains(KNOWN_PROTOCOL_VERSIONS, Integer.valueOf(i10)) && i10 >= 20140701;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return false;
        }
    }

    public static final void D(Intent intent, String str, String str2, int i10, Bundle bundle) {
        if (Y7.a.d(M.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String m10 = C4331C.m();
            String n10 = C4331C.n();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i10).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", str2).putExtra("com.facebook.platform.extra.APPLICATION_ID", m10);
            if (!C(i10)) {
                intent.putExtra("com.facebook.platform.protocol.CALL_ID", str);
                if (!Y.d0(n10)) {
                    intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", n10);
                }
                if (bundle != null) {
                    intent.putExtras(bundle);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", str);
            Y.s0(bundle2, PublisherMetadata.APP_NAME, n10);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle == null) {
                bundle = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", bundle);
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
        }
    }

    public static final void E() {
        if (Y7.a.d(M.class)) {
            return;
        }
        try {
            if (f11014f.compareAndSet(false, true)) {
                C4331C.t().execute(new Runnable() { // from class: T7.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        M.F();
                    }
                });
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
        }
    }

    public static final void F() {
        if (Y7.a.d(M.class)) {
            return;
        }
        try {
            try {
                Iterator it = f11011c.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(true);
                }
            } finally {
                f11014f.set(false);
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
        }
    }

    public static final Intent G(Context context, Intent intent, e eVar) {
        ResolveInfo resolveActivity;
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null) {
                return null;
            }
            C1676p c1676p = C1676p.f11158a;
            String str = resolveActivity.activityInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
            if (C1676p.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final Intent H(Context context, Intent intent, e eVar) {
        ResolveInfo resolveService;
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null) {
                return null;
            }
            C1676p c1676p = C1676p.f11158a;
            String str = resolveService.serviceInfo.packageName;
            Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.serviceInfo.packageName");
            if (C1676p.a(context, str)) {
                return intent;
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final /* synthetic */ TreeSet b(M m10, e eVar) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            return m10.p(eVar);
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final /* synthetic */ String c() {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            return f11010b;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return java.lang.Math.min(r4, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int h(TreeSet treeSet, int i10, int[] versionSpec) {
        if (Y7.a.d(M.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                Integer fbAppVersion = (Integer) descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i11 = Math.max(i11, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    break;
                }
            }
            return -1;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return 0;
        }
    }

    public static final Bundle i(C4357q c4357q) {
        if (Y7.a.d(M.class) || c4357q == null) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("error_description", c4357q.toString());
            if (!(c4357q instanceof C4358s)) {
                return bundle;
            }
            bundle.putString("error_type", "UserCanceled");
            return bundle;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final Intent j(Context context, String applicationId, Collection permissions, String e2e, boolean z10, boolean z11, EnumC4028d defaultAudience, String clientState, String authType, String str, boolean z12, boolean z13, boolean z14) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            Intrinsics.checkNotNullParameter(authType, "authType");
            b bVar = new b();
            return G(context, f11009a.k(bVar, applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, false, str, z12, d8.y.INSTAGRAM, z13, z14, "", null, null), bVar);
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final Intent l(Context context, String str, String str2, f fVar, Bundle bundle) {
        e c10;
        Intent G10;
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (fVar == null || (c10 = fVar.c()) == null || (G10 = G(context, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(c10.d()).addCategory("android.intent.category.DEFAULT"), c10)) == null) {
                return null;
            }
            D(G10, str, str2, fVar.d(), bundle);
            return G10;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final Intent m(Context context) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            for (e eVar : f11011c) {
                Intent H10 = H(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.d()).addCategory("android.intent.category.DEFAULT"), eVar);
                if (H10 != null) {
                    return H10;
                }
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final Intent n(Intent requestIntent, Bundle bundle, C4357q c4357q) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(requestIntent, "requestIntent");
            UUID r10 = r(requestIntent);
            if (r10 == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", z(requestIntent));
            Bundle bundle2 = new Bundle();
            bundle2.putString("action_id", r10.toString());
            if (c4357q != null) {
                bundle2.putBundle("error", i(c4357q));
            }
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
            if (bundle != null) {
                intent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final List o(Context context, String str, Collection collection, String str2, boolean z10, boolean z11, EnumC4028d enumC4028d, String str3, String str4, boolean z12, String str5, boolean z13, boolean z14, boolean z15, String str6, String str7, String str8) {
        List list;
        List list2 = null;
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            String applicationId = str;
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Collection permissions = collection;
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            String e2e = str2;
            Intrinsics.checkNotNullParameter(e2e, "e2e");
            EnumC4028d defaultAudience = enumC4028d;
            Intrinsics.checkNotNullParameter(defaultAudience, "defaultAudience");
            String clientState = str3;
            Intrinsics.checkNotNullParameter(clientState, "clientState");
            String authType = str4;
            Intrinsics.checkNotNullParameter(authType, "authType");
            List list3 = f11011c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                list = list2;
                try {
                    Intent k10 = f11009a.k((e) it.next(), applicationId, permissions, e2e, z11, defaultAudience, clientState, authType, z12, str5, z13, d8.y.FACEBOOK, z14, z15, str6, str7, str8);
                    if (k10 != null) {
                        arrayList2.add(k10);
                    }
                    applicationId = str;
                    permissions = collection;
                    e2e = str2;
                    defaultAudience = enumC4028d;
                    clientState = str3;
                    authType = str4;
                    arrayList = arrayList2;
                    list2 = list;
                } catch (Throwable th2) {
                    th = th2;
                    Y7.a.b(th, M.class);
                    return list;
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            list = list2;
        }
    }

    public static final Bundle q(Intent intent) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (C(z(intent))) {
                return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final UUID r(Intent intent) {
        String stringExtra;
        if (Y7.a.d(M.class) || intent == null) {
            return null;
        }
        try {
            if (C(z(intent))) {
                Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
            } else {
                stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (stringExtra != null) {
                try {
                    return UUID.fromString(stringExtra);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final Bundle s(Intent resultIntent) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(resultIntent, "resultIntent");
            if (!B(resultIntent)) {
                return null;
            }
            Bundle q10 = q(resultIntent);
            return q10 != null ? q10.getBundle("error") : resultIntent.getExtras();
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final C4357q t(Bundle bundle) {
        if (Y7.a.d(M.class) || bundle == null) {
            return null;
        }
        try {
            String string = bundle.getString("error_type");
            if (string == null) {
                string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
            }
            String string2 = bundle.getString("error_description");
            if (string2 == null) {
                string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
            }
            return (string == null || !StringsKt.equals(string, "UserCanceled", true)) ? new C4357q(string2) : new C4358s(string2);
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final f u(String action, int[] versionSpec) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            List list = (List) f11013e.get(action);
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            return f11009a.v(list, versionSpec);
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final int w(int i10) {
        if (Y7.a.d(M.class)) {
            return 0;
        }
        try {
            return f11009a.v(f11011c, new int[]{i10}).d();
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return 0;
        }
    }

    public static final int x() {
        if (Y7.a.d(M.class)) {
            return 0;
        }
        try {
            return KNOWN_PROTOCOL_VERSIONS[0].intValue();
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return 0;
        }
    }

    public static final Bundle y(Intent intent) {
        if (Y7.a.d(M.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return !C(z(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return null;
        }
    }

    public static final int z(Intent intent) {
        if (Y7.a.d(M.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            Y7.a.b(th2, M.class);
            return 0;
        }
    }

    public final Map d() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new d());
            List list = f11011c;
            hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f11012d);
            hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return hashMap;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final List e() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayListOf = CollectionsKt.arrayListOf(new a());
            arrayListOf.addAll(f());
            return arrayListOf;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final List f() {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new c(), new g());
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final Uri g(e eVar) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(CommonUtility.PREFIX_URI + eVar.d() + ".provider.PlatformProvider/versions");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            return parse;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final Intent k(e eVar, String str, Collection collection, String str2, boolean z10, EnumC4028d enumC4028d, String str3, String str4, boolean z11, String str5, boolean z12, d8.y yVar, boolean z13, boolean z14, String str6, String str7, String str8) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            String c10 = eVar.c();
            if (c10 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.d(), c10).putExtra("client_id", str);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            putExtra.putExtra("facebook_sdk_version", C4331C.B());
            if (!Y.e0(collection)) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!Y.d0(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.e());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", enumC4028d.b());
            }
            putExtra.putExtra("legacy_override", C4331C.w());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", yVar.toString());
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #3 {all -> 0x0087, blocks: (B:6:0x000c, B:32:0x0090, B:31:0x008d, B:18:0x0083), top: B:5:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[EXC_TOP_SPLITTER, LOOP:0: B:20:0x0064->B:23:0x006a, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: all -> 0x0087, TryCatch #3 {all -> 0x0087, blocks: (B:6:0x000c, B:32:0x0090, B:31:0x008d, B:18:0x0083), top: B:5:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet p(e eVar) {
        Throwable th2;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = C4331C.l().getContentResolver();
            String[] strArr = {"version"};
            Uri g10 = g(eVar);
            try {
                try {
                    providerInfo = C4331C.l().getPackageManager().resolveContentProvider(Intrinsics.stringPlus(eVar.d(), ".provider.PlatformProvider"), 0);
                } catch (RuntimeException e10) {
                    Log.e(f11010b, "Failed to query content resolver.", e10);
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        cursor2 = contentResolver.query(g10, strArr, null, null, null);
                    } catch (IllegalArgumentException unused) {
                        Log.e(f11010b, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (NullPointerException unused2) {
                        Log.e(f11010b, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (SecurityException unused3) {
                        Log.e(f11010b, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (Throwable th3) {
                                cursor = cursor2;
                                th2 = th3;
                                if (cursor != null) {
                                }
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (Throwable th4) {
                th2 = th4;
                cursor = null;
                if (cursor != null) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        } catch (Throwable th5) {
            Y7.a.b(th5, this);
            return null;
        }
    }

    public final f v(List list, int[] iArr) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            E();
            if (list == null) {
                return f.f11016c.b();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                int h10 = h(eVar.b(), x(), iArr);
                if (h10 != -1) {
                    return f.f11016c.a(eVar, h10);
                }
            }
            return f.f11016c.b();
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public TreeSet f11015a;

        public final synchronized void a(boolean z10) {
            TreeSet treeSet;
            if (!z10) {
                try {
                    TreeSet treeSet2 = this.f11015a;
                    if (treeSet2 != null) {
                        if (!Intrinsics.areEqual(treeSet2 == null ? null : Boolean.valueOf(treeSet2.isEmpty()), Boolean.FALSE)) {
                        }
                        treeSet = this.f11015a;
                        if (treeSet != null || treeSet.isEmpty()) {
                            f();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f11015a = M.b(M.f11009a, this);
            treeSet = this.f11015a;
            if (treeSet != null) {
            }
            f();
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r0 == null ? null : java.lang.Boolean.valueOf(r0.isEmpty()), java.lang.Boolean.FALSE) == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final TreeSet b() {
            TreeSet treeSet = this.f11015a;
            if (treeSet != null) {
            }
            a(false);
            return this.f11015a;
        }

        public abstract String c();

        public abstract String d();

        public String e() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void f() {
        }
    }
}

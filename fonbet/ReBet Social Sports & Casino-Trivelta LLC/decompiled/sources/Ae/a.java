package Ae;

import Uf.j;
import android.app.Application;
import android.content.SharedPreferences;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.k;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.C5582a;
import og.AbstractC5895g;
import og.AbstractC5896h;
import og.i;
import ze.C6959a;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f448c;

    /* renamed from: a, reason: collision with root package name */
    public final Application f450a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0010a f447b = new C0010a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f449d = new Object();

    /* renamed from: Ae.a$a, reason: collision with other inner class name */
    public static final class C0010a {
        public /* synthetic */ C0010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6959a a() {
            return C6959a.f68673u.b();
        }

        public final a b(Application application) {
            a aVar;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (a.f449d) {
                aVar = a.f448c;
                if (aVar == null) {
                    aVar = new a(application, null);
                    a.f448c = aVar;
                }
            }
            return aVar;
        }

        public C0010a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f451a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final List f452b = CollectionsKt.listOf((Object[]) new String[]{"visitor_email", "visitor_phone", "unique_visitor_name", "salesiq_app_key", "salesiq_access_key", "cvuid", "fcm_token", "jwt_refresh_token", "jwt_access_token", "jwt_refresh_token_expiry", "jwt_access_token_expiry_time", "jwt_visitor_unique_id", "database_passphrase"});

        public final boolean a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return f452b.contains(str);
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(((SalesIQResource.b) obj).a(), ((SalesIQResource.b) obj2).a());
        }
    }

    public /* synthetic */ a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static /* synthetic */ C5582a C(a aVar, De.a aVar2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return aVar.A(aVar2, j10);
    }

    public static /* synthetic */ C5582a O(a aVar, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return aVar.N(str, str2);
    }

    public static /* synthetic */ C5582a m(a aVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return aVar.l(str, z10);
    }

    public final C5582a A(De.a key, long j10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(Ce.a.a(key));
            if (K10 != null) {
                j10 = K10.getLong(Ce.a.a(key), j10);
            }
            m147constructorimpl = Result.m147constructorimpl(Long.valueOf(j10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a B(String key, long j10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null) {
                j10 = K10.getLong(key, j10);
            }
            m147constructorimpl = Result.m147constructorimpl(Long.valueOf(j10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final String D() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("lsid", null);
        }
        return null;
    }

    public final k E() {
        h r10;
        k s10 = s();
        if (s10 == null || (r10 = s10.r("message_actions")) == null) {
            return null;
        }
        return AbstractC5896h.d(r10);
    }

    public final k F() {
        h r10;
        k s10 = s();
        if (s10 == null || (r10 = s10.r("resource")) == null) {
            return null;
        }
        return AbstractC5896h.d(r10);
    }

    public final List G() {
        h r10;
        e<h> c10;
        ArrayList arrayList;
        Map.Entry entry;
        h hVar;
        Set q10;
        h r11;
        e<h> c11;
        h r12;
        h r13;
        if (p()) {
            k s10 = s();
            if (s10 != null && (r11 = s10.r("departments")) != null && (c11 = AbstractC5896h.c(r11)) != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c11, 10));
                for (h hVar2 : c11) {
                    Intrinsics.checkNotNull(hVar2);
                    k d10 = AbstractC5896h.d(hVar2);
                    String f10 = (d10 == null || (r13 = d10.r(StackTraceHelper.ID_KEY)) == null) ? null : AbstractC5896h.f(r13);
                    if (f10 == null) {
                        f10 = "";
                    }
                    String f11 = (d10 == null || (r12 = d10.r("name")) == null) ? null : AbstractC5896h.f(r12);
                    if (f11 == null) {
                        f11 = "";
                    }
                    arrayList.add(new SalesIQResource.b(f10, f11));
                }
            }
            arrayList = null;
        } else {
            k F10 = F();
            if (F10 != null && (r10 = F10.r("departments")) != null && (c10 = AbstractC5896h.c(r10)) != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c10, 10));
                for (h hVar3 : c10) {
                    Intrinsics.checkNotNull(hVar3);
                    k d11 = AbstractC5896h.d(hVar3);
                    if (d11 == null || (q10 = d11.q()) == null) {
                        entry = null;
                    } else {
                        Intrinsics.checkNotNull(q10);
                        entry = (Map.Entry) CollectionsKt.firstOrNull(q10);
                    }
                    String str = entry != null ? (String) entry.getKey() : null;
                    if (str == null) {
                        str = "";
                    }
                    String f12 = (entry == null || (hVar = (h) entry.getValue()) == null) ? null : AbstractC5896h.f(hVar);
                    if (f12 == null) {
                        f12 = "";
                    }
                    arrayList.add(new SalesIQResource.b(str, f12));
                }
            }
            arrayList = null;
        }
        List sortedWith = arrayList != null ? CollectionsKt.sortedWith(arrayList, new c()) : null;
        return sortedWith == null ? CollectionsKt.emptyList() : sortedWith;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H() {
        String string;
        String obj;
        h r10;
        String obj2;
        k s10 = s();
        String str = null;
        if (s10 != null || !j.f12224n) {
            if (j.f12224n) {
                if (s10 != null && (r10 = s10.r("language")) != null) {
                    string = AbstractC5896h.f(r10);
                    obj = string == null ? StringsKt.trim((CharSequence) string).toString() : null;
                    if (obj != null && obj.length() != 0 && !StringsKt.equals(Constants.COLLATION_DEFAULT, string, true)) {
                        str = string;
                    }
                }
                string = null;
                if (string == null) {
                }
                if (obj != null) {
                    str = string;
                }
            } else {
                SharedPreferences L10 = L();
                if (L10 != null) {
                    string = L10.getString("mobilisten_locale", Locale.getDefault().getLanguage());
                    if (string == null) {
                    }
                    if (obj != null) {
                    }
                }
                string = null;
                if (string == null) {
                }
                if (obj != null) {
                }
            }
        }
        String language = ZohoSalesIQ.Chat.getLanguage();
        if (language != null && (obj2 = StringsKt.trim((CharSequence) language).toString()) != null && obj2.length() > 0) {
            str = ZohoSalesIQ.Chat.getLanguage();
        }
        if (str != null) {
            return str;
        }
        String language2 = Locale.getDefault().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language2, "getLanguage(...)");
        return language2;
    }

    public final String I() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("screenname", null);
        }
        return null;
    }

    public final String J() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("sid", null);
        }
        return null;
    }

    public final SharedPreferences K(String str) {
        return b.f451a.a(str) ? w() : L();
    }

    public final SharedPreferences L() {
        return Yd.a.o();
    }

    public final C5582a M(De.a key, String str) {
        Object m147constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(Ce.a.a(key));
            if (K10 != null && (string = K10.getString(Ce.a.a(key), str)) != null) {
                str = string;
            }
            m147constructorimpl = Result.m147constructorimpl(str);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a N(String key, String str) {
        Object m147constructorimpl;
        String string;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null && (string = K10.getString(key, str)) != null) {
                str = string;
            }
            m147constructorimpl = Result.m147constructorimpl(str);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a P(De.a key, Set set) {
        Object m147constructorimpl;
        Set<String> stringSet;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(Ce.a.a(key));
            if (K10 != null && (stringSet = K10.getStringSet(Ce.a.a(key), set)) != null) {
                set = stringSet;
            }
            m147constructorimpl = Result.m147constructorimpl(set);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final String Q() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("utssid", null);
        }
        return null;
    }

    public final String R() {
        return w().getString("visitor_email", null);
    }

    public final k S() {
        h r10;
        k E10 = E();
        if (E10 == null || (r10 = E10.r("visitor")) == null) {
            return null;
        }
        return AbstractC5896h.d(r10);
    }

    public final String T() {
        return w().getString("unique_visitor_name", null);
    }

    public final String U() {
        return w().getString("visitor_phone", null);
    }

    public final String V() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("annonid", null);
        }
        return null;
    }

    public final String W() {
        h r10;
        k t10 = t();
        if (t10 == null || (r10 = t10.r("waiting_message")) == null) {
            return null;
        }
        return AbstractC5896h.f(r10);
    }

    public final String X() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("zldp", null);
        }
        return null;
    }

    public final String Y() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("zldt", null);
        }
        return null;
    }

    public final void Z(SharedPreferences.Editor editor, boolean z10) {
        if (z10) {
            if (editor != null) {
                editor.commit();
            }
        } else if (editor != null) {
            editor.apply();
        }
    }

    public final boolean a0(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return b.f451a.a(key);
    }

    public final boolean b0() {
        h r10;
        k j10 = j();
        return ((j10 == null || (r10 = j10.r("categorial_view")) == null) ? false : AbstractC5896h.a(r10)) && i();
    }

    public final boolean c0() {
        h r10;
        k j10 = j();
        return (j10 == null || (r10 = j10.r("merge_department")) == null || AbstractC5896h.a(r10) || !k()) ? false : true;
    }

    public final C5582a d() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            w().edit().clear().apply();
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final boolean d0() {
        boolean z10;
        h r10;
        C0010a c0010a = f447b;
        Boolean z11 = c0010a.a().z();
        if (z11 != null) {
            return z11.booleanValue();
        }
        if (f0()) {
            k S10 = S();
            if (i.i((S10 == null || (r10 = S10.r("delete")) == null) ? null : Boolean.valueOf(AbstractC5896h.a(r10)))) {
                z10 = true;
                c0010a.a().N(Boolean.valueOf(z10));
                return z10;
            }
        }
        z10 = false;
        c0010a.a().N(Boolean.valueOf(z10));
        return z10;
    }

    public final C5582a e(String key) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            boolean z10 = false;
            if (K10 != null && K10.contains(key)) {
                z10 = true;
            }
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final boolean e0() {
        boolean z10;
        h r10;
        C0010a c0010a = f447b;
        Boolean A10 = c0010a.a().A();
        if (A10 != null) {
            return A10.booleanValue();
        }
        if (f0()) {
            k S10 = S();
            if (i.i((S10 == null || (r10 = S10.r("edit")) == null) ? null : Boolean.valueOf(AbstractC5896h.a(r10)))) {
                z10 = true;
                c0010a.a().O(Boolean.valueOf(z10));
                return z10;
            }
        }
        z10 = false;
        c0010a.a().O(Boolean.valueOf(z10));
        return z10;
    }

    public final String f() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString("avuid", null);
        }
        return null;
    }

    public final boolean f0() {
        h r10;
        k E10 = E();
        return i.i((E10 == null || (r10 = E10.r(ViewProps.ENABLED)) == null) ? null : Boolean.valueOf(AbstractC5896h.a(r10)));
    }

    public final boolean g() {
        h r10;
        k j10 = j();
        if (j10 == null || (r10 = j10.r("allow_likes")) == null) {
            return false;
        }
        return AbstractC5896h.a(r10);
    }

    public final boolean g0() {
        h r10;
        C0010a c0010a = f447b;
        Boolean B10 = c0010a.a().B();
        if (B10 != null) {
            return B10.booleanValue();
        }
        k s10 = s();
        boolean i10 = i.i((s10 == null || (r10 = s10.r("read_receipt")) == null) ? null : Boolean.valueOf(AbstractC5896h.a(r10)));
        c0010a.a().Q(Boolean.valueOf(i10));
        return i10;
    }

    public final String h() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getString(PublisherMetadata.APP_ID, null);
        }
        return null;
    }

    public final C5582a h0(String key, boolean z10) {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null && (edit = K10.edit()) != null && (putBoolean = edit.putBoolean(key, z10)) != null) {
                putBoolean.apply();
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final boolean i() {
        SharedPreferences L10 = L();
        if (L10 != null) {
            return L10.getBoolean("articles_category_visibility", true);
        }
        return true;
    }

    public final C5582a i0(De.a key, long j10, boolean z10) {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(Ce.a.a(key));
            Z((K10 == null || (edit = K10.edit()) == null) ? null : edit.putLong(Ce.a.a(key), j10), z10);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final k j() {
        h r10;
        k d10;
        k s10 = s();
        if (s10 == null || (r10 = s10.r("resources")) == null || (d10 = AbstractC5896h.d(r10)) == null) {
            return null;
        }
        return d10.s("article");
    }

    public final C5582a j0(String key, long j10) {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putLong;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null && (edit = K10.edit()) != null && (putLong = edit.putLong(key, j10)) != null) {
                putLong.apply();
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final boolean k() {
        return !(L() != null ? r0.getBoolean("articles_departments_visibility", false) : false);
    }

    public final C5582a k0(De.a key, String str, boolean z10) {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(Ce.a.a(key));
            Z((K10 == null || (edit = K10.edit()) == null) ? null : edit.putString(Ce.a.a(key), str), z10);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a l(String key, boolean z10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null) {
                z10 = K10.getBoolean(key, z10);
            }
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a l0(De.a key, Set set, boolean z10) {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(Ce.a.a(key));
            Z((K10 == null || (edit = K10.edit()) == null) ? null : edit.putStringSet(Ce.a.a(key), set), z10);
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final C5582a m0(String key) {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor remove;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null && (edit = K10.edit()) != null && (remove = edit.remove(key)) != null) {
                remove.apply();
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final String n() {
        return w().getString("cvuid", null);
    }

    public final boolean o() {
        h r10;
        k j10 = j();
        if (j10 == null || (r10 = j10.r("show_creator_image")) == null) {
            return false;
        }
        return AbstractC5896h.a(r10);
    }

    public final boolean p() {
        h r10;
        k F10 = F();
        if (F10 == null || (r10 = F10.r("use_chat_departments")) == null) {
            return true;
        }
        return AbstractC5896h.a(r10);
    }

    public final boolean q() {
        h r10;
        k u10 = u();
        if (u10 == null || (r10 = u10.r(ViewProps.ENABLED)) == null) {
            return false;
        }
        return AbstractC5896h.a(r10);
    }

    public final Channel r() {
        C0010a c0010a = f447b;
        Channel l10 = c0010a.a().l();
        if (l10 != null) {
            return l10;
        }
        Gson x10 = x();
        SharedPreferences L10 = L();
        Channel channel = (Channel) AbstractC5895g.b(x10, L10 != null ? L10.getString("android_channel", null) : null, Channel.class);
        c0010a.a().G(channel);
        return channel;
    }

    public final k s() {
        String string;
        SharedPreferences L10 = L();
        if (L10 == null || (string = L10.getString("android_channel", null)) == null) {
            return null;
        }
        return i.o(string);
    }

    public final k t() {
        h r10;
        k s10 = s();
        if (s10 == null || (r10 = s10.r("chat")) == null) {
            return null;
        }
        return AbstractC5896h.d(r10);
    }

    public final k u() {
        h r10;
        k j10 = j();
        if (j10 == null || (r10 = j10.r("default_language")) == null) {
            return null;
        }
        return AbstractC5896h.d(r10);
    }

    public final String v() {
        h r10;
        k u10 = u();
        String f10 = (u10 == null || (r10 = u10.r(EventKeys.ERROR_CODE)) == null) ? null : AbstractC5896h.f(r10);
        return f10 == null ? "" : f10;
    }

    public final SharedPreferences w() {
        return Yd.a.i();
    }

    public final Gson x() {
        return Yd.a.j();
    }

    public final C5582a y(String key, int i10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences K10 = K(key);
            if (K10 != null) {
                i10 = K10.getInt(key, i10);
            }
            m147constructorimpl = Result.m147constructorimpl(Integer.valueOf(i10));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return me.b.a(m147constructorimpl);
    }

    public final String z() {
        return w().getString("jwt_access_token", null);
    }

    public a(Application application) {
        this.f450a = application;
    }
}

package Zd;

import D2.a;
import D2.c;
import android.content.Context;
import android.content.SharedPreferences;
import com.zoho.livechat.android.utils.LiveChatUtil;
import ie.b;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import ne.l;
import od.m;
import og.i;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0309a f14774f = new C0309a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final List f14775g;

    /* renamed from: h, reason: collision with root package name */
    public static final List f14776h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f14777i;

    /* renamed from: j, reason: collision with root package name */
    public static int f14778j;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14779a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f14780b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14782d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f14783e;

    /* renamed from: Zd.a$a, reason: collision with other inner class name */
    public static final class C0309a {
        public /* synthetic */ C0309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return a.f14778j;
        }

        public final boolean b() {
            return a() > 0;
        }

        public final void c() {
            d(0);
        }

        public final void d(int i10) {
            a.f14778j = i10;
        }

        public C0309a() {
        }
    }

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        f14775g = CollectionsKt.listOf((Object[]) new Triple[]{new Triple(stringCompanionObject, "livechatemail", "visitor_email"), new Triple(stringCompanionObject, "livechatphone", "visitor_phone"), new Triple(stringCompanionObject, "livechatname", "unique_visitor_name"), new Triple(stringCompanionObject, "salesiq_appkey", "salesiq_app_key"), new Triple(stringCompanionObject, "salesiq_accesskey", "salesiq_access_key"), new Triple(stringCompanionObject, "cvuid", "cvuid"), new Triple(stringCompanionObject, "fcmid", "fcm_token")});
        f14776h = CollectionsKt.listOf((Object[]) new Triple[]{new Triple(stringCompanionObject, "visitor_email", "visitor_email"), new Triple(stringCompanionObject, "visitor_phone", "visitor_phone"), new Triple(stringCompanionObject, "unique_visitor_name", "unique_visitor_name"), new Triple(stringCompanionObject, "salesiq_app_key", "salesiq_app_key"), new Triple(stringCompanionObject, "salesiq_access_key", "salesiq_access_key"), new Triple(stringCompanionObject, "cvuid", "cvuid"), new Triple(stringCompanionObject, "fcm_token", "fcm_token")});
        f14777i = CollectionsKt.listOf(new Triple(stringCompanionObject, "fcmid", "fcm_token"));
    }

    public a(Context application, SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f14779a = application;
        this.f14780b = sharedPreferences;
        this.f14781c = 3;
        this.f14782d = i.k(sharedPreferences != null ? Integer.valueOf(sharedPreferences.getInt("encrypted_data_version", 0)) : null);
        this.f14783e = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("are_new_encrypted_keys_present_in_default_preferences", false)) : null;
    }

    public static final boolean g() {
        return f14774f.b();
    }

    public static final void k() {
        f14774f.c();
    }

    public final SharedPreferences c() {
        Object m147constructorimpl;
        c h10 = h();
        try {
            Result.Companion companion = Result.INSTANCE;
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- creating instance");
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (this.f14779a.getResources().getBoolean(m.f59915b)) {
            throw new IOException("EncryptedSharedPreferences creation forced to fail");
        }
        SharedPreferences a10 = D2.a.a(this.f14779a, "siq_encrypted_shared_preference_entries", h10, a.c.AES256_SIV, a.d.AES256_GCM);
        LiveChatUtil.log("MobilistenEncryptedSharedPreferences- created successfully");
        m147constructorimpl = Result.m147constructorimpl(a10);
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- creation failed");
            l.f(new b.d(ExceptionsKt.stackTraceToString(m150exceptionOrNullimpl)));
        }
        ResultKt.throwOnFailure(m147constructorimpl);
        Intrinsics.checkNotNullExpressionValue(m147constructorimpl, "getOrThrow(...)");
        return (SharedPreferences) m147constructorimpl;
    }

    public final SharedPreferences d() {
        Object m147constructorimpl;
        if (this.f14779a.getResources().getBoolean(m.f59914a) || f14778j >= 3) {
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- failed after 3 attempts or disabled ---> (failure count: " + f14778j + ", isEncryptedPreferencesDisabled: " + this.f14779a.getResources().getBoolean(m.f59914a) + ')');
            if (i()) {
                f14778j = 0;
            } else {
                f14778j++;
            }
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- try creating encrypted shared preferences, stacktrace: " + ExceptionsKt.stackTraceToString(new Throwable()));
            m147constructorimpl = Result.m147constructorimpl(c());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m150exceptionOrNullimpl(m147constructorimpl) != null) {
            f14778j++;
            e();
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- failed creating encrypted shared preferences, current failure count: " + f14778j);
        }
        SharedPreferences sharedPreferences = (SharedPreferences) (Result.m153isFailureimpl(m147constructorimpl) ? null : m147constructorimpl);
        return sharedPreferences == null ? d() : sharedPreferences;
    }

    public final void e() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(Boolean.valueOf(this.f14779a.deleteSharedPreferences("siq_encrypted_shared_preference_entries")));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            l.f(new b.e(ExceptionsKt.stackTraceToString(m150exceptionOrNullimpl)));
        }
    }

    public final SharedPreferences f() {
        Object m147constructorimpl;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putInt;
        SharedPreferences d10 = d();
        if (d10 == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int i10 = this.f14782d;
            int i11 = this.f14781c;
            if (i10 != i11 && i10 <= i11) {
                while (true) {
                    SharedPreferences.Editor edit2 = d10.edit();
                    if (edit2 != null) {
                        Intrinsics.checkNotNull(edit2);
                        if (i10 != 0) {
                            if (i10 == 3) {
                                j(edit2, d10, f14777i);
                                LiveChatUtil.log("MobilistenEncryptedSharedPreferences- Migrated from 2 to 3");
                            }
                        } else if (Intrinsics.areEqual(this.f14783e, Boolean.TRUE)) {
                            j(edit2, this.f14780b, f14776h);
                            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- Migrated from 0 to 1(new keys)");
                        } else {
                            j(edit2, this.f14780b, f14775g);
                            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- Migrated from 0 to 1(old keys)");
                        }
                    }
                    SharedPreferences sharedPreferences = this.f14780b;
                    if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putInt = edit.putInt("encrypted_data_version", i10)) != null) {
                        if (i10 == this.f14781c) {
                            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- Migrated to current latest version");
                            putInt.remove("are_new_encrypted_keys_present_in_default_preferences");
                            if (!this.f14779a.getResources().getBoolean(m.f59914a)) {
                                LiveChatUtil.log("MobilistenEncryptedSharedPreferences- Removing acknowledgement of encrypted shared preference failure");
                                putInt.remove("is_encrypted_shared_preference_failure_acknowledged");
                            }
                        }
                        putInt.apply();
                    }
                    if (i10 == i11) {
                        break;
                    }
                    i10++;
                }
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
        return d10;
    }

    public final c h() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- creating mastery key");
            c a10 = new c.a(this.f14779a, "_app_lock_preference_master_key_").b(c.b.AES256_GCM).a();
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- master key created successfully");
            m147constructorimpl = Result.m147constructorimpl(a10);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log("MobilistenEncryptedSharedPreferences- master key creation failed");
            l.f(new b.f(ExceptionsKt.stackTraceToString(m150exceptionOrNullimpl)));
        }
        ResultKt.throwOnFailure(m147constructorimpl);
        Intrinsics.checkNotNullExpressionValue(m147constructorimpl, "getOrThrow(...)");
        return (c) m147constructorimpl;
    }

    public final boolean i() {
        SharedPreferences sharedPreferences = this.f14780b;
        return sharedPreferences != null && sharedPreferences.getBoolean("is_encrypted_shared_preference_failure_acknowledged", false);
    }

    public final void j(SharedPreferences.Editor editor, SharedPreferences sharedPreferences, List list) {
        SharedPreferences.Editor remove;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Triple triple = (Triple) it.next();
            if (sharedPreferences != null) {
                if (sharedPreferences.contains((String) triple.getSecond())) {
                    Object first = triple.getFirst();
                    if (first instanceof StringCompanionObject ? true : first instanceof String) {
                        editor.putString((String) triple.getThird(), sharedPreferences.getString((String) triple.getSecond(), null)).apply();
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (edit != null && (remove = edit.remove((String) triple.getSecond())) != null) {
                        remove.apply();
                    }
                }
            }
        }
    }
}

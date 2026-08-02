package Be;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.gson.h;
import com.zoho.livechat.android.modules.conversations.data.local.entities.SalesIQConversationAttributes;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.C5582a;
import od.y;
import og.AbstractC5896h;
import ze.C6959a;

/* loaded from: classes4.dex */
public final class a implements Fe.a {

    /* renamed from: c, reason: collision with root package name */
    public static a f867c;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f869a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0020a f866b = new C0020a(null);

    /* renamed from: d, reason: collision with root package name */
    public static Object f868d = new Object();

    /* renamed from: Be.a$a, reason: collision with other inner class name */
    public static final class C0020a {
        public /* synthetic */ C0020a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Application application) {
            a aVar;
            Intrinsics.checkNotNullParameter(application, "application");
            synchronized (a.f868d) {
                aVar = a.f867c;
                if (aVar == null) {
                    aVar = new a(application, null);
                    a.f867c = aVar;
                }
            }
            return aVar;
        }

        public C0020a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Application f870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Application application) {
            super(0);
            this.f870d = application;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(this.f870d);
        }
    }

    public /* synthetic */ a(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    public static final SharedPreferences.Editor v(SharedPreferences.Editor editor, De.a aVar, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(Ce.a.a(aVar), ((Boolean) obj).booleanValue());
            return editor;
        }
        if (obj instanceof Integer) {
            editor.putInt(Ce.a.a(aVar), ((Number) obj).intValue());
            return editor;
        }
        if (obj instanceof Long) {
            editor.putLong(Ce.a.a(aVar), ((Number) obj).longValue());
            return editor;
        }
        if (obj instanceof String) {
            editor.putString(Ce.a.a(aVar), (String) obj);
            return editor;
        }
        if (obj instanceof Float) {
            editor.putFloat(Ce.a.a(aVar), ((Number) obj).floatValue());
            return editor;
        }
        if (obj instanceof Set) {
            editor.putStringSet(Ce.a.a(aVar), (Set) obj);
        }
        return editor;
    }

    public C5582a A(De.a preferenceKey, Set set) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return x().P(preferenceKey, set);
    }

    public final C5582a B(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return x().m0(Ce.a.a(preferenceKey));
    }

    @Override // Fe.a
    public C5582a d() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(x().r());
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

    @Override // Fe.a
    public C5582a e() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(w().w());
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

    @Override // Fe.a
    public C5582a f() {
        return x().d();
    }

    @Override // Fe.a
    public C5582a g(Map preferencesMap, boolean z10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        try {
            Result.Companion companion = Result.INSTANCE;
            SharedPreferences.Editor editor = null;
            SharedPreferences.Editor editor2 = null;
            for (Map.Entry entry : preferencesMap.entrySet()) {
                De.a aVar = (De.a) entry.getKey();
                Object value = entry.getValue();
                if (x().a0(Ce.a.a(aVar))) {
                    if (editor2 == null) {
                        editor2 = x().w().edit();
                    }
                    editor2 = editor2 != null ? v(editor2, aVar, value) : null;
                } else {
                    if (editor == null) {
                        SharedPreferences L10 = x().L();
                        editor = L10 != null ? L10.edit() : null;
                    }
                    editor = editor != null ? v(editor, aVar, value) : null;
                }
            }
            if (editor != null) {
                if (z10) {
                    editor.commit();
                } else {
                    editor.apply();
                }
            }
            if (editor2 != null) {
                if (z10) {
                    editor2.commit();
                } else {
                    editor2.apply();
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
        return me.b.a(m147constructorimpl);
    }

    @Override // Fe.a
    public C5582a h(String id2, Pe.b conversationAttributes) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(conversationAttributes, "conversationAttributes");
        try {
            Result.Companion companion = Result.INSTANCE;
            synchronized (f868d) {
                w().q().put(id2, Le.b.a(conversationAttributes));
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

    @Override // Fe.a
    public C5582a i(y yVar) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            w().R(yVar);
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

    @Override // Fe.a
    public C5582a j(String str) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            w().I(str);
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

    @Override // Fe.a
    public C5582a k() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(C6959a.f68673u.c());
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

    @Override // Fe.a
    public C5582a l() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            SalesIQConversationAttributes p10 = w().p();
            m147constructorimpl = Result.m147constructorimpl(p10 != null ? Le.a.a(p10) : null);
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

    @Override // Fe.a
    public C5582a m(De.a preferenceKey) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return x().e(Ce.a.a(preferenceKey));
    }

    @Override // Fe.a
    public C5582a n(Pe.b bVar) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            synchronized (f868d) {
                try {
                    w().K(bVar != null ? Le.b.a(bVar) : null);
                } finally {
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
        return me.b.a(m147constructorimpl);
    }

    @Override // Fe.a
    public C5582a o(De.a preferenceKey, boolean z10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return x().l(Ce.a.a(preferenceKey), z10);
    }

    @Override // Fe.a
    public C5582a p() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(w().o());
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

    @Override // Fe.a
    public C5582a q() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Set<Map.Entry> q10 = w().y().q();
            Intrinsics.checkNotNullExpressionValue(q10, "entrySet(...)");
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : q10) {
                Pair pair = TuplesKt.to(entry.getKey(), AbstractC5896h.f((h) entry.getValue()));
                hashMap.put(pair.getFirst(), pair.getSecond());
            }
            m147constructorimpl = Result.m147constructorimpl(hashMap);
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

    @Override // Fe.a
    public C5582a r(De.b bVar) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C6959a.f68673u.d(bVar);
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

    @Override // Fe.a
    public C5582a s(String id2) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(id2, "id");
        try {
            Result.Companion companion = Result.INSTANCE;
            SalesIQConversationAttributes salesIQConversationAttributes = (SalesIQConversationAttributes) w().q().get(id2);
            m147constructorimpl = Result.m147constructorimpl(salesIQConversationAttributes != null ? Le.a.a(salesIQConversationAttributes) : null);
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

    @Override // Fe.a
    public C5582a t(Long l10) {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            w().J(l10);
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

    @Override // Fe.a
    public C5582a u(String key, String value) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            w().y().p(key, value);
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

    public final C6959a w() {
        return C6959a.f68673u.b();
    }

    public final Ae.a x() {
        return (Ae.a) this.f869a.getValue();
    }

    public C5582a y(De.a preferenceKey, long j10) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return x().B(Ce.a.a(preferenceKey), j10);
    }

    public C5582a z(De.a preferenceKey, String str) {
        Intrinsics.checkNotNullParameter(preferenceKey, "preferenceKey");
        return x().M(preferenceKey, str);
    }

    public a(Application application) {
        this.f869a = LazyKt.lazy(new b(application));
    }
}

package com.vk.companion.core;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.SystemClock;
import com.vk.bridges.CompanionApp;
import com.vk.companion.core.CompanionAppImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.b;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.subjects.d;
import io.reactivex.rxjava3.subjects.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.json.JSONArray;
import xsna.apf;
import xsna.asu0;
import xsna.bh10;
import xsna.bpn0;
import xsna.e43;
import xsna.epx;
import xsna.f18;
import xsna.fpf0;
import xsna.go9;
import xsna.hn70;
import xsna.ho8;
import xsna.izs;
import xsna.l6i;
import xsna.o25;
import xsna.p5j;
import xsna.pqm0;
import xsna.qcy;
import xsna.qoy;
import xsna.ro;
import xsna.s3q0;
import xsna.tw8;
import xsna.uqw;
import xsna.vqw;
import xsna.wh;
import xsna.yfb;
import xsna.zr;

/* compiled from: CompanionAppImpl.kt */
/* loaded from: classes.dex */
public final class CompanionAppImpl implements CompanionApp {
    public static final /* synthetic */ qcy<Object>[] j = {new MutablePropertyReference1Impl(CompanionAppImpl.class, "isCompanionHasSameLogin", "isCompanionHasSameLogin()Z", 0), p5j.a(0, CompanionAppImpl.class, "notificationsEnabled", "getNotificationsEnabled()Z", fpf0.a), new MutablePropertyReference1Impl(CompanionAppImpl.class, "companionAuthorizedUsers", "getCompanionAuthorizedUsers()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(CompanionAppImpl.class, "companionActiveLogin", "getCompanionActiveLogin()J", 0), new MutablePropertyReference1Impl(CompanionAppImpl.class, "companionInAppMsgPushSettings", "getCompanionInAppMsgPushSettings()Ljava/lang/String;", 0)};
    public final String a;
    public final f18 b;
    public final f18 c;
    public final pqm0 d;
    public final hn70 e;
    public final tw8 f;
    public final bpn0 g;
    public final d<CompanionApp.State> h;
    public volatile long i;

    /* compiled from: CompanionAppImpl.kt */
    /* loaded from: classes17.dex */
    public static final class DeadCompanionContentProvider extends Exception {
        public DeadCompanionContentProvider(String str, DeadObjectException deadObjectException) {
            super(str, deadObjectException);
        }
    }

    /* compiled from: CompanionAppImpl.kt */
    public static final class a {
        public final LinkedHashSet a;
        public final boolean b;
        public final long c;
        public final boolean d;
        public final String e;

        public a(LinkedHashSet linkedHashSet, boolean z, long j, boolean z2, String str) {
            this.a = linkedHashSet;
            this.b = z;
            this.c = j;
            this.d = z2;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(bh10.a(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CompanionAnswer(authorizedUsers=");
            sb.append(this.a);
            sb.append(", hasSameLogin=");
            sb.append(this.b);
            sb.append(", activeLogin=");
            sb.append(this.c);
            sb.append(", notificationsEnabled=");
            sb.append(this.d);
            sb.append(", rawInAppMsgPushSettings=");
            return ho8.a(sb, this.e, ')');
        }
    }

    public CompanionAppImpl(String str) {
        this.a = str;
        new bpn0(new wh(this, 1));
        this.b = new f18("CompanionApp", "CompanionApp.redirect".concat(str), false);
        this.c = new f18("CompanionApp", "companion_notifications_enabled".concat(str), true);
        this.d = new pqm0("CompanionApp", "companion_authorized_users".concat(str));
        this.e = new hn70("CompanionApp", "companion_active_login".concat(str));
        this.f = new tw8("CompanionApp", "companion_in_app_msg_push_settings".concat(str));
        this.g = new bpn0(new apf(this, 1));
        this.h = d.O0(CompanionApp.State.UNDEFINED);
    }

    public final void a() {
        long j2 = this.i;
        if (j2 == 0 || SystemClock.elapsedRealtime() - j2 > 5000) {
            synchronized (this) {
                long j3 = this.i;
                if (j3 == 0 || SystemClock.elapsedRealtime() - j3 > 5000) {
                    k();
                    ((j) this.g.getValue()).onNext(Boolean.valueOf(j()));
                    this.i = SystemClock.elapsedRealtime();
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
    }

    @Override // com.vk.bridges.CompanionApp
    public final q<CompanionApp.State> b() {
        d<CompanionApp.State> dVar = this.h;
        dVar.getClass();
        return new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, b.a).a0(asu0.a.d());
    }

    @Override // com.vk.bridges.CompanionApp
    public final boolean c(boolean z) {
        if (z) {
            a();
        }
        qcy<Object> qcyVar = j[1];
        return this.c.a().booleanValue();
    }

    @Override // com.vk.bridges.CompanionApp
    public final void d() {
        asu0.a.getClass();
        asu0.l().submit(new l6i(this, 0));
    }

    @Override // com.vk.bridges.CompanionApp
    public final boolean e() {
        Object obj;
        a();
        try {
            obj = ((j) this.g.getValue()).a();
        } catch (Throwable unused) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        return bool != null ? bool.booleanValue() : j();
    }

    @Override // com.vk.bridges.CompanionApp
    public final boolean f(UserId userId) {
        qcy<Object> qcyVar = j[2];
        pqm0 pqm0Var = this.d;
        String str = (String) pqm0Var.b;
        String str2 = (String) pqm0Var.c;
        Preference preference = Preference.a;
        Set u = Preference.u(EmptySet.b, str, str2);
        if ((u instanceof Collection) && u.isEmpty()) {
            return false;
        }
        Iterator it = u.iterator();
        while (it.hasNext()) {
            if (Long.parseLong((String) it.next()) == userId.b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vk.bridges.CompanionApp
    public final boolean g(UserId userId) {
        Object obj;
        qcy<Object> qcyVar = j[4];
        Iterator it = vqw.a(this.f.b()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((uqw) obj).a(), userId)) {
                break;
            }
        }
        uqw uqwVar = (uqw) obj;
        if (uqwVar != null) {
            return uqwVar.c();
        }
        return true;
    }

    @Override // com.vk.bridges.CompanionApp
    public final String getPackageName() {
        return this.a;
    }

    @Override // com.vk.bridges.CompanionApp
    public final boolean h(UserId userId) {
        Object obj;
        qcy<Object> qcyVar = j[4];
        Iterator it = vqw.a(this.f.b()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((uqw) obj).a(), userId)) {
                break;
            }
        }
        uqw uqwVar = (uqw) obj;
        if (uqwVar != null) {
            return uqwVar.b();
        }
        return true;
    }

    @Override // com.vk.bridges.CompanionApp
    public final boolean i(UserId userId) {
        a();
        long j2 = userId.b;
        if (j2 == UserId.d.b) {
            return false;
        }
        qcy<Object> qcyVar = j[3];
        return j2 == this.e.a().longValue();
    }

    public final boolean j() {
        qcy<Object> qcyVar = j[0];
        return this.b.a().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        Object obj;
        String str;
        Uri parse;
        ContentProviderClient acquireUnstableContentProviderClient;
        final long j2 = o25.a().c().b;
        String[] strArr = ro.a;
        String concat = this.a.concat(".providers.account.info");
        izs izsVar = new izs() { // from class: xsna.m6i
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                JSONArray jSONArray;
                Map map;
                CompanionAppImpl companionAppImpl = this;
                Cursor cursor = (Cursor) obj2;
                if (!cursor.moveToFirst()) {
                    return null;
                }
                try {
                    CompanionApp.State.a aVar = CompanionApp.State.Companion;
                    String E = fl3.E(cursor, "app_state");
                    aVar.getClass();
                    map = CompanionApp.State.byAction;
                    CompanionApp.State state = (CompanionApp.State) map.get(E);
                    if (state != null) {
                        companionAppImpl.h.onNext(state);
                        s3q0 s3q0Var = s3q0.a;
                    }
                } catch (Throwable unused) {
                }
                String F = fl3.F(cursor, "authorized_user_ids");
                String str2 = k6i.a;
                if (F == null || drm0.N(F)) {
                    F = null;
                }
                try {
                    jSONArray = new JSONArray(F);
                } catch (Throwable unused2) {
                    jSONArray = null;
                }
                Collection L = jSONArray != null ? f370.L(jSONArray) : null;
                if (L == null) {
                    L = EmptyList.b;
                }
                Collection collection = L;
                long C = fl3.C(cursor, "user_id");
                Boolean y = fl3.y(cursor, "notifications_enabled");
                String F2 = fl3.F(cursor, "in_app_notifications");
                if (F2 == null) {
                    F2 = "";
                }
                String str3 = F2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(String.valueOf(((Number) it.next()).longValue()));
                }
                long j3 = j2;
                return new CompanionAppImpl.a(linkedHashSet, C == j3 && j3 != UserId.d.b, C, y != null ? y.booleanValue() : true, str3);
            }
        };
        String a2 = zr.a("content://", concat, "/state");
        try {
            parse = Uri.parse(a2);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(parse);
        } catch (DeadObjectException e) {
            com.vk.metrics.eventtracking.b.a.a(new DeadCompanionContentProvider(go9.b("provider is dead for path=", a2), e));
        } catch (Exception unused) {
        }
        if (acquireUnstableContentProviderClient != null) {
            try {
                Cursor query = acquireUnstableContentProviderClient.query(parse, strArr, null, null, null);
                if (query != null) {
                    try {
                        obj = izsVar.invoke(query);
                        query.close();
                    } finally {
                    }
                } else {
                    obj = null;
                }
                yfb.d(acquireUnstableContentProviderClient, null);
                a aVar = (a) obj;
                Set set = aVar == null ? aVar.a : EmptySet.b;
                qcy<Object>[] qcyVarArr = j;
                qcy<Object> qcyVar = qcyVarArr[2];
                pqm0 pqm0Var = this.d;
                Preference.K(set, (String) pqm0Var.b, (String) pqm0Var.c);
                boolean z = aVar == null ? aVar.b : false;
                qcy<Object> qcyVar2 = qcyVarArr[0];
                this.b.b(z);
                long j3 = aVar == null ? aVar.c : UserId.d.b;
                qcy<Object> qcyVar3 = qcyVarArr[3];
                this.e.b(j3);
                boolean z2 = aVar == null ? aVar.d : true;
                qcy<Object> qcyVar4 = qcyVarArr[1];
                this.c.b(z2);
                str = aVar != null ? aVar.e : null;
                if (str == null) {
                    str = "";
                }
                qcy<Object> qcyVar5 = qcyVarArr[4];
                this.f.g(str);
                j();
            } finally {
            }
        }
        obj = null;
        a aVar2 = (a) obj;
        if (aVar2 == null) {
        }
        qcy<Object>[] qcyVarArr2 = j;
        qcy<Object> qcyVar6 = qcyVarArr2[2];
        pqm0 pqm0Var2 = this.d;
        Preference.K(set, (String) pqm0Var2.b, (String) pqm0Var2.c);
        if (aVar2 == null) {
        }
        qcy<Object> qcyVar22 = qcyVarArr2[0];
        this.b.b(z);
        if (aVar2 == null) {
        }
        qcy<Object> qcyVar32 = qcyVarArr2[3];
        this.e.b(j3);
        if (aVar2 == null) {
        }
        qcy<Object> qcyVar42 = qcyVarArr2[1];
        this.c.b(z2);
        if (aVar2 != null) {
        }
        if (str == null) {
        }
        qcy<Object> qcyVar52 = qcyVarArr2[4];
        this.f.g(str);
        j();
    }
}

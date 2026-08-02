package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import ca.C2901a;
import com.google.android.gms.common.api.C3117a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import z.C6901b;

/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3180d {

    /* renamed from: a, reason: collision with root package name */
    public final Account f32685a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f32686b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f32687c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f32688d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32689e;

    /* renamed from: f, reason: collision with root package name */
    public final View f32690f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32691g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32692h;

    /* renamed from: i, reason: collision with root package name */
    public final C2901a f32693i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f32694j;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public Account f32695a;

        /* renamed from: b, reason: collision with root package name */
        public C6901b f32696b;

        /* renamed from: c, reason: collision with root package name */
        public String f32697c;

        /* renamed from: d, reason: collision with root package name */
        public String f32698d;

        /* renamed from: e, reason: collision with root package name */
        public final C2901a f32699e = C2901a.f27626j;

        public C3180d a() {
            return new C3180d(this.f32695a, this.f32696b, null, 0, null, this.f32697c, this.f32698d, this.f32699e, false);
        }

        public a b(String str) {
            this.f32697c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f32696b == null) {
                this.f32696b = new C6901b();
            }
            this.f32696b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f32695a = account;
            return this;
        }

        public final a e(String str) {
            this.f32698d = str;
            return this;
        }
    }

    public C3180d(Account account, Set set, Map map, int i10, View view, String str, String str2, C2901a c2901a, boolean z10) {
        this.f32685a = account;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f32686b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f32688d = map;
        this.f32690f = view;
        this.f32689e = i10;
        this.f32691g = str;
        this.f32692h = str2;
        this.f32693i = c2901a == null ? C2901a.f27626j : c2901a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f32687c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f32685a;
    }

    public String b() {
        Account account = this.f32685a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f32685a;
        return account != null ? account : new Account(AbstractC3179c.DEFAULT_ACCOUNT, "com.google");
    }

    public Set d() {
        return this.f32687c;
    }

    public Set e(C3117a c3117a) {
        android.support.v4.media.session.b.a(this.f32688d.get(c3117a));
        return this.f32686b;
    }

    public String f() {
        return this.f32691g;
    }

    public Set g() {
        return this.f32686b;
    }

    public final C2901a h() {
        return this.f32693i;
    }

    public final Integer i() {
        return this.f32694j;
    }

    public final String j() {
        return this.f32692h;
    }

    public final Map k() {
        return this.f32688d;
    }

    public final void l(Integer num) {
        this.f32694j = num;
    }
}

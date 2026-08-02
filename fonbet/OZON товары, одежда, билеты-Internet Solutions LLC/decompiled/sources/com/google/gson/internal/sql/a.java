package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.t;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f60009a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f60010b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a<? extends Date> f60011c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f60012d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f60013e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f60014f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    final class C0913a extends DefaultDateTypeAdapter.a<java.sql.Date> {
        C0913a() {
            super(java.sql.Date.class);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        protected final java.sql.Date b(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    final class b extends DefaultDateTypeAdapter.a<Timestamp> {
        b() {
            super(Timestamp.class);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        protected final Timestamp b(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z11;
        try {
            Class.forName("java.sql.Date");
            z11 = true;
        } catch (ClassNotFoundException unused) {
            z11 = false;
        }
        f60009a = z11;
        if (z11) {
            f60010b = new C0913a();
            f60011c = new b();
            f60012d = SqlDateTypeAdapter.f60003b;
            f60013e = SqlTimeTypeAdapter.f60005b;
            f60014f = SqlTimestampTypeAdapter.f60007b;
            return;
        }
        f60010b = null;
        f60011c = null;
        f60012d = null;
        f60013e = null;
        f60014f = null;
    }
}

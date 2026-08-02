package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.v;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f38322a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b f38323b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.b f38324c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f38325d;

    /* renamed from: e, reason: collision with root package name */
    public static final v f38326e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f38327f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    public class C0534a extends DefaultDateTypeAdapter.b {
        public C0534a(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class b extends DefaultDateTypeAdapter.b {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f38322a = z10;
        if (z10) {
            f38323b = new C0534a(Date.class);
            f38324c = new b(Timestamp.class);
            f38325d = SqlDateTypeAdapter.f38316b;
            f38326e = SqlTimeTypeAdapter.f38318b;
            f38327f = SqlTimestampTypeAdapter.f38320b;
            return;
        }
        f38323b = null;
        f38324c = null;
        f38325d = null;
        f38326e = null;
        f38327f = null;
    }
}

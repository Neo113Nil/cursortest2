package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Date;
import java.sql.Timestamp;
import xsna.rtp0;

/* compiled from: SqlTypesSupport.java */
/* loaded from: classes.dex */
public final class a {
    public static final boolean a;
    public static final C0148a b;
    public static final b c;
    public static final rtp0 d;
    public static final rtp0 e;
    public static final rtp0 f;

    /* compiled from: SqlTypesSupport.java */
    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    public class C0148a extends DefaultDateTypeAdapter.a<Date> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        public final Date c(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* compiled from: SqlTypesSupport.java */
    public class b extends DefaultDateTypeAdapter.a<Timestamp> {
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        public final Timestamp c(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new C0148a(Date.class);
            c = new b(Timestamp.class);
            d = SqlDateTypeAdapter.b;
            e = SqlTimeTypeAdapter.b;
            f = SqlTimestampTypeAdapter.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}

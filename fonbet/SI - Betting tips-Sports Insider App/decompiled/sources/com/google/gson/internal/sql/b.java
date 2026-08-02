package com.google.gson.internal.sql;

import com.google.gson.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f6357a;

    /* renamed from: b, reason: collision with root package name */
    public static final y f6358b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f6359c;

    /* renamed from: d, reason: collision with root package name */
    public static final y f6360d;

    static {
        boolean z5;
        try {
            Class.forName("java.sql.Date");
            z5 = true;
        } catch (ClassNotFoundException unused) {
            z5 = false;
        }
        f6357a = z5;
        if (z5) {
            f6358b = SqlDateTypeAdapter.f6351b;
            f6359c = SqlTimeTypeAdapter.f6353b;
            f6360d = SqlTimestampTypeAdapter.f6355b;
        } else {
            f6358b = null;
            f6359c = null;
            f6360d = null;
        }
    }
}

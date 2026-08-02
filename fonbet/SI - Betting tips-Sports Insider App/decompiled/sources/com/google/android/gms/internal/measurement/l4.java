package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l4 {

    /* renamed from: g, reason: collision with root package name */
    public static final Object f5117g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static volatile b4 f5118h;

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f5119i;

    /* renamed from: a, reason: collision with root package name */
    public final com.android.billingclient.api.u0 f5120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5121b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5122c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f5123d = -1;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f5124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5125f;

    static {
        new AtomicReference();
        f5119i = new AtomicInteger();
    }

    public /* synthetic */ l4(com.android.billingclient.api.u0 u0Var, String str, Object obj, int i5) {
        this.f5125f = i5;
        if (((Uri) u0Var.f4107b) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f5120a = u0Var;
        this.f5121b = str;
        this.f5122c = obj;
    }

    public final Object a(Object obj) {
        switch (this.f5125f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    String obj2 = obj.toString();
                    String str = this.f5121b;
                    io.sentry.android.core.w0.d("PhenotypeFlag", d9.e.n(new StringBuilder(str.length() + 25 + obj2.length()), "Invalid long value for ", str, ": ", obj2));
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!x3.f5351b.matcher(str2).matches()) {
                            if (x3.f5352c.matcher(str2).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    String obj3 = obj.toString();
                    String str3 = this.f5121b;
                    io.sentry.android.core.w0.d("PhenotypeFlag", d9.e.n(new StringBuilder(str3.length() + 28 + obj3.length()), "Invalid boolean value for ", str3, ": ", obj3));
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        String obj4 = obj.toString();
                        String str4 = this.f5121b;
                        io.sentry.android.core.w0.d("PhenotypeFlag", d9.e.n(new StringBuilder(str4.length() + 27 + obj4.length()), "Invalid double value for ", str4, ": ", obj4));
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:16:0x0048, B:21:0x0062, B:23:0x006a, B:25:0x0072, B:27:0x0082, B:29:0x0090, B:32:0x00b5, B:35:0x00bd, B:36:0x00c0, B:37:0x00c4, B:38:0x0099, B:40:0x009d, B:42:0x00ab, B:44:0x00b1, B:48:0x00c9, B:49:0x00cb, B:51:0x00cc, B:52:0x00d1, B:54:0x0041, B:56:0x00d2), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String str;
        Object obj;
        String e7;
        s.n nVar;
        int i5 = f5119i.get();
        if (this.f5123d < i5) {
            synchronized (this) {
                try {
                    if (this.f5123d < i5) {
                        b4 b4Var = f5118h;
                        e8.b bVar = e8.a.f8772a;
                        Object obj2 = null;
                        if (b4Var != null) {
                            bVar = (e8.b) b4Var.f4931b.get();
                            if (bVar.b()) {
                                e4 e4Var = (e4) bVar.a();
                                Uri uri = (Uri) this.f5120a.f4107b;
                                String str2 = this.f5121b;
                                if (uri != null) {
                                    nVar = (s.n) e4Var.f5027a.get(uri.toString());
                                } else {
                                    e4Var.getClass();
                                    nVar = null;
                                }
                                if (nVar != null) {
                                    str = (String) nVar.get("".concat(str2));
                                    if (b4Var == null) {
                                        throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                                    }
                                    com.android.billingclient.api.u0 u0Var = this.f5120a;
                                    Uri uri2 = (Uri) u0Var.f4107b;
                                    if (uri2 == null) {
                                        Context context = b4Var.f4930a;
                                        throw null;
                                    }
                                    d4 a7 = j4.a(b4Var.f4930a, uri2) ? d4.a(b4Var.f4930a.getContentResolver(), uri2, m4.f5139a) : null;
                                    if (a7 != null) {
                                        String str3 = (String) a7.b().get(this.f5121b);
                                        if (str3 != null) {
                                            obj = a(str3);
                                            if (obj == null) {
                                                if (!u0Var.f4106a && (e7 = g4.b(b4Var.f4930a).e(this.f5121b)) != null) {
                                                    obj2 = a(e7);
                                                }
                                                obj = obj2 == null ? this.f5122c : obj2;
                                            }
                                            if (bVar.b()) {
                                                obj = str == null ? this.f5122c : a(str);
                                            }
                                            this.f5124e = obj;
                                            this.f5123d = i5;
                                        }
                                    }
                                    obj = null;
                                    if (obj == null) {
                                    }
                                    if (bVar.b()) {
                                    }
                                    this.f5124e = obj;
                                    this.f5123d = i5;
                                }
                            }
                        }
                        str = null;
                        if (b4Var == null) {
                        }
                    }
                } finally {
                }
            }
        }
        return this.f5124e;
    }
}

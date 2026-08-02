package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u5 implements e8.d, y5 {

    /* renamed from: b, reason: collision with root package name */
    public static final e5 f5266b = new e5(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5267a;

    public /* synthetic */ u5(Object obj) {
        this.f5267a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public boolean a(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (((y5[]) this.f5267a)[i5].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public g6 b(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            y5 y5Var = ((y5[]) this.f5267a)[i5];
            if (y5Var.a(cls)) {
                return y5Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public Object c() {
        d4 d4Var = (d4) this.f5267a;
        ContentResolver contentResolver = d4Var.f4963a;
        Uri uri = d4Var.f4964b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient == null) {
                io.sentry.android.core.w0.m("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, d4.j, null, null, null);
            try {
                if (query == null) {
                    io.sentry.android.core.w0.m("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                Map eVar = count <= 256 ? new s.e(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    eVar.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    return eVar;
                }
                io.sentry.android.core.w0.m("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                Map map2 = Collections.EMPTY_MAP;
                query.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e7) {
            io.sentry.android.core.w0.n("ConfigurationContentLdr", "ContentProvider query failed, using default values", e7);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public void d(int i5, Object obj, h6 h6Var) {
        q4 q4Var = (q4) obj;
        x4 x4Var = (x4) this.f5267a;
        x4Var.V((i5 << 3) | 2);
        x4Var.V(q4Var.b(h6Var));
        h6Var.e(q4Var, x4Var.f5355b);
    }

    public void e(int i5, Object obj, h6 h6Var) {
        x4 x4Var = (x4) this.f5267a;
        x4Var.M(i5, 3);
        h6Var.e((q4) obj, x4Var.f5355b);
        x4Var.M(i5, 4);
    }

    @Override // e8.d
    public /* synthetic */ Object get() {
        Object obj = l4.f5117g;
        return h4.l((Context) this.f5267a);
    }

    public u5(int i5) {
        switch (i5) {
            case 1:
                this.f5267a = new HashMap();
                break;
            default:
                e6 e6Var = e6.f5030c;
                u5 u5Var = new u5(new y5[]{e5.f5028b, f5266b});
                Charset charset = n5.f5148a;
                this.f5267a = u5Var;
                break;
        }
    }

    public u5(x4 x4Var) {
        Charset charset = n5.f5148a;
        this.f5267a = x4Var;
        x4Var.f5355b = this;
    }
}

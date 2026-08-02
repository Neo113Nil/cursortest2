package W9;

import X9.o;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13160a = "d";

    /* renamed from: b, reason: collision with root package name */
    public static boolean f13161b = false;

    /* renamed from: c, reason: collision with root package name */
    public static a f13162c = a.LEGACY;

    public enum a {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        int b10;
        synchronized (d.class) {
            b10 = b(context, null, null);
        }
        return b10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|12|13|14|15|16|(8:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29))|34|22|23|(0)|26|27|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        android.util.Log.e(W9.d.f13160a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049 A[Catch: all -> 0x001e, RemoteException -> 0x004e, TryCatch #1 {RemoteException -> 0x004e, blocks: (B:23:0x0043, B:25:0x0049, B:26:0x0050), top: B:22:0x0043, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:7:0x0018, B:12:0x0020, B:14:0x0024, B:16:0x0033, B:18:0x0038, B:23:0x0043, B:25:0x0049, B:26:0x0050, B:27:0x005f, B:29:0x006c, B:33:0x0058, B:37:0x0074, B:38:0x0079, B:41:0x007b), top: B:3:0x0003, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized int b(Context context, a aVar, f fVar) {
        synchronized (d.class) {
            AbstractC3191o.n(context, "Context is null");
            "preferredRenderer: ".concat(String.valueOf(aVar));
            if (!f13161b) {
                try {
                    o a10 = X9.m.a(context, aVar);
                    try {
                        b.c(a10.zze());
                        Y9.c.a(a10.zzj());
                        int i10 = 1;
                        f13161b = true;
                        if (aVar != null) {
                            int ordinal = aVar.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    i10 = 2;
                                }
                            }
                            if (a10.zzd() == 2) {
                                f13162c = a.LATEST;
                            }
                            a10.v(N9.d.i(context), i10);
                            "loadedRenderer: ".concat(String.valueOf(f13162c));
                            if (fVar != null) {
                                fVar.a(f13162c);
                            }
                        }
                        i10 = 0;
                        if (a10.zzd() == 2) {
                        }
                        a10.v(N9.d.i(context), i10);
                        "loadedRenderer: ".concat(String.valueOf(f13162c));
                        if (fVar != null) {
                        }
                    } catch (RemoteException e10) {
                        throw new Y9.f(e10);
                    }
                } catch (C3172e e11) {
                    return e11.f32609a;
                }
            } else if (fVar != null) {
                fVar.a(f13162c);
            }
        }
        return 0;
    }
}

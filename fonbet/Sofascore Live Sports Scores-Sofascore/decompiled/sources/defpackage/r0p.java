package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.IOUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r0p {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final ng2 b;
    public final en0 c;
    public final xyo d;
    public utn e;
    public final Object f = new Object();

    public r0p(Context context, ng2 ng2Var, en0 en0Var, xyo xyoVar) {
        this.a = context;
        this.b = ng2Var;
        this.c = en0Var;
        this.d = xyoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: Exception -> 0x00ad, q0p -> 0x00b0, TryCatch #7 {q0p -> 0x00b0, Exception -> 0x00ad, blocks: (B:3:0x0004, B:29:0x006c, B:31:0x007f, B:33:0x0085, B:34:0x0087, B:40:0x009f, B:50:0x00b4, B:51:0x00b5, B:52:0x00d5, B:53:0x00d6, B:54:0x00df, B:57:0x00e1, B:58:0x00e9, B:36:0x0088, B:44:0x008c, B:38:0x009c, B:39:0x009e, B:47:0x0093, B:5:0x000a, B:7:0x0029, B:12:0x003a, B:13:0x004d, B:19:0x0044, B:20:0x0047, B:16:0x0049, B:28:0x0059, B:55:0x0053), top: B:2:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: Exception -> 0x00ad, q0p -> 0x00b0, TryCatch #7 {q0p -> 0x00b0, Exception -> 0x00ad, blocks: (B:3:0x0004, B:29:0x006c, B:31:0x007f, B:33:0x0085, B:34:0x0087, B:40:0x009f, B:50:0x00b4, B:51:0x00b5, B:52:0x00d5, B:53:0x00d6, B:54:0x00df, B:57:0x00e1, B:58:0x00e9, B:36:0x0088, B:44:0x008c, B:38:0x009c, B:39:0x009e, B:47:0x0093, B:5:0x000a, B:7:0x0029, B:12:0x003a, B:13:0x004d, B:19:0x0044, B:20:0x0047, B:16:0x0049, B:28:0x0059, B:55:0x0053), top: B:2:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0053 A[Catch: Exception -> 0x00e0, TryCatch #2 {Exception -> 0x00e0, blocks: (B:5:0x000a, B:7:0x0029, B:12:0x003a, B:13:0x004d, B:19:0x0044, B:20:0x0047, B:16:0x0049, B:28:0x0059, B:55:0x0053), top: B:4:0x000a, outer: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(p03 p03Var) {
        utn utnVar;
        Throwable th;
        FileInputStream fileInputStream;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Constructor declaredConstructor = c(p03Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
                Context context = this.a;
                byte[] bArr = (byte[]) p03Var.f;
                FileInputStream fileInputStream2 = null;
                if (bArr == null) {
                    try {
                        fileInputStream = new FileInputStream((File) p03Var.e);
                        try {
                            bArr = g8n.w(fileInputStream).x();
                            IOUtils.a(fileInputStream);
                        } catch (IOException unused) {
                            IOUtils.a(fileInputStream);
                            bArr = null;
                            p03Var.f = bArr;
                            utnVar = new utn(9, declaredConstructor.newInstance(context, "msa-r", bArr != null ? Arrays.copyOf(bArr, bArr.length) : null, null, new Bundle(), 2), p03Var, this.b, this.c, false);
                            if (utnVar.c()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream2 = fileInputStream;
                            IOUtils.a(fileInputStream2);
                            throw th;
                        }
                    } catch (IOException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    p03Var.f = bArr;
                }
                utnVar = new utn(9, declaredConstructor.newInstance(context, "msa-r", bArr != null ? Arrays.copyOf(bArr, bArr.length) : null, null, new Bundle(), 2), p03Var, this.b, this.c, false);
                if (utnVar.c()) {
                    throw new q0p(4000, "init failed");
                }
                int e = utnVar.e();
                if (e != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 4);
                    sb.append("ci: ");
                    sb.append(e);
                    throw new q0p(4001, sb.toString());
                }
                synchronized (this.f) {
                    utn utnVar2 = this.e;
                    if (utnVar2 != null) {
                        try {
                            utnVar2.d();
                        } catch (q0p e2) {
                            this.c.z(e2.a, -1L, e2);
                        }
                    }
                    this.e = utnVar;
                }
                this.c.y(IronSourceError.ERROR_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e3) {
                throw new q0p(2004, e3);
            }
        } catch (q0p e4) {
            this.c.z(e4.a, System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.c.z(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }

    public final utn b() {
        utn utnVar;
        synchronized (this.f) {
            utnVar = this.e;
        }
        return utnVar;
    }

    public final synchronized Class c(p03 p03Var) {
        try {
            String s = ((xuo) p03Var.b).s();
            HashMap hashMap = g;
            Class cls = (Class) hashMap.get(s);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.d.a((File) p03Var.c)) {
                    throw new q0p(2026, "VM did not pass signature verification");
                }
                try {
                    File file = (File) p03Var.d;
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(((File) p03Var.c).getAbsolutePath(), file.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(s, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new q0p(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new q0p(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new q0p(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new q0p(2026, e4);
            }
        } finally {
        }
    }
}

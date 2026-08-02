package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.publisher.nativead.n;
import com.moloco.sdk.internal.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.i0;
import defpackage.ad2;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.s9a;
import defpackage.z45;
import defpackage.zzl;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final com.facebook.login.i a;
    public final n b;
    public final e c;
    public final ad2 d;
    public final ConcurrentHashMap e;
    public final HashSet f;
    public final ConcurrentHashMap g;

    public j(k kVar, com.facebook.login.i iVar, n nVar, e eVar) {
        kVar.getClass();
        this.a = iVar;
        this.b = nVar;
        this.c = eVar;
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        this.d = s9a.c(hq4Var);
        this.e = new ConcurrentHashMap();
        this.f = new HashSet();
        this.g = new ConcurrentHashMap();
        s9a.c(hq4Var);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h a(String str) {
        str.getClass();
        l0 b = b();
        if (b instanceof j0) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) ((j0) b).a;
        }
        if (!(b instanceof k0)) {
            zzl.b();
            return null;
        }
        File file = new File((File) ((k0) b).a, i0.d(str));
        if (file.exists() && n.h(file)) {
            return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d(file);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) this.g.get(str);
        return cVar != null ? cVar.a : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.a);
    }

    public final l0 b() {
        l0 c = c();
        if (!(c instanceof j0)) {
            if (c instanceof k0) {
                return new k0(((k0) c).a);
            }
            zzl.b();
            return null;
        }
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb = new StringBuilder("Failed to retrieve storageDir with error code: ");
        y yVar = (y) ((j0) c).a;
        sb.append(yVar.b);
        MolocoLogger.warn$default(molocoLogger, "MediaCacheRepository", sb.toString(), null, false, 12, null);
        switch (yVar.b) {
            case 100:
                return new j0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.c));
            case 101:
                return new j0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.b));
            case 102:
                return new j0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.a));
            default:
                return new j0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e(f.d));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l0 c() {
        l0 j0Var;
        l0 j0Var2;
        File externalCacheDir;
        Context context = this.c.a;
        try {
            externalCacheDir = context.getExternalCacheDir();
        } catch (IOException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e, false, 8, null);
            j0Var = new j0(new y("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e2, false, 8, null);
            j0Var = new j0(new y("Failed to create cache directory in external storage", 100));
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e3, false, 8, null);
            j0Var = new j0(new y("Failed to create cache directory in external storage", 200));
        }
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, "com.moloco.sdk.xenoss.sdkdevkit.android.cache");
            file.mkdir();
            if (file.exists()) {
                j0Var = new k0(file);
                if (j0Var instanceof j0) {
                    if (j0Var instanceof k0) {
                        return j0Var;
                    }
                    zzl.b();
                    return null;
                }
                try {
                } catch (IOException e4) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e4, false, 8, null);
                    j0Var2 = new j0(new y("Failed to create cache directory in internal storage", 101));
                } catch (SecurityException e5) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e5, false, 8, null);
                    j0Var2 = new j0(new y("Failed to create cache directory in internal storage", 100));
                } catch (Exception e6) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", e6, false, 8, null);
                    j0Var2 = new j0(new y("Failed to create cache directory in internal storage", 200));
                }
                if (context.getCacheDir() != null) {
                    File file2 = new File(context.getCacheDir(), "com.moloco.sdk.xenoss.sdkdevkit.android.cache");
                    file2.mkdir();
                    if (file2.exists()) {
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Able to write to internal storage cache directory", false, 4, null);
                        j0Var2 = new k0(file2);
                        return j0Var2;
                    }
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in internal storage", null, false, 12, null);
                j0Var2 = new j0(new y("Failed to create cache directory in internal storage", 102));
                return j0Var2;
            }
        }
        MolocoLogger.warn$default(MolocoLogger.INSTANCE, "MediaCacheLocationProviderImpl", "Failed to create cache directory in external storage", null, false, 12, null);
        j0Var = new j0(new y("Failed to create cache directory in external storage", 102));
        if (j0Var instanceof j0) {
        }
    }
}

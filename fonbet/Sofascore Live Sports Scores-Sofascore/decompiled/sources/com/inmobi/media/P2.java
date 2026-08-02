package com.inmobi.media;

import android.content.Context;
import android.os.storage.StorageManager;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import defpackage.ao4;
import defpackage.eo4;
import defpackage.ep3;
import defpackage.fc6;
import defpackage.ghh;
import defpackage.h5b;
import defpackage.h5c;
import defpackage.h6c;
import defpackage.h9i;
import defpackage.hr4;
import defpackage.ild;
import defpackage.is8;
import defpackage.joa;
import defpackage.m08;
import defpackage.pe2;
import defpackage.t9d;
import defpackage.vcc;
import defpackage.ypa;
import defpackage.ysa;
import java.io.File;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class P2 {
    public static final joa g = ypa.a(ysa.a, new ild(22));
    public final Object a = new Object();
    public final Context b;
    public final AdConfig.VideoCacheConfig c;
    public final h5b d;
    public final h9i e;
    public volatile ghh f;

    public P2() {
        Context context = AbstractC3424fj.a;
        context.getClass();
        this.b = context;
        this.c = ((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getHybridNative().getVideoCache();
        this.e = new h9i(context);
        this.d = new h5b(a(context));
    }

    public static final P2 b() {
        return new P2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vcc a(String str, boolean z) {
        eo4 eo4Var;
        ghh ghhVar;
        str.getClass();
        h5c h5cVar = new h5c();
        h5cVar.b(str);
        h5cVar.g = str;
        h6c a = h5cVar.a();
        if (this.c.getIsEnabled() && z) {
            eo4 eo4Var2 = new eo4(this.b);
            synchronized (this.a) {
                ghhVar = this.f;
                if (ghhVar == null) {
                    ghhVar = a();
                    this.f = ghhVar;
                }
            }
            pe2 pe2Var = new pe2();
            pe2Var.a = ghhVar;
            pe2Var.f = eo4Var2;
            t9d t9dVar = new t9d();
            t9dVar.a = ghhVar;
            pe2Var.c = t9dVar;
            pe2Var.e = false;
            pe2Var.b = new m08();
            pe2Var.g = 2;
            eo4Var = pe2Var;
        } else {
            eo4Var = new eo4(this.b);
        }
        vcc a2 = new hr4(eo4Var).a(a);
        a2.getClass();
        return a2;
    }

    public final ghh a() {
        File file = new File(this.b.getCacheDir(), "im_exoplayer_video_cache");
        if (!file.exists() && !file.mkdirs()) {
            is8.e(fc6.k(file, "Could not create cache directory: "));
            return null;
        }
        return new ghh(file, this.d, this.e);
    }

    public final long a(Context context) {
        long maxSize = this.c.getMaxSize() * 1048576;
        F5.a.getClass();
        if (F5.A()) {
            try {
                Object systemService = context.getSystemService(U3.a.k);
                systemService.getClass();
                StorageManager storageManager = (StorageManager) systemService;
                UUID uuidForPath = storageManager.getUuidForPath(context.getCacheDir());
                uuidForPath.getClass();
                return Math.min(maxSize, storageManager.getCacheQuotaBytes(uuidForPath));
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return maxSize;
    }

    public final int a(String str) {
        ghh ghhVar;
        str.getClass();
        try {
            synchronized (this.a) {
                ghhVar = this.f;
            }
            if (ghhVar != null) {
                ao4 f = ghhVar.f(str);
                f.getClass();
                long a = ep3.a(f);
                if (a > 0) {
                    return (int) ((ghhVar.e(str, 0L, a) * 100) / a);
                }
            }
            return 0;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }
}

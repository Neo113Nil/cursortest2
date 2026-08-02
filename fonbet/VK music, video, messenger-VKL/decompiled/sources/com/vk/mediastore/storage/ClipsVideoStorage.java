package com.vk.mediastore.storage;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.metrics.eventtracking.b;
import com.vk.toggle.d;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.subjects.e;
import xsna.bpn0;
import xsna.e8r;
import xsna.fsu0;
import xsna.j7q;
import xsna.jnf;
import xsna.knf;
import xsna.lnf;
import xsna.nbr;
import xsna.ozl;
import xsna.pnf;
import xsna.swk;
import xsna.u30;
import xsna.ukd;

/* compiled from: ClipsVideoStorage.kt */
@ozl
/* loaded from: classes.dex */
public final class ClipsVideoStorage {
    public static final ClipsVideoStorage a = new ClipsVideoStorage();
    public static final bpn0 b;
    public static final e c;
    public static final e d;
    public static final bpn0 e;
    public static final bpn0 f;
    public static volatile c g;

    /* compiled from: ClipsVideoStorage.kt */
    /* loaded from: classes3.dex */
    public static final class CacheInitException extends Exception {
        public CacheInitException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* compiled from: ClipsVideoStorage.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrivateFiles.StorageType.values().length];
            try {
                iArr[PrivateFiles.StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrivateFiles.StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrivateFiles.StorageType.SD_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        bpn0 bpn0Var = new bpn0(new jnf(0));
        b = bpn0Var;
        e eVar = new e();
        if (!((pnf) bpn0Var.getValue()).a) {
            eVar.onComplete();
        }
        c = eVar;
        d = eVar;
        e = new bpn0(new knf(0));
        f = new bpn0(new lnf(0));
    }

    public static final void a() {
        a.getClass();
        j7q c2 = c();
        if (c2 != null) {
            c2.b();
        }
        PrivateFiles privateFiles = e8r.a;
        PrivateSubdir privateSubdir = PrivateSubdir.CLIPS;
        nbr.l(privateFiles.b(privateSubdir, ukd.a(d.g().a), true).a);
        privateFiles.a(privateSubdir, null);
        c cVar = g;
        if (cVar != null) {
            cVar.dispose();
        }
        g = null;
    }

    public static swk b(Context context, boolean z) {
        try {
            fsu0 fsu0Var = new fsu0(context.getApplicationContext(), "clips_database.db", null, 1);
            fsu0Var.getWritableDatabase().needUpgrade(1);
            return fsu0Var;
        } catch (Throwable th) {
            b.a.a(new CacheInitException("RecreateOnError: " + z + ' ', th));
            if (!z) {
                return null;
            }
            context.deleteDatabase("clips_database.db");
            nbr.l(e8r.a.b(PrivateSubdir.CLIPS, ukd.a(d.g().a), true).a);
            return b(context, false);
        }
    }

    public static j7q c() {
        return (j7q) e.getValue();
    }

    public static boolean d() {
        if (!((pnf) b.getValue()).a) {
            return true;
        }
        bpn0 bpn0Var = e;
        if (!bpn0Var.isInitialized()) {
            return false;
        }
        j7q j7qVar = (j7q) bpn0Var.getValue();
        return j7qVar == null || j7qVar.m != null;
    }

    public static void e(String str) {
        c cVar = g;
        if (cVar != null) {
            cVar.dispose();
        }
        g = null;
        if (((pnf) b.getValue()).a && !d()) {
            g = c.o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new u30(str, 2));
            return;
        }
        j7q c2 = c();
        if (c2 != null) {
            c2.f(str, null, MimeTypes.APPLICATION_MPD);
        }
    }

    public final synchronized void f() {
        try {
            if (d()) {
                return;
            }
            j7q c2 = c();
            if (c2 != null) {
                c2.c();
            }
            c.onComplete();
        } catch (Throwable th) {
            throw th;
        }
    }
}

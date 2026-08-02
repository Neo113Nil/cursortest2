package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z05 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Serializable h;

    public z05(AssetManager assetManager, Executor executor, x9f x9fVar, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = x9fVar;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 26:
                    bArr = tol.i;
                    break;
                case 27:
                    bArr = tol.h;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = tol.g;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = tol.f;
        }
        this.d = bArr;
    }

    public void a(ema emaVar) {
        p03 p03Var = (p03) this.g;
        if (p03Var == null || emaVar != ((ema) this.h) || p03Var.a()) {
            this.h = emaVar;
            p03Var = new p03((q80) this.b, g7a.C((dfj) this.c, emaVar), (List) this.f, (kx4) this.d, (sf8) this.e);
        }
        this.g = p03Var;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.b).execute(new uu1(this, i, serializable, 4));
    }

    public z05(q80 q80Var, dfj dfjVar, boolean z, kx4 kx4Var, sf8 sf8Var, List list) {
        this.b = q80Var;
        this.c = dfjVar;
        this.a = z;
        this.d = kx4Var;
        this.e = sf8Var;
        this.f = list;
    }
}

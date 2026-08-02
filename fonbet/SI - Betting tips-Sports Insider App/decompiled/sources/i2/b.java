package i2;

import android.content.res.AssetManager;
import android.os.Build;
import io.appmetrica.analytics.impl.C0122e9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f10864a;

    /* renamed from: b, reason: collision with root package name */
    public final e f10865b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f10866c;

    /* renamed from: d, reason: collision with root package name */
    public final File f10867d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10868e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10869f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f10870g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f10871h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f10864a = executor;
        this.f10865b = eVar;
        this.f10868e = str;
        this.f10867d = file;
        int i5 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i5 >= 24) {
            if (i5 < 31) {
                switch (i5) {
                    case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                    case C0122e9.F /* 25 */:
                        bArr = f.f10890h;
                        break;
                    case C0122e9.G /* 26 */:
                        bArr = f.f10889g;
                        break;
                    case C0122e9.H /* 27 */:
                        bArr = f.f10888f;
                        break;
                    case 28:
                    case C0122e9.I /* 29 */:
                    case 30:
                        bArr = f.f10887e;
                        break;
                }
            } else {
                bArr = f.f10886d;
            }
        }
        this.f10866c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f10865b.i();
            return null;
        }
    }

    public final void b(int i5, Serializable serializable) {
        this.f10864a.execute(new e.h(i5, 2, this, serializable));
    }
}

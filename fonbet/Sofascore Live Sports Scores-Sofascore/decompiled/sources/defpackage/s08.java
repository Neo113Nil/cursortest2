package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s08 implements xd4 {
    public final String a;
    public final AssetManager b;
    public Object c;
    public final /* synthetic */ int d;

    public s08(AssetManager assetManager, String str, int i) {
        this.d = i;
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.xd4
    public final void a() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.d) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        Object openFd;
        try {
            AssetManager assetManager = this.b;
            String str = this.a;
            switch (this.d) {
                case 0:
                    openFd = assetManager.openFd(str);
                    break;
                default:
                    openFd = assetManager.open(str);
                    break;
            }
            this.c = openFd;
            wd4Var.l(openFd);
        } catch (IOException e) {
            wd4Var.d(e);
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        switch (this.d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.xd4
    public final int e() {
        return 1;
    }

    @Override // defpackage.xd4
    public final void cancel() {
    }
}

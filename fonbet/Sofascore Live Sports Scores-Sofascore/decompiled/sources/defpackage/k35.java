package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class k35 implements xd4 {
    public final Resources.Theme a;
    public final Resources b;
    public final j35 c;
    public final int d;
    public Object e;

    public k35(Resources.Theme theme, Resources resources, j35 j35Var, int i) {
        this.a = theme;
        this.b = resources;
        this.c = j35Var;
        this.d = i;
    }

    @Override // defpackage.xd4
    public final void a() {
        Object obj = this.e;
        if (obj != null) {
            try {
                switch (this.c.a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.xd4
    public final void b(k7f k7fVar, wd4 wd4Var) {
        Object openRawResourceFd;
        try {
            j35 j35Var = this.c;
            Resources.Theme theme = this.a;
            Resources resources = this.b;
            int i = this.d;
            switch (j35Var.a) {
                case 0:
                    openRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = j35Var.b;
                    openRawResourceFd = l6g.E(context, context, i, theme);
                    break;
                default:
                    openRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.e = openRawResourceFd;
            wd4Var.l(openRawResourceFd);
        } catch (Resources.NotFoundException e) {
            wd4Var.d(e);
        }
    }

    @Override // defpackage.xd4
    public final Class c() {
        switch (this.c.a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
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

package l5;

import android.content.Context;
import l5.g;
import org.jetbrains.annotations.NotNull;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7872a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7872a f72797a = new C7872a();

    /* renamed from: b, reason: collision with root package name */
    private static g f72798b;

    @NotNull
    public static final g a(@NotNull Context context) {
        g gVar = f72798b;
        if (gVar != null) {
            return gVar;
        }
        synchronized (f72797a) {
            try {
                g gVar2 = f72798b;
                if (gVar2 != null) {
                    return gVar2;
                }
                Object applicationContext = context.getApplicationContext();
                g gVar3 = null;
                h hVar = applicationContext instanceof h ? (h) applicationContext : null;
                if (hVar != null) {
                    gVar3 = hVar.a();
                }
                if (gVar3 == null) {
                    gVar3 = new g.a(context).b();
                }
                f72798b = gVar3;
                return gVar3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

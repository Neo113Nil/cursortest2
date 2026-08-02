package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r1c {
    public final v7a a;

    public r1c(v7a v7aVar) {
        this.a = v7aVar;
    }

    public static final r1c b(Context context) {
        v7a v7aVar;
        Object obj;
        context.getClass();
        int i = Build.VERSION.SDK_INT;
        sg sgVar = sg.a;
        if (i >= 33) {
            sgVar.a();
        }
        if ((i >= 33 ? sgVar.a() : 0) >= 5) {
            v7aVar = new q1c(context, 1);
        } else {
            rg rgVar = rg.a;
            if (((i == 31 || i == 32) ? rgVar.a() : 0) >= 9) {
                try {
                    obj = new p1c(context, 0).invoke(context);
                } catch (NoClassDefFoundError unused) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 == 31 || i2 == 32) {
                        rgVar.a();
                    }
                    obj = null;
                }
                v7aVar = (v7a) obj;
            } else {
                v7aVar = null;
            }
        }
        if (v7aVar != null) {
            return new r1c(v7aVar);
        }
        return null;
    }

    @NotNull
    public ddb a(@NotNull dx4 dx4Var) {
        throw null;
    }

    @NotNull
    public ddb c() {
        return iz8.q(xw3.t(s9a.c(z45.a), null, new ppa(this, null, 12), 3));
    }

    @NotNull
    public ddb d(@NotNull lwh lwhVar) {
        throw null;
    }

    @NotNull
    public ddb e(@NotNull Uri uri, @Nullable InputEvent inputEvent) {
        uri.getClass();
        return iz8.q(xw3.t(s9a.c(z45.a), null, new zi7(this, uri, inputEvent, (rq3) null, 28), 3));
    }

    @NotNull
    public ddb f(@NotNull Uri uri) {
        uri.getClass();
        return iz8.q(xw3.t(s9a.c(z45.a), null, new gjb(this, uri, null, 7), 3));
    }

    @NotNull
    public ddb g(@NotNull n0l n0lVar) {
        throw null;
    }

    @NotNull
    public ddb h(@NotNull o0l o0lVar) {
        throw null;
    }
}

package xe0;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.util.Log;
import bd.C5652b;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: xe0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10762a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f105513a;

    public AbstractC10762a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f105513a = context;
    }

    protected final void a() {
        Object a11;
        Intrinsics.checkNotNullParameter(null, "fileUri");
        try {
            r.Companion companion = r.INSTANCE;
            InputStream openInputStream = this.f105513a.getContentResolver().openInputStream(null);
            a11 = openInputStream != null ? C5652b.c(openInputStream) : null;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            Log.e("AnimationLoader", "failed read bytes from file:null", b11);
        }
    }

    @NotNull
    protected final Context b() {
        return this.f105513a;
    }
}

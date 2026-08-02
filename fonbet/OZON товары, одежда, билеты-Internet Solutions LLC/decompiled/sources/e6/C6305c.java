package e6;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import j.C7232a;

/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6305c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f62022a = true;

    public static Drawable a(Context context, int i11, Resources.Theme theme) {
        return c(context, context, i11, theme);
    }

    public static Drawable b(Context context, Context context2, int i11) {
        return c(context, context2, i11, null);
    }

    private static Drawable c(Context context, Context context2, int i11, Resources.Theme theme) {
        try {
            if (f62022a) {
                return d(context2, i11, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e11) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e11;
            }
            return androidx.core.content.a.getDrawable(context2, i11);
        } catch (NoClassDefFoundError unused2) {
            f62022a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return androidx.core.content.res.g.d(context2.getResources(), i11, theme);
    }

    private static Drawable d(Context context, int i11, Resources.Theme theme) {
        if (theme != null) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return C7232a.a(context, i11);
    }
}

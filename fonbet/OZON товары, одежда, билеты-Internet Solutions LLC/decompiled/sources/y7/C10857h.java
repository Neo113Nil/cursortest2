package y7;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import s7.C9621p;

/* renamed from: y7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10857h {
    @NonNull
    static C10853d a(int i11) {
        if (i11 != 0 && i11 == 1) {
            return new C10854e();
        }
        return new j();
    }

    public static void b(float f7, @NonNull ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof C10856g) {
            ((C10856g) background).A(f7);
        }
    }

    public static void c(@NonNull View view, @NonNull C10856g c10856g) {
        if (c10856g.w()) {
            c10856g.F(C9621p.c(view));
        }
    }

    public static void d(@NonNull ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof C10856g) {
            c(viewGroup, (C10856g) background);
        }
    }
}

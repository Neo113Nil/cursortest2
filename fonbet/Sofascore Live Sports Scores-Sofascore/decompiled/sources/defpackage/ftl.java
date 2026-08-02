package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ftl extends ka4 {
    public final ImageView b;
    public final Function0 c;
    public xx8 d;
    public Function0 e;

    public ftl(@NotNull ImageView imageView, @NotNull Function0<Unit> function0) {
        imageView.getClass();
        function0.getClass();
        this.b = imageView;
        this.c = function0;
        this.e = new bpl(this, 0);
    }

    @Override // defpackage.ka4
    public final void a(Drawable drawable) {
        xx8 xx8Var = this.d;
        if (xx8Var != null) {
            xx8Var.stop();
        }
        this.e = null;
        this.d = null;
    }

    @Override // defpackage.ka4
    public final void c(Object obj) {
        xx8 xx8Var = (xx8) obj;
        if (Intrinsics.c(this.d, xx8Var)) {
            return;
        }
        this.c.invoke();
        this.d = xx8Var;
        this.b.setImageDrawable(xx8Var);
        Function0 function0 = this.e;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

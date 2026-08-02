package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yik extends p50 {
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public yik(Function0 function0, Function0 function02) {
        this.b = function0;
        this.c = function02;
    }

    @Override // defpackage.p50
    public final void a(Drawable drawable) {
        Function0 function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // defpackage.p50
    public final void b(Drawable drawable) {
        Function0 function0 = this.b;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

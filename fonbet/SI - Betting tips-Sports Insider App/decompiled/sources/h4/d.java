package h4;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends androidx.vectordrawable.graphics.drawable.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f10359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f10360b;

    public d(Function0 function0, Function0 function02) {
        this.f10359a = function0;
        this.f10360b = function02;
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public final void onAnimationEnd(Drawable drawable) {
        Function0 function0 = this.f10360b;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.c
    public final void onAnimationStart(Drawable drawable) {
        Function0 function0 = this.f10359a;
        if (function0 != null) {
            function0.invoke();
        }
    }
}

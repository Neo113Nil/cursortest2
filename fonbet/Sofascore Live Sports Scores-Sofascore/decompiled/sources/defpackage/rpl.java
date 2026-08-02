package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rpl extends FrameLayout {
    public final Function1 a;
    public final Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpl(@NotNull Context context, @NotNull Function1<? super rpl, Unit> function1, @NotNull Function1<? super rpl, Unit> function12) {
        super(context);
        context.getClass();
        function1.getClass();
        function12.getClass();
        this.a = function1;
        this.b = function12;
    }

    @NotNull
    public final Function1<rpl, Unit> getOnAttachedToWindowAction() {
        return this.a;
    }

    @NotNull
    public final Function1<rpl, Unit> getOnDetachedFromWindowAction() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.invoke(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.b.invoke(this);
        super.onDetachedFromWindow();
    }
}

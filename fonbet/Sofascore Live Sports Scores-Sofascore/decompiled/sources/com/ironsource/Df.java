package com.ironsource;

import com.ironsource.Ff;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface Df {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        private final Ff.a a;
        private boolean b;

        public a(@NotNull Ff.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        public final void a() {
            this.a.cancel();
            this.b = true;
        }

        public final boolean b() {
            return this.b;
        }
    }

    @NotNull
    default <T> a a(@NotNull T t, long j, @InterfaceC4307sb @NotNull Function1<? super T, Unit> function1) {
        Runnable b;
        t.getClass();
        function1.getClass();
        b = Ef.b(t, (Function1<? super Object, Unit>) function1);
        return b(b, j);
    }

    @NotNull
    a a(@NotNull Runnable runnable, long j);

    @NotNull
    a b(@InterfaceC4307sb @NotNull Runnable runnable, long j);
}

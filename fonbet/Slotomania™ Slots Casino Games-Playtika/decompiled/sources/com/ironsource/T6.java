package com.ironsource;

import android.os.Handler;
import com.ironsource.Ef;
import com.ironsource.S6;
import com.ironsource.T6;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class T6 {
    public static final S6.a a(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        return new a(handler);
    }

    public static final class a implements S6.a {
        final /* synthetic */ Handler a;

        a(Handler handler) {
            this.a = handler;
        }

        @Override // com.ironsource.S6.a
        public S6.a.InterfaceC0185a a(final Runnable runnable, long j) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.a.postDelayed(runnable, j);
            final Handler handler = this.a;
            return new S6.a.InterfaceC0185a() { // from class: com.ironsource.T6$a$$ExternalSyntheticLambda0
                @Override // com.ironsource.S6.a.InterfaceC0185a
                public final void cancel() {
                    T6.a.a(handler, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(Handler this_asScheduler, Runnable runnable) {
            Intrinsics.checkNotNullParameter(this_asScheduler, "$this_asScheduler");
            Intrinsics.checkNotNullParameter(runnable, "$runnable");
            this_asScheduler.removeCallbacks(runnable);
        }
    }

    public static final <T> Ef.b a(T t, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return Ef.b.b.a(t, block);
    }
}

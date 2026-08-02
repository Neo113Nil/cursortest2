package com.ironsource;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ke, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC2512ke implements Runnable {
    public static final a a = new a(null);

    /* renamed from: com.ironsource.ke$a */
    public static final class a {

        /* renamed from: com.ironsource.ke$a$a, reason: collision with other inner class name */
        public static final class C0211a extends AbstractRunnableC2512ke {
            final /* synthetic */ Function0<Unit> b;

            C0211a(Function0<Unit> function0) {
                this.b = function0;
            }

            @Override // com.ironsource.AbstractRunnableC2512ke
            public void a() {
                this.b.invoke();
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractRunnableC2512ke a(Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            return new C0211a(block);
        }

        private a() {
        }
    }

    public abstract void a() throws Exception;

    public void a(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Ff.a(t);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            C2556n4.d().a(th);
            try {
                a(th);
            } catch (Throwable th2) {
                C2556n4.d().a(th2);
            }
        }
    }
}

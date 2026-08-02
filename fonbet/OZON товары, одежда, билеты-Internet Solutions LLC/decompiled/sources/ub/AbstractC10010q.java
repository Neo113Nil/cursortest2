package ub;

import C.o0;
import android.os.RemoteException;
import com.vk.push.core.base.AidlResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lb.InterfaceC7913b;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;
import xe.InterfaceC10733l;

/* renamed from: ub.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC10010q<T, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f100496a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10737n f100497b;

    /* renamed from: ub.q$a */
    public static final class a<T, V> extends AbstractC10010q<T, V> {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final AbstractC7737t f100498c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final String f100499d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final AbstractC7737t f100500e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final Za.d f100501f;

        /* renamed from: ub.q$a$a, reason: collision with other inner class name */
        public static final class BinderC2204a extends InterfaceC7913b.a {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a<T, V> f100502e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<AbstractC10010q<T, V>, Unit> f100503f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Za.a f100504g;

            /* JADX WARN: Multi-variable type inference failed */
            BinderC2204a(a<T, V> aVar, Function1<? super AbstractC10010q<T, V>, Unit> function1, Za.a aVar2) {
                this.f100502e = aVar;
                this.f100503f = function1;
                this.f100504g = aVar2;
                attachInterface(this, "com.vk.push.core.base.AsyncCallback");
            }

            @Override // lb.InterfaceC7913b
            public final void g(AidlResult<?> result) {
                V invoke;
                Intrinsics.checkNotNullParameter(result, "result");
                RuntimeException a11 = result.a();
                a<T, V> aVar = this.f100502e;
                if (a11 == null) {
                    aVar.f().info(aVar.e() + " ipc request is success");
                    invoke = aVar.g().invoke(result, this.f100504g);
                } else {
                    aVar.f().info(aVar.e() + " ipc request is failure");
                    invoke = aVar.c().invoke(a11);
                }
                Eb.b.a(aVar.b(), invoke);
                this.f100503f.invoke(aVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function2 ipcCall, @NotNull String ipcCallName, @NotNull Function2 transformSuccessResult, @NotNull Za.d logger, @NotNull Function1 transformErrorResult, @NotNull C10737n continuation) {
            super(transformErrorResult, continuation, ipcCallName);
            Intrinsics.checkNotNullParameter(ipcCall, "ipcCall");
            Intrinsics.checkNotNullParameter(ipcCallName, "ipcCallName");
            Intrinsics.checkNotNullParameter(transformSuccessResult, "transformSuccessResult");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(transformErrorResult, "transformErrorResult");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f100498c = (AbstractC7737t) ipcCall;
            this.f100499d = ipcCallName;
            this.f100500e = (AbstractC7737t) transformSuccessResult;
            this.f100501f = logger;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
        @Override // ub.AbstractC10010q
        public final void a(T t2, @NotNull Za.a host, @NotNull Function1<? super AbstractC10010q<T, V>, Unit> onRequestFinished) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(onRequestFinished, "onRequestFinished");
            this.f100501f.info(o0.c(new StringBuilder(), this.f100499d, " ipc request is starting"));
            this.f100498c.invoke(t2, new BinderC2204a(this, onRequestFinished, host));
        }

        @NotNull
        public final String e() {
            return this.f100499d;
        }

        @NotNull
        public final Za.d f() {
            return this.f100501f;
        }

        @NotNull
        public final Function2<AidlResult<?>, Za.a, V> g() {
            return (Function2<AidlResult<?>, Za.a, V>) this.f100500e;
        }
    }

    private AbstractC10010q() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC10010q(Function1 function1, C10737n c10737n, String str) {
        this.f100496a = (AbstractC7737t) function1;
        this.f100497b = c10737n;
    }

    public abstract void a(T t2, @NotNull Za.a aVar, @NotNull Function1<? super AbstractC10010q<T, V>, Unit> function1) throws RemoteException;

    @NotNull
    protected final InterfaceC10733l<V> b() {
        return this.f100497b;
    }

    @NotNull
    protected final Function1<Exception, V> c() {
        return (Function1<Exception, V>) this.f100496a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    public final void d(@NotNull RemoteException e11) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Eb.b.a(this.f100497b, this.f100496a.invoke(e11));
    }
}

package retrofit2;

import Sc.C4006h;
import Sc.r;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10737n;
import xe.InterfaceC10733l;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"T", "Lretrofit2/Retrofit;", "create", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "", "Lretrofit2/Call;", "await", "(Lretrofit2/Call;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitNullable", "Lretrofit2/Response;", "awaitResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "suspendAndThrow", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes6.dex */
public final class KotlinExtensions {
    public static final <T> Object await(@NotNull Call<T> call, @NotNull d<? super T> frame) {
        final C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.q(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t2) {
                Intrinsics.h(call2, "call");
                Intrinsics.h(t2, "t");
                InterfaceC10733l interfaceC10733l = InterfaceC10733l.this;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(s.a(t2));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                Intrinsics.h(call2, "call");
                Intrinsics.h(response, "response");
                if (!response.isSuccessful()) {
                    InterfaceC10733l interfaceC10733l = InterfaceC10733l.this;
                    HttpException httpException = new HttpException(response);
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(s.a(httpException));
                    return;
                }
                T body = response.body();
                if (body != null) {
                    InterfaceC10733l interfaceC10733l2 = InterfaceC10733l.this;
                    r.Companion companion2 = r.INSTANCE;
                    interfaceC10733l2.resumeWith(body);
                    return;
                }
                Object i11 = call2.request().i(Invocation.class);
                if (i11 == null) {
                    Intrinsics.m();
                }
                Intrinsics.e(i11, "call.request().tag(Invocation::class.java)!!");
                Method method = ((Invocation) i11).method();
                StringBuilder sb2 = new StringBuilder("Response from ");
                Intrinsics.e(method, "method");
                Class<?> declaringClass = method.getDeclaringClass();
                Intrinsics.e(declaringClass, "method.declaringClass");
                sb2.append(declaringClass.getName());
                sb2.append('.');
                sb2.append(method.getName());
                sb2.append(" was null but response body type was declared as non-null");
                C4006h c4006h = new C4006h(sb2.toString());
                InterfaceC10733l interfaceC10733l3 = InterfaceC10733l.this;
                r.Companion companion3 = r.INSTANCE;
                interfaceC10733l3.resumeWith(s.a(c4006h));
            }
        });
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final <T> Object awaitNullable(@NotNull Call<T> call, @NotNull d<? super T> frame) {
        final C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.q(new KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t2) {
                Intrinsics.h(call2, "call");
                Intrinsics.h(t2, "t");
                InterfaceC10733l interfaceC10733l = InterfaceC10733l.this;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(s.a(t2));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                Intrinsics.h(call2, "call");
                Intrinsics.h(response, "response");
                if (response.isSuccessful()) {
                    InterfaceC10733l interfaceC10733l = InterfaceC10733l.this;
                    T body = response.body();
                    r.Companion companion = r.INSTANCE;
                    interfaceC10733l.resumeWith(body);
                    return;
                }
                InterfaceC10733l interfaceC10733l2 = InterfaceC10733l.this;
                HttpException httpException = new HttpException(response);
                r.Companion companion2 = r.INSTANCE;
                interfaceC10733l2.resumeWith(s.a(httpException));
            }
        });
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final <T> Object awaitResponse(@NotNull Call<T> call, @NotNull d<? super Response<T>> frame) {
        final C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.q(new KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1(call));
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(@NotNull Call<T> call2, @NotNull Throwable t2) {
                Intrinsics.h(call2, "call");
                Intrinsics.h(t2, "t");
                InterfaceC10733l interfaceC10733l = InterfaceC10733l.this;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(s.a(t2));
            }

            @Override // retrofit2.Callback
            public void onResponse(@NotNull Call<T> call2, @NotNull Response<T> response) {
                Intrinsics.h(call2, "call");
                Intrinsics.h(response, "response");
                InterfaceC10733l interfaceC10733l = InterfaceC10733l.this;
                r.Companion companion = r.INSTANCE;
                interfaceC10733l.resumeWith(response);
            }
        });
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final <T> T create(@NotNull Retrofit create) {
        Intrinsics.h(create, "$this$create");
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object suspendAndThrow(@NotNull final Exception exc, @NotNull d<?> dVar) {
        final KotlinExtensions$suspendAndThrow$1 frame;
        int i11;
        if (dVar instanceof KotlinExtensions$suspendAndThrow$1) {
            frame = (KotlinExtensions$suspendAndThrow$1) dVar;
            int i12 = frame.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                s.b(obj);
                frame.L$0 = exc;
                frame.label = 1;
                C10720e0.a().q(frame.getContext(), new Runnable() { // from class: retrofit2.KotlinExtensions$suspendAndThrow$$inlined$suspendCoroutineUninterceptedOrReturn$lambda$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d b11 = Wc.b.b(d.this);
                        Exception exc2 = exc;
                        r.Companion companion = r.INSTANCE;
                        b11.resumeWith(s.a(exc2));
                    }
                });
                Intrinsics.checkNotNullParameter(frame, "frame");
                return aVar;
            }
        }
        frame = new KotlinExtensions$suspendAndThrow$1(dVar);
        Object obj2 = frame.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.label;
        if (i11 == 0) {
        }
    }
}

package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class W<R> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89031a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C9407y f89032b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89033a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.data.local.r.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.data.local.r.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f89033a = iArr;
        }
    }

    public W(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository, @NotNull C9407y initializeChatUseCase) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(initializeChatUseCase, "initializeChatUseCase");
        this.f89031a = repository;
        this.f89032b = initializeChatUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull Function1 function1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        X x11;
        int i11;
        if (cVar instanceof X) {
            x11 = (X) cVar;
            int i12 = x11.f89037g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                x11.f89037g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = x11.f89035e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = x11.f89037g;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    ru.ozon.android.messenger.framework.domain.repository.b bVar = this.f89031a;
                    if (bVar.n()) {
                        x11.f89037g = 1;
                        Object invoke = function1.invoke(x11);
                        if (invoke != aVar) {
                            return invoke;
                        }
                    } else {
                        if (a.f89033a[bVar.C().getValue().ordinal()] == 1) {
                            x11.f89037g = 2;
                            obj = function1.invoke(x11);
                        } else {
                            Lm0.a.f17149a.d("Retrying initialize chat request...", new Object[0]);
                            x11.f89034d = function1;
                            x11.f89037g = 3;
                            obj = this.f89032b.a(x11);
                        }
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    Sc.s.b(obj);
                    return obj;
                }
                if (i11 == 2) {
                    Sc.s.b(obj);
                    return (ru.ozon.android.messenger.utils.i) obj;
                }
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                    return (ru.ozon.android.messenger.utils.i) obj;
                }
                function1 = x11.f89034d;
                Sc.s.b(obj);
                ru.ozon.android.messenger.utils.i iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (!(iVar instanceof i.b)) {
                    if (iVar instanceof i.a) {
                        return new i.a.e("Chat failed to initialize");
                    }
                    throw new Sc.o();
                }
                x11.f89034d = null;
                x11.f89037g = 4;
                obj = function1.invoke(x11);
            }
        }
        x11 = new X(this, cVar);
        Object obj2 = x11.f89035e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = x11.f89037g;
        if (i11 != 0) {
        }
    }
}

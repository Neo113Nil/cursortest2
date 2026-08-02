package dm0;

import Cb.b;
import Sc.r;
import Sc.s;
import android.content.Context;
import android.os.IBinder;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ub.AbstractC9996c;

/* renamed from: dm0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6222g extends AbstractC9996c<Cb.b> implements InterfaceC6216a {

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    public final String f61675m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f61676n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6222g(@NotNull String projectId, @NotNull Context context, @NotNull List preferredHosts, @NotNull Za.d logger, @NotNull Vl0.b onNoHostToBind) {
        super(logger, context, preferredHosts, onNoHostToBind);
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredHosts, "preferredHosts");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(onNoHostToBind, "onNoHostToBind");
        this.f61675m = projectId;
        this.f61676n = "PushIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // dm0.InterfaceC6216a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull String str, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6217b c6217b;
        int i11;
        if (cVar instanceof C6217b) {
            c6217b = (C6217b) cVar;
            int i12 = c6217b.f61669f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6217b.f61669f = i12 - LinearLayoutManager.INVALID_OFFSET;
                C6217b c6217b2 = c6217b;
                Object obj = c6217b2.f61667d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6217b2.f61669f;
                if (i11 != 0) {
                    s.b(obj);
                    C6218c c6218c = new C6218c(str, this);
                    C6219d c6219d = C6219d.f61672b;
                    C6220e c6220e = C6220e.f61673b;
                    C6221f c6221f = C6221f.f61674b;
                    c6217b2.f61669f = 1;
                    obj = t(c6218c, "registerForPushes", c6219d, c6220e, c6221f, TimeUnit.MINUTES.toMillis(3L), c6217b2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        c6217b = new C6217b(this, cVar);
        C6217b c6217b22 = c6217b;
        Object obj2 = c6217b22.f61667d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6217b22.f61669f;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }

    @Override // ub.AbstractC9996c
    public final Cb.b o(IBinder service) {
        Intrinsics.checkNotNullParameter(service, "service");
        Cb.b H11 = b.a.H(service);
        Intrinsics.checkNotNullExpressionValue(H11, "asInterface(service)");
        return H11;
    }

    @Override // ub.AbstractC9996c
    @NotNull
    public final String r() {
        return this.f61676n;
    }
}

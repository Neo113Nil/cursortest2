package ub;

import android.os.IInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "com.vk.push.core.ipc.BaseIPCClient", f = "BaseIPCClient.kt", l = {195, 218}, m = "makeAsyncRequest")
/* renamed from: ub.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C10005l<V> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    AbstractC9996c f100474d;

    /* renamed from: e, reason: collision with root package name */
    Function1 f100475e;

    /* renamed from: f, reason: collision with root package name */
    RemoteExceptionC10012s f100476f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f100477g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC9996c<IInterface> f100478h;

    /* renamed from: i, reason: collision with root package name */
    int f100479i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10005l(AbstractC9996c abstractC9996c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100478h = abstractC9996c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f100477g = obj;
        this.f100479i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f100478h.t(null, null, null, null, null, 0L, this);
    }
}

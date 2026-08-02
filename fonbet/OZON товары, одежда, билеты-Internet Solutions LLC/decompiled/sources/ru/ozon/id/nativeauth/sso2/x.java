package ru.ozon.id.nativeauth.sso2;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.C9551e;
import ru.ozon.id.nativeauth.sso2.t;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2ReauthorizeHandler", f = "Sso2ReauthorizeHandler.kt", l = {ModuleDescriptor.MODULE_VERSION, 235}, m = "reAuth")
/* loaded from: classes3.dex */
final class x extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    v f97500d;

    /* renamed from: e, reason: collision with root package name */
    t.c f97501e;

    /* renamed from: f, reason: collision with root package name */
    C9551e.a f97502f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC3394a f97503g;

    /* renamed from: h, reason: collision with root package name */
    /* synthetic */ Object f97504h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ v f97505i;

    /* renamed from: j, reason: collision with root package name */
    int f97506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(v vVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f97505i = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object g10;
        this.f97504h = obj;
        this.f97506j |= LinearLayoutManager.INVALID_OFFSET;
        g10 = this.f97505i.g(null, null, this);
        return g10;
    }
}

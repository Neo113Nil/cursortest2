package ru.ozon.android.messenger.framework.data.remote.websocket;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.data.remote.websocket.MessengerWebSocketDataSource", f = "MessengerWebSocketDataSource.kt", l = {213, ModuleDescriptor.MODULE_VERSION}, m = "reconnectSocket")
/* renamed from: ru.ozon.android.messenger.framework.data.remote.websocket.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9345p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f88125d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f88126e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C9331b f88127f;

    /* renamed from: g, reason: collision with root package name */
    int f88128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9345p(C9331b c9331b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f88127f = c9331b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f88126e = obj;
        this.f88128g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f88127f.u(this);
    }
}

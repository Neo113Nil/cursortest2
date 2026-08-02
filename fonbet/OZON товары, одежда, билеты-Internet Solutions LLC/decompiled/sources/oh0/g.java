package oh0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.channel.NotificationChannelStatusObserver", f = "NotificationChannelStatusObserver.kt", l = {41}, m = "checkMicrophoneInformation")
/* loaded from: classes7.dex */
final class g extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    j f78348d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f78349e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f78350f;

    /* renamed from: g, reason: collision with root package name */
    int f78351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(j jVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f78350f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f78349e = obj;
        this.f78351g |= LinearLayoutManager.INVALID_OFFSET;
        return j.a(this.f78350f, this);
    }
}

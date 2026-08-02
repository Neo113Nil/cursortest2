package fm0;

import androidx.recyclerview.widget.LinearLayoutManager;
import cm0.C5842a;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage", f = "DataStorePushStorage.kt", l = {TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER}, m = "getPushToken-JT9GLNw")
/* renamed from: fm0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6581b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f63630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C6583d f63631e;

    /* renamed from: f, reason: collision with root package name */
    public int f63632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6581b(C6583d c6583d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63631e = c6583d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f63630d = obj;
        this.f63632f |= LinearLayoutManager.INVALID_OFFSET;
        Object b11 = this.f63631e.b(this);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : new C5842a((String) b11);
    }
}

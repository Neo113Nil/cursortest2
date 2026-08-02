package fm0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.rustore.sdk.pushclient.internal.push.storage.DataStorePushStorage", f = "DataStorePushStorage.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "isPushTokenDeliveredToClientApp")
/* renamed from: fm0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6582c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f63633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C6583d f63634e;

    /* renamed from: f, reason: collision with root package name */
    public int f63635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6582c(C6583d c6583d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f63634e = c6583d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f63633d = obj;
        this.f63635f |= LinearLayoutManager.INVALID_OFFSET;
        return this.f63634e.c(this);
    }
}

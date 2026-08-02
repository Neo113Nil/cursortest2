package ch;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.call.sdk.api.CallSdkToPushSdkIntegrationKt", f = "CallSdkToPushSdkIntegration.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "getMicrophonePermissionCodeOrDefault")
/* renamed from: ch.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C5831b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f57181d;

    /* renamed from: e, reason: collision with root package name */
    int f57182e;

    C5831b() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f57181d = obj;
        this.f57182e |= LinearLayoutManager.INVALID_OFFSET;
        return C5832c.a(null, this);
    }
}

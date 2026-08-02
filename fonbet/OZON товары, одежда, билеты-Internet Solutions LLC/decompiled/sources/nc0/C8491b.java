package nc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.crossApp.BindCrossAppPublicKeyUseCase", f = "BindCrossAppPublicKeyUseCase.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30, DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "execute")
/* renamed from: nc0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8491b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f76737d;

    /* renamed from: e, reason: collision with root package name */
    Object f76738e;

    /* renamed from: f, reason: collision with root package name */
    String f76739f;

    /* renamed from: g, reason: collision with root package name */
    qc0.b f76740g;

    /* renamed from: h, reason: collision with root package name */
    long f76741h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f76742i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C8492c f76743j;

    /* renamed from: k, reason: collision with root package name */
    int f76744k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8491b(C8492c c8492c, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f76743j = c8492c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f76742i = obj;
        this.f76744k |= LinearLayoutManager.INVALID_OFFSET;
        return this.f76743j.a(this);
    }
}

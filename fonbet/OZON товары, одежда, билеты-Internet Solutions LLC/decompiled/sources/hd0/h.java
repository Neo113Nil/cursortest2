package hd0;

import Je.InterfaceC3394a;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.sso2.Sso2MobileConfigResponseDTO;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigInteractor", f = "Sso2MobileConfigInteractor.kt", l = {149, DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER, DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 38, 47, 51, 52}, m = "updateSsoMobileConfigIfNeed")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f65350d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC3394a f65351e;

    /* renamed from: f, reason: collision with root package name */
    Sso2MobileConfigResponseDTO f65352f;

    /* renamed from: g, reason: collision with root package name */
    Sso2MobileConfigResponseDTO f65353g;

    /* renamed from: h, reason: collision with root package name */
    boolean f65354h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f65355i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ e f65356j;

    /* renamed from: k, reason: collision with root package name */
    int f65357k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65356j = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f65355i = obj;
        this.f65357k |= LinearLayoutManager.INVALID_OFFSET;
        return this.f65356j.h(false, this);
    }
}

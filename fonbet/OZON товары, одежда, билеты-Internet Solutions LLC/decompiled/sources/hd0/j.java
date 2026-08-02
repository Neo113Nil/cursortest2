package hd0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.sso2.Sso2MobileConfigRepository", f = "Sso2MobileConfigRepository.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "get")
/* loaded from: classes7.dex */
final class j extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    i f65368d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f65369e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f65370f;

    /* renamed from: g, reason: collision with root package name */
    int f65371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(i iVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f65370f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f65369e = obj;
        this.f65371g |= LinearLayoutManager.INVALID_OFFSET;
        return this.f65370f.f(this);
    }
}

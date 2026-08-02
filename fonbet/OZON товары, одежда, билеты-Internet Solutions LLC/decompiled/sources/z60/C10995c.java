package z60;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.share.file.ShareFileBridgeInterface", f = "ShareFileBridgeInterface.kt", l = {195}, m = "saveFile")
/* renamed from: z60.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10995c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    e f107286d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f107287e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f107288f;

    /* renamed from: g, reason: collision with root package name */
    int f107289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10995c(e eVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f107288f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f107287e = obj;
        this.f107289g |= LinearLayoutManager.INVALID_OFFSET;
        return e.k(this.f107288f, null, null, null, this);
    }
}

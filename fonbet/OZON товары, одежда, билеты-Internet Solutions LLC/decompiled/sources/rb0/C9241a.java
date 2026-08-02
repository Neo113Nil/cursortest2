package rb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@e(c = "ru.ozon.id.antibot.challenge.SuspensiveChallengeManager", f = "SuspensiveChallengeManager.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 47}, m = "awaitResult-hhJSO8g")
/* renamed from: rb0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9241a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    Object f83264d;

    /* renamed from: e, reason: collision with root package name */
    kotlin.time.b f83265e;

    /* renamed from: f, reason: collision with root package name */
    Function0 f83266f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f83267g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c<Object, Object> f83268h;

    /* renamed from: i, reason: collision with root package name */
    int f83269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9241a(c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.f83268h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f83267g = obj;
        this.f83269i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f83268h.b(null, null, null, this);
    }
}

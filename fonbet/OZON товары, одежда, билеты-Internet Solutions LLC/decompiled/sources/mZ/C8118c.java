package mZ;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.utils.CoroutineUtilsKt", f = "CoroutineUtils.kt", l = {38, 42, 43}, m = "withExponentialRetry")
/* renamed from: mZ.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C8118c<R> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    int f74682d;

    /* renamed from: e, reason: collision with root package name */
    int f74683e;

    /* renamed from: f, reason: collision with root package name */
    long f74684f;

    /* renamed from: g, reason: collision with root package name */
    double f74685g;

    /* renamed from: h, reason: collision with root package name */
    Function1 f74686h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f74687i;

    /* renamed from: j, reason: collision with root package name */
    int f74688j;

    C8118c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f74687i = obj;
        this.f74688j |= LinearLayoutManager.INVALID_OFFSET;
        return C8117b.b(0, 0L, 0.0d, null, this);
    }
}

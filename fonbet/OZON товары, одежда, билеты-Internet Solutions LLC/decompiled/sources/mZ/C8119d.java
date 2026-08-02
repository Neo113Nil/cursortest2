package mZ;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.cdn.chooser.internal.utils.NetworkUtilsKt", f = "NetworkUtils.kt", l = {9}, m = "safeCall")
/* renamed from: mZ.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C8119d<T> extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f74689d;

    /* renamed from: e, reason: collision with root package name */
    int f74690e;

    C8119d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f74689d = obj;
        this.f74690e |= LinearLayoutManager.INVALID_OFFSET;
        Object a11 = e.a(null, this);
        return a11 == Wc.a.COROUTINE_SUSPENDED ? a11 : r.a(a11);
    }
}

package ub0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.mf.FingerprintChecker", f = "FingerprintChecker.kt", l = {129}, m = "sendFingerprint")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f100551d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C10014b f100552e;

    /* renamed from: f, reason: collision with root package name */
    int f100553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(C10014b c10014b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100552e = c10014b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Enum k11;
        this.f100551d = obj;
        this.f100553f |= LinearLayoutManager.INVALID_OFFSET;
        k11 = this.f100552e.k(null, null, null, null, this);
        return k11;
    }
}

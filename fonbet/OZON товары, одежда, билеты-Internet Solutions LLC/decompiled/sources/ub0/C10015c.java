package ub0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ub0.C10014b;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.mf.FingerprintChecker", f = "FingerprintChecker.kt", l = {67, 69, 80}, m = "internalSendAsyncFingerprintAfterDelay")
/* renamed from: ub0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C10015c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10014b f100527d;

    /* renamed from: e, reason: collision with root package name */
    C10014b.a f100528e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f100529f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C10014b f100530g;

    /* renamed from: h, reason: collision with root package name */
    int f100531h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10015c(C10014b c10014b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100530g = c10014b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f100529f = obj;
        this.f100531h |= LinearLayoutManager.INVALID_OFFSET;
        return C10014b.e(this.f100530g, null, this);
    }
}

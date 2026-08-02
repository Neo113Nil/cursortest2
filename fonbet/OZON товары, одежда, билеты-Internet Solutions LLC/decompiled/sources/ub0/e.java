package ub0;

import We.A;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.mf.FingerprintChecker", f = "FingerprintChecker.kt", l = {96, 100, 109}, m = "processFingerprint")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C10014b f100535d;

    /* renamed from: e, reason: collision with root package name */
    A f100536e;

    /* renamed from: f, reason: collision with root package name */
    Object f100537f;

    /* renamed from: g, reason: collision with root package name */
    String f100538g;

    /* renamed from: h, reason: collision with root package name */
    Object f100539h;

    /* renamed from: i, reason: collision with root package name */
    long f100540i;

    /* renamed from: j, reason: collision with root package name */
    long f100541j;

    /* renamed from: k, reason: collision with root package name */
    /* synthetic */ Object f100542k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ C10014b f100543l;

    /* renamed from: m, reason: collision with root package name */
    int f100544m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(C10014b c10014b, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f100543l = c10014b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object i11;
        this.f100542k = obj;
        this.f100544m |= LinearLayoutManager.INVALID_OFFSET;
        i11 = this.f100543l.i(null, null, null, null, this);
        return i11;
    }
}

package tb0;

import androidx.recyclerview.widget.LinearLayoutManager;
import jd0.C7352e;
import ob0.s;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.challenge.js.AntibotJSChallengeManager", f = "AntibotJSChallengeManager.kt", l = {74}, m = "send")
/* renamed from: tb0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C9797e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    C9796d f99355d;

    /* renamed from: e, reason: collision with root package name */
    s.h f99356e;

    /* renamed from: f, reason: collision with root package name */
    C7352e.a f99357f;

    /* renamed from: g, reason: collision with root package name */
    /* synthetic */ Object f99358g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C9796d f99359h;

    /* renamed from: i, reason: collision with root package name */
    int f99360i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9797e(C9796d c9796d, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f99359h = c9796d;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f99358g = obj;
        this.f99360i |= LinearLayoutManager.INVALID_OFFSET;
        return this.f99359h.v(null, null, this);
    }
}

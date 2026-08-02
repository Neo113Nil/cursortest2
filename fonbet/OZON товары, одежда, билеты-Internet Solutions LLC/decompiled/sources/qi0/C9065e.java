package qi0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.config.impl.TrackerConfigProviderImpl", f = "TrackerConfigProviderImpl.kt", l = {95}, m = "provide")
/* renamed from: qi0.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C9065e extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    M f82138d;

    /* renamed from: e, reason: collision with root package name */
    M f82139e;

    /* renamed from: f, reason: collision with root package name */
    M f82140f;

    /* renamed from: g, reason: collision with root package name */
    M f82141g;

    /* renamed from: h, reason: collision with root package name */
    M f82142h;

    /* renamed from: i, reason: collision with root package name */
    M f82143i;

    /* renamed from: j, reason: collision with root package name */
    M f82144j;

    /* renamed from: k, reason: collision with root package name */
    M f82145k;

    /* renamed from: l, reason: collision with root package name */
    M f82146l;

    /* renamed from: m, reason: collision with root package name */
    M f82147m;

    /* renamed from: n, reason: collision with root package name */
    /* synthetic */ Object f82148n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ n f82149o;

    /* renamed from: p, reason: collision with root package name */
    int f82150p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9065e(n nVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f82149o = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82148n = obj;
        this.f82150p |= LinearLayoutManager.INVALID_OFFSET;
        return this.f82149o.a(this);
    }
}

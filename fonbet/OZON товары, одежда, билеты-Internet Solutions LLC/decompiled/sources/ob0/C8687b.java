package ob0;

import We.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.log.Logger;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.antibot.AntibotActionHandler", f = "AntibotActionHandler.kt", l = {Logger.NONE}, m = "onAntibotResponse")
/* renamed from: ob0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C8687b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    l f77918d;

    /* renamed from: e, reason: collision with root package name */
    B.a f77919e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f77920f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ l f77921g;

    /* renamed from: h, reason: collision with root package name */
    int f77922h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C8687b(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f77921g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f77920f = obj;
        this.f77922h |= LinearLayoutManager.INVALID_OFFSET;
        return this.f77921g.l(null, null, this);
    }
}

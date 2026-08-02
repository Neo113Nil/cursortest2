package ru.ozon.pikazon.compose.painter;

import Sc.s;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pikazon.request.PikazonRequest;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;
import ru.ozon.app.android.pikazon.request.target.CustomTarget;
import ze.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.pikazon.compose.painter.UtilsKt$flowTarget$1", f = "Utils.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class g extends j implements Function2<u<? super CustomTarget.Result>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f97679d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f97680e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ PikazonRequestBuilder<Drawable> f97681f;

    static final class a extends AbstractC7737t implements Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PikazonRequest<Drawable> f97682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PikazonRequest<Drawable> pikazonRequest) {
            super(0);
            this.f97682b = pikazonRequest;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f97682b.cancel();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(PikazonRequestBuilder<Drawable> pikazonRequestBuilder, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f97681f = pikazonRequestBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        g gVar = new g(this.f97681f, dVar);
        gVar.f97680e = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u<? super CustomTarget.Result> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f97679d;
        if (i11 == 0) {
            s.b(obj);
            u uVar = (u) this.f97680e;
            PikazonRequest<Drawable> build = this.f97681f.target(new CustomTarget(new h(uVar))).build();
            build.load();
            a aVar2 = new a(build);
            this.f97679d = 1;
            if (ze.s.a(uVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}

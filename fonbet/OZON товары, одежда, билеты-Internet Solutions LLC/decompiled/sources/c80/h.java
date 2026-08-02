package c80;

import Sc.s;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$1$1$1$1", f = "SharingPreviewViewModel.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56730d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ i f56731e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f56732f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f56733g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ File f56734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, String str, String str2, File file, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f56731e = iVar;
        this.f56732f = str;
        this.f56733g = str2;
        this.f56734h = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new h(this.f56731e, this.f56732f, this.f56733g, this.f56734h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56730d;
        if (i11 == 0) {
            s.b(obj);
            long length = this.f56734h.length();
            this.f56730d = 1;
            if (i.p0(this.f56731e, this.f56732f, this.f56733g, length, this) == aVar) {
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

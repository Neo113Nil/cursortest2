package c80;

import Sc.s;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.sharing.presentation.pdf.SharingPreviewViewModel$removeFile$1$1", f = "SharingPreviewViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class n extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f56792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(String str, kotlin.coroutines.d<? super n> dVar) {
        super(2, dVar);
        this.f56792d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new n(this.f56792d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((n) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        File file = new File(this.f56792d);
        if (file.exists()) {
            file.delete();
        }
        return Unit.f71690a;
    }
}

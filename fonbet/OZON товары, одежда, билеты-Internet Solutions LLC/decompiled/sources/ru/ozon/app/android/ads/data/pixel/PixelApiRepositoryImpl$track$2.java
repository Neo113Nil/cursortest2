package ru.ozon.app.android.ads.data.pixel;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ads.data.pixel.data.PixelApi;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ads.data.pixel.PixelApiRepositoryImpl$track$2", f = "PixelApiRepository.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PixelApiRepositoryImpl$track$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ PixelApiRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PixelApiRepositoryImpl$track$2(PixelApiRepositoryImpl pixelApiRepositoryImpl, String str, d<? super PixelApiRepositoryImpl$track$2> dVar) {
        super(2, dVar);
        this.this$0 = pixelApiRepositoryImpl;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PixelApiRepositoryImpl$track$2(this.this$0, this.$url, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PixelApi pixelApi;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            pixelApi = this.this$0.pixelApi;
            String str = this.$url;
            this.label = 1;
            if (pixelApi.track(str, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PixelApiRepositoryImpl$track$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

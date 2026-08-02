package ru.ozon.app.android.geo.map.clusterization;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.map.clusterization.PinImageLoaderImpl$loadImages$2$1$1", f = "PinImageLoader.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class PinImageLoaderImpl$loadImages$2$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ PinImageLoaderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PinImageLoaderImpl$loadImages$2$1$1(PinImageLoaderImpl pinImageLoaderImpl, String str, d<? super PinImageLoaderImpl$loadImages$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = pinImageLoaderImpl;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PinImageLoaderImpl$loadImages$2$1$1(this.this$0, this.$url, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean hasCachedImage;
        Object downloadImage;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            hasCachedImage = this.this$0.hasCachedImage(this.$url);
            if (!hasCachedImage) {
                PinImageLoaderImpl pinImageLoaderImpl = this.this$0;
                String str = this.$url;
                this.label = 1;
                downloadImage = pinImageLoaderImpl.downloadImage(str, this);
                if (downloadImage == aVar) {
                    return aVar;
                }
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
        return ((PinImageLoaderImpl$loadImages$2$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

package ru.ozon.app.android.domain.tiles.dislike;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.domain.tiles.dislike.data.TileDislikeResponse;
import ru.ozon.app.android.domain.tiles.dislike.model.TileDislikeInfo;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.domain.tiles.dislike.TileDislikeInteractorImpl$dislike$1", f = "TileDislikeInteractorImpl.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class TileDislikeInteractorImpl$dislike$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ TileDislikeInfo $info;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TileDislikeInteractorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TileDislikeInteractorImpl$dislike$1(TileDislikeInteractorImpl tileDislikeInteractorImpl, TileDislikeInfo tileDislikeInfo, d<? super TileDislikeInteractorImpl$dislike$1> dVar) {
        super(2, dVar);
        this.this$0 = tileDislikeInteractorImpl;
        this.$info = tileDislikeInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TileDislikeInteractorImpl$dislike$1 tileDislikeInteractorImpl$dislike$1 = new TileDislikeInteractorImpl$dislike$1(this.this$0, this.$info, dVar);
        tileDislikeInteractorImpl$dislike$1.L$0 = obj;
        return tileDislikeInteractorImpl$dislike$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                TileDislikeInteractorImpl tileDislikeInteractorImpl = this.this$0;
                TileDislikeInfo tileDislikeInfo = this.$info;
                r.Companion companion = r.INSTANCE;
                TileDislikeInteractorImpl.setDisliked$default(tileDislikeInteractorImpl, tileDislikeInfo, null, 2, null);
                this.label = 1;
                obj = tileDislikeInteractorImpl.callDislikeAction(tileDislikeInfo, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (TileDislikeResponse) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        TileDislikeInteractorImpl tileDislikeInteractorImpl2 = this.this$0;
        TileDislikeInfo tileDislikeInfo2 = this.$info;
        if (r.b(a11) == null) {
            TileDislikeResponse tileDislikeResponse = (TileDislikeResponse) a11;
            if (tileDislikeResponse == null || !tileDislikeResponse.getSuccess()) {
                tileDislikeInteractorImpl2.setDislikeError(tileDislikeInfo2, tileDislikeResponse != null ? tileDislikeResponse.getNotificationBar() : null);
            } else {
                tileDislikeInteractorImpl2.setDisliked(tileDislikeInfo2, tileDislikeResponse.getNotificationBar());
            }
        } else {
            TileDislikeInteractorImpl.setDislikeError$default(tileDislikeInteractorImpl2, tileDislikeInfo2, null, 2, null);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TileDislikeInteractorImpl$dislike$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

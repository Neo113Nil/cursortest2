package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation;

import Ae.x0;
import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricViewModelImpl$updateItems$1", f = "MediaCentricViewModel.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MediaCentricViewModelImpl$updateItems$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ List<MediaCentricVO.MediaItemVO> $items;
    int label;
    final /* synthetic */ MediaCentricViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MediaCentricViewModelImpl$updateItems$1(MediaCentricViewModelImpl mediaCentricViewModelImpl, List<? extends MediaCentricVO.MediaItemVO> list, d<? super MediaCentricViewModelImpl$updateItems$1> dVar) {
        super(2, dVar);
        this.this$0 = mediaCentricViewModelImpl;
        this.$items = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MediaCentricViewModelImpl$updateItems$1(this.this$0, this.$items, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0<List<MediaCentricVO.MediaItemVO>> items = this.this$0.getItems();
            List<MediaCentricVO.MediaItemVO> list = this.$items;
            this.label = 1;
            if (items.emit(list, this) == aVar) {
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
        return ((MediaCentricViewModelImpl$updateItems$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

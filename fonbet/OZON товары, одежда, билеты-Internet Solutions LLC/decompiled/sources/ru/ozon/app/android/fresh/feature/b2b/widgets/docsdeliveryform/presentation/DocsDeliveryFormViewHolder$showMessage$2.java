package ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingViewHolder;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsEventHolder;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.docsdeliveryform.presentation.DocsDeliveryFormViewHolder$showMessage$2", f = "DocsDeliveryFormViewHolder.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class DocsDeliveryFormViewHolder$showMessage$2 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;

    DocsDeliveryFormViewHolder$showMessage$2(d<? super DocsDeliveryFormViewHolder$showMessage$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DocsDeliveryFormViewHolder$showMessage$2(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            AccompanyingDocsEventHolder accompanyingDocsEventHolder = AccompanyingDocsDownloadingViewHolder.INSTANCE.getAccompanyingDocsEventHolder();
            if (accompanyingDocsEventHolder != null) {
                AccompanyingDocsEventHolder.Event.Refresh refresh = AccompanyingDocsEventHolder.Event.Refresh.INSTANCE;
                this.label = 1;
                if (accompanyingDocsEventHolder.postEvent(refresh, this) == aVar) {
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
        return ((DocsDeliveryFormViewHolder$showMessage$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

package ru.ozon.app.android.pdp.view.photo360.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360Repository;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel$loadImageOriginalSize$1", f = "Photo360ViewModel.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class Photo360ViewModel$loadImageOriginalSize$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $lastIndex;
    int label;
    final /* synthetic */ Photo360ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ViewModel$loadImageOriginalSize$1(Photo360ViewModel photo360ViewModel, int i11, d<? super Photo360ViewModel$loadImageOriginalSize$1> dVar) {
        super(2, dVar);
        this.this$0 = photo360ViewModel;
        this.$lastIndex = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Photo360ViewModel$loadImageOriginalSize$1(this.this$0, this.$lastIndex, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Photo360Repository photo360Repository;
        int i11;
        int i12;
        Photo360Repository photo360Repository2;
        int i13;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            s.b(obj);
            photo360Repository = this.this$0.repository;
            i11 = this.this$0.currentIndex;
            this.label = 1;
            obj = photo360Repository.loadImageOriginalSize(i11, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        if (obj instanceof Result.Success) {
            int i15 = this.$lastIndex;
            i12 = this.this$0.currentIndex;
            if (i15 == i12) {
                photo360Repository2 = this.this$0.repository;
                i13 = this.this$0.currentIndex;
                this.this$0._liveData.postValue(new Photo360ViewModel.Action.NewPhoto(photo360Repository2.getCachedImage(i13), true));
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((Photo360ViewModel$loadImageOriginalSize$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

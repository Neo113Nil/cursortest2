package ru.ozon.app.android.pdp.view.photo360.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360Repository;
import ru.ozon.app.android.pdp.view.photo360.data.Photo360Response;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel;
import ru.ozon.app.android.utils.Result;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.view.photo360.presentation.Photo360ViewModel$loadInitialState$1", f = "Photo360ViewModel.kt", l = {70, 72}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class Photo360ViewModel$loadInitialState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $height;
    final /* synthetic */ int $width;
    Object L$0;
    int label;
    final /* synthetic */ Photo360ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Photo360ViewModel$loadInitialState$1(Photo360ViewModel photo360ViewModel, int i11, int i12, d<? super Photo360ViewModel$loadInitialState$1> dVar) {
        super(2, dVar);
        this.this$0 = photo360ViewModel;
        this.$width = i11;
        this.$height = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new Photo360ViewModel$loadInitialState$1(this.this$0, this.$width, this.$height, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        if (r7 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Photo360Repository photo360Repository;
        Photo360Repository photo360Repository2;
        Result result;
        Result result2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.this$0._liveData.postValue(Photo360ViewModel.Action.Loading.INSTANCE);
            photo360Repository = this.this$0.repository;
            this.label = 1;
            obj = photo360Repository.loadInitialState(this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result = (Result) this.L$0;
                s.b(obj);
                result2 = (Result) obj;
                if (!(result2 instanceof Result.Success)) {
                    Result.Success success = (Result.Success) result;
                    this.this$0._liveData.postValue(new Photo360ViewModel.Action.Ready(((Photo360Response) success.getValue()).getDescription(), ((Photo360Response) success.getValue()).getZoomDescription()));
                    if (Intrinsics.d(((Photo360Response) success.getValue()).getHasAutoplay(), Boolean.TRUE)) {
                        this.this$0.startAutoplay();
                    } else {
                        this.this$0.updateFrameIndex(0.0f);
                    }
                } else {
                    if (!(result2 instanceof Result.Failure)) {
                        throw new o();
                    }
                    this.this$0.onError(((Result.Failure) result2).getThrowable());
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        Result result3 = (Result) obj;
        if (!(result3 instanceof Result.Success)) {
            if (!(result3 instanceof Result.Failure)) {
                throw new o();
            }
            this.this$0.onError(((Result.Failure) result3).getThrowable());
            return Unit.f71690a;
        }
        photo360Repository2 = this.this$0.repository;
        int i12 = this.$width;
        int i13 = this.$height;
        List<String> photos = ((Photo360Response) ((Result.Success) result3).getValue()).getPhotos();
        this.L$0 = result3;
        this.label = 2;
        Object loadImages = photo360Repository2.loadImages(i12, i13, photos, this);
        if (loadImages != aVar) {
            result = result3;
            obj = loadImages;
            result2 = (Result) obj;
            if (!(result2 instanceof Result.Success)) {
            }
            return Unit.f71690a;
        }
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((Photo360ViewModel$loadInitialState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

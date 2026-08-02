package ru.ozon.app.android.returns.compose;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.compose.ReturnActionModalComposableKt$UploadPhoto$1$1", f = "ReturnActionModalComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$UploadPhoto$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ RmsUploadPhotosDto $component;
    final /* synthetic */ Function1<Integer, Unit> $onPhotoLimitChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalComposableKt$UploadPhoto$1$1(Function1<? super Integer, Unit> function1, RmsUploadPhotosDto rmsUploadPhotosDto, d<? super ReturnActionModalComposableKt$UploadPhoto$1$1> dVar) {
        super(2, dVar);
        this.$onPhotoLimitChanged = function1;
        this.$component = rmsUploadPhotosDto;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnActionModalComposableKt$UploadPhoto$1$1(this.$onPhotoLimitChanged, this.$component, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Function1<Integer, Unit> function1 = this.$onPhotoLimitChanged;
        Integer limit = this.$component.getLimit();
        function1.invoke(new Integer(limit != null ? limit.intValue() : 0));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReturnActionModalComposableKt$UploadPhoto$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

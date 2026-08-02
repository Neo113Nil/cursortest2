package ru.ozon.app.android.returns.compose;

import Sc.s;
import Wc.a;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.mediaupload.attachments.AttachmentVO;
import ru.ozon.app.android.returns.actionModal.presentation.viewObject.ReturnActionModalVO;
import ru.ozon.app.android.returns.ui.data.components.Component;
import ru.ozon.app.android.returns.ui.data.components.RmsUploadPhotosDto;
import ru.ozon.app.android.uploadPhotos.model.ViewState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.compose.ReturnActionModalComposableKt$ReturnActionModalComposable$1$1", f = "ReturnActionModalComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnActionModalComposableKt$ReturnActionModalComposable$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ReturnActionModalVO $item;
    final /* synthetic */ Function2<Component, List<AttachmentVO.AttachedImageVO>, Unit> $onPhotoUrlsChanged;
    final /* synthetic */ ViewState $photosState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalComposableKt$ReturnActionModalComposable$1$1(ReturnActionModalVO returnActionModalVO, Function2<? super Component, ? super List<AttachmentVO.AttachedImageVO>, Unit> function2, ViewState viewState, d<? super ReturnActionModalComposableKt$ReturnActionModalComposable$1$1> dVar) {
        super(2, dVar);
        this.$item = returnActionModalVO;
        this.$onPhotoUrlsChanged = function2;
        this.$photosState = viewState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnActionModalComposableKt$ReturnActionModalComposable$1$1(this.$item, this.$onPhotoUrlsChanged, this.$photosState, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Component component;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List<ReturnActionModalVO.ActionComponent> components = this.$item.getComponents();
        if (components != null) {
            Iterator<T> it = components.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((ReturnActionModalVO.ActionComponent) obj2).getComponent() instanceof RmsUploadPhotosDto) {
                    break;
                }
            }
            ReturnActionModalVO.ActionComponent actionComponent = (ReturnActionModalVO.ActionComponent) obj2;
            if (actionComponent != null && (component = actionComponent.getComponent()) != null) {
                Function2<Component, List<AttachmentVO.AttachedImageVO>, Unit> function2 = this.$onPhotoUrlsChanged;
                ViewState viewState = this.$photosState;
                function2.invoke(component, viewState != null ? viewState.getAttachments() : null);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ReturnActionModalComposableKt$ReturnActionModalComposable$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos;

import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;
import u0.InterfaceC9904m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/m;", "", "invoke", "(Lu0/m;LS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
final class PhotosComposableKt$PhotosComposable$1 extends AbstractC7737t implements InterfaceC6511n<InterfaceC9904m, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ Function1<PhotoItem, Unit> $onRemove;
    final /* synthetic */ Function1<PhotoItem, Unit> $onRetry;
    final /* synthetic */ List<PhotoItem> $photos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PhotosComposableKt$PhotosComposable$1(List<PhotoItem> list, Function1<? super PhotoItem, Unit> function1, Function1<? super PhotoItem, Unit> function12) {
        super(3);
        this.$photos = list;
        this.$onRemove = function1;
        this.$onRetry = function12;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC9904m interfaceC9904m, InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC9904m, interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC9904m FlowRow, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i11 & 17) == 16 && interfaceC3967k.b()) {
            interfaceC3967k.j();
            return;
        }
        List<PhotoItem> list = this.$photos;
        Function1<PhotoItem, Unit> function1 = this.$onRemove;
        Function1<PhotoItem, Unit> function12 = this.$onRetry;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            PhotosComposableKt.Photo(list.get(i12), function1, function12, interfaceC3967k, 0);
        }
    }
}

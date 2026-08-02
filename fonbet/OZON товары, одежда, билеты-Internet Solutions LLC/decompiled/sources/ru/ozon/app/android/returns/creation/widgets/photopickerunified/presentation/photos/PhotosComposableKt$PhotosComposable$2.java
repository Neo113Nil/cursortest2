package ru.ozon.app.android.returns.creation.widgets.photopickerunified.presentation.photos;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.returns.creation.widgets.photoPicker.presentation.photos.recycler.PhotoItem;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PhotosComposableKt$PhotosComposable$2 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<PhotoItem, Unit> $onRemove;
    final /* synthetic */ Function1<PhotoItem, Unit> $onRetry;
    final /* synthetic */ List<PhotoItem> $photos;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PhotosComposableKt$PhotosComposable$2(List<PhotoItem> list, Function1<? super PhotoItem, Unit> function1, Function1<? super PhotoItem, Unit> function12, int i11) {
        super(2);
        this.$photos = list;
        this.$onRemove = function1;
        this.$onRetry = function12;
        this.$$changed = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        invoke(interfaceC3967k, num.intValue());
        return Unit.f71690a;
    }

    public final void invoke(InterfaceC3967k interfaceC3967k, int i11) {
        PhotosComposableKt.PhotosComposable(this.$photos, this.$onRemove, this.$onRetry, interfaceC3967k, C2652m.e(this.$$changed | 1));
    }
}

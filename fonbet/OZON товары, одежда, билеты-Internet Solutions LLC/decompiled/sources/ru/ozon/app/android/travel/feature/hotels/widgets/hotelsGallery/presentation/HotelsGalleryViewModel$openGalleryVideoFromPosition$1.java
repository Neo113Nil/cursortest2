package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.GalleryAction;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryViewModel$openGalleryVideoFromPosition$1", f = "HotelsGalleryViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryViewModel$openGalleryVideoFromPosition$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction $atomAction;
    final /* synthetic */ boolean $fullScreen;
    final /* synthetic */ HotelsGalleryVO.Video $item;
    final /* synthetic */ long $position;
    int label;
    final /* synthetic */ HotelsGalleryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryViewModel$openGalleryVideoFromPosition$1(HotelsGalleryViewModel hotelsGalleryViewModel, HotelsGalleryVO.Video video, long j11, boolean z11, AtomAction atomAction, d<? super HotelsGalleryViewModel$openGalleryVideoFromPosition$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryViewModel;
        this.$item = video;
        this.$position = j11;
        this.$fullScreen = z11;
        this.$atomAction = atomAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsGalleryViewModel$openGalleryVideoFromPosition$1(this.this$0, this.$item, this.$position, this.$fullScreen, this.$atomAction, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0._action;
            GalleryAction.OpenGalleryVideoItem openGalleryVideoItem = new GalleryAction.OpenGalleryVideoItem(this.$item, this.$position, this.$fullScreen, this.$atomAction);
            this.label = 1;
            if (w0Var.emit(openGalleryVideoItem, this) == aVar) {
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
        return ((HotelsGalleryViewModel$openGalleryVideoFromPosition$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

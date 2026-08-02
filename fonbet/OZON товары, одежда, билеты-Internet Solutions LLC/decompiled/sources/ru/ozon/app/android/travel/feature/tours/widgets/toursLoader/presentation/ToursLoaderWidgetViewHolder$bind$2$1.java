package ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation;

import Sc.s;
import Wc.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import ru.ozon.app.android.travel.feature.tours.databinding.WidgetToursLoaderBinding;
import ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.data.ToursLoaderDTO;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import xe.M;
import xe.N;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursLoader.presentation.ToursLoaderWidgetViewHolder$bind$2$1", f = "ToursLoaderWidgetViewHolder.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ToursLoaderWidgetViewHolder$bind$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ K $progressIndex;
    final /* synthetic */ ToursLoaderVO $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ToursLoaderWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursLoaderWidgetViewHolder$bind$2$1(ToursLoaderVO toursLoaderVO, K k11, ToursLoaderWidgetViewHolder toursLoaderWidgetViewHolder, d<? super ToursLoaderWidgetViewHolder$bind$2$1> dVar) {
        super(2, dVar);
        this.$this_with = toursLoaderVO;
        this.$progressIndex = k11;
        this.this$0 = toursLoaderWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ToursLoaderWidgetViewHolder$bind$2$1 toursLoaderWidgetViewHolder$bind$2$1 = new ToursLoaderWidgetViewHolder$bind$2$1(this.$this_with, this.$progressIndex, this.this$0, dVar);
        toursLoaderWidgetViewHolder$bind$2$1.L$0 = obj;
        return toursLoaderWidgetViewHolder$bind$2$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0077 -> B:5:0x007a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        WidgetToursLoaderBinding widgetToursLoaderBinding;
        WidgetToursLoaderBinding widgetToursLoaderBinding2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            ToursLoaderDTO.ProgressContent progressContent = this.$this_with.getProgressContent().get(this.$progressIndex.f71785a);
            widgetToursLoaderBinding = this.this$0.binding;
            TextAtomView toursLoaderTitleTAV = widgetToursLoaderBinding.toursLoaderTitleTAV;
            Intrinsics.checkNotNullExpressionValue(toursLoaderTitleTAV, "toursLoaderTitleTAV");
            TextAtomHolderKt.bind$default(toursLoaderTitleTAV, progressContent.getTitle(), null, 2, null);
            widgetToursLoaderBinding2 = this.this$0.binding;
            TextAtomView toursLoaderCaptionTAV = widgetToursLoaderBinding2.toursLoaderCaptionTAV;
            Intrinsics.checkNotNullExpressionValue(toursLoaderCaptionTAV, "toursLoaderCaptionTAV");
            TextAtomHolderKt.bind$default(toursLoaderCaptionTAV, progressContent.getCaption(), null, 2, null);
            K k11 = this.$progressIndex;
            k11.f71785a = (k11.f71785a + 1) % this.$this_with.getProgressContent().size();
            this.L$0 = m11;
            this.label = 1;
            if (Y.b(3000L, this) == aVar) {
            }
            if (N.f(m11)) {
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m11 = (M) this.L$0;
        s.b(obj);
        if (N.f(m11) || this.$this_with.getProgressContent().size() <= 1) {
            return Unit.f71690a;
        }
        ToursLoaderDTO.ProgressContent progressContent2 = this.$this_with.getProgressContent().get(this.$progressIndex.f71785a);
        widgetToursLoaderBinding = this.this$0.binding;
        TextAtomView toursLoaderTitleTAV2 = widgetToursLoaderBinding.toursLoaderTitleTAV;
        Intrinsics.checkNotNullExpressionValue(toursLoaderTitleTAV2, "toursLoaderTitleTAV");
        TextAtomHolderKt.bind$default(toursLoaderTitleTAV2, progressContent2.getTitle(), null, 2, null);
        widgetToursLoaderBinding2 = this.this$0.binding;
        TextAtomView toursLoaderCaptionTAV2 = widgetToursLoaderBinding2.toursLoaderCaptionTAV;
        Intrinsics.checkNotNullExpressionValue(toursLoaderCaptionTAV2, "toursLoaderCaptionTAV");
        TextAtomHolderKt.bind$default(toursLoaderCaptionTAV2, progressContent2.getCaption(), null, 2, null);
        K k112 = this.$progressIndex;
        k112.f71785a = (k112.f71785a + 1) % this.$this_with.getProgressContent().size();
        this.L$0 = m11;
        this.label = 1;
        if (Y.b(3000L, this) == aVar) {
            return aVar;
        }
        if (N.f(m11)) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ToursLoaderWidgetViewHolder$bind$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

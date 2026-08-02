package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import Sc.s;
import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.commonTapTags.TapTagsRequestDTO;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3DTO;
import ru.ozon.app.android.search.widgets.tapTags.v3.core.TapTagsV3MapperKt;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel$updateTapTags$1", f = "TapTagsV3ViewModel.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class TapTagsV3ViewModel$updateTapTags$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $cleanSuggestedPageLink;
    final /* synthetic */ boolean $isFreshPage;
    final /* synthetic */ TapTagsRequestDTO $request;
    int label;
    final /* synthetic */ TapTagsV3ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV3ViewModel$updateTapTags$1(TapTagsRequestDTO tapTagsRequestDTO, TapTagsV3ViewModel tapTagsV3ViewModel, String str, boolean z11, d<? super TapTagsV3ViewModel$updateTapTags$1> dVar) {
        super(2, dVar);
        this.$request = tapTagsRequestDTO;
        this.this$0 = tapTagsV3ViewModel;
        this.$cleanSuggestedPageLink = str;
        this.$isFreshPage = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TapTagsV3ViewModel$updateTapTags$1(this.$request, this.this$0, this.$cleanSuggestedPageLink, this.$isFreshPage, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V v11;
        l20.d dVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$request.getSearchDelay() != null) {
                long longValue = this.$request.getSearchDelay().longValue();
                this.label = 1;
                if (Y.b(longValue, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        v11 = this.this$0._tapTags;
        TapTagsV3DTO createEmptyDTO = TapTagsV3DTO.INSTANCE.createEmptyDTO(new TapTagsV3DTO.SuggestedPage(this.$cleanSuggestedPageLink, null));
        dVar = this.this$0.widgetInfo;
        v11.setValue(TapTagsV3VO.copy$default(TapTagsV3MapperKt.toVO(createEmptyDTO, new Long((dVar != null ? dVar.d() : null) != null ? r3.hashCode() : 0)), 0L, null, 0, null, null, this.$isFreshPage, 31, null));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TapTagsV3ViewModel$updateTapTags$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}

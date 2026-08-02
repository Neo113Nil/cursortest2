package ru.ozon.app.android.search.widgets.tapTags.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "tapTagsVO", "Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/search/widgets/tapTags/v2/presentation/TapTagsV2VO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TapTagsV2ViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<TapTagsV2VO, Unit> {
    final /* synthetic */ TapTagsV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV2ViewHolder$onAttachViewModel$1(TapTagsV2ViewHolder tapTagsV2ViewHolder) {
        super(1);
        this.this$0 = tapTagsV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TapTagsV2VO tapTagsV2VO) {
        invoke2(tapTagsV2VO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TapTagsV2VO tapTagsV2VO) {
        TapTagsV2ViewHolder tapTagsV2ViewHolder = this.this$0;
        Intrinsics.f(tapTagsV2VO);
        tapTagsV2ViewHolder.updateUIWithModel(tapTagsV2VO);
    }
}

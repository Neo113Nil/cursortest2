package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "tapTags", "Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/search/widgets/tapTags/v3/presentation/TapTagsV3VO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TapTagsV3ViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<TapTagsV3VO, Unit> {
    final /* synthetic */ TapTagsV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapTagsV3ViewHolder$onAttachViewModel$1(TapTagsV3ViewHolder tapTagsV3ViewHolder) {
        super(1);
        this.this$0 = tapTagsV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TapTagsV3VO tapTagsV3VO) {
        invoke2(tapTagsV3VO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TapTagsV3VO tapTagsV3VO) {
        TapTagsV3ViewHolder tapTagsV3ViewHolder = this.this$0;
        Intrinsics.f(tapTagsV3VO);
        tapTagsV3ViewHolder.updateUIWithModel(tapTagsV3VO);
    }
}

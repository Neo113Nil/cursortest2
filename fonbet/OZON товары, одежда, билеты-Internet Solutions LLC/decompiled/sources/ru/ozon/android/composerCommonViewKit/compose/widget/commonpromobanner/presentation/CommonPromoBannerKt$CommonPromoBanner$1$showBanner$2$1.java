package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class CommonPromoBannerKt$CommonPromoBanner$1$showBanner$2$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ CommonPromoBannerVO $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonPromoBannerKt$CommonPromoBanner$1$showBanner$2$1(CommonPromoBannerVO commonPromoBannerVO) {
        super(0);
        this.$item = commonPromoBannerVO;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!this.$item.getIsClosed());
    }
}

package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core;

import Tg.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation.CommonPromoBannerVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTg/b;", "it", "", "invoke", "(LTg/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$3$1$actionHandler$2$1$1 extends AbstractC7737t implements Function1<b, Boolean> {
    final /* synthetic */ CommonPromoBannerVO $castedItem;
    final /* synthetic */ InterfaceC7851b $composerController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonPromoBannerConfigKt$commonPromoBannerWidget$1$3$3$1$actionHandler$2$1$1(InterfaceC7851b interfaceC7851b, CommonPromoBannerVO commonPromoBannerVO) {
        super(1);
        this.$composerController = interfaceC7851b;
        this.$castedItem = commonPromoBannerVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(b it) {
        boolean z11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.d(it.getId(), "closeBanner")) {
            this.$composerController.update(new UpdateCommonPromoBanner(this.$castedItem.getId()));
            z11 = true;
        } else {
            z11 = false;
        }
        return Boolean.valueOf(z11);
    }
}

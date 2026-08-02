package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.data.pixel.presentation.Pixel;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AdvBannerV4PlainViewModel$trackClick$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AdvBannerV4ItemVO $vo;
    final /* synthetic */ AdvBannerV4PlainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4PlainViewModel$trackClick$1(AdvBannerV4PlainViewModel advBannerV4PlainViewModel, AdvBannerV4ItemVO advBannerV4ItemVO) {
        super(0);
        this.this$0 = advBannerV4PlainViewModel;
        this.$vo = advBannerV4ItemVO;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List findPixels;
        findPixels = this.this$0.findPixels(this.$vo, Pixel.ActionType.CLICK);
        if (findPixels != null) {
            AdvBannerV4PlainViewModel advBannerV4PlainViewModel = this.this$0;
            Iterator it = findPixels.iterator();
            while (it.hasNext()) {
                advBannerV4PlainViewModel.trackPixel((Pixel) it.next());
            }
        }
    }
}

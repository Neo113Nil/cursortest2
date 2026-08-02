package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import y0.O;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/O;", "", "page", "", "invoke", "(Ly0/O;ILS0/k;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class ContentKt$Content$5$2 extends AbstractC7737t implements InterfaceC6512o<O, Integer, InterfaceC3967k, Integer, Unit> {
    final /* synthetic */ ImageSizeHelper $imageSizeHelper;
    final /* synthetic */ List<AppOnboardingVI.Content.Page> $pages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$Content$5$2(List<AppOnboardingVI.Content.Page> list, ImageSizeHelper imageSizeHelper) {
        super(4);
        this.$pages = list;
        this.$imageSizeHelper = imageSizeHelper;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(O o11, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        invoke(o11, num.intValue(), interfaceC3967k, num2.intValue());
        return Unit.f71690a;
    }

    public final void invoke(O HorizontalPager, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ContentKt.Page(this.$pages.get(i11), this.$imageSizeHelper, interfaceC3967k, 0);
    }
}

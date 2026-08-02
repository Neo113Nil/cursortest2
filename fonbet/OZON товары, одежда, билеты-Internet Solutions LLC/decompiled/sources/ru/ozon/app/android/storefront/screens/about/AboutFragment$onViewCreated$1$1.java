package ru.ozon.app.android.storefront.screens.about;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storefront.databinding.FragmentAboutBinding;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "about", "Lru/ozon/app/android/storefront/screens/about/AboutInfo;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/storefront/screens/about/AboutInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AboutFragment$onViewCreated$1$1 extends AbstractC7737t implements Function1<AboutInfo, Unit> {
    final /* synthetic */ FragmentAboutBinding $this_with;
    final /* synthetic */ AboutFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AboutFragment$onViewCreated$1$1(FragmentAboutBinding fragmentAboutBinding, AboutFragment aboutFragment) {
        super(1);
        this.$this_with = fragmentAboutBinding;
        this.this$0 = aboutFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AboutInfo aboutInfo) {
        invoke2(aboutInfo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AboutInfo aboutInfo) {
        this.$this_with.legalName.setText(aboutInfo.getCompanyName());
        this.this$0.personalDataUrl = aboutInfo.getPersonalDataUrl();
        this.$this_with.copyrightRange.setText(aboutInfo.getCompanyYears());
    }
}

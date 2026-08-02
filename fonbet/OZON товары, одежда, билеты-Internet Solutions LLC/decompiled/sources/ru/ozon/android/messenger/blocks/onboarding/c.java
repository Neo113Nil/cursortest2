package ru.ozon.android.messenger.blocks.onboarding;

import Hy.RunnableC3170a;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MBlockOnboardingBinding;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<MBlockOnboardingBinding, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f85947b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f85948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, e eVar) {
        super(1);
        this.f85947b = bVar;
        this.f85948c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MBlockOnboardingBinding mBlockOnboardingBinding) {
        MBlockOnboardingBinding withBinding = mBlockOnboardingBinding;
        Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
        Image onboardingImage = withBinding.onboardingImage;
        Intrinsics.checkNotNullExpressionValue(onboardingImage, "onboardingImage");
        b bVar = this.f85947b;
        ImageHolderKt.bindOrGone$default(onboardingImage, bVar.d(), null, 2, null);
        LottieAnimationView onboardingAnimationView = withBinding.onboardingAnimationView;
        Intrinsics.checkNotNullExpressionValue(onboardingAnimationView, "onboardingAnimationView");
        String a11 = bVar.a();
        e eVar = this.f85948c;
        if (a11 == null || a11.length() == 0) {
            s.a(onboardingAnimationView);
        } else {
            onboardingAnimationView.setAnimation(a11);
            onboardingAnimationView.postDelayed(new RunnableC3170a(onboardingAnimationView, 8), 300L);
        }
        TextAtomV2View onboardingTitle = withBinding.onboardingTitle;
        Intrinsics.checkNotNullExpressionValue(onboardingTitle, "onboardingTitle");
        TextHolderKt.bind$default(onboardingTitle, bVar.f(), null, 2, null);
        TextAtomV2View onboardingSubtitle = withBinding.onboardingSubtitle;
        Intrinsics.checkNotNullExpressionValue(onboardingSubtitle, "onboardingSubtitle");
        TextHolderKt.bind$default(onboardingSubtitle, bVar.e(), null, 2, null);
        ButtonV3View onboardingCancelButton = withBinding.onboardingCancelButton;
        Intrinsics.checkNotNullExpressionValue(onboardingCancelButton, "onboardingCancelButton");
        ButtonV3HolderKt.bind$default(onboardingCancelButton, bVar.b(), null, 2, null);
        onboardingCancelButton.setOnClickListener(new Ar.b(eVar, 9));
        return Unit.f71690a;
    }
}

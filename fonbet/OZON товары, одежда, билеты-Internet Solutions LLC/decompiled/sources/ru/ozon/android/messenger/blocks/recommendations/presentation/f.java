package ru.ozon.android.messenger.blocks.recommendations.presentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.databinding.MViewRecommendationErrorBinding;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.controls.button.UncontainedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class f extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MViewRecommendationErrorBinding f86335a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86335a = MViewRecommendationErrorBinding.inflate(LayoutInflater.from(context), this, true);
    }

    public final void a(UncontainedButtonDTO uncontainedButtonDTO, Function1<? super AtomAction, Unit> function1) {
        UncontainedButtonView errorButton = this.f86335a.errorButton;
        Intrinsics.checkNotNullExpressionValue(errorButton, "errorButton");
        UncontainedButtonHolderKt.bindOrGone(errorButton, uncontainedButtonDTO, function1);
    }

    public final void b(ImageDTO imageDTO) {
        Image errorImage = this.f86335a.errorImage;
        Intrinsics.checkNotNullExpressionValue(errorImage, "errorImage");
        ImageHolderKt.bindOrGone$default(errorImage, imageDTO, null, 2, null);
    }

    public final void c(TextDTO textDTO) {
        TextAtomV2View errorTitle = this.f86335a.errorTitle;
        Intrinsics.checkNotNullExpressionValue(errorTitle, "errorTitle");
        TextHolderKt.bindOrGone$default(errorTitle, textDTO, null, 2, null);
    }
}

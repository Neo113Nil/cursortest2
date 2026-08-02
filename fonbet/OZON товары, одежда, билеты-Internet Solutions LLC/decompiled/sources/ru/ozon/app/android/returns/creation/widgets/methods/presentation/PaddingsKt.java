package ru.ozon.app.android.returns.creation.widgets.methods.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.data.PaddingsDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"toVo", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/Paddings;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "applyTo", "", "view", "Landroid/view/View;", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaddingsKt {
    public static final void applyTo(@NotNull Paddings paddings, @NotNull View view) {
        Intrinsics.checkNotNullParameter(paddings, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(paddings.getLeft(), paddings.getTop(), paddings.getRight(), paddings.getBottom());
    }

    @NotNull
    public static final Paddings toVo(@NotNull PaddingsDTO paddingsDTO) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<this>");
        return new Paddings(UiExtKt.toPx(paddingsDTO.getLeftPadding()), UiExtKt.toPx(paddingsDTO.getTopPadding()), UiExtKt.toPx(paddingsDTO.getRightPadding()), UiExtKt.toPx(paddingsDTO.getBottomPadding()));
    }
}

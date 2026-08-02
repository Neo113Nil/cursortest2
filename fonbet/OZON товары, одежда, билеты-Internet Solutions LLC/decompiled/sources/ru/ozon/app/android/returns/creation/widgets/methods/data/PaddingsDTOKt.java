package ru.ozon.app.android.returns.creation.widgets.methods.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0007"}, d2 = {"addHorizontal", "Lru/ozon/app/android/returns/creation/widgets/methods/data/PaddingsDTO;", "blockPaddings", "Lru/ozon/app/android/returns/creation/widgets/methods/data/BlockPaddingsDTO;", "addTopAndHorizontal", "addBottomAndHorizontal", "addAll", "creation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaddingsDTOKt {
    @NotNull
    public static final PaddingsDTO addAll(@NotNull PaddingsDTO paddingsDTO, @NotNull BlockPaddingsDTO blockPaddings) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<this>");
        Intrinsics.checkNotNullParameter(blockPaddings, "blockPaddings");
        return paddingsDTO.copy(blockPaddings.getLeftPadding() + paddingsDTO.getLeftPadding(), blockPaddings.getTopPadding() + paddingsDTO.getTopPadding(), blockPaddings.getRightPadding() + paddingsDTO.getRightPadding(), blockPaddings.getBottomPadding() + paddingsDTO.getBottomPadding());
    }

    @NotNull
    public static final PaddingsDTO addBottomAndHorizontal(@NotNull PaddingsDTO paddingsDTO, @NotNull BlockPaddingsDTO blockPaddings) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<this>");
        Intrinsics.checkNotNullParameter(blockPaddings, "blockPaddings");
        return PaddingsDTO.copy$default(paddingsDTO, blockPaddings.getLeftPadding() + paddingsDTO.getLeftPadding(), 0, blockPaddings.getRightPadding() + paddingsDTO.getRightPadding(), blockPaddings.getBottomPadding() + paddingsDTO.getBottomPadding(), 2, null);
    }

    @NotNull
    public static final PaddingsDTO addHorizontal(@NotNull PaddingsDTO paddingsDTO, @NotNull BlockPaddingsDTO blockPaddings) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<this>");
        Intrinsics.checkNotNullParameter(blockPaddings, "blockPaddings");
        return PaddingsDTO.copy$default(paddingsDTO, blockPaddings.getLeftPadding() + paddingsDTO.getLeftPadding(), 0, blockPaddings.getRightPadding() + paddingsDTO.getRightPadding(), 0, 10, null);
    }

    @NotNull
    public static final PaddingsDTO addTopAndHorizontal(@NotNull PaddingsDTO paddingsDTO, @NotNull BlockPaddingsDTO blockPaddings) {
        Intrinsics.checkNotNullParameter(paddingsDTO, "<this>");
        Intrinsics.checkNotNullParameter(blockPaddings, "blockPaddings");
        return PaddingsDTO.copy$default(paddingsDTO, blockPaddings.getLeftPadding() + paddingsDTO.getLeftPadding(), blockPaddings.getTopPadding() + paddingsDTO.getTopPadding(), blockPaddings.getRightPadding() + paddingsDTO.getRightPadding(), 0, 8, null);
    }
}

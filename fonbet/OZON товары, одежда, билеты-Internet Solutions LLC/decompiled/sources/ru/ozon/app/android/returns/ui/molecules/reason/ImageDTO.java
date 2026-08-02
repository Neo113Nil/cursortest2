package ru.ozon.app.android.returns.ui.molecules.reason;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/ImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "deleteButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getImage", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getDeleteButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ImageDTO {

    @NotNull
    private final IconButtonV3DTO deleteButton;

    @NotNull
    private final IconDTO image;

    public ImageDTO(@NotNull IconDTO image, @NotNull IconButtonV3DTO deleteButton) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(deleteButton, "deleteButton");
        this.image = image;
        this.deleteButton = deleteButton;
    }

    @NotNull
    public final IconButtonV3DTO getDeleteButton() {
        return this.deleteButton;
    }

    @NotNull
    public final IconDTO getImage() {
        return this.image;
    }
}

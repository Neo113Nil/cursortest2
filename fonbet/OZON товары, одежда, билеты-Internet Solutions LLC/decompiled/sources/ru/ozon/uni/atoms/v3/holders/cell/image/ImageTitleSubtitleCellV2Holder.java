package ru.ozon.uni.atoms.v3.holders.cell.image;

import Sc.InterfaceC3999a;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.image.ImageTitleSubtitleCellV2View;
import ru.ozon.uni.android.cell.image.data.ImageTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.image.data.ImageTitleSubtitleWrapperPresets;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellAtomHolder;

@InterfaceC3999a
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/cell/image/ImageTitleSubtitleCellV2Holder;", "Lru/ozon/uni/atoms/v3/holders/cell/CellAtomHolder;", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "Lru/ozon/uni/android/cell/image/ImageTitleSubtitleCellV2View;", "view", "atomContext", "", "<init>", "(Lru/ozon/uni/android/cell/image/ImageTitleSubtitleCellV2View;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageTitleSubtitleCellV2Holder extends CellAtomHolder<ImageTitleSubtitleCellDTO, ImageTitleSubtitleCellV2View> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTitleSubtitleCellV2Holder(@NotNull ImageTitleSubtitleCellV2View view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageTitleSubtitleCellV2Holder(@NotNull Context context, String str) {
        this(new ImageTitleSubtitleCellV2View(context, null, 0, 0, null, false, 62, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ImageTitleSubtitleCellDTO item) {
        ImageTitleSubtitleWrapperPreset centerEnd500ContentControl500;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((ImageTitleSubtitleCellV2Holder) item);
        ImageTitleSubtitleCellV2View imageTitleSubtitleCellV2View = (ImageTitleSubtitleCellV2View) getContainerView();
        ImageTitleSubtitleCellDTO.ImageTitleSubtitleCellPreset preset = item.getPreset();
        if (preset == null || (centerEnd500ContentControl500 = preset.getPreset()) == null) {
            centerEnd500ContentControl500 = ImageTitleSubtitleWrapperPresets.INSTANCE.getCenterEnd500ContentControl500();
        }
        imageTitleSubtitleCellV2View.setPreset(centerEnd500ContentControl500);
        ImageDTO image = item.getImage();
        ImageTitleSubtitleCellV2HolderKt.bindCellData(imageTitleSubtitleCellV2View, item.getTitle(), item.getSubtitle(), image != null ? image.copy((r34 & 1) != 0 ? image.image : null, (r34 & 2) != 0 ? image.backgroundColor : null, (r34 & 4) != 0 ? image.aspectRatio : null, (r34 & 8) != 0 ? image.hasParanja : false, (r34 & 16) != 0 ? image.layoutPaddingLeft : null, (r34 & 32) != 0 ? image.layoutPaddingRight : null, (r34 & 64) != 0 ? image.layoutPaddingTop : imageTitleSubtitleCellV2View.getPreset().getImageAddonPreset().getLayoutTopPadding(), (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? image.layoutPaddingBottom : imageTitleSubtitleCellV2View.getPreset().getImageAddonPreset().getLayoutBottomPadding(), (r34 & 256) != 0 ? image.cornerRadius : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? image.context : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? image.testInfo : null, (r34 & 2048) != 0 ? image.trackingInfo : null, (r34 & 4096) != 0 ? image.imageWidth : null, (r34 & 8192) != 0 ? image.imageType : null, (r34 & 16384) != 0 ? image.fitType : null, (r34 & 32768) != 0 ? image.customRatio : null) : null);
    }
}

package ru.ozon.app.android.ugc.widgets.reviewSort.core;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "ReviewSortComposeWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "", "isSelected", "isSelect", "modifyCellDTO", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;ZZ)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewSortComposeWidgetKt {
    @NotNull
    public static final i ReviewSortComposeWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "reviewSort", null, new ReviewSortComposeWidgetKt$ReviewSortComposeWidget$1(jsonDeserializer), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CellDTO modifyCellDTO(CellDTO cellDTO, boolean z11, boolean z12) {
        IconDTO iconDTO;
        IconDTO icon;
        IconDTO copy;
        IconDTO icon2;
        CommonAtomIconDTO icon3;
        CellDTO.LeftBlock leftBlock;
        if (z12) {
            CellDTO.LeftBlock leftBlock2 = cellDTO.getLeftBlock();
            if (leftBlock2 != null) {
                AtomDTO control = leftBlock2.getControl();
                if (control instanceof RadioDTO) {
                    control = RadioDTO.copy$default((RadioDTO) control, null, Boolean.valueOf(z11), null, null, null, null, 61, null);
                }
                leftBlock = CellDTO.LeftBlock.copy$default(leftBlock2, null, null, null, null, null, null, null, control, 127, null);
            } else {
                leftBlock = null;
            }
            CellDTO.Settings settings = cellDTO.getSettings();
            return CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, Boolean.valueOf(z11), null, null, null, null, null, 2015, null) : null, leftBlock, null, null, 25, null);
        }
        if (z11) {
            return cellDTO;
        }
        CellDTO.RightBlock rightBlock = cellDTO.getRightBlock();
        CommonAtomIconDTO copy$default = (rightBlock == null || (icon2 = rightBlock.getIcon()) == null || (icon3 = icon2.getIcon()) == null) ? null : CommonAtomIconDTO.copy$default(icon3, null, UniTheme.INSTANCE.getColorTokens().getClearLightKey0().getId(), 1, null);
        CellDTO.RightBlock rightBlock2 = cellDTO.getRightBlock();
        if (rightBlock2 == null || (icon = rightBlock2.getIcon()) == null) {
            iconDTO = null;
        } else {
            copy = icon.copy((r34 & 1) != 0 ? icon.size : null, (r34 & 2) != 0 ? icon.hasShape : null, (r34 & 4) != 0 ? icon.shape : null, (r34 & 8) != 0 ? icon.text : null, (r34 & 16) != 0 ? icon.icon : copy$default, (r34 & 32) != 0 ? icon.backgroundImage : null, (r34 & 64) != 0 ? icon.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? icon.textColor : null, (r34 & 256) != 0 ? icon.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? icon.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? icon.borderWidth : null, (r34 & 2048) != 0 ? icon.isBorderInside : null, (r34 & 4096) != 0 ? icon.hasParanja : null, (r34 & 8192) != 0 ? icon.getContext() : null, (r34 & 16384) != 0 ? icon.getTestInfo() : null, (r34 & 32768) != 0 ? icon.getTrackingInfo() : null);
            iconDTO = copy;
        }
        CellDTO.RightBlock rightBlock3 = cellDTO.getRightBlock();
        return CellDTO.copy$default(cellDTO, null, null, null, rightBlock3 != null ? CellDTO.RightBlock.copy$default(rightBlock3, null, null, null, null, null, null, null, iconDTO, null, null, null, null, 3967, null) : null, null, 23, null);
    }
}

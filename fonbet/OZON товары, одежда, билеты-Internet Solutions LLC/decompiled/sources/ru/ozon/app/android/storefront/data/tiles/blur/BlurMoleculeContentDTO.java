package ru.ozon.app.android.storefront.data.tiles.blur;

import com.squareup.moshi.j;
import kotlin.Metadata;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "", "icon", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIcon", "()Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlurMoleculeContentDTO {
    private final CommonAtomIconDTO icon;
    private final TextDTO text;

    public BlurMoleculeContentDTO(CommonAtomIconDTO commonAtomIconDTO, TextDTO textDTO) {
        this.icon = commonAtomIconDTO;
        this.text = textDTO;
    }

    public final CommonAtomIconDTO getIcon() {
        return this.icon;
    }

    public final TextDTO getText() {
        return this.text;
    }
}

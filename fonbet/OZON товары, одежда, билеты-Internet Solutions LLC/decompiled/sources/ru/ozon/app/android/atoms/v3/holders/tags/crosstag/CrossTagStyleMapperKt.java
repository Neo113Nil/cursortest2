package ru.ozon.app.android.atoms.v3.holders.tags.crosstag;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u0005"}, d2 = {"toCrossTagStyle", "Lru/ozon/app/android/atoms/v3/holders/tags/crosstag/CrossTagStyle;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$CrossTagAtom$ThemeType;", "getStyleForPrimaryCrossTagStyle", "getStyleForSecondaryCrossTagStyle", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CrossTagStyleMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TagV3Atom.CrossTagAtom.ThemeType.values().length];
            try {
                iArr[TagV3Atom.CrossTagAtom.ThemeType.THEME_TYPE_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TagV3Atom.CrossTagAtom.ThemeType.THEME_TYPE_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final CrossTagStyle getStyleForPrimaryCrossTagStyle() {
        UniColors uniColors = UniColors.GRAPHIC_PRIMARY_DYNAMIC;
        return new CrossTagStyle(uniColors.getToken(), uniColors.getToken(), UniColors.GRAPHIC_SECONDARY_INVERTED.getToken(), R$drawable.o2_tag_cross);
    }

    private static final CrossTagStyle getStyleForSecondaryCrossTagStyle() {
        UniColors uniColors = UniColors.BG_ACTION_PRIMARY;
        return new CrossTagStyle(uniColors.getToken(), uniColors.getToken(), UniColors.GRAPHIC_SECONDARY.getToken(), R$drawable.o2_tag_cross_clear);
    }

    @NotNull
    public static final CrossTagStyle toCrossTagStyle(TagV3Atom.CrossTagAtom.ThemeType themeType) {
        int i11 = themeType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[themeType.ordinal()];
        if (i11 != 1 && i11 == 2) {
            return getStyleForSecondaryCrossTagStyle();
        }
        return getStyleForPrimaryCrossTagStyle();
    }
}

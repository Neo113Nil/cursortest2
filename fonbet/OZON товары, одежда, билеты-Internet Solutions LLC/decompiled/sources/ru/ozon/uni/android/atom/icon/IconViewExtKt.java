package ru.ozon.uni.android.atom.icon;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.icon.data.IconAddonWrapperPreset;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"withIconViewPreset", "Lru/ozon/uni/android/atom/icon/IconView;", "preset", "Lru/ozon/uni/android/cell/icon/data/IconAddonWrapperPreset;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconViewExtKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconDTO.ContentType.values().length];
            try {
                iArr[IconDTO.ContentType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconDTO.ContentType.GRAPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconDTO.ContentType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IconView withIconViewPreset(@NotNull IconView iconView, @NotNull IconAddonWrapperPreset preset) {
        Intrinsics.checkNotNullParameter(iconView, "<this>");
        Intrinsics.checkNotNullParameter(preset, "preset");
        iconView.setSize(preset.getSize());
        iconView.setShape(preset.getHasShape() ? IconDTO.IconShape.SQUIRCLE : IconDTO.IconShape.SHAPE_NONE);
        iconView.setContentType(iconView.getContentType());
        IconDTO.ContentType contentType = iconView.getContentType();
        int i11 = contentType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentType.ordinal()];
        if (i11 == 1) {
            iconView.setLabel(iconView.getLabel());
            return iconView;
        }
        if (i11 != 2) {
            return iconView;
        }
        iconView.setGraphic(iconView.getGraphic());
        return iconView;
    }
}

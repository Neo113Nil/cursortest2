package ru.ozon.uni.android.atom.disclaimer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"setDefaultSize", "", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "setPrimaryStyle", "Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "setCustomStyle", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final void setCustomStyle(@NotNull IconButtonV3View iconButtonV3View) {
        Intrinsics.checkNotNullParameter(iconButtonV3View, "<this>");
        iconButtonV3View.setStyle(ButtonV3DTO.StyleTypes.CUSTOM);
    }

    public static final void setDefaultSize(@NotNull ButtonV3View buttonV3View) {
        Intrinsics.checkNotNullParameter(buttonV3View, "<this>");
        buttonV3View.setSize(ButtonV3DTO.Sizes.SIZE_400);
    }

    public static final void setPrimaryStyle(@NotNull ButtonV3View buttonV3View) {
        Intrinsics.checkNotNullParameter(buttonV3View, "<this>");
        buttonV3View.setStyle(ButtonV3DTO.StyleTypes.ACTION_PRIMARY);
    }

    public static final void setDefaultSize(@NotNull IconView iconView) {
        Intrinsics.checkNotNullParameter(iconView, "<this>");
        iconView.setSize(IconDTO.IconSize.SIZE_300);
    }

    public static final void setDefaultSize(@NotNull IconButtonV3View iconButtonV3View) {
        Intrinsics.checkNotNullParameter(iconButtonV3View, "<this>");
        iconButtonV3View.setSize(IconButtonV3DTO.Sizes.SIZE_300);
    }
}

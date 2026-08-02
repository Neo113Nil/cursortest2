package ru.ozon.uni.android.ds.compose.component.tagbutton;

import S0.InterfaceC3967k;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.loader.DsLoaderSize;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonDefaults;", "", "<init>", "()V", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;", "colors", "selectedColors", "", "multicolor", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;", "style", "(Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonColors;ZLS0/k;II)Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonStyle;", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "State", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "getState$uni_release", "()Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonState;", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "Size", "Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "getSize$uni_release", "()Lru/ozon/uni/android/ds/compose/component/tagbutton/DsTagButtonSize;", "Lru/ozon/uni/core/models/UniIconToken;", "CloseIconToken", "Lru/ozon/uni/core/models/UniIconToken;", "getCloseIconToken$uni_release", "()Lru/ozon/uni/core/models/UniIconToken;", "Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "LoaderSize", "Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "getLoaderSize$uni_release", "()Lru/ozon/uni/android/ds/compose/component/loader/DsLoaderSize;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTagButtonDefaults {

    @NotNull
    public static final DsTagButtonDefaults INSTANCE = new DsTagButtonDefaults();

    @NotNull
    private static final DsTagButtonState State = DsTagButtonState.Default;

    @NotNull
    private static final DsTagButtonSize Size = DsTagButtonSize.Size600;

    @NotNull
    private static final UniIconToken CloseIconToken = UniTheme.INSTANCE.getIconTokens().getIc_s_cross_filled_compact();

    @NotNull
    private static final DsLoaderSize LoaderSize = DsLoaderSize.Size200;
    public static final int $stable = UniIconToken.$stable;

    private DsTagButtonDefaults() {
    }

    @NotNull
    public final UniIconToken getCloseIconToken$uni_release() {
        return CloseIconToken;
    }

    @NotNull
    public final DsLoaderSize getLoaderSize$uni_release() {
        return LoaderSize;
    }

    @NotNull
    public final DsTagButtonSize getSize$uni_release() {
        return Size;
    }

    @NotNull
    public final DsTagButtonState getState$uni_release() {
        return State;
    }

    @NotNull
    public final DsTagButtonStyle style(DsTagButtonColors dsTagButtonColors, DsTagButtonColors dsTagButtonColors2, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        if ((i12 & 1) != 0) {
            dsTagButtonColors = DsTagButtonColors.INSTANCE.m1807default(interfaceC3967k, 6);
        }
        if ((i12 & 2) != 0) {
            dsTagButtonColors2 = DsTagButtonColors.INSTANCE.selected(interfaceC3967k, 6);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return new DsTagButtonStyle(DsTagButtonKt.multicolor(dsTagButtonColors, z11), DsTagButtonKt.multicolor(dsTagButtonColors2, z11));
    }
}

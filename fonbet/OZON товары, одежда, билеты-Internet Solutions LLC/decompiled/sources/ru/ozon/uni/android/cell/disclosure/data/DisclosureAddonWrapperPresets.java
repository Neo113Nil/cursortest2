package ru.ozon.uni.android.cell.disclosure.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonWrapperSettings;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPresets;", "", "<init>", "()V", "Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "image500CenterEnd", "Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "getImage500CenterEnd", "()Lru/ozon/uni/android/cell/disclosure/data/DisclosureAddonWrapperPreset;", "image500CenterStart", "getImage500CenterStart", "image500CenterStart400", "getImage500CenterStart400", "image400CenterEnd", "getImage400CenterEnd", "image400CenterStart", "getImage400CenterStart", "image400CenterStart400", "getImage400CenterStart400", "h2", "getH2", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclosureAddonWrapperPresets {

    @NotNull
    public static final DisclosureAddonWrapperPresets INSTANCE = new DisclosureAddonWrapperPresets();

    @NotNull
    private static final DisclosureAddonWrapperPreset h2;

    @NotNull
    private static final DisclosureAddonWrapperPreset image400CenterEnd;

    @NotNull
    private static final DisclosureAddonWrapperPreset image400CenterStart;

    @NotNull
    private static final DisclosureAddonWrapperPreset image400CenterStart400;

    @NotNull
    private static final DisclosureAddonWrapperPreset image500CenterEnd;

    @NotNull
    private static final DisclosureAddonWrapperPreset image500CenterStart;

    @NotNull
    private static final DisclosureAddonWrapperPreset image500CenterStart400;

    static {
        MainAddonWrapperSettings mainAddonWrapperSettings = MainAddonWrapperSettings.INSTANCE;
        image500CenterEnd = new DisclosureAddonWrapperPreset(24, mainAddonWrapperSettings.getCenterEnd());
        image500CenterStart = new DisclosureAddonWrapperPreset(24, mainAddonWrapperSettings.getCenterStart());
        image500CenterStart400 = new DisclosureAddonWrapperPreset(24, mainAddonWrapperSettings.getCenterStart400());
        image400CenterEnd = new DisclosureAddonWrapperPreset(20, mainAddonWrapperSettings.getCenterEnd());
        image400CenterStart = new DisclosureAddonWrapperPreset(20, mainAddonWrapperSettings.getCenterStart());
        image400CenterStart400 = new DisclosureAddonWrapperPreset(20, mainAddonWrapperSettings.getCenterStart400());
        h2 = new DisclosureAddonWrapperPreset(24, mainAddonWrapperSettings.getH2CenterEnd500());
    }

    private DisclosureAddonWrapperPresets() {
    }

    @NotNull
    public final DisclosureAddonWrapperPreset getH2() {
        return h2;
    }

    @NotNull
    public final DisclosureAddonWrapperPreset getImage400CenterEnd() {
        return image400CenterEnd;
    }

    @NotNull
    public final DisclosureAddonWrapperPreset getImage400CenterStart400() {
        return image400CenterStart400;
    }

    @NotNull
    public final DisclosureAddonWrapperPreset getImage500CenterEnd() {
        return image500CenterEnd;
    }

    @NotNull
    public final DisclosureAddonWrapperPreset getImage500CenterStart400() {
        return image500CenterStart400;
    }
}

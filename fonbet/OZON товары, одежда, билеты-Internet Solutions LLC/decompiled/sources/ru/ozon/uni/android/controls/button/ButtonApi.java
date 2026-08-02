package ru.ozon.uni.android.controls.button;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/android/controls/button/ButtonApi;", "", "", "titleIcon", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "titleIconPosition", "titleIconColor", "", "setTitleIcon", "(Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Integer;)V", "subtitleIcon", "subtitleIconPosition", "subtitleIconColor", "setSubtitleIcon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ButtonApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setSubtitleIcon$default(ButtonApi buttonApi, Integer num, AddonSide addonSide, Integer num2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSubtitleIcon");
            }
            if ((i11 & 2) != 0) {
                addonSide = AddonSide.START;
            }
            if ((i11 & 4) != 0) {
                num2 = null;
            }
            buttonApi.setSubtitleIcon(num, addonSide, num2);
        }

        public static /* synthetic */ void setTitleIcon$default(ButtonApi buttonApi, Integer num, AddonSide addonSide, Integer num2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitleIcon");
            }
            if ((i11 & 2) != 0) {
                addonSide = AddonSide.START;
            }
            if ((i11 & 4) != 0) {
                num2 = null;
            }
            buttonApi.setTitleIcon(num, addonSide, num2);
        }
    }

    void setSubtitleIcon(Integer subtitleIcon, @NotNull AddonSide subtitleIconPosition, Integer subtitleIconColor);

    void setTitleIcon(Integer titleIcon, @NotNull AddonSide titleIconPosition, Integer titleIconColor);
}

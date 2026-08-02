package ru.ozon.uni.android.cell.icon;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.uikitsdk.Color;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/android/cell/icon/IconTitleSubtitleCellApi;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellApi;", "Lru/ozon/uni/android/uikitsdk/Color;", "color", "", "alpha", "", "setIconColor", "(Lru/ozon/uni/android/uikitsdk/Color;F)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IconTitleSubtitleCellApi extends TitleSubtitleCellApi {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void setIconColor$default(IconTitleSubtitleCellApi iconTitleSubtitleCellApi, Color color, float f7, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconColor");
            }
            if ((i11 & 2) != 0) {
                f7 = 1.0f;
            }
            iconTitleSubtitleCellApi.setIconColor(color, f7);
        }
    }

    void setIconColor(@NotNull Color color, float alpha);
}

package ru.ozon.app.android.returns.buttons.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/buttons/data/ReturnActionButtonsDto;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "backgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getButtons", "()Ljava/util/List;", "getBackgroundColor", "()Ljava/lang/String;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionButtonsDto {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final List<ButtonV3DTO> buttons;

    public ReturnActionButtonsDto(List<ButtonV3DTO> list, String str) {
        this.buttons = list;
        this.backgroundColor = str;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }
}

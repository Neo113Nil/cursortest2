package ru.ozon.app.android.ugc.widgets.usersGradesV2.core;

import Tc.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.data.UsersGradesV2DTO;
import ru.ozon.app.android.widgets.separator.SeparatorDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/ugc/widgets/usersGradesV2/core/UsersGradesV2Parser;", "", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "invoke", "", "state", "", "getSeparatorDTO", "Lru/ozon/app/android/widgets/separator/SeparatorDTO;", "height", "", "color", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UsersGradesV2Parser {

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public UsersGradesV2Parser(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
    }

    private final SeparatorDTO getSeparatorDTO(int height, String color) {
        return new SeparatorDTO(null, Integer.valueOf(height), color);
    }

    @NotNull
    public final List<Object> invoke(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        UsersGradesV2DTO usersGradesV2DTO = (UsersGradesV2DTO) this.jsonDeserializer.fromJson(state, UsersGradesV2DTO.class);
        Integer separatorHeight = usersGradesV2DTO.getSeparatorHeight();
        int intValue = separatorHeight != null ? separatorHeight.intValue() : 8;
        String color = usersGradesV2DTO.getColor();
        if (color == null) {
            color = UniColors.LAYER_FLOOR_1.getToken();
        }
        SeparatorDTO separatorDTO = getSeparatorDTO(intValue, color);
        CornerRadius cornerRadius = usersGradesV2DTO.getCornerRadius();
        Float valueOf = cornerRadius != null ? Float.valueOf(ResourceExtKt.toPxF(cornerRadius.getPx())) : null;
        b builder = new b(usersGradesV2DTO.getItems().size() + 1);
        builder.add(separatorDTO);
        Iterator<T> it = usersGradesV2DTO.getItems().iterator();
        while (it.hasNext()) {
            builder.add(UsersGradesV2DTO.ContextQuestionItemDTO.copy$default((UsersGradesV2DTO.ContextQuestionItemDTO) it.next(), null, null, false, null, null, usersGradesV2DTO.getColor(), usersGradesV2DTO.getSeparatorHeight(), valueOf, 31, null));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}

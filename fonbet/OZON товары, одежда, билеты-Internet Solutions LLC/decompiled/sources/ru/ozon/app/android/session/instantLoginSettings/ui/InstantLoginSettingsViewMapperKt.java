package ru.ozon.app.android.session.instantLoginSettings.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.session.instantLoginSettings.models.InstantLoginSettingsDTO;
import ru.ozon.app.android.session.instantLoginSettings.models.InstantLoginSettingsVO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003*@\b\u0002\u0010\b\"\u001a\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u00042\u001e\u0012\u0004\u0012\u00020\u0000\u0012\b\u0012\u00060\u0007j\u0002`\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00060\u0004¨\u0006\t"}, d2 = {"Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsDTO;", "Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "toVO", "(Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsDTO;)Lru/ozon/app/android/session/instantLoginSettings/models/InstantLoginSettingsVO;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Ll20/d;", "Mapper", "session_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InstantLoginSettingsViewMapperKt {
    @NotNull
    public static final InstantLoginSettingsVO toVO(@NotNull InstantLoginSettingsDTO instantLoginSettingsDTO) {
        Intrinsics.checkNotNullParameter(instantLoginSettingsDTO, "<this>");
        return new InstantLoginSettingsVO((((Object) instantLoginSettingsDTO.getTitle().getText()) + " " + ((Object) instantLoginSettingsDTO.getSubTitle().getText())).hashCode(), AtomActionMapperKt.toAtomAction(instantLoginSettingsDTO.getActionTurnOn(), null), AtomActionMapperKt.toAtomAction(instantLoginSettingsDTO.getActionTurnOff(), null), new CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle(instantLoginSettingsDTO.isEnabled(), instantLoginSettingsDTO.getTitle().getText(), instantLoginSettingsDTO.getTitle().getTextColor(), instantLoginSettingsDTO.getSubTitle().getText(), instantLoginSettingsDTO.getSubTitle().getTextColor(), null, null, null, false, false, null, null, null, 8160, null));
    }
}

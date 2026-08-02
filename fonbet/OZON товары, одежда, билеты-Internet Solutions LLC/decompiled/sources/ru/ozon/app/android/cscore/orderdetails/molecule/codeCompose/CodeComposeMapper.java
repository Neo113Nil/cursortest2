package ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose;

import WZ.t;
import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeDTO;
import ru.ozon.app.android.cscore.orderdetails.molecule.codeCompose.CodeComposeVI;
import ru.ozon.app.android.cscore.padding.PaddingCompose;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeMapper;", "", "<init>", "()V", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO$IslandSettings;", "Ll20/d;", "info", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;", "toVi", "(Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO$IslandSettings;Ll20/d;)Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI$IslandSettings;", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO;", "state", "Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "map", "(Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeDTO;Ll20/d;)Lru/ozon/app/android/cscore/orderdetails/molecule/codeCompose/CodeComposeVI;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CodeComposeMapper {
    private final CodeComposeVI.IslandSettings toVi(CodeComposeDTO.IslandSettings islandSettings, d dVar) {
        AtomActionDTO action;
        String islandColor = islandSettings.getIslandColor();
        CornerRadius islandCornerRadius = islandSettings.getIslandCornerRadius();
        PaddingCompose padding = islandSettings.getPadding();
        Map<String, TokenizedTrackingInfo> trackingInfo = islandSettings.getTrackingInfo();
        AtomAction atomAction = null;
        t d11 = trackingInfo != null ? x.d(trackingInfo, dVar) : null;
        CommonControlSettings common = islandSettings.getCommon();
        if (common != null && (action = common.getAction()) != null) {
            atomAction = AtomActionMapperKt.toAtomAction(action, islandSettings.getCommon().getTrackingInfo());
        }
        return new CodeComposeVI.IslandSettings(islandColor, islandCornerRadius, padding, d11, atomAction);
    }

    @NotNull
    public final CodeComposeVI map(@NotNull CodeComposeDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return new CodeComposeVI(info.d().hashCode(), toVi(state.getSettings(), info), state.getTitle(), state.getTitleIcon(), state.getSubtitle(), state.getTestInfo());
    }
}

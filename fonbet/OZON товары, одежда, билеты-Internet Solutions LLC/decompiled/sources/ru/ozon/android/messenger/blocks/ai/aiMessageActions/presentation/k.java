package ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

/* loaded from: classes10.dex */
public final class k {
    public static final void a(@NotNull CommonControlSettings commonControlSettings, @NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, @NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(commonControlSettings, "<this>");
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(params, "params");
        Map<String, TokenizedTrackingInfo> trackingInfo = commonControlSettings.getTrackingInfo();
        if (trackingInfo != null) {
            messengerController.m(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
        }
        AtomActionDTO action = commonControlSettings.getAction();
        if (action != null) {
            messengerController.q(ru.ozon.android.messenger.framework.navigation.action.b.d(action, params));
        }
    }
}

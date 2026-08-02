package ru.ozon.android.messenger.blocks.emptystate;

import android.content.Context;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.emptystate.g;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.domain.f;
import ru.ozon.android.messenger.framework.presentation.ai.Z;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.v;
import ru.ozon.android.messenger.utils.n;
import ru.ozon.android.networkinfo.models.NetworkInfo;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class a extends e {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f85081d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f85082e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.initialization.d f85083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull ru.ozon.android.messenger.framework.core.initialization.d config, @NotNull d.b blockCustomSettings) {
        super(context, blockStore, blockCustomSettings);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f85081d = context;
        this.f85082e = blockStore;
        this.f85083f = config;
    }

    @Override // ru.ozon.android.messenger.blocks.emptystate.e
    @NotNull
    public final List<q> e(@NotNull NetworkInfo networkInfo, @NotNull j emptyStatePlace, g gVar) {
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        return m((g.a) gVar);
    }

    @NotNull
    public final Tc.b m(g.a aVar) {
        ru.ozon.android.messenger.framework.presentation.models.c a11 = ru.ozon.android.messenger.framework.presentation.models.h.a(n.a());
        Tc.b builder = C7714v.B();
        ru.ozon.android.messenger.framework.core.initialization.d dVar = this.f85083f;
        builder.add(Z.a(this.f85082e, dVar.getAiAssistantCustomSettings().c(), dVar.getAiAssistantCustomSettings().b()));
        n.a aVar2 = new n.a(R$drawable.ic_notification_warning);
        TextDTO f7 = f(R$string.messenger_error_smth_went_wrong_title);
        TextDTO c11 = c(R$string.messenger_ai_assistant_error_description);
        String d11 = ru.ozon.android.messenger.utils.c.d(R$string.messenger_action_update, this.f85081d);
        builder.add(v.d(e.l(this, new ru.ozon.android.messenger.blocks.emptystate.v2.g(a11, null, aVar2, f7, c11, Boolean.TRUE, C7714v.a0(new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_600, d11, null, null, null, Boolean.FALSE, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, null, null, null, 14, null), null, null, 6, null), null, null, null, null, 253880, null)), ru.ozon.android.messenger.blocks.emptystate.v2.a.VERTICAL, null, aVar, 1184), f.c.EMPTY_STATE, 2), a11.a()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}

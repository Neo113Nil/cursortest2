package ru.ozon.android.messenger.blocks.emptystate;

import android.content.Context;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.domain.f;
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
import ru.ozon.uni.atoms.data.image.ImageDTO;

/* loaded from: classes10.dex */
public final class c extends e {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Context f85088d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.b f85089e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, @NotNull ru.ozon.android.messenger.framework.data.b blockStore, @NotNull d.b blockCustomSettings) {
        super(context, blockStore, blockCustomSettings);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockStore, "blockStore");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f85088d = context;
        this.f85089e = blockStore;
    }

    public static q m(c cVar) {
        String itemId = n.a();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        return v.d(e.l(cVar, new ru.ozon.android.messenger.blocks.emptystate.v2.g(ru.ozon.android.messenger.framework.presentation.models.h.a(itemId), n(), new n.a(R$drawable.m_search_m), cVar.i(R$string.messenger_specify_your_request), cVar.c(R$string.messenger_minimum_number_of_characters_for_search), Boolean.TRUE, null, null, null, null, 2976), f.c.EMPTY_STATE, 2), ru.ozon.android.messenger.utils.n.a());
    }

    private static ImageDTO n() {
        return new ImageDTO(null, null, null, false, null, null, null, null, null, null, null, null, 104, ImageDTO.ImageType.FIX, null, null, 53247, null);
    }

    @Override // ru.ozon.android.messenger.blocks.emptystate.e
    @NotNull
    protected final ButtonV3DTO a(int i11) {
        String d11 = ru.ozon.android.messenger.utils.c.d(i11, this.f85088d);
        return new ButtonV3DTO(ButtonV3DTO.StyleTypes.ACTION_PRIMARY, ButtonV3DTO.Sizes.SIZE_400, d11, null, null, null, Boolean.FALSE, null, null, null, null, null, null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.BEHAVIOR_TYPE_REFRESH, "", null, null, 12, null), null, null, 6, null), null, null, null, null, 253880, null);
    }

    @Override // ru.ozon.android.messenger.blocks.emptystate.e
    @NotNull
    public final List<q> e(@NotNull NetworkInfo networkInfo, @NotNull j emptyStatePlace, g gVar) {
        Intrinsics.checkNotNullParameter(networkInfo, "networkInfo");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        String a11 = ru.ozon.android.messenger.utils.n.a();
        if (!(networkInfo instanceof NetworkInfo.Available)) {
            return g(ru.ozon.android.messenger.framework.presentation.models.h.a(a11), emptyStatePlace);
        }
        return j(ru.ozon.android.messenger.framework.presentation.models.h.a(a11), R$string.messenger_error_smth_went_wrong_title, R$string.messenger_try_searching_again, emptyStatePlace);
    }

    @Override // ru.ozon.android.messenger.blocks.emptystate.e
    @NotNull
    protected final Tc.b g(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, @NotNull j emptyStatePlace) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        Tc.b builder = C7714v.B();
        builder.add(v.d(e.l(this, new ru.ozon.android.messenger.blocks.emptystate.v2.g(blockId, n(), new n.a(R$drawable.m_wifi_off_m), i(R$string.messenger_no_internet), c(R$string.messenger_error_retry_alert), Boolean.TRUE, C7714v.a0(a(R$string.messenger_action_update)), null, null, null, 3744), f.c.EMPTY_STATE, 2), blockId.a()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    @Override // ru.ozon.android.messenger.blocks.emptystate.e
    @NotNull
    protected final Tc.b j(@NotNull ru.ozon.android.messenger.framework.presentation.models.c blockId, int i11, int i12, @NotNull j emptyStatePlace) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(emptyStatePlace, "emptyStatePlace");
        Tc.b builder = C7714v.B();
        builder.add(v.d(e.l(this, new ru.ozon.android.messenger.blocks.emptystate.v2.g(blockId, n(), new n.a(R$drawable.m_message_crack_lighting_m), i(i11), c(i12), null, C7714v.a0(a(R$string.messenger_repeat_search)), null, null, null, 3808), null, 3), blockId.a()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}

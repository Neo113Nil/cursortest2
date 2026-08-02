package ru.ozon.android.messenger.blocks.chat.common;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.framework.presentation.models.p;

/* loaded from: classes10.dex */
public abstract class h<State, VO extends ru.ozon.android.messenger.framework.presentation.models.g> extends ru.ozon.android.messenger.framework.core.viewmapper.d<State, VO> {
    @NotNull
    public abstract Function2<InterfaceC3967k, Integer, Unit> a(@NotNull androidx.compose.ui.e eVar, @NotNull VO vo, @NotNull ru.ozon.android.messenger.framework.core.d dVar);

    public Function2<InterfaceC3967k, Integer, Unit> b(@NotNull androidx.compose.ui.e modifier, @NotNull VO blockVO, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(blockVO, "blockVO");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(references, "references");
        return null;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final ru.ozon.android.messenger.framework.core.viewmapper.e getViewMapperType() {
        return e.a.f87374a;
    }
}

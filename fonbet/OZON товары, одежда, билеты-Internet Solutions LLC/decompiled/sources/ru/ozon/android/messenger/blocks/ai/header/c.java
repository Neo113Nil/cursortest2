package ru.ozon.android.messenger.blocks.ai.header;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function1<AtomActionDTO, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f84109b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AtomActionDTO atomActionDTO) {
        this.f84109b.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(atomActionDTO));
        return Unit.f71690a;
    }
}

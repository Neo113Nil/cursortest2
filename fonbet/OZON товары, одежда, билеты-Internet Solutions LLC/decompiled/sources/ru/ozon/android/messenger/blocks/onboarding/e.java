package ru.ozon.android.messenger.blocks.onboarding;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.g;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.databinding.MBlockOnboardingBinding;

/* loaded from: classes10.dex */
public final class e extends q<b, MBlockOnboardingBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockOnboardingBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85951a = references;
    }

    public static void b(e eVar) {
        eVar.f85951a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(ru.ozon.android.messenger.utils.a.a(g.HIDE)));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        withBinding(new c(block, this));
        ru.ozon.android.messenger.framework.presentation.chatlist.popup.d a11 = ru.ozon.android.messenger.framework.presentation.chatlist.popup.e.a(this.f85951a);
        if (a11 != null) {
            a11.l(new d(block, this));
        }
    }
}

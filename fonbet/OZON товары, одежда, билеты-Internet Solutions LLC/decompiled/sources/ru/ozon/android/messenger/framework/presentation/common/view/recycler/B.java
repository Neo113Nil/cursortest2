package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import X4.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;

/* loaded from: classes10.dex */
public abstract class B<T extends ru.ozon.android.messenger.framework.presentation.models.g, B extends X4.a> extends q<T, B> implements A {

    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(@NotNull MBlockChatBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
    }

    public abstract void b(B90.D d11);
}

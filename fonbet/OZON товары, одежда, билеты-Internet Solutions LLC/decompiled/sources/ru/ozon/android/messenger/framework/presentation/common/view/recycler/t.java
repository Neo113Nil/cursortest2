package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.databinding.MNoTypeLayoutBinding;

/* loaded from: classes10.dex */
public final class t extends k {

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final MNoTypeLayoutBinding f91268h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(@NotNull MNoTypeLayoutBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull C9512c blockCache) {
        super(r0, references, blockCache);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(blockCache, "blockCache");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.f91268h = binding;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.k
    public final void f(@NotNull ru.ozon.android.messenger.framework.presentation.models.q item, Object obj) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(item, "item");
        LinearLayout constraintLayout = this.f91268h.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        g(constraintLayout, item);
    }
}

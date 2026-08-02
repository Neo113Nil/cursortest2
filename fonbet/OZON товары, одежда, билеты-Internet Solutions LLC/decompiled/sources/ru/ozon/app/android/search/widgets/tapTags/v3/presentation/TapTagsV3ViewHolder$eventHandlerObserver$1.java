package ru.ozon.app.android.search.widgets.tapTags.v3.presentation;

import Sc.InterfaceC4003e;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class TapTagsV3ViewHolder$eventHandlerObserver$1 implements W, InterfaceC7732n {
    final /* synthetic */ TapTagsV3ViewHolder $tmp0;

    TapTagsV3ViewHolder$eventHandlerObserver$1(TapTagsV3ViewHolder tapTagsV3ViewHolder) {
        this.$tmp0 = tapTagsV3ViewHolder;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof W) && (obj instanceof InterfaceC7732n)) {
            return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC7732n
    public final InterfaceC4003e<?> getFunctionDelegate() {
        return new C7735q(1, this.$tmp0, TapTagsV3ViewHolder.class, "busEventHandler", "busEventHandler(Lru/ozon/composer/event/ComposerEvent;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(A00.a p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        this.$tmp0.busEventHandler(p02);
    }
}

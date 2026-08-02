package com.vk.music.stickyplayer;

import android.view.View;
import com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior;
import xsna.epx;

/* compiled from: StickyMusicPlayerBottomSheetBehavior.kt */
/* loaded from: classes3.dex */
public final class StickyMusicPlayerBottomSheetBehavior extends PersistentBottomSheetBehavior {
    @Override // com.vk.core.dialogs.bottomsheet.PersistentBottomSheetBehavior, com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior
    public final boolean F(View view) {
        return (view != null && epx.f(view.getTag(), "AndroidComposeView") && view.isNestedScrollingEnabled()) || super.F(view);
    }
}

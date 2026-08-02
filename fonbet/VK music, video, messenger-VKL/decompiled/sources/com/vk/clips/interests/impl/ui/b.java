package com.vk.clips.interests.impl.ui;

import android.view.View;
import com.vk.clips.design.view.interests.NextButton;
import com.vk.clips.interests.impl.ui.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.xn50;

/* compiled from: ClipsInterestsFragment.kt */
/* loaded from: classes16.dex */
public final class b implements NextButton.a {
    public final /* synthetic */ ClipsInterestsFragment a;

    /* compiled from: ClipsInterestsFragment.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NextButton.ClickType.values().length];
            try {
                iArr[NextButton.ClickType.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextButton.ClickType.SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ClipsInterestsFragment clipsInterestsFragment) {
        this.a = clipsInterestsFragment;
    }

    @Override // com.vk.clips.design.view.interests.NextButton.a
    public final void a(View view, NextButton.ClickType clickType) {
        int i = a.$EnumSwitchMapping$0[clickType.ordinal()];
        ClipsInterestsFragment clipsInterestsFragment = this.a;
        if (i == 1) {
            a.d dVar = a.d.b;
            clipsInterestsFragment.getClass();
            xn50.a.c(clipsInterestsFragment, dVar);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a.g gVar = a.g.b;
            clipsInterestsFragment.getClass();
            xn50.a.c(clipsInterestsFragment, gVar);
        }
        view.performHapticFeedback(0);
    }
}

package com.vk.clips.design.view.camera.widgets;

import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.dto.hints.HintId;
import com.vk.dto.stories.entities.StoryCameraMode;
import java.util.ArrayList;
import xsna.j5g;

/* compiled from: TabsRecycler.kt */
/* loaded from: classes.dex */
public final class b implements TabsRecycler.b {
    public final /* synthetic */ TabsRecycler b;

    public b(TabsRecycler tabsRecycler) {
        this.b = tabsRecycler;
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.b
    public final void b(int i, boolean z) {
        TabsRecycler.a hintsDelegate;
        TabsRecycler tabsRecycler = this.b;
        StoryCameraMode storyCameraMode = (StoryCameraMode) j5g.b0(i, tabsRecycler.getItems());
        if (storyCameraMode == null || !storyCameraMode.i() || (hintsDelegate = tabsRecycler.getHintsDelegate()) == null) {
            return;
        }
        HintId hintId = HintId.INFO_CLIPS_CAMERA_MODE;
        if (hintsDelegate.a(hintId.getId())) {
            TabsRecycler.a hintsDelegate2 = tabsRecycler.getHintsDelegate();
            if (hintsDelegate2 != null) {
                hintsDelegate2.b(hintId.getId());
            }
            tabsRecycler.c(i, new ArrayList(tabsRecycler.getItems()));
        }
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.b
    public final void e(float f, int i, int i2) {
    }
}

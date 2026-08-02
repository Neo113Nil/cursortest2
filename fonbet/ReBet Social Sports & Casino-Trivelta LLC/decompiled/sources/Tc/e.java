package Tc;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public interface e {
    boolean a();

    boolean getBackButtonHidden();

    Drawable getBackButtonIcon();

    Integer getBackButtonTintColor();

    com.swmansion.rnscreens.gamma.stack.header.subview.d getBackgroundSubview();

    com.swmansion.rnscreens.gamma.stack.header.subview.d getCenterSubview();

    boolean getHidden();

    com.swmansion.rnscreens.gamma.stack.header.subview.d getLeadingSubview();

    boolean getScrollFlagEnterAlways();

    boolean getScrollFlagEnterAlwaysCollapsed();

    boolean getScrollFlagExitUntilCollapsed();

    boolean getScrollFlagScroll();

    boolean getScrollFlagSnap();

    String getTitle();

    com.swmansion.rnscreens.gamma.stack.header.subview.d getTrailingSubview();

    boolean getTransparent();

    f getType();

    void j(int i10, int i11, int i12);

    void setOnConfigChangeListener(b bVar);
}

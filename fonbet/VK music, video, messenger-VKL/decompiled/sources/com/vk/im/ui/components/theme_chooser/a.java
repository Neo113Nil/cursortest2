package com.vk.im.ui.components.theme_chooser;

/* compiled from: StateChangeMonitor.kt */
/* loaded from: classes2.dex */
public final class a {
    public ThemeChooserState a;
    public ThemeChooserState b;

    public final void a(ThemeChooserState themeChooserState) {
        if (themeChooserState.b()) {
            this.a = themeChooserState;
        } else {
            this.b = themeChooserState;
        }
    }
}

package ru.ozon.app.android.debug;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/debug/WidgetsDebugToolsInteractorImpl;", "Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "prefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "isBorderEnabled", "", "getTextSize", "", "getTextColor", "", "getBubbleColor", "getBorderColor", "getAlpha", "switchBordersEnabled", "", "isEnabled", "setTextSize", "textSize", "setTextColor", "context", "Landroid/content/Context;", "textColor", "setBubbleColor", "color", "setBorderColor", "setAlpha", "alpha", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetsDebugToolsInteractorImpl implements WidgetsDebugToolsInteractor {

    @NotNull
    private final SharedPreferences prefs;

    public WidgetsDebugToolsInteractorImpl(@NotNull SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public int getAlpha() {
        return this.prefs.getInt("PREF_WIDGETS_DEBUG_TOOLS_ALPHA", 190);
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    @NotNull
    public String getBorderColor() {
        String string = this.prefs.getString("PREF_WIDGETS_DEBUG_TOOLS_BORDER_COLOR", "ozRed");
        return string == null ? "ozRed" : string;
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    @NotNull
    public String getBubbleColor() {
        String string = this.prefs.getString("PREF_WIDGETS_DEBUG_TOOLS_BUBBLE_COLOR", "ozRed");
        return string == null ? "ozRed" : string;
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    @NotNull
    public String getTextColor() {
        String string = this.prefs.getString("PREF_WIDGETS_DEBUG_TOOLS_TEXT_COLOR", "ozWhite");
        return string == null ? "ozWhite" : string;
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public int getTextSize() {
        return this.prefs.getInt("PREF_WIDGETS_DEBUG_TOOLS_TEXT_SIZE", 9);
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public boolean isBorderEnabled() {
        return this.prefs.getBoolean("PREF_WIDGETS_DEBUG_TOOLS_BORDERS_ENABLED", false);
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public void setAlpha(int alpha) {
        this.prefs.edit().putInt("PREF_WIDGETS_DEBUG_TOOLS_ALPHA", alpha).apply();
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public void setBorderColor(@NotNull Context context, @NotNull String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        this.prefs.edit().putString("PREF_WIDGETS_DEBUG_TOOLS_BORDER_COLOR", color).apply();
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public void setBubbleColor(@NotNull Context context, @NotNull String color) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        this.prefs.edit().putString("PREF_WIDGETS_DEBUG_TOOLS_BUBBLE_COLOR", color).apply();
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public void setTextColor(@NotNull Context context, @NotNull String textColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        this.prefs.edit().putString("PREF_WIDGETS_DEBUG_TOOLS_TEXT_COLOR", textColor).apply();
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public void setTextSize(@NotNull String textSize) {
        Intrinsics.checkNotNullParameter(textSize, "textSize");
        SharedPreferences.Editor edit = this.prefs.edit();
        Integer w02 = h.w0(textSize);
        edit.putInt("PREF_WIDGETS_DEBUG_TOOLS_TEXT_SIZE", w02 != null ? w02.intValue() : 9).apply();
    }

    @Override // ru.ozon.app.android.debug.WidgetsDebugToolsInteractor
    public void switchBordersEnabled(boolean isEnabled) {
        this.prefs.edit().putBoolean("PREF_WIDGETS_DEBUG_TOOLS_BORDERS_ENABLED", isEnabled).apply();
    }
}

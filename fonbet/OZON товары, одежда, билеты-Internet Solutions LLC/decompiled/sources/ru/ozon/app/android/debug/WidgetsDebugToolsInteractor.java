package ru.ozon.app.android.debug;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH&J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\u0014\u001a\u00020\u000bH&J\b\u0010\u0015\u001a\u00020\u000bH&J\b\u0010\u0016\u001a\u00020\bH&J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\bH&¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "", "isBorderEnabled", "", "switchBordersEnabled", "", "isEnabled", "getTextSize", "", "setTextSize", "textSize", "", "setTextColor", "context", "Landroid/content/Context;", "textColor", "getTextColor", "setBubbleColor", "color", "setBorderColor", "getBubbleColor", "getBorderColor", "getAlpha", "setAlpha", "alpha", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WidgetsDebugToolsInteractor {
    int getAlpha();

    @NotNull
    String getBorderColor();

    @NotNull
    String getBubbleColor();

    @NotNull
    String getTextColor();

    int getTextSize();

    boolean isBorderEnabled();

    void setAlpha(int alpha);

    void setBorderColor(@NotNull Context context, @NotNull String color);

    void setBubbleColor(@NotNull Context context, @NotNull String color);

    void setTextColor(@NotNull Context context, @NotNull String textColor);

    void setTextSize(@NotNull String textSize);

    void switchBordersEnabled(boolean isEnabled);
}

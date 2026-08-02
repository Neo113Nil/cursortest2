package com.usercentrics.sdk.ui.color;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PredefinedUIColorMachine.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/usercentrics/sdk/ui/color/PredefinedUIColorMachine;", "", "()V", "white", "Lcom/usercentrics/sdk/ui/color/Color;", "generateShadedColor", "Lcom/usercentrics/sdk/ui/color/UsercentricsShadedColor;", "baseHexColor", "", "lightenColor", "amount", "", "shadedColorBy", "baseColor", "percentage", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PredefinedUIColorMachine {
    public static final PredefinedUIColorMachine INSTANCE = new PredefinedUIColorMachine();
    private static final Color white = new Color(255, 255, 255);

    private PredefinedUIColorMachine() {
    }

    public final UsercentricsShadedColor generateShadedColor(String baseHexColor) {
        Intrinsics.checkNotNullParameter(baseHexColor, "baseHexColor");
        Color fromHex = Color.INSTANCE.fromHex(baseHexColor);
        return new UsercentricsShadedColor(fromHex.toHex(), shadedColorBy(fromHex, 0.8d), shadedColorBy(fromHex, 0.16d), shadedColorBy(fromHex, 0.02d));
    }

    public final String lightenColor(String baseHexColor, double amount) {
        Intrinsics.checkNotNullParameter(baseHexColor, "baseHexColor");
        Color fromHex = Color.INSTANCE.fromHex(baseHexColor);
        double d = 255 * amount;
        return new Color((int) Math.min(255.0d, fromHex.getRed() + d), (int) Math.min(255.0d, fromHex.getGreen() + d), (int) Math.min(255.0d, fromHex.getBlue() + d)).toHex();
    }

    private final String shadedColorBy(Color baseColor, double percentage) {
        double d = 1;
        double d2 = (((percentage * 2) - d) + d) / 2.0d;
        double d3 = d - d2;
        Color color = white;
        return new Color((int) Math.floor((baseColor.getRed() * d2) + (color.getRed() * d3)), (int) Math.floor((baseColor.getGreen() * d2) + (color.getGreen() * d3)), (int) Math.floor((baseColor.getBlue() * d2) + (color.getBlue() * d3))).toHex();
    }
}

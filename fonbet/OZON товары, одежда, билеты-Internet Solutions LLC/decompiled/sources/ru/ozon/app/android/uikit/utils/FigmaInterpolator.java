package ru.ozon.app.android.uikit.utils;

import Sc.InterfaceC4008j;
import Sc.k;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0011\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0014\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\rR\u001b\u0010\u0017\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\rR\u001b\u0010\u001a\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\rR\u001b\u0010\u001d\u001a\u00020\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/uikit/utils/FigmaInterpolator;", "", "<init>", "()V", "Landroid/view/animation/LinearInterpolator;", "linear$delegate", "LSc/j;", "getLinear", "()Landroid/view/animation/LinearInterpolator;", "linear", "Landroid/view/animation/PathInterpolator;", "easeIn$delegate", "getEaseIn", "()Landroid/view/animation/PathInterpolator;", "easeIn", "easeOut$delegate", "getEaseOut", "easeOut", "easeInAndOut$delegate", "getEaseInAndOut", "easeInAndOut", "easeInBack$delegate", "getEaseInBack", "easeInBack", "easeOutBack$delegate", "getEaseOutBack", "easeOutBack", "easeInAndOutBack$delegate", "getEaseInAndOutBack", "easeInAndOutBack", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FigmaInterpolator {

    @NotNull
    public static final FigmaInterpolator INSTANCE = new FigmaInterpolator();

    /* renamed from: linear$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j linear = k.b(FigmaInterpolator$linear$2.INSTANCE);

    /* renamed from: easeIn$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j easeIn = k.b(FigmaInterpolator$easeIn$2.INSTANCE);

    /* renamed from: easeOut$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j easeOut = k.b(FigmaInterpolator$easeOut$2.INSTANCE);

    /* renamed from: easeInAndOut$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j easeInAndOut = k.b(FigmaInterpolator$easeInAndOut$2.INSTANCE);

    /* renamed from: easeInBack$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j easeInBack = k.b(FigmaInterpolator$easeInBack$2.INSTANCE);

    /* renamed from: easeOutBack$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j easeOutBack = k.b(FigmaInterpolator$easeOutBack$2.INSTANCE);

    /* renamed from: easeInAndOutBack$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC4008j easeInAndOutBack = k.b(FigmaInterpolator$easeInAndOutBack$2.INSTANCE);

    private FigmaInterpolator() {
    }

    @NotNull
    public final PathInterpolator getEaseIn() {
        return (PathInterpolator) easeIn.getValue();
    }

    @NotNull
    public final PathInterpolator getEaseInAndOut() {
        return (PathInterpolator) easeInAndOut.getValue();
    }

    @NotNull
    public final PathInterpolator getEaseOut() {
        return (PathInterpolator) easeOut.getValue();
    }

    @NotNull
    public final LinearInterpolator getLinear() {
        return (LinearInterpolator) linear.getValue();
    }
}

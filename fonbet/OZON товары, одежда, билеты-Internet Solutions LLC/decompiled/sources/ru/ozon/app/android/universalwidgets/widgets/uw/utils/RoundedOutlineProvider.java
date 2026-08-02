package ru.ozon.app.android.universalwidgets.widgets.uw.utils;

import Sc.o;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundedOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "", "radius", "", "drawShadow", "<init>", "(IZ)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "I", "Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "roundMode", "Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "getRoundMode", "()Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;", "setRoundMode", "(Lru/ozon/app/android/universalwidgets/widgets/uw/utils/RoundMode;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedOutlineProvider extends ViewOutlineProvider {
    private final boolean drawShadow;
    private final int radius;

    @NotNull
    private RoundMode roundMode = RoundMode.ALL;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoundMode.values().length];
            try {
                iArr[RoundMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundMode.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundMode.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RoundedOutlineProvider(int i11, boolean z11) {
        this.radius = i11;
        this.drawShadow = z11;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        if (view == null) {
            return;
        }
        if (outline != null) {
            outline.setAlpha(this.drawShadow ? 1.0f : 0.0f);
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.roundMode.ordinal()];
        if (i11 == 1) {
            if (outline != null) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius);
            }
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new o();
                }
                if (outline != null) {
                    outline.setRoundRect(0, 0 - this.radius, view.getWidth(), view.getHeight(), this.radius);
                    return;
                }
                return;
            }
            if (outline != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                int i12 = this.radius;
                outline.setRoundRect(0, 0, width, height + i12, i12);
            }
        }
    }

    public final void setRoundMode(@NotNull RoundMode roundMode) {
        Intrinsics.checkNotNullParameter(roundMode, "<set-?>");
        this.roundMode = roundMode;
    }
}

package ru.ozon.uni.android.atom.tabs;

import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/android/atom/tabs/TabShadowOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "", "tabCornerRadius", "<init>", "(I)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "I", "getTabCornerRadius$uni_release", "()I", "shadowColor", "getShadowColor", "setShadowColor", "topLeftOffset", "rightOffset", "bottomOffset", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabShadowOutlineProvider extends ViewOutlineProvider {
    private final int tabCornerRadius;
    public static final int $stable = 8;
    private int shadowColor = Color.argb(100, 0, 26, 52);
    private final int topLeftOffset = UiExtKt.toPx(2);
    private final int rightOffset = UiExtKt.toPx(0.7f);
    private final int bottomOffset = UiExtKt.toPx(1.5f);

    public TabShadowOutlineProvider(int i11) {
        this.tabCornerRadius = i11;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(@NotNull View view, @NotNull Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        int i11 = this.topLeftOffset;
        outline.setRoundRect(i11, i11, view.getWidth() + this.rightOffset, view.getHeight() + this.bottomOffset, UiExtKt.toPxF(this.tabCornerRadius - 1));
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }
}

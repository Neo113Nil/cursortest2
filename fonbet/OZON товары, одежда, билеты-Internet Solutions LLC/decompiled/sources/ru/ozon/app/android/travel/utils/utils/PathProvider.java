package ru.ozon.app.android.travel.utils.utils;

import android.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ(\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJ@\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/utils/utils/PathProvider;", "", "<init>", "()V", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "fillBorder", "", "width", "", "height", "radius", "strokeWidth", "fillBackground", "offset", "fillBorderWithAnchor", "anchorWidth", "anchorHeight", "shadowOffset", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PathProvider {

    @NotNull
    private final Path path = new Path();

    public final void fillBackground(float width, float height, float radius, float offset) {
        Path path = this.path;
        path.rewind();
        float f7 = radius + offset;
        path.moveTo(f7, offset);
        float f11 = (width - radius) - offset;
        path.lineTo(f11, offset);
        float f12 = width - offset;
        path.quadTo(f12, offset, f12, f7);
        float f13 = (height - radius) - offset;
        path.lineTo(f12, f13);
        float f14 = height - offset;
        path.quadTo(f12, f14, f11, f14);
        path.lineTo(f7, f14);
        path.quadTo(offset, f14, offset, f13);
        path.lineTo(offset, f7);
        path.quadTo(offset, offset, f7, offset);
    }

    public final void fillBorder(float width, float height, float radius, float strokeWidth) {
        float f7 = strokeWidth / 2;
        Path path = this.path;
        path.rewind();
        float f11 = radius + f7;
        path.moveTo(f11, f7);
        float f12 = (width - radius) - f7;
        path.lineTo(f12, f7);
        float f13 = width - f7;
        path.quadTo(f13, f7, f13, f11);
        float f14 = (height - radius) - f7;
        path.lineTo(f13, f14);
        float f15 = height - f7;
        path.quadTo(f13, f15, f12, f15);
        path.lineTo(f11, f15);
        path.quadTo(f7, f15, f7, f14);
        path.lineTo(f7, f11);
        path.quadTo(f7, f7, f11, f7);
    }

    public final void fillBorderWithAnchor(float width, float height, float radius, float strokeWidth, float anchorWidth, float anchorHeight, float shadowOffset) {
        float f7 = 2;
        float f11 = strokeWidth / f7;
        float f12 = shadowOffset + f11;
        float f13 = width / f7;
        float f14 = anchorWidth / f7;
        Path path = this.path;
        path.rewind();
        float f15 = radius + f12;
        path.moveTo(f15, f12);
        float f16 = (width - radius) - f12;
        path.lineTo(f16, f12);
        float f17 = width - f12;
        path.quadTo(f17, f12, f17, f15);
        float f18 = (height - radius) - f12;
        path.lineTo(f17, f18);
        float f19 = height - f12;
        path.quadTo(f17, f19, f16, f19);
        path.lineTo((f13 - f11) + f14, f19);
        path.lineTo(f13, anchorHeight + f19);
        path.lineTo((f13 + f11) - f14, f19);
        path.lineTo(f15, f19);
        path.quadTo(f12, f19, f12, f18);
        path.lineTo(f12, f15);
        path.quadTo(f12, f12, f15, f12);
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }
}

package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/model/ScreenInfo;", "", "", "component1", "component2", "component3", "", "component4", "width", "height", "dpi", "scaleFactor", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "I", "getWidth", "()I", "b", "getHeight", "c", "getDpi", "d", "F", "getScaleFactor", "()F", "<init>", "(IIIF)V", "core-api_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final /* data */ class ScreenInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int dpi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float scaleFactor;

    public ScreenInfo(int i5, int i10, int i11, float f6) {
        this.width = i5;
        this.height = i10;
        this.dpi = i11;
        this.scaleFactor = f6;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i5, int i10, int i11, float f6, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i5 = screenInfo.width;
        }
        if ((i12 & 2) != 0) {
            i10 = screenInfo.height;
        }
        if ((i12 & 4) != 0) {
            i11 = screenInfo.dpi;
        }
        if ((i12 & 8) != 0) {
            f6 = screenInfo.scaleFactor;
        }
        return screenInfo.copy(i5, i10, i11, f6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDpi() {
        return this.dpi;
    }

    /* renamed from: component4, reason: from getter */
    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    @NotNull
    public final ScreenInfo copy(int width, int height, int dpi, float scaleFactor) {
        return new ScreenInfo(width, height, dpi, scaleFactor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) other;
        return this.width == screenInfo.width && this.height == screenInfo.height && this.dpi == screenInfo.dpi && Intrinsics.areEqual((Object) Float.valueOf(this.scaleFactor), (Object) Float.valueOf(screenInfo.scaleFactor));
    }

    public final int getDpi() {
        return this.dpi;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.scaleFactor) + ((this.dpi + ((this.height + (this.width * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenInfo(width=" + this.width + ", height=" + this.height + ", dpi=" + this.dpi + ", scaleFactor=" + this.scaleFactor + ')';
    }
}

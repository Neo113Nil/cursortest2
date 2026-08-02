package ru.ozon.app.android.pikazon.image;

import Am.C2438a;
import c6.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000fR\"\u0010\b\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pikazon/image/ImageSize;", "", "", "width", "height", "<init>", "(II)V", "Lru/ozon/app/android/pikazon/image/ImageSizeDownsampleStrategy;", "downsampleStrategy", "(IILru/ozon/app/android/pikazon/image/ImageSizeDownsampleStrategy;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "getWidth", "getHeight", "Lc6/n;", "Lc6/n;", "getDownsampleStrategy$lib_release", "()Lc6/n;", "setDownsampleStrategy$lib_release", "(Lc6/n;)V", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageSize {

    @NotNull
    private n downsampleStrategy;
    private final int height;
    private final int width;

    public ImageSize(int i11, int i12) {
        this.width = i11;
        this.height = i12;
        n DEFAULT = n.f56567g;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.downsampleStrategy = DEFAULT;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSize)) {
            return false;
        }
        ImageSize imageSize = (ImageSize) other;
        if (this.width == imageSize.width && this.height == imageSize.height) {
            return Intrinsics.d(this.downsampleStrategy, imageSize.downsampleStrategy);
        }
        return false;
    }

    @NotNull
    /* renamed from: getDownsampleStrategy$lib_release, reason: from getter */
    public final n getDownsampleStrategy() {
        return this.downsampleStrategy;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.downsampleStrategy.hashCode() + (((this.width * 31) + this.height) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        n nVar = this.downsampleStrategy;
        StringBuilder a11 = C2438a.a("ImageSize(width=", i11, ", height=", ", downsampleStrategy=", i12);
        a11.append(nVar);
        a11.append(")");
        return a11.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageSize(int i11, int i12, @NotNull ImageSizeDownsampleStrategy downsampleStrategy) {
        this(i11, i12);
        n nVar;
        Intrinsics.checkNotNullParameter(downsampleStrategy, "downsampleStrategy");
        int ordinal = downsampleStrategy.ordinal();
        if (ordinal == ImageSizeDownsampleStrategy.AT_MOST.ordinal()) {
            nVar = n.f56562b;
        } else if (ordinal == ImageSizeDownsampleStrategy.AT_LEAST.ordinal()) {
            nVar = n.f56561a;
        } else if (ordinal == ImageSizeDownsampleStrategy.FIT_CENTER.ordinal()) {
            nVar = n.f56563c;
        } else if (ordinal != ImageSizeDownsampleStrategy.CENTER_INSIDE.ordinal()) {
            return;
        } else {
            nVar = n.f56564d;
        }
        this.downsampleStrategy = nVar;
    }
}

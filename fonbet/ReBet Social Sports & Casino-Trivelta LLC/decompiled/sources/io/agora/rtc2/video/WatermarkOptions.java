package io.agora.rtc2.video;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class WatermarkOptions {
    public boolean visibleInPreview = true;
    public Rectangle positionInLandscapeMode = new Rectangle();
    public Rectangle positionInPortraitMode = new Rectangle();
    public int zOrder = 0;

    public static class Rectangle {
        public int height;
        public int width;

        /* renamed from: x, reason: collision with root package name */
        public int f49184x;

        /* renamed from: y, reason: collision with root package name */
        public int f49185y;

        public Rectangle() {
            this.f49184x = 0;
            this.f49185y = 0;
            this.width = 0;
            this.height = 0;
        }

        public Rectangle(int i10, int i11, int i12, int i13) {
            this.f49184x = i10;
            this.f49185y = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    @CalledByNative
    public int[] getPositionInLandscapeMode() {
        Rectangle rectangle = this.positionInLandscapeMode;
        int[] iArr = new int[4];
        if (rectangle != null) {
            iArr[0] = rectangle.f49184x;
            iArr[1] = rectangle.f49185y;
            iArr[2] = rectangle.width;
            iArr[3] = rectangle.height;
        }
        return iArr;
    }

    @CalledByNative
    public int[] getPositionInPortraitMode() {
        Rectangle rectangle = this.positionInPortraitMode;
        int[] iArr = new int[4];
        if (rectangle != null) {
            iArr[0] = rectangle.f49184x;
            iArr[1] = rectangle.f49185y;
            iArr[2] = rectangle.width;
            iArr[3] = rectangle.height;
        }
        return iArr;
    }

    @CalledByNative
    public int getzOrder() {
        return this.zOrder;
    }

    @CalledByNative
    public boolean isVisibleInPreview() {
        return this.visibleInPreview;
    }
}

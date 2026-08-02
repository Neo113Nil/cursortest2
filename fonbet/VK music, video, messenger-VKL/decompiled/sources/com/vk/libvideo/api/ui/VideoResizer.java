package com.vk.libvideo.api.ui;

import android.graphics.Rect;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* compiled from: VideoResizer.kt */
/* loaded from: classes2.dex */
public final class VideoResizer {
    public static final int[] a = new int[2];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoResizer.kt */
    public static final class MatrixType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MatrixType[] $VALUES;
        public static final MatrixType IMAGE_MATRIX;
        public static final MatrixType TEXTURE_MATRIX;
        public static final MatrixType VIEW_MATRIX;

        static {
            MatrixType matrixType = new MatrixType("IMAGE_MATRIX", 0);
            IMAGE_MATRIX = matrixType;
            MatrixType matrixType2 = new MatrixType("TEXTURE_MATRIX", 1);
            TEXTURE_MATRIX = matrixType2;
            MatrixType matrixType3 = new MatrixType("VIEW_MATRIX", 2);
            VIEW_MATRIX = matrixType3;
            MatrixType[] matrixTypeArr = {matrixType, matrixType2, matrixType3};
            $VALUES = matrixTypeArr;
            $ENTRIES = new asp(matrixTypeArr);
        }

        public MatrixType() {
            throw null;
        }

        public static MatrixType valueOf(String str) {
            return (MatrixType) Enum.valueOf(MatrixType.class, str);
        }

        public static MatrixType[] values() {
            return (MatrixType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoResizer.kt */
    @ozl
    public static final class VideoFitType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoFitType[] $VALUES;
        public static final VideoFitType CROP;
        public static final VideoFitType FIT;

        static {
            VideoFitType videoFitType = new VideoFitType("CROP", 0);
            CROP = videoFitType;
            VideoFitType videoFitType2 = new VideoFitType("FIT", 1);
            FIT = videoFitType2;
            VideoFitType[] videoFitTypeArr = {videoFitType, videoFitType2};
            $VALUES = videoFitTypeArr;
            $ENTRIES = new asp(videoFitTypeArr);
        }

        public VideoFitType() {
            throw null;
        }

        public static VideoFitType valueOf(String str) {
            return (VideoFitType) Enum.valueOf(VideoFitType.class, str);
        }

        public static VideoFitType[] values() {
            return (VideoFitType[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoResizer.kt */
    public static final class a {

        /* compiled from: VideoResizer.kt */
        /* renamed from: com.vk.libvideo.api.ui.VideoResizer$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1204a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoFitType.values().length];
                try {
                    iArr[VideoFitType.FIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoFitType.CROP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
        
            if (r9 < r12) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            r0 = r5 / r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        
            r8 = r1 / r10;
            r0 = 1.0f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
        
            if (r9 < r12) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(float[] fArr, VideoFitType videoFitType, MatrixType matrixType, int i, int i2, int i3, int i4) {
            float f;
            float f2;
            int[] iArr = VideoResizer.a;
            c(iArr, videoFitType, i, i2, i3, i4);
            int i5 = iArr[0];
            int i6 = iArr[1];
            float f3 = i4;
            float f4 = i3;
            float f5 = f3 / f4;
            float f6 = i2;
            float f7 = i;
            float f8 = f6 / f7;
            if (matrixType == MatrixType.IMAGE_MATRIX) {
                int i7 = C1204a.$EnumSwitchMapping$0[videoFitType.ordinal()];
                if (i7 == 1) {
                    int i8 = (f5 > f8 ? 1 : (f5 == f8 ? 0 : -1));
                    f2 = i5 / f4;
                    f = i6 / f3;
                } else {
                    if (i7 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = f5 < f8 ? i6 / f3 : i5 / f4;
                    f = f2;
                }
            } else {
                f = 1.0f;
                if (matrixType == MatrixType.TEXTURE_MATRIX) {
                    int i9 = C1204a.$EnumSwitchMapping$0[videoFitType.ordinal()];
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    f2 = 1.0f;
                }
            }
            float f9 = (i - i5) / 2.0f;
            float f10 = (i2 - i6) / 2.0f;
            fArr[0] = f2;
            fArr[1] = f;
            fArr[2] = f9;
            fArr[3] = f10;
            fArr[4] = i5;
            fArr[5] = i6;
            fArr[6] = f9;
            fArr[7] = f10;
        }

        public static void b(Rect rect, View view) {
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.left = i;
            rect.top = iArr[1];
            rect.right = view.getWidth() + i;
            rect.bottom = view.getHeight() + iArr[1];
        }

        public static void c(int[] iArr, VideoFitType videoFitType, int i, int i2, int i3, int i4) {
            float f = i4;
            float f2 = i3;
            float f3 = f / f2;
            float f4 = i2;
            float f5 = i;
            float f6 = f4 / f5;
            int i5 = C1204a.$EnumSwitchMapping$0[videoFitType.ordinal()];
            if (i5 == 1) {
                float f7 = f / f4 > f2 / f5 ? f4 / f : f5 / f2;
                iArr[0] = (int) (f2 * f7);
                iArr[1] = (int) (f * f7);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f8 = f3 < f6 ? f4 / f : f5 / f2;
                iArr[0] = (int) (f2 * f8);
                iArr[1] = (int) (f * f8);
            }
        }
    }
}

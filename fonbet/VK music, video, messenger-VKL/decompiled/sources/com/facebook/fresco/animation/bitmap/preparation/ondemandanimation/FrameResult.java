package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.graphics.Bitmap;
import xsna.asp;
import xsna.uvf;
import xsna.zrp;

/* compiled from: FrameLoader.kt */
/* loaded from: classes12.dex */
public final class FrameResult {
    public final uvf<Bitmap> a;
    public final FrameType b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FrameLoader.kt */
    public static final class FrameType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FrameType[] $VALUES;
        public static final FrameType MISSING;
        public static final FrameType NEAREST;
        public static final FrameType SUCCESS;

        static {
            FrameType frameType = new FrameType("SUCCESS", 0);
            SUCCESS = frameType;
            FrameType frameType2 = new FrameType("NEAREST", 1);
            NEAREST = frameType2;
            FrameType frameType3 = new FrameType("MISSING", 2);
            MISSING = frameType3;
            FrameType[] frameTypeArr = {frameType, frameType2, frameType3};
            $VALUES = frameTypeArr;
            $ENTRIES = new asp(frameTypeArr);
        }

        public FrameType() {
            throw null;
        }

        public static FrameType valueOf(String str) {
            return (FrameType) Enum.valueOf(FrameType.class, str);
        }

        public static FrameType[] values() {
            return (FrameType[]) $VALUES.clone();
        }
    }

    public FrameResult(uvf<Bitmap> uvfVar, FrameType frameType) {
        this.a = uvfVar;
        this.b = frameType;
    }
}

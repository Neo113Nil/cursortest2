package com.facebook.imagepipeline.animated.base;

/* loaded from: classes12.dex */
public final class AnimatedDrawableFrameInfo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final BlendOperation e;
    public final DisposalMethod f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BlendOperation {
        private static final /* synthetic */ BlendOperation[] $VALUES;
        public static final BlendOperation BLEND_WITH_PREVIOUS;
        public static final BlendOperation NO_BLEND;

        static {
            BlendOperation blendOperation = new BlendOperation("BLEND_WITH_PREVIOUS", 0);
            BLEND_WITH_PREVIOUS = blendOperation;
            BlendOperation blendOperation2 = new BlendOperation("NO_BLEND", 1);
            NO_BLEND = blendOperation2;
            $VALUES = new BlendOperation[]{blendOperation, blendOperation2};
        }

        public BlendOperation() {
            throw null;
        }

        public static BlendOperation valueOf(String str) {
            return (BlendOperation) Enum.valueOf(BlendOperation.class, str);
        }

        public static BlendOperation[] values() {
            return (BlendOperation[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DisposalMethod {
        private static final /* synthetic */ DisposalMethod[] $VALUES;
        public static final DisposalMethod DISPOSE_DO_NOT;
        public static final DisposalMethod DISPOSE_TO_BACKGROUND;
        public static final DisposalMethod DISPOSE_TO_PREVIOUS;

        static {
            DisposalMethod disposalMethod = new DisposalMethod("DISPOSE_DO_NOT", 0);
            DISPOSE_DO_NOT = disposalMethod;
            DisposalMethod disposalMethod2 = new DisposalMethod("DISPOSE_TO_BACKGROUND", 1);
            DISPOSE_TO_BACKGROUND = disposalMethod2;
            DisposalMethod disposalMethod3 = new DisposalMethod("DISPOSE_TO_PREVIOUS", 2);
            DISPOSE_TO_PREVIOUS = disposalMethod3;
            $VALUES = new DisposalMethod[]{disposalMethod, disposalMethod2, disposalMethod3};
        }

        public DisposalMethod() {
            throw null;
        }

        public static DisposalMethod valueOf(String str) {
            return (DisposalMethod) Enum.valueOf(DisposalMethod.class, str);
        }

        public static DisposalMethod[] values() {
            return (DisposalMethod[]) $VALUES.clone();
        }
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = blendOperation;
        this.f = disposalMethod;
    }
}

package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class KeylineState {
    private final int carouselSize;
    private final int firstFocalKeylineIndex;
    private final float itemSize;
    private final List<Keyline> keylines;
    private final int lastFocalKeylineIndex;
    private int totalVisibleFocalItems;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class Builder {
        private static final int NO_INDEX = -1;
        private static final float UNKNOWN_LOC = Float.MIN_VALUE;
        private final int carouselSize;
        private final float itemSize;
        private Keyline tmpFirstFocalKeyline;
        private Keyline tmpLastFocalKeyline;
        private final List<Keyline> tmpKeylines = new ArrayList();
        private int firstFocalKeylineIndex = -1;
        private int lastFocalKeylineIndex = -1;
        private float lastKeylineMaskedSize = 0.0f;
        private int latestAnchorKeylineIndex = -1;

        public Builder(float f6, int i5) {
            this.itemSize = f6;
            this.carouselSize = i5;
        }

        private static float calculateKeylineLocationForItemPosition(float f6, float f10, int i5, int i10) {
            return (i10 * f10) + (f6 - (i5 * f10));
        }

        @NonNull
        public Builder addAnchorKeyline(float f6, float f10, float f11) {
            return addKeyline(f6, f10, f11, false, true);
        }

        @NonNull
        public Builder addKeyline(float f6, float f10, float f11, boolean z5) {
            return addKeyline(f6, f10, f11, z5, false);
        }

        @NonNull
        public Builder addKeylineRange(float f6, float f10, float f11, int i5) {
            return addKeylineRange(f6, f10, f11, i5, false);
        }

        @NonNull
        public KeylineState build() {
            if (this.tmpFirstFocalKeyline == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < this.tmpKeylines.size(); i5++) {
                Keyline keyline = this.tmpKeylines.get(i5);
                arrayList.add(new Keyline(calculateKeylineLocationForItemPosition(this.tmpFirstFocalKeyline.locOffset, this.itemSize, this.firstFocalKeylineIndex, i5), keyline.locOffset, keyline.mask, keyline.maskedItemSize, keyline.isAnchor, keyline.cutoff, keyline.leftOrTopPaddingShift, keyline.rightOrBottomPaddingShift));
            }
            return new KeylineState(this.itemSize, arrayList, this.firstFocalKeylineIndex, this.lastFocalKeylineIndex, this.carouselSize);
        }

        @NonNull
        public Builder addKeyline(float f6, float f10, float f11) {
            return addKeyline(f6, f10, f11, false);
        }

        @NonNull
        public Builder addKeylineRange(float f6, float f10, float f11, int i5, boolean z5) {
            if (i5 > 0 && f11 > 0.0f) {
                for (int i10 = 0; i10 < i5; i10++) {
                    addKeyline((i10 * f11) + f6, f10, f11, z5);
                }
            }
            return this;
        }

        @NonNull
        public Builder addKeyline(float f6, float f10, float f11, boolean z5, boolean z7, float f12, float f13, float f14) {
            if (f11 <= 0.0f) {
                return this;
            }
            if (z7) {
                if (!z5) {
                    int i5 = this.latestAnchorKeylineIndex;
                    if (i5 != -1 && i5 != 0) {
                        throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                    }
                    this.latestAnchorKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
            }
            Keyline keyline = new Keyline(Float.MIN_VALUE, f6, f10, f11, z7, f12, f13, f14);
            if (z5) {
                if (this.tmpFirstFocalKeyline == null) {
                    this.tmpFirstFocalKeyline = keyline;
                    this.firstFocalKeylineIndex = this.tmpKeylines.size();
                }
                if (this.lastFocalKeylineIndex != -1 && this.tmpKeylines.size() - this.lastFocalKeylineIndex > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f11 == this.tmpFirstFocalKeyline.maskedItemSize) {
                    this.tmpLastFocalKeyline = keyline;
                    this.lastFocalKeylineIndex = this.tmpKeylines.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else {
                if (this.tmpFirstFocalKeyline == null && keyline.maskedItemSize < this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.tmpLastFocalKeyline != null && keyline.maskedItemSize > this.lastKeylineMaskedSize) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.lastKeylineMaskedSize = keyline.maskedItemSize;
            this.tmpKeylines.add(keyline);
            return this;
        }

        @NonNull
        public Builder addKeyline(float f6, float f10, float f11, boolean z5, boolean z7, float f12) {
            return addKeyline(f6, f10, f11, z5, z7, f12, 0.0f, 0.0f);
        }

        @NonNull
        public Builder addKeyline(float f6, float f10, float f11, boolean z5, boolean z7) {
            float f12;
            float f13 = f11 / 2.0f;
            float f14 = f6 - f13;
            float f15 = f13 + f6;
            int i5 = this.carouselSize;
            if (f15 > i5) {
                f12 = Math.abs(f15 - Math.max(f15 - f11, i5));
            } else {
                f12 = 0.0f;
                if (f14 < 0.0f) {
                    f12 = Math.abs(f14 - Math.min(f14 + f11, 0.0f));
                }
            }
            return addKeyline(f6, f10, f11, z5, z7, f12);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static final class Keyline {
        final float cutoff;
        final boolean isAnchor;
        final float leftOrTopPaddingShift;
        final float loc;
        final float locOffset;
        final float mask;
        final float maskedItemSize;
        final float rightOrBottomPaddingShift;

        public Keyline(float f6, float f10, float f11, float f12) {
            this(f6, f10, f11, f12, false, 0.0f, 0.0f, 0.0f);
        }

        public static Keyline lerp(Keyline keyline, Keyline keyline2, float f6) {
            return new Keyline(AnimationUtils.lerp(keyline.loc, keyline2.loc, f6), AnimationUtils.lerp(keyline.locOffset, keyline2.locOffset, f6), AnimationUtils.lerp(keyline.mask, keyline2.mask, f6), AnimationUtils.lerp(keyline.maskedItemSize, keyline2.maskedItemSize, f6));
        }

        public Keyline(float f6, float f10, float f11, float f12, boolean z5, float f13, float f14, float f15) {
            this.loc = f6;
            this.locOffset = f10;
            this.mask = f11;
            this.maskedItemSize = f12;
            this.isAnchor = z5;
            this.cutoff = f13;
            this.leftOrTopPaddingShift = f14;
            this.rightOrBottomPaddingShift = f15;
        }
    }

    public static KeylineState lerp(KeylineState keylineState, KeylineState keylineState2, float f6) {
        if (keylineState.getItemSize() != keylineState2.getItemSize()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<Keyline> keylines = keylineState.getKeylines();
        List<Keyline> keylines2 = keylineState2.getKeylines();
        if (keylines.size() != keylines2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < keylineState.getKeylines().size(); i5++) {
            arrayList.add(Keyline.lerp(keylines.get(i5), keylines2.get(i5), f6));
        }
        return new KeylineState(keylineState.getItemSize(), arrayList, AnimationUtils.lerp(keylineState.getFirstFocalKeylineIndex(), keylineState2.getFirstFocalKeylineIndex(), f6), AnimationUtils.lerp(keylineState.getLastFocalKeylineIndex(), keylineState2.getLastFocalKeylineIndex(), f6), keylineState.carouselSize);
    }

    public static KeylineState reverse(KeylineState keylineState, int i5) {
        Builder builder = new Builder(keylineState.getItemSize(), i5);
        float f6 = (i5 - keylineState.getLastKeyline().locOffset) - (keylineState.getLastKeyline().maskedItemSize / 2.0f);
        int size = keylineState.getKeylines().size() - 1;
        while (size >= 0) {
            Keyline keyline = keylineState.getKeylines().get(size);
            builder.addKeyline((keyline.maskedItemSize / 2.0f) + f6, keyline.mask, keyline.maskedItemSize, size >= keylineState.getFirstFocalKeylineIndex() && size <= keylineState.getLastFocalKeylineIndex(), keyline.isAnchor);
            f6 += keyline.maskedItemSize;
            size--;
        }
        return builder.build();
    }

    public int getCarouselSize() {
        return this.carouselSize;
    }

    public Keyline getFirstFocalKeyline() {
        return this.keylines.get(this.firstFocalKeylineIndex);
    }

    public int getFirstFocalKeylineIndex() {
        return this.firstFocalKeylineIndex;
    }

    public Keyline getFirstKeyline() {
        return this.keylines.get(0);
    }

    public Keyline getFirstNonAnchorKeyline() {
        for (int i5 = 0; i5 < this.keylines.size(); i5++) {
            Keyline keyline = this.keylines.get(i5);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public List<Keyline> getFocalKeylines() {
        return this.keylines.subList(this.firstFocalKeylineIndex, this.lastFocalKeylineIndex + 1);
    }

    public float getItemSize() {
        return this.itemSize;
    }

    public List<Keyline> getKeylines() {
        return this.keylines;
    }

    public Keyline getLastFocalKeyline() {
        return this.keylines.get(this.lastFocalKeylineIndex);
    }

    public int getLastFocalKeylineIndex() {
        return this.lastFocalKeylineIndex;
    }

    public Keyline getLastKeyline() {
        return this.keylines.get(r0.size() - 1);
    }

    public Keyline getLastNonAnchorKeyline() {
        for (int size = this.keylines.size() - 1; size >= 0; size--) {
            Keyline keyline = this.keylines.get(size);
            if (!keyline.isAnchor) {
                return keyline;
            }
        }
        return null;
    }

    public int getNumberOfNonAnchorKeylines() {
        Iterator<Keyline> it = this.keylines.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if (it.next().isAnchor) {
                i5++;
            }
        }
        return this.keylines.size() - i5;
    }

    public int getTotalVisibleFocalItems() {
        return this.totalVisibleFocalItems;
    }

    private KeylineState(float f6, List<Keyline> list, int i5, int i10, int i11) {
        this.itemSize = f6;
        this.keylines = DesugarCollections.unmodifiableList(list);
        this.firstFocalKeylineIndex = i5;
        this.lastFocalKeylineIndex = i10;
        while (i5 <= i10) {
            if (list.get(i5).cutoff == 0.0f) {
                this.totalVisibleFocalItems++;
            }
            i5++;
        }
        this.carouselSize = i11;
    }
}

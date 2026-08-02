package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.CarouselStrategy;
import com.google.android.material.carousel.KeylineState;
import com.google.android.play.core.appupdate.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class KeylineStateList {
    private static final int NO_INDEX = -1;
    private final KeylineState defaultState;
    private final float endShiftRange;
    private final List<KeylineState> endStateSteps;
    private final float[] endStateStepsInterpolationPoints;
    private final float startShiftRange;
    private final List<KeylineState> startStateSteps;
    private final float[] startStateStepsInterpolationPoints;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    /* renamed from: com.google.android.material.carousel.KeylineStateList$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType;

        static {
            int[] iArr = new int[CarouselStrategy.StrategyType.values().length];
            $SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType = iArr;
            try {
                iArr[CarouselStrategy.StrategyType.CONTAINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private KeylineStateList(@NonNull KeylineState keylineState, List<KeylineState> list, List<KeylineState> list2) {
        this.defaultState = keylineState;
        this.startStateSteps = DesugarCollections.unmodifiableList(list);
        this.endStateSteps = DesugarCollections.unmodifiableList(list2);
        float f6 = list.get(list.size() - 1).getFirstKeyline().loc - keylineState.getFirstKeyline().loc;
        this.startShiftRange = f6;
        float f10 = keylineState.getLastKeyline().loc - list2.get(list2.size() - 1).getLastKeyline().loc;
        this.endShiftRange = f10;
        this.startStateStepsInterpolationPoints = getStateStepInterpolationPoints(f6, list, true);
        this.endStateStepsInterpolationPoints = getStateStepInterpolationPoints(f10, list2, false);
    }

    private KeylineState closestStateStepFromInterpolation(List<KeylineState> list, float f6, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f6, fArr);
        return stateStepsRange[0] >= 0.5f ? list.get((int) stateStepsRange[2]) : list.get((int) stateStepsRange[1]);
    }

    private static int findFirstIndexAfterLastFocalKeylineWithMask(KeylineState keylineState, float f6) {
        for (int lastFocalKeylineIndex = keylineState.getLastFocalKeylineIndex(); lastFocalKeylineIndex < keylineState.getKeylines().size(); lastFocalKeylineIndex++) {
            if (f6 == keylineState.getKeylines().get(lastFocalKeylineIndex).mask) {
                return lastFocalKeylineIndex;
            }
        }
        return keylineState.getKeylines().size() - 1;
    }

    private static int findFirstNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int i5 = 0; i5 < keylineState.getKeylines().size(); i5++) {
            if (!keylineState.getKeylines().get(i5).isAnchor) {
                return i5;
            }
        }
        return -1;
    }

    private static int findLastIndexBeforeFirstFocalKeylineWithMask(KeylineState keylineState, float f6) {
        for (int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - 1; firstFocalKeylineIndex >= 0; firstFocalKeylineIndex--) {
            if (f6 == keylineState.getKeylines().get(firstFocalKeylineIndex).mask) {
                return firstFocalKeylineIndex;
            }
        }
        return 0;
    }

    private static int findLastNonAnchorKeylineIndex(KeylineState keylineState) {
        for (int size = keylineState.getKeylines().size() - 1; size >= 0; size--) {
            if (!keylineState.getKeylines().get(size).isAnchor) {
                return size;
            }
        }
        return -1;
    }

    public static KeylineStateList from(Carousel carousel, KeylineState keylineState, float f6, float f10, float f11, CarouselStrategy.StrategyType strategyType) {
        return new KeylineStateList(keylineState, getStateStepsStart(carousel, keylineState, f6, f10, strategyType), getStateStepsEnd(carousel, keylineState, f6, f11, strategyType));
    }

    private static float[] getStateStepInterpolationPoints(float f6, List<KeylineState> list, boolean z5) {
        int size = list.size();
        float[] fArr = new float[size];
        int i5 = 1;
        while (i5 < size) {
            int i10 = i5 - 1;
            KeylineState keylineState = list.get(i10);
            KeylineState keylineState2 = list.get(i5);
            fArr[i5] = i5 == size + (-1) ? 1.0f : fArr[i10] + ((z5 ? keylineState2.getFirstKeyline().loc - keylineState.getFirstKeyline().loc : keylineState.getLastKeyline().loc - keylineState2.getLastKeyline().loc) / f6);
            i5++;
        }
        return fArr;
    }

    private static List<KeylineState> getStateStepsEnd(Carousel carousel, KeylineState keylineState, float f6, float f10, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findLastNonAnchorKeylineIndex = findLastNonAnchorKeylineIndex(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isLastFocalItemVisibleAtRightOfContainer(carousel, keylineState) && findLastNonAnchorKeylineIndex != -1) {
            int lastFocalKeylineIndex = findLastNonAnchorKeylineIndex - keylineState.getLastFocalKeylineIndex();
            float f11 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (lastFocalKeylineIndex <= 0 && keylineState.getLastFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, (f11 - keylineState.getLastFocalKeyline().cutoff) - f10, containerWidth));
                return arrayList;
            }
            float f12 = 0.0f;
            int i5 = 0;
            while (i5 < lastFocalKeylineIndex) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i10 = findLastNonAnchorKeylineIndex - i5;
                float f13 = f12 + keylineState.getKeylines().get(i10).cutoff;
                int i11 = i10 + 1;
                int i12 = containerWidth;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findLastNonAnchorKeylineIndex, i11 < keylineState.getKeylines().size() ? findLastIndexBeforeFirstFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i11).mask) + 1 : 0, f11 - f13, keylineState.getFirstFocalKeylineIndex() + i5 + 1, keylineState.getLastFocalKeylineIndex() + i5 + 1, i12);
                if (i5 == lastFocalKeylineIndex - 1 && f10 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f10, i12, false, f6, strategyType);
                    i12 = i12;
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
                i5++;
                containerWidth = i12;
                f12 = f13;
            }
        } else if (f10 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f10, containerWidth, false, f6, strategyType));
        }
        return arrayList;
    }

    private static float[] getStateStepsRange(List<KeylineState> list, float f6, float[] fArr) {
        int size = list.size();
        float f10 = fArr[0];
        int i5 = 1;
        while (i5 < size) {
            float f11 = fArr[i5];
            if (f6 <= f11) {
                return new float[]{AnimationUtils.lerp(0.0f, 1.0f, f10, f11, f6), i5 - 1, i5};
            }
            i5++;
            f10 = f11;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List<KeylineState> getStateStepsStart(Carousel carousel, KeylineState keylineState, float f6, float f10, CarouselStrategy.StrategyType strategyType) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineState);
        int findFirstNonAnchorKeylineIndex = findFirstNonAnchorKeylineIndex(keylineState);
        int containerWidth = carousel.isHorizontal() ? carousel.getContainerWidth() : carousel.getContainerHeight();
        if (!isFirstFocalItemAtLeftOfContainer(keylineState) && findFirstNonAnchorKeylineIndex != -1) {
            int firstFocalKeylineIndex = keylineState.getFirstFocalKeylineIndex() - findFirstNonAnchorKeylineIndex;
            float f11 = keylineState.getFirstKeyline().locOffset - (keylineState.getFirstKeyline().maskedItemSize / 2.0f);
            if (firstFocalKeylineIndex <= 0 && keylineState.getFirstFocalKeyline().cutoff > 0.0f) {
                arrayList.add(shiftKeylinesAndCreateKeylineState(keylineState, f11 + keylineState.getFirstFocalKeyline().cutoff + f10, containerWidth));
                return arrayList;
            }
            float f12 = 0.0f;
            for (int i5 = 0; i5 < firstFocalKeylineIndex; i5++) {
                KeylineState keylineState2 = (KeylineState) arrayList.get(arrayList.size() - 1);
                int i10 = findFirstNonAnchorKeylineIndex + i5;
                int size = keylineState.getKeylines().size() - 1;
                f12 += keylineState.getKeylines().get(i10).cutoff;
                int i11 = i10 - 1;
                if (i11 >= 0) {
                    size = findFirstIndexAfterLastFocalKeylineWithMask(keylineState2, keylineState.getKeylines().get(i11).mask) - 1;
                }
                int i12 = containerWidth;
                KeylineState moveKeylineAndCreateKeylineState = moveKeylineAndCreateKeylineState(keylineState2, findFirstNonAnchorKeylineIndex, size, f11 + f12, (keylineState.getFirstFocalKeylineIndex() - i5) - 1, (keylineState.getLastFocalKeylineIndex() - i5) - 1, i12);
                containerWidth = i12;
                if (i5 == firstFocalKeylineIndex - 1 && f10 > 0.0f) {
                    moveKeylineAndCreateKeylineState = shiftKeylineStateForPadding(moveKeylineAndCreateKeylineState, f10, containerWidth, true, f6, strategyType);
                }
                arrayList.add(moveKeylineAndCreateKeylineState);
            }
        } else if (f10 > 0.0f) {
            arrayList.add(shiftKeylineStateForPadding(keylineState, f10, containerWidth, true, f6, strategyType));
        }
        return arrayList;
    }

    private static boolean isFirstFocalItemAtLeftOfContainer(KeylineState keylineState) {
        return keylineState.getFirstFocalKeyline().locOffset - (keylineState.getFirstFocalKeyline().maskedItemSize / 2.0f) >= 0.0f && keylineState.getFirstFocalKeyline() == keylineState.getFirstNonAnchorKeyline();
    }

    private static boolean isLastFocalItemVisibleAtRightOfContainer(Carousel carousel, KeylineState keylineState) {
        int containerHeight = carousel.getContainerHeight();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
        }
        return (keylineState.getLastFocalKeyline().maskedItemSize / 2.0f) + keylineState.getLastFocalKeyline().locOffset <= ((float) containerHeight) && keylineState.getLastFocalKeyline() == keylineState.getLastNonAnchorKeyline();
    }

    private static KeylineState lerp(List<KeylineState> list, float f6, float[] fArr) {
        float[] stateStepsRange = getStateStepsRange(list, f6, fArr);
        return KeylineState.lerp(list.get((int) stateStepsRange[1]), list.get((int) stateStepsRange[2]), stateStepsRange[0]);
    }

    private static KeylineState moveKeylineAndCreateKeylineState(KeylineState keylineState, int i5, int i10, float f6, int i11, int i12, int i13) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        arrayList.add(i10, (KeylineState.Keyline) arrayList.remove(i5));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i13);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i14);
            float f10 = keyline.maskedItemSize;
            builder.addKeyline((f10 / 2.0f) + f6, keyline.mask, f10, i14 >= i11 && i14 <= i12, keyline.isAnchor, keyline.cutoff);
            f6 += keyline.maskedItemSize;
            i14++;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPadding(@NonNull KeylineState keylineState, float f6, int i5, boolean z5, float f10, CarouselStrategy.StrategyType strategyType) {
        return AnonymousClass1.$SwitchMap$com$google$android$material$carousel$CarouselStrategy$StrategyType[strategyType.ordinal()] != 1 ? shiftKeylineStateForPaddingUncontained(keylineState, f6, i5, z5) : shiftKeylineStateForPaddingContained(keylineState, f6, i5, z5, f10);
    }

    private static KeylineState shiftKeylineStateForPaddingContained(KeylineState keylineState, float f6, int i5, boolean z5, float f10) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i5);
        float numberOfNonAnchorKeylines = f6 / keylineState.getNumberOfNonAnchorKeylines();
        float f11 = z5 ? f6 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i10);
            if (keyline.isAnchor) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                boolean z7 = i10 >= keylineState.getFirstFocalKeylineIndex() && i10 <= keylineState.getLastFocalKeylineIndex();
                float f12 = keyline.maskedItemSize - numberOfNonAnchorKeylines;
                float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(f12, keylineState.getItemSize(), f10);
                float f13 = (f12 / 2.0f) + f11;
                float abs = Math.abs(f13 - keyline.locOffset);
                builder.addKeyline(f13, childMaskPercentage, f12, z7, false, keyline.cutoff, z5 ? abs : 0.0f, z5 ? 0.0f : abs);
                f11 += f12;
            }
            i10++;
        }
        return builder.build();
    }

    @NonNull
    private static KeylineState shiftKeylineStateForPaddingUncontained(@NonNull KeylineState keylineState, float f6, int i5, boolean z5) {
        ArrayList arrayList = new ArrayList(keylineState.getKeylines());
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.getItemSize(), i5);
        boolean z7 = true;
        int size = z5 ? 0 : arrayList.size() - 1;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i10);
            if (keyline.isAnchor && i10 == size) {
                builder.addKeyline(keyline.locOffset, keyline.mask, keyline.maskedItemSize, false, true, keyline.cutoff);
            } else {
                float f10 = keyline.locOffset;
                float f11 = z5 ? f10 + f6 : f10 - f6;
                float f12 = z5 ? f6 : 0.0f;
                float f13 = z5 ? 0.0f : f6;
                boolean z10 = (i10 < keylineState.getFirstFocalKeylineIndex() || i10 > keylineState.getLastFocalKeylineIndex()) ? false : z7;
                float f14 = f11;
                float f15 = keyline.mask;
                float f16 = keyline.maskedItemSize;
                builder.addKeyline(f14, f15, f16, z10, keyline.isAnchor, Math.abs(z5 ? Math.max(0.0f, ((f16 / 2.0f) + f14) - i5) : Math.min(0.0f, f14 - (f16 / 2.0f))), f12, f13);
            }
            i10++;
            z7 = true;
        }
        return builder.build();
    }

    private static KeylineState shiftKeylinesAndCreateKeylineState(KeylineState keylineState, float f6, int i5) {
        return moveKeylineAndCreateKeylineState(keylineState, 0, 0, f6, keylineState.getFirstFocalKeylineIndex(), keylineState.getLastFocalKeylineIndex(), i5);
    }

    public KeylineState getDefaultState() {
        return this.defaultState;
    }

    public KeylineState getEndState() {
        return this.endStateSteps.get(r0.size() - 1);
    }

    public Map<Integer, KeylineState> getKeylineStateForPositionMap(int i5, int i10, int i11, boolean z5) {
        float itemSize = this.defaultState.getItemSize();
        HashMap hashMap = new HashMap();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= i5) {
                break;
            }
            int i14 = z5 ? (i5 - i12) - 1 : i12;
            if (i14 * itemSize * (z5 ? -1 : 1) > i11 - this.endShiftRange || i12 >= i5 - this.endStateSteps.size()) {
                Integer valueOf = Integer.valueOf(i14);
                List<KeylineState> list = this.endStateSteps;
                hashMap.put(valueOf, list.get(b.f(i13, 0, list.size() - 1)));
                i13++;
            }
            i12++;
        }
        int i15 = 0;
        for (int i16 = i5 - 1; i16 >= 0; i16--) {
            int i17 = z5 ? (i5 - i16) - 1 : i16;
            if (i17 * itemSize * (z5 ? -1 : 1) < i10 + this.startShiftRange || i16 < this.startStateSteps.size()) {
                Integer valueOf2 = Integer.valueOf(i17);
                List<KeylineState> list2 = this.startStateSteps;
                hashMap.put(valueOf2, list2.get(b.f(i15, 0, list2.size() - 1)));
                i15++;
            }
        }
        return hashMap;
    }

    @NonNull
    public KeylineState getShiftedState(float f6, float f10, float f11) {
        return getShiftedState(f6, f10, f11, false);
    }

    public KeylineState getStartState() {
        return this.startStateSteps.get(r0.size() - 1);
    }

    public KeylineState getShiftedState(float f6, float f10, float f11, boolean z5) {
        float lerp;
        List<KeylineState> list;
        float[] fArr;
        float f12 = this.startShiftRange + f10;
        float f13 = f11 - this.endShiftRange;
        float f14 = getStartState().getFirstFocalKeyline().leftOrTopPaddingShift;
        float f15 = getEndState().getFirstFocalKeyline().rightOrBottomPaddingShift;
        if (this.startShiftRange == f14) {
            f12 += f14;
        }
        if (this.endShiftRange == f15) {
            f13 -= f15;
        }
        if (f6 < f12) {
            lerp = AnimationUtils.lerp(1.0f, 0.0f, f10, f12, f6);
            list = this.startStateSteps;
            fArr = this.startStateStepsInterpolationPoints;
        } else {
            if (f6 <= f13) {
                return this.defaultState;
            }
            lerp = AnimationUtils.lerp(0.0f, 1.0f, f13, f11, f6);
            list = this.endStateSteps;
            fArr = this.endStateStepsInterpolationPoints;
        }
        return z5 ? closestStateStepFromInterpolation(list, lerp, fArr) : lerp(list, lerp, fArr);
    }
}

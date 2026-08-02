package com.facebook.react.uimanager.style;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LengthPercentage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;", "", C5444x.f55808b, "Lcom/facebook/react/uimanager/LengthPercentage;", "y", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getX", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getY", "isXAuto", "", "isYAuto", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackgroundSizeLengthPercentage {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final LengthPercentage x;

    @Nullable
    private final LengthPercentage y;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;", "backgroundSizeMap", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final BackgroundSizeLengthPercentage parse(@Nullable ReadableMap backgroundSizeMap) {
            LengthPercentage lengthPercentage;
            int i10;
            LengthPercentage lengthPercentage2 = null;
            if (backgroundSizeMap == null) {
                return null;
            }
            if (backgroundSizeMap.hasKey(C5444x.f55808b) && backgroundSizeMap.getType(C5444x.f55808b) != ReadableType.Null) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[backgroundSizeMap.getType(C5444x.f55808b).ordinal()];
                if (i11 == 1) {
                    lengthPercentage = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic(C5444x.f55808b), false, 2, null);
                } else if (i11 == 2) {
                    String string = backgroundSizeMap.getString(C5444x.f55808b);
                    if (!Intrinsics.areEqual(string, "auto") && string != null && StringsKt.endsWith$default(string, "%", false, 2, (Object) null)) {
                        lengthPercentage = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic(C5444x.f55808b), false, 2, null);
                    }
                }
                if (backgroundSizeMap.hasKey("y") && backgroundSizeMap.getType("y") != ReadableType.Null) {
                    i10 = WhenMappings.$EnumSwitchMapping$0[backgroundSizeMap.getType("y").ordinal()];
                    if (i10 != 1) {
                        lengthPercentage2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic("y"), false, 2, null);
                    } else if (i10 == 2) {
                        String string2 = backgroundSizeMap.getString("y");
                        if (!Intrinsics.areEqual(string2, "auto") && string2 != null && StringsKt.endsWith$default(string2, "%", false, 2, (Object) null)) {
                            lengthPercentage2 = LengthPercentage.Companion.setFromDynamic$default(LengthPercentage.INSTANCE, backgroundSizeMap.getDynamic("y"), false, 2, null);
                        }
                    }
                }
                return new BackgroundSizeLengthPercentage(lengthPercentage, lengthPercentage2);
            }
            lengthPercentage = null;
            if (backgroundSizeMap.hasKey("y")) {
                i10 = WhenMappings.$EnumSwitchMapping$0[backgroundSizeMap.getType("y").ordinal()];
                if (i10 != 1) {
                }
            }
            return new BackgroundSizeLengthPercentage(lengthPercentage, lengthPercentage2);
        }

        private Companion() {
        }
    }

    public BackgroundSizeLengthPercentage(@Nullable LengthPercentage lengthPercentage, @Nullable LengthPercentage lengthPercentage2) {
        this.x = lengthPercentage;
        this.y = lengthPercentage2;
    }

    @Nullable
    public final LengthPercentage getX() {
        return this.x;
    }

    @Nullable
    public final LengthPercentage getY() {
        return this.y;
    }

    public final boolean isXAuto() {
        return this.x == null;
    }

    public final boolean isYAuto() {
        return this.y == null;
    }
}

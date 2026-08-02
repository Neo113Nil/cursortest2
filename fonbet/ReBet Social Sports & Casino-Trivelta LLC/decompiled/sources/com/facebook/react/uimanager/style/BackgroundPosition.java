package com.facebook.react.uimanager.style;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundPosition;", "", ViewProps.TOP, "Lcom/facebook/react/uimanager/LengthPercentage;", ViewProps.LEFT, ViewProps.RIGHT, ViewProps.BOTTOM, "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", "getTop", "()Lcom/facebook/react/uimanager/LengthPercentage;", "getLeft", "getRight", "getBottom", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackgroundPosition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final LengthPercentage bottom;

    @Nullable
    private final LengthPercentage left;

    @Nullable
    private final LengthPercentage right;

    @Nullable
    private final LengthPercentage top;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundPosition$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BackgroundPosition;", "backgroundPositionMap", "Lcom/facebook/react/bridge/ReadableMap;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final BackgroundPosition parse(@Nullable ReadableMap backgroundPositionMap) {
            LengthPercentage lengthPercentage = null;
            if (backgroundPositionMap == null) {
                return null;
            }
            LengthPercentage fromDynamic = (!backgroundPositionMap.hasKey(ViewProps.TOP) || backgroundPositionMap.getType(ViewProps.TOP) == ReadableType.Null) ? null : LengthPercentage.INSTANCE.setFromDynamic(backgroundPositionMap.getDynamic(ViewProps.TOP), true);
            LengthPercentage fromDynamic2 = (!backgroundPositionMap.hasKey(ViewProps.LEFT) || backgroundPositionMap.getType(ViewProps.LEFT) == ReadableType.Null) ? null : LengthPercentage.INSTANCE.setFromDynamic(backgroundPositionMap.getDynamic(ViewProps.LEFT), true);
            LengthPercentage fromDynamic3 = (!backgroundPositionMap.hasKey(ViewProps.RIGHT) || backgroundPositionMap.getType(ViewProps.RIGHT) == ReadableType.Null) ? null : LengthPercentage.INSTANCE.setFromDynamic(backgroundPositionMap.getDynamic(ViewProps.RIGHT), true);
            if (backgroundPositionMap.hasKey(ViewProps.BOTTOM) && backgroundPositionMap.getType(ViewProps.BOTTOM) != ReadableType.Null) {
                lengthPercentage = LengthPercentage.INSTANCE.setFromDynamic(backgroundPositionMap.getDynamic(ViewProps.BOTTOM), true);
            }
            return new BackgroundPosition(fromDynamic, fromDynamic2, fromDynamic3, lengthPercentage);
        }

        private Companion() {
        }
    }

    public BackgroundPosition(@Nullable LengthPercentage lengthPercentage, @Nullable LengthPercentage lengthPercentage2, @Nullable LengthPercentage lengthPercentage3, @Nullable LengthPercentage lengthPercentage4) {
        this.top = lengthPercentage;
        this.left = lengthPercentage2;
        this.right = lengthPercentage3;
        this.bottom = lengthPercentage4;
    }

    @Nullable
    public final LengthPercentage getBottom() {
        return this.bottom;
    }

    @Nullable
    public final LengthPercentage getLeft() {
        return this.left;
    }

    @Nullable
    public final LengthPercentage getRight() {
        return this.right;
    }

    @Nullable
    public final LengthPercentage getTop() {
        return this.top;
    }
}

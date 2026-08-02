package com.facebook.react.uimanager.style;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lb.C5444x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "", C5444x.f55808b, "Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;", "y", "<init>", "(Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;)V", "getX", "()Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;", "getY", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BackgroundRepeat {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final BackgroundRepeatKeyword x;

    @NotNull
    private final BackgroundRepeatKeyword y;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;", "", "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BackgroundRepeat;", "backgroundRepeatMap", "Lcom/facebook/react/bridge/ReadableMap;", "parseRepeatStyle", "Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;", "map", "key", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        private final BackgroundRepeatKeyword parseRepeatStyle(ReadableMap map, String key) {
            String string;
            if (map.hasKey(key) && map.getType(key) == ReadableType.String && (string = map.getString(key)) != null) {
                switch (string.hashCode()) {
                    case -934531685:
                        if (string.equals("repeat")) {
                            return BackgroundRepeatKeyword.Repeat;
                        }
                        break;
                    case -724648153:
                        if (string.equals("no-repeat")) {
                            return BackgroundRepeatKeyword.NoRepeat;
                        }
                        break;
                    case 108704142:
                        if (string.equals("round")) {
                            return BackgroundRepeatKeyword.Round;
                        }
                        break;
                    case 109637894:
                        if (string.equals("space")) {
                            return BackgroundRepeatKeyword.Space;
                        }
                        break;
                }
            }
            return null;
        }

        @Nullable
        public final BackgroundRepeat parse(@Nullable ReadableMap backgroundRepeatMap) {
            if (backgroundRepeatMap == null) {
                return null;
            }
            BackgroundRepeatKeyword parseRepeatStyle = parseRepeatStyle(backgroundRepeatMap, C5444x.f55808b);
            if (parseRepeatStyle == null) {
                parseRepeatStyle = BackgroundRepeatKeyword.Repeat;
            }
            BackgroundRepeatKeyword parseRepeatStyle2 = parseRepeatStyle(backgroundRepeatMap, "y");
            if (parseRepeatStyle2 == null) {
                parseRepeatStyle2 = BackgroundRepeatKeyword.Repeat;
            }
            return new BackgroundRepeat(parseRepeatStyle, parseRepeatStyle2);
        }

        private Companion() {
        }
    }

    public BackgroundRepeat(@NotNull BackgroundRepeatKeyword x10, @NotNull BackgroundRepeatKeyword y10) {
        Intrinsics.checkNotNullParameter(x10, "x");
        Intrinsics.checkNotNullParameter(y10, "y");
        this.x = x10;
        this.y = y10;
    }

    @NotNull
    public final BackgroundRepeatKeyword getX() {
        return this.x;
    }

    @NotNull
    public final BackgroundRepeatKeyword getY() {
        return this.y;
    }
}

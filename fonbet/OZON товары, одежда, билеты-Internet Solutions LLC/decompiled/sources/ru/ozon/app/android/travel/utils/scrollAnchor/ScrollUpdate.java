package ru.ozon.app.android.travel.utils.scrollAnchor;

import G.g;
import K1.G;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate;", "", "", "isVisible", "", "scrollAnchorId", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "anchorPosition", "<init>", "(ZLjava/lang/String;Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getScrollAnchorId", "Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "getAnchorPosition", "()Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "AnchorPosition", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ScrollUpdate {

    @NotNull
    private final AnchorPosition anchorPosition;
    private final boolean isVisible;

    @NotNull
    private final String scrollAnchorId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/utils/scrollAnchor/ScrollUpdate$AnchorPosition;", "", "<init>", "(Ljava/lang/String;I)V", "ABOVE_VISIBLE_AREA", "IN_VISIBLE_AREA", "BELOW_VISIBLE_AREA", "UNSPECIFIED", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AnchorPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AnchorPosition[] $VALUES;
        public static final AnchorPosition ABOVE_VISIBLE_AREA = new AnchorPosition("ABOVE_VISIBLE_AREA", 0);
        public static final AnchorPosition IN_VISIBLE_AREA = new AnchorPosition("IN_VISIBLE_AREA", 1);
        public static final AnchorPosition BELOW_VISIBLE_AREA = new AnchorPosition("BELOW_VISIBLE_AREA", 2);
        public static final AnchorPosition UNSPECIFIED = new AnchorPosition("UNSPECIFIED", 3);

        private static final /* synthetic */ AnchorPosition[] $values() {
            return new AnchorPosition[]{ABOVE_VISIBLE_AREA, IN_VISIBLE_AREA, BELOW_VISIBLE_AREA, UNSPECIFIED};
        }

        static {
            AnchorPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AnchorPosition(String str, int i11) {
        }

        public static AnchorPosition valueOf(String str) {
            return (AnchorPosition) Enum.valueOf(AnchorPosition.class, str);
        }

        public static AnchorPosition[] values() {
            return (AnchorPosition[]) $VALUES.clone();
        }
    }

    public ScrollUpdate(boolean z11, @NotNull String scrollAnchorId, @NotNull AnchorPosition anchorPosition) {
        Intrinsics.checkNotNullParameter(scrollAnchorId, "scrollAnchorId");
        Intrinsics.checkNotNullParameter(anchorPosition, "anchorPosition");
        this.isVisible = z11;
        this.scrollAnchorId = scrollAnchorId;
        this.anchorPosition = anchorPosition;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollUpdate)) {
            return false;
        }
        ScrollUpdate scrollUpdate = (ScrollUpdate) other;
        return this.isVisible == scrollUpdate.isVisible && Intrinsics.d(this.scrollAnchorId, scrollUpdate.scrollAnchorId) && this.anchorPosition == scrollUpdate.anchorPosition;
    }

    @NotNull
    public final AnchorPosition getAnchorPosition() {
        return this.anchorPosition;
    }

    @NotNull
    public final String getScrollAnchorId() {
        return this.scrollAnchorId;
    }

    public int hashCode() {
        return this.anchorPosition.hashCode() + g.a(Boolean.hashCode(this.isVisible) * 31, 31, this.scrollAnchorId);
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isVisible;
        String str = this.scrollAnchorId;
        AnchorPosition anchorPosition = this.anchorPosition;
        StringBuilder d11 = G.d("ScrollUpdate(isVisible=", ", scrollAnchorId=", str, ", anchorPosition=", z11);
        d11.append(anchorPosition);
        d11.append(")");
        return d11.toString();
    }
}

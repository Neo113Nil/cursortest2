package ru.ozon.fintech.ui.progress.dots;

import Cm.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/ui/progress/dots/FinDotsProgressViewState;", "", "dotsColor", "", "repeatCount", "<init>", "(II)V", "getDotsColor", "()I", "getRepeatCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinDotsProgressViewState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: default, reason: not valid java name */
    @NotNull
    private static final FinDotsProgressViewState f143default;
    private final int dotsColor;
    private final int repeatCount;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/ui/progress/dots/FinDotsProgressViewState$Companion;", "", "<init>", "()V", "default", "Lru/ozon/fintech/ui/progress/dots/FinDotsProgressViewState;", "getDefault", "()Lru/ozon/fintech/ui/progress/dots/FinDotsProgressViewState;", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FinDotsProgressViewState getDefault() {
            return FinDotsProgressViewState.f143default;
        }

        private Companion() {
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i11 = 0;
        f143default = new FinDotsProgressViewState(i11, i11, 3, defaultConstructorMarker);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FinDotsProgressViewState() {
        this(r2, r2, 3, null);
        int i11 = 0;
    }

    public static /* synthetic */ FinDotsProgressViewState copy$default(FinDotsProgressViewState finDotsProgressViewState, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = finDotsProgressViewState.dotsColor;
        }
        if ((i13 & 2) != 0) {
            i12 = finDotsProgressViewState.repeatCount;
        }
        return finDotsProgressViewState.copy(i11, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDotsColor() {
        return this.dotsColor;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRepeatCount() {
        return this.repeatCount;
    }

    @NotNull
    public final FinDotsProgressViewState copy(int dotsColor, int repeatCount) {
        return new FinDotsProgressViewState(dotsColor, repeatCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinDotsProgressViewState)) {
            return false;
        }
        FinDotsProgressViewState finDotsProgressViewState = (FinDotsProgressViewState) other;
        return this.dotsColor == finDotsProgressViewState.dotsColor && this.repeatCount == finDotsProgressViewState.repeatCount;
    }

    public final int getDotsColor() {
        return this.dotsColor;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public int hashCode() {
        return Integer.hashCode(this.repeatCount) + (Integer.hashCode(this.dotsColor) * 31);
    }

    @NotNull
    public String toString() {
        return e.c("FinDotsProgressViewState(dotsColor=", this.dotsColor, ", repeatCount=", ")", this.repeatCount);
    }

    public FinDotsProgressViewState(int i11, int i12) {
        this.dotsColor = i11;
        this.repeatCount = i12;
    }

    public /* synthetic */ FinDotsProgressViewState(int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? R.color.oz_accent_primary : i11, (i13 & 2) != 0 ? -1 : i12);
    }
}

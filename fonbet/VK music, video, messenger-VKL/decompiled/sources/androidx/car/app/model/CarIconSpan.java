package androidx.car.app.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Objects;
import xsna.i5s;
import xsna.lhg;
import xsna.qs9;

/* loaded from: classes11.dex */
public final class CarIconSpan extends CarSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    private final int mAlignment;

    @Nullable
    private final CarIcon mIcon;

    private CarIconSpan(@Nullable CarIcon carIcon, int i) {
        this.mIcon = carIcon;
        this.mAlignment = i;
    }

    private static String alignmentToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "unknown" : TtmlNode.CENTER : "baseline" : "bottom";
    }

    @NonNull
    public static CarIconSpan create(@NonNull CarIcon carIcon) {
        return create(carIcon, 1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CarIconSpan) {
            return Objects.equals(this.mIcon, ((CarIconSpan) obj).mIcon);
        }
        return false;
    }

    public int getAlignment() {
        return this.mAlignment;
    }

    @NonNull
    public CarIcon getIcon() {
        CarIcon carIcon = this.mIcon;
        Objects.requireNonNull(carIcon);
        return carIcon;
    }

    public int hashCode() {
        return Objects.hashCode(this.mIcon);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("[icon: ");
        sb.append(this.mIcon);
        sb.append(", alignment: ");
        return i5s.a(sb, alignmentToString(this.mAlignment), X3.j.e);
    }

    @NonNull
    public static CarIconSpan create(@NonNull CarIcon carIcon, int i) {
        qs9.c.b(carIcon);
        if (i != 1 && i != 0 && i != 2) {
            throw new IllegalStateException(lhg.a(i, "Invalid alignment value: "));
        }
        Objects.requireNonNull(carIcon);
        return new CarIconSpan(carIcon, i);
    }

    private CarIconSpan() {
        this.mIcon = null;
        this.mAlignment = 1;
    }
}

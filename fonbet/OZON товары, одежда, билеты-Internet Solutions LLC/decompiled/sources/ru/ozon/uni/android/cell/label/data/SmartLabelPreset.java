package ru.ozon.uni.android.cell.label.data;

import Am.C2438a;
import B0.C2454a;
import K00.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/uni/android/cell/label/data/SmartLabelPreset;", "", "", "textAppearanceResId", "textAlignment", "gap", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTextAppearanceResId", "getTextAlignment", "getGap", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SmartLabelPreset {
    private final int gap;
    private final int textAlignment;
    private final int textAppearanceResId;

    public SmartLabelPreset() {
        this(0, 0, 0, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartLabelPreset)) {
            return false;
        }
        SmartLabelPreset smartLabelPreset = (SmartLabelPreset) other;
        return this.textAppearanceResId == smartLabelPreset.textAppearanceResId && this.textAlignment == smartLabelPreset.textAlignment && this.gap == smartLabelPreset.gap;
    }

    public final int getGap() {
        return this.gap;
    }

    public final int getTextAlignment() {
        return this.textAlignment;
    }

    public final int getTextAppearanceResId() {
        return this.textAppearanceResId;
    }

    public int hashCode() {
        return Integer.hashCode(this.gap) + C2454a.a(this.textAlignment, Integer.hashCode(this.textAppearanceResId) * 31, 31);
    }

    @NotNull
    public String toString() {
        return b.e(this.gap, ")", C2438a.a("SmartLabelPreset(textAppearanceResId=", this.textAppearanceResId, ", textAlignment=", ", gap=", this.textAlignment));
    }

    public SmartLabelPreset(int i11, int i12, int i13) {
        this.textAppearanceResId = i11;
        this.textAlignment = i12;
        this.gap = i13;
    }

    public /* synthetic */ SmartLabelPreset(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i11, (i14 & 2) != 0 ? 8388611 : i12, (i14 & 4) != 0 ? 0 : i13);
    }
}

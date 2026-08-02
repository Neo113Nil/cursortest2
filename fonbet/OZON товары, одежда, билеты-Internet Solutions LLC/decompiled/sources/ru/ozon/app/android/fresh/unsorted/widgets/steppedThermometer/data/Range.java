package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data;

import B0.C2454a;
import Tl.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Range;", "", "leftMark", "Lru/ozon/uni/atoms/data/text/TextDTO;", "progress", "", "rightMark", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;ILru/ozon/uni/atoms/data/text/TextDTO;)V", "getLeftMark", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getProgress", "()I", "getRightMark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Range {
    public static final int $stable = 0;

    @NotNull
    private final TextDTO leftMark;
    private final int progress;
    private final TextDTO rightMark;

    public Range(@NotNull TextDTO leftMark, int i11, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(leftMark, "leftMark");
        this.leftMark = leftMark;
        this.progress = i11;
        this.rightMark = textDTO;
    }

    public static /* synthetic */ Range copy$default(Range range, TextDTO textDTO, int i11, TextDTO textDTO2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textDTO = range.leftMark;
        }
        if ((i12 & 2) != 0) {
            i11 = range.progress;
        }
        if ((i12 & 4) != 0) {
            textDTO2 = range.rightMark;
        }
        return range.copy(textDTO, i11, textDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getLeftMark() {
        return this.leftMark;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* renamed from: component3, reason: from getter */
    public final TextDTO getRightMark() {
        return this.rightMark;
    }

    @NotNull
    public final Range copy(@NotNull TextDTO leftMark, int progress, TextDTO rightMark) {
        Intrinsics.checkNotNullParameter(leftMark, "leftMark");
        return new Range(leftMark, progress, rightMark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Range)) {
            return false;
        }
        Range range = (Range) other;
        return Intrinsics.d(this.leftMark, range.leftMark) && this.progress == range.progress && Intrinsics.d(this.rightMark, range.rightMark);
    }

    @NotNull
    public final TextDTO getLeftMark() {
        return this.leftMark;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final TextDTO getRightMark() {
        return this.rightMark;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.progress, this.leftMark.hashCode() * 31, 31);
        TextDTO textDTO = this.rightMark;
        return a11 + (textDTO == null ? 0 : textDTO.hashCode());
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.leftMark;
        int i11 = this.progress;
        TextDTO textDTO2 = this.rightMark;
        StringBuilder sb2 = new StringBuilder("Range(leftMark=");
        sb2.append(textDTO);
        sb2.append(", progress=");
        sb2.append(i11);
        sb2.append(", rightMark=");
        return b.e(sb2, textDTO2, ")");
    }

    public /* synthetic */ Range(TextDTO textDTO, int i11, TextDTO textDTO2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, i11, (i12 & 4) != 0 ? null : textDTO2);
    }
}

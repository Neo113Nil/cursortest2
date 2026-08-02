package ru.ozon.app.android.returns.creation.widgets.photoPicker.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/photoPicker/data/MinimalLimit;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "count", "", "<init>", "(Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;I)V", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MinimalLimit {
    public static final int $stable = 8;
    private final int count;

    @NotNull
    private final DisclaimerAtom disclaimer;

    public MinimalLimit(@NotNull DisclaimerAtom disclaimer, int i11) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.disclaimer = disclaimer;
        this.count = i11;
    }

    public static /* synthetic */ MinimalLimit copy$default(MinimalLimit minimalLimit, DisclaimerAtom disclaimerAtom, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            disclaimerAtom = minimalLimit.disclaimer;
        }
        if ((i12 & 2) != 0) {
            i11 = minimalLimit.count;
        }
        return minimalLimit.copy(disclaimerAtom, i11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final MinimalLimit copy(@NotNull DisclaimerAtom disclaimer, int count) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new MinimalLimit(disclaimer, count);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MinimalLimit)) {
            return false;
        }
        MinimalLimit minimalLimit = (MinimalLimit) other;
        return Intrinsics.d(this.disclaimer, minimalLimit.disclaimer) && this.count == minimalLimit.count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + (this.disclaimer.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MinimalLimit(disclaimer=" + this.disclaimer + ", count=" + this.count + ")";
    }
}

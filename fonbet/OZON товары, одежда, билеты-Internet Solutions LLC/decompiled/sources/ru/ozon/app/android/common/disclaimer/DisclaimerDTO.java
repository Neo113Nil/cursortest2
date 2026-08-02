package ru.ozon.app.android.common.disclaimer;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/common/disclaimer/DisclaimerDTO;", "", "isRounded", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "<init>", "(ZLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)V", "()Z", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "disclaimer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DisclaimerDTO {

    @NotNull
    private final DisclaimerAtom disclaimer;
    private final boolean isRounded;

    public DisclaimerDTO(boolean z11, @NotNull DisclaimerAtom disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.isRounded = z11;
        this.disclaimer = disclaimer;
    }

    public static /* synthetic */ DisclaimerDTO copy$default(DisclaimerDTO disclaimerDTO, boolean z11, DisclaimerAtom disclaimerAtom, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = disclaimerDTO.isRounded;
        }
        if ((i11 & 2) != 0) {
            disclaimerAtom = disclaimerDTO.disclaimer;
        }
        return disclaimerDTO.copy(z11, disclaimerAtom);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final DisclaimerDTO copy(boolean isRounded, @NotNull DisclaimerAtom disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return new DisclaimerDTO(isRounded, disclaimer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisclaimerDTO)) {
            return false;
        }
        DisclaimerDTO disclaimerDTO = (DisclaimerDTO) other;
        return this.isRounded == disclaimerDTO.isRounded && Intrinsics.d(this.disclaimer, disclaimerDTO.disclaimer);
    }

    @NotNull
    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    public int hashCode() {
        return this.disclaimer.hashCode() + (Boolean.hashCode(this.isRounded) * 31);
    }

    public final boolean isRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        return "DisclaimerDTO(isRounded=" + this.isRounded + ", disclaimer=" + this.disclaimer + ")";
    }
}

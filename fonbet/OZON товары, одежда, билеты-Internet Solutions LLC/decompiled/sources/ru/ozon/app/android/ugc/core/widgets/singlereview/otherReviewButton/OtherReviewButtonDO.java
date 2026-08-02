package ru.ozon.app.android.ugc.core.widgets.singlereview.otherReviewButton;

import Pk0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/otherReviewButton/OtherReviewButtonDO;", "", "", "uuid", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "showOtherReviewsButton", "", "hasItems", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "getShowOtherReviewsButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "Z", "getHasItems", "()Z", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OtherReviewButtonDO {
    public static final int $stable = ButtonV3Atom.LargeButton.$stable;
    private final boolean hasItems;
    private final ButtonV3Atom.LargeButton showOtherReviewsButton;

    @NotNull
    private final String uuid;

    public OtherReviewButtonDO(@NotNull String uuid, ButtonV3Atom.LargeButton largeButton, boolean z11) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.showOtherReviewsButton = largeButton;
        this.hasItems = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherReviewButtonDO)) {
            return false;
        }
        OtherReviewButtonDO otherReviewButtonDO = (OtherReviewButtonDO) other;
        return Intrinsics.d(this.uuid, otherReviewButtonDO.uuid) && Intrinsics.d(this.showOtherReviewsButton, otherReviewButtonDO.showOtherReviewsButton) && this.hasItems == otherReviewButtonDO.hasItems;
    }

    public final boolean getHasItems() {
        return this.hasItems;
    }

    public final ButtonV3Atom.LargeButton getShowOtherReviewsButton() {
        return this.showOtherReviewsButton;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = this.uuid.hashCode() * 31;
        ButtonV3Atom.LargeButton largeButton = this.showOtherReviewsButton;
        return Boolean.hashCode(this.hasItems) + ((hashCode + (largeButton == null ? 0 : largeButton.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.uuid;
        ButtonV3Atom.LargeButton largeButton = this.showOtherReviewsButton;
        boolean z11 = this.hasItems;
        StringBuilder sb2 = new StringBuilder("OtherReviewButtonDO(uuid=");
        sb2.append(str);
        sb2.append(", showOtherReviewsButton=");
        sb2.append(largeButton);
        sb2.append(", hasItems=");
        return a.a(")", sb2, z11);
    }
}

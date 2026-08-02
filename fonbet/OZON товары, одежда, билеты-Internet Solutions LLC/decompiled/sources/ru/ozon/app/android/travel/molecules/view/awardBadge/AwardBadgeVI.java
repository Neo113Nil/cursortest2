package ru.ozon.app.android.travel.molecules.view.awardBadge;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.awardBadge.AwardBadgeDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/molecules/view/awardBadge/AwardBadgeVI;", "", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "icon", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "text", "", "backgroundColor", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "size", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "getIcon", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeIcon;", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "getText", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeText;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "getSize", "()Lru/ozon/app/android/travel/molecules/dto/awardBadge/AwardBadgeDTO$AwardBadgeSize;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AwardBadgeVI {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final AwardBadgeDTO.AwardBadgeIcon icon;

    @NotNull
    private final AwardBadgeDTO.AwardBadgeSize size;
    private final AwardBadgeDTO.AwardBadgeText text;

    public AwardBadgeVI(@NotNull AwardBadgeDTO.AwardBadgeIcon icon, AwardBadgeDTO.AwardBadgeText awardBadgeText, @NotNull String backgroundColor, @NotNull AwardBadgeDTO.AwardBadgeSize size) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(size, "size");
        this.icon = icon;
        this.text = awardBadgeText;
        this.backgroundColor = backgroundColor;
        this.size = size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwardBadgeVI)) {
            return false;
        }
        AwardBadgeVI awardBadgeVI = (AwardBadgeVI) other;
        return Intrinsics.d(this.icon, awardBadgeVI.icon) && Intrinsics.d(this.text, awardBadgeVI.text) && Intrinsics.d(this.backgroundColor, awardBadgeVI.backgroundColor) && this.size == awardBadgeVI.size;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final AwardBadgeDTO.AwardBadgeIcon getIcon() {
        return this.icon;
    }

    @NotNull
    public final AwardBadgeDTO.AwardBadgeSize getSize() {
        return this.size;
    }

    public final AwardBadgeDTO.AwardBadgeText getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        AwardBadgeDTO.AwardBadgeText awardBadgeText = this.text;
        return this.size.hashCode() + g.a((hashCode + (awardBadgeText == null ? 0 : awardBadgeText.hashCode())) * 31, 31, this.backgroundColor);
    }

    @NotNull
    public String toString() {
        return "AwardBadgeVI(icon=" + this.icon + ", text=" + this.text + ", backgroundColor=" + this.backgroundColor + ", size=" + this.size + ")";
    }
}

package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.compose.presentation;

import B1.B;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/compose/presentation/ActiveTooltip;", "", "", "key", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "dto", "LB1/B;", "anchor", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;LB1/B;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "getDto", "()Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "LB1/B;", "getAnchor", "()LB1/B;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ActiveTooltip {
    private final B anchor;

    @NotNull
    private final IconTooltipDto dto;
    private final String key;

    public ActiveTooltip(String str, @NotNull IconTooltipDto dto, B b11) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        this.key = str;
        this.dto = dto;
        this.anchor = b11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveTooltip)) {
            return false;
        }
        ActiveTooltip activeTooltip = (ActiveTooltip) other;
        return Intrinsics.d(this.key, activeTooltip.key) && Intrinsics.d(this.dto, activeTooltip.dto) && Intrinsics.d(this.anchor, activeTooltip.anchor);
    }

    public final B getAnchor() {
        return this.anchor;
    }

    @NotNull
    public final IconTooltipDto getDto() {
        return this.dto;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (this.dto.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        B b11 = this.anchor;
        return hashCode + (b11 != null ? b11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActiveTooltip(key=" + this.key + ", dto=" + this.dto + ", anchor=" + this.anchor + ")";
    }
}

package ru.ozon.app.android.search.widgets.separatorBadge.presentation;

import GR.b;
import Gl.C3124a;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.separatorBadge.data.SeparatorBadgeDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/search/widgets/separatorBadge/presentation/SeparatorBadgeVI;", "Ll20/c;", "", "id", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "backgroundColor", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontalPadding", "topPadding", "bottomPadding", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;", "separator", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "getBottomPadding", "Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;", "getSeparator", "()Lru/ozon/app/android/search/widgets/separatorBadge/data/SeparatorBadgeDTO$SeparatorSettingsDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SeparatorBadgeVI implements c {
    private final String backgroundColor;

    @NotNull
    private final BadgeDTO badge;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final Paddings horizontalPadding;
    private final long id;
    private final SeparatorBadgeDTO.SeparatorSettingsDTO separator;
    private final t tokenizedEvent;

    @NotNull
    private final Paddings topPadding;

    public SeparatorBadgeVI(long j11, @NotNull BadgeDTO badge, String str, @NotNull Paddings horizontalPadding, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, SeparatorBadgeDTO.SeparatorSettingsDTO separatorSettingsDTO, t tVar) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(horizontalPadding, "horizontalPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        this.id = j11;
        this.badge = badge;
        this.backgroundColor = str;
        this.horizontalPadding = horizontalPadding;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.separator = separatorSettingsDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorBadgeVI)) {
            return false;
        }
        SeparatorBadgeVI separatorBadgeVI = (SeparatorBadgeVI) other;
        return this.id == separatorBadgeVI.id && Intrinsics.d(this.badge, separatorBadgeVI.badge) && Intrinsics.d(this.backgroundColor, separatorBadgeVI.backgroundColor) && this.horizontalPadding == separatorBadgeVI.horizontalPadding && this.topPadding == separatorBadgeVI.topPadding && this.bottomPadding == separatorBadgeVI.bottomPadding && Intrinsics.d(this.separator, separatorBadgeVI.separator) && Intrinsics.d(this.tokenizedEvent, separatorBadgeVI.tokenizedEvent);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final SeparatorBadgeDTO.SeparatorSettingsDTO getSeparator() {
        return this.separator;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C3124a.c(this.badge, Long.hashCode(this.id) * 31, 31);
        String str = this.backgroundColor;
        int b11 = b.b(this.bottomPadding, b.b(this.topPadding, b.b(this.horizontalPadding, (c11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        SeparatorBadgeDTO.SeparatorSettingsDTO separatorSettingsDTO = this.separator;
        int hashCode = (b11 + (separatorSettingsDTO == null ? 0 : separatorSettingsDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SeparatorBadgeVI(id=" + this.id + ", badge=" + this.badge + ", backgroundColor=" + this.backgroundColor + ", horizontalPadding=" + this.horizontalPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ", separator=" + this.separator + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}

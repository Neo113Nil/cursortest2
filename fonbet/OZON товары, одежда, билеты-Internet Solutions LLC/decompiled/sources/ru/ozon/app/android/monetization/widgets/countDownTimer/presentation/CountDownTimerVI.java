package ru.ozon.app.android.monetization.widgets.countDownTimer.presentation;

import D3.g;
import Lh.a;
import Tg.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b)\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/monetization/widgets/countDownTimer/presentation/CountDownTimerVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "deadlineDate", "Lru/ozon/uni/atoms/data/text/TextDTO;", "defaultTitle", "defaultSubtitle", "expiredTitle", "expiredSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "timerBadge", "LTg/b;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;LTg/b;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "getDeadlineDate", "()Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDefaultTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDefaultSubtitle", "getExpiredTitle", "getExpiredSubtitle", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTimerBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LTg/b;", "getAction", "()LTg/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CountDownTimerVI implements c {
    private final b action;

    @NotNull
    private final StableDateTime deadlineDate;
    private final TextDTO defaultSubtitle;

    @NotNull
    private final TextDTO defaultTitle;
    private final TextDTO expiredSubtitle;

    @NotNull
    private final TextDTO expiredTitle;
    private final long id;
    private final BadgeDTO timerBadge;
    private final t tokenizedEvent;

    public CountDownTimerVI(long j11, @NotNull StableDateTime deadlineDate, @NotNull TextDTO defaultTitle, TextDTO textDTO, @NotNull TextDTO expiredTitle, TextDTO textDTO2, BadgeDTO badgeDTO, b bVar, t tVar) {
        Intrinsics.checkNotNullParameter(deadlineDate, "deadlineDate");
        Intrinsics.checkNotNullParameter(defaultTitle, "defaultTitle");
        Intrinsics.checkNotNullParameter(expiredTitle, "expiredTitle");
        this.id = j11;
        this.deadlineDate = deadlineDate;
        this.defaultTitle = defaultTitle;
        this.defaultSubtitle = textDTO;
        this.expiredTitle = expiredTitle;
        this.expiredSubtitle = textDTO2;
        this.timerBadge = badgeDTO;
        this.action = bVar;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountDownTimerVI)) {
            return false;
        }
        CountDownTimerVI countDownTimerVI = (CountDownTimerVI) other;
        return this.id == countDownTimerVI.id && Intrinsics.d(this.deadlineDate, countDownTimerVI.deadlineDate) && Intrinsics.d(this.defaultTitle, countDownTimerVI.defaultTitle) && Intrinsics.d(this.defaultSubtitle, countDownTimerVI.defaultSubtitle) && Intrinsics.d(this.expiredTitle, countDownTimerVI.expiredTitle) && Intrinsics.d(this.expiredSubtitle, countDownTimerVI.expiredSubtitle) && Intrinsics.d(this.timerBadge, countDownTimerVI.timerBadge) && Intrinsics.d(this.action, countDownTimerVI.action) && Intrinsics.d(this.tokenizedEvent, countDownTimerVI.tokenizedEvent);
    }

    public final b getAction() {
        return this.action;
    }

    @NotNull
    public final StableDateTime getDeadlineDate() {
        return this.deadlineDate;
    }

    public final TextDTO getDefaultSubtitle() {
        return this.defaultSubtitle;
    }

    @NotNull
    public final TextDTO getDefaultTitle() {
        return this.defaultTitle;
    }

    public final TextDTO getExpiredSubtitle() {
        return this.expiredSubtitle;
    }

    @NotNull
    public final TextDTO getExpiredTitle() {
        return this.expiredTitle;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final BadgeDTO getTimerBadge() {
        return this.timerBadge;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Ns.b.a(this.defaultTitle, (this.deadlineDate.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        TextDTO textDTO = this.defaultSubtitle;
        int a12 = Ns.b.a(this.expiredTitle, (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31);
        TextDTO textDTO2 = this.expiredSubtitle;
        int hashCode = (a12 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
        BadgeDTO badgeDTO = this.timerBadge;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        b bVar = this.action;
        int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        StableDateTime stableDateTime = this.deadlineDate;
        TextDTO textDTO = this.defaultTitle;
        TextDTO textDTO2 = this.defaultSubtitle;
        TextDTO textDTO3 = this.expiredTitle;
        TextDTO textDTO4 = this.expiredSubtitle;
        BadgeDTO badgeDTO = this.timerBadge;
        b bVar = this.action;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("CountDownTimerVI(id=");
        sb2.append(j11);
        sb2.append(", deadlineDate=");
        sb2.append(stableDateTime);
        g.i(", defaultTitle=", ", defaultSubtitle=", sb2, textDTO, textDTO2);
        g.i(", expiredTitle=", ", expiredSubtitle=", sb2, textDTO3, textDTO4);
        sb2.append(", timerBadge=");
        sb2.append(badgeDTO);
        sb2.append(", action=");
        sb2.append(bVar);
        return a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}

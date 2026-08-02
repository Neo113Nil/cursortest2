package ru.ozon.app.android.regulardraw.widgets.lotteryResult.presentation;

import Ak.C2436a;
import Tg.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001:\u000278BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "date", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "rightIcon", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "winStatusBadge", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;", "values", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;", "drawStatus", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "getDate", "()Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getRightIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getWinStatusBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;", "getValues", "()Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;", "Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;", "getDrawStatus", "()Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Values", "DrawStatus", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryResultVI implements c {

    @NotNull
    private final StableDateTime date;
    private final DrawStatus drawStatus;
    private final long id;

    @NotNull
    private final IconButtonV3DTO rightIcon;

    @NotNull
    private final TextDTO title;
    private final t tokenizedEvent;
    private final Values values;
    private final BadgeDTO winStatusBadge;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$DrawStatus;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "badgeBorderColor", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "broadcastDate", "LTg/b;", "broadcastAction", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;LTg/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/lang/String;", "getBadgeBorderColor", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "getBroadcastDate", "()Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "LTg/b;", "getBroadcastAction", "()LTg/b;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DrawStatus {

        @NotNull
        private final BadgeDTO badge;
        private final String badgeBorderColor;
        private final b broadcastAction;
        private final StableDateTime broadcastDate;

        public DrawStatus(@NotNull BadgeDTO badge, String str, StableDateTime stableDateTime, b bVar) {
            Intrinsics.checkNotNullParameter(badge, "badge");
            this.badge = badge;
            this.badgeBorderColor = str;
            this.broadcastDate = stableDateTime;
            this.broadcastAction = bVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawStatus)) {
                return false;
            }
            DrawStatus drawStatus = (DrawStatus) other;
            return Intrinsics.d(this.badge, drawStatus.badge) && Intrinsics.d(this.badgeBorderColor, drawStatus.badgeBorderColor) && Intrinsics.d(this.broadcastDate, drawStatus.broadcastDate) && Intrinsics.d(this.broadcastAction, drawStatus.broadcastAction);
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final String getBadgeBorderColor() {
            return this.badgeBorderColor;
        }

        public final b getBroadcastAction() {
            return this.broadcastAction;
        }

        public final StableDateTime getBroadcastDate() {
            return this.broadcastDate;
        }

        public int hashCode() {
            int hashCode = this.badge.hashCode() * 31;
            String str = this.badgeBorderColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            StableDateTime stableDateTime = this.broadcastDate;
            int hashCode3 = (hashCode2 + (stableDateTime == null ? 0 : stableDateTime.hashCode())) * 31;
            b bVar = this.broadcastAction;
            return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "DrawStatus(badge=" + this.badge + ", badgeBorderColor=" + this.badgeBorderColor + ", broadcastDate=" + this.broadcastDate + ", broadcastAction=" + this.broadcastAction + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryResult/presentation/LotteryResultVI$Values;", "", "", "", "left", "right", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getLeft", "()Ljava/util/List;", "getRight", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Values {

        @NotNull
        private final List<String> left;

        @NotNull
        private final List<String> right;

        public Values(@NotNull List<String> left, @NotNull List<String> right) {
            Intrinsics.checkNotNullParameter(left, "left");
            Intrinsics.checkNotNullParameter(right, "right");
            this.left = left;
            this.right = right;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Values)) {
                return false;
            }
            Values values = (Values) other;
            return Intrinsics.d(this.left, values.left) && Intrinsics.d(this.right, values.right);
        }

        @NotNull
        public final List<String> getLeft() {
            return this.left;
        }

        @NotNull
        public final List<String> getRight() {
            return this.right;
        }

        public int hashCode() {
            return this.right.hashCode() + (this.left.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return C2436a.b("Values(left=", this.left, ", right=", ")", this.right);
        }
    }

    public LotteryResultVI(long j11, @NotNull StableDateTime date, @NotNull TextDTO title, @NotNull IconButtonV3DTO rightIcon, BadgeDTO badgeDTO, Values values, DrawStatus drawStatus, t tVar) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rightIcon, "rightIcon");
        this.id = j11;
        this.date = date;
        this.title = title;
        this.rightIcon = rightIcon;
        this.winStatusBadge = badgeDTO;
        this.values = values;
        this.drawStatus = drawStatus;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryResultVI)) {
            return false;
        }
        LotteryResultVI lotteryResultVI = (LotteryResultVI) other;
        return this.id == lotteryResultVI.id && Intrinsics.d(this.date, lotteryResultVI.date) && Intrinsics.d(this.title, lotteryResultVI.title) && Intrinsics.d(this.rightIcon, lotteryResultVI.rightIcon) && Intrinsics.d(this.winStatusBadge, lotteryResultVI.winStatusBadge) && Intrinsics.d(this.values, lotteryResultVI.values) && Intrinsics.d(this.drawStatus, lotteryResultVI.drawStatus) && Intrinsics.d(this.tokenizedEvent, lotteryResultVI.tokenizedEvent);
    }

    @NotNull
    public final StableDateTime getDate() {
        return this.date;
    }

    public final DrawStatus getDrawStatus() {
        return this.drawStatus;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final IconButtonV3DTO getRightIcon() {
        return this.rightIcon;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public final Values getValues() {
        return this.values;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public final BadgeDTO getWinStatusBadge() {
        return this.winStatusBadge;
    }

    public int hashCode() {
        int c11 = GR.b.c(this.rightIcon, Ns.b.a(this.title, (this.date.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31);
        BadgeDTO badgeDTO = this.winStatusBadge;
        int hashCode = (c11 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        Values values = this.values;
        int hashCode2 = (hashCode + (values == null ? 0 : values.hashCode())) * 31;
        DrawStatus drawStatus = this.drawStatus;
        int hashCode3 = (hashCode2 + (drawStatus == null ? 0 : drawStatus.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LotteryResultVI(id=" + this.id + ", date=" + this.date + ", title=" + this.title + ", rightIcon=" + this.rightIcon + ", winStatusBadge=" + this.winStatusBadge + ", values=" + this.values + ", drawStatus=" + this.drawStatus + ", tokenizedEvent=" + this.tokenizedEvent + ")";
    }
}

package ru.ozon.app.android.regulardraw.widgets.lotteryInformation.presentation;

import Co.a;
import G.g;
import Gl.C3124a;
import Tg.b;
import Tz.C4055a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001:\u0004()*+B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;", "banner", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;", "mainInfo", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "button", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;", "getBanner", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;", "getMainInfo", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;", "Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "getButton", "()Lru/ozon/app/android/regulardraw/ui/button/MorkovskShadowButtonDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Banner", "MainInfo", "ActiveMainInfo", "EmptyMainInfo", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class LotteryInformationVI implements c {

    @NotNull
    private final Banner banner;
    private final MorkovskShadowButtonDTO button;
    private final long id;

    @NotNull
    private final MainInfo mainInfo;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;", "", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$Item;", "items", "", "imagePath", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "ticketsPurchaseTimerData", "LTg/b;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/util/List;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;LTg/b;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getImagePath", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "getTicketsPurchaseTimerData", "()Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "LTg/b;", "getAction", "()LTg/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Item", "TicketsPurchaseTimerData", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActiveMainInfo implements MainInfo {
        private final b action;

        @NotNull
        private final BadgeDTO badge;

        @NotNull
        private final String imagePath;

        @NotNull
        private final List<Item> items;

        @NotNull
        private final TicketsPurchaseTimerData ticketsPurchaseTimerData;
        private final t tokenizedEvent;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$Item;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getSubtitle", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Item {

            @NotNull
            private final String subtitle;

            @NotNull
            private final TextDTO title;
            private final t tokenizedEvent;

            public Item(@NotNull TextDTO title, @NotNull String subtitle, t tVar) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.title = title;
                this.subtitle = subtitle;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return Intrinsics.d(this.title, item.title) && Intrinsics.d(this.subtitle, item.subtitle) && Intrinsics.d(this.tokenizedEvent, item.tokenizedEvent);
            }

            @NotNull
            public final String getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                int a11 = g.a(this.title.hashCode() * 31, 31, this.subtitle);
                t tVar = this.tokenizedEvent;
                return a11 + (tVar == null ? 0 : tVar.hashCode());
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                String str = this.subtitle;
                return Tl.b.d(D3.g.f("Item(title=", textDTO, ", subtitle=", str, ", tokenizedEvent="), this.tokenizedEvent, ")");
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo$TicketsPurchaseTimerData;", "", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "date", "", "timerText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "LTg/b;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;LTg/b;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "getDate", "()Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "Ljava/lang/String;", "getTimerText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "LTg/b;", "getAction", "()LTg/b;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TicketsPurchaseTimerData {
            private final b action;
            private final StableDateTime date;

            @NotNull
            private final TextDTO text;
            private final String timerText;
            private final t tokenizedEvent;

            public TicketsPurchaseTimerData(StableDateTime stableDateTime, String str, @NotNull TextDTO text, b bVar, t tVar) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.date = stableDateTime;
                this.timerText = str;
                this.text = text;
                this.action = bVar;
                this.tokenizedEvent = tVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TicketsPurchaseTimerData)) {
                    return false;
                }
                TicketsPurchaseTimerData ticketsPurchaseTimerData = (TicketsPurchaseTimerData) other;
                return Intrinsics.d(this.date, ticketsPurchaseTimerData.date) && Intrinsics.d(this.timerText, ticketsPurchaseTimerData.timerText) && Intrinsics.d(this.text, ticketsPurchaseTimerData.text) && Intrinsics.d(this.action, ticketsPurchaseTimerData.action) && Intrinsics.d(this.tokenizedEvent, ticketsPurchaseTimerData.tokenizedEvent);
            }

            public final b getAction() {
                return this.action;
            }

            public final StableDateTime getDate() {
                return this.date;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public final String getTimerText() {
                return this.timerText;
            }

            public final t getTokenizedEvent() {
                return this.tokenizedEvent;
            }

            public int hashCode() {
                StableDateTime stableDateTime = this.date;
                int hashCode = (stableDateTime == null ? 0 : stableDateTime.hashCode()) * 31;
                String str = this.timerText;
                int a11 = Ns.b.a(this.text, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
                b bVar = this.action;
                int hashCode2 = (a11 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                t tVar = this.tokenizedEvent;
                return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                StableDateTime stableDateTime = this.date;
                String str = this.timerText;
                TextDTO textDTO = this.text;
                b bVar = this.action;
                t tVar = this.tokenizedEvent;
                StringBuilder sb2 = new StringBuilder("TicketsPurchaseTimerData(date=");
                sb2.append(stableDateTime);
                sb2.append(", timerText=");
                sb2.append(str);
                sb2.append(", text=");
                sb2.append(textDTO);
                sb2.append(", action=");
                sb2.append(bVar);
                sb2.append(", tokenizedEvent=");
                return Tl.b.d(sb2, tVar, ")");
            }
        }

        public ActiveMainInfo(@NotNull List<Item> items, @NotNull String imagePath, @NotNull BadgeDTO badge, @NotNull TicketsPurchaseTimerData ticketsPurchaseTimerData, b bVar, t tVar) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            Intrinsics.checkNotNullParameter(badge, "badge");
            Intrinsics.checkNotNullParameter(ticketsPurchaseTimerData, "ticketsPurchaseTimerData");
            this.items = items;
            this.imagePath = imagePath;
            this.badge = badge;
            this.ticketsPurchaseTimerData = ticketsPurchaseTimerData;
            this.action = bVar;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActiveMainInfo)) {
                return false;
            }
            ActiveMainInfo activeMainInfo = (ActiveMainInfo) other;
            return Intrinsics.d(this.items, activeMainInfo.items) && Intrinsics.d(this.imagePath, activeMainInfo.imagePath) && Intrinsics.d(this.badge, activeMainInfo.badge) && Intrinsics.d(this.ticketsPurchaseTimerData, activeMainInfo.ticketsPurchaseTimerData) && Intrinsics.d(this.action, activeMainInfo.action) && Intrinsics.d(this.tokenizedEvent, activeMainInfo.tokenizedEvent);
        }

        public final b getAction() {
            return this.action;
        }

        @NotNull
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getImagePath() {
            return this.imagePath;
        }

        @NotNull
        public final List<Item> getItems() {
            return this.items;
        }

        @NotNull
        public final TicketsPurchaseTimerData getTicketsPurchaseTimerData() {
            return this.ticketsPurchaseTimerData;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = (this.ticketsPurchaseTimerData.hashCode() + C3124a.c(this.badge, g.a(this.items.hashCode() * 31, 31, this.imagePath), 31)) * 31;
            b bVar = this.action;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            List<Item> list = this.items;
            String str = this.imagePath;
            BadgeDTO badgeDTO = this.badge;
            TicketsPurchaseTimerData ticketsPurchaseTimerData = this.ticketsPurchaseTimerData;
            b bVar = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder a11 = C4055a.a("ActiveMainInfo(items=", ", imagePath=", str, ", badge=", list);
            a11.append(badgeDTO);
            a11.append(", ticketsPurchaseTimerData=");
            a11.append(ticketsPurchaseTimerData);
            a11.append(", action=");
            a11.append(bVar);
            a11.append(", tokenizedEvent=");
            a11.append(tVar);
            a11.append(")");
            return a11.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$Banner;", "", "", "imagePath", "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "ticketsAmount", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImagePath", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "getTicketsAmount", "()Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Banner {

        @NotNull
        private final String imagePath;
        private final TextDTO subtitle;
        private final MorkovskCurrencyBadgeVO ticketsAmount;
        private final t tokenizedEvent;

        public Banner(@NotNull String imagePath, TextDTO textDTO, MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO, t tVar) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            this.imagePath = imagePath;
            this.subtitle = textDTO;
            this.ticketsAmount = morkovskCurrencyBadgeVO;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.imagePath, banner.imagePath) && Intrinsics.d(this.subtitle, banner.subtitle) && Intrinsics.d(this.ticketsAmount, banner.ticketsAmount) && Intrinsics.d(this.tokenizedEvent, banner.tokenizedEvent);
        }

        @NotNull
        public final String getImagePath() {
            return this.imagePath;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        public final MorkovskCurrencyBadgeVO getTicketsAmount() {
            return this.ticketsAmount;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.imagePath.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = this.ticketsAmount;
            int hashCode3 = (hashCode2 + (morkovskCurrencyBadgeVO == null ? 0 : morkovskCurrencyBadgeVO.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.imagePath;
            TextDTO textDTO = this.subtitle;
            MorkovskCurrencyBadgeVO morkovskCurrencyBadgeVO = this.ticketsAmount;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = a.b("Banner(imagePath=", textDTO, str, ", subtitle=", ", ticketsAmount=");
            b11.append(morkovskCurrencyBadgeVO);
            b11.append(", tokenizedEvent=");
            b11.append(tVar);
            b11.append(")");
            return b11.toString();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$EmptyMainInfo;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;", "", "imagePath", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImagePath", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyMainInfo implements MainInfo {

        @NotNull
        private final String imagePath;
        private final t tokenizedEvent;

        public EmptyMainInfo(@NotNull String imagePath, t tVar) {
            Intrinsics.checkNotNullParameter(imagePath, "imagePath");
            this.imagePath = imagePath;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyMainInfo)) {
                return false;
            }
            EmptyMainInfo emptyMainInfo = (EmptyMainInfo) other;
            return Intrinsics.d(this.imagePath, emptyMainInfo.imagePath) && Intrinsics.d(this.tokenizedEvent, emptyMainInfo.tokenizedEvent);
        }

        @NotNull
        public final String getImagePath() {
            return this.imagePath;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int hashCode = this.imagePath.hashCode() * 31;
            t tVar = this.tokenizedEvent;
            return hashCode + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            return "EmptyMainInfo(imagePath=" + this.imagePath + ", tokenizedEvent=" + this.tokenizedEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$MainInfo;", "", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$ActiveMainInfo;", "Lru/ozon/app/android/regulardraw/widgets/lotteryInformation/presentation/LotteryInformationVI$EmptyMainInfo;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MainInfo {
    }

    public LotteryInformationVI(long j11, @NotNull Banner banner, @NotNull MainInfo mainInfo, MorkovskShadowButtonDTO morkovskShadowButtonDTO, t tVar) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(mainInfo, "mainInfo");
        this.id = j11;
        this.banner = banner;
        this.mainInfo = mainInfo;
        this.button = morkovskShadowButtonDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryInformationVI)) {
            return false;
        }
        LotteryInformationVI lotteryInformationVI = (LotteryInformationVI) other;
        return this.id == lotteryInformationVI.id && Intrinsics.d(this.banner, lotteryInformationVI.banner) && Intrinsics.d(this.mainInfo, lotteryInformationVI.mainInfo) && Intrinsics.d(this.button, lotteryInformationVI.button) && Intrinsics.d(this.tokenizedEvent, lotteryInformationVI.tokenizedEvent);
    }

    @NotNull
    public final Banner getBanner() {
        return this.banner;
    }

    public final MorkovskShadowButtonDTO getButton() {
        return this.button;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final MainInfo getMainInfo() {
        return this.mainInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.mainInfo.hashCode() + ((this.banner.hashCode() + (Long.hashCode(this.id) * 31)) * 31)) * 31;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        int hashCode2 = (hashCode + (morkovskShadowButtonDTO == null ? 0 : morkovskShadowButtonDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Banner banner = this.banner;
        MainInfo mainInfo = this.mainInfo;
        MorkovskShadowButtonDTO morkovskShadowButtonDTO = this.button;
        t tVar = this.tokenizedEvent;
        StringBuilder sb2 = new StringBuilder("LotteryInformationVI(id=");
        sb2.append(j11);
        sb2.append(", banner=");
        sb2.append(banner);
        sb2.append(", mainInfo=");
        sb2.append(mainInfo);
        sb2.append(", button=");
        sb2.append(morkovskShadowButtonDTO);
        return Lh.a.b(sb2, ", tokenizedEvent=", tVar, ")");
    }
}

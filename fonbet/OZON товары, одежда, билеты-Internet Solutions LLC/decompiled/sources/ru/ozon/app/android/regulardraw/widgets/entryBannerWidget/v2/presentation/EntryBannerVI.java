package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.presentation;

import C.o0;
import G.g;
import Lh.b;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.compose.time.StableDateTime;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI;", "Ll20/c;", "Content", "Overlay", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Overlay;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EntryBannerVI extends c {

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0003,-.BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b$\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b(\u0010'R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI;", "", "id", "", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "blocks", "", "animationName", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "clickAction", "viewAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBlocks", "()Ljava/util/List;", "Ljava/lang/String;", "getAnimationName", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getClickAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getViewAction", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Block", "Text", "CustomBadge", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content implements EntryBannerVI {

        @NotNull
        private final String animationName;
        private final String backgroundColor;

        @NotNull
        private final List<Block> blocks;
        private final AtomAction clickAction;
        private final long id;
        private final t tokenizedEvent;
        private final AtomAction viewAction;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "", "Title", "Subtitle", "Badge", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Badge;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Subtitle;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Title;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Block {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Badge;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dto", "<init>", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getDto", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Badge implements Block {

                @NotNull
                private final BadgeDTO dto;

                public Badge(@NotNull BadgeDTO dto) {
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    this.dto = dto;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Badge) && Intrinsics.d(this.dto, ((Badge) other).dto);
                }

                @NotNull
                public final BadgeDTO getDto() {
                    return this.dto;
                }

                public int hashCode() {
                    return this.dto.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Badge(dto=" + this.dto + ")";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Subtitle;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "text", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "getText", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Subtitle implements Block {

                @NotNull
                private final Text text;

                public Subtitle(@NotNull Text text) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.text = text;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Subtitle) && Intrinsics.d(this.text, ((Subtitle) other).text);
                }

                @NotNull
                public final Text getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                @NotNull
                public String toString() {
                    return "Subtitle(text=" + this.text + ")";
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block$Title;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Block;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "text", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "badge", "<init>", "(Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "getText", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "getBadge", "()Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Title implements Block {

                @NotNull
                private final CustomBadge badge;

                @NotNull
                private final Text text;

                public Title(@NotNull Text text, @NotNull CustomBadge badge) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(badge, "badge");
                    this.text = text;
                    this.badge = badge;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Title)) {
                        return false;
                    }
                    Title title = (Title) other;
                    return Intrinsics.d(this.text, title.text) && Intrinsics.d(this.badge, title.badge);
                }

                @NotNull
                public final CustomBadge getBadge() {
                    return this.badge;
                }

                @NotNull
                public final Text getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.badge.hashCode() + (this.text.hashCode() * 31);
                }

                @NotNull
                public String toString() {
                    return "Title(text=" + this.text + ", badge=" + this.badge + ")";
                }
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$CustomBadge;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "", "icon", "backgroundColor", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getIcon", "getBackgroundColor", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CustomBadge {

            @NotNull
            private final String backgroundColor;

            @NotNull
            private final String icon;

            @NotNull
            private final TextDTO text;

            public CustomBadge(@NotNull TextDTO text, @NotNull String icon, @NotNull String backgroundColor) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                this.text = text;
                this.icon = icon;
                this.backgroundColor = backgroundColor;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CustomBadge)) {
                    return false;
                }
                CustomBadge customBadge = (CustomBadge) other;
                return Intrinsics.d(this.text, customBadge.text) && Intrinsics.d(this.icon, customBadge.icon) && Intrinsics.d(this.backgroundColor, customBadge.backgroundColor);
            }

            @NotNull
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final TextDTO getText() {
                return this.text;
            }

            public int hashCode() {
                return this.backgroundColor.hashCode() + g.a(this.text.hashCode() * 31, 31, this.icon);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.text;
                String str = this.icon;
                return o0.c(D3.g.f("CustomBadge(text=", textDTO, ", icon=", str, ", backgroundColor="), this.backgroundColor, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "", "TimerText", "DsText", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$DsText;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$TimerText;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Text {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$DsText;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDto", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class DsText implements Text {

                @NotNull
                private final TextDTO dto;

                public DsText(@NotNull TextDTO dto) {
                    Intrinsics.checkNotNullParameter(dto, "dto");
                    this.dto = dto;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DsText) && Intrinsics.d(this.dto, ((DsText) other).dto);
                }

                @NotNull
                public final TextDTO getDto() {
                    return this.dto;
                }

                public int hashCode() {
                    return this.dto.hashCode();
                }

                @NotNull
                public String toString() {
                    return "DsText(dto=" + this.dto + ")";
                }
            }

            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text$TimerText;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Content$Text;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "leadingText", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "expireDate", "", "trailingText", "Lru/ozon/uni/atoms/af/AtomAction;", "deadlineAction", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getLeadingText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "getExpireDate", "()Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "Ljava/lang/String;", "getTrailingText", "Lru/ozon/uni/atoms/af/AtomAction;", "getDeadlineAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TimerText implements Text {
                private final AtomAction deadlineAction;

                @NotNull
                private final StableDateTime expireDate;

                @NotNull
                private final TextDTO leadingText;
                private final String trailingText;

                public TimerText(@NotNull TextDTO leadingText, @NotNull StableDateTime expireDate, String str, AtomAction atomAction) {
                    Intrinsics.checkNotNullParameter(leadingText, "leadingText");
                    Intrinsics.checkNotNullParameter(expireDate, "expireDate");
                    this.leadingText = leadingText;
                    this.expireDate = expireDate;
                    this.trailingText = str;
                    this.deadlineAction = atomAction;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TimerText)) {
                        return false;
                    }
                    TimerText timerText = (TimerText) other;
                    return Intrinsics.d(this.leadingText, timerText.leadingText) && Intrinsics.d(this.expireDate, timerText.expireDate) && Intrinsics.d(this.trailingText, timerText.trailingText) && Intrinsics.d(this.deadlineAction, timerText.deadlineAction);
                }

                public final AtomAction getDeadlineAction() {
                    return this.deadlineAction;
                }

                @NotNull
                public final StableDateTime getExpireDate() {
                    return this.expireDate;
                }

                @NotNull
                public final TextDTO getLeadingText() {
                    return this.leadingText;
                }

                public final String getTrailingText() {
                    return this.trailingText;
                }

                public int hashCode() {
                    int hashCode = (this.expireDate.hashCode() + (this.leadingText.hashCode() * 31)) * 31;
                    String str = this.trailingText;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    AtomAction atomAction = this.deadlineAction;
                    return hashCode2 + (atomAction != null ? atomAction.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "TimerText(leadingText=" + this.leadingText + ", expireDate=" + this.expireDate + ", trailingText=" + this.trailingText + ", deadlineAction=" + this.deadlineAction + ")";
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(long j11, @NotNull List<? extends Block> blocks, @NotNull String animationName, String str, AtomAction atomAction, AtomAction atomAction2, t tVar) {
            Intrinsics.checkNotNullParameter(blocks, "blocks");
            Intrinsics.checkNotNullParameter(animationName, "animationName");
            this.id = j11;
            this.blocks = blocks;
            this.animationName = animationName;
            this.backgroundColor = str;
            this.clickAction = atomAction;
            this.viewAction = atomAction2;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return this.id == content.id && Intrinsics.d(this.blocks, content.blocks) && Intrinsics.d(this.animationName, content.animationName) && Intrinsics.d(this.backgroundColor, content.backgroundColor) && Intrinsics.d(this.clickAction, content.clickAction) && Intrinsics.d(this.viewAction, content.viewAction) && Intrinsics.d(this.tokenizedEvent, content.tokenizedEvent);
        }

        @NotNull
        public final String getAnimationName() {
            return this.animationName;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final List<Block> getBlocks() {
            return this.blocks;
        }

        public final AtomAction getClickAction() {
            return this.clickAction;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final AtomAction getViewAction() {
            return this.viewAction;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int a11 = g.a(g.b(Long.hashCode(this.id) * 31, 31, this.blocks), 31, this.animationName);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.clickAction;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            AtomAction atomAction2 = this.viewAction;
            int hashCode3 = (hashCode2 + (atomAction2 == null ? 0 : atomAction2.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode3 + (tVar != null ? tVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            List<Block> list = this.blocks;
            String str = this.animationName;
            String str2 = this.backgroundColor;
            AtomAction atomAction = this.clickAction;
            AtomAction atomAction2 = this.viewAction;
            t tVar = this.tokenizedEvent;
            StringBuilder b11 = b.b(j11, "Content(id=", ", blocks=", list);
            a.h(b11, ", animationName=", str, ", backgroundColor=", str2);
            b11.append(", clickAction=");
            b11.append(atomAction);
            b11.append(", viewAction=");
            b11.append(atomAction2);
            return Lh.a.b(b11, ", tokenizedEvent=", tVar, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull EntryBannerVI entryBannerVI) {
            return null;
        }

        public static int getViewItemKey(@NotNull EntryBannerVI entryBannerVI) {
            return entryBannerVI.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI$Overlay;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v2/presentation/EntryBannerVI;", "", "id", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Overlay implements EntryBannerVI {
        private final long id;

        public Overlay(long j11) {
            this.id = j11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Overlay) && this.id == ((Overlay) other).id;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return Long.hashCode(this.id);
        }

        @NotNull
        public String toString() {
            return Sh.b.b(this.id, "Overlay(id=", ")");
        }
    }
}

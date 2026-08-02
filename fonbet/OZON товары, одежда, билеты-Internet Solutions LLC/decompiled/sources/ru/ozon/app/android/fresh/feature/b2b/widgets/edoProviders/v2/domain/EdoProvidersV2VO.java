package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.domain;

import B3.p;
import B90.C2616s;
import D3.g;
import Lh.a;
import Tl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001:\b#$%&'()*B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "Ll20/c;", "", "id", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Body;", "body", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;", CommentV3DTO.FOOTER_FIELD_NAME, "<init>", "(JLru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Body;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;", "getHeader", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Body;", "getBody", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Body;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;", "getFooter", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;", "Header", "Body", "Providers", "Footer", "Provider", "CustomCell", "Settings", "EmptyState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EdoProvidersV2VO implements c {

    @NotNull
    private final Body body;
    private final Footer footer;
    private final Header header;
    private final long id;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Body;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;", "providers", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;", "emptyState", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;", "getProviders", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;", "getEmptyState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Body {
        private final EmptyState emptyState;
        private final Providers providers;

        public Body(Providers providers, EmptyState emptyState) {
            this.providers = providers;
            this.emptyState = emptyState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Body)) {
                return false;
            }
            Body body = (Body) other;
            return Intrinsics.d(this.providers, body.providers) && Intrinsics.d(this.emptyState, body.emptyState);
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        public final Providers getProviders() {
            return this.providers;
        }

        public int hashCode() {
            Providers providers = this.providers;
            int hashCode = (providers == null ? 0 : providers.hashCode()) * 31;
            EmptyState emptyState = this.emptyState;
            return hashCode + (emptyState != null ? emptyState.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Body(providers=" + this.providers + ", emptyState=" + this.emptyState + ")";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeList", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;", "settings", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/util/List;", "getBadgeList", "()Ljava/util/List;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;", "getSettings", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomCell {
        private final List<BadgeDTO> badgeList;
        private final IconButtonV3DTO iconButton;
        private final Settings settings;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public CustomCell(@NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, List<BadgeDTO> list, Settings settings) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.iconButton = iconButtonV3DTO;
            this.badgeList = list;
            this.settings = settings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomCell)) {
                return false;
            }
            CustomCell customCell = (CustomCell) other;
            return Intrinsics.d(this.title, customCell.title) && Intrinsics.d(this.subtitle, customCell.subtitle) && Intrinsics.d(this.iconButton, customCell.iconButton) && Intrinsics.d(this.badgeList, customCell.badgeList) && Intrinsics.d(this.settings, customCell.settings);
        }

        public final List<BadgeDTO> getBadgeList() {
            return this.badgeList;
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final Settings getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            int hashCode3 = (hashCode2 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            List<BadgeDTO> list = this.badgeList;
            int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            Settings settings = this.settings;
            return hashCode4 + (settings != null ? settings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            List<BadgeDTO> list = this.badgeList;
            Settings settings = this.settings;
            StringBuilder g10 = g.g("CustomCell(title=", textDTO, ", subtitle=", textDTO2, ", iconButton=");
            g10.append(iconButtonV3DTO);
            g10.append(", badgeList=");
            g10.append(list);
            g10.append(", settings=");
            g10.append(settings);
            g10.append(")");
            return g10.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$EmptyState;", "", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyState {

        @NotNull
        private final ImageDTO imageAtom;
        private final TextDTO message;
        private final TextDTO title;

        public EmptyState(@NotNull ImageDTO imageAtom, TextDTO textDTO, TextDTO textDTO2) {
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            this.imageAtom = imageAtom;
            this.title = textDTO;
            this.message = textDTO2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyState)) {
                return false;
            }
            EmptyState emptyState = (EmptyState) other;
            return Intrinsics.d(this.imageAtom, emptyState.imageAtom) && Intrinsics.d(this.title, emptyState.title) && Intrinsics.d(this.message, emptyState.message);
        }

        @NotNull
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        public final TextDTO getMessage() {
            return this.message;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.imageAtom.hashCode() * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.message;
            return hashCode2 + (textDTO2 != null ? textDTO2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.imageAtom;
            TextDTO textDTO = this.title;
            return b.e(C2616s.d("EmptyState(imageAtom=", imageDTO, ", title=", textDTO, ", message="), this.message, ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Footer;", "", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttons", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer {

        @NotNull
        private final List<ButtonV3DTO> buttons;

        public Footer(@NotNull List<ButtonV3DTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.buttons = buttons;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Footer) && Intrinsics.d(this.buttons, ((Footer) other).buttons);
        }

        @NotNull
        public final List<ButtonV3DTO> getButtons() {
            return this.buttons;
        }

        public int hashCode() {
            return this.buttons.hashCode();
        }

        @NotNull
        public String toString() {
            return H3.c.a("Footer(buttons=", ")", this.buttons);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Header;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Header {
        public static final int $stable = DisclaimerDTO.$stable | IconButtonV3DTO.$stable;
        private final DisclaimerDTO disclaimer;
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO title;

        public Header(@NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, DisclaimerDTO disclaimerDTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.iconButton = iconButtonV3DTO;
            this.disclaimer = disclaimerDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return Intrinsics.d(this.title, header.title) && Intrinsics.d(this.iconButton, header.iconButton) && Intrinsics.d(this.disclaimer, header.disclaimer);
        }

        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            IconButtonV3DTO iconButtonV3DTO = this.iconButton;
            int hashCode2 = (hashCode + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            DisclaimerDTO disclaimerDTO = this.disclaimer;
            return hashCode2 + (disclaimerDTO != null ? disclaimerDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Header(title=" + this.title + ", iconButton=" + this.iconButton + ", disclaimer=" + this.disclaimer + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Provider;", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "customCell", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "getCustomCell", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Provider {
        private final CellDTO cell;
        private final CustomCell customCell;

        public Provider(CellDTO cellDTO, CustomCell customCell) {
            this.cell = cellDTO;
            this.customCell = customCell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Provider)) {
                return false;
            }
            Provider provider = (Provider) other;
            return Intrinsics.d(this.cell, provider.cell) && Intrinsics.d(this.customCell, provider.customCell);
        }

        public final CellDTO getCell() {
            return this.cell;
        }

        public final CustomCell getCustomCell() {
            return this.customCell;
        }

        public int hashCode() {
            CellDTO cellDTO = this.cell;
            int hashCode = (cellDTO == null ? 0 : cellDTO.hashCode()) * 31;
            CustomCell customCell = this.customCell;
            return hashCode + (customCell != null ? customCell.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Provider(cell=" + this.cell + ", customCell=" + this.customCell + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Providers;", "", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Provider;", "items", "", "maxProviders", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "moreProviders", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/Integer;", "getMaxProviders", "()Ljava/lang/Integer;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getMoreProviders", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Providers {
        private final CornerRadius cornerRadius;

        @NotNull
        private final List<Provider> items;
        private final Integer maxProviders;
        private final CellDTO moreProviders;

        public Providers(@NotNull List<Provider> items, Integer num, CellDTO cellDTO, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            this.maxProviders = num;
            this.moreProviders = cellDTO;
            this.cornerRadius = cornerRadius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Providers)) {
                return false;
            }
            Providers providers = (Providers) other;
            return Intrinsics.d(this.items, providers.items) && Intrinsics.d(this.maxProviders, providers.maxProviders) && Intrinsics.d(this.moreProviders, providers.moreProviders) && this.cornerRadius == providers.cornerRadius;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final List<Provider> getItems() {
            return this.items;
        }

        public final Integer getMaxProviders() {
            return this.maxProviders;
        }

        public final CellDTO getMoreProviders() {
            return this.moreProviders;
        }

        public int hashCode() {
            int hashCode = this.items.hashCode() * 31;
            Integer num = this.maxProviders;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            CellDTO cellDTO = this.moreProviders;
            int hashCode3 = (hashCode2 + (cellDTO == null ? 0 : cellDTO.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            return hashCode3 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Providers(items=" + this.items + ", maxProviders=" + this.maxProviders + ", moreProviders=" + this.moreProviders + ", cornerRadius=" + this.cornerRadius + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$Settings;", "", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "bottomPadding", "leftPadding", "rightPadding", "titleSpaceBetween", "", "backgroundColor", "", "hideSeparator", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getTitleSpaceBetween", "Ljava/lang/String;", "getBackgroundColor", "Z", "getHideSeparator", "()Z", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {
        private final String backgroundColor;
        private final Paddings bottomPadding;
        private final boolean hideSeparator;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings titleSpaceBetween;
        private final Paddings topPadding;

        public Settings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, String str, boolean z11) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
            this.titleSpaceBetween = paddings5;
            this.backgroundColor = str;
            this.hideSeparator = z11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.topPadding == settings.topPadding && this.bottomPadding == settings.bottomPadding && this.leftPadding == settings.leftPadding && this.rightPadding == settings.rightPadding && this.titleSpaceBetween == settings.titleSpaceBetween && Intrinsics.d(this.backgroundColor, settings.backgroundColor) && this.hideSeparator == settings.hideSeparator;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final boolean getHideSeparator() {
            return this.hideSeparator;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTitleSpaceBetween() {
            return this.titleSpaceBetween;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.titleSpaceBetween;
            int hashCode5 = (hashCode4 + (paddings5 == null ? 0 : paddings5.hashCode())) * 31;
            String str = this.backgroundColor;
            return Boolean.hashCode(this.hideSeparator) + ((hashCode5 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            Paddings paddings5 = this.titleSpaceBetween;
            String str = this.backgroundColor;
            boolean z11 = this.hideSeparator;
            StringBuilder b11 = p.b("Settings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            a.e(b11, paddings3, ", rightPadding=", paddings4, ", titleSpaceBetween=");
            b11.append(paddings5);
            b11.append(", backgroundColor=");
            b11.append(str);
            b11.append(", hideSeparator=");
            return Pk0.a.a(")", b11, z11);
        }
    }

    public EdoProvidersV2VO(long j11, Header header, @NotNull Body body, Footer footer) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.id = j11;
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdoProvidersV2VO)) {
            return false;
        }
        EdoProvidersV2VO edoProvidersV2VO = (EdoProvidersV2VO) other;
        return this.id == edoProvidersV2VO.id && Intrinsics.d(this.header, edoProvidersV2VO.header) && Intrinsics.d(this.body, edoProvidersV2VO.body) && Intrinsics.d(this.footer, edoProvidersV2VO.footer);
    }

    @NotNull
    public final Body getBody() {
        return this.body;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Header getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Header header = this.header;
        int hashCode2 = (this.body.hashCode() + ((hashCode + (header == null ? 0 : header.hashCode())) * 31)) * 31;
        Footer footer = this.footer;
        return hashCode2 + (footer != null ? footer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EdoProvidersV2VO(id=" + this.id + ", header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ")";
    }
}

package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.data;

import B3.p;
import B90.C2616s;
import D3.g;
import H3.c;
import Lh.a;
import Tl.b;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001:\b\u001b\u001c\u001d\u001e\u001f !\"B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Header;", "body", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Body;", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Footer;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Header;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Body;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Footer;)V", "getHeader", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Header;", "getBody", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Body;", "getFooter", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Footer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Header", "Body", "Providers", "Footer", "Provider", "CustomCell", "Settings", "EmptyState", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EdoProvidersV2DTO {
    public static final int $stable = 8;
    private final Body body;
    private final Footer footer;
    private final Header header;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Body;", "", "providers", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;", "emptyState", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$EmptyState;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$EmptyState;)V", "getProviders", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;", "getEmptyState", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$EmptyState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Body {
        public static final int $stable = 8;
        private final EmptyState emptyState;
        private final Providers providers;

        public Body(Providers providers, EmptyState emptyState) {
            this.providers = providers;
            this.emptyState = emptyState;
        }

        public static /* synthetic */ Body copy$default(Body body, Providers providers, EmptyState emptyState, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                providers = body.providers;
            }
            if ((i11 & 2) != 0) {
                emptyState = body.emptyState;
            }
            return body.copy(providers, emptyState);
        }

        /* renamed from: component1, reason: from getter */
        public final Providers getProviders() {
            return this.providers;
        }

        /* renamed from: component2, reason: from getter */
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @NotNull
        public final Body copy(Providers providers, EmptyState emptyState) {
            return new Body(providers, emptyState);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$CustomCell;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "badgeList", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "settings", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBadgeList", "()Ljava/util/List;", "getSettings", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CustomCell {
        public static final int $stable = 8;
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

        public static /* synthetic */ CustomCell copy$default(CustomCell customCell, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, List list, Settings settings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = customCell.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = customCell.subtitle;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = customCell.iconButton;
            }
            if ((i11 & 8) != 0) {
                list = customCell.badgeList;
            }
            if ((i11 & 16) != 0) {
                settings = customCell.settings;
            }
            Settings settings2 = settings;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            return customCell.copy(textDTO, textDTO2, iconButtonV3DTO2, list, settings2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        public final List<BadgeDTO> component4() {
            return this.badgeList;
        }

        /* renamed from: component5, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @NotNull
        public final CustomCell copy(@NotNull TextDTO title, TextDTO subtitle, IconButtonV3DTO iconButton, List<BadgeDTO> badgeList, Settings settings) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new CustomCell(title, subtitle, iconButton, badgeList, settings);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$EmptyState;", "", "imageAtom", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "message", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getImageAtom", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EmptyState {
        public static final int $stable = 0;

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

        public static /* synthetic */ EmptyState copy$default(EmptyState emptyState, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = emptyState.imageAtom;
            }
            if ((i11 & 2) != 0) {
                textDTO = emptyState.title;
            }
            if ((i11 & 4) != 0) {
                textDTO2 = emptyState.message;
            }
            return emptyState.copy(imageDTO, textDTO, textDTO2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImageAtom() {
            return this.imageAtom;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getMessage() {
            return this.message;
        }

        @NotNull
        public final EmptyState copy(@NotNull ImageDTO imageAtom, TextDTO title, TextDTO message) {
            Intrinsics.checkNotNullParameter(imageAtom, "imageAtom");
            return new EmptyState(imageAtom, title, message);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Footer;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Ljava/util/List;)V", "getButtons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Footer {
        public static final int $stable = 8;

        @NotNull
        private final List<ButtonV3DTO> buttons;

        public Footer(@NotNull List<ButtonV3DTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            this.buttons = buttons;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Footer copy$default(Footer footer, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = footer.buttons;
            }
            return footer.copy(list);
        }

        @NotNull
        public final List<ButtonV3DTO> component1() {
            return this.buttons;
        }

        @NotNull
        public final Footer copy(@NotNull List<ButtonV3DTO> buttons) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            return new Footer(buttons);
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
            return c.a("Footer(buttons=", ")", this.buttons);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Header;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public static /* synthetic */ Header copy$default(Header header, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, DisclaimerDTO disclaimerDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = header.title;
            }
            if ((i11 & 2) != 0) {
                iconButtonV3DTO = header.iconButton;
            }
            if ((i11 & 4) != 0) {
                disclaimerDTO = header.disclaimer;
            }
            return header.copy(textDTO, iconButtonV3DTO, disclaimerDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        /* renamed from: component3, reason: from getter */
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        @NotNull
        public final Header copy(@NotNull TextDTO title, IconButtonV3DTO iconButton, DisclaimerDTO disclaimer) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new Header(title, iconButton, disclaimer);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Provider;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "customCell", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$CustomCell;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$CustomCell;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCustomCell", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$CustomCell;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Provider {
        public static final int $stable = 8;
        private final CellDTO cell;
        private final CustomCell customCell;

        public Provider(CellDTO cellDTO, CustomCell customCell) {
            this.cell = cellDTO;
            this.customCell = customCell;
        }

        public static /* synthetic */ Provider copy$default(Provider provider, CellDTO cellDTO, CustomCell customCell, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cellDTO = provider.cell;
            }
            if ((i11 & 2) != 0) {
                customCell = provider.customCell;
            }
            return provider.copy(cellDTO, customCell);
        }

        /* renamed from: component1, reason: from getter */
        public final CellDTO getCell() {
            return this.cell;
        }

        /* renamed from: component2, reason: from getter */
        public final CustomCell getCustomCell() {
            return this.customCell;
        }

        @NotNull
        public final Provider copy(CellDTO cell, CustomCell customCell) {
            return new Provider(cell, customCell);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;", "", "items", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Provider;", "maxProviders", "", "moreProviders", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getItems", "()Ljava/util/List;", "getMaxProviders", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMoreProviders", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Providers;", "equals", "", "other", "hashCode", "toString", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Providers {
        public static final int $stable = 8;
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

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Providers copy$default(Providers providers, List list, Integer num, CellDTO cellDTO, CornerRadius cornerRadius, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = providers.items;
            }
            if ((i11 & 2) != 0) {
                num = providers.maxProviders;
            }
            if ((i11 & 4) != 0) {
                cellDTO = providers.moreProviders;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = providers.cornerRadius;
            }
            return providers.copy(list, num, cellDTO, cornerRadius);
        }

        @NotNull
        public final List<Provider> component1() {
            return this.items;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMaxProviders() {
            return this.maxProviders;
        }

        /* renamed from: component3, reason: from getter */
        public final CellDTO getMoreProviders() {
            return this.moreProviders;
        }

        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final Providers copy(@NotNull List<Provider> items, Integer maxProviders, CellDTO moreProviders, CornerRadius cornerRadius) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new Providers(items, maxProviders, moreProviders, cornerRadius);
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

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jb\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "titleSpaceBetween", "backgroundColor", "", "hideSeparator", "", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/lang/Boolean;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getTitleSpaceBetween", "getBackgroundColor", "()Ljava/lang/String;", "getHideSeparator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/data/EdoProvidersV2DTO$Settings;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {
        public static final int $stable = 0;
        private final String backgroundColor;
        private final Paddings bottomPadding;
        private final Boolean hideSeparator;
        private final Paddings leftPadding;
        private final Paddings rightPadding;
        private final Paddings titleSpaceBetween;
        private final Paddings topPadding;

        public Settings(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, String str, Boolean bool) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
            this.titleSpaceBetween = paddings5;
            this.backgroundColor = str;
            this.hideSeparator = bool;
        }

        public static /* synthetic */ Settings copy$default(Settings settings, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, String str, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = settings.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = settings.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = settings.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = settings.rightPadding;
            }
            if ((i11 & 16) != 0) {
                paddings5 = settings.titleSpaceBetween;
            }
            if ((i11 & 32) != 0) {
                str = settings.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                bool = settings.hideSeparator;
            }
            String str2 = str;
            Boolean bool2 = bool;
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return settings.copy(paddings, paddings2, paddings7, paddings4, paddings6, str2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getTitleSpaceBetween() {
            return this.titleSpaceBetween;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getHideSeparator() {
            return this.hideSeparator;
        }

        @NotNull
        public final Settings copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding, Paddings titleSpaceBetween, String backgroundColor, Boolean hideSeparator) {
            return new Settings(topPadding, bottomPadding, leftPadding, rightPadding, titleSpaceBetween, backgroundColor, hideSeparator);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.topPadding == settings.topPadding && this.bottomPadding == settings.bottomPadding && this.leftPadding == settings.leftPadding && this.rightPadding == settings.rightPadding && this.titleSpaceBetween == settings.titleSpaceBetween && Intrinsics.d(this.backgroundColor, settings.backgroundColor) && Intrinsics.d(this.hideSeparator, settings.hideSeparator);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Boolean getHideSeparator() {
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
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.hideSeparator;
            return hashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            Paddings paddings5 = this.titleSpaceBetween;
            String str = this.backgroundColor;
            Boolean bool = this.hideSeparator;
            StringBuilder b11 = p.b("Settings(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            a.e(b11, paddings3, ", rightPadding=", paddings4, ", titleSpaceBetween=");
            b11.append(paddings5);
            b11.append(", backgroundColor=");
            b11.append(str);
            b11.append(", hideSeparator=");
            return g.d(b11, bool, ")");
        }
    }

    public EdoProvidersV2DTO(Header header, Body body, Footer footer) {
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public static /* synthetic */ EdoProvidersV2DTO copy$default(EdoProvidersV2DTO edoProvidersV2DTO, Header header, Body body, Footer footer, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            header = edoProvidersV2DTO.header;
        }
        if ((i11 & 2) != 0) {
            body = edoProvidersV2DTO.body;
        }
        if ((i11 & 4) != 0) {
            footer = edoProvidersV2DTO.footer;
        }
        return edoProvidersV2DTO.copy(header, body, footer);
    }

    /* renamed from: component1, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component2, reason: from getter */
    public final Body getBody() {
        return this.body;
    }

    /* renamed from: component3, reason: from getter */
    public final Footer getFooter() {
        return this.footer;
    }

    @NotNull
    public final EdoProvidersV2DTO copy(Header header, Body body, Footer footer) {
        return new EdoProvidersV2DTO(header, body, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EdoProvidersV2DTO)) {
            return false;
        }
        EdoProvidersV2DTO edoProvidersV2DTO = (EdoProvidersV2DTO) other;
        return Intrinsics.d(this.header, edoProvidersV2DTO.header) && Intrinsics.d(this.body, edoProvidersV2DTO.body) && Intrinsics.d(this.footer, edoProvidersV2DTO.footer);
    }

    public final Body getBody() {
        return this.body;
    }

    public final Footer getFooter() {
        return this.footer;
    }

    public final Header getHeader() {
        return this.header;
    }

    public int hashCode() {
        Header header = this.header;
        int hashCode = (header == null ? 0 : header.hashCode()) * 31;
        Body body = this.body;
        int hashCode2 = (hashCode + (body == null ? 0 : body.hashCode())) * 31;
        Footer footer = this.footer;
        return hashCode2 + (footer != null ? footer.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EdoProvidersV2DTO(header=" + this.header + ", body=" + this.body + ", footer=" + this.footer + ")";
    }
}

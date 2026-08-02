package ru.ozon.app.android.ugc.widgets.singlequestion.data;

import B90.C2619v;
import Cm.e;
import Co.a;
import G.g;
import Kk.C3532b;
import N3.C3660k;
import Ns.b;
import T7.P;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.common.MenuDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO;", "", "question", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;", "<init>", "(Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;)V", "getQuestion", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AuthorQuestion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SingleQuestionDTO {
    public static final int $stable = 8;

    @NotNull
    private final AuthorQuestion question;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion;", "", "author", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;", "question", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question;", "<init>", "(Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question;)V", "getAuthor", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;", "getQuestion", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Author", "Question", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class AuthorQuestion {
        public static final int $stable = 8;

        @NotNull
        private final Author author;

        @NotNull
        private final Question question;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author;", "", "avatarUri", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "createdAt", "partner", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "badge", "Lru/ozon/uni/atoms/data/badge/Badge;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;Lru/ozon/uni/atoms/data/badge/Badge;)V", "getAvatarUri", "()Ljava/lang/String;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCreatedAt", "getPartner", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Partner", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Author {
            public static final int $stable = Badge.$stable | IconDTO.$stable;
            private final String avatarUri;
            private final Badge badge;

            @NotNull
            private final String createdAt;

            @NotNull
            private final TextDTO name;
            private final Partner partner;

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Author$Partner;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subTitle", "verificationIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getTitle", "()Ljava/lang/String;", "getSubTitle", "getVerificationIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Partner {
                public static final int $stable = IconDTO.$stable;

                @NotNull
                private final String subTitle;

                @NotNull
                private final String title;
                private final IconDTO verificationIcon;

                public Partner(@NotNull String title, @NotNull String subTitle, IconDTO iconDTO) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subTitle, "subTitle");
                    this.title = title;
                    this.subTitle = subTitle;
                    this.verificationIcon = iconDTO;
                }

                public static /* synthetic */ Partner copy$default(Partner partner, String str, String str2, IconDTO iconDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = partner.title;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = partner.subTitle;
                    }
                    if ((i11 & 4) != 0) {
                        iconDTO = partner.verificationIcon;
                    }
                    return partner.copy(str, str2, iconDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @NotNull
                /* renamed from: component2, reason: from getter */
                public final String getSubTitle() {
                    return this.subTitle;
                }

                /* renamed from: component3, reason: from getter */
                public final IconDTO getVerificationIcon() {
                    return this.verificationIcon;
                }

                @NotNull
                public final Partner copy(@NotNull String title, @NotNull String subTitle, IconDTO verificationIcon) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(subTitle, "subTitle");
                    return new Partner(title, subTitle, verificationIcon);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Partner)) {
                        return false;
                    }
                    Partner partner = (Partner) other;
                    return Intrinsics.d(this.title, partner.title) && Intrinsics.d(this.subTitle, partner.subTitle) && Intrinsics.d(this.verificationIcon, partner.verificationIcon);
                }

                @NotNull
                public final String getSubTitle() {
                    return this.subTitle;
                }

                @NotNull
                public final String getTitle() {
                    return this.title;
                }

                public final IconDTO getVerificationIcon() {
                    return this.verificationIcon;
                }

                public int hashCode() {
                    int a11 = g.a(this.title.hashCode() * 31, 31, this.subTitle);
                    IconDTO iconDTO = this.verificationIcon;
                    return a11 + (iconDTO == null ? 0 : iconDTO.hashCode());
                }

                @NotNull
                public String toString() {
                    String str = this.title;
                    String str2 = this.subTitle;
                    IconDTO iconDTO = this.verificationIcon;
                    StringBuilder d11 = C3660k.d("Partner(title=", str, ", subTitle=", str2, ", verificationIcon=");
                    d11.append(iconDTO);
                    d11.append(")");
                    return d11.toString();
                }
            }

            public Author(String str, @NotNull TextDTO name, @NotNull String createdAt, Partner partner, Badge badge) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                this.avatarUri = str;
                this.name = name;
                this.createdAt = createdAt;
                this.partner = partner;
                this.badge = badge;
            }

            public static /* synthetic */ Author copy$default(Author author, String str, TextDTO textDTO, String str2, Partner partner, Badge badge, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = author.avatarUri;
                }
                if ((i11 & 2) != 0) {
                    textDTO = author.name;
                }
                if ((i11 & 4) != 0) {
                    str2 = author.createdAt;
                }
                if ((i11 & 8) != 0) {
                    partner = author.partner;
                }
                if ((i11 & 16) != 0) {
                    badge = author.badge;
                }
                Badge badge2 = badge;
                String str3 = str2;
                return author.copy(str, textDTO, str3, partner, badge2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAvatarUri() {
                return this.avatarUri;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextDTO getName() {
                return this.name;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getCreatedAt() {
                return this.createdAt;
            }

            /* renamed from: component4, reason: from getter */
            public final Partner getPartner() {
                return this.partner;
            }

            /* renamed from: component5, reason: from getter */
            public final Badge getBadge() {
                return this.badge;
            }

            @NotNull
            public final Author copy(String avatarUri, @NotNull TextDTO name, @NotNull String createdAt, Partner partner, Badge badge) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(createdAt, "createdAt");
                return new Author(avatarUri, name, createdAt, partner, badge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Author)) {
                    return false;
                }
                Author author = (Author) other;
                return Intrinsics.d(this.avatarUri, author.avatarUri) && Intrinsics.d(this.name, author.name) && Intrinsics.d(this.createdAt, author.createdAt) && Intrinsics.d(this.partner, author.partner) && Intrinsics.d(this.badge, author.badge);
            }

            public final String getAvatarUri() {
                return this.avatarUri;
            }

            public final Badge getBadge() {
                return this.badge;
            }

            @NotNull
            public final String getCreatedAt() {
                return this.createdAt;
            }

            @NotNull
            public final TextDTO getName() {
                return this.name;
            }

            public final Partner getPartner() {
                return this.partner;
            }

            public int hashCode() {
                String str = this.avatarUri;
                int a11 = g.a(b.a(this.name, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.createdAt);
                Partner partner = this.partner;
                int hashCode = (a11 + (partner == null ? 0 : partner.hashCode())) * 31;
                Badge badge = this.badge;
                return hashCode + (badge != null ? badge.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.avatarUri;
                TextDTO textDTO = this.name;
                String str2 = this.createdAt;
                Partner partner = this.partner;
                Badge badge = this.badge;
                StringBuilder b11 = a.b("Author(avatarUri=", textDTO, str, ", name=", ", createdAt=");
                b11.append(str2);
                b11.append(", partner=");
                b11.append(partner);
                b11.append(", badge=");
                b11.append(badge);
                b11.append(")");
                return b11.toString();
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question;", "", "id", "", "text", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "authorName", "", "buttons", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;Ljava/util/Map;)V", "getId", "()I", "getText", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getAuthorName", "()Ljava/lang/String;", "getButtons", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "QuestionButtons", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Question {
            public static final int $stable = 8;
            private final String authorName;

            @NotNull
            private final QuestionButtons buttons;
            private final int id;

            @NotNull
            private final TextAtom text;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;", "", "answerButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "likeButton", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "menu", "Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;Lru/ozon/app/android/ugc/widgets/common/MenuDTO;)V", "getAnswerButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getLikeButton", "()Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "getMenu", "()Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LikeButton", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            @j(generateAdapter = true)
            public static final /* data */ class QuestionButtons {
                public static final int $stable = 8;
                private final ButtonV3Atom.SmallButton answerButton;
                private final LikeButton likeButton;

                @NotNull
                private final MenuDTO menu;

                @j(generateAdapter = true)
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "", "count", "", "icon", "", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ILjava/lang/String;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getCount", "()I", "getIcon", "()Ljava/lang/String;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class LikeButton {
                    public static final int $stable = 8;
                    private final AtomActionDTO action;
                    private final int count;

                    @NotNull
                    private final String icon;
                    private final boolean isSelected;
                    private final Map<String, TokenizedTrackingInfo> trackingInfo;

                    public LikeButton(int i11, @NotNull String icon, boolean z11, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        this.count = i11;
                        this.icon = icon;
                        this.isSelected = z11;
                        this.action = atomActionDTO;
                        this.trackingInfo = map;
                    }

                    public static /* synthetic */ LikeButton copy$default(LikeButton likeButton, int i11, String str, boolean z11, AtomActionDTO atomActionDTO, Map map, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            i11 = likeButton.count;
                        }
                        if ((i12 & 2) != 0) {
                            str = likeButton.icon;
                        }
                        if ((i12 & 4) != 0) {
                            z11 = likeButton.isSelected;
                        }
                        if ((i12 & 8) != 0) {
                            atomActionDTO = likeButton.action;
                        }
                        if ((i12 & 16) != 0) {
                            map = likeButton.trackingInfo;
                        }
                        Map map2 = map;
                        boolean z12 = z11;
                        return likeButton.copy(i11, str, z12, atomActionDTO, map2);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final int getCount() {
                        return this.count;
                    }

                    @NotNull
                    /* renamed from: component2, reason: from getter */
                    public final String getIcon() {
                        return this.icon;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final boolean getIsSelected() {
                        return this.isSelected;
                    }

                    /* renamed from: component4, reason: from getter */
                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    public final Map<String, TokenizedTrackingInfo> component5() {
                        return this.trackingInfo;
                    }

                    @NotNull
                    public final LikeButton copy(int count, @NotNull String icon, boolean isSelected, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
                        Intrinsics.checkNotNullParameter(icon, "icon");
                        return new LikeButton(count, icon, isSelected, action, trackingInfo);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof LikeButton)) {
                            return false;
                        }
                        LikeButton likeButton = (LikeButton) other;
                        return this.count == likeButton.count && Intrinsics.d(this.icon, likeButton.icon) && this.isSelected == likeButton.isSelected && Intrinsics.d(this.action, likeButton.action) && Intrinsics.d(this.trackingInfo, likeButton.trackingInfo);
                    }

                    public final AtomActionDTO getAction() {
                        return this.action;
                    }

                    public final int getCount() {
                        return this.count;
                    }

                    @NotNull
                    public final String getIcon() {
                        return this.icon;
                    }

                    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                        return this.trackingInfo;
                    }

                    public int hashCode() {
                        int a11 = C3532b.a(g.a(Integer.hashCode(this.count) * 31, 31, this.icon), 31, this.isSelected);
                        AtomActionDTO atomActionDTO = this.action;
                        int hashCode = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        return hashCode + (map != null ? map.hashCode() : 0);
                    }

                    public final boolean isSelected() {
                        return this.isSelected;
                    }

                    @NotNull
                    public String toString() {
                        int i11 = this.count;
                        String str = this.icon;
                        boolean z11 = this.isSelected;
                        AtomActionDTO atomActionDTO = this.action;
                        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                        StringBuilder g10 = e.g(i11, "LikeButton(count=", ", icon=", str, ", isSelected=");
                        g10.append(z11);
                        g10.append(", action=");
                        g10.append(atomActionDTO);
                        g10.append(", trackingInfo=");
                        return P.f(g10, map, ")");
                    }
                }

                public QuestionButtons(ButtonV3Atom.SmallButton smallButton, LikeButton likeButton, @NotNull MenuDTO menu) {
                    Intrinsics.checkNotNullParameter(menu, "menu");
                    this.answerButton = smallButton;
                    this.likeButton = likeButton;
                    this.menu = menu;
                }

                public static /* synthetic */ QuestionButtons copy$default(QuestionButtons questionButtons, ButtonV3Atom.SmallButton smallButton, LikeButton likeButton, MenuDTO menuDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        smallButton = questionButtons.answerButton;
                    }
                    if ((i11 & 2) != 0) {
                        likeButton = questionButtons.likeButton;
                    }
                    if ((i11 & 4) != 0) {
                        menuDTO = questionButtons.menu;
                    }
                    return questionButtons.copy(smallButton, likeButton, menuDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final ButtonV3Atom.SmallButton getAnswerButton() {
                    return this.answerButton;
                }

                /* renamed from: component2, reason: from getter */
                public final LikeButton getLikeButton() {
                    return this.likeButton;
                }

                @NotNull
                /* renamed from: component3, reason: from getter */
                public final MenuDTO getMenu() {
                    return this.menu;
                }

                @NotNull
                public final QuestionButtons copy(ButtonV3Atom.SmallButton answerButton, LikeButton likeButton, @NotNull MenuDTO menu) {
                    Intrinsics.checkNotNullParameter(menu, "menu");
                    return new QuestionButtons(answerButton, likeButton, menu);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof QuestionButtons)) {
                        return false;
                    }
                    QuestionButtons questionButtons = (QuestionButtons) other;
                    return Intrinsics.d(this.answerButton, questionButtons.answerButton) && Intrinsics.d(this.likeButton, questionButtons.likeButton) && Intrinsics.d(this.menu, questionButtons.menu);
                }

                public final ButtonV3Atom.SmallButton getAnswerButton() {
                    return this.answerButton;
                }

                public final LikeButton getLikeButton() {
                    return this.likeButton;
                }

                @NotNull
                public final MenuDTO getMenu() {
                    return this.menu;
                }

                public int hashCode() {
                    ButtonV3Atom.SmallButton smallButton = this.answerButton;
                    int hashCode = (smallButton == null ? 0 : smallButton.hashCode()) * 31;
                    LikeButton likeButton = this.likeButton;
                    return this.menu.hashCode() + ((hashCode + (likeButton != null ? likeButton.hashCode() : 0)) * 31);
                }

                @NotNull
                public String toString() {
                    return "QuestionButtons(answerButton=" + this.answerButton + ", likeButton=" + this.likeButton + ", menu=" + this.menu + ")";
                }
            }

            public Question(int i11, @NotNull TextAtom text, String str, @NotNull QuestionButtons buttons, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.id = i11;
                this.text = text;
                this.authorName = str;
                this.buttons = buttons;
                this.trackingInfo = map;
            }

            public static /* synthetic */ Question copy$default(Question question, int i11, TextAtom textAtom, String str, QuestionButtons questionButtons, Map map, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i11 = question.id;
                }
                if ((i12 & 2) != 0) {
                    textAtom = question.text;
                }
                if ((i12 & 4) != 0) {
                    str = question.authorName;
                }
                if ((i12 & 8) != 0) {
                    questionButtons = question.buttons;
                }
                if ((i12 & 16) != 0) {
                    map = question.trackingInfo;
                }
                Map map2 = map;
                String str2 = str;
                return question.copy(i11, textAtom, str2, questionButtons, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final TextAtom getText() {
                return this.text;
            }

            /* renamed from: component3, reason: from getter */
            public final String getAuthorName() {
                return this.authorName;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final QuestionButtons getButtons() {
                return this.buttons;
            }

            public final Map<String, TokenizedTrackingInfo> component5() {
                return this.trackingInfo;
            }

            @NotNull
            public final Question copy(int id2, @NotNull TextAtom text, String authorName, @NotNull QuestionButtons buttons, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                return new Question(id2, text, authorName, buttons, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Question)) {
                    return false;
                }
                Question question = (Question) other;
                return this.id == question.id && Intrinsics.d(this.text, question.text) && Intrinsics.d(this.authorName, question.authorName) && Intrinsics.d(this.buttons, question.buttons) && Intrinsics.d(this.trackingInfo, question.trackingInfo);
            }

            public final String getAuthorName() {
                return this.authorName;
            }

            @NotNull
            public final QuestionButtons getButtons() {
                return this.buttons;
            }

            public final int getId() {
                return this.id;
            }

            @NotNull
            public final TextAtom getText() {
                return this.text;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int b11 = C2619v.b(Integer.hashCode(this.id) * 31, 31, this.text);
                String str = this.authorName;
                int hashCode = (this.buttons.hashCode() + ((b11 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                int i11 = this.id;
                TextAtom textAtom = this.text;
                String str = this.authorName;
                QuestionButtons questionButtons = this.buttons;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("Question(id=");
                sb2.append(i11);
                sb2.append(", text=");
                sb2.append(textAtom);
                sb2.append(", authorName=");
                sb2.append(str);
                sb2.append(", buttons=");
                sb2.append(questionButtons);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public AuthorQuestion(@NotNull Author author, @NotNull Question question) {
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(question, "question");
            this.author = author;
            this.question = question;
        }

        public static /* synthetic */ AuthorQuestion copy$default(AuthorQuestion authorQuestion, Author author, Question question, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                author = authorQuestion.author;
            }
            if ((i11 & 2) != 0) {
                question = authorQuestion.question;
            }
            return authorQuestion.copy(author, question);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Author getAuthor() {
            return this.author;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Question getQuestion() {
            return this.question;
        }

        @NotNull
        public final AuthorQuestion copy(@NotNull Author author, @NotNull Question question) {
            Intrinsics.checkNotNullParameter(author, "author");
            Intrinsics.checkNotNullParameter(question, "question");
            return new AuthorQuestion(author, question);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthorQuestion)) {
                return false;
            }
            AuthorQuestion authorQuestion = (AuthorQuestion) other;
            return Intrinsics.d(this.author, authorQuestion.author) && Intrinsics.d(this.question, authorQuestion.question);
        }

        @NotNull
        public final Author getAuthor() {
            return this.author;
        }

        @NotNull
        public final Question getQuestion() {
            return this.question;
        }

        public int hashCode() {
            return this.question.hashCode() + (this.author.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AuthorQuestion(author=" + this.author + ", question=" + this.question + ")";
        }
    }

    public SingleQuestionDTO(@NotNull AuthorQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        this.question = question;
    }

    public static /* synthetic */ SingleQuestionDTO copy$default(SingleQuestionDTO singleQuestionDTO, AuthorQuestion authorQuestion, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            authorQuestion = singleQuestionDTO.question;
        }
        return singleQuestionDTO.copy(authorQuestion);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AuthorQuestion getQuestion() {
        return this.question;
    }

    @NotNull
    public final SingleQuestionDTO copy(@NotNull AuthorQuestion question) {
        Intrinsics.checkNotNullParameter(question, "question");
        return new SingleQuestionDTO(question);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SingleQuestionDTO) && Intrinsics.d(this.question, ((SingleQuestionDTO) other).question);
    }

    @NotNull
    public final AuthorQuestion getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return this.question.hashCode();
    }

    @NotNull
    public String toString() {
        return "SingleQuestionDTO(question=" + this.question + ")";
    }
}

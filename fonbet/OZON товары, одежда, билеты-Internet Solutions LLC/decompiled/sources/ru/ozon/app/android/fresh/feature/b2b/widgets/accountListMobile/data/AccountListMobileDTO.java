package ru.ozon.app.android.fresh.feature.b2b.widgets.accountListMobile.data;

import G.g;
import H3.c;
import Ih.a;
import Kk.C3532b;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.data.badge.Badge;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO;", "", "accounts", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO$AccountDTO;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "AccountDTO", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountListMobileDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<AccountDTO> accounts;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accountListMobile/data/AccountListMobileDTO$AccountDTO;", "", "avatar", "Lru/ozon/uni/atoms/data/avatar/Avatar;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "counter", "Lru/ozon/uni/atoms/data/badge/Badge;", "isSelected", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/avatar/Avatar;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;ZLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAvatar", "()Lru/ozon/uni/atoms/data/avatar/Avatar;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCounter", "()Lru/ozon/uni/atoms/data/badge/Badge;", "()Z", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountDTO {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final Avatar avatar;
        private final Badge counter;
        private final boolean isSelected;
        private final String subtitle;

        @NotNull
        private final String title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public AccountDTO(@NotNull Avatar avatar, @NotNull String title, String str, Badge badge, boolean z11, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.avatar = avatar;
            this.title = title;
            this.subtitle = str;
            this.counter = badge;
            this.isSelected = z11;
            this.action = action;
            this.trackingInfo = map;
        }

        public static /* synthetic */ AccountDTO copy$default(AccountDTO accountDTO, Avatar avatar, String str, String str2, Badge badge, boolean z11, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                avatar = accountDTO.avatar;
            }
            if ((i11 & 2) != 0) {
                str = accountDTO.title;
            }
            if ((i11 & 4) != 0) {
                str2 = accountDTO.subtitle;
            }
            if ((i11 & 8) != 0) {
                badge = accountDTO.counter;
            }
            if ((i11 & 16) != 0) {
                z11 = accountDTO.isSelected;
            }
            if ((i11 & 32) != 0) {
                atomActionDTO = accountDTO.action;
            }
            if ((i11 & 64) != 0) {
                map = accountDTO.trackingInfo;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            boolean z12 = z11;
            String str3 = str2;
            return accountDTO.copy(avatar, str, str3, badge, z12, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Avatar getAvatar() {
            return this.avatar;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final Badge getCounter() {
            return this.counter;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final AccountDTO copy(@NotNull Avatar avatar, @NotNull String title, String subtitle, Badge counter, boolean isSelected, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(avatar, "avatar");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new AccountDTO(avatar, title, subtitle, counter, isSelected, action, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountDTO)) {
                return false;
            }
            AccountDTO accountDTO = (AccountDTO) other;
            return Intrinsics.d(this.avatar, accountDTO.avatar) && Intrinsics.d(this.title, accountDTO.title) && Intrinsics.d(this.subtitle, accountDTO.subtitle) && Intrinsics.d(this.counter, accountDTO.counter) && this.isSelected == accountDTO.isSelected && Intrinsics.d(this.action, accountDTO.action) && Intrinsics.d(this.trackingInfo, accountDTO.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final Avatar getAvatar() {
            return this.avatar;
        }

        public final Badge getCounter() {
            return this.counter;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int a11 = g.a(this.avatar.hashCode() * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            Badge badge = this.counter;
            int b11 = a.b(this.action, C3532b.a((hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.isSelected), 31);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            Avatar avatar = this.avatar;
            String str = this.title;
            String str2 = this.subtitle;
            Badge badge = this.counter;
            boolean z11 = this.isSelected;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder sb2 = new StringBuilder("AccountDTO(avatar=");
            sb2.append(avatar);
            sb2.append(", title=");
            sb2.append(str);
            sb2.append(", subtitle=");
            sb2.append(str2);
            sb2.append(", counter=");
            sb2.append(badge);
            sb2.append(", isSelected=");
            sb2.append(z11);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", trackingInfo=");
            return P.f(sb2, map, ")");
        }
    }

    public AccountListMobileDTO(@NotNull List<AccountDTO> accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.accounts = accounts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountListMobileDTO copy$default(AccountListMobileDTO accountListMobileDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = accountListMobileDTO.accounts;
        }
        return accountListMobileDTO.copy(list);
    }

    @NotNull
    public final List<AccountDTO> component1() {
        return this.accounts;
    }

    @NotNull
    public final AccountListMobileDTO copy(@NotNull List<AccountDTO> accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        return new AccountListMobileDTO(accounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountListMobileDTO) && Intrinsics.d(this.accounts, ((AccountListMobileDTO) other).accounts);
    }

    @NotNull
    public final List<AccountDTO> getAccounts() {
        return this.accounts;
    }

    public int hashCode() {
        return this.accounts.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("AccountListMobileDTO(accounts=", ")", this.accounts);
    }
}

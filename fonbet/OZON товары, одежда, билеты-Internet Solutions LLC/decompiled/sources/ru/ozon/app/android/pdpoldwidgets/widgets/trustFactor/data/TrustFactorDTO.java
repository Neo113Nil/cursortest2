package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.data;

import C.o0;
import G.g;
import H3.c;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/data/TrustFactorDTO;", "", "trustFactors", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/data/TrustFactorDTO$TrustFactorItem;", "<init>", "(Ljava/util/List;)V", "getTrustFactors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TrustFactorItem", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TrustFactorDTO {

    @NotNull
    private final List<TrustFactorItem> trustFactors;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/data/TrustFactorDTO$TrustFactorItem;", "", "key", "", "icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getIcon", "getTitle", "getDescription", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrustFactorItem {
        private final String deeplink;
        private final String description;

        @NotNull
        private final String icon;

        @NotNull
        private final String key;

        @NotNull
        private final String title;

        public TrustFactorItem(@NotNull String key, @NotNull String icon, @NotNull String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.key = key;
            this.icon = icon;
            this.title = title;
            this.description = str;
            this.deeplink = str2;
        }

        public static /* synthetic */ TrustFactorItem copy$default(TrustFactorItem trustFactorItem, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = trustFactorItem.key;
            }
            if ((i11 & 2) != 0) {
                str2 = trustFactorItem.icon;
            }
            if ((i11 & 4) != 0) {
                str3 = trustFactorItem.title;
            }
            if ((i11 & 8) != 0) {
                str4 = trustFactorItem.description;
            }
            if ((i11 & 16) != 0) {
                str5 = trustFactorItem.deeplink;
            }
            String str6 = str5;
            String str7 = str3;
            return trustFactorItem.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final TrustFactorItem copy(@NotNull String key, @NotNull String icon, @NotNull String title, String description, String deeplink) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            return new TrustFactorItem(key, icon, title, description, deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustFactorItem)) {
                return false;
            }
            TrustFactorItem trustFactorItem = (TrustFactorItem) other;
            return Intrinsics.d(this.key, trustFactorItem.key) && Intrinsics.d(this.icon, trustFactorItem.icon) && Intrinsics.d(this.title, trustFactorItem.title) && Intrinsics.d(this.description, trustFactorItem.description) && Intrinsics.d(this.deeplink, trustFactorItem.deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int a11 = g.a(g.a(this.key.hashCode() * 31, 31, this.icon), 31, this.title);
            String str = this.description;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deeplink;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.key;
            String str2 = this.icon;
            String str3 = this.title;
            String str4 = this.description;
            String str5 = this.deeplink;
            StringBuilder d11 = C3660k.d("TrustFactorItem(key=", str, ", icon=", str2, ", title=");
            a.h(d11, str3, ", description=", str4, ", deeplink=");
            return o0.c(d11, str5, ")");
        }
    }

    public TrustFactorDTO(@NotNull List<TrustFactorItem> trustFactors) {
        Intrinsics.checkNotNullParameter(trustFactors, "trustFactors");
        this.trustFactors = trustFactors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrustFactorDTO copy$default(TrustFactorDTO trustFactorDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = trustFactorDTO.trustFactors;
        }
        return trustFactorDTO.copy(list);
    }

    @NotNull
    public final List<TrustFactorItem> component1() {
        return this.trustFactors;
    }

    @NotNull
    public final TrustFactorDTO copy(@NotNull List<TrustFactorItem> trustFactors) {
        Intrinsics.checkNotNullParameter(trustFactors, "trustFactors");
        return new TrustFactorDTO(trustFactors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TrustFactorDTO) && Intrinsics.d(this.trustFactors, ((TrustFactorDTO) other).trustFactors);
    }

    @NotNull
    public final List<TrustFactorItem> getTrustFactors() {
        return this.trustFactors;
    }

    public int hashCode() {
        return this.trustFactors.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("TrustFactorDTO(trustFactors=", ")", this.trustFactors);
    }
}

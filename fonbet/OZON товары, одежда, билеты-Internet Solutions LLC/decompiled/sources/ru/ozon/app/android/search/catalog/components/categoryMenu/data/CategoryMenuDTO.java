package ru.ozon.app.android.search.catalog.components.categoryMenu.data;

import Ak.C2436a;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Nh.a;
import T7.P;
import Tl.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001cB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO;", "", "modalUrl", "", "categories", "", "Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO$CategoryDTO;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getModalUrl", "()Ljava/lang/String;", "getCategories", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "CategoryDTO", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryMenuDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<CategoryDTO> categories;

    @NotNull
    private final String modalUrl;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categoryMenu/data/CategoryMenuDTO$CategoryDTO;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "link", "deeplink", "isActive", "", "categories", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/Map;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getLink", "getDeeplink", "()Z", "getCategories", "()Ljava/util/List;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<CategoryDTO> categories;

        @NotNull
        private final String deeplink;
        private final long id;
        private final boolean isActive;

        @NotNull
        private final String link;

        @NotNull
        private final String name;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public CategoryDTO(long j11, @NotNull String name, @NotNull String link, @NotNull String deeplink, boolean z11, @NotNull List<CategoryDTO> categories, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(categories, "categories");
            this.id = j11;
            this.name = name;
            this.link = link;
            this.deeplink = deeplink;
            this.isActive = z11;
            this.categories = categories;
            this.trackingInfo = map;
        }

        public static /* synthetic */ CategoryDTO copy$default(CategoryDTO categoryDTO, long j11, String str, String str2, String str3, boolean z11, List list, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = categoryDTO.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                str = categoryDTO.name;
            }
            String str4 = str;
            if ((i11 & 4) != 0) {
                str2 = categoryDTO.link;
            }
            String str5 = str2;
            if ((i11 & 8) != 0) {
                str3 = categoryDTO.deeplink;
            }
            String str6 = str3;
            if ((i11 & 16) != 0) {
                z11 = categoryDTO.isActive;
            }
            return categoryDTO.copy(j12, str4, str5, str6, z11, (i11 & 32) != 0 ? categoryDTO.categories : list, (i11 & 64) != 0 ? categoryDTO.trackingInfo : map);
        }

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        @NotNull
        public final List<CategoryDTO> component6() {
            return this.categories;
        }

        public final Map<String, TokenizedTrackingInfo> component7() {
            return this.trackingInfo;
        }

        @NotNull
        public final CategoryDTO copy(long id2, @NotNull String name, @NotNull String link, @NotNull String deeplink, boolean isActive, @NotNull List<CategoryDTO> categories, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(categories, "categories");
            return new CategoryDTO(id2, name, link, deeplink, isActive, categories, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CategoryDTO)) {
                return false;
            }
            CategoryDTO categoryDTO = (CategoryDTO) other;
            return this.id == categoryDTO.id && Intrinsics.d(this.name, categoryDTO.name) && Intrinsics.d(this.link, categoryDTO.link) && Intrinsics.d(this.deeplink, categoryDTO.deeplink) && this.isActive == categoryDTO.isActive && Intrinsics.d(this.categories, categoryDTO.categories) && Intrinsics.d(this.trackingInfo, categoryDTO.trackingInfo);
        }

        @NotNull
        public final List<CategoryDTO> getCategories() {
            return this.categories;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = g.b(C3532b.a(g.a(g.a(g.a(Long.hashCode(this.id) * 31, 31, this.name), 31, this.link), 31, this.deeplink), 31, this.isActive), 31, this.categories);
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return b11 + (map == null ? 0 : map.hashCode());
        }

        public final boolean isActive() {
            return this.isActive;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            String str = this.name;
            String str2 = this.link;
            String str3 = this.deeplink;
            boolean z11 = this.isActive;
            List<CategoryDTO> list = this.categories;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder c11 = C2436a.c(j11, "CategoryDTO(id=", ", name=", str);
            a.h(c11, ", link=", str2, ", deeplink=", str3);
            c11.append(", isActive=");
            c11.append(z11);
            c11.append(", categories=");
            c11.append(list);
            return C2639a.b(c11, ", trackingInfo=", map, ")");
        }
    }

    public CategoryMenuDTO(@NotNull String modalUrl, @NotNull List<CategoryDTO> categories, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(modalUrl, "modalUrl");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.modalUrl = modalUrl;
        this.categories = categories;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CategoryMenuDTO copy$default(CategoryMenuDTO categoryMenuDTO, String str, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryMenuDTO.modalUrl;
        }
        if ((i11 & 2) != 0) {
            list = categoryMenuDTO.categories;
        }
        if ((i11 & 4) != 0) {
            map = categoryMenuDTO.trackingInfo;
        }
        return categoryMenuDTO.copy(str, list, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getModalUrl() {
        return this.modalUrl;
    }

    @NotNull
    public final List<CategoryDTO> component2() {
        return this.categories;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final CategoryMenuDTO copy(@NotNull String modalUrl, @NotNull List<CategoryDTO> categories, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(modalUrl, "modalUrl");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new CategoryMenuDTO(modalUrl, categories, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryMenuDTO)) {
            return false;
        }
        CategoryMenuDTO categoryMenuDTO = (CategoryMenuDTO) other;
        return Intrinsics.d(this.modalUrl, categoryMenuDTO.modalUrl) && Intrinsics.d(this.categories, categoryMenuDTO.categories) && Intrinsics.d(this.trackingInfo, categoryMenuDTO.trackingInfo);
    }

    @NotNull
    public final List<CategoryDTO> getCategories() {
        return this.categories;
    }

    @NotNull
    public final String getModalUrl() {
        return this.modalUrl;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.modalUrl.hashCode() * 31, 31, this.categories);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.modalUrl;
        List<CategoryDTO> list = this.categories;
        return P.f(b.f("CategoryMenuDTO(modalUrl=", str, ", categories=", ", trackingInfo=", list), this.trackingInfo, ")");
    }
}

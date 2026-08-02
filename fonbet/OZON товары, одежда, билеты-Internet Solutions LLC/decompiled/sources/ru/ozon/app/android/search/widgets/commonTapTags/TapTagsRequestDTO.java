package ru.ozon.app.android.search.widgets.commonTapTags;

import Fj.c;
import G.g;
import Kk.C3532b;
import com.google.android.gms.actions.SearchIntents;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JD\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "", SearchIntents.EXTRA_QUERY, "", "link", "widgetVersion", "", "fromBind", "", "searchDelay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Long;)V", "getQuery", "()Ljava/lang/String;", "getLink", "getWidgetVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromBind", "()Z", "getSearchDelay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Long;)Lru/ozon/app/android/search/widgets/commonTapTags/TapTagsRequestDTO;", "equals", "other", "hashCode", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TapTagsRequestDTO {
    public static final int $stable = 0;
    private final transient boolean fromBind;

    @NotNull
    private final String link;

    @NotNull
    private final String query;
    private final transient Long searchDelay;
    private final Integer widgetVersion;

    public TapTagsRequestDTO(@NotNull String query, @NotNull String link, Integer num, boolean z11, Long l11) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(link, "link");
        this.query = query;
        this.link = link;
        this.widgetVersion = num;
        this.fromBind = z11;
        this.searchDelay = l11;
    }

    public static /* synthetic */ TapTagsRequestDTO copy$default(TapTagsRequestDTO tapTagsRequestDTO, String str, String str2, Integer num, boolean z11, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tapTagsRequestDTO.query;
        }
        if ((i11 & 2) != 0) {
            str2 = tapTagsRequestDTO.link;
        }
        if ((i11 & 4) != 0) {
            num = tapTagsRequestDTO.widgetVersion;
        }
        if ((i11 & 8) != 0) {
            z11 = tapTagsRequestDTO.fromBind;
        }
        if ((i11 & 16) != 0) {
            l11 = tapTagsRequestDTO.searchDelay;
        }
        Long l12 = l11;
        Integer num2 = num;
        return tapTagsRequestDTO.copy(str, str2, num2, z11, l12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getWidgetVersion() {
        return this.widgetVersion;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFromBind() {
        return this.fromBind;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getSearchDelay() {
        return this.searchDelay;
    }

    @NotNull
    public final TapTagsRequestDTO copy(@NotNull String query, @NotNull String link, Integer widgetVersion, boolean fromBind, Long searchDelay) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(link, "link");
        return new TapTagsRequestDTO(query, link, widgetVersion, fromBind, searchDelay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapTagsRequestDTO)) {
            return false;
        }
        TapTagsRequestDTO tapTagsRequestDTO = (TapTagsRequestDTO) other;
        return Intrinsics.d(this.query, tapTagsRequestDTO.query) && Intrinsics.d(this.link, tapTagsRequestDTO.link) && Intrinsics.d(this.widgetVersion, tapTagsRequestDTO.widgetVersion) && this.fromBind == tapTagsRequestDTO.fromBind && Intrinsics.d(this.searchDelay, tapTagsRequestDTO.searchDelay);
    }

    public final boolean getFromBind() {
        return this.fromBind;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public final Long getSearchDelay() {
        return this.searchDelay;
    }

    public final Integer getWidgetVersion() {
        return this.widgetVersion;
    }

    public int hashCode() {
        int a11 = g.a(this.query.hashCode() * 31, 31, this.link);
        Integer num = this.widgetVersion;
        int a12 = C3532b.a((a11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.fromBind);
        Long l11 = this.searchDelay;
        return a12 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        c.f("query=", this.query, ", ", sb2);
        c.f("link=", this.link, ", ", sb2);
        sb2.append("widgetVersion=" + this.widgetVersion + ", ");
        sb2.append("fromBind=" + this.fromBind + ", ");
        sb2.append("searchDelay=" + this.searchDelay);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public /* synthetic */ TapTagsRequestDTO(String str, String str2, Integer num, boolean z11, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? 0L : l11);
    }
}

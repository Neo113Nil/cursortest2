package ru.ozon.app.android.universalwidgets.widgets.uw.old.common.analytics;

import G.g;
import I0.C3173b;
import N3.C3660k;
import Nh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/common/analytics/UniversalUiCellTrackingInfo;", "", "id", "", "type", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "deeplink", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getTitle", "getSubtitle", "getDeeplink", "getLink", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UniversalUiCellTrackingInfo {
    private final String deeplink;

    @NotNull
    private final String id;
    private final String link;
    private final String subtitle;
    private final String title;

    @NotNull
    private final String type;

    public UniversalUiCellTrackingInfo(@NotNull String id2, @NotNull String type, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.type = type;
        this.title = str;
        this.subtitle = str2;
        this.deeplink = str3;
        this.link = str4;
    }

    public static /* synthetic */ UniversalUiCellTrackingInfo copy$default(UniversalUiCellTrackingInfo universalUiCellTrackingInfo, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = universalUiCellTrackingInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = universalUiCellTrackingInfo.type;
        }
        if ((i11 & 4) != 0) {
            str3 = universalUiCellTrackingInfo.title;
        }
        if ((i11 & 8) != 0) {
            str4 = universalUiCellTrackingInfo.subtitle;
        }
        if ((i11 & 16) != 0) {
            str5 = universalUiCellTrackingInfo.deeplink;
        }
        if ((i11 & 32) != 0) {
            str6 = universalUiCellTrackingInfo.link;
        }
        String str7 = str5;
        String str8 = str6;
        return universalUiCellTrackingInfo.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final UniversalUiCellTrackingInfo copy(@NotNull String id2, @NotNull String type, String title, String subtitle, String deeplink, String link) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        return new UniversalUiCellTrackingInfo(id2, type, title, subtitle, deeplink, link);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalUiCellTrackingInfo)) {
            return false;
        }
        UniversalUiCellTrackingInfo universalUiCellTrackingInfo = (UniversalUiCellTrackingInfo) other;
        return Intrinsics.d(this.id, universalUiCellTrackingInfo.id) && Intrinsics.d(this.type, universalUiCellTrackingInfo.type) && Intrinsics.d(this.title, universalUiCellTrackingInfo.title) && Intrinsics.d(this.subtitle, universalUiCellTrackingInfo.subtitle) && Intrinsics.d(this.deeplink, universalUiCellTrackingInfo.deeplink) && Intrinsics.d(this.link, universalUiCellTrackingInfo.link);
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int a11 = g.a(this.id.hashCode() * 31, 31, this.type);
        String str = this.title;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deeplink;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.type;
        String str3 = this.title;
        String str4 = this.subtitle;
        String str5 = this.deeplink;
        String str6 = this.link;
        StringBuilder d11 = C3660k.d("UniversalUiCellTrackingInfo(id=", str, ", type=", str2, ", title=");
        a.h(d11, str3, ", subtitle=", str4, ", deeplink=");
        return C3173b.c(d11, str5, ", link=", str6, ")");
    }
}

package io.intercom.android.sdk.m5.helpcenter.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionRowData.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0006H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/states/CollectionRowData;", "", "id", "", "titleText", "descriptionVisibility", "", "descriptionText", "articlesCount", "collectionsCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;II)V", "getId", "()Ljava/lang/String;", "getTitleText", "getDescriptionVisibility", "()I", "getDescriptionText", "getArticlesCount", "getCollectionsCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CollectionRowData {
    public static final int $stable = 0;
    private final int articlesCount;
    private final int collectionsCount;
    private final String descriptionText;
    private final int descriptionVisibility;
    private final String id;
    private final String titleText;

    public static /* synthetic */ CollectionRowData copy$default(CollectionRowData collectionRowData, String str, String str2, int i, String str3, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = collectionRowData.id;
        }
        if ((i4 & 2) != 0) {
            str2 = collectionRowData.titleText;
        }
        if ((i4 & 4) != 0) {
            i = collectionRowData.descriptionVisibility;
        }
        if ((i4 & 8) != 0) {
            str3 = collectionRowData.descriptionText;
        }
        if ((i4 & 16) != 0) {
            i2 = collectionRowData.articlesCount;
        }
        if ((i4 & 32) != 0) {
            i3 = collectionRowData.collectionsCount;
        }
        int i5 = i2;
        int i6 = i3;
        return collectionRowData.copy(str, str2, i, str3, i5, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component5, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCollectionsCount() {
        return this.collectionsCount;
    }

    public final CollectionRowData copy(String id, String titleText, int descriptionVisibility, String descriptionText, int articlesCount, int collectionsCount) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        return new CollectionRowData(id, titleText, descriptionVisibility, descriptionText, articlesCount, collectionsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionRowData)) {
            return false;
        }
        CollectionRowData collectionRowData = (CollectionRowData) other;
        return Intrinsics.areEqual(this.id, collectionRowData.id) && Intrinsics.areEqual(this.titleText, collectionRowData.titleText) && this.descriptionVisibility == collectionRowData.descriptionVisibility && Intrinsics.areEqual(this.descriptionText, collectionRowData.descriptionText) && this.articlesCount == collectionRowData.articlesCount && this.collectionsCount == collectionRowData.collectionsCount;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.titleText.hashCode()) * 31) + Integer.hashCode(this.descriptionVisibility)) * 31) + this.descriptionText.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + Integer.hashCode(this.collectionsCount);
    }

    public String toString() {
        return "CollectionRowData(id=" + this.id + ", titleText=" + this.titleText + ", descriptionVisibility=" + this.descriptionVisibility + ", descriptionText=" + this.descriptionText + ", articlesCount=" + this.articlesCount + ", collectionsCount=" + this.collectionsCount + ')';
    }

    public CollectionRowData(String id, String titleText, int i, String descriptionText, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        this.id = id;
        this.titleText = titleText;
        this.descriptionVisibility = i;
        this.descriptionText = descriptionText;
        this.articlesCount = i2;
        this.collectionsCount = i3;
    }

    public /* synthetic */ CollectionRowData(String str, String str2, int i, String str3, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final int getDescriptionVisibility() {
        return this.descriptionVisibility;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final int getCollectionsCount() {
        return this.collectionsCount;
    }
}

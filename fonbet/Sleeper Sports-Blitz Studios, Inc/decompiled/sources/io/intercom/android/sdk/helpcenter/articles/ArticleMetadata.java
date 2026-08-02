package io.intercom.android.sdk.helpcenter.articles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleViewState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "", "id", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ArticleMetadata {
    public static final int $stable = 0;
    private final String id;
    private final String title;

    public static /* synthetic */ ArticleMetadata copy$default(ArticleMetadata articleMetadata, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = articleMetadata.id;
        }
        if ((i & 2) != 0) {
            str2 = articleMetadata.title;
        }
        return articleMetadata.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ArticleMetadata copy(String id, String title) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ArticleMetadata(id, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleMetadata)) {
            return false;
        }
        ArticleMetadata articleMetadata = (ArticleMetadata) other;
        return Intrinsics.areEqual(this.id, articleMetadata.id) && Intrinsics.areEqual(this.title, articleMetadata.title);
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.title;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ArticleMetadata(id=" + this.id + ", title=" + this.title + ')';
    }

    public ArticleMetadata(String id, String str) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.title = str;
    }

    public /* synthetic */ ArticleMetadata(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }
}

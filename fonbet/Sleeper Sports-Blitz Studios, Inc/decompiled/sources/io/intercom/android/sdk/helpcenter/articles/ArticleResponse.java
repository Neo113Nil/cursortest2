package io.intercom.android.sdk.helpcenter.articles;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: Article.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0007H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "", "article", "Lio/intercom/android/sdk/helpcenter/articles/Article;", "<init>", "(Lio/intercom/android/sdk/helpcenter/articles/Article;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILio/intercom/android/sdk/helpcenter/articles/Article;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getArticle$annotations", "()V", "getArticle", "()Lio/intercom/android/sdk/helpcenter/articles/Article;", "component1", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes9.dex */
public final /* data */ class ArticleResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Article article;

    public static /* synthetic */ ArticleResponse copy$default(ArticleResponse articleResponse, Article article, int i, Object obj) {
        if ((i & 1) != 0) {
            article = articleResponse.article;
        }
        return articleResponse.copy(article);
    }

    @SerialName("article")
    public static /* synthetic */ void getArticle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Article getArticle() {
        return this.article;
    }

    public final ArticleResponse copy(Article article) {
        Intrinsics.checkNotNullParameter(article, "article");
        return new ArticleResponse(article);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArticleResponse) && Intrinsics.areEqual(this.article, ((ArticleResponse) other).article);
    }

    public int hashCode() {
        return this.article.hashCode();
    }

    public String toString() {
        return "ArticleResponse(article=" + this.article + ')';
    }

    /* compiled from: Article.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleResponse;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArticleResponse> serializer() {
            return ArticleResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArticleResponse(int i, Article article, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ArticleResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.article = article;
    }

    public ArticleResponse(Article article) {
        Intrinsics.checkNotNullParameter(article, "article");
        this.article = article;
    }

    public final Article getArticle() {
        return this.article;
    }
}

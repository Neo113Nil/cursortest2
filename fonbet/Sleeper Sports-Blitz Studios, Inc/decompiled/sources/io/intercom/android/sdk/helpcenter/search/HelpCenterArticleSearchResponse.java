package io.intercom.android.sdk.helpcenter.search;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HelpCenterArticleSearchResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 22\u00020\u0001:\u0003012B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010&\u001a\u00020\fH×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "", "articleId", "", "summary", "title", "url", "highlight", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getArticleId$annotations", "()V", "getArticleId", "()Ljava/lang/String;", "getSummary$annotations", "getSummary", "getTitle$annotations", "getTitle", "getUrl$annotations", "getUrl", "getHighlight$annotations", "getHighlight", "()Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "Highlight", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes9.dex */
public final /* data */ class HelpCenterArticleSearchResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String articleId;
    private final Highlight highlight;
    private final String summary;
    private final String title;
    private final String url;

    public static /* synthetic */ HelpCenterArticleSearchResponse copy$default(HelpCenterArticleSearchResponse helpCenterArticleSearchResponse, String str, String str2, String str3, String str4, Highlight highlight, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helpCenterArticleSearchResponse.articleId;
        }
        if ((i & 2) != 0) {
            str2 = helpCenterArticleSearchResponse.summary;
        }
        if ((i & 4) != 0) {
            str3 = helpCenterArticleSearchResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = helpCenterArticleSearchResponse.url;
        }
        if ((i & 16) != 0) {
            highlight = helpCenterArticleSearchResponse.highlight;
        }
        Highlight highlight2 = highlight;
        String str5 = str3;
        return helpCenterArticleSearchResponse.copy(str, str2, str5, str4, highlight2);
    }

    @SerialName("id")
    public static /* synthetic */ void getArticleId$annotations() {
    }

    @SerialName("highlight")
    public static /* synthetic */ void getHighlight$annotations() {
    }

    @SerialName("summary")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @SerialName("url")
    public static /* synthetic */ void getUrl$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getArticleId() {
        return this.articleId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component5, reason: from getter */
    public final Highlight getHighlight() {
        return this.highlight;
    }

    public final HelpCenterArticleSearchResponse copy(String articleId, String summary, String title, String url, Highlight highlight) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        return new HelpCenterArticleSearchResponse(articleId, summary, title, url, highlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterArticleSearchResponse)) {
            return false;
        }
        HelpCenterArticleSearchResponse helpCenterArticleSearchResponse = (HelpCenterArticleSearchResponse) other;
        return Intrinsics.areEqual(this.articleId, helpCenterArticleSearchResponse.articleId) && Intrinsics.areEqual(this.summary, helpCenterArticleSearchResponse.summary) && Intrinsics.areEqual(this.title, helpCenterArticleSearchResponse.title) && Intrinsics.areEqual(this.url, helpCenterArticleSearchResponse.url) && Intrinsics.areEqual(this.highlight, helpCenterArticleSearchResponse.highlight);
    }

    public int hashCode() {
        return (((((((this.articleId.hashCode() * 31) + this.summary.hashCode()) * 31) + this.title.hashCode()) * 31) + this.url.hashCode()) * 31) + this.highlight.hashCode();
    }

    public String toString() {
        return "HelpCenterArticleSearchResponse(articleId=" + this.articleId + ", summary=" + this.summary + ", title=" + this.title + ", url=" + this.url + ", highlight=" + this.highlight + ')';
    }

    /* compiled from: HelpCenterArticleSearchResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelpCenterArticleSearchResponse> serializer() {
            return HelpCenterArticleSearchResponse$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(int i, String str, String str2, String str3, String str4, Highlight highlight, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, HelpCenterArticleSearchResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.articleId = str;
        if ((i & 2) == 0) {
            this.summary = "";
        } else {
            this.summary = str2;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i & 8) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i & 16) != 0) {
            this.highlight = highlight;
            return;
        }
        this.highlight = new Highlight((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterArticleSearchResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.articleId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.summary, "")) {
            output.encodeStringElement(serialDesc, 1, self.summary);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.title, "")) {
            output.encodeStringElement(serialDesc, 2, self.title);
        }
        int i = 3;
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.url, "")) {
            output.encodeStringElement(serialDesc, 3, self.url);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && Intrinsics.areEqual(self.highlight, new Highlight((String) null, (String) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE, self.highlight);
    }

    public HelpCenterArticleSearchResponse(String articleId, String summary, String title, String url, Highlight highlight) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        this.articleId = articleId;
        this.summary = summary;
        this.title = title;
        this.url = url;
        this.highlight = highlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HelpCenterArticleSearchResponse(String str, String str2, String str3, String str4, Highlight highlight, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? new Highlight((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : highlight);
    }

    public final String getArticleId() {
        return this.articleId;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Highlight getHighlight() {
        return this.highlight;
    }

    /* compiled from: HelpCenterArticleSearchResponse.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\bH×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006$"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "", "title", "", "summary", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle$annotations", "()V", "getTitle", "()Ljava/lang/String;", "getSummary$annotations", "getSummary", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Highlight {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String summary;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public Highlight() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Highlight copy$default(Highlight highlight, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = highlight.title;
            }
            if ((i & 2) != 0) {
                str2 = highlight.summary;
            }
            return highlight.copy(str, str2);
        }

        @SerialName("summary")
        public static /* synthetic */ void getSummary$annotations() {
        }

        @SerialName("title")
        public static /* synthetic */ void getTitle$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        public final Highlight copy(String title, String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Highlight(title, summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Highlight)) {
                return false;
            }
            Highlight highlight = (Highlight) other;
            return Intrinsics.areEqual(this.title, highlight.title) && Intrinsics.areEqual(this.summary, highlight.summary);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.summary.hashCode();
        }

        public String toString() {
            return "Highlight(title=" + this.title + ", summary=" + this.summary + ')';
        }

        /* compiled from: HelpCenterArticleSearchResponse.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/search/HelpCenterArticleSearchResponse$Highlight;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Highlight> serializer() {
                return HelpCenterArticleSearchResponse$Highlight$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Highlight(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title = "";
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.summary = "";
            } else {
                this.summary = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Highlight self, CompositeEncoder output, SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.summary, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.summary);
        }

        public Highlight(String title, String summary) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.title = title;
            this.summary = summary;
        }

        public /* synthetic */ Highlight(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSummary() {
            return this.summary;
        }
    }
}

package io.intercom.android.sdk.helpcenter.sections;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HelpCenterCollectionContent.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABBk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003Jq\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÇ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00107\u001a\u00020\u000eH×\u0001J\t\u00108\u001a\u00020\u0003H×\u0001J%\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0001¢\u0006\u0002\b@R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010!R\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010!R\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010!R\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010(R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u0018\u001a\u0004\b*\u0010!¨\u0006C"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "", "collectionId", "", "title", "summary", "helpCenterArticles", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "helpCenterSections", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "subCollections", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "articlesCount", "", "authors", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCollectionId$annotations", "()V", "getCollectionId", "()Ljava/lang/String;", "getTitle$annotations", "getTitle", "getSummary$annotations", "getSummary", "getHelpCenterArticles$annotations", "getHelpCenterArticles", "()Ljava/util/List;", "getHelpCenterSections$annotations", "getHelpCenterSections", "getSubCollections$annotations", "getSubCollections", "getArticlesCount$annotations", "getArticlesCount", "()I", "getAuthors$annotations", "getAuthors", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes9.dex */
public final /* data */ class HelpCenterCollectionContent {
    private final int articlesCount;
    private final List<Author> authors;
    private final String collectionId;
    private final List<HelpCenterArticle> helpCenterArticles;
    private final List<HelpCenterSection> helpCenterSections;
    private final List<HelpCenterCollection> subCollections;
    private final String summary;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(HelpCenterArticle$$serializer.INSTANCE), new ArrayListSerializer(HelpCenterSection$$serializer.INSTANCE), new ArrayListSerializer(HelpCenterCollection$$serializer.INSTANCE), null, new ArrayListSerializer(Author$$serializer.INSTANCE)};

    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = helpCenterCollectionContent.collectionId;
        }
        if ((i2 & 2) != 0) {
            str2 = helpCenterCollectionContent.title;
        }
        if ((i2 & 4) != 0) {
            str3 = helpCenterCollectionContent.summary;
        }
        if ((i2 & 8) != 0) {
            list = helpCenterCollectionContent.helpCenterArticles;
        }
        if ((i2 & 16) != 0) {
            list2 = helpCenterCollectionContent.helpCenterSections;
        }
        if ((i2 & 32) != 0) {
            list3 = helpCenterCollectionContent.subCollections;
        }
        if ((i2 & 64) != 0) {
            i = helpCenterCollectionContent.articlesCount;
        }
        if ((i2 & 128) != 0) {
            list4 = helpCenterCollectionContent.authors;
        }
        int i3 = i;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        return helpCenterCollectionContent.copy(str, str2, str3, list, list6, list7, i3, list5);
    }

    @SerialName("article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @SerialName("authors")
    public static /* synthetic */ void getAuthors$annotations() {
    }

    @SerialName("id")
    public static /* synthetic */ void getCollectionId$annotations() {
    }

    @SerialName("articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "sections is deprecated and will be removed in a future release. Use collections instead", replaceWith = @ReplaceWith(expression = "collections", imports = {}))
    @SerialName("sections")
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    @SerialName("collections")
    public static /* synthetic */ void getSubCollections$annotations() {
    }

    @SerialName("description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    /* renamed from: component7, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> component8() {
        return this.authors;
    }

    public final HelpCenterCollectionContent copy(String collectionId, String title, String summary, List<HelpCenterArticle> helpCenterArticles, List<HelpCenterSection> helpCenterSections, List<HelpCenterCollection> subCollections, int articlesCount, List<Author> authors) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(helpCenterSections, "helpCenterSections");
        Intrinsics.checkNotNullParameter(subCollections, "subCollections");
        Intrinsics.checkNotNullParameter(authors, "authors");
        return new HelpCenterCollectionContent(collectionId, title, summary, helpCenterArticles, helpCenterSections, subCollections, articlesCount, authors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) other;
        return Intrinsics.areEqual(this.collectionId, helpCenterCollectionContent.collectionId) && Intrinsics.areEqual(this.title, helpCenterCollectionContent.title) && Intrinsics.areEqual(this.summary, helpCenterCollectionContent.summary) && Intrinsics.areEqual(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && Intrinsics.areEqual(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && Intrinsics.areEqual(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && Intrinsics.areEqual(this.authors, helpCenterCollectionContent.authors);
    }

    public int hashCode() {
        return (((((((((((((this.collectionId.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.helpCenterArticles.hashCode()) * 31) + this.helpCenterSections.hashCode()) * 31) + this.subCollections.hashCode()) * 31) + Integer.hashCode(this.articlesCount)) * 31) + this.authors.hashCode();
    }

    public String toString() {
        return "HelpCenterCollectionContent(collectionId=" + this.collectionId + ", title=" + this.title + ", summary=" + this.summary + ", helpCenterArticles=" + this.helpCenterArticles + ", helpCenterSections=" + this.helpCenterSections + ", subCollections=" + this.subCollections + ", articlesCount=" + this.articlesCount + ", authors=" + this.authors + ')';
    }

    /* compiled from: HelpCenterCollectionContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelpCenterCollectionContent> serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HelpCenterCollectionContent(int i, String str, String str2, String str3, List list, List list2, List list3, int i2, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if (65 != (i & 65)) {
            PluginExceptionsKt.throwMissingFieldException(i, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
        }
        this.collectionId = str;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i & 8) == 0) {
            this.helpCenterArticles = CollectionsKt.emptyList();
        } else {
            this.helpCenterArticles = list;
        }
        if ((i & 16) == 0) {
            this.helpCenterSections = CollectionsKt.emptyList();
        } else {
            this.helpCenterSections = list2;
        }
        if ((i & 32) == 0) {
            this.subCollections = CollectionsKt.emptyList();
        } else {
            this.subCollections = list3;
        }
        this.articlesCount = i2;
        if ((i & 128) == 0) {
            this.authors = CollectionsKt.emptyList();
        } else {
            this.authors = list4;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.collectionId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.summary, "")) {
            output.encodeStringElement(serialDesc, 2, self.summary);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.helpCenterArticles, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 3, kSerializerArr[3], self.helpCenterArticles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual(self.helpCenterSections, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 4, kSerializerArr[4], self.helpCenterSections);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.subCollections, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.subCollections);
        }
        output.encodeIntElement(serialDesc, 6, self.articlesCount);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && Intrinsics.areEqual(self.authors, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 7, kSerializerArr[7], self.authors);
    }

    public HelpCenterCollectionContent(String collectionId, String title, String summary, List<HelpCenterArticle> helpCenterArticles, List<HelpCenterSection> helpCenterSections, List<HelpCenterCollection> subCollections, int i, List<Author> authors) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(helpCenterSections, "helpCenterSections");
        Intrinsics.checkNotNullParameter(subCollections, "subCollections");
        Intrinsics.checkNotNullParameter(authors, "authors");
        this.collectionId = collectionId;
        this.title = title;
        this.summary = summary;
        this.helpCenterArticles = helpCenterArticles;
        this.helpCenterSections = helpCenterSections;
        this.subCollections = subCollections;
        this.articlesCount = i;
        this.authors = authors;
    }

    public /* synthetic */ HelpCenterCollectionContent(String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list3, i, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list4);
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> getAuthors() {
        return this.authors;
    }
}

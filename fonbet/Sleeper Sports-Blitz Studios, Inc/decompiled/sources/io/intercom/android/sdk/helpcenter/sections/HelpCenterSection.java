package io.intercom.android.sdk.helpcenter.sections;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.List;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HelpCenterCollectionContent.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J#\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\nH×\u0001J\t\u0010\u001c\u001a\u00020\u0006H×\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "", "helpCenterArticles", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "title", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getHelpCenterArticles$annotations", "()V", "getHelpCenterArticles", "()Ljava/util/List;", "getTitle$annotations", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", AgentOptions.OUTPUT, "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$intercom_sdk_base_release", "$serializer", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes9.dex */
public final /* data */ class HelpCenterSection {
    private final List<HelpCenterArticle> helpCenterArticles;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(HelpCenterArticle$$serializer.INSTANCE), null};

    /* JADX WARN: Multi-variable type inference failed */
    public HelpCenterSection() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HelpCenterSection copy$default(HelpCenterSection helpCenterSection, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = helpCenterSection.helpCenterArticles;
        }
        if ((i & 2) != 0) {
            str = helpCenterSection.title;
        }
        return helpCenterSection.copy(list, str);
    }

    @SerialName("articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @SerialName("name")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public final List<HelpCenterArticle> component1() {
        return this.helpCenterArticles;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final HelpCenterSection copy(List<HelpCenterArticle> helpCenterArticles, String title) {
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(title, "title");
        return new HelpCenterSection(helpCenterArticles, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterSection)) {
            return false;
        }
        HelpCenterSection helpCenterSection = (HelpCenterSection) other;
        return Intrinsics.areEqual(this.helpCenterArticles, helpCenterSection.helpCenterArticles) && Intrinsics.areEqual(this.title, helpCenterSection.title);
    }

    public int hashCode() {
        return (this.helpCenterArticles.hashCode() * 31) + this.title.hashCode();
    }

    public String toString() {
        return "HelpCenterSection(helpCenterArticles=" + this.helpCenterArticles + ", title=" + this.title + ')';
    }

    /* compiled from: HelpCenterCollectionContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelpCenterSection> serializer() {
            return HelpCenterSection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HelpCenterSection(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.helpCenterArticles = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterSection self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.helpCenterArticles, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, kSerializerArr[0], self.helpCenterArticles);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.title, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 1, self.title);
    }

    public HelpCenterSection(List<HelpCenterArticle> helpCenterArticles, String title) {
        Intrinsics.checkNotNullParameter(helpCenterArticles, "helpCenterArticles");
        Intrinsics.checkNotNullParameter(title, "title");
        this.helpCenterArticles = helpCenterArticles;
        this.title = title;
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public /* synthetic */ HelpCenterSection(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str);
    }

    public final String getTitle() {
        return this.title;
    }
}

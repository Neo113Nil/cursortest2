package com.usercentrics.sdk.models.settings;

import com.google.common.net.HttpHeaders;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
import com.usercentrics.tcf.core.model.gvl.RetentionPeriod;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PredefinedUIDataTV.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry;", "", "()V", k.M, HttpHeaders.LINK, "Text", "TitleContent", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$Link;", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$Text;", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$TitleContent;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PredefinedTVSecondLayerDetailsEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ PredefinedTVSecondLayerDetailsEntry(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PredefinedUIDataTV.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0002\b\bJ\u001b\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0000¢\u0006\u0002\b\nJ/\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$Companion;", "", "()V", "mapContent", "", "list", "", "introduction", "mapContent$usercentrics_release", "mapContentIllustrations", "mapContentIllustrations$usercentrics_release", "mapPurposesWithRetention", "idAndNameList", "", "Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;", "retentionPeriod", "Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;", "label", "mapPurposesWithRetention$usercentrics_release", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ String mapPurposesWithRetention$usercentrics_release$default(Companion companion, List list, RetentionPeriod retentionPeriod, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                retentionPeriod = null;
            }
            return companion.mapPurposesWithRetention$usercentrics_release(list, retentionPeriod, str);
        }

        public final String mapPurposesWithRetention$usercentrics_release(List<IdAndName> idAndNameList, final RetentionPeriod retentionPeriod, final String label) {
            Intrinsics.checkNotNullParameter(idAndNameList, "idAndNameList");
            Intrinsics.checkNotNullParameter(label, "label");
            return CollectionsKt.joinToString$default(idAndNameList, null, null, ".", 0, null, new Function1<IdAndName, CharSequence>() { // from class: com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerDetailsEntry$Companion$mapPurposesWithRetention$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(IdAndName idAndName) {
                    Map<Integer, Integer> idAndPeriod;
                    Intrinsics.checkNotNullParameter(idAndName, "idAndName");
                    RetentionPeriod retentionPeriod2 = RetentionPeriod.this;
                    Integer num = (retentionPeriod2 == null || (idAndPeriod = retentionPeriod2.getIdAndPeriod()) == null) ? null : idAndPeriod.get(Integer.valueOf(idAndName.getId()));
                    if (num != null) {
                        return StringsKt.trim((CharSequence) idAndName.getName()).toString() + " (" + label + ": " + num + ")";
                    }
                    return StringsKt.trim((CharSequence) idAndName.getName()).toString();
                }
            }, 27, null);
        }

        public static /* synthetic */ String mapContent$usercentrics_release$default(Companion companion, Iterable iterable, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.mapContent$usercentrics_release(iterable, str);
        }

        public final String mapContent$usercentrics_release(Iterable<String> list, String introduction) {
            Intrinsics.checkNotNullParameter(list, "list");
            if (introduction == null) {
                return CollectionsKt.joinToString$default(list, null, null, ".", 0, null, null, 59, null);
            }
            return introduction + "\n\n" + CollectionsKt.joinToString$default(list, null, null, ".", 0, null, null, 59, null);
        }

        public final String mapContentIllustrations$usercentrics_release(Iterable<String> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            return CollectionsKt.joinToString$default(list, "\n\n", null, null, 0, null, new Function1<String, CharSequence>() { // from class: com.usercentrics.sdk.models.settings.PredefinedTVSecondLayerDetailsEntry$Companion$mapContentIllustrations$1
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(String illustration) {
                    Intrinsics.checkNotNullParameter(illustration, "illustration");
                    return "• " + illustration;
                }
            }, 30, null);
        }
    }

    private PredefinedTVSecondLayerDetailsEntry() {
    }

    /* compiled from: PredefinedUIDataTV.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$TitleContent;", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry;", "title", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TitleContent extends PredefinedTVSecondLayerDetailsEntry {
        private final String content;
        private final String title;

        public static /* synthetic */ TitleContent copy$default(TitleContent titleContent, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = titleContent.title;
            }
            if ((i & 2) != 0) {
                str2 = titleContent.content;
            }
            return titleContent.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final TitleContent copy(String title, String content) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            return new TitleContent(title, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TitleContent)) {
                return false;
            }
            TitleContent titleContent = (TitleContent) other;
            return Intrinsics.areEqual(this.title, titleContent.title) && Intrinsics.areEqual(this.content, titleContent.content);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.content.hashCode();
        }

        public String toString() {
            return "TitleContent(title=" + this.title + ", content=" + this.content + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getContent() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleContent(String title, String content) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(content, "content");
            this.title = title;
            this.content = content;
        }
    }

    /* compiled from: PredefinedUIDataTV.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$Text;", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Text extends PredefinedTVSecondLayerDetailsEntry {
        private final String text;

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Text copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Text(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Text(text=" + this.text + ")";
        }

        public final String getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }
    }

    /* compiled from: PredefinedUIDataTV.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry$Link;", "Lcom/usercentrics/sdk/models/settings/PredefinedTVSecondLayerDetailsEntry;", "title", "", "linkLabel", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLinkLabel", "()Ljava/lang/String;", "getTitle", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Link extends PredefinedTVSecondLayerDetailsEntry {
        private final String linkLabel;
        private final String title;
        private final String url;

        public static /* synthetic */ Link copy$default(Link link, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = link.title;
            }
            if ((i & 2) != 0) {
                str2 = link.linkLabel;
            }
            if ((i & 4) != 0) {
                str3 = link.url;
            }
            return link.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLinkLabel() {
            return this.linkLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Link copy(String title, String linkLabel, String url) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(linkLabel, "linkLabel");
            Intrinsics.checkNotNullParameter(url, "url");
            return new Link(title, linkLabel, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Link)) {
                return false;
            }
            Link link = (Link) other;
            return Intrinsics.areEqual(this.title, link.title) && Intrinsics.areEqual(this.linkLabel, link.linkLabel) && Intrinsics.areEqual(this.url, link.url);
        }

        public int hashCode() {
            return (((this.title.hashCode() * 31) + this.linkLabel.hashCode()) * 31) + this.url.hashCode();
        }

        public String toString() {
            return "Link(title=" + this.title + ", linkLabel=" + this.linkLabel + ", url=" + this.url + ")";
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getLinkLabel() {
            return this.linkLabel;
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(String title, String linkLabel, String url) {
            super(null);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(linkLabel, "linkLabel");
            Intrinsics.checkNotNullParameter(url, "url");
            this.title = title;
            this.linkLabel = linkLabel;
            this.url = url;
        }
    }
}

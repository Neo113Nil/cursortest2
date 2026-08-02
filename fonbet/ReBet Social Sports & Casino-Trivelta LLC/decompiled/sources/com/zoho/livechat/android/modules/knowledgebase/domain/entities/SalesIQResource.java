package com.zoho.livechat.android.modules.knowledgebase.domain.entities;

import androidx.annotation.Keep;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import jf.EnumC5132a;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource;", "", "<init>", "()V", "a", "Data", com.google.crypto.tink.integration.android.b.f37029b, "c", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$a;", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$b;", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$c;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SalesIQResource {

    @Keep
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0005[\\]^_B½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ\u0012\u00103\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b7\u0010&Jâ\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001fJ\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010>HÖ\u0003¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010B\u001a\u0004\bF\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bG\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bH\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bO\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bR\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bS\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u00101R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010B\u001a\u0004\bV\u0010\u001fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u00104R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010P\u001a\u0004\bY\u0010-R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010P\u001a\u0004\bZ\u0010-R\u001a\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010I\u001a\u0004\b\u001b\u0010&¨\u0006`"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource;", "", StackTraceHelper.ID_KEY, "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Category;", "category", "type", "title", "departmentId", "", ViewProps.ENABLED, "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Language;", "language", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;", "creator", "modifier", "", "createdTime", "modifiedTime", "publicUrl", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Stats;", "stats", "content", "Ljf/a;", "ratedType", "lastViewedTime", "recentlyViewedTimeFromSearch", "isRelatedArticle", "<init>", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Category;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Language;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Stats;Ljava/lang/String;Ljf/a;Ljava/lang/Long;Ljava/lang/Long;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Category;", "component3", "component4", "component5", "component6", "()Z", "component7", "()Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Language;", "component8", "()Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;", "component9", "component10", "()Ljava/lang/Long;", "component11", "component12", "component13", "()Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Stats;", "component14", "component15", "()Ljf/a;", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Category;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Language;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Stats;Ljava/lang/String;Ljf/a;Ljava/lang/Long;Ljava/lang/Long;Z)Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Category;", "getCategory", "getType", "getTitle", "getDepartmentId", "Z", "getEnabled", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Language;", "getLanguage", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;", "getCreator", "getModifier", "Ljava/lang/Long;", "getCreatedTime", "getModifiedTime", "getPublicUrl", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Stats;", "getStats", "getContent", "Ljf/a;", "getRatedType", "getLastViewedTime", "getRecentlyViewedTimeFromSearch", "Category", "Language", "Stats", "Title", "User", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data extends SalesIQResource {

        @Gb.c("category")
        @Nullable
        private final Category category;

        @Gb.c("content")
        @Nullable
        private final String content;

        @Gb.c("created_time")
        @Nullable
        private final Long createdTime;

        @Gb.c("creator")
        @Nullable
        private final User creator;

        @Gb.c("department_id")
        @Nullable
        private final String departmentId;

        @Gb.c(ViewProps.ENABLED)
        private final boolean enabled;

        @Gb.c(StackTraceHelper.ID_KEY)
        @NotNull
        private final String id;

        @Gb.c("is_related_articles")
        private final boolean isRelatedArticle;

        @Gb.c("language")
        @Nullable
        private final Language language;

        @Gb.c("last_viewed_time")
        @Nullable
        private final Long lastViewedTime;

        @Gb.c("modified_time")
        @Nullable
        private final Long modifiedTime;

        @Gb.c("modifier")
        @Nullable
        private final User modifier;

        @Gb.c("public_url")
        @Nullable
        private final String publicUrl;

        @Gb.c("rated_type")
        @Nullable
        private final EnumC5132a ratedType;

        @Gb.c("recently_viewed_time_from_search")
        @Nullable
        private final Long recentlyViewedTimeFromSearch;

        @Gb.c("stats")
        @Nullable
        private final Stats stats;

        @Gb.c("title")
        @Nullable
        private final String title;

        @Gb.c("type")
        @Nullable
        private final String type;

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Category;", "", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Category {

            @Gb.c(StackTraceHelper.ID_KEY)
            @Nullable
            private final String id;

            @Gb.c("name")
            @Nullable
            private final String name;

            public Category(@Nullable String str, @Nullable String str2) {
                this.id = str;
                this.name = str2;
            }

            public static /* synthetic */ Category copy$default(Category category, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = category.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = category.name;
                }
                return category.copy(str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @NotNull
            public final Category copy(@Nullable String id2, @Nullable String name) {
                return new Category(id2, name);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Category)) {
                    return false;
                }
                Category category = (Category) other;
                return Intrinsics.areEqual(this.id, category.id) && Intrinsics.areEqual(this.name, category.name);
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            public int hashCode() {
                String str = this.id;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.name;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Category(id=" + this.id + ", name=" + this.name + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Language;", "", EventKeys.ERROR_CODE, "", StackTraceHelper.ID_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Language {

            @Gb.c(EventKeys.ERROR_CODE)
            @Nullable
            private final String code;

            @Gb.c(StackTraceHelper.ID_KEY)
            @Nullable
            private final String id;

            public Language(@Nullable String str, @Nullable String str2) {
                this.code = str;
                this.id = str2;
            }

            public static /* synthetic */ Language copy$default(Language language, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = language.code;
                }
                if ((i10 & 2) != 0) {
                    str2 = language.id;
                }
                return language.copy(str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final Language copy(@Nullable String code, @Nullable String id2) {
                return new Language(code, id2);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Language)) {
                    return false;
                }
                Language language = (Language) other;
                return Intrinsics.areEqual(this.code, language.code) && Intrinsics.areEqual(this.id, language.id);
            }

            @Nullable
            public final String getCode() {
                return this.code;
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                String str = this.code;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.id;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Language(code=" + this.code + ", id=" + this.id + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Stats;", "", "disliked", "", "liked", "used", "viewed", "(IIII)V", "getDisliked", "()I", "getLiked", "getUsed", "getViewed", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Stats {

            @Gb.c("disliked")
            private final int disliked;

            @Gb.c("liked")
            private final int liked;

            @Gb.c("used")
            private final int used;

            @Gb.c("viewed")
            private final int viewed;

            public Stats() {
                this(0, 0, 0, 0, 15, null);
            }

            public static /* synthetic */ Stats copy$default(Stats stats, int i10, int i11, int i12, int i13, int i14, Object obj) {
                if ((i14 & 1) != 0) {
                    i10 = stats.disliked;
                }
                if ((i14 & 2) != 0) {
                    i11 = stats.liked;
                }
                if ((i14 & 4) != 0) {
                    i12 = stats.used;
                }
                if ((i14 & 8) != 0) {
                    i13 = stats.viewed;
                }
                return stats.copy(i10, i11, i12, i13);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDisliked() {
                return this.disliked;
            }

            /* renamed from: component2, reason: from getter */
            public final int getLiked() {
                return this.liked;
            }

            /* renamed from: component3, reason: from getter */
            public final int getUsed() {
                return this.used;
            }

            /* renamed from: component4, reason: from getter */
            public final int getViewed() {
                return this.viewed;
            }

            @NotNull
            public final Stats copy(int disliked, int liked, int used, int viewed) {
                return new Stats(disliked, liked, used, viewed);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Stats)) {
                    return false;
                }
                Stats stats = (Stats) other;
                return this.disliked == stats.disliked && this.liked == stats.liked && this.used == stats.used && this.viewed == stats.viewed;
            }

            public final int getDisliked() {
                return this.disliked;
            }

            public final int getLiked() {
                return this.liked;
            }

            public final int getUsed() {
                return this.used;
            }

            public final int getViewed() {
                return this.viewed;
            }

            public int hashCode() {
                return (((((Integer.hashCode(this.disliked) * 31) + Integer.hashCode(this.liked)) * 31) + Integer.hashCode(this.used)) * 31) + Integer.hashCode(this.viewed);
            }

            @NotNull
            public String toString() {
                return "Stats(disliked=" + this.disliked + ", liked=" + this.liked + ", used=" + this.used + ", viewed=" + this.viewed + ')';
            }

            public Stats(int i10, int i11, int i12, int i13) {
                this.disliked = i10;
                this.liked = i11;
                this.used = i12;
                this.viewed = i13;
            }

            public /* synthetic */ Stats(int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
                this((i14 & 1) != 0 ? -1 : i10, (i14 & 2) != 0 ? -1 : i11, (i14 & 4) != 0 ? -1 : i12, (i14 & 8) != 0 ? -1 : i13);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Title;", "", Constants.COLLATION_DEFAULT, "", "title", "", "titleId", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTitle", "()Ljava/lang/String;", "getTitleId", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$Title;", "equals", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Title {

            @Gb.c(Constants.COLLATION_DEFAULT)
            @Nullable
            private final Boolean default;

            @Gb.c("title")
            @Nullable
            private final String title;

            @Gb.c("titleId")
            @Nullable
            private final String titleId;

            public Title(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
                this.default = bool;
                this.title = str;
                this.titleId = str2;
            }

            public static /* synthetic */ Title copy$default(Title title, Boolean bool, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    bool = title.default;
                }
                if ((i10 & 2) != 0) {
                    str = title.title;
                }
                if ((i10 & 4) != 0) {
                    str2 = title.titleId;
                }
                return title.copy(bool, str, str2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Boolean getDefault() {
                return this.default;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getTitleId() {
                return this.titleId;
            }

            @NotNull
            public final Title copy(@Nullable Boolean r22, @Nullable String title, @Nullable String titleId) {
                return new Title(r22, title, titleId);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Title)) {
                    return false;
                }
                Title title = (Title) other;
                return Intrinsics.areEqual(this.default, title.default) && Intrinsics.areEqual(this.title, title.title) && Intrinsics.areEqual(this.titleId, title.titleId);
            }

            @Nullable
            public final Boolean getDefault() {
                return this.default;
            }

            @Nullable
            public final String getTitle() {
                return this.title;
            }

            @Nullable
            public final String getTitleId() {
                return this.titleId;
            }

            public int hashCode() {
                Boolean bool = this.default;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                String str = this.title;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.titleId;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Title(default=" + this.default + ", title=" + this.title + ", titleId=" + this.titleId + ')';
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data$User;", "", "displayName", "", "email", StackTraceHelper.ID_KEY, "imageUrl", "name", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getEmail", "getId", "getImageUrl", "getName", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class User {

            @Gb.c("display_name")
            @Nullable
            private final String displayName;

            @Gb.c("email")
            @Nullable
            private final String email;

            @Gb.c(StackTraceHelper.ID_KEY)
            @NotNull
            private final String id;

            @Gb.c("image_url")
            @Nullable
            private final String imageUrl;

            @Gb.c("name")
            @Nullable
            private final String name;

            @Gb.c("type")
            @Nullable
            private final String type;

            public User(@Nullable String str, @Nullable String str2, @NotNull String id2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                Intrinsics.checkNotNullParameter(id2, "id");
                this.displayName = str;
                this.email = str2;
                this.id = id2;
                this.imageUrl = str3;
                this.name = str4;
                this.type = str5;
            }

            public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = user.displayName;
                }
                if ((i10 & 2) != 0) {
                    str2 = user.email;
                }
                if ((i10 & 4) != 0) {
                    str3 = user.id;
                }
                if ((i10 & 8) != 0) {
                    str4 = user.imageUrl;
                }
                if ((i10 & 16) != 0) {
                    str5 = user.name;
                }
                if ((i10 & 32) != 0) {
                    str6 = user.type;
                }
                String str7 = str5;
                String str8 = str6;
                return user.copy(str, str2, str3, str4, str7, str8);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @NotNull
            public final User copy(@Nullable String displayName, @Nullable String email, @NotNull String id2, @Nullable String imageUrl, @Nullable String name, @Nullable String type) {
                Intrinsics.checkNotNullParameter(id2, "id");
                return new User(displayName, email, id2, imageUrl, name, type);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof User)) {
                    return false;
                }
                User user = (User) other;
                return Intrinsics.areEqual(this.displayName, user.displayName) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.imageUrl, user.imageUrl) && Intrinsics.areEqual(this.name, user.name) && Intrinsics.areEqual(this.type, user.type);
            }

            @Nullable
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getImageUrl() {
                return this.imageUrl;
            }

            @Nullable
            public final String getName() {
                return this.name;
            }

            @Nullable
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.displayName;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.email;
                int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.id.hashCode()) * 31;
                String str3 = this.imageUrl;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.name;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.type;
                return hashCode4 + (str5 != null ? str5.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "User(displayName=" + this.displayName + ", email=" + this.email + ", id=" + this.id + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", type=" + this.type + ')';
            }
        }

        public /* synthetic */ Data(String str, Category category, String str2, String str3, String str4, boolean z10, Language language, User user, User user2, Long l10, Long l11, String str5, Stats stats, String str6, EnumC5132a enumC5132a, Long l12, Long l13, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, category, str2, str3, str4, (i10 & 32) != 0 ? false : z10, language, user, user2, l10, l11, str5, stats, str6, enumC5132a, (i10 & 32768) != 0 ? null : l12, (i10 & PKIFailureInfo.notAuthorized) != 0 ? null : l13, (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? false : z11);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, Category category, String str2, String str3, String str4, boolean z10, Language language, User user, User user2, Long l10, Long l11, String str5, Stats stats, String str6, EnumC5132a enumC5132a, Long l12, Long l13, boolean z11, int i10, Object obj) {
            boolean z12;
            Long l14;
            String str7 = (i10 & 1) != 0 ? data.id : str;
            Category category2 = (i10 & 2) != 0 ? data.category : category;
            String str8 = (i10 & 4) != 0 ? data.type : str2;
            String str9 = (i10 & 8) != 0 ? data.title : str3;
            String str10 = (i10 & 16) != 0 ? data.departmentId : str4;
            boolean z13 = (i10 & 32) != 0 ? data.enabled : z10;
            Language language2 = (i10 & 64) != 0 ? data.language : language;
            User user3 = (i10 & 128) != 0 ? data.creator : user;
            User user4 = (i10 & 256) != 0 ? data.modifier : user2;
            Long l15 = (i10 & 512) != 0 ? data.createdTime : l10;
            Long l16 = (i10 & 1024) != 0 ? data.modifiedTime : l11;
            String str11 = (i10 & 2048) != 0 ? data.publicUrl : str5;
            Stats stats2 = (i10 & 4096) != 0 ? data.stats : stats;
            String str12 = (i10 & 8192) != 0 ? data.content : str6;
            String str13 = str7;
            EnumC5132a enumC5132a2 = (i10 & 16384) != 0 ? data.ratedType : enumC5132a;
            Long l17 = (i10 & 32768) != 0 ? data.lastViewedTime : l12;
            Long l18 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? data.recentlyViewedTimeFromSearch : l13;
            if ((i10 & PKIFailureInfo.unsupportedVersion) != 0) {
                l14 = l18;
                z12 = data.isRelatedArticle;
            } else {
                z12 = z11;
                l14 = l18;
            }
            return data.copy(str13, category2, str8, str9, str10, z13, language2, user3, user4, l15, l16, str11, stats2, str12, enumC5132a2, l17, l14, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component10, reason: from getter */
        public final Long getCreatedTime() {
            return this.createdTime;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final Long getModifiedTime() {
            return this.modifiedTime;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final String getPublicUrl() {
            return this.publicUrl;
        }

        @Nullable
        /* renamed from: component13, reason: from getter */
        public final Stats getStats() {
            return this.stats;
        }

        @Nullable
        /* renamed from: component14, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* renamed from: component15, reason: from getter */
        public final EnumC5132a getRatedType() {
            return this.ratedType;
        }

        @Nullable
        /* renamed from: component16, reason: from getter */
        public final Long getLastViewedTime() {
            return this.lastViewedTime;
        }

        @Nullable
        /* renamed from: component17, reason: from getter */
        public final Long getRecentlyViewedTimeFromSearch() {
            return this.recentlyViewedTimeFromSearch;
        }

        /* renamed from: component18, reason: from getter */
        public final boolean getIsRelatedArticle() {
            return this.isRelatedArticle;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Category getCategory() {
            return this.category;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getDepartmentId() {
            return this.departmentId;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Language getLanguage() {
            return this.language;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final User getCreator() {
            return this.creator;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final User getModifier() {
            return this.modifier;
        }

        @NotNull
        public final Data copy(@NotNull String id2, @Nullable Category category, @Nullable String type, @Nullable String title, @Nullable String departmentId, boolean enabled, @Nullable Language language, @Nullable User creator, @Nullable User modifier, @Nullable Long createdTime, @Nullable Long modifiedTime, @Nullable String publicUrl, @Nullable Stats stats, @Nullable String content, @Nullable EnumC5132a ratedType, @Nullable Long lastViewedTime, @Nullable Long recentlyViewedTimeFromSearch, boolean isRelatedArticle) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new Data(id2, category, type, title, departmentId, enabled, language, creator, modifier, createdTime, modifiedTime, publicUrl, stats, content, ratedType, lastViewedTime, recentlyViewedTimeFromSearch, isRelatedArticle);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.id, data.id) && Intrinsics.areEqual(this.category, data.category) && Intrinsics.areEqual(this.type, data.type) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.departmentId, data.departmentId) && this.enabled == data.enabled && Intrinsics.areEqual(this.language, data.language) && Intrinsics.areEqual(this.creator, data.creator) && Intrinsics.areEqual(this.modifier, data.modifier) && Intrinsics.areEqual(this.createdTime, data.createdTime) && Intrinsics.areEqual(this.modifiedTime, data.modifiedTime) && Intrinsics.areEqual(this.publicUrl, data.publicUrl) && Intrinsics.areEqual(this.stats, data.stats) && Intrinsics.areEqual(this.content, data.content) && this.ratedType == data.ratedType && Intrinsics.areEqual(this.lastViewedTime, data.lastViewedTime) && Intrinsics.areEqual(this.recentlyViewedTimeFromSearch, data.recentlyViewedTimeFromSearch) && this.isRelatedArticle == data.isRelatedArticle;
        }

        @Nullable
        public final Category getCategory() {
            return this.category;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final Long getCreatedTime() {
            return this.createdTime;
        }

        @Nullable
        public final User getCreator() {
            return this.creator;
        }

        @Nullable
        public final String getDepartmentId() {
            return this.departmentId;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final Language getLanguage() {
            return this.language;
        }

        @Nullable
        public final Long getLastViewedTime() {
            return this.lastViewedTime;
        }

        @Nullable
        public final Long getModifiedTime() {
            return this.modifiedTime;
        }

        @Nullable
        public final User getModifier() {
            return this.modifier;
        }

        @Nullable
        public final String getPublicUrl() {
            return this.publicUrl;
        }

        @Nullable
        public final EnumC5132a getRatedType() {
            return this.ratedType;
        }

        @Nullable
        public final Long getRecentlyViewedTimeFromSearch() {
            return this.recentlyViewedTimeFromSearch;
        }

        @Nullable
        public final Stats getStats() {
            return this.stats;
        }

        @Nullable
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            Category category = this.category;
            int hashCode2 = (hashCode + (category == null ? 0 : category.hashCode())) * 31;
            String str = this.type;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.departmentId;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            boolean z10 = this.enabled;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (hashCode5 + i10) * 31;
            Language language = this.language;
            int hashCode6 = (i11 + (language == null ? 0 : language.hashCode())) * 31;
            User user = this.creator;
            int hashCode7 = (hashCode6 + (user == null ? 0 : user.hashCode())) * 31;
            User user2 = this.modifier;
            int hashCode8 = (hashCode7 + (user2 == null ? 0 : user2.hashCode())) * 31;
            Long l10 = this.createdTime;
            int hashCode9 = (hashCode8 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.modifiedTime;
            int hashCode10 = (hashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str4 = this.publicUrl;
            int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Stats stats = this.stats;
            int hashCode12 = (hashCode11 + (stats == null ? 0 : stats.hashCode())) * 31;
            String str5 = this.content;
            int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            EnumC5132a enumC5132a = this.ratedType;
            int hashCode14 = (hashCode13 + (enumC5132a == null ? 0 : enumC5132a.hashCode())) * 31;
            Long l12 = this.lastViewedTime;
            int hashCode15 = (hashCode14 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.recentlyViewedTimeFromSearch;
            int hashCode16 = (hashCode15 + (l13 != null ? l13.hashCode() : 0)) * 31;
            boolean z11 = this.isRelatedArticle;
            return hashCode16 + (z11 ? 1 : z11 ? 1 : 0);
        }

        public final boolean isRelatedArticle() {
            return this.isRelatedArticle;
        }

        @NotNull
        public String toString() {
            return "Data(id=" + this.id + ", category=" + this.category + ", type=" + this.type + ", title=" + this.title + ", departmentId=" + this.departmentId + ", enabled=" + this.enabled + ", language=" + this.language + ", creator=" + this.creator + ", modifier=" + this.modifier + ", createdTime=" + this.createdTime + ", modifiedTime=" + this.modifiedTime + ", publicUrl=" + this.publicUrl + ", stats=" + this.stats + ", content=" + this.content + ", ratedType=" + this.ratedType + ", lastViewedTime=" + this.lastViewedTime + ", recentlyViewedTimeFromSearch=" + this.recentlyViewedTimeFromSearch + ", isRelatedArticle=" + this.isRelatedArticle + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Data(@NotNull String id2, @Nullable Category category, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, @Nullable Language language, @Nullable User user, @Nullable User user2, @Nullable Long l10, @Nullable Long l11, @Nullable String str4, @Nullable Stats stats, @Nullable String str5, @Nullable EnumC5132a enumC5132a, @Nullable Long l12, @Nullable Long l13, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            this.category = category;
            this.type = str;
            this.title = str2;
            this.departmentId = str3;
            this.enabled = z10;
            this.language = language;
            this.creator = user;
            this.modifier = user2;
            this.createdTime = l10;
            this.modifiedTime = l11;
            this.publicUrl = str4;
            this.stats = stats;
            this.content = str5;
            this.ratedType = enumC5132a;
            this.lastViewedTime = l12;
            this.recentlyViewedTimeFromSearch = l13;
            this.isRelatedArticle = z11;
        }
    }

    public static final class a extends SalesIQResource {

        /* renamed from: a, reason: collision with root package name */
        public final String f43537a;

        /* renamed from: b, reason: collision with root package name */
        public final int f43538b;

        /* renamed from: c, reason: collision with root package name */
        public final int f43539c;

        /* renamed from: d, reason: collision with root package name */
        public final String f43540d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f43541e;

        /* renamed from: f, reason: collision with root package name */
        public final int f43542f;

        /* renamed from: g, reason: collision with root package name */
        public final String f43543g;

        /* renamed from: h, reason: collision with root package name */
        public final String f43544h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2, int i10, int i11, String str, boolean z10, int i12, String str2, String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f43537a = id2;
            this.f43538b = i10;
            this.f43539c = i11;
            this.f43540d = str;
            this.f43541e = z10;
            this.f43542f = i12;
            this.f43543g = str2;
            this.f43544h = str3;
        }

        public final int a() {
            return this.f43538b;
        }

        public final int b() {
            return this.f43539c;
        }

        public final String c() {
            return this.f43544h;
        }

        public final String getId() {
            return this.f43537a;
        }
    }

    public static final class b extends SalesIQResource {

        /* renamed from: a, reason: collision with root package name */
        public final String f43545a;

        /* renamed from: b, reason: collision with root package name */
        public final String f43546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id2, String name) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f43545a = id2;
            this.f43546b = name;
        }

        public final String a() {
            return this.f43546b;
        }

        public final String getId() {
            return this.f43545a;
        }
    }

    public static final class c extends SalesIQResource {

        /* renamed from: a, reason: collision with root package name */
        public final a f43547a;

        /* renamed from: b, reason: collision with root package name */
        public final b f43548b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f43549c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a Article = new a("Article", 0);
            public static final a FAQ = new a("FAQ", 1);

            private static final /* synthetic */ a[] $values() {
                return new a[]{Article, FAQ};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private a(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class b {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b Resource = new b("Resource", 0);
            public static final b Category = new b("Category", 1);
            public static final b Department = new b("Department", 2);
            public static final b Related = new b("Related", 3);
            public static final b RecentlyViewed = new b("RecentlyViewed", 4);
            public static final b RecentlyViewedFromSearch = new b("RecentlyViewedFromSearch", 5);

            private static final /* synthetic */ b[] $values() {
                return new b[]{Resource, Category, Department, Related, RecentlyViewed, RecentlyViewedFromSearch};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private b(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public /* synthetic */ c(a aVar, b bVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, bVar, (i10 & 4) != 0 ? false : z10);
        }

        public final a a() {
            return this.f43547a;
        }

        public final b b() {
            return this.f43548b;
        }

        public final boolean c() {
            return this.f43549c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a resource, b type, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f43547a = resource;
            this.f43548b = type;
            this.f43549c = z10;
        }
    }

    public /* synthetic */ SalesIQResource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SalesIQResource() {
    }
}

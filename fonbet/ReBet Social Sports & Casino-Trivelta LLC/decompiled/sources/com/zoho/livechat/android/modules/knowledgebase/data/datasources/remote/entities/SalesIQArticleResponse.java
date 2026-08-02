package com.zoho.livechat.android.modules.knowledgebase.data.datasources.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.google.gson.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001bJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001bJà\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\t2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b?\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010\"R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bD\u0010\u001eR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bE\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bF\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bG\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010*R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bJ\u0010*R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\bK\u0010\u001bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\bL\u0010\u001bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\bM\u0010\u001eR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\bN\u0010\u001b¨\u0006O"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/SalesIQArticleResponse;", "", "", StackTraceHelper.ID_KEY, "title", "Lcom/google/gson/h;", "titles", "type", "category", "", ViewProps.ENABLED, "", "channels", "creator", "modifier", "departmentId", "language", "", "createdTime", "modifiedTime", "publicUrl", "publishedTitle", "stats", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/Boolean;Ljava/util/List;Lcom/google/gson/h;Lcom/google/gson/h;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/google/gson/h;", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "component12", "()Ljava/lang/Long;", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/Boolean;Ljava/util/List;Lcom/google/gson/h;Lcom/google/gson/h;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/remote/entities/SalesIQArticleResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/google/gson/h;", "getTitles", "getType", "getCategory", "Ljava/lang/Boolean;", "getEnabled", "Ljava/util/List;", "getChannels", "getCreator", "getModifier", "getDepartmentId", "getLanguage", "Ljava/lang/Long;", "getCreatedTime", "getModifiedTime", "getPublicUrl", "getPublishedTitle", "getStats", "getContent", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SalesIQArticleResponse {

    @c("category")
    @Nullable
    private final h category;

    @c("channels")
    @Nullable
    private final List<String> channels;

    @c("content")
    @Nullable
    private final String content;

    @c("created_time")
    @Nullable
    private final Long createdTime;

    @c("creator")
    @Nullable
    private final h creator;

    @c("department_id")
    @Nullable
    private final String departmentId;

    @c(ViewProps.ENABLED)
    @Nullable
    private final Boolean enabled;

    @c(StackTraceHelper.ID_KEY)
    @NotNull
    private final String id;

    @c("language")
    @Nullable
    private final h language;

    @c("modified_time")
    @Nullable
    private final Long modifiedTime;

    @c("modifier")
    @Nullable
    private final h modifier;

    @c("public_url")
    @Nullable
    private final String publicUrl;

    @c("published_title")
    @Nullable
    private final String publishedTitle;

    @c("stats")
    @Nullable
    private final h stats;

    @c("title")
    @Nullable
    private final String title;

    @c("titles")
    @Nullable
    private final h titles;

    @c("type")
    @Nullable
    private final String type;

    public SalesIQArticleResponse(@NotNull String id2, @Nullable String str, @Nullable h hVar, @Nullable String str2, @Nullable h hVar2, @Nullable Boolean bool, @Nullable List<String> list, @Nullable h hVar3, @Nullable h hVar4, @Nullable String str3, @Nullable h hVar5, @Nullable Long l10, @Nullable Long l11, @Nullable String str4, @Nullable String str5, @Nullable h hVar6, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.title = str;
        this.titles = hVar;
        this.type = str2;
        this.category = hVar2;
        this.enabled = bool;
        this.channels = list;
        this.creator = hVar3;
        this.modifier = hVar4;
        this.departmentId = str3;
        this.language = hVar5;
        this.createdTime = l10;
        this.modifiedTime = l11;
        this.publicUrl = str4;
        this.publishedTitle = str5;
        this.stats = hVar6;
        this.content = str6;
    }

    public static /* synthetic */ SalesIQArticleResponse copy$default(SalesIQArticleResponse salesIQArticleResponse, String str, String str2, h hVar, String str3, h hVar2, Boolean bool, List list, h hVar3, h hVar4, String str4, h hVar5, Long l10, Long l11, String str5, String str6, h hVar6, String str7, int i10, Object obj) {
        String str8;
        h hVar7;
        String str9;
        SalesIQArticleResponse salesIQArticleResponse2;
        String str10;
        String str11;
        h hVar8;
        String str12;
        h hVar9;
        Boolean bool2;
        List list2;
        h hVar10;
        h hVar11;
        String str13;
        h hVar12;
        Long l12;
        Long l13;
        String str14;
        String str15 = (i10 & 1) != 0 ? salesIQArticleResponse.id : str;
        String str16 = (i10 & 2) != 0 ? salesIQArticleResponse.title : str2;
        h hVar13 = (i10 & 4) != 0 ? salesIQArticleResponse.titles : hVar;
        String str17 = (i10 & 8) != 0 ? salesIQArticleResponse.type : str3;
        h hVar14 = (i10 & 16) != 0 ? salesIQArticleResponse.category : hVar2;
        Boolean bool3 = (i10 & 32) != 0 ? salesIQArticleResponse.enabled : bool;
        List list3 = (i10 & 64) != 0 ? salesIQArticleResponse.channels : list;
        h hVar15 = (i10 & 128) != 0 ? salesIQArticleResponse.creator : hVar3;
        h hVar16 = (i10 & 256) != 0 ? salesIQArticleResponse.modifier : hVar4;
        String str18 = (i10 & 512) != 0 ? salesIQArticleResponse.departmentId : str4;
        h hVar17 = (i10 & 1024) != 0 ? salesIQArticleResponse.language : hVar5;
        Long l14 = (i10 & 2048) != 0 ? salesIQArticleResponse.createdTime : l10;
        Long l15 = (i10 & 4096) != 0 ? salesIQArticleResponse.modifiedTime : l11;
        String str19 = (i10 & 8192) != 0 ? salesIQArticleResponse.publicUrl : str5;
        String str20 = str15;
        String str21 = (i10 & 16384) != 0 ? salesIQArticleResponse.publishedTitle : str6;
        h hVar18 = (i10 & 32768) != 0 ? salesIQArticleResponse.stats : hVar6;
        if ((i10 & PKIFailureInfo.notAuthorized) != 0) {
            hVar7 = hVar18;
            str8 = salesIQArticleResponse.content;
            str10 = str21;
            str11 = str16;
            hVar8 = hVar13;
            str12 = str17;
            hVar9 = hVar14;
            bool2 = bool3;
            list2 = list3;
            hVar10 = hVar15;
            hVar11 = hVar16;
            str13 = str18;
            hVar12 = hVar17;
            l12 = l14;
            l13 = l15;
            str14 = str19;
            str9 = str20;
            salesIQArticleResponse2 = salesIQArticleResponse;
        } else {
            str8 = str7;
            hVar7 = hVar18;
            str9 = str20;
            salesIQArticleResponse2 = salesIQArticleResponse;
            str10 = str21;
            str11 = str16;
            hVar8 = hVar13;
            str12 = str17;
            hVar9 = hVar14;
            bool2 = bool3;
            list2 = list3;
            hVar10 = hVar15;
            hVar11 = hVar16;
            str13 = str18;
            hVar12 = hVar17;
            l12 = l14;
            l13 = l15;
            str14 = str19;
        }
        return salesIQArticleResponse2.copy(str9, str11, hVar8, str12, hVar9, bool2, list2, hVar10, hVar11, str13, hVar12, l12, l13, str14, str10, hVar7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getDepartmentId() {
        return this.departmentId;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final h getLanguage() {
        return this.language;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getModifiedTime() {
        return this.modifiedTime;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getPublicUrl() {
        return this.publicUrl;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getPublishedTitle() {
        return this.publishedTitle;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final h getStats() {
        return this.stats;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final h getTitles() {
        return this.titles;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final h getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<String> component7() {
        return this.channels;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final h getCreator() {
        return this.creator;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final h getModifier() {
        return this.modifier;
    }

    @NotNull
    public final SalesIQArticleResponse copy(@NotNull String id2, @Nullable String title, @Nullable h titles, @Nullable String type, @Nullable h category, @Nullable Boolean enabled, @Nullable List<String> channels, @Nullable h creator, @Nullable h modifier, @Nullable String departmentId, @Nullable h language, @Nullable Long createdTime, @Nullable Long modifiedTime, @Nullable String publicUrl, @Nullable String publishedTitle, @Nullable h stats, @Nullable String content) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new SalesIQArticleResponse(id2, title, titles, type, category, enabled, channels, creator, modifier, departmentId, language, createdTime, modifiedTime, publicUrl, publishedTitle, stats, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesIQArticleResponse)) {
            return false;
        }
        SalesIQArticleResponse salesIQArticleResponse = (SalesIQArticleResponse) other;
        return Intrinsics.areEqual(this.id, salesIQArticleResponse.id) && Intrinsics.areEqual(this.title, salesIQArticleResponse.title) && Intrinsics.areEqual(this.titles, salesIQArticleResponse.titles) && Intrinsics.areEqual(this.type, salesIQArticleResponse.type) && Intrinsics.areEqual(this.category, salesIQArticleResponse.category) && Intrinsics.areEqual(this.enabled, salesIQArticleResponse.enabled) && Intrinsics.areEqual(this.channels, salesIQArticleResponse.channels) && Intrinsics.areEqual(this.creator, salesIQArticleResponse.creator) && Intrinsics.areEqual(this.modifier, salesIQArticleResponse.modifier) && Intrinsics.areEqual(this.departmentId, salesIQArticleResponse.departmentId) && Intrinsics.areEqual(this.language, salesIQArticleResponse.language) && Intrinsics.areEqual(this.createdTime, salesIQArticleResponse.createdTime) && Intrinsics.areEqual(this.modifiedTime, salesIQArticleResponse.modifiedTime) && Intrinsics.areEqual(this.publicUrl, salesIQArticleResponse.publicUrl) && Intrinsics.areEqual(this.publishedTitle, salesIQArticleResponse.publishedTitle) && Intrinsics.areEqual(this.stats, salesIQArticleResponse.stats) && Intrinsics.areEqual(this.content, salesIQArticleResponse.content);
    }

    @Nullable
    public final h getCategory() {
        return this.category;
    }

    @Nullable
    public final List<String> getChannels() {
        return this.channels;
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
    public final h getCreator() {
        return this.creator;
    }

    @Nullable
    public final String getDepartmentId() {
        return this.departmentId;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final h getLanguage() {
        return this.language;
    }

    @Nullable
    public final Long getModifiedTime() {
        return this.modifiedTime;
    }

    @Nullable
    public final h getModifier() {
        return this.modifier;
    }

    @Nullable
    public final String getPublicUrl() {
        return this.publicUrl;
    }

    @Nullable
    public final String getPublishedTitle() {
        return this.publishedTitle;
    }

    @Nullable
    public final h getStats() {
        return this.stats;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final h getTitles() {
        return this.titles;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        h hVar = this.titles;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.type;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar2 = this.category;
        int hashCode5 = (hashCode4 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        Boolean bool = this.enabled;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.channels;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        h hVar3 = this.creator;
        int hashCode8 = (hashCode7 + (hVar3 == null ? 0 : hVar3.hashCode())) * 31;
        h hVar4 = this.modifier;
        int hashCode9 = (hashCode8 + (hVar4 == null ? 0 : hVar4.hashCode())) * 31;
        String str3 = this.departmentId;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h hVar5 = this.language;
        int hashCode11 = (hashCode10 + (hVar5 == null ? 0 : hVar5.hashCode())) * 31;
        Long l10 = this.createdTime;
        int hashCode12 = (hashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.modifiedTime;
        int hashCode13 = (hashCode12 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.publicUrl;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.publishedTitle;
        int hashCode15 = (hashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        h hVar6 = this.stats;
        int hashCode16 = (hashCode15 + (hVar6 == null ? 0 : hVar6.hashCode())) * 31;
        String str6 = this.content;
        return hashCode16 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SalesIQArticleResponse(id=" + this.id + ", title=" + this.title + ", titles=" + this.titles + ", type=" + this.type + ", category=" + this.category + ", enabled=" + this.enabled + ", channels=" + this.channels + ", creator=" + this.creator + ", modifier=" + this.modifier + ", departmentId=" + this.departmentId + ", language=" + this.language + ", createdTime=" + this.createdTime + ", modifiedTime=" + this.modifiedTime + ", publicUrl=" + this.publicUrl + ", publishedTitle=" + this.publishedTitle + ", stats=" + this.stats + ", content=" + this.content + ')';
    }

    public /* synthetic */ SalesIQArticleResponse(String str, String str2, h hVar, String str3, h hVar2, Boolean bool, List list, h hVar3, h hVar4, String str4, h hVar5, Long l10, Long l11, String str5, String str6, h hVar6, String str7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, hVar, str3, hVar2, (i10 & 32) != 0 ? Boolean.FALSE : bool, list, hVar3, hVar4, str4, hVar5, l10, l11, str5, str6, hVar6, str7);
    }
}

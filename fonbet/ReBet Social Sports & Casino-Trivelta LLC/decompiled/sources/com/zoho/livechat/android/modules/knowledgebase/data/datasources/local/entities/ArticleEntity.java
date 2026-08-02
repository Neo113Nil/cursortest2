package com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0001[Bé\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001fJ\u0012\u00104\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b4\u0010-J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u0010-J\u0012\u00106\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b6\u00107J\u0096\u0002\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001fJ\u0010\u0010<\u001a\u00020;HÖ\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010?\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b?\u0010@R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bD\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bE\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\bF\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bG\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bI\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bJ\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bK\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bL\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bM\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bN\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bQ\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bR\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bS\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bT\u0010\u001fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bU\u0010\u001fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bV\u0010\u001fR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\bW\u0010-R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\bX\u0010-R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010Y\u001a\u0004\bZ\u00107¨\u0006\\"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity;", "", "", StackTraceHelper.ID_KEY, "categoryId", "categoryName", "title", "titles", "type", "", ViewProps.ENABLED, "channels", "creator", "modifier", "departmentId", "language", "", "createdTime", "modifiedTime", "publicUrl", "publishedTitle", "stats", "content", "ratedType", "lastViewedTime", "recentlyViewedTimeFromSearch", "Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity$a;", "localMeta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity$a;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "component13", "()Ljava/lang/Long;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "()Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity$a;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity$a;)Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getCategoryId", "getCategoryName", "getTitle", "getTitles", "getType", "Ljava/lang/Boolean;", "getEnabled", "getChannels", "getCreator", "getModifier", "getDepartmentId", "getLanguage", "Ljava/lang/Long;", "getCreatedTime", "getModifiedTime", "getPublicUrl", "getPublishedTitle", "getStats", "getContent", "getRatedType", "getLastViewedTime", "getRecentlyViewedTimeFromSearch", "Lcom/zoho/livechat/android/modules/knowledgebase/data/datasources/local/entities/ArticleEntity$a;", "getLocalMeta", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ArticleEntity {

    @Nullable
    private final String categoryId;

    @Nullable
    private final String categoryName;

    @Nullable
    private final String channels;

    @Nullable
    private final String content;

    @Nullable
    private final Long createdTime;

    @Nullable
    private final String creator;

    @Nullable
    private final String departmentId;

    @Nullable
    private final Boolean enabled;

    @NotNull
    private final String id;

    @Nullable
    private final String language;

    @Nullable
    private final Long lastViewedTime;

    @Nullable
    private final a localMeta;

    @Nullable
    private final Long modifiedTime;

    @Nullable
    private final String modifier;

    @Nullable
    private final String publicUrl;

    @Nullable
    private final String publishedTitle;

    @Nullable
    private final String ratedType;

    @Nullable
    private final Long recentlyViewedTimeFromSearch;

    @Nullable
    private final String stats;

    @Nullable
    private final String title;

    @Nullable
    private final String titles;

    @Nullable
    private final String type;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f43529a;

        public a(String str) {
            this.f43529a = str;
        }

        public final String a() {
            return this.f43529a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f43529a, ((a) obj).f43529a);
        }

        public int hashCode() {
            String str = this.f43529a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "LocalMeta(articleLocalFilePath=" + this.f43529a + ')';
        }
    }

    public ArticleEntity(@NotNull String id2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Long l10, @Nullable Long l11, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Long l12, @Nullable Long l13, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.categoryId = str;
        this.categoryName = str2;
        this.title = str3;
        this.titles = str4;
        this.type = str5;
        this.enabled = bool;
        this.channels = str6;
        this.creator = str7;
        this.modifier = str8;
        this.departmentId = str9;
        this.language = str10;
        this.createdTime = l10;
        this.modifiedTime = l11;
        this.publicUrl = str11;
        this.publishedTitle = str12;
        this.stats = str13;
        this.content = str14;
        this.ratedType = str15;
        this.lastViewedTime = l12;
        this.recentlyViewedTimeFromSearch = l13;
        this.localMeta = aVar;
    }

    public static /* synthetic */ ArticleEntity copy$default(ArticleEntity articleEntity, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, Long l10, Long l11, String str12, String str13, String str14, String str15, String str16, Long l12, Long l13, a aVar, int i10, Object obj) {
        a aVar2;
        Long l14;
        String str17 = (i10 & 1) != 0 ? articleEntity.id : str;
        String str18 = (i10 & 2) != 0 ? articleEntity.categoryId : str2;
        String str19 = (i10 & 4) != 0 ? articleEntity.categoryName : str3;
        String str20 = (i10 & 8) != 0 ? articleEntity.title : str4;
        String str21 = (i10 & 16) != 0 ? articleEntity.titles : str5;
        String str22 = (i10 & 32) != 0 ? articleEntity.type : str6;
        Boolean bool2 = (i10 & 64) != 0 ? articleEntity.enabled : bool;
        String str23 = (i10 & 128) != 0 ? articleEntity.channels : str7;
        String str24 = (i10 & 256) != 0 ? articleEntity.creator : str8;
        String str25 = (i10 & 512) != 0 ? articleEntity.modifier : str9;
        String str26 = (i10 & 1024) != 0 ? articleEntity.departmentId : str10;
        String str27 = (i10 & 2048) != 0 ? articleEntity.language : str11;
        Long l15 = (i10 & 4096) != 0 ? articleEntity.createdTime : l10;
        Long l16 = (i10 & 8192) != 0 ? articleEntity.modifiedTime : l11;
        String str28 = str17;
        String str29 = (i10 & 16384) != 0 ? articleEntity.publicUrl : str12;
        String str30 = (i10 & 32768) != 0 ? articleEntity.publishedTitle : str13;
        String str31 = (i10 & PKIFailureInfo.notAuthorized) != 0 ? articleEntity.stats : str14;
        String str32 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? articleEntity.content : str15;
        String str33 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? articleEntity.ratedType : str16;
        Long l17 = (i10 & PKIFailureInfo.signerNotTrusted) != 0 ? articleEntity.lastViewedTime : l12;
        Long l18 = (i10 & PKIFailureInfo.badCertTemplate) != 0 ? articleEntity.recentlyViewedTimeFromSearch : l13;
        if ((i10 & PKIFailureInfo.badSenderNonce) != 0) {
            l14 = l18;
            aVar2 = articleEntity.localMeta;
        } else {
            aVar2 = aVar;
            l14 = l18;
        }
        return articleEntity.copy(str28, str18, str19, str20, str21, str22, bool2, str23, str24, str25, str26, str27, l15, l16, str29, str30, str31, str32, str33, l17, l14, aVar2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getModifier() {
        return this.modifier;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getDepartmentId() {
        return this.departmentId;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getModifiedTime() {
        return this.modifiedTime;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getPublicUrl() {
        return this.publicUrl;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getPublishedTitle() {
        return this.publishedTitle;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getStats() {
        return this.stats;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getRatedType() {
        return this.ratedType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Long getLastViewedTime() {
        return this.lastViewedTime;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Long getRecentlyViewedTimeFromSearch() {
        return this.recentlyViewedTimeFromSearch;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final a getLocalMeta() {
        return this.localMeta;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTitles() {
        return this.titles;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getChannels() {
        return this.channels;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getCreator() {
        return this.creator;
    }

    @NotNull
    public final ArticleEntity copy(@NotNull String id2, @Nullable String categoryId, @Nullable String categoryName, @Nullable String title, @Nullable String titles, @Nullable String type, @Nullable Boolean enabled, @Nullable String channels, @Nullable String creator, @Nullable String modifier, @Nullable String departmentId, @Nullable String language, @Nullable Long createdTime, @Nullable Long modifiedTime, @Nullable String publicUrl, @Nullable String publishedTitle, @Nullable String stats, @Nullable String content, @Nullable String ratedType, @Nullable Long lastViewedTime, @Nullable Long recentlyViewedTimeFromSearch, @Nullable a localMeta) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new ArticleEntity(id2, categoryId, categoryName, title, titles, type, enabled, channels, creator, modifier, departmentId, language, createdTime, modifiedTime, publicUrl, publishedTitle, stats, content, ratedType, lastViewedTime, recentlyViewedTimeFromSearch, localMeta);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArticleEntity)) {
            return false;
        }
        ArticleEntity articleEntity = (ArticleEntity) other;
        return Intrinsics.areEqual(this.id, articleEntity.id) && Intrinsics.areEqual(this.categoryId, articleEntity.categoryId) && Intrinsics.areEqual(this.categoryName, articleEntity.categoryName) && Intrinsics.areEqual(this.title, articleEntity.title) && Intrinsics.areEqual(this.titles, articleEntity.titles) && Intrinsics.areEqual(this.type, articleEntity.type) && Intrinsics.areEqual(this.enabled, articleEntity.enabled) && Intrinsics.areEqual(this.channels, articleEntity.channels) && Intrinsics.areEqual(this.creator, articleEntity.creator) && Intrinsics.areEqual(this.modifier, articleEntity.modifier) && Intrinsics.areEqual(this.departmentId, articleEntity.departmentId) && Intrinsics.areEqual(this.language, articleEntity.language) && Intrinsics.areEqual(this.createdTime, articleEntity.createdTime) && Intrinsics.areEqual(this.modifiedTime, articleEntity.modifiedTime) && Intrinsics.areEqual(this.publicUrl, articleEntity.publicUrl) && Intrinsics.areEqual(this.publishedTitle, articleEntity.publishedTitle) && Intrinsics.areEqual(this.stats, articleEntity.stats) && Intrinsics.areEqual(this.content, articleEntity.content) && Intrinsics.areEqual(this.ratedType, articleEntity.ratedType) && Intrinsics.areEqual(this.lastViewedTime, articleEntity.lastViewedTime) && Intrinsics.areEqual(this.recentlyViewedTimeFromSearch, articleEntity.recentlyViewedTimeFromSearch) && Intrinsics.areEqual(this.localMeta, articleEntity.localMeta);
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    public final String getChannels() {
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
    public final String getCreator() {
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
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final Long getLastViewedTime() {
        return this.lastViewedTime;
    }

    @Nullable
    public final a getLocalMeta() {
        return this.localMeta;
    }

    @Nullable
    public final Long getModifiedTime() {
        return this.modifiedTime;
    }

    @Nullable
    public final String getModifier() {
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
    public final String getRatedType() {
        return this.ratedType;
    }

    @Nullable
    public final Long getRecentlyViewedTimeFromSearch() {
        return this.recentlyViewedTimeFromSearch;
    }

    @Nullable
    public final String getStats() {
        return this.stats;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitles() {
        return this.titles;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.categoryId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.categoryName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titles;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.enabled;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.channels;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.creator;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.modifier;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.departmentId;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.language;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l10 = this.createdTime;
        int hashCode13 = (hashCode12 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.modifiedTime;
        int hashCode14 = (hashCode13 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str11 = this.publicUrl;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.publishedTitle;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.stats;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.content;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.ratedType;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Long l12 = this.lastViewedTime;
        int hashCode20 = (hashCode19 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.recentlyViewedTimeFromSearch;
        int hashCode21 = (hashCode20 + (l13 == null ? 0 : l13.hashCode())) * 31;
        a aVar = this.localMeta;
        return hashCode21 + (aVar != null ? aVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ArticleEntity(id=" + this.id + ", categoryId=" + this.categoryId + ", categoryName=" + this.categoryName + ", title=" + this.title + ", titles=" + this.titles + ", type=" + this.type + ", enabled=" + this.enabled + ", channels=" + this.channels + ", creator=" + this.creator + ", modifier=" + this.modifier + ", departmentId=" + this.departmentId + ", language=" + this.language + ", createdTime=" + this.createdTime + ", modifiedTime=" + this.modifiedTime + ", publicUrl=" + this.publicUrl + ", publishedTitle=" + this.publishedTitle + ", stats=" + this.stats + ", content=" + this.content + ", ratedType=" + this.ratedType + ", lastViewedTime=" + this.lastViewedTime + ", recentlyViewedTimeFromSearch=" + this.recentlyViewedTimeFromSearch + ", localMeta=" + this.localMeta + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ArticleEntity(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.Long r37, java.lang.Long r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.Long r44, java.lang.Long r45, com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity.a r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r24 = this;
            r0 = r47 & 64
            if (r0 == 0) goto L8
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8 = r0
            goto La
        L8:
            r8 = r31
        La:
            r0 = 524288(0x80000, float:7.34684E-40)
            r0 = r47 & r0
            r1 = 0
            if (r0 == 0) goto L14
            r21 = r1
            goto L16
        L14:
            r21 = r44
        L16:
            r0 = 1048576(0x100000, float:1.469368E-39)
            r0 = r47 & r0
            if (r0 == 0) goto L1f
            r22 = r1
            goto L21
        L1f:
            r22 = r45
        L21:
            r0 = 2097152(0x200000, float:2.938736E-39)
            r0 = r47 & r0
            if (r0 == 0) goto L50
            r23 = r1
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
            r1 = r24
            goto L78
        L50:
            r23 = r46
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r20 = r43
        L78:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, com.zoho.livechat.android.modules.knowledgebase.data.datasources.local.entities.ArticleEntity$a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

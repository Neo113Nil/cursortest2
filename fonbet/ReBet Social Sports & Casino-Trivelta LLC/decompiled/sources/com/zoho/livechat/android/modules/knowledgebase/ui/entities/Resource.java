package com.zoho.livechat.android.modules.knowledgebase.ui.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.d;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0005ABCDEB\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0018\u00010\tR\u00020\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0000\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010.\u001a\b\u0018\u00010\u0012R\u00020\u0000HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00104\u001a\b\u0018\u00010\tR\u00020\u0000HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001cJ°\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\tR\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u00002\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u001c\u0010\b\u001a\b\u0018\u00010\tR\u00020\u00008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u00008\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006F"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;", "", StackTraceHelper.ID_KEY, "", "category", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Category;", "title", "departmentId", "language", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Language;", "creator", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;", "modifier", "createdTime", "", "modifiedTime", "publicUrl", "stats", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Stats;", "content", "ratedType", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$ArticleAction;", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Category;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Language;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Stats;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$ArticleAction;)V", "getCategory", "()Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Category;", "getContent", "()Ljava/lang/String;", "getCreatedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreator", "()Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;", "getDepartmentId", "getId", "getLanguage", "()Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Language;", "getModifiedTime", "getModifier", "getPublicUrl", "getRatedType", "()Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$ArticleAction;", "getStats", "()Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Stats;", "getTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Category;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Language;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Stats;Ljava/lang/String;Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$ArticleAction;)Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;", "equals", "", "other", "hashCode", "", "toString", "ArticleAction", "Category", "Language", "Stats", "User", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Resource {

    @c("category")
    @Nullable
    private final Category category;

    @c("content")
    @Nullable
    private final String content;

    @c("created_time")
    @Nullable
    private final Long createdTime;

    @c("creator")
    @Nullable
    private final User creator;

    @c("department_id")
    @Nullable
    private final String departmentId;

    @c(StackTraceHelper.ID_KEY)
    @NotNull
    private final String id;

    @c("language")
    @Nullable
    private final Language language;

    @c("modified_time")
    @Nullable
    private final Long modifiedTime;

    @c("modifier")
    @Nullable
    private final User modifier;

    @c("public_url")
    @Nullable
    private final String publicUrl;

    @c("rated_type")
    @Nullable
    private final ArticleAction ratedType;

    @c("stats")
    @Nullable
    private final Stats stats;

    @c("title")
    @Nullable
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$ArticleAction;", "", "(Ljava/lang/String;I)V", "Liked", "Disliked", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ArticleAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ArticleAction[] $VALUES;

        @c("liked")
        public static final ArticleAction Liked = new ArticleAction("Liked", 0);

        @c("disliked")
        public static final ArticleAction Disliked = new ArticleAction("Disliked", 1);

        private static final /* synthetic */ ArticleAction[] $values() {
            return new ArticleAction[]{Liked, Disliked};
        }

        static {
            ArticleAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ArticleAction(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<ArticleAction> getEntries() {
            return $ENTRIES;
        }

        public static ArticleAction valueOf(String str) {
            return (ArticleAction) Enum.valueOf(ArticleAction.class, str);
        }

        public static ArticleAction[] values() {
            return (ArticleAction[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Category;", "", StackTraceHelper.ID_KEY, "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Category {

        @c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        @c("name")
        @Nullable
        private final String name;

        public Category(@Nullable String str, @Nullable String str2) {
            this.id = str;
            this.name = str2;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Language;", "", EventKeys.ERROR_CODE, "", StackTraceHelper.ID_KEY, "(Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getId", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Language {

        @c(EventKeys.ERROR_CODE)
        @Nullable
        private final String code;

        @c(StackTraceHelper.ID_KEY)
        @Nullable
        private final String id;

        public Language(@Nullable String str, @Nullable String str2) {
            this.code = str;
            this.id = str2;
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0000J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$User;", "", "displayName", "", "email", StackTraceHelper.ID_KEY, "imageUrl", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getEmail", "getId", "getImageUrl", "getName", "appendBaseUrlWithImageUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class User {

        @c("display_name")
        @Nullable
        private final String displayName;

        @c("email")
        @Nullable
        private final String email;

        @c(StackTraceHelper.ID_KEY)
        @NotNull
        private final String id;

        @c("image_url")
        @Nullable
        private final String imageUrl;

        @c("name")
        @Nullable
        private final String name;

        public User(@Nullable String str, @Nullable String str2, @NotNull String id2, @Nullable String str3, @Nullable String str4) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.displayName = str;
            this.email = str2;
            this.id = id2;
            this.imageUrl = str3;
            this.name = str4;
        }

        public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
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
            String str6 = str5;
            String str7 = str3;
            return user.copy(str, str2, str7, str4, str6);
        }

        @NotNull
        public final User appendBaseUrlWithImageUrl() {
            return copy$default(this, null, null, null, d.d() + this.imageUrl, null, 23, null);
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

        @NotNull
        public final User copy(@Nullable String displayName, @Nullable String email, @NotNull String id2, @Nullable String imageUrl, @Nullable String name) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return new User(displayName, email, id2, imageUrl, name);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof User)) {
                return false;
            }
            User user = (User) other;
            return Intrinsics.areEqual(this.displayName, user.displayName) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.imageUrl, user.imageUrl) && Intrinsics.areEqual(this.name, user.name);
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

        public int hashCode() {
            String str = this.displayName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.email;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.id.hashCode()) * 31;
            String str3 = this.imageUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.name;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "User(displayName=" + this.displayName + ", email=" + this.email + ", id=" + this.id + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ')';
        }
    }

    public Resource(@NotNull String id2, @Nullable Category category, @Nullable String str, @Nullable String str2, @Nullable Language language, @Nullable User user, @Nullable User user2, @Nullable Long l10, @Nullable Long l11, @Nullable String str3, @Nullable Stats stats, @Nullable String str4, @Nullable ArticleAction articleAction) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.category = category;
        this.title = str;
        this.departmentId = str2;
        this.language = language;
        this.creator = user;
        this.modifier = user2;
        this.createdTime = l10;
        this.modifiedTime = l11;
        this.publicUrl = str3;
        this.stats = stats;
        this.content = str4;
        this.ratedType = articleAction;
    }

    public static /* synthetic */ Resource copy$default(Resource resource, String str, Category category, String str2, String str3, Language language, User user, User user2, Long l10, Long l11, String str4, Stats stats, String str5, ArticleAction articleAction, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = resource.id;
        }
        return resource.copy(str, (i10 & 2) != 0 ? resource.category : category, (i10 & 4) != 0 ? resource.title : str2, (i10 & 8) != 0 ? resource.departmentId : str3, (i10 & 16) != 0 ? resource.language : language, (i10 & 32) != 0 ? resource.creator : user, (i10 & 64) != 0 ? resource.modifier : user2, (i10 & 128) != 0 ? resource.createdTime : l10, (i10 & 256) != 0 ? resource.modifiedTime : l11, (i10 & 512) != 0 ? resource.publicUrl : str4, (i10 & 1024) != 0 ? resource.stats : stats, (i10 & 2048) != 0 ? resource.content : str5, (i10 & 4096) != 0 ? resource.ratedType : articleAction);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getPublicUrl() {
        return this.publicUrl;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Stats getStats() {
        return this.stats;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final ArticleAction getRatedType() {
        return this.ratedType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDepartmentId() {
        return this.departmentId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Language getLanguage() {
        return this.language;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final User getCreator() {
        return this.creator;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final User getModifier() {
        return this.modifier;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Long getCreatedTime() {
        return this.createdTime;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Long getModifiedTime() {
        return this.modifiedTime;
    }

    @NotNull
    public final Resource copy(@NotNull String id2, @Nullable Category category, @Nullable String title, @Nullable String departmentId, @Nullable Language language, @Nullable User creator, @Nullable User modifier, @Nullable Long createdTime, @Nullable Long modifiedTime, @Nullable String publicUrl, @Nullable Stats stats, @Nullable String content, @Nullable ArticleAction ratedType) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return new Resource(id2, category, title, departmentId, language, creator, modifier, createdTime, modifiedTime, publicUrl, stats, content, ratedType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return Intrinsics.areEqual(this.id, resource.id) && Intrinsics.areEqual(this.category, resource.category) && Intrinsics.areEqual(this.title, resource.title) && Intrinsics.areEqual(this.departmentId, resource.departmentId) && Intrinsics.areEqual(this.language, resource.language) && Intrinsics.areEqual(this.creator, resource.creator) && Intrinsics.areEqual(this.modifier, resource.modifier) && Intrinsics.areEqual(this.createdTime, resource.createdTime) && Intrinsics.areEqual(this.modifiedTime, resource.modifiedTime) && Intrinsics.areEqual(this.publicUrl, resource.publicUrl) && Intrinsics.areEqual(this.stats, resource.stats) && Intrinsics.areEqual(this.content, resource.content) && this.ratedType == resource.ratedType;
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

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Language getLanguage() {
        return this.language;
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
    public final ArticleAction getRatedType() {
        return this.ratedType;
    }

    @Nullable
    public final Stats getStats() {
        return this.stats;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        Category category = this.category;
        int hashCode2 = (hashCode + (category == null ? 0 : category.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.departmentId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Language language = this.language;
        int hashCode5 = (hashCode4 + (language == null ? 0 : language.hashCode())) * 31;
        User user = this.creator;
        int hashCode6 = (hashCode5 + (user == null ? 0 : user.hashCode())) * 31;
        User user2 = this.modifier;
        int hashCode7 = (hashCode6 + (user2 == null ? 0 : user2.hashCode())) * 31;
        Long l10 = this.createdTime;
        int hashCode8 = (hashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.modifiedTime;
        int hashCode9 = (hashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.publicUrl;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Stats stats = this.stats;
        int hashCode11 = (hashCode10 + (stats == null ? 0 : stats.hashCode())) * 31;
        String str4 = this.content;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArticleAction articleAction = this.ratedType;
        return hashCode12 + (articleAction != null ? articleAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Resource(id=" + this.id + ", category=" + this.category + ", title=" + this.title + ", departmentId=" + this.departmentId + ", language=" + this.language + ", creator=" + this.creator + ", modifier=" + this.modifier + ", createdTime=" + this.createdTime + ", modifiedTime=" + this.modifiedTime + ", publicUrl=" + this.publicUrl + ", stats=" + this.stats + ", content=" + this.content + ", ratedType=" + this.ratedType + ')';
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource$Stats;", "", "disliked", "", "liked", "used", "viewed", "(Lcom/zoho/livechat/android/modules/knowledgebase/ui/entities/Resource;IIII)V", "getDisliked", "()I", "getLiked", "getUsed", "getViewed", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Stats {

        @c("disliked")
        private final int disliked;

        @c("liked")
        private final int liked;

        @c("used")
        private final int used;

        @c("viewed")
        private final int viewed;

        public Stats(int i10, int i11, int i12, int i13) {
            this.disliked = i10;
            this.liked = i11;
            this.used = i12;
            this.viewed = i13;
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

        public /* synthetic */ Stats(Resource resource, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? -1 : i10, (i14 & 2) != 0 ? -1 : i11, (i14 & 4) != 0 ? -1 : i12, (i14 & 8) != 0 ? -1 : i13);
        }
    }
}

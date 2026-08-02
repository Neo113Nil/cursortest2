package com.zoho.livechat.android.models;

import com.facebook.react.devsupport.StackTraceHelper;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.Hashtable;
import ug.AbstractC6574b;

@Deprecated
/* loaded from: classes4.dex */
public class SalesIQArticle {
    private final String categoryId;
    private final String categoryName;
    private final String content;
    private final long createdTime;
    private final String departmentId;
    private final int dislikeCount;

    /* renamed from: id, reason: collision with root package name */
    private final String f42485id;
    private final String latestAuthorString;
    private final int likeCount;
    private final long modifiedTime;
    private final String name;
    private int ratedType;
    private final int viewCount;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f42486a;

        /* renamed from: b, reason: collision with root package name */
        public String f42487b;

        /* renamed from: c, reason: collision with root package name */
        public String f42488c;

        /* renamed from: d, reason: collision with root package name */
        public String f42489d;

        /* renamed from: e, reason: collision with root package name */
        public String f42490e;

        public a(Hashtable hashtable) {
            if (hashtable.containsKey("display_name")) {
                this.f42486a = LiveChatUtil.getString(hashtable.get("display_name")).trim();
            }
            if (hashtable.containsKey("email")) {
                this.f42487b = LiveChatUtil.getString(hashtable.get("email"));
            }
            if (hashtable.containsKey("name")) {
                this.f42488c = LiveChatUtil.getString(hashtable.get("name")).trim();
            }
            if (hashtable.containsKey(StackTraceHelper.ID_KEY)) {
                this.f42489d = LiveChatUtil.getString(hashtable.get(StackTraceHelper.ID_KEY));
            }
            if (hashtable.containsKey("image_url")) {
                this.f42490e = LiveChatUtil.getString(hashtable.get("image_url"));
            }
        }
    }

    @Deprecated
    public SalesIQArticle(String str, String str2, String str3, String str4, int i10, int i11, int i12, String str5, long j10, long j11, String str6, int i13, String str7) {
        this.f42485id = str;
        this.name = str2;
        this.categoryId = str3;
        this.categoryName = str4;
        this.viewCount = i10;
        this.likeCount = i11;
        this.dislikeCount = i12;
        this.departmentId = str5;
        this.createdTime = j10;
        this.modifiedTime = j11;
        this.content = str6;
        this.ratedType = i13;
        this.latestAuthorString = str7;
    }

    @Deprecated
    public String getCategoryId() {
        return this.categoryId;
    }

    @Deprecated
    public String getCategoryName() {
        return this.categoryName;
    }

    @Deprecated
    public String getContent() {
        return this.content;
    }

    @Deprecated
    public long getCreatedTime() {
        return this.createdTime;
    }

    @Deprecated
    public String getDepartmentId() {
        return this.departmentId;
    }

    @Deprecated
    public int getDisliked() {
        return this.dislikeCount;
    }

    @Deprecated
    public String getId() {
        return this.f42485id;
    }

    @Deprecated
    public a getLatestAuthor() {
        String str = this.latestAuthorString;
        Hashtable hashtable = (str == null || str.isEmpty()) ? null : (Hashtable) AbstractC6574b.d(this.latestAuthorString);
        if (hashtable != null) {
            return new a(hashtable);
        }
        return null;
    }

    @Deprecated
    public int getLiked() {
        return this.likeCount;
    }

    @Deprecated
    public long getModifiedTime() {
        return this.modifiedTime;
    }

    @Deprecated
    public int getRatedType() {
        return this.ratedType;
    }

    @Deprecated
    public String getTitle() {
        return this.name;
    }

    @Deprecated
    public int getViewed() {
        return this.viewCount;
    }
}

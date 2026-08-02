package com.vk.superapp.vkclient.js.bridge.api.events;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.b9y;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ShowNewPostBox.kt */
/* loaded from: classes6.dex */
public final class ShowNewPostBox$Parameters implements ad6 {

    @pmi0("allowed_attachments")
    private final String allowedAttachments;

    @pmi0("allowed_coauthors")
    private final Boolean allowedCoauthors;

    @pmi0("author_id")
    private final Long authorId;

    @pmi0("character_limit")
    private final Integer characterLimit;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("post")
    private final b9y post;

    @pmi0(CommonUrlParts.REQUEST_ID)
    private final String requestId;

    @pmi0("situational_suggest_id")
    private final Integer situationalSuggestId;

    @pmi0("textlive_id")
    private final Integer textliveId;

    public ShowNewPostBox$Parameters(String str, Long l, Integer num, Long l2, String str2, Boolean bool, b9y b9yVar, Integer num2, Integer num3) {
        this.requestId = str;
        this.ownerId = l;
        this.textliveId = num;
        this.authorId = l2;
        this.allowedAttachments = str2;
        this.allowedCoauthors = bool;
        this.post = b9yVar;
        this.characterLimit = num2;
        this.situationalSuggestId = num3;
    }

    public static final ShowNewPostBox$Parameters a(ShowNewPostBox$Parameters showNewPostBox$Parameters) {
        return showNewPostBox$Parameters.requestId == null ? new ShowNewPostBox$Parameters("default_request_id", showNewPostBox$Parameters.ownerId, showNewPostBox$Parameters.textliveId, showNewPostBox$Parameters.authorId, showNewPostBox$Parameters.allowedAttachments, showNewPostBox$Parameters.allowedCoauthors, showNewPostBox$Parameters.post, showNewPostBox$Parameters.characterLimit, showNewPostBox$Parameters.situationalSuggestId) : showNewPostBox$Parameters;
    }

    public static final void b(ShowNewPostBox$Parameters showNewPostBox$Parameters) {
        if (showNewPostBox$Parameters.requestId == null) {
            throw new IllegalArgumentException("Value of non-nullable member requestId cannot be\n                        null");
        }
    }

    public final String c() {
        return this.allowedAttachments;
    }

    public final Boolean d() {
        return this.allowedCoauthors;
    }

    public final Long e() {
        return this.authorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowNewPostBox$Parameters)) {
            return false;
        }
        ShowNewPostBox$Parameters showNewPostBox$Parameters = (ShowNewPostBox$Parameters) obj;
        return epx.f(this.requestId, showNewPostBox$Parameters.requestId) && epx.f(this.ownerId, showNewPostBox$Parameters.ownerId) && epx.f(this.textliveId, showNewPostBox$Parameters.textliveId) && epx.f(this.authorId, showNewPostBox$Parameters.authorId) && epx.f(this.allowedAttachments, showNewPostBox$Parameters.allowedAttachments) && epx.f(this.allowedCoauthors, showNewPostBox$Parameters.allowedCoauthors) && epx.f(this.post, showNewPostBox$Parameters.post) && epx.f(this.characterLimit, showNewPostBox$Parameters.characterLimit) && epx.f(this.situationalSuggestId, showNewPostBox$Parameters.situationalSuggestId);
    }

    public final Integer f() {
        return this.characterLimit;
    }

    public final Long g() {
        return this.ownerId;
    }

    public final b9y h() {
        return this.post;
    }

    public final int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        Long l = this.ownerId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.textliveId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.authorId;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.allowedAttachments;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.allowedCoauthors;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        b9y b9yVar = this.post;
        int hashCode7 = (hashCode6 + (b9yVar == null ? 0 : b9yVar.hashCode())) * 31;
        Integer num2 = this.characterLimit;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.situationalSuggestId;
        return hashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String i() {
        return this.requestId;
    }

    public final Integer j() {
        return this.situationalSuggestId;
    }

    public final Integer k() {
        return this.textliveId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Parameters(requestId=");
        sb.append(this.requestId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", textliveId=");
        sb.append(this.textliveId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", allowedAttachments=");
        sb.append(this.allowedAttachments);
        sb.append(", allowedCoauthors=");
        sb.append(this.allowedCoauthors);
        sb.append(", post=");
        sb.append(this.post);
        sb.append(", characterLimit=");
        sb.append(this.characterLimit);
        sb.append(", situationalSuggestId=");
        return uqi.b(sb, this.situationalSuggestId, ')');
    }

    public /* synthetic */ ShowNewPostBox$Parameters(String str, Long l, Integer num, Long l2, String str2, Boolean bool, b9y b9yVar, Integer num2, Integer num3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : b9yVar, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3);
    }
}

package com.vk.sdk.api.bugtracker.dto;

import java.util.List;
import xsna.epx;
import xsna.jax0;
import xsna.kr;
import xsna.n6j;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: BugtrackerCommentDto.kt */
/* loaded from: classes5.dex */
public final class BugtrackerCommentDto {

    @pmi0("attachments")
    private final List<BugtrackerAttachmentDto> attachments;

    @pmi0("author_name")
    private final String authorName;

    @pmi0("author_photo")
    private final String authorPhoto;

    @pmi0("bugreport_id")
    private final int bugreportId;

    @pmi0("comment_id")
    private final int commentId;

    @pmi0("created")
    private final int created;

    @pmi0("edit_hash")
    private final String editHash;

    @pmi0("from_id")
    private final Integer fromId;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_unread")
    private final Boolean isUnread;

    @pmi0("meta_text")
    private final String metaText;

    @pmi0("remove_hash")
    private final String removeHash;

    @pmi0("text")
    private final String text;

    public BugtrackerCommentDto(int i, int i2, int i3, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Boolean bool, List<BugtrackerAttachmentDto> list, Boolean bool2) {
        this.bugreportId = i;
        this.commentId = i2;
        this.created = i3;
        this.text = str;
        this.metaText = str2;
        this.fromId = num;
        this.authorName = str3;
        this.authorPhoto = str4;
        this.editHash = str5;
        this.removeHash = str6;
        this.isHidden = bool;
        this.attachments = list;
        this.isUnread = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BugtrackerCommentDto)) {
            return false;
        }
        BugtrackerCommentDto bugtrackerCommentDto = (BugtrackerCommentDto) obj;
        return this.bugreportId == bugtrackerCommentDto.bugreportId && this.commentId == bugtrackerCommentDto.commentId && this.created == bugtrackerCommentDto.created && epx.f(this.text, bugtrackerCommentDto.text) && epx.f(this.metaText, bugtrackerCommentDto.metaText) && epx.f(this.fromId, bugtrackerCommentDto.fromId) && epx.f(this.authorName, bugtrackerCommentDto.authorName) && epx.f(this.authorPhoto, bugtrackerCommentDto.authorPhoto) && epx.f(this.editHash, bugtrackerCommentDto.editHash) && epx.f(this.removeHash, bugtrackerCommentDto.removeHash) && epx.f(this.isHidden, bugtrackerCommentDto.isHidden) && epx.f(this.attachments, bugtrackerCommentDto.attachments) && epx.f(this.isUnread, bugtrackerCommentDto.isUnread);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.created, shy.a(this.commentId, Integer.hashCode(this.bugreportId) * 31, 31), 31), 31, this.text);
        String str = this.metaText;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.fromId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.authorName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authorPhoto;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.editHash;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.removeHash;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isHidden;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BugtrackerAttachmentDto> list = this.attachments;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isUnread;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.bugreportId;
        int i2 = this.commentId;
        int i3 = this.created;
        String str = this.text;
        String str2 = this.metaText;
        Integer num = this.fromId;
        String str3 = this.authorName;
        String str4 = this.authorPhoto;
        String str5 = this.editHash;
        String str6 = this.removeHash;
        Boolean bool = this.isHidden;
        List<BugtrackerAttachmentDto> list = this.attachments;
        Boolean bool2 = this.isUnread;
        StringBuilder a = odj.a(i, i2, "BugtrackerCommentDto(bugreportId=", ", commentId=", ", created=");
        jax0.a(i3, ", text=", str, ", metaText=", a);
        kr.b(num, str2, ", fromId=", ", authorName=", a);
        n6j.b(a, str3, ", authorPhoto=", str4, ", editHash=");
        n6j.b(a, str5, ", removeHash=", str6, ", isHidden=");
        a.append(bool);
        a.append(", attachments=");
        a.append(list);
        a.append(", isUnread=");
        return xq.d(a, bool2, ")");
    }

    public /* synthetic */ BugtrackerCommentDto(int i, int i2, int i3, String str, String str2, Integer num, String str3, String str4, String str5, String str6, Boolean bool, List list, Boolean bool2, int i4, zcl zclVar) {
        this(i, i2, i3, str, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? null : bool, (i4 & 2048) != 0 ? null : list, (i4 & 4096) != 0 ? null : bool2);
    }
}

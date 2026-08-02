package com.vk.sdk.api.wall.dto;

import xsna.cgn;
import xsna.epx;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: WallRepostResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallRepostResponseDto {

    @pmi0("likes_count")
    private final int likesCount;

    @pmi0("mail_repost_count")
    private final Integer mailRepostCount;

    @pmi0("post_id")
    private final int postId;

    @pmi0("reposts_count")
    private final int repostsCount;

    @pmi0("success")
    private final int success;

    @pmi0("wall_repost_count")
    private final Integer wallRepostCount;

    public WallRepostResponseDto(int i, int i2, int i3, int i4, Integer num, Integer num2) {
        this.success = i;
        this.postId = i2;
        this.repostsCount = i3;
        this.likesCount = i4;
        this.wallRepostCount = num;
        this.mailRepostCount = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallRepostResponseDto)) {
            return false;
        }
        WallRepostResponseDto wallRepostResponseDto = (WallRepostResponseDto) obj;
        return this.success == wallRepostResponseDto.success && this.postId == wallRepostResponseDto.postId && this.repostsCount == wallRepostResponseDto.repostsCount && this.likesCount == wallRepostResponseDto.likesCount && epx.f(this.wallRepostCount, wallRepostResponseDto.wallRepostCount) && epx.f(this.mailRepostCount, wallRepostResponseDto.mailRepostCount);
    }

    public final int hashCode() {
        int a = shy.a(this.likesCount, shy.a(this.repostsCount, shy.a(this.postId, Integer.hashCode(this.success) * 31, 31), 31), 31);
        Integer num = this.wallRepostCount;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mailRepostCount;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.success;
        int i2 = this.postId;
        int i3 = this.repostsCount;
        int i4 = this.likesCount;
        Integer num = this.wallRepostCount;
        Integer num2 = this.mailRepostCount;
        StringBuilder a = odj.a(i, i2, "WallRepostResponseDto(success=", ", postId=", ", repostsCount=");
        cgn.a(i3, i4, ", likesCount=", ", wallRepostCount=", a);
        a.append(num);
        a.append(", mailRepostCount=");
        a.append(num2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ WallRepostResponseDto(int i, int i2, int i3, int i4, Integer num, Integer num2, int i5, zcl zclVar) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? null : num2);
    }
}

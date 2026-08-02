package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gsi0;
import xsna.kr;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.xq;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemActionPropertiesDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemActionPropertiesDto {

    @pmi0("hash")
    private final String hash;

    @pmi0("is_incomplete")
    private final Boolean isIncomplete;

    @pmi0("message_chat_id")
    private final Integer messageChatId;

    @pmi0("message_enabled")
    private final boolean messageEnabled;

    @pmi0("message_wallitem_id")
    private final String messageWallitemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("phone_enabled")
    private final boolean phoneEnabled;

    public ClassifiedsYoulaItemActionPropertiesDto(UserId userId, String str, boolean z, boolean z2, String str2, Integer num, Boolean bool) {
        this.ownerId = userId;
        this.hash = str;
        this.phoneEnabled = z;
        this.messageEnabled = z2;
        this.messageWallitemId = str2;
        this.messageChatId = num;
        this.isIncomplete = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemActionPropertiesDto)) {
            return false;
        }
        ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto = (ClassifiedsYoulaItemActionPropertiesDto) obj;
        return epx.f(this.ownerId, classifiedsYoulaItemActionPropertiesDto.ownerId) && epx.f(this.hash, classifiedsYoulaItemActionPropertiesDto.hash) && this.phoneEnabled == classifiedsYoulaItemActionPropertiesDto.phoneEnabled && this.messageEnabled == classifiedsYoulaItemActionPropertiesDto.messageEnabled && epx.f(this.messageWallitemId, classifiedsYoulaItemActionPropertiesDto.messageWallitemId) && epx.f(this.messageChatId, classifiedsYoulaItemActionPropertiesDto.messageChatId) && epx.f(this.isIncomplete, classifiedsYoulaItemActionPropertiesDto.isIncomplete);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.hash), 31, this.phoneEnabled), 31, this.messageEnabled);
        String str = this.messageWallitemId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.messageChatId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isIncomplete;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.ownerId;
        String str = this.hash;
        boolean z = this.phoneEnabled;
        boolean z2 = this.messageEnabled;
        String str2 = this.messageWallitemId;
        Integer num = this.messageChatId;
        Boolean bool = this.isIncomplete;
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemActionPropertiesDto(ownerId=");
        sb.append(userId);
        sb.append(", hash=");
        sb.append(str);
        sb.append(", phoneEnabled=");
        gsi0.c(sb, z, ", messageEnabled=", z2, ", messageWallitemId=");
        kr.b(num, str2, ", messageChatId=", ", isIncomplete=", sb);
        return xq.d(sb, bool, ")");
    }

    public /* synthetic */ ClassifiedsYoulaItemActionPropertiesDto(UserId userId, String str, boolean z, boolean z2, String str2, Integer num, Boolean bool, int i, zcl zclVar) {
        this(userId, str, z, z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool);
    }
}

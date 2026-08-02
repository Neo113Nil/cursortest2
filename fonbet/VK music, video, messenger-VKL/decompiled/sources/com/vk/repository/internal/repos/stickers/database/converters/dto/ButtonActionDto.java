package com.vk.repository.internal.repos.stickers.database.converters.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.shy;

/* compiled from: ButtonActionDto.kt */
/* loaded from: classes5.dex */
public final class ButtonActionDto {

    @pmi0("groupId")
    private final int groupId;

    @pmi0("link")
    private final AwayLinkDto link;

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final String type;

    public ButtonActionDto(String str, int i, String str2, AwayLinkDto awayLinkDto) {
        this.target = str;
        this.groupId = i;
        this.type = str2;
        this.link = awayLinkDto;
    }

    public final int a() {
        return this.groupId;
    }

    public final AwayLinkDto b() {
        return this.link;
    }

    public final String c() {
        return this.target;
    }

    public final String d() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonActionDto)) {
            return false;
        }
        ButtonActionDto buttonActionDto = (ButtonActionDto) obj;
        return epx.f(this.target, buttonActionDto.target) && this.groupId == buttonActionDto.groupId && epx.f(this.type, buttonActionDto.type) && epx.f(this.link, buttonActionDto.link);
    }

    public final int hashCode() {
        String str = this.target;
        int a = shy.a(this.groupId, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.type;
        return this.link.hashCode() + ((a + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonActionDto(target=" + this.target + ", groupId=" + this.groupId + ", type=" + this.type + ", link=" + this.link + ')';
    }
}

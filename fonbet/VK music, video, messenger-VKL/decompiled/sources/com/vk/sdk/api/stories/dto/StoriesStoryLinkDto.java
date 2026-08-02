package com.vk.sdk.api.stories.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: StoriesStoryLinkDto.kt */
/* loaded from: classes5.dex */
public final class StoriesStoryLinkDto {

    @pmi0("link_url_target")
    private final String linkUrlTarget;

    @pmi0("text")
    private final String text;

    @pmi0("url")
    private final String url;

    public StoriesStoryLinkDto(String str, String str2, String str3) {
        this.text = str;
        this.url = str2;
        this.linkUrlTarget = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStoryLinkDto)) {
            return false;
        }
        StoriesStoryLinkDto storiesStoryLinkDto = (StoriesStoryLinkDto) obj;
        return epx.f(this.text, storiesStoryLinkDto.text) && epx.f(this.url, storiesStoryLinkDto.url) && epx.f(this.linkUrlTarget, storiesStoryLinkDto.linkUrlTarget);
    }

    public final int hashCode() {
        int a = urd0.a(this.text.hashCode() * 31, 31, this.url);
        String str = this.linkUrlTarget;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.text;
        String str2 = this.url;
        return i5s.a(xe9.a("StoriesStoryLinkDto(text=", str, ", url=", str2, ", linkUrlTarget="), this.linkUrlTarget, ")");
    }

    public /* synthetic */ StoriesStoryLinkDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}

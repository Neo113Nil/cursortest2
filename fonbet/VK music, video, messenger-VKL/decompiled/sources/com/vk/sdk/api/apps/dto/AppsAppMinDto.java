package com.vk.sdk.api.apps.dto;

import xsna.epx;
import xsna.kr;
import xsna.l4;
import xsna.n6j;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAppMinDto.kt */
/* loaded from: classes5.dex */
public final class AppsAppMinDto {

    @pmi0("author_owner_id")
    private final Integer authorOwnerId;

    @pmi0("background_loader_color")
    private final String backgroundLoaderColor;

    @pmi0("icon_139")
    private final String icon139;

    @pmi0("icon_150")
    private final String icon150;

    @pmi0("icon_278")
    private final String icon278;

    @pmi0("icon_576")
    private final String icon576;

    @pmi0("icon_75")
    private final String icon75;

    @pmi0("id")
    private final int id;

    @pmi0("is_installed")
    private final Boolean isInstalled;

    @pmi0("loader_icon")
    private final String loaderIcon;

    @pmi0("open_in_external_browser")
    private final Boolean openInExternalBrowser;

    @pmi0("screen_orientation")
    private final Integer screenOrientation;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final AppsAppTypeDto type;

    public AppsAppMinDto(AppsAppTypeDto appsAppTypeDto, int i, String str, Integer num, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, Integer num2) {
        this.type = appsAppTypeDto;
        this.id = i;
        this.title = str;
        this.authorOwnerId = num;
        this.isInstalled = bool;
        this.icon139 = str2;
        this.icon150 = str3;
        this.icon278 = str4;
        this.icon576 = str5;
        this.backgroundLoaderColor = str6;
        this.loaderIcon = str7;
        this.icon75 = str8;
        this.openInExternalBrowser = bool2;
        this.screenOrientation = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppMinDto)) {
            return false;
        }
        AppsAppMinDto appsAppMinDto = (AppsAppMinDto) obj;
        return this.type == appsAppMinDto.type && this.id == appsAppMinDto.id && epx.f(this.title, appsAppMinDto.title) && epx.f(this.authorOwnerId, appsAppMinDto.authorOwnerId) && epx.f(this.isInstalled, appsAppMinDto.isInstalled) && epx.f(this.icon139, appsAppMinDto.icon139) && epx.f(this.icon150, appsAppMinDto.icon150) && epx.f(this.icon278, appsAppMinDto.icon278) && epx.f(this.icon576, appsAppMinDto.icon576) && epx.f(this.backgroundLoaderColor, appsAppMinDto.backgroundLoaderColor) && epx.f(this.loaderIcon, appsAppMinDto.loaderIcon) && epx.f(this.icon75, appsAppMinDto.icon75) && epx.f(this.openInExternalBrowser, appsAppMinDto.openInExternalBrowser) && epx.f(this.screenOrientation, appsAppMinDto.screenOrientation);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.id, this.type.hashCode() * 31, 31), 31, this.title);
        Integer num = this.authorOwnerId;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isInstalled;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.icon139;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon150;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon278;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon576;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.backgroundLoaderColor;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loaderIcon;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon75;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool2 = this.openInExternalBrowser;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.screenOrientation;
        return hashCode10 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        AppsAppTypeDto appsAppTypeDto = this.type;
        int i = this.id;
        String str = this.title;
        Integer num = this.authorOwnerId;
        Boolean bool = this.isInstalled;
        String str2 = this.icon139;
        String str3 = this.icon150;
        String str4 = this.icon278;
        String str5 = this.icon576;
        String str6 = this.backgroundLoaderColor;
        String str7 = this.loaderIcon;
        String str8 = this.icon75;
        Boolean bool2 = this.openInExternalBrowser;
        Integer num2 = this.screenOrientation;
        StringBuilder sb = new StringBuilder("AppsAppMinDto(type=");
        sb.append(appsAppTypeDto);
        sb.append(", id=");
        sb.append(i);
        sb.append(", title=");
        kr.b(num, str, ", authorOwnerId=", ", isInstalled=", sb);
        l4.i(bool, ", icon139=", str2, ", icon150=", sb);
        n6j.b(sb, str3, ", icon278=", str4, ", icon576=");
        n6j.b(sb, str5, ", backgroundLoaderColor=", str6, ", loaderIcon=");
        n6j.b(sb, str7, ", icon75=", str8, ", openInExternalBrowser=");
        sb.append(bool2);
        sb.append(", screenOrientation=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ AppsAppMinDto(AppsAppTypeDto appsAppTypeDto, int i, String str, Integer num, Boolean bool, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool2, Integer num2, int i2, zcl zclVar) {
        this(appsAppTypeDto, i, str, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? null : str6, (i2 & 1024) != 0 ? null : str7, (i2 & 2048) != 0 ? null : str8, (i2 & 4096) != 0 ? null : bool2, (i2 & 8192) != 0 ? null : num2);
    }
}

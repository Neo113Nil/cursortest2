package com.vk.superapp.api.dto.menu;

import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SuperAppAnimationConfig.kt */
/* loaded from: classes6.dex */
public final class Animation {

    @pmi0("action")
    private final Action action;

    @pmi0("byteArrayUrl")
    private String byteArrayUrl;

    @pmi0("byteArrayUrlDark")
    private String byteArrayUrlDark;

    @pmi0("id")
    private final String id;

    @pmi0("repeat")
    private final int repeat;

    @pmi0("url")
    private final String url;

    @pmi0("urlDark")
    private final String urlDark;

    public Animation(String str, String str2, Action action, int i, String str3, String str4, String str5) {
        this.id = str;
        this.url = str2;
        this.action = action;
        this.repeat = i;
        this.urlDark = str3;
        this.byteArrayUrl = str4;
        this.byteArrayUrlDark = str5;
    }

    public static Animation a(Animation animation, String str, String str2) {
        String str3 = animation.id;
        String str4 = animation.url;
        Action action = animation.action;
        int i = animation.repeat;
        String str5 = animation.urlDark;
        animation.getClass();
        return new Animation(str3, str4, action, i, str5, str, str2);
    }

    public final Action b() {
        return this.action;
    }

    public final String c() {
        return this.byteArrayUrl;
    }

    public final String d() {
        return this.byteArrayUrlDark;
    }

    public final int e() {
        return this.repeat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Animation)) {
            return false;
        }
        Animation animation = (Animation) obj;
        return epx.f(this.id, animation.id) && epx.f(this.url, animation.url) && this.action == animation.action && this.repeat == animation.repeat && epx.f(this.urlDark, animation.urlDark) && epx.f(this.byteArrayUrl, animation.byteArrayUrl) && epx.f(this.byteArrayUrlDark, animation.byteArrayUrlDark);
    }

    public final String f() {
        return this.url;
    }

    public final String g() {
        return this.urlDark;
    }

    public final void h(String str) {
        this.byteArrayUrl = str;
    }

    public final int hashCode() {
        int a = shy.a(this.repeat, (this.action.hashCode() + urd0.a(this.id.hashCode() * 31, 31, this.url)) * 31, 31);
        String str = this.urlDark;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.byteArrayUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.byteArrayUrlDark;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void i(String str) {
        this.byteArrayUrlDark = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Animation(id=");
        sb.append(this.id);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", repeat=");
        sb.append(this.repeat);
        sb.append(", urlDark=");
        sb.append(this.urlDark);
        sb.append(", byteArrayUrl=");
        sb.append(this.byteArrayUrl);
        sb.append(", byteArrayUrlDark=");
        return ho8.a(sb, this.byteArrayUrlDark, ')');
    }

    public /* synthetic */ Animation(String str, String str2, Action action, int i, String str3, String str4, String str5, int i2, zcl zclVar) {
        this(str, str2, action, i, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }
}

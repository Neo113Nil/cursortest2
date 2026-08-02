package com.vk.superapp.vkpay.checkout.feature.success.states;

import xsna.epx;
import xsna.gzs;
import xsna.s3q0;
import xsna.uf3;
import xsna.urd0;

/* compiled from: Action.kt */
/* loaded from: classes6.dex */
public final class ButtonAction extends Action {
    private final gzs<s3q0> action;
    private final StatusActionStyle style;
    private final String title;

    public ButtonAction(StatusActionStyle statusActionStyle, String str, gzs<s3q0> gzsVar) {
        super(statusActionStyle);
        this.style = statusActionStyle;
        this.title = str;
        this.action = gzsVar;
    }

    public final gzs<s3q0> d() {
        return this.action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return this.style == buttonAction.style && epx.f(this.title, buttonAction.title) && epx.f(this.action, buttonAction.action);
    }

    public final StatusActionStyle g() {
        return this.style;
    }

    public final String h() {
        return this.title;
    }

    public final int hashCode() {
        return this.action.hashCode() + urd0.a(this.style.hashCode() * 31, 31, this.title);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonAction(style=");
        sb.append(this.style);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", action=");
        return uf3.d(sb, this.action, ')');
    }
}

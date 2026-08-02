package com.vk.superapp.vkpay.checkout.feature.success.states;

import java.io.Serializable;

/* compiled from: StatusState.kt */
/* loaded from: classes6.dex */
public abstract class StatusState implements Serializable {
    private final Icon icon;
    private final String subtitle;
    private final String title;

    public StatusState(Icon icon, String str, String str2) {
        this.icon = icon;
        this.title = str;
        this.subtitle = str2;
    }

    public final Icon d() {
        return this.icon;
    }

    public String g() {
        return this.subtitle;
    }

    public String h() {
        return this.title;
    }
}

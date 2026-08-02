package com.vk.superapp.vkpay.checkout.feature.success.states;

import java.io.Serializable;

/* compiled from: Action.kt */
/* loaded from: classes6.dex */
public abstract class Action implements Serializable {
    private final StatusActionStyle style;

    public Action(StatusActionStyle statusActionStyle) {
        this.style = statusActionStyle;
    }
}

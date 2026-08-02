package com.vk.superapp.vkpay.checkout.feature.success;

import com.vk.superapp.vkpay.checkout.feature.success.states.Action;
import com.vk.superapp.vkpay.checkout.feature.success.states.ButtonAction;
import com.vk.superapp.vkpay.checkout.feature.success.states.StatusState;
import java.io.Serializable;
import xsna.epx;

/* compiled from: Status.kt */
/* loaded from: classes6.dex */
public final class Status implements Serializable {
    private final Action action;
    private final StatusState state;

    public Status(StatusState statusState, ButtonAction buttonAction) {
        this.state = statusState;
        this.action = buttonAction;
    }

    public final Action d() {
        return this.action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return epx.f(this.state, status.state) && epx.f(this.action, status.action);
    }

    public final StatusState g() {
        return this.state;
    }

    public final int hashCode() {
        return this.action.hashCode() + (this.state.hashCode() * 31);
    }

    public final String toString() {
        return "Status(state=" + this.state + ", action=" + this.action + ')';
    }
}

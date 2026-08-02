package com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BillingEvent.kt */
/* loaded from: classes18.dex */
public final class BillingEvent {

    @pmi0("action")
    private final EventAction action;

    @pmi0("action_params")
    private final ActionParams actionParams;

    @pmi0("type")
    private final EventType type;

    public BillingEvent(EventType eventType, EventAction eventAction, ActionParams actionParams) {
        this.type = eventType;
        this.action = eventAction;
        this.actionParams = actionParams;
    }

    public final EventAction a() {
        return this.action;
    }

    public final ActionParams b() {
        return this.actionParams;
    }

    public final EventType c() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingEvent)) {
            return false;
        }
        BillingEvent billingEvent = (BillingEvent) obj;
        return this.type == billingEvent.type && this.action == billingEvent.action && epx.f(this.actionParams, billingEvent.actionParams);
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (this.type.hashCode() * 31)) * 31;
        ActionParams actionParams = this.actionParams;
        return hashCode + (actionParams == null ? 0 : actionParams.hashCode());
    }

    public final String toString() {
        return "BillingEvent(type=" + this.type + ", action=" + this.action + ", actionParams=" + this.actionParams + ')';
    }

    public /* synthetic */ BillingEvent(EventType eventType, EventAction eventAction, ActionParams actionParams, int i, zcl zclVar) {
        this((i & 1) != 0 ? EventType.UNKNOWN : eventType, (i & 2) != 0 ? EventAction.UNKNOWN : eventAction, actionParams);
    }
}

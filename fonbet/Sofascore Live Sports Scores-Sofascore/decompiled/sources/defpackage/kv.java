package defpackage;

import com.ironsource.C4331u;
import com.sofascore.model.mvvm.model.StatusKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public enum kv {
    /* JADX INFO: Fake field, exist only in values array */
    SWITCH("switch"),
    SWITCH_ON("switch_on"),
    SWITCH_OFF("switch_off"),
    CLICK("click"),
    /* JADX INFO: Fake field, exist only in values array */
    REWARD(C4331u.j),
    IMPRESSION("impression"),
    BADGE_CHANGE("change_badge"),
    REACTION("reaction"),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_TURN_ON("turn_on"),
    /* JADX INFO: Fake field, exist only in values array */
    SETTINGS_TURN_OFF("turn_off"),
    /* JADX INFO: Fake field, exist only in values array */
    INTRO_MODAL_FINISHED(StatusKt.STATUS_FINISHED),
    FEEDBACK("feedback"),
    CHANGE_CHIP("change_chip"),
    /* JADX INFO: Fake field, exist only in values array */
    CANCEL(StatusKt.STATUS_CANCELED),
    /* JADX INFO: Fake field, exist only in values array */
    FINISH(StatusKt.STATUS_FINISHED);

    public final String a;

    kv(String str) {
        this.a = str;
    }
}

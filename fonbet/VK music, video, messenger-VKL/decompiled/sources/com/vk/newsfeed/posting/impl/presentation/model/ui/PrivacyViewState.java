package com.vk.newsfeed.posting.impl.presentation.model.ui;

import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: PrivacyViewState.kt */
/* loaded from: classes4.dex */
public final class PrivacyViewState {
    public final tlo0.f a;
    public final tlo0 b;
    public final RightAction c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrivacyViewState.kt */
    public static final class RightAction {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RightAction[] $VALUES;
        public static final RightAction Cancel;
        public static final RightAction Open;

        static {
            RightAction rightAction = new RightAction("Open", 0);
            Open = rightAction;
            RightAction rightAction2 = new RightAction("Cancel", 1);
            Cancel = rightAction2;
            RightAction[] rightActionArr = {rightAction, rightAction2};
            $VALUES = rightActionArr;
            $ENTRIES = new asp(rightActionArr);
        }

        public RightAction() {
            throw null;
        }

        public static RightAction valueOf(String str) {
            return (RightAction) Enum.valueOf(RightAction.class, str);
        }

        public static RightAction[] values() {
            return (RightAction[]) $VALUES.clone();
        }
    }

    public PrivacyViewState(tlo0.f fVar, tlo0 tlo0Var, RightAction rightAction, boolean z, boolean z2) {
        this.a = fVar;
        this.b = tlo0Var;
        this.c = rightAction;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyViewState)) {
            return false;
        }
        PrivacyViewState privacyViewState = (PrivacyViewState) obj;
        return epx.f(this.a, privacyViewState.a) && epx.f(this.b, privacyViewState.b) && this.c == privacyViewState.c && this.d == privacyViewState.d && this.e == privacyViewState.e;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        tlo0 tlo0Var = this.b;
        return Boolean.hashCode(this.e) + qoy.b((this.c.hashCode() + ((hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrivacyViewState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", rightAction=");
        sb.append(this.c);
        sb.append(", isAvailable=");
        sb.append(this.d);
        sb.append(", showOnboarding=");
        return q0.a(sb, this.e, ')');
    }
}

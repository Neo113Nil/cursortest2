package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSakSessionsEventItem implements SchemeStat$TypeAction.b {

    @pmi0("app_id")
    private final int appId;

    @pmi0("is_first_session")
    private final Boolean isFirstSession;

    @pmi0("package_name")
    private final String packageName;

    @pmi0("sak_version")
    private final String sakVersion;

    @pmi0("step")
    private final Step step;

    @pmi0("unauth_id")
    private final String unauthId;

    @pmi0("user_id")
    private final Long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Step {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Step[] $VALUES;

        @pmi0("complete_session")
        public static final Step COMPLETE_SESSION;

        @pmi0("init_sak")
        public static final Step INIT_SAK;

        @pmi0("start_session")
        public static final Step START_SESSION;

        static {
            Step step = new Step("INIT_SAK", 0);
            INIT_SAK = step;
            Step step2 = new Step("START_SESSION", 1);
            START_SESSION = step2;
            Step step3 = new Step("COMPLETE_SESSION", 2);
            COMPLETE_SESSION = step3;
            Step[] stepArr = {step, step2, step3};
            $VALUES = stepArr;
            $ENTRIES = new asp(stepArr);
        }

        private Step(String str, int i) {
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeSakSessionsEventItem(Step step, String str, String str2, int i, Boolean bool, Long l, String str3) {
        this.step = step;
        this.sakVersion = str;
        this.packageName = str2;
        this.appId = i;
        this.isFirstSession = bool;
        this.userId = l;
        this.unauthId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSakSessionsEventItem)) {
            return false;
        }
        SchemeStat$TypeSakSessionsEventItem schemeStat$TypeSakSessionsEventItem = (SchemeStat$TypeSakSessionsEventItem) obj;
        return this.step == schemeStat$TypeSakSessionsEventItem.step && epx.f(this.sakVersion, schemeStat$TypeSakSessionsEventItem.sakVersion) && epx.f(this.packageName, schemeStat$TypeSakSessionsEventItem.packageName) && this.appId == schemeStat$TypeSakSessionsEventItem.appId && epx.f(this.isFirstSession, schemeStat$TypeSakSessionsEventItem.isFirstSession) && epx.f(this.userId, schemeStat$TypeSakSessionsEventItem.userId) && epx.f(this.unauthId, schemeStat$TypeSakSessionsEventItem.unauthId);
    }

    public final int hashCode() {
        int a = shy.a(this.appId, urd0.a(urd0.a(this.step.hashCode() * 31, 31, this.sakVersion), 31, this.packageName), 31);
        Boolean bool = this.isFirstSession;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.userId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.unauthId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSakSessionsEventItem(step=");
        sb.append(this.step);
        sb.append(", sakVersion=");
        sb.append(this.sakVersion);
        sb.append(", packageName=");
        sb.append(this.packageName);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", isFirstSession=");
        sb.append(this.isFirstSession);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", unauthId=");
        return ho8.a(sb, this.unauthId, ')');
    }

    public /* synthetic */ SchemeStat$TypeSakSessionsEventItem(Step step, String str, String str2, int i, Boolean bool, Long l, String str3, int i2, zcl zclVar) {
        this(step, str, str2, i, (i2 & 16) != 0 ? null : bool, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : str3);
    }
}

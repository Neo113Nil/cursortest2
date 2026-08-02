package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$QuestionnaireFields {

    @pmi0("end_interaction_time")
    private final Integer endInteractionTime;

    @pmi0("int_value")
    private final Integer intValue;

    @pmi0("name")
    private final String name;

    @pmi0("start_interaction_time")
    private final Integer startInteractionTime;

    @pmi0("str_value")
    private final String strValue;

    public SchemeStat$QuestionnaireFields(String str, String str2, Integer num, Integer num2, Integer num3) {
        this.name = str;
        this.strValue = str2;
        this.intValue = num;
        this.startInteractionTime = num2;
        this.endInteractionTime = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$QuestionnaireFields)) {
            return false;
        }
        SchemeStat$QuestionnaireFields schemeStat$QuestionnaireFields = (SchemeStat$QuestionnaireFields) obj;
        return epx.f(this.name, schemeStat$QuestionnaireFields.name) && epx.f(this.strValue, schemeStat$QuestionnaireFields.strValue) && epx.f(this.intValue, schemeStat$QuestionnaireFields.intValue) && epx.f(this.startInteractionTime, schemeStat$QuestionnaireFields.startInteractionTime) && epx.f(this.endInteractionTime, schemeStat$QuestionnaireFields.endInteractionTime);
    }

    public final int hashCode() {
        int a = urd0.a(this.name.hashCode() * 31, 31, this.strValue);
        Integer num = this.intValue;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.startInteractionTime;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.endInteractionTime;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionnaireFields(name=");
        sb.append(this.name);
        sb.append(", strValue=");
        sb.append(this.strValue);
        sb.append(", intValue=");
        sb.append(this.intValue);
        sb.append(", startInteractionTime=");
        sb.append(this.startInteractionTime);
        sb.append(", endInteractionTime=");
        return uqi.b(sb, this.endInteractionTime, ')');
    }

    public /* synthetic */ SchemeStat$QuestionnaireFields(String str, String str2, Integer num, Integer num2, Integer num3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3);
    }
}

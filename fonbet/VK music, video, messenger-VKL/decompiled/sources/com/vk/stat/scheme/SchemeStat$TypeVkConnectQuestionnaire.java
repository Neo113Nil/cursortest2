package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVkConnectQuestionnaire implements SchemeStat$TypeAction.b {

    @pmi0("entry_point")
    private final String entryPoint;

    @pmi0("fields")
    private final List<SchemeStat$QuestionnaireFields> fields;

    @pmi0("questionnaire_type")
    private final QuestionnaireType questionnaireType;

    @pmi0("unauth_id")
    private final String unauthId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class QuestionnaireType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QuestionnaireType[] $VALUES;

        @pmi0("loyalty")
        public static final QuestionnaireType LOYALTY;

        static {
            QuestionnaireType questionnaireType = new QuestionnaireType("LOYALTY", 0);
            LOYALTY = questionnaireType;
            QuestionnaireType[] questionnaireTypeArr = {questionnaireType};
            $VALUES = questionnaireTypeArr;
            $ENTRIES = new asp(questionnaireTypeArr);
        }

        private QuestionnaireType(String str, int i) {
        }

        public static QuestionnaireType valueOf(String str) {
            return (QuestionnaireType) Enum.valueOf(QuestionnaireType.class, str);
        }

        public static QuestionnaireType[] values() {
            return (QuestionnaireType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeVkConnectQuestionnaire(String str, String str2, QuestionnaireType questionnaireType, List<SchemeStat$QuestionnaireFields> list) {
        this.entryPoint = str;
        this.unauthId = str2;
        this.questionnaireType = questionnaireType;
        this.fields = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVkConnectQuestionnaire)) {
            return false;
        }
        SchemeStat$TypeVkConnectQuestionnaire schemeStat$TypeVkConnectQuestionnaire = (SchemeStat$TypeVkConnectQuestionnaire) obj;
        return epx.f(this.entryPoint, schemeStat$TypeVkConnectQuestionnaire.entryPoint) && epx.f(this.unauthId, schemeStat$TypeVkConnectQuestionnaire.unauthId) && this.questionnaireType == schemeStat$TypeVkConnectQuestionnaire.questionnaireType && epx.f(this.fields, schemeStat$TypeVkConnectQuestionnaire.fields);
    }

    public final int hashCode() {
        int hashCode = this.entryPoint.hashCode() * 31;
        String str = this.unauthId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        QuestionnaireType questionnaireType = this.questionnaireType;
        int hashCode3 = (hashCode2 + (questionnaireType == null ? 0 : questionnaireType.hashCode())) * 31;
        List<SchemeStat$QuestionnaireFields> list = this.fields;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVkConnectQuestionnaire(entryPoint=");
        sb.append(this.entryPoint);
        sb.append(", unauthId=");
        sb.append(this.unauthId);
        sb.append(", questionnaireType=");
        sb.append(this.questionnaireType);
        sb.append(", fields=");
        return ms9.a(')', sb, this.fields);
    }

    public /* synthetic */ SchemeStat$TypeVkConnectQuestionnaire(String str, String str2, QuestionnaireType questionnaireType, List list, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : questionnaireType, (i & 8) != 0 ? null : list);
    }
}

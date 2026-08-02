package com.vk.clips.sdk.shared.questionnarie;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: QuestionnaireTriggerDto.kt */
/* loaded from: classes17.dex */
public final class QuestionnaireTriggerDto extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<QuestionnaireTriggerDto> CREATOR = new a();
    public final String b;
    public final List<String> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<QuestionnaireTriggerDto> {
        @Override // com.vk.core.serialize.Serializer.c
        public final QuestionnaireTriggerDto a(Serializer serializer) {
            return new QuestionnaireTriggerDto(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new QuestionnaireTriggerDto[i];
        }
    }

    public QuestionnaireTriggerDto(String str, List<String> list) {
        this.b = str;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.l0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionnaireTriggerDto)) {
            return false;
        }
        QuestionnaireTriggerDto questionnaireTriggerDto = (QuestionnaireTriggerDto) obj;
        return epx.f(this.b, questionnaireTriggerDto.b) && epx.f(this.c, questionnaireTriggerDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionnaireTriggerDto(type=");
        sb.append(this.b);
        sb.append(", itemIds=");
        return ms9.a(')', sb, this.c);
    }

    public QuestionnaireTriggerDto(Serializer serializer, zcl zclVar) {
        this(serializer.H(), com.vk.core.serialize.a.a(serializer));
    }
}

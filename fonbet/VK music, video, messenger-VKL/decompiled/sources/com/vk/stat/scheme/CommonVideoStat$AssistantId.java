package com.vk.stat.scheme;

import xsna.a9y;
import xsna.b9y;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;

/* compiled from: CommonVideoStat.kt */
/* loaded from: classes11.dex */
public final class CommonVideoStat$AssistantId {
    public final transient String a;
    public final transient String b;

    @pmi0("chat_id")
    private final FilteredString filteredChatId;

    @pmi0("message_id")
    private final FilteredString filteredMessageId;

    /* compiled from: CommonVideoStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVideoStat$AssistantId>, a9y<CommonVideoStat$AssistantId> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonVideoStat$AssistantId(fai.s(x9yVar, "message_id"), fai.C(x9yVar, "chat_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVideoStat$AssistantId commonVideoStat$AssistantId = (CommonVideoStat$AssistantId) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("message_id", commonVideoStat$AssistantId.a);
            x9yVar.o("chat_id", commonVideoStat$AssistantId.b);
            return x9yVar;
        }
    }

    public CommonVideoStat$AssistantId(String str, String str2) {
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredMessageId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredChatId = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVideoStat$AssistantId)) {
            return false;
        }
        CommonVideoStat$AssistantId commonVideoStat$AssistantId = (CommonVideoStat$AssistantId) obj;
        return epx.f(this.a, commonVideoStat$AssistantId.a) && epx.f(this.b, commonVideoStat$AssistantId.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AssistantId(messageId=");
        sb.append(this.a);
        sb.append(", chatId=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ CommonVideoStat$AssistantId(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}

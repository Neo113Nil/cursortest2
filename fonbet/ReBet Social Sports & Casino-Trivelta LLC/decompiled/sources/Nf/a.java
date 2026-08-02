package Nf;

import Gb.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class a {

    @c("bot_id")
    @Nullable
    private final String botId;

    @c("encrypted_visitor_info")
    @Nullable
    private final String encryptedVisitorInfo;

    @c("triggered_id")
    @Nullable
    private final String triggeredId;

    public a(String str, String str2, String str3) {
        this.botId = str;
        this.triggeredId = str2;
        this.encryptedVisitorInfo = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.botId, aVar.botId) && Intrinsics.areEqual(this.triggeredId, aVar.triggeredId) && Intrinsics.areEqual(this.encryptedVisitorInfo, aVar.encryptedVisitorInfo);
    }

    public int hashCode() {
        String str = this.botId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.triggeredId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedVisitorInfo;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "TriggerAcknowledgePayload(botId=" + this.botId + ", triggeredId=" + this.triggeredId + ", encryptedVisitorInfo=" + this.encryptedVisitorInfo + ')';
    }
}

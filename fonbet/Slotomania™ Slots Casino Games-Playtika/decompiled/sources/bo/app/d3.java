package bo.app;

import com.braze.Constants;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0016"}, d2 = {"Lbo/app/d3;", "", "", "toString", "Lbo/app/t2;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/y2;", "b", "Lcom/braze/models/inappmessage/IInAppMessage;", "c", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "", "hashCode", "other", "", "equals", "triggerEvent", "triggeredAction", "inAppMessage", "userId", "<init>", "(Lbo/app/t2;Lbo/app/y2;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final /* data */ class d3 {
    private final t2 a;
    private final y2 b;
    private final IInAppMessage c;
    private final String d;

    public d3(t2 triggerEvent, y2 triggeredAction, IInAppMessage inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.a = triggerEvent;
        this.b = triggeredAction;
        this.c = inAppMessage;
        this.d = str;
    }

    /* renamed from: a, reason: from getter */
    public final t2 getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final y2 getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final IInAppMessage getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) other;
        return Intrinsics.areEqual(this.a, d3Var.a) && Intrinsics.areEqual(this.b, d3Var.b) && Intrinsics.areEqual(this.c, d3Var.c) && Intrinsics.areEqual(this.d, d3Var.d);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return StringsKt.trimIndent("\n             " + JsonUtils.getPrettyPrintedString(this.c.getJsonKey()) + "\n             Triggered Action Id: " + this.b.getB() + "\n             Trigger Event: " + this.a + "\n             User Id: " + ((Object) this.d) + "\n        ");
    }
}

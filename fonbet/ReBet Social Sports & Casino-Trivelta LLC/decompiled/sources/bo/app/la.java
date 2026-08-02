package bo.app;

import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class la {

    /* renamed from: a, reason: collision with root package name */
    public final v9 f25723a;

    /* renamed from: b, reason: collision with root package name */
    public final y9 f25724b;

    /* renamed from: c, reason: collision with root package name */
    public final IInAppMessage f25725c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25726d;

    public la(v9 triggerEvent, y9 triggeredAction, IInAppMessage inAppMessage, String str) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.f25723a = triggerEvent;
        this.f25724b = triggeredAction;
        this.f25725c = inAppMessage;
        this.f25726d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return Intrinsics.areEqual(this.f25723a, laVar.f25723a) && Intrinsics.areEqual(this.f25724b, laVar.f25724b) && Intrinsics.areEqual(this.f25725c, laVar.f25725c) && Intrinsics.areEqual(this.f25726d, laVar.f25726d);
    }

    public final int hashCode() {
        int hashCode = (this.f25725c.hashCode() + ((this.f25724b.hashCode() + (this.f25723a.hashCode() * 31)) * 31)) * 31;
        String str = this.f25726d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return StringsKt.trimIndent("\n             " + JsonUtils.getPrettyPrintedString(this.f25725c.getKey()) + "\n             Triggered Action Id: " + ((rg) this.f25724b).f26028a + "\n             Trigger Event: " + this.f25723a + "\n             User Id: " + this.f25726d + "\n        ");
    }
}

package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lbo/app/d5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbo/app/a2;", "originalRequest", "Lbo/app/a2;", "b", "()Lbo/app/a2;", "sdkAuthErrorCode", "I", "c", "()I", "sdkAuthErrorReason", "Ljava/lang/String;", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Ljava/lang/String;", "errorMessage", Constants.BRAZE_PUSH_CONTENT_KEY, "<init>", "(Lbo/app/a2;ILjava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class d5 implements o2 {
    private final a2 a;
    private final int b;
    private final String c;
    private final String d;

    public d5(a2 originalRequest, int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.a = originalRequest;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // bo.app.o2
    /* renamed from: a, reason: from getter */
    public String getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public a2 getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public int getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public String getC() {
        return this.c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) other;
        return Intrinsics.areEqual(getA(), d5Var.getA()) && getB() == d5Var.getB() && Intrinsics.areEqual(getC(), d5Var.getC()) && Intrinsics.areEqual(getD(), d5Var.getD());
    }

    public int hashCode() {
        return (((((getA().hashCode() * 31) + Integer.hashCode(getB())) * 31) + (getC() == null ? 0 : getC().hashCode())) * 31) + (getD() != null ? getD().hashCode() : 0);
    }

    public String toString() {
        return "{code = " + getB() + ", reason = " + ((Object) getC()) + ", message = " + ((Object) getD()) + AbstractJsonLexerKt.END_OBJ;
    }
}

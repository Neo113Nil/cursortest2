package v0;

import io.appmetrica.analytics.impl.C0122e9;
import kotlin.jvm.internal.Intrinsics;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24379a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i5) {
        this("androidx.credentials.TYPE_ABORT_ERROR");
        switch (i5) {
            case 1:
                this("androidx.credentials.TYPE_CONSTRAINT_ERROR");
                break;
            case 3:
                this("androidx.credentials.TYPE_DATA_ERROR");
                break;
            case 4:
                this("androidx.credentials.TYPE_ENCODING_ERROR");
                break;
            case 10:
                this("androidx.credentials.TYPE_INVALID_STATE_ERROR");
                break;
            case 12:
                this("androidx.credentials.TYPE_NETWORK_ERROR");
                break;
            case 14:
                this("androidx.credentials.TYPE_NOT_ALLOWED_ERROR");
                break;
            case 16:
                this("androidx.credentials.TYPE_NOT_READABLE_ERROR");
                break;
            case 17:
                this("androidx.credentials.TYPE_NOT_SUPPORTED_ERROR");
                break;
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                this("androidx.credentials.TYPE_SECURITY_ERROR");
                break;
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                this("androidx.credentials.TYPE_TIMEOUT_ERROR");
                break;
            case C0122e9.G /* 26 */:
                this("androidx.credentials.TYPE_UNKNOWN_ERROR");
                break;
            default:
                break;
        }
    }

    public a(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f24379a = type;
    }
}

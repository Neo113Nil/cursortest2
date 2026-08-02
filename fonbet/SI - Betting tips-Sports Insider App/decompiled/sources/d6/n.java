package d6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends BasePendingResult {

    /* renamed from: k, reason: collision with root package name */
    public final Status f8261k;

    public n(Status status) {
        super(null);
        this.f8261k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l r0(Status status) {
        return this.f8261k;
    }
}

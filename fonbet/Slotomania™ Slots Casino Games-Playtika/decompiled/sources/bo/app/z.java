package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lbo/app/z;", "Lbo/app/b2;", "", "cardId", "Lbo/app/x1;", "c", Constants.BRAZE_PUSH_CONTENT_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "b", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class z implements b2 {
    @Override // bo.app.b2
    public x1 a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return j.h.a(cardId);
    }

    @Override // bo.app.b2
    public x1 b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return j.h.b(cardId);
    }

    @Override // bo.app.b2
    public x1 c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return j.h.d(cardId);
    }

    @Override // bo.app.b2
    public x1 d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return j.h.c(cardId);
    }
}

package d30;

import J4.A;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class r extends A {
    @Override // J4.A
    @NonNull
    public final String createQuery() {
        return "DELETE FROM mobile_health_events WHERE id NOT IN (SELECT id FROM mobile_health_events ORDER BY id DESC LIMIT ?)";
    }
}

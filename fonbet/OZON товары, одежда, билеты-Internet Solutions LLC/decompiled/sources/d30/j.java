package d30;

import J4.A;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class j extends A {
    @Override // J4.A
    @NonNull
    public final String createQuery() {
        return "DELETE FROM graylog_event WHERE id NOT IN (SELECT id FROM graylog_event ORDER BY id DESC LIMIT ?)";
    }
}

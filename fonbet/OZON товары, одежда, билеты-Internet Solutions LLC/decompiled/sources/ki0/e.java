package ki0;

import J4.A;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class e extends A {
    @Override // J4.A
    @NonNull
    public final String createQuery() {
        return "DELETE FROM `sqlite_sequence` WHERE name = \"performance_event\"";
    }
}

package li0;

import J4.A;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
final class i extends A {
    @Override // J4.A
    @NonNull
    public final String createQuery() {
        return "UPDATE event\n            SET \n                markEventToSend = 0 \n            WHERE \n                markEventToSend != 0";
    }
}

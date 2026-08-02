package mi0;

import android.util.Log;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.I;
import org.jetbrains.annotations.NotNull;

/* renamed from: mi0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8337g implements InterfaceC8336f {
    @Override // mi0.InterfaceC8336f
    public final void a(@NotNull I events) {
        Intrinsics.checkNotNullParameter(events, "events");
        Iterator it = events.iterator();
        while (true) {
            I.a aVar = (I.a) it;
            if (!aVar.hasNext()) {
                return;
            } else {
                Log.i("OzonTracker/business", (String) aVar.next());
            }
        }
    }

    @Override // mi0.InterfaceC8336f
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("OzonTracker/tech_info", message);
    }
}

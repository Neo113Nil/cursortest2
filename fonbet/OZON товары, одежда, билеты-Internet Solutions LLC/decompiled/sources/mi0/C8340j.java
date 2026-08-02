package mi0;

import Sc.InterfaceC4008j;
import android.util.Log;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

/* renamed from: mi0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8340j implements InterfaceC8339i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f75997a;

    /* renamed from: mi0.j$a */
    static final class a extends AbstractC7737t implements Function0<JsonAdapter<TraceEntity>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Moshi f75998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Moshi moshi) {
            super(0);
            this.f75998b = moshi;
        }

        @Override // kotlin.jvm.functions.Function0
        public final JsonAdapter<TraceEntity> invoke() {
            return this.f75998b.c(TraceEntity.class);
        }
    }

    public C8340j(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f75997a = Sc.k.b(new a(moshi));
    }

    @Override // mi0.InterfaceC8339i
    public final void a(@NotNull List<TraceEntity> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<T> it = entities.iterator();
        while (it.hasNext()) {
            Log.i("OzonTracker/perf", ((JsonAdapter) this.f75997a.getValue()).toJson((TraceEntity) it.next()));
        }
    }

    @Override // mi0.InterfaceC8339i
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i("OzonTracker/perf", message);
    }
}

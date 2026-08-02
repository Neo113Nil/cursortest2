package ru.ozon.fintech.features.cbottombase.models.action.adapter;

import D3.g;
import Sc.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2Action;
import ru.ozon.fintech.features.cbottombase.models.action.Cbottom2SharingAction;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/cbottombase/models/action/adapter/Cbottom2ActionAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/cbottombase/models/action/Cbottom2Action;)V", "Lcom/squareup/moshi/Moshi;", "getMoshi", "()Lcom/squareup/moshi/Moshi;", "Companion", "a", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Cbottom2ActionAdapter extends JsonAdapter<Cbottom2Action> {

    @NotNull
    private static final String TYPE = "name";

    @NotNull
    private final Moshi moshi;

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f95041a;

        static {
            int[] iArr = new int[Cbottom2Action.Type.values().length];
            try {
                iArr[Cbottom2Action.Type.SHARE_FILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f95041a = iArr;
        }
    }

    public Cbottom2ActionAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    @NotNull
    public final Moshi getMoshi() {
        return this.moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Cbottom2Action fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n q11 = reader.q();
        q11.beginObject();
        boolean z11 = false;
        String str = null;
        while (q11.hasNext() && !z11) {
            if (Intrinsics.d(q11.nextName(), "name")) {
                str = q11.nextString();
                z11 = true;
            } else {
                q11.skipValue();
            }
        }
        if (str == null) {
            return null;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (b.f95041a[Cbottom2Action.Type.valueOf(upperCase).ordinal()] == 1) {
            return (Cbottom2Action) g.c(Cbottom2SharingAction.class, this.moshi, reader);
        }
        throw new o();
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Cbottom2Action value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value != null) {
            if (b.f95041a[value.getName().ordinal()] != 1) {
                throw new o();
            }
            this.moshi.c(Cbottom2SharingAction.class).mo44toJson(writer, (x) value);
        }
    }
}

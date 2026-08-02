package ru.ozon.android.flashbar.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qi.C9060a;
import ru.ozon.app.android.atoms.common.JsonUtilsKt;
import ru.ozon.app.android.atoms.data.button.ButtonV3Atom;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/android/flashbar/model/RestrictionActionButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "", "type", "parseAction", "(Lcom/squareup/moshi/n;Ljava/lang/String;)Ljava/lang/Object;", "reader", AppMeasurementSdk.ConditionalUserProperty.NAME, "getNestedAction", "findActionButtonName", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "Lcom/squareup/moshi/Moshi;", "Companion", "a", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class RestrictionActionButtonJsonAdapter extends JsonAdapter<Object> {
    public static final int $stable = 8;

    @NotNull
    private static final Map<String, Class<? extends Object>> actionTypes = U.j(new Pair("action", C9060a.class), new Pair("getButton", ButtonV3Atom.GetButton.class), new Pair(DynamicElementDTO.SMALL_BORDERLESS_BUTTON, ButtonV3Atom.SmallBorderlessButton.class));

    @NotNull
    private final Moshi moshi;

    public RestrictionActionButtonJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    private final Object findActionButtonName(n nVar, String str) {
        n.a a11 = n.a.C0918a.a(str);
        nVar.beginObject();
        Object obj = null;
        while (nVar.hasNext()) {
            if (nVar.v(a11) != 0) {
                nVar.y();
                nVar.skipValue();
            } else if (nVar.p() == n.b.BEGIN_OBJECT) {
                obj = parseAction(nVar, str);
            } else {
                nVar.skipValue();
            }
        }
        nVar.endObject();
        nVar.close();
        return obj;
    }

    private final Object getNestedAction(n reader, String name) throws IOException {
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        Object findActionButtonName = findActionButtonName(q11, name);
        if (findActionButtonName != null) {
            JsonUtilsKt.skipReader(reader);
        }
        return findActionButtonName;
    }

    private final Object parseAction(n nVar, String str) {
        return this.moshi.c((Class) U.e(actionTypes, str)).fromJson(nVar);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        String findNameInJsonMap = JsonUtilsKt.findNameInJsonMap(q11, actionTypes);
        if (findNameInJsonMap != null) {
            Object nestedAction = getNestedAction(reader, findNameInJsonMap);
            return nestedAction == null ? parseAction(reader, findNameInJsonMap) : nestedAction;
        }
        reader.skipValue();
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, Object value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value instanceof C9060a) {
            this.moshi.c(C9060a.class).mo44toJson(writer, (x) value);
            return;
        }
        if (value instanceof ButtonV3Atom.GetButton) {
            this.moshi.c(ButtonV3Atom.GetButton.class).mo44toJson(writer, (x) value);
        } else if (value instanceof ButtonV3Atom.SmallBorderlessButton) {
            this.moshi.c(ButtonV3Atom.SmallBorderlessButton.class).mo44toJson(writer, (x) value);
        } else {
            writer.x();
        }
    }
}

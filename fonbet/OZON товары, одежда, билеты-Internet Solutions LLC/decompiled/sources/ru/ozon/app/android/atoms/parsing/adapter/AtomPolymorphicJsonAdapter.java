package ru.ozon.app.android.atoms.parsing.adapter;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.AtomDTO;
import ru.ozon.app.android.atoms.parsing.ParserStateHolder;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0014\u001a\u00020\u000f*\u00020\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f0\u0012H\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u000bJ\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/atoms/parsing/adapter/AtomPolymorphicJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/AtomDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/n;", "", "type", "parseAtom", "(Lcom/squareup/moshi/n;Ljava/lang/String;)Lru/ozon/app/android/atoms/data/AtomDTO;", "reader", AppMeasurementSdk.ConditionalUserProperty.NAME, "getNestedAtom", "", "skipReader", "(Lcom/squareup/moshi/n;)V", "Lkotlin/Function1;", "action", "body", "(Lcom/squareup/moshi/n;Lkotlin/jvm/functions/Function1;)V", "findAtom", "findAtomName", "(Lcom/squareup/moshi/n;)Ljava/lang/String;", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/data/AtomDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/atoms/data/AtomDTO;)V", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/Moshi;", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomPolymorphicJsonAdapter extends JsonAdapter<AtomDTO> {
    public static final int $stable = 8;

    @NotNull
    private final Moshi moshi;

    public AtomPolymorphicJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    private final void body(n nVar, Function1<? super n, Unit> function1) {
        nVar.beginObject();
        function1.invoke(nVar);
        nVar.endObject();
    }

    private final AtomDTO findAtom(n nVar, String str) {
        n.a a11 = n.a.C0918a.a(str);
        nVar.beginObject();
        AtomDTO atomDTO = null;
        while (nVar.hasNext()) {
            if (nVar.v(a11) != 0) {
                nVar.y();
                nVar.skipValue();
            } else if (nVar.p() == n.b.BEGIN_OBJECT) {
                atomDTO = parseAtom(nVar, str);
            } else {
                nVar.skipValue();
            }
        }
        nVar.endObject();
        nVar.close();
        return atomDTO;
    }

    private final String findAtomName(n reader) throws IOException {
        reader.beginObject();
        if (!reader.hasNext()) {
            return null;
        }
        ParserStateHolder.INSTANCE.getConfig$design_system_release();
        throw null;
    }

    private final AtomDTO getNestedAtom(n reader, String name) throws IOException {
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        AtomDTO findAtom = findAtom(q11, name);
        if (findAtom != null) {
            skipReader(reader);
        }
        return findAtom;
    }

    private final AtomDTO parseAtom(n nVar, String str) {
        ParserStateHolder.INSTANCE.getConfig$design_system_release();
        throw null;
    }

    private final void skipReader(n nVar) {
        nVar.beginObject();
        while (nVar.hasNext()) {
            nVar.y();
            nVar.skipValue();
        }
        nVar.endObject();
    }

    @NotNull
    public String toString() {
        ParserStateHolder.INSTANCE.getConfig$design_system_release();
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AtomDTO fromJson(@NotNull n reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        String findAtomName = findAtomName(q11);
        if (findAtomName != null) {
            AtomDTO nestedAtom = getNestedAtom(reader, findAtomName);
            return nestedAtom == null ? parseAtom(reader, findAtomName) : nestedAtom;
        }
        reader.skipValue();
        ParserStateHolder.INSTANCE.getConfig$design_system_release();
        throw null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AtomDTO value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            return;
        }
        ParserStateHolder.INSTANCE.getConfig$design_system_release();
        throw null;
    }
}

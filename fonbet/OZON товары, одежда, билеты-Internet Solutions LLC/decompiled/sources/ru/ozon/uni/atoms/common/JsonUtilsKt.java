package ru.ozon.uni.atoms.common;

import com.squareup.moshi.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/squareup/moshi/n;", "", "skipReader", "(Lcom/squareup/moshi/n;)V", "reader", "", "", "", "namesMap", "findNameInJsonMap", "(Lcom/squareup/moshi/n;Ljava/util/Map;)Ljava/lang/String;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class JsonUtilsKt {
    public static final String findNameInJsonMap(@NotNull n reader, @NotNull Map<String, ? extends Object> namesMap) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(namesMap, "namesMap");
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.v(n.a.C0918a.a("type")) != -1) {
                String nextString = reader.nextString();
                reader.close();
                if (namesMap.containsKey(nextString)) {
                    return nextString;
                }
                return null;
            }
            reader.y();
            reader.skipValue();
        }
        return null;
    }

    public static final void skipReader(@NotNull n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        nVar.beginObject();
        while (nVar.hasNext()) {
            nVar.y();
            nVar.skipValue();
        }
        nVar.endObject();
    }
}

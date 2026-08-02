package ru.ozon.moshi.adapters.serialize.proto;

import C.o0;
import Fj.c;
import N3.C3660k;
import Tc.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import sf.F;
import sf.InterfaceC9682h;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f*\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0002*\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\r*\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u001c\u0010&\u001a\n %*\u0004\u0018\u00010$0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOfAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOf;", "annotation", "", "Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOfSignature;", "signatures", "<init>", "(Lcom/squareup/moshi/Moshi;Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOf;Ljava/util/List;)V", "", "", "asMap", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/squareup/moshi/n;", "reader", "findSignature", "(Lcom/squareup/moshi/n;)Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOfSignature;", "signature", "parse", "(Lcom/squareup/moshi/n;Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOfSignature;)Ljava/lang/Object;", "field", "(Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOfSignature;)Ljava/lang/String;", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "Lcom/squareup/moshi/Moshi;", "Lru/ozon/moshi/adapters/serialize/proto/ProtoOneOf;", "Ljava/util/List;", "Lcom/squareup/moshi/n$a;", "kotlin.jvm.PlatformType", "options", "Lcom/squareup/moshi/n$a;", "signatureMap", "Ljava/util/Map;", "moshi-adapters_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProtoOneOfAdapter extends JsonAdapter<Object> {

    @NotNull
    private final ProtoOneOf annotation;

    @NotNull
    private final Moshi moshi;
    private final n.a options;

    @NotNull
    private final Map<String, ProtoOneOfSignature> signatureMap;

    @NotNull
    private final List<ProtoOneOfSignature> signatures;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoOneOfAdapter(@NotNull Moshi moshi, @NotNull ProtoOneOf annotation, @NotNull List<? extends ProtoOneOfSignature> signatures) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        this.moshi = moshi;
        this.annotation = annotation;
        this.signatures = signatures;
        this.options = n.a.C0918a.a(annotation.label());
        this.signatureMap = asMap(signatures);
    }

    private final Map<String, ProtoOneOfSignature> asMap(List<? extends ProtoOneOfSignature> list) {
        d builder = new d();
        for (ProtoOneOfSignature protoOneOfSignature : list) {
            String name = protoOneOfSignature.name();
            String fieldName = protoOneOfSignature.fieldName();
            if (!h.K(fieldName) && !fieldName.equals(name)) {
                builder.put(fieldName, protoOneOfSignature);
            }
            builder.put(name, protoOneOfSignature);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.u();
    }

    private final String field(ProtoOneOfSignature protoOneOfSignature) {
        String fieldName = protoOneOfSignature.fieldName();
        return h.K(fieldName) ? protoOneOfSignature.name() : fieldName;
    }

    private final ProtoOneOfSignature findSignature(n reader) {
        String nextString;
        ProtoOneOfSignature protoOneOfSignature;
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.v(this.options) != -1) {
                nextString = reader.nextString();
                protoOneOfSignature = this.signatureMap.get(nextString);
            } else {
                nextString = reader.nextName();
                protoOneOfSignature = this.signatureMap.get(nextString);
                if (protoOneOfSignature == null) {
                    reader.skipValue();
                }
            }
            reader.close();
            if (protoOneOfSignature != null) {
                return protoOneOfSignature;
            }
            throw new k(o0.c(C3660k.d("Expected one of:\n-> ", C7714v.V(this.signatures, ",\n-> ", null, "\n", null, 58), "for key ", this.annotation.label(), " but found \""), nextString, "\". Register a subtype for this label."));
        }
        return null;
    }

    private final Object parse(n nVar, ProtoOneOfSignature protoOneOfSignature) {
        String field = field(protoOneOfSignature);
        nVar.beginObject();
        Object obj = null;
        while (nVar.hasNext()) {
            if (Intrinsics.d(nVar.nextName(), field) && nVar.p() == n.b.BEGIN_OBJECT) {
                obj = this.moshi.c(protoOneOfSignature.type()).fromJson(nVar);
            } else {
                nVar.skipValue();
            }
        }
        nVar.endObject();
        return obj;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        n q11 = reader.q();
        Intrinsics.checkNotNullExpressionValue(q11, "peekJson(...)");
        ProtoOneOfSignature findSignature = findSignature(q11);
        if (findSignature == null) {
            return null;
        }
        return parse(reader, findSignature);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, Object value) {
        Object obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.x();
            return;
        }
        Iterator<T> it = this.signatureMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (N.b(((ProtoOneOfSignature) obj).type()).A(value)) {
                    break;
                }
            }
        }
        if (obj == null) {
            List<ProtoOneOfSignature> list = this.signatures;
            Class<?> cls = value.getClass();
            StringBuilder sb2 = new StringBuilder("Expected one of ");
            sb2.append(list);
            sb2.append(" but found ");
            sb2.append(value);
            sb2.append(", a ");
            throw new IllegalArgumentException(c.c(sb2, cls, ". Register this subtype.").toString());
        }
        ProtoOneOfSignature protoOneOfSignature = (ProtoOneOfSignature) obj;
        writer.j();
        if (this.annotation.label().length() > 0) {
            writer.w(this.annotation.label()).R(protoOneOfSignature.name());
        }
        F Z11 = writer.w(field(protoOneOfSignature)).Z();
        try {
            this.moshi.d(protoOneOfSignature.type()).toJson((InterfaceC9682h) Z11, (F) value);
            Unit unit = Unit.f71690a;
            Z11.close();
            writer.p();
        } finally {
        }
    }
}

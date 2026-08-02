package ru.ozon.app.android.atoms.proto.adapter;

import C.o0;
import N3.C3660k;
import Nk.a;
import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.proto.OneOfSignature;
import ru.ozon.app.android.atoms.proto.ProtoOneOf;
import sf.F;
import sf.InterfaceC9682h;

@InterfaceC3999a
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u0002*\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001a\u001a\u00020\u0015*\u00020\t2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00150\u0018H\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R0\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00120+j\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0012`,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/atoms/proto/adapter/ProtoOneOfAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "Lru/ozon/app/android/atoms/proto/ProtoOneOf;", "annotation", "<init>", "(Lcom/squareup/moshi/Moshi;Lru/ozon/app/android/atoms/proto/ProtoOneOf;)V", "Lcom/squareup/moshi/n;", "reader", "Lru/ozon/app/android/atoms/proto/adapter/ProtoOneOfAdapter$OneOfType;", "oneOfType", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/atoms/proto/adapter/ProtoOneOfAdapter$OneOfType;", "Ljava/lang/Class;", "type", "parseType", "(Lcom/squareup/moshi/n;Ljava/lang/Class;)Ljava/lang/Object;", "Lru/ozon/app/android/atoms/proto/OneOfSignature;", "parseOneOfType", "(Lcom/squareup/moshi/n;Lru/ozon/app/android/atoms/proto/OneOfSignature;)Ljava/lang/Object;", "", "skipReader", "(Lcom/squareup/moshi/n;)V", "Lkotlin/Function1;", "action", "body", "(Lcom/squareup/moshi/n;Lkotlin/jvm/functions/Function1;)V", "findObject", "", "field", "(Lru/ozon/app/android/atoms/proto/OneOfSignature;)Ljava/lang/String;", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Object;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/Moshi;", "Lru/ozon/app/android/atoms/proto/ProtoOneOf;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "signatures", "Ljava/util/HashMap;", "Lcom/squareup/moshi/n$a;", "labelKeyOptions$delegate", "LSc/j;", "getLabelKeyOptions", "()Lcom/squareup/moshi/n$a;", "labelKeyOptions", "OneOfType", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProtoOneOfAdapter extends JsonAdapter<Object> {

    @NotNull
    private final ProtoOneOf annotation;

    /* renamed from: labelKeyOptions$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j labelKeyOptions;

    @NotNull
    private final Moshi moshi;

    @NotNull
    private final HashMap<String, OneOfSignature> signatures;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/atoms/proto/adapter/ProtoOneOfAdapter$OneOfType;", "", "signature", "Lru/ozon/app/android/atoms/proto/OneOfSignature;", "<init>", "(Lru/ozon/app/android/atoms/proto/OneOfSignature;)V", "getSignature", "()Lru/ozon/app/android/atoms/proto/OneOfSignature;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class OneOfType {

        @NotNull
        private final OneOfSignature signature;

        public OneOfType(@NotNull OneOfSignature signature) {
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.signature = signature;
        }

        @NotNull
        public final OneOfSignature getSignature() {
            return this.signature;
        }
    }

    public ProtoOneOfAdapter(@NotNull Moshi moshi, @NotNull ProtoOneOf annotation) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.moshi = moshi;
        this.annotation = annotation;
        OneOfSignature[] signatures = annotation.signatures();
        HashMap<String, OneOfSignature> hashMap = new HashMap<>();
        for (OneOfSignature oneOfSignature : signatures) {
            hashMap.put(field(oneOfSignature), oneOfSignature);
        }
        this.signatures = hashMap;
        this.labelKeyOptions = k.b(new ProtoOneOfAdapter$labelKeyOptions$2(this));
    }

    private final void body(n nVar, Function1<? super n, Unit> function1) {
        nVar.beginObject();
        function1.invoke(nVar);
        nVar.endObject();
    }

    private final String field(OneOfSignature oneOfSignature) {
        return !h.K(oneOfSignature.fieldName()) ? oneOfSignature.fieldName() : oneOfSignature.name();
    }

    private final Object findObject(n nVar, OneOfSignature oneOfSignature) {
        n.a a11 = n.a.C0918a.a(field(oneOfSignature));
        nVar.beginObject();
        Object obj = null;
        while (nVar.hasNext()) {
            if (nVar.v(a11) != 0) {
                nVar.y();
                nVar.skipValue();
            } else if (nVar.p() == n.b.BEGIN_OBJECT) {
                obj = parseType(nVar, oneOfSignature.type());
            } else {
                nVar.skipValue();
            }
        }
        nVar.endObject();
        nVar.close();
        return obj;
    }

    private final n.a getLabelKeyOptions() {
        return (n.a) this.labelKeyOptions.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final OneOfType oneOfType(n reader) throws IOException {
        String nextString;
        OneOfSignature oneOfSignature;
        reader.beginObject();
        while (reader.hasNext()) {
            if (this.annotation.label().length() <= 0) {
                nextString = reader.nextName();
                oneOfSignature = this.signatures.get(nextString);
                if (oneOfSignature == null) {
                    reader.skipValue();
                } else if (oneOfSignature != null) {
                }
            } else {
                if (reader.v(getLabelKeyOptions()) != -1) {
                    nextString = reader.nextString();
                    OneOfSignature[] signatures = this.annotation.signatures();
                    int length = signatures.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            oneOfSignature = null;
                            break;
                        }
                        oneOfSignature = signatures[i11];
                        if (Intrinsics.d(oneOfSignature.name(), nextString)) {
                            break;
                        }
                        i11++;
                    }
                    if (oneOfSignature != null) {
                        throw new com.squareup.moshi.k(o0.c(C3660k.d("Expected one of:\n-> ", C7705l.P(this.annotation.signatures(), ",\n-> ", null, "\n", null, 58), "for key ", this.annotation.label(), " but found \""), nextString, "\". Register a subtype for this label."));
                    }
                    reader.close();
                    return new OneOfType(oneOfSignature);
                }
                reader.y();
                reader.skipValue();
            }
        }
        throw new com.squareup.moshi.k(a.b("Missing label for ", this.annotation.label()));
    }

    private final Object parseOneOfType(n reader, OneOfSignature type) throws IOException {
        Object findObject = findObject(reader.q(), type);
        skipReader(reader);
        return findObject;
    }

    private final Object parseType(n nVar, Class<?> cls) {
        return this.moshi.c(cls).fromJson(nVar);
    }

    private final void skipReader(n nVar) {
        nVar.beginObject();
        while (nVar.hasNext()) {
            nVar.y();
            nVar.skipValue();
        }
        nVar.endObject();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Object fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return parseOneOfType(reader, oneOfType(reader.q()).getSignature());
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson */
    public void mo44toJson(@NotNull x writer, Object value) throws IOException {
        OneOfSignature oneOfSignature;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.x();
            return;
        }
        OneOfSignature[] signatures = this.annotation.signatures();
        int length = signatures.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                oneOfSignature = null;
                break;
            }
            oneOfSignature = signatures[i11];
            if (N.b(oneOfSignature.type()).A(value)) {
                break;
            } else {
                i11++;
            }
        }
        if (oneOfSignature == null) {
            throw new IllegalArgumentException(("Expected one of " + this.annotation.signatures() + " but found " + value + ", a " + ProtoOneOfAdapter.class + ". Register this subtype.").toString());
        }
        writer.j();
        if (this.annotation.label().length() > 0) {
            writer.w(this.annotation.label()).R(oneOfSignature.name());
        }
        F Z11 = writer.w(field(oneOfSignature)).Z();
        try {
            this.moshi.c(oneOfSignature.type()).toJson((InterfaceC9682h) Z11, (F) value);
            Unit unit = Unit.f71690a;
            Z11.close();
            writer.p();
        } finally {
        }
    }

    @NotNull
    public String toString() {
        return "protoOneOfAdapter(" + this.annotation + ")";
    }
}

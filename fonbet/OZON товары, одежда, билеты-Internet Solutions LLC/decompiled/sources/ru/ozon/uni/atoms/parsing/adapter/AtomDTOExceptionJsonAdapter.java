package ru.ozon.uni.atoms.parsing.adapter;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/uni/atoms/parsing/adapter/AtomDTOExceptionJsonAdapter;", "Lru/ozon/uni/atoms/data/AtomDTO;", "DTO", "Lcom/squareup/moshi/JsonAdapter;", "delegate", "", "Lkotlin/Function1;", "", "validations", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Ljava/util/List;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/AtomDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/AtomDTO;)V", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/util/List;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomDTOExceptionJsonAdapter<DTO extends AtomDTO> extends JsonAdapter<DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DTO> delegate;

    @NotNull
    private final List<Function1<DTO, Unit>> validations;

    /* JADX WARN: Multi-variable type inference failed */
    public AtomDTOExceptionJsonAdapter(@NotNull JsonAdapter<DTO> delegate, @NotNull List<? extends Function1<? super DTO, Unit>> validations) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(validations, "validations");
        this.delegate = delegate;
        this.validations = validations;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        DTO fromJson = this.delegate.fromJson(reader);
        if (fromJson == null) {
            return null;
        }
        Iterator<T> it = this.validations.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(fromJson);
        }
        return fromJson;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.delegate.mo44toJson(writer, (x) value);
    }
}

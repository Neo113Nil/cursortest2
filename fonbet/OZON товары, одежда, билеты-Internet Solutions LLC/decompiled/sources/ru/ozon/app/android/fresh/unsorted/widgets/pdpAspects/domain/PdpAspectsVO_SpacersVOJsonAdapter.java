package ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.domain.PdpAspectsVO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO_SpacersVOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/pdpAspects/domain/PdpAspectsVO$SpacersVO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PdpAspectsVO_SpacersVOJsonAdapter extends JsonAdapter<PdpAspectsVO.SpacersVO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    public PdpAspectsVO_SpacersVOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("verticalTitle", "horizontalTitle", "horizontalDot", "betweenAspects", "bottomAspects", "topAspects", "leftAspects");
        this.intAdapter = moshi.f(Integer.TYPE, M.f71699a, "verticalTitle");
    }

    @NotNull
    public String toString() {
        return b.c(44, "GeneratedJsonAdapter(PdpAspectsVO.SpacersVO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PdpAspectsVO.SpacersVO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        while (true) {
            Integer num8 = num;
            if (!reader.hasNext()) {
                reader.endObject();
                if (num8 == null) {
                    throw c.j("verticalTitle", "verticalTitle", reader);
                }
                int intValue = num8.intValue();
                if (num2 == null) {
                    throw c.j("horizontalTitle", "horizontalTitle", reader);
                }
                int intValue2 = num2.intValue();
                if (num3 == null) {
                    throw c.j("horizontalDot", "horizontalDot", reader);
                }
                int intValue3 = num3.intValue();
                if (num4 == null) {
                    throw c.j("betweenAspects", "betweenAspects", reader);
                }
                int intValue4 = num4.intValue();
                if (num5 == null) {
                    throw c.j("bottomAspects", "bottomAspects", reader);
                }
                int intValue5 = num5.intValue();
                if (num6 == null) {
                    throw c.j("topAspects", "topAspects", reader);
                }
                int intValue6 = num6.intValue();
                if (num7 != null) {
                    return new PdpAspectsVO.SpacersVO(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, num7.intValue());
                }
                throw c.j("leftAspects", "leftAspects", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("verticalTitle", "verticalTitle", reader);
                    }
                    continue;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("horizontalTitle", "horizontalTitle", reader);
                    }
                    break;
                case 2:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("horizontalDot", "horizontalDot", reader);
                    }
                    break;
                case 3:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("betweenAspects", "betweenAspects", reader);
                    }
                    break;
                case 4:
                    num5 = this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        throw c.q("bottomAspects", "bottomAspects", reader);
                    }
                    break;
                case 5:
                    num6 = this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        throw c.q("topAspects", "topAspects", reader);
                    }
                    break;
                case 6:
                    num7 = this.intAdapter.fromJson(reader);
                    if (num7 == null) {
                        throw c.q("leftAspects", "leftAspects", reader);
                    }
                    break;
            }
            num = num8;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PdpAspectsVO.SpacersVO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("verticalTitle");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getVerticalTitle()));
        writer.w("horizontalTitle");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHorizontalTitle()));
        writer.w("horizontalDot");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHorizontalDot()));
        writer.w("betweenAspects");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBetweenAspects()));
        writer.w("bottomAspects");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBottomAspects()));
        writer.w("topAspects");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getTopAspects()));
        writer.w("leftAspects");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getLeftAspects()));
        writer.p();
    }
}

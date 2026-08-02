package ru.ozon.tracker.performance.model;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_WidgetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$Widget;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$Widget;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableLongAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_WidgetJsonAdapter extends JsonAdapter<TraceEntity.Widget> {
    private volatile Constructor<TraceEntity.Widget> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public TraceEntity_WidgetJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("type", AppMeasurementSdk.ConditionalUserProperty.NAME, "vertical", "component", "version", "id", "revisionId", "configId", "index", "sliceType", "sliceId", "sliceIndex", "originName", "originVertical", "originComponent", "originVersion", "configdtId", "dtName", "timeSpent");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "type");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.class, m11, "version");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableLongAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "index");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(TraceEntity.Widget)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.Widget fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l11 = null;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        Integer num = null;
        String str5 = null;
        Long l15 = null;
        Integer num2 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num3 = null;
        Long l16 = null;
        String str9 = null;
        Integer num4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    continue;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -2;
                    continue;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -3;
                    continue;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -5;
                    continue;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -9;
                    continue;
                case 4:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -17;
                    continue;
                case 5:
                    l12 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -33;
                    continue;
                case 6:
                    l13 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -65;
                    continue;
                case 7:
                    l14 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -129;
                    continue;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -257;
                    continue;
                case 9:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -513;
                    continue;
                case 10:
                    l15 = this.nullableLongAdapter.fromJson(reader);
                    i12 &= -1025;
                    continue;
                case 11:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i12 &= -2049;
                    continue;
                case 12:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -4097;
                    continue;
                case 13:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -8193;
                    continue;
                case 14:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    i12 &= -16385;
                    continue;
                case 15:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i11 = -32769;
                    break;
                case 16:
                    l16 = this.nullableLongAdapter.fromJson(reader);
                    i11 = -65537;
                    break;
                case 17:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    i11 = -131073;
                    break;
                case 18:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i11 = -262145;
                    break;
            }
            i12 &= i11;
        }
        reader.endObject();
        if (i12 == -524288) {
            Integer num5 = num;
            Long l17 = l14;
            Long l18 = l13;
            Long l19 = l12;
            Long l21 = l11;
            String str10 = str4;
            return new TraceEntity.Widget(str, str2, str3, str10, l21, l19, l18, l17, num5, str5, l15, num2, str6, str7, str8, num3, l16, str9, num4);
        }
        Integer num6 = num;
        Long l22 = l14;
        Long l23 = l13;
        Long l24 = l12;
        Long l25 = l11;
        String str11 = str4;
        String str12 = str3;
        String str13 = str2;
        String str14 = str;
        Constructor<TraceEntity.Widget> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TraceEntity.Widget.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Long.class, Long.class, Long.class, Long.class, Integer.class, String.class, Long.class, Integer.class, String.class, String.class, String.class, Integer.class, Long.class, String.class, Integer.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TraceEntity.Widget newInstance = constructor.newInstance(str14, str13, str12, str11, l25, l24, l23, l22, num6, str5, l15, num2, str6, str7, str8, num3, l16, str9, num4, Integer.valueOf(i12), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.Widget value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getName());
        writer.w("vertical");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getVertical());
        writer.w("component");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getComponent());
        writer.w("version");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getVersion());
        writer.w("id");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("revisionId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getRevisionId());
        writer.w("configId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getConfigId());
        writer.w("index");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getIndex());
        writer.w("sliceType");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSliceType());
        writer.w("sliceId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getSliceId());
        writer.w("sliceIndex");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getSliceIndex());
        writer.w("originName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOriginName());
        writer.w("originVertical");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOriginVertical());
        writer.w("originComponent");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getOriginComponent());
        writer.w("originVersion");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getOriginVersion());
        writer.w("configdtId");
        this.nullableLongAdapter.mo44toJson(writer, (x) value_.getConfigDtId());
        writer.w("dtName");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getDtName());
        writer.w("timeSpent");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getTimeSpent());
        writer.p();
    }
}

package ru.ozon.fintech.features.metrix.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/features/metrix/data/EventJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/metrix/data/Event;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/features/metrix/data/Event;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/features/metrix/data/Event;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/features/metrix/data/Geopoint;", "geopointAdapter", "", "longAdapter", "", "intAdapter", "metrix_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventJsonAdapter extends JsonAdapter<Event> {

    @NotNull
    private final JsonAdapter<Geopoint> geopointAdapter;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public EventJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("device_time", "event_name", "geopoint", "network", ImagesContract.URL, "entryType", "timing_type", "duration", "response_status", "delivery_type", "fetch_start");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "deviceTime");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Geopoint> f11 = moshi.f(Geopoint.class, m11, "geopoint");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.geopointAdapter = f11;
        JsonAdapter<Long> f12 = moshi.f(Long.TYPE, m11, "duration");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.longAdapter = f12;
        JsonAdapter<Integer> f13 = moshi.f(Integer.TYPE, m11, "responseStatus");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.intAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(27, "GeneratedJsonAdapter(Event)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Event fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Geopoint geopoint = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l12 = null;
        String str7 = null;
        while (true) {
            Long l13 = l11;
            Integer num2 = num;
            String str8 = str;
            String str9 = str2;
            Geopoint geopoint2 = geopoint;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            Long l14 = l12;
            String str14 = str7;
            if (!reader.hasNext()) {
                reader.endObject();
                if (str8 == null) {
                    throw c.j("deviceTime", "device_time", reader);
                }
                if (str9 == null) {
                    throw c.j("eventName", "event_name", reader);
                }
                if (geopoint2 == null) {
                    throw c.j("geopoint", "geopoint", reader);
                }
                if (str10 == null) {
                    throw c.j("network", "network", reader);
                }
                if (str11 == null) {
                    throw c.j(ImagesContract.URL, ImagesContract.URL, reader);
                }
                if (str12 == null) {
                    throw c.j("entryType", "entryType", reader);
                }
                if (str13 == null) {
                    throw c.j("timingType", "timing_type", reader);
                }
                if (l13 == null) {
                    throw c.j("duration", "duration", reader);
                }
                long longValue = l13.longValue();
                if (num2 == null) {
                    throw c.j("responseStatus", "response_status", reader);
                }
                int intValue = num2.intValue();
                if (str14 == null) {
                    throw c.j("deliveryType", "delivery_type", reader);
                }
                if (l14 != null) {
                    return new Event(str8, str9, geopoint2, str10, str11, str12, str13, longValue, intValue, str14, l14.longValue());
                }
                throw c.j("fetchStart", "fetch_start", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("deviceTime", "device_time", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("eventName", "event_name", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 2:
                    geopoint = this.geopointAdapter.fromJson(reader);
                    if (geopoint == null) {
                        throw c.q("geopoint", "geopoint", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("network", "network", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q(ImagesContract.URL, ImagesContract.URL, reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 5:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("entryType", "entryType", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 6:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("timingType", "timing_type", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    l12 = l14;
                    str7 = str14;
                case 7:
                    Long fromJson = this.longAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("duration", "duration", reader);
                    }
                    l11 = fromJson;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 8:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("responseStatus", "response_status", reader);
                    }
                    l11 = l13;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
                case 9:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw c.q("deliveryType", "delivery_type", reader);
                    }
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                case 10:
                    Long fromJson2 = this.longAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw c.q("fetchStart", "fetch_start", reader);
                    }
                    l12 = fromJson2;
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    str7 = str14;
                default:
                    l11 = l13;
                    num = num2;
                    str = str8;
                    str2 = str9;
                    geopoint = geopoint2;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                    str6 = str13;
                    l12 = l14;
                    str7 = str14;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Event value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("device_time");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeviceTime());
        writer.w("event_name");
        this.stringAdapter.mo44toJson(writer, (x) value_.getEventName());
        writer.w("geopoint");
        this.geopointAdapter.mo44toJson(writer, (x) value_.getGeopoint());
        writer.w("network");
        this.stringAdapter.mo44toJson(writer, (x) value_.getNetwork());
        writer.w(ImagesContract.URL);
        this.stringAdapter.mo44toJson(writer, (x) value_.getUrl());
        writer.w("entryType");
        this.stringAdapter.mo44toJson(writer, (x) value_.getEntryType());
        writer.w("timing_type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getTimingType());
        writer.w("duration");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getDuration()));
        writer.w("response_status");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getResponseStatus()));
        writer.w("delivery_type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeliveryType());
        writer.w("fetch_start");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getFetchStart()));
        writer.p();
    }
}

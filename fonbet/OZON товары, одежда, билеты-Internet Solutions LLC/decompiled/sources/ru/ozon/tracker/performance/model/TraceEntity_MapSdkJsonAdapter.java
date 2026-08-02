package ru.ozon.tracker.performance.model;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.model.TraceEntity;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/tracker/performance/model/TraceEntity_MapSdkJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/performance/model/TraceEntity$MapSdk;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TraceEntity_MapSdkJsonAdapter extends JsonAdapter<TraceEntity.MapSdk> {

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public TraceEntity_MapSdkJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("provider", "server", "appName", "libVersion", "language", "suggestionProvider", "geocodeProvider", "revgeocodeProvider", "locationUUID", "errorCode", "loadProvidersDuration", "mapInitDuration", "vectorFirstTileRenderDuration", "vectorTotalTilesRenderDuration", "firstTilesDownloadDuration", "styleDownloadDuration", "loadProviderDuration", "vectorAvgTileParseDuration", "errorStatusCode");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "provider");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "language");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "loadProvidersDuration");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(TraceEntity.MapSdk)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TraceEntity.MapSdk fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        while (true) {
            String str11 = str;
            String str12 = str2;
            if (!reader.hasNext()) {
                String str13 = str3;
                reader.endObject();
                if (str11 == null) {
                    throw c.j("provider", "provider", reader);
                }
                if (str12 == null) {
                    throw c.j("server", "server", reader);
                }
                if (str13 == null) {
                    throw c.j("appName", "appName", reader);
                }
                if (str4 != null) {
                    return new TraceEntity.MapSdk(str11, str12, str13, str4, str5, str6, str7, str8, str9, str10, num, num2, num3, num4, num5, num6, num7, num8, num9);
                }
                throw c.j("libVersion", "libVersion", reader);
            }
            String str14 = str3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("provider", "provider", reader);
                    }
                    str3 = str14;
                    str2 = str12;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("server", "server", reader);
                    }
                    str3 = str14;
                    str = str11;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("appName", "appName", reader);
                    }
                    str = str11;
                    str2 = str12;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("libVersion", "libVersion", reader);
                    }
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 6:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 7:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 8:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 9:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 10:
                    num = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 11:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 12:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 13:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 14:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 15:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 16:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 17:
                    num8 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                case 18:
                    num9 = this.nullableIntAdapter.fromJson(reader);
                    str3 = str14;
                    str = str11;
                    str2 = str12;
                default:
                    str3 = str14;
                    str = str11;
                    str2 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TraceEntity.MapSdk value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("provider");
        this.stringAdapter.mo44toJson(writer, (x) value_.getProvider());
        writer.w("server");
        this.stringAdapter.mo44toJson(writer, (x) value_.getServer());
        writer.w("appName");
        this.stringAdapter.mo44toJson(writer, (x) value_.getAppName());
        writer.w("libVersion");
        this.stringAdapter.mo44toJson(writer, (x) value_.getLibVersion());
        writer.w("language");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLanguage());
        writer.w("suggestionProvider");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSuggestionProvider());
        writer.w("geocodeProvider");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getGeocodeProvider());
        writer.w("revgeocodeProvider");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRevgeocodeProvider());
        writer.w("locationUUID");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLocationUUID());
        writer.w("errorCode");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorCode());
        writer.w("loadProvidersDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getLoadProvidersDuration());
        writer.w("mapInitDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getMapInitDuration());
        writer.w("vectorFirstTileRenderDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVectorFirstTileRenderDuration());
        writer.w("vectorTotalTilesRenderDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVectorTotalTilesRenderDuration());
        writer.w("firstTilesDownloadDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getFirstTilesDownloadDuration());
        writer.w("styleDownloadDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getStyleDownloadDuration());
        writer.w("loadProviderDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getLoadProviderDuration());
        writer.w("vectorAvgTileParseDuration");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getVectorAvgTileParseDuration());
        writer.w("errorStatusCode");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getErrorStatusCode());
        writer.p();
    }
}

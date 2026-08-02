package ru.ozon.app.android.bank.widgets.adBanner.data;

import C.o0;
import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/bank/widgets/adBanner/data/AdBannerItemDTO;", "listOfAdBannerItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerDTOJsonAdapter extends JsonAdapter<AdBannerDTO> {
    private volatile Constructor<AdBannerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<AdBannerItemDTO>> listOfAdBannerItemDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AdBannerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("banners", "adTraceID", "autoScrollDelayValue", "backgroundColor");
        b e11 = D.e(List.class, AdBannerItemDTO.class);
        M m11 = M.f71699a;
        this.listOfAdBannerItemDTOAdapter = moshi.f(e11, m11, "banners");
        this.stringAdapter = moshi.f(String.class, m11, "adTraceID");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "autoScrollDelay");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdBannerDTO fromJson(@NotNull n reader) {
        Integer a11 = o0.a(reader, "reader", 0);
        List<AdBannerItemDTO> list = null;
        String str = null;
        String str2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfAdBannerItemDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("banners", "banners", reader);
                }
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("adTraceID", "adTraceID", reader);
                }
            } else if (v11 == 2) {
                a11 = this.intAdapter.fromJson(reader);
                if (a11 == null) {
                    throw c.q("autoScrollDelay", "autoScrollDelayValue", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw c.q("backgroundColor", "backgroundColor", reader);
                }
                i11 &= -9;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -13) {
            if (list == null) {
                throw c.j("banners", "banners", reader);
            }
            if (str == null) {
                throw c.j("adTraceID", "adTraceID", reader);
            }
            int intValue = a11.intValue();
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            return new AdBannerDTO(list, str, intValue, str2);
        }
        Constructor<AdBannerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = AdBannerDTO.class.getDeclaredConstructor(List.class, String.class, cls2, String.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (list == null) {
            throw c.j("banners", "banners", reader);
        }
        if (str == null) {
            throw c.j("adTraceID", "adTraceID", reader);
        }
        AdBannerDTO newInstance = constructor.newInstance(list, str, a11, str2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(33, "GeneratedJsonAdapter(AdBannerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdBannerDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("banners");
        this.listOfAdBannerItemDTOAdapter.mo44toJson(writer, (x) value.getBanners());
        writer.w("adTraceID");
        this.stringAdapter.mo44toJson(writer, (x) value.getAdTraceID());
        writer.w("autoScrollDelayValue");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getAutoScrollDelay()));
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}

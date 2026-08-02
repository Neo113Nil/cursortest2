package ru.ozon.app.android.marketing.widgets.blackFridayStatus.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.stock.StockBar;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.data.BlackFridayStatusDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO_ImageTitleLayoutJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$ImageTitleLayout;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$ImageTitleLayout;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$ImageTitleLayout;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", "imageDTOAdapter", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "nullableTimerWithTitleDTOAdapter", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "nullableStockBarAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayStatusDTO_ImageTitleLayoutJsonAdapter extends JsonAdapter<BlackFridayStatusDTO.ImageTitleLayout> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<BlackFridayStatusDTO.ImageTitleLayout> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<StockBar> nullableStockBarAdapter;

    @NotNull
    private final JsonAdapter<TimerWithTitleDTO> nullableTimerWithTitleDTOAdapter;

    @NotNull
    private final n.a options;

    public BlackFridayStatusDTO_ImageTitleLayoutJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftImageDynamicSize", "leftImage", "titleImage", DynamicElementDTO.TIMER, "stockBar", "trackingInfo");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "leftImageDynamicSize");
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "leftImage");
        this.nullableTimerWithTitleDTOAdapter = moshi.f(TimerWithTitleDTO.class, m11, DynamicElementDTO.TIMER);
        this.nullableStockBarAdapter = moshi.f(StockBar.class, m11, "stockBar");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(BlackFridayStatusDTO.ImageTitleLayout)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BlackFridayStatusDTO.ImageTitleLayout fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        ImageDTO imageDTO = null;
        ImageDTO imageDTO2 = null;
        TimerWithTitleDTO timerWithTitleDTO = null;
        StockBar stockBar = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("leftImageDynamicSize", "leftImageDynamicSize", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("leftImage", "leftImage", reader);
                    }
                    break;
                case 2:
                    imageDTO2 = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO2 == null) {
                        throw c.q("titleImage", "titleImage", reader);
                    }
                    break;
                case 3:
                    timerWithTitleDTO = this.nullableTimerWithTitleDTOAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    stockBar = this.nullableStockBarAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -58) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            TimerWithTitleDTO timerWithTitleDTO2 = timerWithTitleDTO;
            ImageDTO imageDTO3 = imageDTO;
            StockBar stockBar2 = stockBar;
            ImageDTO imageDTO4 = imageDTO2;
            boolean booleanValue = bool2.booleanValue();
            if (imageDTO3 == null) {
                throw c.j("leftImage", "leftImage", reader);
            }
            if (imageDTO4 != null) {
                return new BlackFridayStatusDTO.ImageTitleLayout(booleanValue, imageDTO3, imageDTO4, timerWithTitleDTO2, stockBar2, map2);
            }
            throw c.j("titleImage", "titleImage", reader);
        }
        StockBar stockBar3 = stockBar;
        Map<String, TokenizedTrackingInfo> map3 = map;
        ImageDTO imageDTO5 = imageDTO2;
        TimerWithTitleDTO timerWithTitleDTO3 = timerWithTitleDTO;
        ImageDTO imageDTO6 = imageDTO;
        Constructor<BlackFridayStatusDTO.ImageTitleLayout> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BlackFridayStatusDTO.ImageTitleLayout.class.getDeclaredConstructor(Boolean.TYPE, ImageDTO.class, ImageDTO.class, TimerWithTitleDTO.class, StockBar.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (imageDTO6 == null) {
            throw c.j("leftImage", "leftImage", reader);
        }
        if (imageDTO5 == null) {
            throw c.j("titleImage", "titleImage", reader);
        }
        BlackFridayStatusDTO.ImageTitleLayout newInstance = constructor.newInstance(bool2, imageDTO6, imageDTO5, timerWithTitleDTO3, stockBar3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BlackFridayStatusDTO.ImageTitleLayout value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftImageDynamicSize");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getLeftImageDynamicSize()));
        writer.w("leftImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getLeftImage());
        writer.w("titleImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getTitleImage());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerWithTitleDTOAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("stockBar");
        this.nullableStockBarAdapter.mo44toJson(writer, (x) value.getStockBar());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}

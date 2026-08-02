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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO_TextTitleLayoutJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/BlackFridayStatusDTO$TextTitleLayout;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/atoms/data/stock/StockBar;", "nullableStockBarAdapter", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/TimerWithTitleDTO;", "nullableTimerWithTitleDTOAdapter", "Lru/ozon/app/android/marketing/widgets/blackFridayStatus/data/ButtonWithTitle;", "nullableButtonWithTitleAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BlackFridayStatusDTO_TextTitleLayoutJsonAdapter extends JsonAdapter<BlackFridayStatusDTO.TextTitleLayout> {
    public static final int $stable = 8;
    private volatile Constructor<BlackFridayStatusDTO.TextTitleLayout> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonWithTitle> nullableButtonWithTitleAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<StockBar> nullableStockBarAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final JsonAdapter<TimerWithTitleDTO> nullableTimerWithTitleDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public BlackFridayStatusDTO_TextTitleLayoutJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftImage", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "stockBar", DynamicElementDTO.TIMER, "button", "trackingInfo");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "leftImage");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "subtitle");
        this.nullableStockBarAdapter = moshi.f(StockBar.class, m11, "stockBar");
        this.nullableTimerWithTitleDTOAdapter = moshi.f(TimerWithTitleDTO.class, m11, DynamicElementDTO.TIMER);
        this.nullableButtonWithTitleAdapter = moshi.f(ButtonWithTitle.class, m11, "button");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(BlackFridayStatusDTO.TextTitleLayout)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BlackFridayStatusDTO.TextTitleLayout fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ImageDTO imageDTO = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        StockBar stockBar = null;
        TimerWithTitleDTO timerWithTitleDTO = null;
        ButtonWithTitle buttonWithTitle = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("leftImage", "leftImage", reader);
                    }
                    break;
                case 1:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    stockBar = this.nullableStockBarAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    timerWithTitleDTO = this.nullableTimerWithTitleDTOAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    buttonWithTitle = this.nullableButtonWithTitleAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -125) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            ButtonWithTitle buttonWithTitle2 = buttonWithTitle;
            TimerWithTitleDTO timerWithTitleDTO2 = timerWithTitleDTO;
            StockBar stockBar2 = stockBar;
            TextAtom textAtom3 = textAtom2;
            TextAtom textAtom4 = textAtom;
            ImageDTO imageDTO2 = imageDTO;
            if (imageDTO2 == null) {
                throw c.j("leftImage", "leftImage", reader);
            }
            if (textAtom4 != null) {
                return new BlackFridayStatusDTO.TextTitleLayout(imageDTO2, textAtom4, textAtom3, stockBar2, timerWithTitleDTO2, buttonWithTitle2, map2);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        ButtonWithTitle buttonWithTitle3 = buttonWithTitle;
        TimerWithTitleDTO timerWithTitleDTO3 = timerWithTitleDTO;
        StockBar stockBar3 = stockBar;
        TextAtom textAtom5 = textAtom2;
        TextAtom textAtom6 = textAtom;
        ImageDTO imageDTO3 = imageDTO;
        Constructor<BlackFridayStatusDTO.TextTitleLayout> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BlackFridayStatusDTO.TextTitleLayout.class.getDeclaredConstructor(ImageDTO.class, TextAtom.class, TextAtom.class, StockBar.class, TimerWithTitleDTO.class, ButtonWithTitle.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<BlackFridayStatusDTO.TextTitleLayout> constructor2 = constructor;
        if (imageDTO3 == null) {
            throw c.j("leftImage", "leftImage", reader);
        }
        if (textAtom6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        BlackFridayStatusDTO.TextTitleLayout newInstance = constructor2.newInstance(imageDTO3, textAtom6, textAtom5, stockBar3, timerWithTitleDTO3, buttonWithTitle3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BlackFridayStatusDTO.TextTitleLayout value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftImage");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getLeftImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("stockBar");
        this.nullableStockBarAdapter.mo44toJson(writer, (x) value.getStockBar());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerWithTitleDTOAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("button");
        this.nullableButtonWithTitleAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}

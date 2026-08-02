package ru.ozon.app.android.commonwidgets.widgets.logosList.data;

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
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionDTO;
import ru.ozon.app.android.commonwidgets.widgets.logosList.data.LogosListDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/commonwidgets/widgets/logosList/data/LogosListDTO$Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/cart/ui/tooltip/molecule/TooltipWithOnboardingActionDTO;", "nullableTooltipWithOnboardingActionDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LogosListDTO_ItemJsonAdapter extends JsonAdapter<LogosListDTO.Item> {

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<LogosListDTO.Item> constructorRef;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TooltipWithOnboardingActionDTO> nullableTooltipWithOnboardingActionDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public LogosListDTO_ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isSelected", "text", "subtext", "action", "trackingInfo", "tooltipWithOnboardingAction");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSelected");
        this.stringAdapter = moshi.f(String.class, m11, "text");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableTooltipWithOnboardingActionDTOAdapter = moshi.f(TooltipWithOnboardingActionDTO.class, m11, "tooltipWithOnboardingAction");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(LogosListDTO.Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LogosListDTO.Item fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSelected", "isSelected", reader);
                    }
                    i11 &= -2;
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("subtext", "subtext", reader);
                    }
                    break;
                case 3:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("action", "action", reader);
                    }
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    tooltipWithOnboardingActionDTO = this.nullableTooltipWithOnboardingActionDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -18) {
            TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO2 = tooltipWithOnboardingActionDTO;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str3 = str;
            Map<String, TokenizedTrackingInfo> map2 = map;
            String str4 = str2;
            boolean booleanValue = bool2.booleanValue();
            if (str3 == null) {
                throw c.j("text", "text", reader);
            }
            if (str4 == null) {
                throw c.j("subtext", "subtext", reader);
            }
            if (atomActionDTO2 != null) {
                return new LogosListDTO.Item(booleanValue, str3, str4, atomActionDTO2, map2, tooltipWithOnboardingActionDTO2);
            }
            throw c.j("action", "action", reader);
        }
        TooltipWithOnboardingActionDTO tooltipWithOnboardingActionDTO3 = tooltipWithOnboardingActionDTO;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        Map<String, TokenizedTrackingInfo> map3 = map;
        String str5 = str;
        String str6 = str2;
        Constructor<LogosListDTO.Item> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LogosListDTO.Item.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class, AtomActionDTO.class, Map.class, TooltipWithOnboardingActionDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<LogosListDTO.Item> constructor2 = constructor;
        if (str5 == null) {
            throw c.j("text", "text", reader);
        }
        if (str6 == null) {
            throw c.j("subtext", "subtext", reader);
        }
        if (atomActionDTO3 == null) {
            throw c.j("action", "action", reader);
        }
        LogosListDTO.Item newInstance = constructor2.newInstance(bool2, str5, str6, atomActionDTO3, map3, tooltipWithOnboardingActionDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LogosListDTO.Item value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isSelected");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSelected()));
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("subtext");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtext());
        writer.w("action");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("tooltipWithOnboardingAction");
        this.nullableTooltipWithOnboardingActionDTOAdapter.mo44toJson(writer, (x) value.getTooltipWithOnboardingAction());
        writer.p();
    }
}

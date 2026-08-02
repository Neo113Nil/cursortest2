package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data;

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
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.UgcCountersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO_Block_ExpandingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/UgcCountersDTO$Block$Expanding$Alignment;", "nullableAlignmentAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UgcCountersDTO_Block_ExpandingJsonAdapter extends JsonAdapter<UgcCountersDTO.Block.Expanding> {
    public static final int $stable = 8;
    private volatile Constructor<UgcCountersDTO.Block.Expanding> constructorRef;

    @NotNull
    private final JsonAdapter<UgcCountersDTO.Block.Expanding.Alignment> nullableAlignmentAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public UgcCountersDTO_Block_ExpandingJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "backgroundColor", "action", "trackingInfo", "cornerRadius", "alignment", "onboarding");
        M m11 = M.f71699a;
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
        this.nullableAlignmentAdapter = moshi.f(UgcCountersDTO.Block.Expanding.Alignment.class, m11, "alignment");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(UgcCountersDTO.Block.Expanding)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UgcCountersDTO.Block.Expanding fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        IconDTO iconDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CornerRadius cornerRadius = null;
        UgcCountersDTO.Block.Expanding.Alignment alignment = null;
        OnBoardingDTO onBoardingDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 7:
                    alignment = this.nullableAlignmentAdapter.fromJson(reader);
                    break;
                case 8:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    i11 = -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -257) {
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            UgcCountersDTO.Block.Expanding.Alignment alignment2 = alignment;
            CornerRadius cornerRadius2 = cornerRadius;
            Map<String, TokenizedTrackingInfo> map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str2 = str;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            IconDTO iconDTO2 = iconDTO;
            if (textDTO4 != null) {
                return new UgcCountersDTO.Block.Expanding(iconDTO2, textDTO4, textDTO3, str2, atomActionDTO2, map2, cornerRadius2, alignment2, onBoardingDTO2);
            }
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        OnBoardingDTO onBoardingDTO3 = onBoardingDTO;
        UgcCountersDTO.Block.Expanding.Alignment alignment3 = alignment;
        CornerRadius cornerRadius3 = cornerRadius;
        Map<String, TokenizedTrackingInfo> map3 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        String str3 = str;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        IconDTO iconDTO3 = iconDTO;
        Constructor<UgcCountersDTO.Block.Expanding> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UgcCountersDTO.Block.Expanding.class.getDeclaredConstructor(IconDTO.class, TextDTO.class, TextDTO.class, String.class, AtomActionDTO.class, Map.class, CornerRadius.class, UgcCountersDTO.Block.Expanding.Alignment.class, OnBoardingDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        UgcCountersDTO.Block.Expanding newInstance = constructor.newInstance(iconDTO3, textDTO6, textDTO5, str3, atomActionDTO3, map3, cornerRadius3, alignment3, onBoardingDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UgcCountersDTO.Block.Expanding value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("alignment");
        this.nullableAlignmentAdapter.mo44toJson(writer, (x) value.getAlignment());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.p();
    }
}

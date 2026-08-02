package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableListOfButtonV3DTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ViewAppearance;", "viewAppearanceAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ButtonsPosition;", "buttonsPositionAtEnumNullFallbackAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v3/data/EmptyStateV3DTO$ContentAlign;", "contentAlignAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3DTOJsonAdapter extends JsonAdapter<EmptyStateV3DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<EmptyStateV3DTO.ButtonsPosition> buttonsPositionAtEnumNullFallbackAdapter;
    private volatile Constructor<EmptyStateV3DTO> constructorRef;

    @NotNull
    private final JsonAdapter<EmptyStateV3DTO.ContentAlign> contentAlignAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3DTO>> nullableListOfButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    @NotNull
    private final JsonAdapter<EmptyStateV3DTO.ViewAppearance> viewAppearanceAtEnumNullFallbackAdapter;

    public EmptyStateV3DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image", SelectionItemFormDTO.TITLE_FIELD_NAME, "message", "buttons", "trackingInfo", "appearance", "buttonsPosition", "contentAlign");
        M m11 = M.f71699a;
        this.imageDTOAdapter = moshi.f(ImageDTO.class, m11, "image");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "message");
        this.nullableListOfButtonV3DTOAdapter = moshi.f(D.e(List.class, ButtonV3DTO.class), m11, "buttons");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.viewAppearanceAtEnumNullFallbackAdapter = moshi.f(EmptyStateV3DTO.ViewAppearance.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "appearance");
        this.buttonsPositionAtEnumNullFallbackAdapter = moshi.f(EmptyStateV3DTO.ButtonsPosition.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "buttonsPosition");
        this.contentAlignAtEnumNullFallbackAdapter = moshi.f(EmptyStateV3DTO.ContentAlign.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "contentAlign");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(EmptyStateV3DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EmptyStateV3DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ImageDTO imageDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        List<ButtonV3DTO> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        EmptyStateV3DTO.ViewAppearance viewAppearance = null;
        EmptyStateV3DTO.ButtonsPosition buttonsPosition = null;
        EmptyStateV3DTO.ContentAlign contentAlign = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
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
                    list = this.nullableListOfButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 5:
                    viewAppearance = this.viewAppearanceAtEnumNullFallbackAdapter.fromJson(reader);
                    if (viewAppearance == null) {
                        throw c.q("appearance", "appearance", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    buttonsPosition = this.buttonsPositionAtEnumNullFallbackAdapter.fromJson(reader);
                    if (buttonsPosition == null) {
                        throw c.q("buttonsPosition", "buttonsPosition", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    contentAlign = this.contentAlignAtEnumNullFallbackAdapter.fromJson(reader);
                    if (contentAlign == null) {
                        throw c.q("contentAlign", "contentAlign", reader);
                    }
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -225) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            List<ButtonV3DTO> list2 = list;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            ImageDTO imageDTO2 = imageDTO;
            if (imageDTO2 == null) {
                throw c.j("image", "image", reader);
            }
            if (textDTO4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(viewAppearance, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTO.ViewAppearance");
            Intrinsics.g(buttonsPosition, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTO.ButtonsPosition");
            Intrinsics.g(contentAlign, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.data.EmptyStateV3DTO.ContentAlign");
            return new EmptyStateV3DTO(imageDTO2, textDTO4, textDTO3, list2, map2, viewAppearance, buttonsPosition, contentAlign);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        List<ButtonV3DTO> list3 = list;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        ImageDTO imageDTO3 = imageDTO;
        Constructor<EmptyStateV3DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = EmptyStateV3DTO.class.getDeclaredConstructor(ImageDTO.class, TextDTO.class, TextDTO.class, List.class, Map.class, EmptyStateV3DTO.ViewAppearance.class, EmptyStateV3DTO.ButtonsPosition.class, EmptyStateV3DTO.ContentAlign.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<EmptyStateV3DTO> constructor2 = constructor;
        if (imageDTO3 == null) {
            throw c.j("image", "image", reader);
        }
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        EmptyStateV3DTO newInstance = constructor2.newInstance(imageDTO3, textDTO6, textDTO5, list3, map3, viewAppearance, buttonsPosition, contentAlign, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EmptyStateV3DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("message");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getMessage());
        writer.w("buttons");
        this.nullableListOfButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("appearance");
        this.viewAppearanceAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getAppearance());
        writer.w("buttonsPosition");
        this.buttonsPositionAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getButtonsPosition());
        writer.w("contentAlign");
        this.contentAlignAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getContentAlign());
        writer.p();
    }
}

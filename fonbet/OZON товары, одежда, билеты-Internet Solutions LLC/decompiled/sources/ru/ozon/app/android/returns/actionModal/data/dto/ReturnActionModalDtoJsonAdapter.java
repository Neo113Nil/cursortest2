package ru.ozon.app.android.returns.actionModal.data.dto;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.gallery.Gallery;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.returns.actionModal.data.dto.ReturnActionModalDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tabs.Tabs;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R(\u0010*\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/tabs/Tabs;", "nullableTabsAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lru/ozon/app/android/atoms/data/gallery/Gallery;", "nullableGalleryAdapter", "", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponent;", "nullableMapOfStringActionComponentAdapter", "", "Lru/ozon/app/android/returns/actionModal/data/dto/ReturnActionModalDto$ActionComponentGroup;", "nullableListOfActionComponentGroupAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "nullableLargeButtonAdapter", "nullableMapOfStringStringAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnActionModalDtoJsonAdapter extends JsonAdapter<ReturnActionModalDto> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<Gallery> nullableGalleryAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<ReturnActionModalDto.ActionComponentGroup>> nullableListOfActionComponentGroupAdapter;

    @NotNull
    private final JsonAdapter<Map<String, ReturnActionModalDto.ActionComponent>> nullableMapOfStringActionComponentAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<Tabs> nullableTabsAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReturnActionModalDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("returnNumber", "action", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", DynamicElementDTO.TABS, "hint", "photos", "components", "componentGroups", "submitButton", "cancelButton", "extraValues");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "returnNumber");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTabsAdapter = moshi.f(Tabs.class, m11, DynamicElementDTO.TABS);
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "hint");
        this.nullableGalleryAdapter = moshi.f(Gallery.class, m11, "photos");
        this.nullableMapOfStringActionComponentAdapter = moshi.f(D.e(Map.class, String.class, ReturnActionModalDto.ActionComponent.class), m11, "components");
        this.nullableListOfActionComponentGroupAdapter = moshi.f(D.e(List.class, ReturnActionModalDto.ActionComponentGroup.class), m11, "componentGroups");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "submitButton");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "cancelButton");
        this.nullableMapOfStringStringAdapter = moshi.f(D.e(Map.class, String.class, String.class), m11, "extraValues");
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(ReturnActionModalDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnActionModalDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        Tabs tabs = null;
        DisclaimerAtom disclaimerAtom = null;
        Gallery gallery = null;
        Map<String, ReturnActionModalDto.ActionComponent> map = null;
        List<ReturnActionModalDto.ActionComponentGroup> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.LargeButton largeButton2 = null;
        Map<String, String> map2 = null;
        while (true) {
            String str3 = str;
            if (!reader.hasNext()) {
                String str4 = str2;
                reader.endObject();
                if (str3 == null) {
                    throw c.j("returnNumber", "returnNumber", reader);
                }
                if (str4 == null) {
                    throw c.j("action", "action", reader);
                }
                if (largeButton != null) {
                    return new ReturnActionModalDto(str3, str4, textAtom, textAtom2, tabs, disclaimerAtom, gallery, map, list, largeButton, largeButton2, map2);
                }
                throw c.j("submitButton", "submitButton", reader);
            }
            String str5 = str2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str2 = str5;
                    str = str3;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("returnNumber", "returnNumber", reader);
                    }
                    str2 = str5;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("action", "action", reader);
                    }
                    str = str3;
                case 2:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 3:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 4:
                    tabs = this.nullableTabsAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 5:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 6:
                    gallery = this.nullableGalleryAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 7:
                    map = this.nullableMapOfStringActionComponentAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 8:
                    list = this.nullableListOfActionComponentGroupAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 9:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("submitButton", "submitButton", reader);
                    }
                    str2 = str5;
                    str = str3;
                case 10:
                    largeButton2 = this.nullableLargeButtonAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                case 11:
                    map2 = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    str2 = str5;
                    str = str3;
                default:
                    str2 = str5;
                    str = str3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnActionModalDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("returnNumber");
        this.stringAdapter.mo44toJson(writer, (x) value.getReturnNumber());
        writer.w("action");
        this.stringAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subTitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w(DynamicElementDTO.TABS);
        this.nullableTabsAdapter.mo44toJson(writer, (x) value.getTabs());
        writer.w("hint");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getHint());
        writer.w("photos");
        this.nullableGalleryAdapter.mo44toJson(writer, (x) value.getPhotos());
        writer.w("components");
        this.nullableMapOfStringActionComponentAdapter.mo44toJson(writer, (x) value.getComponents());
        writer.w("componentGroups");
        this.nullableListOfActionComponentGroupAdapter.mo44toJson(writer, (x) value.getComponentGroups());
        writer.w("submitButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("cancelButton");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getCancelButton());
        writer.w("extraValues");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value.getExtraValues());
        writer.p();
    }
}

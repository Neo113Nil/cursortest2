package ru.ozon.app.android.session.flashcall.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.flashcall.data.RequestPhoneAccessWidgetDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$TitleDTO;", "titleDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$SubtitleDTO;", "nullableSubtitleDTOAdapter", "", "Lru/ozon/app/android/session/flashcall/data/RequestPhoneAccessWidgetDTO$PermissionDTO;", "nullableListOfPermissionDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RequestPhoneAccessWidgetDTOJsonAdapter extends JsonAdapter<RequestPhoneAccessWidgetDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<RequestPhoneAccessWidgetDTO.PermissionDTO>> nullableListOfPermissionDTOAdapter;

    @NotNull
    private final JsonAdapter<RequestPhoneAccessWidgetDTO.SubtitleDTO> nullableSubtitleDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    @NotNull
    private final JsonAdapter<RequestPhoneAccessWidgetDTO.TitleDTO> titleDTOAdapter;

    public RequestPhoneAccessWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "permissions", "allowButton", "disallowButton", "help");
        M m11 = M.f71699a;
        this.titleDTOAdapter = moshi.f(RequestPhoneAccessWidgetDTO.TitleDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableSubtitleDTOAdapter = moshi.f(RequestPhoneAccessWidgetDTO.SubtitleDTO.class, m11, "subtitle");
        this.nullableListOfPermissionDTOAdapter = moshi.f(D.e(List.class, RequestPhoneAccessWidgetDTO.PermissionDTO.class), m11, "permissions");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "allowButton");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "help");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(RequestPhoneAccessWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public RequestPhoneAccessWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        RequestPhoneAccessWidgetDTO.TitleDTO titleDTO = null;
        RequestPhoneAccessWidgetDTO.SubtitleDTO subtitleDTO = null;
        List<RequestPhoneAccessWidgetDTO.PermissionDTO> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        ButtonV3Atom.LargeButton largeButton2 = null;
        TextAtom textAtom = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    titleDTO = this.titleDTOAdapter.fromJson(reader);
                    if (titleDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    subtitleDTO = this.nullableSubtitleDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfPermissionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("allowButton", "allowButton", reader);
                    }
                    break;
                case 4:
                    largeButton2 = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton2 == null) {
                        throw c.q("disallowButton", "disallowButton", reader);
                    }
                    break;
                case 5:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("help", "help", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (titleDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (largeButton == null) {
            throw c.j("allowButton", "allowButton", reader);
        }
        if (largeButton2 == null) {
            throw c.j("disallowButton", "disallowButton", reader);
        }
        if (textAtom != null) {
            return new RequestPhoneAccessWidgetDTO(titleDTO, subtitleDTO, list, largeButton, largeButton2, textAtom);
        }
        throw c.j("help", "help", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, RequestPhoneAccessWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.titleDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableSubtitleDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("permissions");
        this.nullableListOfPermissionDTOAdapter.mo44toJson(writer, (x) value.getPermissions());
        writer.w("allowButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getAllowButton());
        writer.w("disallowButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getDisallowButton());
        writer.w("help");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getHelp());
        writer.p();
    }
}

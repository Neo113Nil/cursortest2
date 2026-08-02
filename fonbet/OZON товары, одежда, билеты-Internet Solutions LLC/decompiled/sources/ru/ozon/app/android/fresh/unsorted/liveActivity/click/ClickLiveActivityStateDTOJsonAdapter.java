package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityStateDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;", "buttonAdapter", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ClickLiveActivityStateDTOJsonAdapter extends JsonAdapter<ClickLiveActivityStateDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ClickLiveActivityStateDTO.Button> buttonAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ClickLiveActivityStateDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("logo", "image", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "widgetLink", "callButton", "addButton", "key");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "logo");
        this.buttonAdapter = moshi.f(ClickLiveActivityStateDTO.Button.class, m11, "callButton");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(ClickLiveActivityStateDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ClickLiveActivityStateDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ClickLiveActivityStateDTO.Button button = null;
        ClickLiveActivityStateDTO.Button button2 = null;
        String str6 = null;
        while (true) {
            String str7 = str;
            String str8 = str2;
            if (!reader.hasNext()) {
                String str9 = str3;
                reader.endObject();
                if (str7 == null) {
                    throw c.j("logo", "logo", reader);
                }
                if (str8 == null) {
                    throw c.j("image", "image", reader);
                }
                if (str9 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (str4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (str5 == null) {
                    throw c.j("widgetLink", "widgetLink", reader);
                }
                if (button == null) {
                    throw c.j("callButton", "callButton", reader);
                }
                if (button2 == null) {
                    throw c.j("addButton", "addButton", reader);
                }
                if (str6 != null) {
                    return new ClickLiveActivityStateDTO(str7, str8, str9, str4, str5, button, button2, str6);
                }
                throw c.j("key", "key", reader);
            }
            String str10 = str3;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("logo", "logo", reader);
                    }
                    str3 = str10;
                    str2 = str8;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("image", "image", reader);
                    }
                    str3 = str10;
                    str = str7;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    str = str7;
                    str2 = str8;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("widgetLink", "widgetLink", reader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 5:
                    button = this.buttonAdapter.fromJson(reader);
                    if (button == null) {
                        throw c.q("callButton", "callButton", reader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 6:
                    button2 = this.buttonAdapter.fromJson(reader);
                    if (button2 == null) {
                        throw c.q("addButton", "addButton", reader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                case 7:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("key", "key", reader);
                    }
                    str3 = str10;
                    str = str7;
                    str2 = str8;
                default:
                    str3 = str10;
                    str = str7;
                    str2 = str8;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ClickLiveActivityStateDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("logo");
        this.stringAdapter.mo44toJson(writer, (x) value.getLogo());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("widgetLink");
        this.stringAdapter.mo44toJson(writer, (x) value.getWidgetLink());
        writer.w("callButton");
        this.buttonAdapter.mo44toJson(writer, (x) value.getCallButton());
        writer.w("addButton");
        this.buttonAdapter.mo44toJson(writer, (x) value.getAddButton());
        writer.w("key");
        this.stringAdapter.mo44toJson(writer, (x) value.getKey());
        writer.p();
    }
}

package ru.ozon.app.android.cscore.orderdetails.molecule.code;

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
import ru.ozon.app.android.cscore.orderdetails.molecule.code.CodeDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/cscore/orderdetails/molecule/code/CodeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/cscore/orderdetails/molecule/code/CodeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/cscore/orderdetails/molecule/code/CodeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/cscore/orderdetails/molecule/code/CodeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/cscore/orderdetails/molecule/code/CodeDTO$IslandSettings;", "islandSettingsAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CodeDTOJsonAdapter extends JsonAdapter<CodeDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CodeDTO.IslandSettings> islandSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CodeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("settings", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleIcon", "subtitle", "testInfo");
        M m11 = M.f71699a;
        this.islandSettingsAdapter = moshi.f(CodeDTO.IslandSettings.class, m11, "settings");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableIconDTOAdapter = moshi.f(IconDTO.class, m11, "titleIcon");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(29, "GeneratedJsonAdapter(CodeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CodeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CodeDTO.IslandSettings islandSettings = null;
        TextDTO textDTO = null;
        IconDTO iconDTO = null;
        TextDTO textDTO2 = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                islandSettings = this.islandSettingsAdapter.fromJson(reader);
                if (islandSettings == null) {
                    throw c.q("settings", "settings", reader);
                }
            } else if (v11 == 1) {
                textDTO = this.textDTOAdapter.fromJson(reader);
                if (textDTO == null) {
                    throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
            } else if (v11 == 2) {
                iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                textDTO2 = this.textDTOAdapter.fromJson(reader);
                if (textDTO2 == null) {
                    throw c.q("subtitle", "subtitle", reader);
                }
            } else if (v11 == 4) {
                testInfo = this.nullableTestInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (islandSettings == null) {
            throw c.j("settings", "settings", reader);
        }
        if (textDTO == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (textDTO2 != null) {
            return new CodeDTO(islandSettings, textDTO, iconDTO, textDTO2, testInfo);
        }
        throw c.j("subtitle", "subtitle", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CodeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("settings");
        this.islandSettingsAdapter.mo44toJson(writer, (x) value.getSettings());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value.getTitleIcon());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}

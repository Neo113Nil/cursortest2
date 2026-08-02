package ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.data;

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
import ru.ozon.app.android.commonwidgets.widgets.curtainnavbar.data.CurtainNavBarDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$Title;", "nullableTitleAdapter", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionLeft;", "nullableActionLeftAdapter", "Lru/ozon/app/android/commonwidgets/widgets/curtainnavbar/data/CurtainNavBarDTO$ActionRight;", "nullableActionRightAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallBorderlessButtonWithIcon;", "nullableSmallBorderlessButtonWithIconAdapter", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CurtainNavBarDTOJsonAdapter extends JsonAdapter<CurtainNavBarDTO> {

    @NotNull
    private final JsonAdapter<CurtainNavBarDTO.ActionLeft> nullableActionLeftAdapter;

    @NotNull
    private final JsonAdapter<CurtainNavBarDTO.ActionRight> nullableActionRightAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallBorderlessButtonWithIcon> nullableSmallBorderlessButtonWithIconAdapter;

    @NotNull
    private final JsonAdapter<CurtainNavBarDTO.Title> nullableTitleAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public CurtainNavBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("style", SelectionItemFormDTO.TITLE_FIELD_NAME, "actionLeft", "actionRight", "leftButton", "rightButton");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "style");
        this.nullableTitleAdapter = moshi.f(CurtainNavBarDTO.Title.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableActionLeftAdapter = moshi.f(CurtainNavBarDTO.ActionLeft.class, m11, "actionLeft");
        this.nullableActionRightAdapter = moshi.f(CurtainNavBarDTO.ActionRight.class, m11, "actionRight");
        this.nullableSmallBorderlessButtonWithIconAdapter = moshi.f(ButtonV3Atom.SmallBorderlessButtonWithIcon.class, m11, "leftButton");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(CurtainNavBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CurtainNavBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        CurtainNavBarDTO.Title title = null;
        CurtainNavBarDTO.ActionLeft actionLeft = null;
        CurtainNavBarDTO.ActionRight actionRight = null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon = null;
        ButtonV3Atom.SmallBorderlessButtonWithIcon smallBorderlessButtonWithIcon2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("style", "style", reader);
                    }
                    break;
                case 1:
                    title = this.nullableTitleAdapter.fromJson(reader);
                    break;
                case 2:
                    actionLeft = this.nullableActionLeftAdapter.fromJson(reader);
                    break;
                case 3:
                    actionRight = this.nullableActionRightAdapter.fromJson(reader);
                    break;
                case 4:
                    smallBorderlessButtonWithIcon = this.nullableSmallBorderlessButtonWithIconAdapter.fromJson(reader);
                    break;
                case 5:
                    smallBorderlessButtonWithIcon2 = this.nullableSmallBorderlessButtonWithIconAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str != null) {
            return new CurtainNavBarDTO(str, title, actionLeft, actionRight, smallBorderlessButtonWithIcon, smallBorderlessButtonWithIcon2);
        }
        throw c.j("style", "style", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CurtainNavBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("style");
        this.stringAdapter.mo44toJson(writer, (x) value.getStyle());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTitleAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("actionLeft");
        this.nullableActionLeftAdapter.mo44toJson(writer, (x) value.getActionLeft());
        writer.w("actionRight");
        this.nullableActionRightAdapter.mo44toJson(writer, (x) value.getActionRight());
        writer.w("leftButton");
        this.nullableSmallBorderlessButtonWithIconAdapter.mo44toJson(writer, (x) value.getLeftButton());
        writer.w("rightButton");
        this.nullableSmallBorderlessButtonWithIconAdapter.mo44toJson(writer, (x) value.getRightButton());
        writer.p();
    }
}

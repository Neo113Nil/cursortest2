package ru.ozon.app.android.ugc.widgets.listanswers.data;

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
import ru.ozon.app.android.ugc.widgets.common.MenuDTO;
import ru.ozon.app.android.ugc.widgets.listanswers.data.ListAnswersDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO_Answer_AnswerButtonsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "tagAtomAdapter", "Lru/ozon/app/android/ugc/widgets/listanswers/data/ListAnswersDTO$Answer$AnswerButtons$MakeBestButton;", "nullableMakeBestButtonAdapter", "Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "menuDTOAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListAnswersDTO_Answer_AnswerButtonsJsonAdapter extends JsonAdapter<ListAnswersDTO.Answer.AnswerButtons> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<MenuDTO> menuDTOAdapter;

    @NotNull
    private final JsonAdapter<ListAnswersDTO.Answer.AnswerButtons.MakeBestButton> nullableMakeBestButtonAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TagV3Atom.TagAtom> tagAtomAdapter;

    public ListAnswersDTO_Answer_AnswerButtonsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "like", "dislike", "makeBest", "menu");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.tagAtomAdapter = moshi.f(TagV3Atom.TagAtom.class, m11, "like");
        this.nullableMakeBestButtonAdapter = moshi.f(ListAnswersDTO.Answer.AnswerButtons.MakeBestButton.class, m11, "makeBest");
        this.menuDTOAdapter = moshi.f(MenuDTO.class, m11, "menu");
    }

    @NotNull
    public String toString() {
        return b.c(57, "GeneratedJsonAdapter(ListAnswersDTO.Answer.AnswerButtons)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ListAnswersDTO.Answer.AnswerButtons fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TagV3Atom.TagAtom tagAtom = null;
        TagV3Atom.TagAtom tagAtom2 = null;
        ListAnswersDTO.Answer.AnswerButtons.MakeBestButton makeBestButton = null;
        MenuDTO menuDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.nullableTextAtomAdapter.fromJson(reader);
            } else if (v11 == 1) {
                tagAtom = this.tagAtomAdapter.fromJson(reader);
                if (tagAtom == null) {
                    throw c.q("like", "like", reader);
                }
            } else if (v11 == 2) {
                tagAtom2 = this.tagAtomAdapter.fromJson(reader);
                if (tagAtom2 == null) {
                    throw c.q("dislike", "dislike", reader);
                }
            } else if (v11 == 3) {
                makeBestButton = this.nullableMakeBestButtonAdapter.fromJson(reader);
            } else if (v11 == 4 && (menuDTO = this.menuDTOAdapter.fromJson(reader)) == null) {
                throw c.q("menu", "menu", reader);
            }
        }
        reader.endObject();
        if (tagAtom == null) {
            throw c.j("like", "like", reader);
        }
        if (tagAtom2 == null) {
            throw c.j("dislike", "dislike", reader);
        }
        if (menuDTO != null) {
            return new ListAnswersDTO.Answer.AnswerButtons(textAtom, tagAtom, tagAtom2, makeBestButton, menuDTO);
        }
        throw c.j("menu", "menu", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ListAnswersDTO.Answer.AnswerButtons value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("like");
        this.tagAtomAdapter.mo44toJson(writer, (x) value.getLike());
        writer.w("dislike");
        this.tagAtomAdapter.mo44toJson(writer, (x) value.getDislike());
        writer.w("makeBest");
        this.nullableMakeBestButtonAdapter.mo44toJson(writer, (x) value.getMakeBest());
        writer.w("menu");
        this.menuDTOAdapter.mo44toJson(writer, (x) value.getMenu());
        writer.p();
    }
}

package ru.ozon.app.android.ugc.widgets.singlequestion.data;

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
import ru.ozon.app.android.ugc.widgets.singlequestion.data.SingleQuestionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO_AuthorQuestion_Question_QuestionButtonsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/widgets/singlequestion/data/SingleQuestionDTO$AuthorQuestion$Question$QuestionButtons$LikeButton;", "nullableLikeButtonAdapter", "Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "menuDTOAdapter", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleQuestionDTO_AuthorQuestion_Question_QuestionButtonsJsonAdapter extends JsonAdapter<SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<MenuDTO> menuDTOAdapter;

    @NotNull
    private final JsonAdapter<SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton> nullableLikeButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final n.a options;

    public SingleQuestionDTO_AuthorQuestion_Question_QuestionButtonsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("answerButton", "likeButton", "menu");
        M m11 = M.f71699a;
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "answerButton");
        this.nullableLikeButtonAdapter = moshi.f(SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton.class, m11, "likeButton");
        this.menuDTOAdapter = moshi.f(MenuDTO.class, m11, "menu");
    }

    @NotNull
    public String toString() {
        return b.c(79, "GeneratedJsonAdapter(SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonV3Atom.SmallButton smallButton = null;
        SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons.LikeButton likeButton = null;
        MenuDTO menuDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
            } else if (v11 == 1) {
                likeButton = this.nullableLikeButtonAdapter.fromJson(reader);
            } else if (v11 == 2 && (menuDTO = this.menuDTOAdapter.fromJson(reader)) == null) {
                throw c.q("menu", "menu", reader);
            }
        }
        reader.endObject();
        if (menuDTO != null) {
            return new SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons(smallButton, likeButton, menuDTO);
        }
        throw c.j("menu", "menu", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SingleQuestionDTO.AuthorQuestion.Question.QuestionButtons value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("answerButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getAnswerButton());
        writer.w("likeButton");
        this.nullableLikeButtonAdapter.mo44toJson(writer, (x) value.getLikeButton());
        writer.w("menu");
        this.menuDTOAdapter.mo44toJson(writer, (x) value.getMenu());
        writer.p();
    }
}

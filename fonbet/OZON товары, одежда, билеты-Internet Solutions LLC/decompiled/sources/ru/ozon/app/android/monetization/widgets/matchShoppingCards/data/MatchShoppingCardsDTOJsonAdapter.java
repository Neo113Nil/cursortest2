package ru.ozon.app.android.monetization.widgets.matchShoppingCards.data;

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
import ru.ozon.app.android.monetization.widgets.matchShoppingCards.data.MatchShoppingCardsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Header;", "headerAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$Card;", "listOfCardAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomActionDTOAdapter", "Lru/ozon/app/android/monetization/widgets/matchShoppingCards/data/MatchShoppingCardsDTO$ReactionButton;", "reactionButtonAdapter", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MatchShoppingCardsDTOJsonAdapter extends JsonAdapter<MatchShoppingCardsDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> atomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<MatchShoppingCardsDTO.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<List<MatchShoppingCardsDTO.Card>> listOfCardAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<MatchShoppingCardsDTO.ReactionButton> reactionButtonAdapter;

    public MatchShoppingCardsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "cards", "requestCardsAction", "refreshAction", "likeButton", "dislikeButton");
        M m11 = M.f71699a;
        this.headerAdapter = moshi.f(MatchShoppingCardsDTO.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfCardAdapter = moshi.f(D.e(List.class, MatchShoppingCardsDTO.Card.class), m11, "cards");
        this.atomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "requestCardsAction");
        this.reactionButtonAdapter = moshi.f(MatchShoppingCardsDTO.ReactionButton.class, m11, "likeButton");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(MatchShoppingCardsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MatchShoppingCardsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MatchShoppingCardsDTO.Header header = null;
        List<MatchShoppingCardsDTO.Card> list = null;
        AtomActionDTO atomActionDTO = null;
        AtomActionDTO atomActionDTO2 = null;
        MatchShoppingCardsDTO.ReactionButton reactionButton = null;
        MatchShoppingCardsDTO.ReactionButton reactionButton2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    header = this.headerAdapter.fromJson(reader);
                    if (header == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    list = this.listOfCardAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("cards", "cards", reader);
                    }
                    break;
                case 2:
                    atomActionDTO = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO == null) {
                        throw c.q("requestCardsAction", "requestCardsAction", reader);
                    }
                    break;
                case 3:
                    atomActionDTO2 = this.atomActionDTOAdapter.fromJson(reader);
                    if (atomActionDTO2 == null) {
                        throw c.q("refreshAction", "refreshAction", reader);
                    }
                    break;
                case 4:
                    reactionButton = this.reactionButtonAdapter.fromJson(reader);
                    if (reactionButton == null) {
                        throw c.q("likeButton", "likeButton", reader);
                    }
                    break;
                case 5:
                    reactionButton2 = this.reactionButtonAdapter.fromJson(reader);
                    if (reactionButton2 == null) {
                        throw c.q("dislikeButton", "dislikeButton", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (header == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (list == null) {
            throw c.j("cards", "cards", reader);
        }
        if (atomActionDTO == null) {
            throw c.j("requestCardsAction", "requestCardsAction", reader);
        }
        if (atomActionDTO2 == null) {
            throw c.j("refreshAction", "refreshAction", reader);
        }
        if (reactionButton == null) {
            throw c.j("likeButton", "likeButton", reader);
        }
        if (reactionButton2 != null) {
            return new MatchShoppingCardsDTO(header, list, atomActionDTO, atomActionDTO2, reactionButton, reactionButton2);
        }
        throw c.j("dislikeButton", "dislikeButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MatchShoppingCardsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("cards");
        this.listOfCardAdapter.mo44toJson(writer, (x) value.getCards());
        writer.w("requestCardsAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getRequestCardsAction());
        writer.w("refreshAction");
        this.atomActionDTOAdapter.mo44toJson(writer, (x) value.getRefreshAction());
        writer.w("likeButton");
        this.reactionButtonAdapter.mo44toJson(writer, (x) value.getLikeButton());
        writer.w("dislikeButton");
        this.reactionButtonAdapter.mo44toJson(writer, (x) value.getDislikeButton());
        writer.p();
    }
}

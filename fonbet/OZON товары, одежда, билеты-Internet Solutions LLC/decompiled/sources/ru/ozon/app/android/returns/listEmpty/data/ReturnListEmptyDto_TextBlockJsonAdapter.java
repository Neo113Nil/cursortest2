package ru.ozon.app.android.returns.listEmpty.data;

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
import ru.ozon.app.android.returns.listEmpty.data.ReturnListEmptyDto;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto_TextBlockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$TextBlock;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto$ImageSize;", "imageSizeAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "", "listOfTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "nullableLargeButtonAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnListEmptyDto_TextBlockJsonAdapter extends JsonAdapter<ReturnListEmptyDto.TextBlock> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ReturnListEmptyDto.ImageSize> imageSizeAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> listOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> nullableLargeButtonAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public ReturnListEmptyDto_TextBlockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("color", "image", "imageSize", CommentV3DTO.HEADER_FIELD_NAME, "textRows", "callToAction");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "color");
        this.imageSizeAdapter = moshi.f(ReturnListEmptyDto.ImageSize.class, m11, "imageSize");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.listOfTextAtomAdapter = moshi.f(D.e(List.class, TextAtom.class), m11, "textRows");
        this.nullableLargeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "callToAction");
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(ReturnListEmptyDto.TextBlock)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnListEmptyDto.TextBlock fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        ReturnListEmptyDto.ImageSize imageSize = null;
        TextAtom textAtom = null;
        List<TextAtom> list = null;
        ButtonV3Atom.LargeButton largeButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("color", "color", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 2:
                    imageSize = this.imageSizeAdapter.fromJson(reader);
                    if (imageSize == null) {
                        throw c.q("imageSize", "imageSize", reader);
                    }
                    break;
                case 3:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                    }
                    break;
                case 4:
                    list = this.listOfTextAtomAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("textRows", "textRows", reader);
                    }
                    break;
                case 5:
                    largeButton = this.nullableLargeButtonAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("color", "color", reader);
        }
        if (str2 == null) {
            throw c.j("image", "image", reader);
        }
        if (imageSize == null) {
            throw c.j("imageSize", "imageSize", reader);
        }
        if (textAtom == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (list != null) {
            return new ReturnListEmptyDto.TextBlock(str, str2, imageSize, textAtom, list, largeButton);
        }
        throw c.j("textRows", "textRows", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnListEmptyDto.TextBlock value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("color");
        this.stringAdapter.mo44toJson(writer, (x) value.getColor());
        writer.w("image");
        this.stringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("imageSize");
        this.imageSizeAdapter.mo44toJson(writer, (x) value.getImageSize());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("textRows");
        this.listOfTextAtomAdapter.mo44toJson(writer, (x) value.getTextRows());
        writer.w("callToAction");
        this.nullableLargeButtonAdapter.mo44toJson(writer, (x) value.getCallToAction());
        writer.p();
    }
}

package ru.ozon.app.android.returns.common.data.dto;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/common/data/dto/ReturnStatusMessage;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnStatusMessageJsonAdapter extends JsonAdapter<ReturnStatusMessage> {
    public static final int $stable = 8;
    private volatile Constructor<ReturnStatusMessage> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    public ReturnStatusMessageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "text", "caption", "actionButton", "radius", "backgroundColor", "leftPadding", "topPadding", "rightPadding", "bottomPadding");
        M m11 = M.f71699a;
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "actionButton");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "radius");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.paddingsAdapter = moshi.f(Paddings.class, m11, "leftPadding");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(ReturnStatusMessage)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnStatusMessage fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        ButtonV3DTO buttonV3DTO = null;
        CornerRadius cornerRadius = null;
        String str = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 1:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 4:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    paddings = this.paddingsAdapter.fromJson(reader);
                    if (paddings == null) {
                        throw c.q("leftPadding", "leftPadding", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    paddings2 = this.paddingsAdapter.fromJson(reader);
                    if (paddings2 == null) {
                        throw c.q("topPadding", "topPadding", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    paddings3 = this.paddingsAdapter.fromJson(reader);
                    if (paddings3 == null) {
                        throw c.q("rightPadding", "rightPadding", reader);
                    }
                    i11 &= -257;
                    break;
                case 9:
                    paddings4 = this.paddingsAdapter.fromJson(reader);
                    if (paddings4 == null) {
                        throw c.q("bottomPadding", "bottomPadding", reader);
                    }
                    i11 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -977) {
            String str2 = str;
            CornerRadius cornerRadius2 = cornerRadius;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            TextAtom textAtom4 = textAtom3;
            TextAtom textAtom5 = textAtom2;
            Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings4, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            return new ReturnStatusMessage(textAtom, textAtom5, textAtom4, buttonV3DTO2, cornerRadius2, str2, paddings, paddings2, paddings3, paddings4);
        }
        String str3 = str;
        CornerRadius cornerRadius3 = cornerRadius;
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO;
        TextAtom textAtom6 = textAtom3;
        TextAtom textAtom7 = textAtom2;
        TextAtom textAtom8 = textAtom;
        Constructor<ReturnStatusMessage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReturnStatusMessage.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, TextAtom.class, ButtonV3DTO.class, CornerRadius.class, String.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        ReturnStatusMessage newInstance = constructor.newInstance(textAtom8, textAtom7, textAtom6, buttonV3DTO3, cornerRadius3, str3, paddings, paddings2, paddings3, paddings4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnStatusMessage value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("text");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("caption");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.w("actionButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.w("radius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("leftPadding");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getLeftPadding());
        writer.w("topPadding");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("rightPadding");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getRightPadding());
        writer.w("bottomPadding");
        this.paddingsAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.p();
    }
}

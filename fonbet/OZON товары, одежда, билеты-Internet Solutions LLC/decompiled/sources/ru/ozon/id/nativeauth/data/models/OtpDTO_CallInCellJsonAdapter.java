package ru.ozon.id.nativeauth.data.models;

import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpDTO_CallInCellJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellButton;", "nullableCallInCellButtonAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell$CallInCellTimer;", "nullableCallInCellTimerAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtpDTO_CallInCellJsonAdapter extends JsonAdapter<OtpDTO.CallInCell> {

    @NotNull
    private final JsonAdapter<OtpDTO.CallInCell.CallInCellButton> nullableCallInCellButtonAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.CallInCell.CallInCellTimer> nullableCallInCellTimerAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OtpDTO_CallInCellJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("statusIcon", "statusIconTintColor", SelectionItemFormDTO.TITLE_FIELD_NAME, "titleColor", "subtitle", "subtitleColor", "button", DynamicElementDTO.TIMER);
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "statusIcon");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "statusIconTintColor");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableStringAdapter = f11;
        JsonAdapter<OtpDTO.CallInCell.CallInCellButton> f12 = moshi.f(OtpDTO.CallInCell.CallInCellButton.class, m11, "button");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableCallInCellButtonAdapter = f12;
        JsonAdapter<OtpDTO.CallInCell.CallInCellTimer> f13 = moshi.f(OtpDTO.CallInCell.CallInCellTimer.class, m11, DynamicElementDTO.TIMER);
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableCallInCellTimerAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(39, "GeneratedJsonAdapter(OtpDTO.CallInCell)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OtpDTO.CallInCell fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        OtpDTO.CallInCell.CallInCellButton callInCellButton = null;
        OtpDTO.CallInCell.CallInCellTimer callInCellTimer = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("statusIcon", "statusIcon", reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    callInCellButton = this.nullableCallInCellButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    callInCellTimer = this.nullableCallInCellTimerAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("statusIcon", "statusIcon", reader);
        }
        if (str3 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (str5 != null) {
            return new OtpDTO.CallInCell(str, str2, str3, str4, str5, str6, callInCellButton, callInCellTimer);
        }
        throw c.j("subtitle", "subtitle", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OtpDTO.CallInCell value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("statusIcon");
        this.stringAdapter.mo44toJson(writer, (x) value_.getStatusIcon());
        writer.w("statusIconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStatusIconTintColor());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("titleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getTitleColor());
        writer.w("subtitle");
        this.stringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("subtitleColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSubtitleColor());
        writer.w("button");
        this.nullableCallInCellButtonAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableCallInCellTimerAdapter.mo44toJson(writer, (x) value_.getTimer());
        writer.p();
    }
}

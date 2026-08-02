package ru.ozon.app.android.session.logoutonall.data;

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
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Alignment;", "alignmentAdapter", "", "booleanAdapter", "nullableStringAdapter", "Lru/ozon/app/android/session/logoutonall/data/LogoutOnAllDevicesDTO$Confirmation;", "confirmationAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LogoutOnAllDevicesDTOJsonAdapter extends JsonAdapter<LogoutOnAllDevicesDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<LogoutOnAllDevicesDTO.Alignment> alignmentAdapter;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<LogoutOnAllDevicesDTO.Confirmation> confirmationAdapter;
    private volatile Constructor<LogoutOnAllDevicesDTO> constructorRef;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public LogoutOnAllDevicesDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "action", "alignment", "showSeparator", "textColor", "confirmation");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.alignmentAdapter = moshi.f(LogoutOnAllDevicesDTO.Alignment.class, m11, "alignment");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "showSeparator");
        this.nullableStringAdapter = moshi.f(String.class, m11, "textColor");
        this.confirmationAdapter = moshi.f(LogoutOnAllDevicesDTO.Confirmation.class, m11, "confirmation");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(LogoutOnAllDevicesDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public LogoutOnAllDevicesDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        LogoutOnAllDevicesDTO.Alignment alignment = null;
        String str3 = null;
        LogoutOnAllDevicesDTO.Confirmation confirmation = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("action", "action", reader);
                    }
                    break;
                case 2:
                    alignment = this.alignmentAdapter.fromJson(reader);
                    if (alignment == null) {
                        throw c.q("alignment", "alignment", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("showSeparator", "showSeparator", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    confirmation = this.confirmationAdapter.fromJson(reader);
                    if (confirmation == null) {
                        throw c.q("confirmation", "confirmation", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (i11 == -13) {
            if (str == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            if (str2 == null) {
                throw c.j("action", "action", reader);
            }
            Intrinsics.g(alignment, "null cannot be cast to non-null type ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesDTO.Alignment");
            boolean booleanValue = bool2.booleanValue();
            if (confirmation != null) {
                return new LogoutOnAllDevicesDTO(str, str2, alignment, booleanValue, str3, confirmation);
            }
            throw c.j("confirmation", "confirmation", reader);
        }
        String str4 = str;
        Constructor<LogoutOnAllDevicesDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LogoutOnAllDevicesDTO.class.getDeclaredConstructor(String.class, String.class, LogoutOnAllDevicesDTO.Alignment.class, Boolean.TYPE, String.class, LogoutOnAllDevicesDTO.Confirmation.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<LogoutOnAllDevicesDTO> constructor2 = constructor;
        if (str4 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        if (str2 == null) {
            throw c.j("action", "action", reader);
        }
        if (confirmation == null) {
            throw c.j("confirmation", "confirmation", reader);
        }
        LogoutOnAllDevicesDTO newInstance = constructor2.newInstance(str4, str2, alignment, bool2, str3, confirmation, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, LogoutOnAllDevicesDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("action");
        this.stringAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("alignment");
        this.alignmentAdapter.mo44toJson(writer, (x) value.getAlignment());
        writer.w("showSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getShowSeparator()));
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("confirmation");
        this.confirmationAdapter.mo44toJson(writer, (x) value.getConfirmation());
        writer.p();
    }
}

package ru.ozon.app.android.session.editCredential.otp.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\"\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$Input;", "nullableInputAdapter", "nullableStringAdapter", "", "", "nullableMapOfStringAnyAdapter", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$RetryButton;", "nullableRetryButtonAdapter", "", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$HintButton;", "nullableListOfHintButtonAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/session/editCredential/otp/data/OTPWidgetDTO$PageType;", "pageTypeAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OTPWidgetDTOJsonAdapter extends JsonAdapter<OTPWidgetDTO> {
    public static final int $stable = 8;
    private volatile Constructor<OTPWidgetDTO> constructorRef;

    @NotNull
    private final JsonAdapter<OTPWidgetDTO.Input> nullableInputAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<OTPWidgetDTO.HintButton>> nullableListOfHintButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<OTPWidgetDTO.RetryButton> nullableRetryButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OTPWidgetDTO.PageType> pageTypeAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OTPWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "input", "action", "data", "retryButton", "hintButtons", "otpLength", "errorLogoUrl", "pageType");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableOzonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "subtitle");
        this.nullableInputAdapter = moshi.f(OTPWidgetDTO.Input.class, m11, "input");
        this.nullableStringAdapter = moshi.f(String.class, m11, "action");
        this.nullableMapOfStringAnyAdapter = moshi.f(D.e(Map.class, String.class, Object.class), m11, "data");
        this.nullableRetryButtonAdapter = moshi.f(OTPWidgetDTO.RetryButton.class, m11, "retryButton");
        this.nullableListOfHintButtonAdapter = moshi.f(D.e(List.class, OTPWidgetDTO.HintButton.class), m11, "hintButtons");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "otpLength");
        this.pageTypeAdapter = moshi.f(OTPWidgetDTO.PageType.class, m11, "pageType");
    }

    @NotNull
    public String toString() {
        return b.c(34, "GeneratedJsonAdapter(OTPWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OTPWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        OTPWidgetDTO.Input input = null;
        String str2 = null;
        Map<String, Object> map = null;
        OTPWidgetDTO.RetryButton retryButton = null;
        List<OTPWidgetDTO.HintButton> list = null;
        Integer num = null;
        String str3 = null;
        OTPWidgetDTO.PageType pageType = null;
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
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    input = this.nullableInputAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    break;
                case 5:
                    retryButton = this.nullableRetryButtonAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.nullableListOfHintButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 8:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    pageType = this.pageTypeAdapter.fromJson(reader);
                    if (pageType == null) {
                        throw c.q("pageType", "pageType", reader);
                    }
                    i11 = -513;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -513) {
            String str4 = str3;
            Integer num2 = num;
            List<OTPWidgetDTO.HintButton> list2 = list;
            OTPWidgetDTO.RetryButton retryButton2 = retryButton;
            Map<String, Object> map2 = map;
            String str5 = str2;
            OTPWidgetDTO.Input input2 = input;
            OzonSpannableString ozonSpannableString2 = ozonSpannableString;
            String str6 = str;
            if (str6 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(pageType, "null cannot be cast to non-null type ru.ozon.app.android.session.editCredential.otp.data.OTPWidgetDTO.PageType");
            return new OTPWidgetDTO(str6, ozonSpannableString2, input2, str5, map2, retryButton2, list2, num2, str4, pageType);
        }
        String str7 = str3;
        Integer num3 = num;
        List<OTPWidgetDTO.HintButton> list3 = list;
        OTPWidgetDTO.RetryButton retryButton3 = retryButton;
        Map<String, Object> map3 = map;
        String str8 = str2;
        OTPWidgetDTO.Input input3 = input;
        OzonSpannableString ozonSpannableString3 = ozonSpannableString;
        String str9 = str;
        Constructor<OTPWidgetDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OTPWidgetDTO.class.getDeclaredConstructor(String.class, OzonSpannableString.class, OTPWidgetDTO.Input.class, String.class, Map.class, OTPWidgetDTO.RetryButton.class, List.class, Integer.class, String.class, OTPWidgetDTO.PageType.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str9 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        OTPWidgetDTO newInstance = constructor.newInstance(str9, ozonSpannableString3, input3, str8, map3, retryButton3, list3, num3, str7, pageType, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OTPWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("input");
        this.nullableInputAdapter.mo44toJson(writer, (x) value.getInput());
        writer.w("action");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("data");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value.getData());
        writer.w("retryButton");
        this.nullableRetryButtonAdapter.mo44toJson(writer, (x) value.getRetryButton());
        writer.w("hintButtons");
        this.nullableListOfHintButtonAdapter.mo44toJson(writer, (x) value.getHintButtons());
        writer.w("otpLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getOtpLength());
        writer.w("errorLogoUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getErrorLogoUrl());
        writer.w("pageType");
        this.pageTypeAdapter.mo44toJson(writer, (x) value.getPageType());
        writer.p();
    }
}

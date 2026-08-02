package ru.ozon.id.nativeauth.data.models;

import Y9.c;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.common.disclaimer.DisclaimerDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/ozon/id/nativeauth/data/models/OtpVOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/data/models/OtpVO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/data/models/OtpVO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/data/models/OtpVO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/data/models/OtpDTO$b;", "pageTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "nullableOzonSpannableStringAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$MessengerOtpCell;", "nullableMessengerOtpCellAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$Input;", "nullableInputAdapter", "nullableStringAdapter", "", "", "nullableMapOfStringAnyAdapter", "", "Lru/ozon/id/nativeauth/data/models/OtpDTO$HintButton;", "nullableListOfHintButtonAdapter", "", "nullableIntAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$PhoneExample;", "nullablePhoneExampleAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$ContinueButton;", "nullableContinueButtonAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AgreementSheet;", "nullableAgreementSheetAdapter", "Lru/ozon/id/common/disclaimer/DisclaimerDTO;", "nullableDisclaimerDTOAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$RetryButton;", "nullableRetryButtonAdapter", "Lru/ozon/id/nativeauth/data/models/OtpDTO$CallInCell;", "nullableCallInCellAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtpVOJsonAdapter extends JsonAdapter<OtpVO> {
    private volatile Constructor<OtpVO> constructorRef;

    @NotNull
    private final JsonAdapter<OtpDTO.AgreementSheet> nullableAgreementSheetAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.CallInCell> nullableCallInCellAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.ContinueButton> nullableContinueButtonAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerDTO> nullableDisclaimerDTOAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.Input> nullableInputAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<List<OtpDTO.HintButton>> nullableListOfHintButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Object>> nullableMapOfStringAnyAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.MessengerOtpCell> nullableMessengerOtpCellAdapter;

    @NotNull
    private final JsonAdapter<OzonSpannableString> nullableOzonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.PhoneExample> nullablePhoneExampleAdapter;

    @NotNull
    private final JsonAdapter<OtpDTO.RetryButton> nullableRetryButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OtpDTO.b> pageTypeAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public OtpVOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("pageType", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "messengerOtpCell", "input", "action", "data", "hintButtons", "otpLength", "phoneExample", "continueButton", "agreementSheet", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "retryButton", "errorLogoUrl", "callInCell");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<OtpDTO.b> f7 = moshi.f(OtpDTO.b.class, m11, "pageType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.pageTypeAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<OzonSpannableString> f12 = moshi.f(OzonSpannableString.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableOzonSpannableStringAdapter = f12;
        JsonAdapter<OtpDTO.MessengerOtpCell> f13 = moshi.f(OtpDTO.MessengerOtpCell.class, m11, "messengerOtpCell");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMessengerOtpCellAdapter = f13;
        JsonAdapter<OtpDTO.Input> f14 = moshi.f(OtpDTO.Input.class, m11, "input");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableInputAdapter = f14;
        JsonAdapter<String> f15 = moshi.f(String.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableStringAdapter = f15;
        JsonAdapter<Map<String, Object>> f16 = moshi.f(D.e(Map.class, String.class, Object.class), m11, "data");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringAnyAdapter = f16;
        JsonAdapter<List<OtpDTO.HintButton>> f17 = moshi.f(D.e(List.class, OtpDTO.HintButton.class), m11, "hintButtons");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableListOfHintButtonAdapter = f17;
        JsonAdapter<Integer> f18 = moshi.f(Integer.class, m11, "otpLength");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableIntAdapter = f18;
        JsonAdapter<OtpDTO.PhoneExample> f19 = moshi.f(OtpDTO.PhoneExample.class, m11, "phoneExample");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullablePhoneExampleAdapter = f19;
        JsonAdapter<OtpDTO.ContinueButton> f21 = moshi.f(OtpDTO.ContinueButton.class, m11, "continueButton");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableContinueButtonAdapter = f21;
        JsonAdapter<OtpDTO.AgreementSheet> f22 = moshi.f(OtpDTO.AgreementSheet.class, m11, "agreementSheet");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableAgreementSheetAdapter = f22;
        JsonAdapter<DisclaimerDTO> f23 = moshi.f(DisclaimerDTO.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f23, "adapter(...)");
        this.nullableDisclaimerDTOAdapter = f23;
        JsonAdapter<OtpDTO.RetryButton> f24 = moshi.f(OtpDTO.RetryButton.class, m11, "retryButton");
        Intrinsics.checkNotNullExpressionValue(f24, "adapter(...)");
        this.nullableRetryButtonAdapter = f24;
        JsonAdapter<OtpDTO.CallInCell> f25 = moshi.f(OtpDTO.CallInCell.class, m11, "callInCell");
        Intrinsics.checkNotNullExpressionValue(f25, "adapter(...)");
        this.nullableCallInCellAdapter = f25;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(27, "GeneratedJsonAdapter(OtpVO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OtpVO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        OtpDTO.b bVar = null;
        String str = null;
        OzonSpannableString ozonSpannableString = null;
        OtpDTO.MessengerOtpCell messengerOtpCell = null;
        OtpDTO.Input input = null;
        String str2 = null;
        Map<String, Object> map = null;
        List<OtpDTO.HintButton> list = null;
        Integer num = null;
        OtpDTO.PhoneExample phoneExample = null;
        OtpDTO.ContinueButton continueButton = null;
        OtpDTO.AgreementSheet agreementSheet = null;
        DisclaimerDTO disclaimerDTO = null;
        OtpDTO.RetryButton retryButton = null;
        String str3 = null;
        OtpDTO.CallInCell callInCell = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bVar = this.pageTypeAdapter.fromJson(reader);
                    if (bVar == null) {
                        throw c.q("pageType", "pageType", reader);
                    }
                    i12 = -2;
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 2:
                    ozonSpannableString = this.nullableOzonSpannableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    messengerOtpCell = this.nullableMessengerOtpCellAdapter.fromJson(reader);
                    break;
                case 4:
                    input = this.nullableInputAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringAnyAdapter.fromJson(reader);
                    break;
                case 7:
                    list = this.nullableListOfHintButtonAdapter.fromJson(reader);
                    break;
                case 8:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 9:
                    phoneExample = this.nullablePhoneExampleAdapter.fromJson(reader);
                    break;
                case 10:
                    continueButton = this.nullableContinueButtonAdapter.fromJson(reader);
                    break;
                case 11:
                    agreementSheet = this.nullableAgreementSheetAdapter.fromJson(reader);
                    break;
                case 12:
                    disclaimerDTO = this.nullableDisclaimerDTOAdapter.fromJson(reader);
                    break;
                case 13:
                    retryButton = this.nullableRetryButtonAdapter.fromJson(reader);
                    break;
                case 14:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    callInCell = this.nullableCallInCellAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i12 == -2) {
            Intrinsics.g(bVar, "null cannot be cast to non-null type ru.ozon.id.nativeauth.data.models.OtpDTO.PageType");
            if (str == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Integer num2 = num;
            List<OtpDTO.HintButton> list2 = list;
            Map<String, Object> map2 = map;
            String str4 = str2;
            OtpDTO.Input input2 = input;
            OtpDTO.MessengerOtpCell messengerOtpCell2 = messengerOtpCell;
            return new OtpVO(bVar, str, ozonSpannableString, messengerOtpCell2, input2, str4, map2, list2, num2, phoneExample, continueButton, agreementSheet, disclaimerDTO, retryButton, str3, callInCell);
        }
        Constructor<OtpVO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = OtpVO.class.getDeclaredConstructor(OtpDTO.b.class, String.class, OzonSpannableString.class, OtpDTO.MessengerOtpCell.class, OtpDTO.Input.class, String.class, Map.class, List.class, Integer.class, OtpDTO.PhoneExample.class, OtpDTO.ContinueButton.class, OtpDTO.AgreementSheet.class, DisclaimerDTO.class, OtpDTO.RetryButton.class, String.class, OtpDTO.CallInCell.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<OtpVO> constructor2 = constructor;
        if (str == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        OtpVO newInstance = constructor2.newInstance(bVar, str, ozonSpannableString, messengerOtpCell, input, str2, map, list, num, phoneExample, continueButton, agreementSheet, disclaimerDTO, retryButton, str3, callInCell, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OtpVO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("pageType");
        this.pageTypeAdapter.mo44toJson(writer, (x) value_.getPageType());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableOzonSpannableStringAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("messengerOtpCell");
        this.nullableMessengerOtpCellAdapter.mo44toJson(writer, (x) value_.getMessengerOtpCell());
        writer.w("input");
        this.nullableInputAdapter.mo44toJson(writer, (x) value_.getInput());
        writer.w("action");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("data");
        this.nullableMapOfStringAnyAdapter.mo44toJson(writer, (x) value_.getData());
        writer.w("hintButtons");
        this.nullableListOfHintButtonAdapter.mo44toJson(writer, (x) value_.getHintButtons());
        writer.w("otpLength");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getOtpLength());
        writer.w("phoneExample");
        this.nullablePhoneExampleAdapter.mo44toJson(writer, (x) value_.getPhoneExample());
        writer.w("continueButton");
        this.nullableContinueButtonAdapter.mo44toJson(writer, (x) value_.getContinueButton());
        writer.w("agreementSheet");
        this.nullableAgreementSheetAdapter.mo44toJson(writer, (x) value_.getAgreementSheet());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerDTOAdapter.mo44toJson(writer, (x) value_.getDisclaimer());
        writer.w("retryButton");
        this.nullableRetryButtonAdapter.mo44toJson(writer, (x) value_.getRetryButton());
        writer.w("errorLogoUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorLogoUrl());
        writer.w("callInCell");
        this.nullableCallInCellAdapter.mo44toJson(writer, (x) value_.getCallInCell());
        writer.p();
    }
}

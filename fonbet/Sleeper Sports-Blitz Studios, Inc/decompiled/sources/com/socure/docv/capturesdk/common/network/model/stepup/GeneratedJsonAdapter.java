package com.socure.docv.capturesdk.common.network.model.stepup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreensJsonAdapter.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/ScreensJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Screens;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "backCaptureAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/BackCapture;", "backIdAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/BackId;", "commonAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Common;", "frontCaptureAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontCapture;", "frontIdAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/FrontId;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "passportAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Passport;", "pickerAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Picker;", "selfieAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Selfie;", "selfieCaptureAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/SelfieCapture;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", InAppPurchaseConstants.METHOD_TO_STRING, "", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.socure.docv.capturesdk.common.network.model.stepup.ScreensJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<Screens> {
    public static final int $stable = 8;
    private final JsonAdapter<BackCapture> backCaptureAdapter;
    private final JsonAdapter<BackId> backIdAdapter;
    private final JsonAdapter<Common> commonAdapter;
    private final JsonAdapter<FrontCapture> frontCaptureAdapter;
    private final JsonAdapter<FrontId> frontIdAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<Passport> passportAdapter;
    private final JsonAdapter<Picker> pickerAdapter;
    private final JsonAdapter<Selfie> selfieAdapter;
    private final JsonAdapter<SelfieCapture> selfieCaptureAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("picker", "frontId", "frontCapture", "backId", "backCapture", ApiConstant.DOCUMENT_SELFIE, "selfieCapture", "passport", "common");
        Intrinsics.checkNotNullExpressionValue(of, "of(\"picker\", \"frontId\",\n…e\", \"passport\", \"common\")");
        this.options = of;
        JsonAdapter<Picker> adapter = moshi.adapter(Picker.class, SetsKt.emptySet(), "picker");
        Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Picker::cl…ptySet(),\n      \"picker\")");
        this.pickerAdapter = adapter;
        JsonAdapter<FrontId> adapter2 = moshi.adapter(FrontId.class, SetsKt.emptySet(), "frontId");
        Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(FrontId::c…tySet(),\n      \"frontId\")");
        this.frontIdAdapter = adapter2;
        JsonAdapter<FrontCapture> adapter3 = moshi.adapter(FrontCapture.class, SetsKt.emptySet(), "frontCapture");
        Intrinsics.checkNotNullExpressionValue(adapter3, "moshi.adapter(FrontCaptu…ptySet(), \"frontCapture\")");
        this.frontCaptureAdapter = adapter3;
        JsonAdapter<BackId> adapter4 = moshi.adapter(BackId.class, SetsKt.emptySet(), "backId");
        Intrinsics.checkNotNullExpressionValue(adapter4, "moshi.adapter(BackId::cl…ptySet(),\n      \"backId\")");
        this.backIdAdapter = adapter4;
        JsonAdapter<BackCapture> adapter5 = moshi.adapter(BackCapture.class, SetsKt.emptySet(), "backCapture");
        Intrinsics.checkNotNullExpressionValue(adapter5, "moshi.adapter(BackCaptur…mptySet(), \"backCapture\")");
        this.backCaptureAdapter = adapter5;
        JsonAdapter<Selfie> adapter6 = moshi.adapter(Selfie.class, SetsKt.emptySet(), ApiConstant.DOCUMENT_SELFIE);
        Intrinsics.checkNotNullExpressionValue(adapter6, "moshi.adapter(Selfie::cl…ptySet(),\n      \"selfie\")");
        this.selfieAdapter = adapter6;
        JsonAdapter<SelfieCapture> adapter7 = moshi.adapter(SelfieCapture.class, SetsKt.emptySet(), "selfieCapture");
        Intrinsics.checkNotNullExpressionValue(adapter7, "moshi.adapter(SelfieCapt…tySet(), \"selfieCapture\")");
        this.selfieCaptureAdapter = adapter7;
        JsonAdapter<Passport> adapter8 = moshi.adapter(Passport.class, SetsKt.emptySet(), "passport");
        Intrinsics.checkNotNullExpressionValue(adapter8, "moshi.adapter(Passport::…  emptySet(), \"passport\")");
        this.passportAdapter = adapter8;
        JsonAdapter<Common> adapter9 = moshi.adapter(Common.class, SetsKt.emptySet(), "common");
        Intrinsics.checkNotNullExpressionValue(adapter9, "moshi.adapter(Common::cl…ptySet(),\n      \"common\")");
        this.commonAdapter = adapter9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(Screens)");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public Screens fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Picker picker = null;
        FrontId frontId = null;
        FrontCapture frontCapture = null;
        BackId backId = null;
        BackCapture backCapture = null;
        Selfie selfie = null;
        SelfieCapture selfieCapture = null;
        Passport passport = null;
        Common common = null;
        while (true) {
            Picker picker2 = picker;
            FrontId frontId2 = frontId;
            FrontCapture frontCapture2 = frontCapture;
            BackId backId2 = backId;
            if (reader.hasNext()) {
                BackCapture backCapture2 = backCapture;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 0:
                        picker = this.pickerAdapter.fromJson(reader);
                        if (picker == null) {
                            JsonDataException unexpectedNull = Util.unexpectedNull("picker", "picker", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull, "unexpectedNull(\"picker\",…        \"picker\", reader)");
                            throw unexpectedNull;
                        }
                        backCapture = backCapture2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 1:
                        frontId = this.frontIdAdapter.fromJson(reader);
                        if (frontId == null) {
                            JsonDataException unexpectedNull2 = Util.unexpectedNull("frontId", "frontId", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull2, "unexpectedNull(\"frontId\"…       \"frontId\", reader)");
                            throw unexpectedNull2;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 2:
                        frontCapture = this.frontCaptureAdapter.fromJson(reader);
                        if (frontCapture == null) {
                            JsonDataException unexpectedNull3 = Util.unexpectedNull("frontCapture", "frontCapture", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull3, "unexpectedNull(\"frontCap…, \"frontCapture\", reader)");
                            throw unexpectedNull3;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        backId = backId2;
                    case 3:
                        backId = this.backIdAdapter.fromJson(reader);
                        if (backId == null) {
                            JsonDataException unexpectedNull4 = Util.unexpectedNull("backId", "backId", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull4, "unexpectedNull(\"backId\",…        \"backId\", reader)");
                            throw unexpectedNull4;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                    case 4:
                        backCapture = this.backCaptureAdapter.fromJson(reader);
                        if (backCapture == null) {
                            JsonDataException unexpectedNull5 = Util.unexpectedNull("backCapture", "backCapture", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull5, "unexpectedNull(\"backCapt…\", \"backCapture\", reader)");
                            throw unexpectedNull5;
                        }
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 5:
                        selfie = this.selfieAdapter.fromJson(reader);
                        if (selfie == null) {
                            JsonDataException unexpectedNull6 = Util.unexpectedNull(ApiConstant.DOCUMENT_SELFIE, ApiConstant.DOCUMENT_SELFIE, reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull6, "unexpectedNull(\"selfie\",…        \"selfie\", reader)");
                            throw unexpectedNull6;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 6:
                        selfieCapture = this.selfieCaptureAdapter.fromJson(reader);
                        if (selfieCapture == null) {
                            JsonDataException unexpectedNull7 = Util.unexpectedNull("selfieCapture", "selfieCapture", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull7, "unexpectedNull(\"selfieCa… \"selfieCapture\", reader)");
                            throw unexpectedNull7;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 7:
                        passport = this.passportAdapter.fromJson(reader);
                        if (passport == null) {
                            JsonDataException unexpectedNull8 = Util.unexpectedNull("passport", "passport", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull8, "unexpectedNull(\"passport…      \"passport\", reader)");
                            throw unexpectedNull8;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    case 8:
                        common = this.commonAdapter.fromJson(reader);
                        if (common == null) {
                            JsonDataException unexpectedNull9 = Util.unexpectedNull("common", "common", reader);
                            Intrinsics.checkNotNullExpressionValue(unexpectedNull9, "unexpectedNull(\"common\",…        \"common\", reader)");
                            throw unexpectedNull9;
                        }
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                    default:
                        backCapture = backCapture2;
                        picker = picker2;
                        frontId = frontId2;
                        frontCapture = frontCapture2;
                        backId = backId2;
                }
            } else {
                BackCapture backCapture3 = backCapture;
                reader.endObject();
                if (picker2 == null) {
                    JsonDataException missingProperty = Util.missingProperty("picker", "picker", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty, "missingProperty(\"picker\", \"picker\", reader)");
                    throw missingProperty;
                }
                if (frontId2 == null) {
                    JsonDataException missingProperty2 = Util.missingProperty("frontId", "frontId", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty2, "missingProperty(\"frontId\", \"frontId\", reader)");
                    throw missingProperty2;
                }
                if (frontCapture2 == null) {
                    JsonDataException missingProperty3 = Util.missingProperty("frontCapture", "frontCapture", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty3, "missingProperty(\"frontCa…ure\",\n            reader)");
                    throw missingProperty3;
                }
                if (backId2 == null) {
                    JsonDataException missingProperty4 = Util.missingProperty("backId", "backId", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty4, "missingProperty(\"backId\", \"backId\", reader)");
                    throw missingProperty4;
                }
                if (backCapture3 == null) {
                    JsonDataException missingProperty5 = Util.missingProperty("backCapture", "backCapture", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty5, "missingProperty(\"backCap…ure\",\n            reader)");
                    throw missingProperty5;
                }
                if (selfie == null) {
                    JsonDataException missingProperty6 = Util.missingProperty(ApiConstant.DOCUMENT_SELFIE, ApiConstant.DOCUMENT_SELFIE, reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty6, "missingProperty(\"selfie\", \"selfie\", reader)");
                    throw missingProperty6;
                }
                if (selfieCapture == null) {
                    JsonDataException missingProperty7 = Util.missingProperty("selfieCapture", "selfieCapture", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty7, "missingProperty(\"selfieC… \"selfieCapture\", reader)");
                    throw missingProperty7;
                }
                if (passport == null) {
                    JsonDataException missingProperty8 = Util.missingProperty("passport", "passport", reader);
                    Intrinsics.checkNotNullExpressionValue(missingProperty8, "missingProperty(\"passport\", \"passport\", reader)");
                    throw missingProperty8;
                }
                if (common != null) {
                    return new Screens(picker2, frontId2, frontCapture2, backId2, backCapture3, selfie, selfieCapture, passport, common);
                }
                JsonDataException missingProperty9 = Util.missingProperty("common", "common", reader);
                Intrinsics.checkNotNullExpressionValue(missingProperty9, "missingProperty(\"common\", \"common\", reader)");
                throw missingProperty9;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, Screens value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("picker");
        this.pickerAdapter.toJson(writer, (JsonWriter) value_.getPicker());
        writer.name("frontId");
        this.frontIdAdapter.toJson(writer, (JsonWriter) value_.getFrontId());
        writer.name("frontCapture");
        this.frontCaptureAdapter.toJson(writer, (JsonWriter) value_.getFrontCapture());
        writer.name("backId");
        this.backIdAdapter.toJson(writer, (JsonWriter) value_.getBackId());
        writer.name("backCapture");
        this.backCaptureAdapter.toJson(writer, (JsonWriter) value_.getBackCapture());
        writer.name(ApiConstant.DOCUMENT_SELFIE);
        this.selfieAdapter.toJson(writer, (JsonWriter) value_.getSelfie());
        writer.name("selfieCapture");
        this.selfieCaptureAdapter.toJson(writer, (JsonWriter) value_.getSelfieCapture());
        writer.name("passport");
        this.passportAdapter.toJson(writer, (JsonWriter) value_.getPassport());
        writer.name("common");
        this.commonAdapter.toJson(writer, (JsonWriter) value_.getCommon());
        writer.endObject();
    }
}

package com.socure.docv.capturesdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.models.UnstructuredModuleModel;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnstructuredModuleModel_SubmitButtonMessagesJsonAdapter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel_SubmitButtonMessagesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$SubmitButtonMessages;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.socure.docv.capturesdk.models.UnstructuredModuleModel_SubmitButtonMessagesJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<UnstructuredModuleModel.SubmitButtonMessages> {
    public static final int $stable = 8;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("submit", "retake", "processing", "success");
        Intrinsics.checkNotNullExpressionValue(of, "of(\"submit\", \"retake\", \"…essing\",\n      \"success\")");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "submit");
        Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(String::cl…    emptySet(), \"submit\")");
        this.nullableStringAdapter = adapter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(66);
        sb.append("GeneratedJsonAdapter(UnstructuredModuleModel.SubmitButtonMessages)");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public UnstructuredModuleModel.SubmitButtonMessages fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 2) {
                str3 = this.nullableStringAdapter.fromJson(reader);
            } else if (selectName == 3) {
                str4 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new UnstructuredModuleModel.SubmitButtonMessages(str, str2, str3, str4);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, UnstructuredModuleModel.SubmitButtonMessages value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("submit");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getSubmit());
        writer.name("retake");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getRetake());
        writer.name("processing");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getProcessing());
        writer.name("success");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getSuccess());
        writer.endObject();
    }
}

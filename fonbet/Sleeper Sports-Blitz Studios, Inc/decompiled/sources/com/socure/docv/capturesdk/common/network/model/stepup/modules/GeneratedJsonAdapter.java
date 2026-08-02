package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleConfigJsonAdapter.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010 \u001a\u00020\u0014H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleConfig;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableBooleanAdapter", "", "nullableIntAdapter", "", "nullableLabelsAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "nullableListOfBodyComponentAdapter", "", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/BodyComponent;", "nullableListOfButtonAdapter", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Button;", "nullableListOfStringAdapter", "", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleConfigJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<ModuleConfig> {
    public static final int $stable = 8;
    private volatile Constructor<ModuleConfig> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Labels> nullableLabelsAdapter;
    private final JsonAdapter<List<BodyComponent>> nullableListOfBodyComponentAdapter;
    private final JsonAdapter<List<Button>> nullableListOfButtonAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of("labels", "buttons", "bodyComponents", "consentVersion", "consentLanguage", "errorMessage", "completedModuleCount", "totalModuleCount", "documentTypes", "collectionMethods", "uploadFileTypes", "infoModalText", "useCaseType", ApiConstant.DOCUMENT_TYPE, "currentVerificationCount", "totalVerificationCount", "transitionScreenEnabled");
        Intrinsics.checkNotNullExpressionValue(of, "of(\"labels\", \"buttons\",\n…transitionScreenEnabled\")");
        this.options = of;
        JsonAdapter<Labels> adapter = moshi.adapter(Labels.class, SetsKt.emptySet(), "labels");
        Intrinsics.checkNotNullExpressionValue(adapter, "moshi.adapter(Labels::cl…    emptySet(), \"labels\")");
        this.nullableLabelsAdapter = adapter;
        JsonAdapter<List<Button>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, Button.class), SetsKt.emptySet(), "buttons");
        Intrinsics.checkNotNullExpressionValue(adapter2, "moshi.adapter(Types.newP…tySet(),\n      \"buttons\")");
        this.nullableListOfButtonAdapter = adapter2;
        JsonAdapter<List<BodyComponent>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, BodyComponent.class), SetsKt.emptySet(), "bodyComponents");
        Intrinsics.checkNotNullExpressionValue(adapter3, "moshi.adapter(Types.newP…ySet(), \"bodyComponents\")");
        this.nullableListOfBodyComponentAdapter = adapter3;
        JsonAdapter<String> adapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "consentVersion");
        Intrinsics.checkNotNullExpressionValue(adapter4, "moshi.adapter(String::cl…ySet(), \"consentVersion\")");
        this.nullableStringAdapter = adapter4;
        JsonAdapter<Integer> adapter5 = moshi.adapter(Integer.class, SetsKt.emptySet(), "completedModuleCount");
        Intrinsics.checkNotNullExpressionValue(adapter5, "moshi.adapter(Int::class…, \"completedModuleCount\")");
        this.nullableIntAdapter = adapter5;
        JsonAdapter<List<String>> adapter6 = moshi.adapter(Types.newParameterizedType(List.class, String.class), SetsKt.emptySet(), "documentTypes");
        Intrinsics.checkNotNullExpressionValue(adapter6, "moshi.adapter(Types.newP…),\n      \"documentTypes\")");
        this.nullableListOfStringAdapter = adapter6;
        JsonAdapter<Boolean> adapter7 = moshi.adapter(Boolean.class, SetsKt.emptySet(), "transitionScreenEnabled");
        Intrinsics.checkNotNullExpressionValue(adapter7, "moshi.adapter(Boolean::c…transitionScreenEnabled\")");
        this.nullableBooleanAdapter = adapter7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(ModuleConfig)");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public ModuleConfig fromJson(JsonReader reader) {
        int i;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i2 = -1;
        Labels labels = null;
        List<Button> list = null;
        List<BodyComponent> list2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        Integer num2 = null;
        List<String> list3 = null;
        List<String> list4 = null;
        List<String> list5 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    continue;
                case 0:
                    labels = this.nullableLabelsAdapter.fromJson(reader);
                    i2 &= -2;
                    continue;
                case 1:
                    list = this.nullableListOfButtonAdapter.fromJson(reader);
                    i2 &= -3;
                    continue;
                case 2:
                    list2 = this.nullableListOfBodyComponentAdapter.fromJson(reader);
                    i2 &= -5;
                    continue;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -9;
                    continue;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -17;
                    continue;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -33;
                    continue;
                case 6:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i2 &= -65;
                    continue;
                case 7:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i2 &= -129;
                    continue;
                case 8:
                    list3 = this.nullableListOfStringAdapter.fromJson(reader);
                    i2 &= -257;
                    continue;
                case 9:
                    list4 = this.nullableListOfStringAdapter.fromJson(reader);
                    i2 &= -513;
                    continue;
                case 10:
                    list5 = this.nullableListOfStringAdapter.fromJson(reader);
                    i2 &= -1025;
                    continue;
                case 11:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -2049;
                    continue;
                case 12:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -4097;
                    continue;
                case 13:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    i2 &= -8193;
                    continue;
                case 14:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    i2 &= -16385;
                    continue;
                case 15:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    i = -32769;
                    break;
                case 16:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i = -65537;
                    break;
            }
            i2 &= i;
        }
        reader.endObject();
        if (i2 == -131072) {
            List<String> list6 = list3;
            Integer num5 = num2;
            Integer num6 = num;
            String str7 = str3;
            String str8 = str2;
            String str9 = str;
            return new ModuleConfig(labels, list, list2, str9, str8, str7, num6, num5, list6, list4, list5, str4, str5, str6, num3, num4, bool);
        }
        List<String> list7 = list3;
        Integer num7 = num2;
        Integer num8 = num;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        List<BodyComponent> list8 = list2;
        List<Button> list9 = list;
        Labels labels2 = labels;
        Constructor<ModuleConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ModuleConfig.class.getDeclaredConstructor(Labels.class, List.class, List.class, String.class, String.class, String.class, Integer.class, Integer.class, List.class, List.class, List.class, String.class, String.class, String.class, Integer.class, Integer.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "ModuleConfig::class.java…his.constructorRef = it }");
        }
        ModuleConfig newInstance = constructor.newInstance(labels2, list9, list8, str12, str11, str10, num8, num7, list7, list4, list5, str4, str5, str6, num3, num4, bool, Integer.valueOf(i2), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, ModuleConfig value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("labels");
        this.nullableLabelsAdapter.toJson(writer, (JsonWriter) value_.getLabels());
        writer.name("buttons");
        this.nullableListOfButtonAdapter.toJson(writer, (JsonWriter) value_.getButtons());
        writer.name("bodyComponents");
        this.nullableListOfBodyComponentAdapter.toJson(writer, (JsonWriter) value_.getBodyComponents());
        writer.name("consentVersion");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getConsentVersion());
        writer.name("consentLanguage");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getConsentLanguage());
        writer.name("errorMessage");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getErrorMessage());
        writer.name("completedModuleCount");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getCompletedModuleCount());
        writer.name("totalModuleCount");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getTotalModuleCount());
        writer.name("documentTypes");
        this.nullableListOfStringAdapter.toJson(writer, (JsonWriter) value_.getDocumentTypes());
        writer.name("collectionMethods");
        this.nullableListOfStringAdapter.toJson(writer, (JsonWriter) value_.getCollectionMethods());
        writer.name("uploadFileTypes");
        this.nullableListOfStringAdapter.toJson(writer, (JsonWriter) value_.getUploadFileTypes());
        writer.name("infoModalText");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getInfoModalText());
        writer.name("useCaseType");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getUseCaseType());
        writer.name(ApiConstant.DOCUMENT_TYPE);
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getDocumentType());
        writer.name("currentVerificationCount");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getCurrentVerificationCount());
        writer.name("totalVerificationCount");
        this.nullableIntAdapter.toJson(writer, (JsonWriter) value_.getTotalVerificationCount());
        writer.name("transitionScreenEnabled");
        this.nullableBooleanAdapter.toJson(writer, (JsonWriter) value_.getTransitionScreenEnabled());
        writer.endObject();
    }
}

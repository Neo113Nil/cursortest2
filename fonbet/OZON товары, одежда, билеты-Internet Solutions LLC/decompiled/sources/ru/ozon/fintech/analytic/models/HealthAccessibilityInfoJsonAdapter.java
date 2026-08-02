package ru.ozon.fintech.analytic.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthAccessibilityInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthAccessibilityInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "doubleAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "booleanAdapter", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthAccessibilityInfoJsonAdapter extends JsonAdapter<HealthAccessibilityInfo> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<Double> doubleAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HealthAccessibilityInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("font_multiplier", "font_mode", "ui_multiplier", "ui_size_mode", "interface_audition", "touch_assistance");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<Double> f7 = moshi.f(Double.TYPE, m11, "fontMultiplier");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.doubleAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "fontMode");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Boolean> f12 = moshi.f(Boolean.TYPE, m11, "interfaceAudition");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.booleanAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(HealthAccessibilityInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HealthAccessibilityInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Double d11 = null;
        Double d12 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        while (true) {
            Double d13 = d11;
            Double d14 = d12;
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str3 = str;
            if (!reader.hasNext()) {
                reader.endObject();
                if (d13 == null) {
                    throw c.j("fontMultiplier", "font_multiplier", reader);
                }
                double doubleValue = d13.doubleValue();
                if (str3 == null) {
                    throw c.j("fontMode", "font_mode", reader);
                }
                if (d14 == null) {
                    throw c.j("uiMultiplier", "ui_multiplier", reader);
                }
                double doubleValue2 = d14.doubleValue();
                if (str2 == null) {
                    throw c.j("uiSizeMode", "ui_size_mode", reader);
                }
                if (bool3 == null) {
                    throw c.j("interfaceAudition", "interface_audition", reader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (bool4 != null) {
                    return new HealthAccessibilityInfo(doubleValue, str3, doubleValue2, str2, booleanValue, bool4.booleanValue());
                }
                throw c.j("touchAssistance", "touch_assistance", reader);
            }
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    d11 = d13;
                    d12 = d14;
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                case 0:
                    d11 = this.doubleAdapter.fromJson(reader);
                    if (d11 == null) {
                        throw c.q("fontMultiplier", "font_multiplier", reader);
                    }
                    d12 = d14;
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("fontMode", "font_mode", reader);
                    }
                    d11 = d13;
                    d12 = d14;
                    bool = bool3;
                    bool2 = bool4;
                case 2:
                    d12 = this.doubleAdapter.fromJson(reader);
                    if (d12 == null) {
                        throw c.q("uiMultiplier", "ui_multiplier", reader);
                    }
                    d11 = d13;
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("uiSizeMode", "ui_size_mode", reader);
                    }
                    d11 = d13;
                    d12 = d14;
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
                case 4:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("interfaceAudition", "interface_audition", reader);
                    }
                    bool = fromJson;
                    d11 = d13;
                    d12 = d14;
                    bool2 = bool4;
                    str = str3;
                case 5:
                    Boolean fromJson2 = this.booleanAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        throw c.q("touchAssistance", "touch_assistance", reader);
                    }
                    bool2 = fromJson2;
                    d11 = d13;
                    d12 = d14;
                    bool = bool3;
                    str = str3;
                default:
                    d11 = d13;
                    d12 = d14;
                    bool = bool3;
                    bool2 = bool4;
                    str = str3;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthAccessibilityInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("font_multiplier");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value_.getFontMultiplier()));
        writer.w("font_mode");
        this.stringAdapter.mo44toJson(writer, (x) value_.getFontMode());
        writer.w("ui_multiplier");
        this.doubleAdapter.mo44toJson(writer, (x) Double.valueOf(value_.getUiMultiplier()));
        writer.w("ui_size_mode");
        this.stringAdapter.mo44toJson(writer, (x) value_.getUiSizeMode());
        writer.w("interface_audition");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getInterfaceAudition()));
        writer.w("touch_assistance");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.getTouchAssistance()));
        writer.p();
    }
}

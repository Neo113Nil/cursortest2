package ru.ozon.fintech.analytic.models;

import Y9.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/fintech/analytic/models/HealthRunInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/analytic/models/HealthRunInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/analytic/models/HealthRunInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/analytic/models/HealthRunInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/fintech/analytic/models/HealthPermissions;", "nullableHealthPermissionsAdapter", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthRunInfoJsonAdapter extends JsonAdapter<HealthRunInfo> {
    private volatile Constructor<HealthRunInfo> constructorRef;

    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<HealthPermissions> nullableHealthPermissionsAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public HealthRunInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("debug_labels", "front_shared_id", "run_id", "run_type", "permissions", "ultra");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, String.class);
        M m11 = M.f71699a;
        JsonAdapter<List<String>> f7 = moshi.f(e11, m11, "debugLabels");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfStringAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "frontSharedId");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<HealthPermissions> f12 = moshi.f(HealthPermissions.class, m11, "permissions");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableHealthPermissionsAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "ultra");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(35, "GeneratedJsonAdapter(HealthRunInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HealthRunInfo fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        List<String> list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        HealthPermissions healthPermissions = null;
        Boolean bool = null;
        while (true) {
            List<String> list2 = list;
            if (!reader.hasNext()) {
                String str4 = str;
                reader.endObject();
                if (i12 == -49) {
                    if (list2 == null) {
                        throw c.j("debugLabels", "debug_labels", reader);
                    }
                    if (str4 == null) {
                        throw c.j("frontSharedId", "front_shared_id", reader);
                    }
                    if (str2 == null) {
                        throw c.j("runId", "run_id", reader);
                    }
                    if (str3 == null) {
                        throw c.j("runType", "run_type", reader);
                    }
                    Boolean bool2 = bool;
                    return new HealthRunInfo(list2, str4, str2, str3, healthPermissions, bool2);
                }
                Constructor<HealthRunInfo> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = HealthRunInfo.class.getDeclaredConstructor(List.class, String.class, String.class, String.class, HealthPermissions.class, Boolean.class, Integer.TYPE, c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<HealthRunInfo> constructor2 = constructor;
                if (list2 == null) {
                    throw c.j("debugLabels", "debug_labels", reader);
                }
                if (str4 == null) {
                    throw c.j("frontSharedId", "front_shared_id", reader);
                }
                if (str2 == null) {
                    throw c.j("runId", "run_id", reader);
                }
                if (str3 == null) {
                    throw c.j("runType", "run_type", reader);
                }
                HealthRunInfo newInstance = constructor2.newInstance(list2, str4, str2, str3, healthPermissions, bool, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str5 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str5;
                    list = list2;
                case 0:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("debugLabels", "debug_labels", reader);
                    }
                    str = str5;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("frontSharedId", "front_shared_id", reader);
                    }
                    list = list2;
                case 2:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("runId", "run_id", reader);
                    }
                    str = str5;
                    list = list2;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("runType", "run_type", reader);
                    }
                    str = str5;
                    list = list2;
                case 4:
                    healthPermissions = this.nullableHealthPermissionsAdapter.fromJson(reader);
                    i12 &= -17;
                    str = str5;
                    list = list2;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i12 &= -33;
                    str = str5;
                    list = list2;
                default:
                    str = str5;
                    list = list2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HealthRunInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("debug_labels");
        this.listOfStringAdapter.mo44toJson(writer, (x) value_.getDebugLabels());
        writer.w("front_shared_id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getFrontSharedId());
        writer.w("run_id");
        this.stringAdapter.mo44toJson(writer, (x) value_.getRunId());
        writer.w("run_type");
        this.stringAdapter.mo44toJson(writer, (x) value_.getRunType());
        writer.w("permissions");
        this.nullableHealthPermissionsAdapter.mo44toJson(writer, (x) value_.getPermissions());
        writer.w("ultra");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getUltra());
        writer.p();
    }
}

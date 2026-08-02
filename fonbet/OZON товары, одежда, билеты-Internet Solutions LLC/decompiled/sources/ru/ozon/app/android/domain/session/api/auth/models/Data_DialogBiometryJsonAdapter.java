package ru.ozon.app.android.domain.session.api.auth.models;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.domain.session.api.auth.models.Data;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/domain/session/api/auth/models/Data_DialogBiometryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/domain/session/api/auth/models/Data$DialogBiometry;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/domain/session/api/auth/models/Data$DialogBiometry;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/domain/session/api/auth/models/Data$DialogBiometry;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/domain/session/api/auth/models/Data$Biometry$Permission;", "permissionAdapter", "stringAdapter", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Data_DialogBiometryJsonAdapter extends JsonAdapter<Data.DialogBiometry> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Data.Biometry.Permission> permissionAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public Data_DialogBiometryJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isNeedToSetBiometry", "permission", "analyticTag");
        M m11 = M.f71699a;
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isNeedToSetBiometry");
        this.permissionAdapter = moshi.f(Data.Biometry.Permission.class, m11, "permission");
        this.stringAdapter = moshi.f(String.class, m11, "analyticTag");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(Data.DialogBiometry)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public Data.DialogBiometry fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        Data.Biometry.Permission permission = null;
        String str = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw c.q("isNeedToSetBiometry", "isNeedToSetBiometry", reader);
                }
            } else if (v11 == 1) {
                permission = this.permissionAdapter.fromJson(reader);
                if (permission == null) {
                    throw c.q("permission", "permission", reader);
                }
            } else if (v11 == 2 && (str = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("analyticTag", "analyticTag", reader);
            }
        }
        reader.endObject();
        if (bool == null) {
            throw c.j("isNeedToSetBiometry", "isNeedToSetBiometry", reader);
        }
        boolean booleanValue = bool.booleanValue();
        if (permission == null) {
            throw c.j("permission", "permission", reader);
        }
        if (str != null) {
            return new Data.DialogBiometry(booleanValue, permission, str);
        }
        throw c.j("analyticTag", "analyticTag", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Data.DialogBiometry value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isNeedToSetBiometry");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isNeedToSetBiometry()));
        writer.w("permission");
        this.permissionAdapter.mo44toJson(writer, (x) value.getPermission());
        writer.w("analyticTag");
        this.stringAdapter.mo44toJson(writer, (x) value.getAnalyticTag());
        writer.p();
    }
}

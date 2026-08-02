package ru.ozon.inapp.push.sdk.internal.data.dto;

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
import ru.ozon.inapp.push.sdk.internal.data.dto.ActionProcessRequest;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest_ApplicationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$BuildType;", "buildTypeAdapter", "Lru/ozon/inapp/push/sdk/internal/data/dto/ActionProcessRequest$Application$ApplicationName;", "applicationNameAdapter", "in-app-push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionProcessRequest_ApplicationJsonAdapter extends JsonAdapter<ActionProcessRequest.Application> {

    @NotNull
    private final JsonAdapter<ActionProcessRequest.Application.ApplicationName> applicationNameAdapter;

    @NotNull
    private final JsonAdapter<ActionProcessRequest.Application.BuildType> buildTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ActionProcessRequest_ApplicationJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("platform", "build", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "platform");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<ActionProcessRequest.Application.BuildType> f11 = moshi.f(ActionProcessRequest.Application.BuildType.class, m11, "buildType");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.buildTypeAdapter = f11;
        JsonAdapter<ActionProcessRequest.Application.ApplicationName> f12 = moshi.f(ActionProcessRequest.Application.ApplicationName.class, m11, "applicationName");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.applicationNameAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(ActionProcessRequest.Application)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ActionProcessRequest.Application fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        ActionProcessRequest.Application.BuildType buildType = null;
        ActionProcessRequest.Application.ApplicationName applicationName = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("platform", "platform", reader);
                }
            } else if (v11 == 1) {
                buildType = this.buildTypeAdapter.fromJson(reader);
                if (buildType == null) {
                    throw c.q("buildType", "build", reader);
                }
            } else if (v11 == 2 && (applicationName = this.applicationNameAdapter.fromJson(reader)) == null) {
                throw c.q("applicationName", AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("platform", "platform", reader);
        }
        if (buildType == null) {
            throw c.j("buildType", "build", reader);
        }
        if (applicationName != null) {
            return new ActionProcessRequest.Application(str, buildType, applicationName);
        }
        throw c.j("applicationName", AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ActionProcessRequest.Application value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("platform");
        this.stringAdapter.mo44toJson(writer, (x) value_.getPlatform());
        writer.w("build");
        this.buildTypeAdapter.mo44toJson(writer, (x) value_.getBuildType());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.applicationNameAdapter.mo44toJson(writer, (x) value_.getApplicationName());
        writer.p();
    }
}

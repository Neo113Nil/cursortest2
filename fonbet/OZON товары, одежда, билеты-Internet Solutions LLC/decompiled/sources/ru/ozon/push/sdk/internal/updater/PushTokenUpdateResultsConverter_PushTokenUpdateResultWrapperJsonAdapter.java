package ru.ozon.push.sdk.internal.updater;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import jh0.b;
import jh0.c;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.internal.updater.PushTokenUpdateResultsConverter;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter_PushTokenUpdateResultWrapperJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Ljh0/b;", "pushTokenTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Ljh0/c;", "updateTriggerAdapter", "stringAdapter", "Lru/ozon/push/sdk/internal/updater/PushTokenUpdateResultsConverter$PushTokenUpdateResultWrapper$a;", "resultTypeAdapter", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushTokenUpdateResultsConverter_PushTokenUpdateResultWrapperJsonAdapter extends JsonAdapter<PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper> {

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<b> pushTokenTypeAdapter;

    @NotNull
    private final JsonAdapter<PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper.a> resultTypeAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<c> updateTriggerAdapter;

    public PushTokenUpdateResultsConverter_PushTokenUpdateResultWrapperJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("pushTokenType", "updateTrigger", "token", "resultType");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<b> f7 = moshi.f(b.class, m11, "pushTokenType");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.pushTokenTypeAdapter = f7;
        JsonAdapter<c> f11 = moshi.f(c.class, m11, "updateTrigger");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.updateTriggerAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "token");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper.a> f13 = moshi.f(PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper.a.class, m11, "resultType");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.resultTypeAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(82, "GeneratedJsonAdapter(PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        b bVar = null;
        c cVar = null;
        String str = null;
        PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper.a aVar = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bVar = this.pushTokenTypeAdapter.fromJson(reader);
                if (bVar == null) {
                    throw Y9.c.q("pushTokenType", "pushTokenType", reader);
                }
            } else if (v11 == 1) {
                cVar = this.updateTriggerAdapter.fromJson(reader);
                if (cVar == null) {
                    throw Y9.c.q("updateTrigger", "updateTrigger", reader);
                }
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Y9.c.q("token", "token", reader);
                }
            } else if (v11 == 3 && (aVar = this.resultTypeAdapter.fromJson(reader)) == null) {
                throw Y9.c.q("resultType", "resultType", reader);
            }
        }
        reader.endObject();
        if (bVar == null) {
            throw Y9.c.j("pushTokenType", "pushTokenType", reader);
        }
        if (cVar == null) {
            throw Y9.c.j("updateTrigger", "updateTrigger", reader);
        }
        if (str == null) {
            throw Y9.c.j("token", "token", reader);
        }
        if (aVar != null) {
            return new PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper(bVar, cVar, str, aVar);
        }
        throw Y9.c.j("resultType", "resultType", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PushTokenUpdateResultsConverter.PushTokenUpdateResultWrapper value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("pushTokenType");
        this.pushTokenTypeAdapter.mo44toJson(writer, (x) value_.getPushTokenType());
        writer.w("updateTrigger");
        this.updateTriggerAdapter.mo44toJson(writer, (x) value_.getUpdateTrigger());
        writer.w("token");
        this.stringAdapter.mo44toJson(writer, (x) value_.getToken());
        writer.w("resultType");
        this.resultTypeAdapter.mo44toJson(writer, (x) value_.getResultType());
        writer.p();
    }
}

package ru.ozon.fintech.notifications.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.models.NotificationOtpBody;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R&\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationOtpBody_EncryptedJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Template;", "nullableTemplateAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Copy;", "nullableCopyAdapter", "stringAdapter", "", "mapOfStringStringAdapter", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOtpBody_EncryptedJsonAdapter extends JsonAdapter<NotificationOtpBody.Encrypted> {

    @NotNull
    private final JsonAdapter<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final JsonAdapter<NotificationOtpBody.Encrypted.Copy> nullableCopyAdapter;

    @NotNull
    private final JsonAdapter<NotificationOtpBody.Encrypted.Template> nullableTemplateAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public NotificationOtpBody_EncryptedJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("template", "copy", "nonce", "messages");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<NotificationOtpBody.Encrypted.Template> f7 = moshi.f(NotificationOtpBody.Encrypted.Template.class, m11, "template");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableTemplateAdapter = f7;
        JsonAdapter<NotificationOtpBody.Encrypted.Copy> f11 = moshi.f(NotificationOtpBody.Encrypted.Copy.class, m11, "copyAction");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableCopyAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "nonce");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<Map<String, String>> f13 = moshi.f(D.e(Map.class, String.class, String.class), m11, "messages");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.mapOfStringStringAdapter = f13;
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(NotificationOtpBody.Encrypted)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationOtpBody.Encrypted fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        NotificationOtpBody.Encrypted.Template template = null;
        NotificationOtpBody.Encrypted.Copy copy = null;
        String str = null;
        Map<String, String> map = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                template = this.nullableTemplateAdapter.fromJson(reader);
            } else if (v11 == 1) {
                copy = this.nullableCopyAdapter.fromJson(reader);
            } else if (v11 == 2) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("nonce", "nonce", reader);
                }
            } else if (v11 == 3 && (map = this.mapOfStringStringAdapter.fromJson(reader)) == null) {
                throw c.q("messages", "messages", reader);
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("nonce", "nonce", reader);
        }
        if (map != null) {
            return new NotificationOtpBody.Encrypted(template, copy, str, map);
        }
        throw c.j("messages", "messages", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationOtpBody.Encrypted value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("template");
        this.nullableTemplateAdapter.mo44toJson(writer, (x) value_.getTemplate());
        writer.w("copy");
        this.nullableCopyAdapter.mo44toJson(writer, (x) value_.getCopyAction());
        writer.w("nonce");
        this.stringAdapter.mo44toJson(writer, (x) value_.getNonce());
        writer.w("messages");
        this.mapOfStringStringAdapter.mo44toJson(writer, (x) value_.getMessages());
        writer.p();
    }
}

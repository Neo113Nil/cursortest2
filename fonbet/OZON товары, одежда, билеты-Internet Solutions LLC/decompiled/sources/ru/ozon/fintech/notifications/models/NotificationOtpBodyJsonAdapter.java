package ru.ozon.fintech.notifications.models;

import Ak.b;
import Y9.c;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.notifications.models.NotificationOtpBody;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationOtpBodyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/notifications/models/NotificationOtpBody;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/fintech/notifications/models/NotificationOtpBody;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/fintech/notifications/models/NotificationOtpBody;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;", "encryptedAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOtpBodyJsonAdapter extends JsonAdapter<NotificationOtpBody> {
    private volatile Constructor<NotificationOtpBody> constructorRef;

    @NotNull
    private final JsonAdapter<NotificationOtpBody.Encrypted> encryptedAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public NotificationOtpBodyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("push_id", "push_type", "encrypted", "parent_id");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "id");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<NotificationOtpBody.Encrypted> f11 = moshi.f(NotificationOtpBody.Encrypted.class, m11, "encrypted");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.encryptedAdapter = f11;
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(NotificationOtpBody)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationOtpBody fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        NotificationOtpBody.Encrypted encrypted = null;
        String str3 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 2) {
                encrypted = this.encryptedAdapter.fromJson(reader);
                if (encrypted == null) {
                    throw c.q("encrypted", "encrypted", reader);
                }
            } else if (v11 == 3) {
                str3 = this.nullableStringAdapter.fromJson(reader);
                i11 = -9;
            }
        }
        reader.endObject();
        if (i11 == -9) {
            if (encrypted != null) {
                return new NotificationOtpBody(str, str2, encrypted, str3);
            }
            throw c.j("encrypted", "encrypted", reader);
        }
        Constructor<NotificationOtpBody> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NotificationOtpBody.class.getDeclaredConstructor(String.class, String.class, NotificationOtpBody.Encrypted.class, String.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (encrypted == null) {
            throw c.j("encrypted", "encrypted", reader);
        }
        NotificationOtpBody newInstance = constructor.newInstance(str, str2, encrypted, str3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationOtpBody value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("push_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getId());
        writer.w("push_type");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getType());
        writer.w("encrypted");
        this.encryptedAdapter.mo44toJson(writer, (x) value_.getEncrypted());
        writer.w("parent_id");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getParentId());
        writer.p();
    }
}

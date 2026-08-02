package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/NotificationResponseDTO;", "nullableNotificationResponseDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bChangeEmailResponseDTOJsonAdapter extends JsonAdapter<B2bChangeEmailResponseDTO> {
    public static final int $stable = 8;
    private volatile Constructor<B2bChangeEmailResponseDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<NotificationResponseDTO> nullableNotificationResponseDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public B2bChangeEmailResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("isSuccess", "error", "isOtpExpired", DynamicElementDTO.TIMER, "notification");
        M m11 = M.f71699a;
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isSuccess");
        this.nullableStringAdapter = moshi.f(String.class, m11, "error");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, DynamicElementDTO.TIMER);
        this.nullableNotificationResponseDTOAdapter = moshi.f(NotificationResponseDTO.class, m11, "notification");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(B2bChangeEmailResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public B2bChangeEmailResponseDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        Integer num = null;
        NotificationResponseDTO notificationResponseDTO = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 1) {
                str = this.nullableStringAdapter.fromJson(reader);
                i11 &= -3;
            } else if (v11 == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(reader);
                i11 &= -5;
            } else if (v11 == 3) {
                num = this.nullableIntAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                notificationResponseDTO = this.nullableNotificationResponseDTOAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -31) {
            NotificationResponseDTO notificationResponseDTO2 = notificationResponseDTO;
            Integer num2 = num;
            return new B2bChangeEmailResponseDTO(bool, str, bool2, num2, notificationResponseDTO2);
        }
        NotificationResponseDTO notificationResponseDTO3 = notificationResponseDTO;
        Integer num3 = num;
        Boolean bool3 = bool2;
        String str2 = str;
        Boolean bool4 = bool;
        Constructor<B2bChangeEmailResponseDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = B2bChangeEmailResponseDTO.class.getDeclaredConstructor(Boolean.class, String.class, Boolean.class, Integer.class, NotificationResponseDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        B2bChangeEmailResponseDTO newInstance = constructor.newInstance(bool4, str2, bool3, num3, notificationResponseDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, B2bChangeEmailResponseDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("isSuccess");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isSuccess());
        writer.w("error");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getError());
        writer.w("isOtpExpired");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isOtpExpired());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("notification");
        this.nullableNotificationResponseDTOAdapter.mo44toJson(writer, (x) value.getNotification());
        writer.p();
    }
}

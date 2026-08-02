package ru.ozon.fintech.base.adapters;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.Enum;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/fintech/base/adapters/EnumCaseInSensitiveAdapter;", "", "T", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/Class;", "enumType", "fallback", "<init>", "(Ljava/lang/Class;Ljava/lang/Enum;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Enum;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Enum;)V", "Ljava/lang/Class;", "Ljava/lang/Enum;", "fintech-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnumCaseInSensitiveAdapter<T extends Enum<T>> extends JsonAdapter<T> {

    @NotNull
    private final Class<T> enumType;
    private final T fallback;

    public EnumCaseInSensitiveAdapter(@NotNull Class<T> enumType, T t2) {
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        this.enumType = enumType;
        this.fallback = t2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @h
    public T fromJson(@NotNull n reader) {
        T t2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        try {
            if (reader.p() == n.b.NULL) {
                reader.m();
                return this.fallback;
            }
            String nextString = reader.nextString();
            T[] enumConstants = this.enumType.getEnumConstants();
            if (enumConstants != null) {
                int length = enumConstants.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        t2 = null;
                        break;
                    }
                    t2 = enumConstants[i11];
                    String name = t2.name();
                    Intrinsics.f(nextString);
                    String upperCase = nextString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (Intrinsics.d(name, upperCase)) {
                        break;
                    }
                    i11++;
                }
                if (t2 != null) {
                    return t2;
                }
            }
            return this.fallback;
        } catch (Exception unused) {
            return this.fallback;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    @C
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, T value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.v(String.valueOf(value));
    }
}

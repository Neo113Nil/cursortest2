package com.squareup.moshi.adapters;

import Cm.e;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.Field;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001&B)\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/squareup/moshi/adapters/EnumJsonAdapter;", "", "T", "Lcom/squareup/moshi/JsonAdapter;", "Ljava/lang/Class;", "enumType", "fallbackValue", "", "useFallbackValue", "<init>", "(Ljava/lang/Class;Ljava/lang/Enum;Z)V", "withUnknownFallback", "(Ljava/lang/Enum;)Lcom/squareup/moshi/adapters/EnumJsonAdapter;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Ljava/lang/Enum;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Ljava/lang/Enum;)V", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/Enum;", "Z", "", "constants", "[Ljava/lang/Enum;", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nameStrings", "[Ljava/lang/String;", "Companion", "a", "moshi-adapters"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EnumJsonAdapter<T extends Enum<T>> extends JsonAdapter<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final T[] constants;

    @NotNull
    private final Class<T> enumType;
    private final T fallbackValue;

    @NotNull
    private final String[] nameStrings;

    @NotNull
    private final n.a options;
    private final boolean useFallbackValue;

    /* renamed from: com.squareup.moshi.adapters.EnumJsonAdapter$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public EnumJsonAdapter(@NotNull Class<T> enumType, T t2, boolean z11) {
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        this.enumType = enumType;
        this.fallbackValue = t2;
        this.useFallbackValue = z11;
        try {
            T[] enumConstants = enumType.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "enumType.enumConstants");
            T[] tArr = enumConstants;
            this.constants = tArr;
            int length = tArr.length;
            String[] strArr = new String[length];
            for (int i11 = 0; i11 < length; i11++) {
                String declaredName = this.constants[i11].name();
                Field field = this.enumType.getField(declaredName);
                Intrinsics.checkNotNullExpressionValue(field, "enumType.getField(constantName)");
                M m11 = c.f34861a;
                Intrinsics.checkNotNullParameter(field, "<this>");
                Intrinsics.checkNotNullParameter(declaredName, "declaredName");
                i iVar = (i) field.getAnnotation(i.class);
                Intrinsics.checkNotNullParameter(declaredName, "declaredName");
                if (iVar != null) {
                    String name = iVar.name();
                    if (!"\u0000".equals(name)) {
                        declaredName = name;
                    }
                }
                strArr[i11] = declaredName;
            }
            this.nameStrings = strArr;
            this.options = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, length));
        } catch (NoSuchFieldException e11) {
            throw new AssertionError("Missing field in ".concat(this.enumType.getName()), e11);
        }
    }

    @NotNull
    public static final <T extends Enum<T>> EnumJsonAdapter<T> create(@NotNull Class<T> enumType) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(enumType, "enumType");
        return new EnumJsonAdapter<>(enumType, null, false);
    }

    @NotNull
    public String toString() {
        return "EnumJsonAdapter(" + this.enumType.getName() + ')';
    }

    @NotNull
    public final EnumJsonAdapter<T> withUnknownFallback(T fallbackValue) {
        return new EnumJsonAdapter<>(this.enumType, fallbackValue, true);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(@NotNull n reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        int w11 = reader.w(this.options);
        if (w11 != -1) {
            return this.constants[w11];
        }
        String d11 = reader.d();
        if (!this.useFallbackValue) {
            String nextString = reader.nextString();
            StringBuilder sb2 = new StringBuilder("Expected one of ");
            e.i(" but was ", nextString, " at path ", sb2, C7705l.f0(this.nameStrings));
            sb2.append(d11);
            throw new k(sb2.toString());
        }
        if (reader.p() == n.b.STRING) {
            reader.skipValue();
            return this.fallbackValue;
        }
        throw new k("Expected a string but was " + reader.p() + " at path " + d11);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, T value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.R(this.nameStrings[value.ordinal()]);
    }
}

package io.github.lukmccall.pika;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NotImplementedError;

/* compiled from: TypeInfo.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\b\u0010\u0003\u001a\u00020\u0001H\u0001\u001a\f\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0002¨\u0006\u0006"}, d2 = {"typeInfo", "Lio/github/lukmccall/pika/TypeInfo;", ExifInterface.GPS_DIRECTION_TRUE, "throwNonReifiedTypeError", "fullTypeInfo", "Lio/github/lukmccall/pika/FullTypeInfo;", "pika-api"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypeInfoKt {
    public static final <T> TypeInfo typeInfo() {
        throw new NotImplementedError("typeInfo<T>() should be replaced by the compiler plugin");
    }

    public static final TypeInfo throwNonReifiedTypeError() {
        throw new IllegalStateException("typeInfo<T>() requires a reified type parameter. Use 'inline fun <reified T>' or call typeInfo<T>() with a concrete type.");
    }

    public static final <T> FullTypeInfo fullTypeInfo() {
        throw new NotImplementedError("fullTypeInfo<T>() should be replaced by the compiler plugin");
    }
}

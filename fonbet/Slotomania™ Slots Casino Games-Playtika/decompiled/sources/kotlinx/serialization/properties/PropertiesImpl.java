package kotlinx.serialization.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: Properties.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/properties/PropertiesImpl;", "Lkotlinx/serialization/properties/Properties;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "<init>", "(Lkotlinx/serialization/modules/SerializersModule;)V", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final class PropertiesImpl extends Properties {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertiesImpl(SerializersModule serializersModule) {
        super(serializersModule, null, null);
        Intrinsics.checkNotNullParameter(serializersModule, "serializersModule");
    }
}

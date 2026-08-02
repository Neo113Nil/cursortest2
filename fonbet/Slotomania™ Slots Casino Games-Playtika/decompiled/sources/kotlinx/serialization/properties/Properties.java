package kotlinx.serialization.properties;

import androidx.webkit.Profile;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerialFormat;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.NamedValueDecoder;
import kotlinx.serialization.internal.NamedValueEncoder;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: Properties.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0007\u001a\u001b\u001c\u001d\u001e\u001f B\u001b\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0006\u0010\u0011\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0012J5\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0006\u0010\u0011\u001a\u0002H\u000eH\u0007¢\u0006\u0002\u0010\u0012J5\u0010\u0014\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0002\u0010\u0018J5\u0010\u0019\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002!\"¨\u0006#"}, d2 = {"Lkotlinx/serialization/properties/Properties;", "Lkotlinx/serialization/SerialFormat;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "ctorMarker", "", "<init>", "(Lkotlinx/serialization/modules/SerializersModule;Ljava/lang/Void;)V", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeToMap", "", "", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/util/Map;", "encodeToStringMap", "decodeFromMap", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "map", "(Lkotlinx/serialization/DeserializationStrategy;Ljava/util/Map;)Ljava/lang/Object;", "decodeFromStringMap", "OutMapper", "OutAnyMapper", "OutStringMapper", "InMapper", "InAnyMapper", "InStringMapper", Profile.DEFAULT_PROFILE_NAME, "Lkotlinx/serialization/properties/Properties$Default;", "Lkotlinx/serialization/properties/PropertiesImpl;", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes5.dex */
public abstract class Properties implements SerialFormat {
    private final SerializersModule serializersModule;

    public /* synthetic */ Properties(SerializersModule serializersModule, Void r2, DefaultConstructorMarker defaultConstructorMarker) {
        this(serializersModule, r2);
    }

    private Properties(SerializersModule serializersModule, Void r2) {
        this.serializersModule = serializersModule;
    }

    @Override // kotlinx.serialization.SerialFormat
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    /* compiled from: Properties.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0002H$¢\u0006\u0002\u0010\u0011J'\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0001\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u0006\u0010\u0010\u001a\u0002H\u0014¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\fH\u0014J \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lkotlinx/serialization/properties/Properties$OutMapper;", "Value", "", "Lkotlinx/serialization/internal/NamedValueEncoder;", "<init>", "(Lkotlinx/serialization/properties/Properties;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "map", "", "", "getMap", "()Ljava/util/Map;", "encode", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "encodeSerializableValue", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "encodeTaggedValue", "tag", "encodeTaggedNull", "encodeTaggedEnum", "enumDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", MediationMetaData.KEY_ORDINAL, "", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private abstract class OutMapper<Value> extends NamedValueEncoder {
        private final Map<String, Value> map = new LinkedHashMap();
        private final SerializersModule serializersModule;

        protected abstract Value encode(Object value);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedEncoder
        public void encodeTaggedNull(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
        }

        public OutMapper() {
            this.serializersModule = Properties.this.getSerializersModule();
        }

        @Override // kotlinx.serialization.internal.TaggedEncoder, kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
        public SerializersModule getSerializersModule() {
            return this.serializersModule;
        }

        public final Map<String, Value> getMap() {
            return this.map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.serialization.encoding.Encoder
        public final <T> void encodeSerializableValue(SerializationStrategy<? super T> serializer, T value) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer instanceof AbstractPolymorphicSerializer) {
                OutMapper<Value> outMapper = this;
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                SerializationStrategy findPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) serializer, outMapper, value);
                encodeTaggedString(nested("type"), findPolymorphicSerializer.getDescriptor().getSerialName());
                findPolymorphicSerializer.serialize(outMapper, value);
                return;
            }
            serializer.serialize(this, value);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedEncoder
        public void encodeTaggedValue(String tag, Object value) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(value, "value");
            this.map.put(tag, encode(value));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedEncoder
        public void encodeTaggedEnum(String tag, SerialDescriptor enumDescriptor, int ordinal) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
            this.map.put(tag, encode(enumDescriptor.getElementName(ordinal)));
        }
    }

    /* compiled from: Properties.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lkotlinx/serialization/properties/Properties$OutAnyMapper;", "Lkotlinx/serialization/properties/Properties$OutMapper;", "", "Lkotlinx/serialization/properties/Properties;", "<init>", "(Lkotlinx/serialization/properties/Properties;)V", "encode", "value", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class OutAnyMapper extends OutMapper<Object> {
        @Override // kotlinx.serialization.properties.Properties.OutMapper
        protected Object encode(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        public OutAnyMapper() {
            super();
        }
    }

    /* compiled from: Properties.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lkotlinx/serialization/properties/Properties$OutStringMapper;", "Lkotlinx/serialization/properties/Properties$OutMapper;", "", "Lkotlinx/serialization/properties/Properties;", "<init>", "(Lkotlinx/serialization/properties/Properties;)V", "encode", "value", "", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class OutStringMapper extends OutMapper<String> {
        public OutStringMapper() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.properties.Properties.OutMapper
        public String encode(Object value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value.toString();
        }
    }

    /* compiled from: Properties.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b¢\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0016\u001a\f\u0012\u0004\u0012\u00028\u00000\u0000R\u00020\u00172\u0006\u0010\u0007\u001a\u00020\bH$J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\u001a\u001a\u0002H\u001b\"\u0004\b\u0001\u0010\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001d¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u0006H\u0004¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00062\u0006\u0010#\u001a\u00020\bH\u0004J\u000e\u0010$\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/serialization/properties/Properties$InMapper;", "Value", "", "Lkotlinx/serialization/internal/NamedValueDecoder;", "map", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/properties/Properties;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "getMap", "()Ljava/util/Map;", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "currentIndex", "", "isCollection", "", "size", "structure", "Lkotlinx/serialization/properties/Properties;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeSerializableValue", "T", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeTaggedValue", "tag", "(Ljava/lang/String;)Ljava/lang/Object;", "decodeTaggedEnum", "enumDescriptor", "decodeElementIndex", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private abstract class InMapper<Value> extends NamedValueDecoder {
        private int currentIndex;
        private final boolean isCollection;
        private final Map<String, Value> map;
        private final SerializersModule serializersModule;
        private final int size;
        final /* synthetic */ Properties this$0;

        /* renamed from: structure */
        protected abstract InMapper<Value> structure2(SerialDescriptor descriptor);

        /* JADX WARN: Multi-variable type inference failed */
        public InMapper(Properties properties, Map<String, ? extends Value> map, SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.this$0 = properties;
            this.map = map;
            this.serializersModule = properties.getSerializersModule();
            boolean z = Intrinsics.areEqual(descriptor.getKind(), StructureKind.LIST.INSTANCE) || Intrinsics.areEqual(descriptor.getKind(), StructureKind.MAP.INSTANCE);
            this.isCollection = z;
            this.size = z ? Integer.MAX_VALUE : descriptor.getElementsCount();
        }

        protected final Map<String, Value> getMap() {
            return this.map;
        }

        @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
        public SerializersModule getSerializersModule() {
            return this.serializersModule;
        }

        @Override // kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
        public final CompositeDecoder beginStructure(SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            InMapper<Value> structure2 = structure2(descriptor);
            copyTagsTo(structure2);
            return structure2;
        }

        @Override // kotlinx.serialization.encoding.Decoder
        public final <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            if (deserializer instanceof AbstractPolymorphicSerializer) {
                Value value = this.map.get(nested("type"));
                return (T) PolymorphicSerializerKt.findPolymorphicSerializer((AbstractPolymorphicSerializer) deserializer, this, value != null ? value.toString() : null).deserialize(this);
            }
            return deserializer.deserialize(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public final Value decodeTaggedValue(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return (Value) MapsKt.getValue(this.map, tag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public final int decodeTaggedEnum(String tag, SerialDescriptor enumDescriptor) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
            Object value = MapsKt.getValue(this.map, tag);
            if (value instanceof Integer) {
                return ((Number) value).intValue();
            }
            if (!(value instanceof String)) {
                throw new SerializationException("Value of enum entry '" + tag + "' is neither an Int nor a String");
            }
            int elementIndex = enumDescriptor.getElementIndex((String) value);
            if (elementIndex != -3) {
                return elementIndex;
            }
            throw new SerializationException("Enum '" + enumDescriptor.getSerialName() + "' does not contain element with name '" + value + '\'');
        }

        @Override // kotlinx.serialization.encoding.CompositeDecoder
        public final int decodeElementIndex(SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            do {
                int i = this.currentIndex;
                if (i >= this.size) {
                    return -1;
                }
                this.currentIndex = i + 1;
                String tag = getTag(descriptor, i);
                Set<String> keySet = this.map.keySet();
                if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                    for (String str : keySet) {
                        if (StringsKt.startsWith$default(str, tag, false, 2, (Object) null) && (str.length() == tag.length() || str.charAt(tag.length()) == '.')) {
                            return this.currentIndex - 1;
                        }
                    }
                }
            } while (!this.isCollection);
            return -1;
        }
    }

    /* compiled from: Properties.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0000R\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\f"}, d2 = {"Lkotlinx/serialization/properties/Properties$InAnyMapper;", "Lkotlinx/serialization/properties/Properties$InMapper;", "", "Lkotlinx/serialization/properties/Properties;", "map", "", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/properties/Properties;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "structure", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class InAnyMapper extends InMapper<Object> {
        final /* synthetic */ Properties this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAnyMapper(Properties properties, Map<String, ? extends Object> map, SerialDescriptor descriptor) {
            super(properties, map, descriptor);
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.this$0 = properties;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.properties.Properties.InMapper
        /* renamed from: structure, reason: merged with bridge method [inline-methods] */
        public InMapper<Object> structure2(SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new InAnyMapper(this.this$0, getMap(), descriptor);
        }
    }

    /* compiled from: Properties.kt */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0000\b\u0082\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u00060\u0000R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u0002H\u0014¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/properties/Properties$InStringMapper;", "Lkotlinx/serialization/properties/Properties$InMapper;", "", "Lkotlinx/serialization/properties/Properties;", "map", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Lkotlinx/serialization/properties/Properties;Ljava/util/Map;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "structure", "decodeTaggedBoolean", "", "tag", "decodeTaggedByte", "", "decodeTaggedShort", "", "decodeTaggedInt", "", "decodeTaggedLong", "", "decodeTaggedFloat", "", "decodeTaggedDouble", "", "decodeTaggedChar", "", "kotlinx-serialization-properties"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class InStringMapper extends InMapper<String> {
        final /* synthetic */ Properties this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InStringMapper(Properties properties, Map<String, String> map, SerialDescriptor descriptor) {
            super(properties, map, descriptor);
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.this$0 = properties;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.properties.Properties.InMapper
        /* renamed from: structure, reason: avoid collision after fix types in other method */
        public InMapper<String> structure2(SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return new InStringMapper(this.this$0, getMap(), descriptor);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public boolean decodeTaggedBoolean(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Boolean.parseBoolean(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public byte decodeTaggedByte(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Byte.parseByte(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public short decodeTaggedShort(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Short.parseShort(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public int decodeTaggedInt(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Integer.parseInt(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public long decodeTaggedLong(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Long.parseLong(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public float decodeTaggedFloat(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Float.parseFloat(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public double decodeTaggedDouble(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return Double.parseDouble(decodeTaggedValue(tag));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlinx.serialization.internal.TaggedDecoder
        public char decodeTaggedChar(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return StringsKt.single(decodeTaggedValue(tag));
        }
    }

    @ExperimentalSerializationApi
    public final <T> Map<String, Object> encodeToMap(SerializationStrategy<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        OutAnyMapper outAnyMapper = new OutAnyMapper();
        outAnyMapper.encodeSerializableValue(serializer, value);
        return outAnyMapper.getMap();
    }

    @ExperimentalSerializationApi
    public final <T> Map<String, String> encodeToStringMap(SerializationStrategy<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        OutStringMapper outStringMapper = new OutStringMapper();
        outStringMapper.encodeSerializableValue(serializer, value);
        return outStringMapper.getMap();
    }

    @ExperimentalSerializationApi
    public final <T> T decodeFromMap(DeserializationStrategy<? extends T> deserializer, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(map, "map");
        return (T) new InAnyMapper(this, map, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }

    @ExperimentalSerializationApi
    public final <T> T decodeFromStringMap(DeserializationStrategy<? extends T> deserializer, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(map, "map");
        return (T) new InStringMapper(this, map, deserializer.getDescriptor()).decodeSerializableValue(deserializer);
    }
}

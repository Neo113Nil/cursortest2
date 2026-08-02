package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.C5951b;
import com.google.protobuf.C5961l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected O unknownFields = O.c();

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        protected MessageType instance;

        protected Builder(MessageType messagetype) {
            this.defaultInstance = messagetype;
            if (messagetype.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
        }

        private static <MessageType> void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            H.a().c(messagetype).mergeFrom(messagetype, messagetype2);
        }

        private MessageType newMutableInstance() {
            return (MessageType) this.defaultInstance.newMutableInstance();
        }

        protected final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            copyOnWriteInternal();
        }

        protected void copyOnWriteInternal() {
            MessageType newMutableInstance = newMutableInstance();
            mergeFromInstance(newMutableInstance, this.instance);
            this.instance = newMutableInstance;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.A
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.isMutable()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (this.defaultInstance.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = newMutableInstance();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((Builder<MessageType, BuilderType>) messagetype);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo19clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i11, int i12, C5957h c5957h) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                H.a().c(this.instance).mergeFrom(this.instance, bArr, i11, i11 + i12, new C5951b.C0915b(c5957h));
                return this;
            } catch (InvalidProtocolBufferException e11) {
                throw e11;
            } catch (IOException e12) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e12);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i11, int i12) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i11, i12, C5957h.b());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            copyOnWrite();
            try {
                H.a().c(this.instance).mergeFrom(this.instance, CodedInputStreamReader.forCodedInput(codedInputStream), c5957h);
                return this;
            } catch (RuntimeException e11) {
                if (e11.getCause() instanceof IOException) {
                    throw ((IOException) e11.getCause());
                }
                throw e11;
            }
        }
    }

    /* loaded from: classes9.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        private C5961l<ExtensionDescriptor> ensureExtensionsAreMutable() {
            C5961l<ExtensionDescriptor> c5961l = ((ExtendableMessage) this.instance).extensions;
            if (!c5961l.r()) {
                return c5961l;
            }
            C5961l<ExtensionDescriptor> clone = c5961l.clone();
            ((ExtendableMessage) this.instance).extensions = clone;
            return clone;
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final <Type> BuilderType addExtension(AbstractC5955f<MessageType, List<Type>> abstractC5955f, Type type) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().a(checkIsLite.descriptor, checkIsLite.singularToFieldSetType(type));
            return this;
        }

        public final BuilderType clearExtension(AbstractC5955f<MessageType, ?> abstractC5955f) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().b(checkIsLite.descriptor);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        protected void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((ExtendableMessage) this.instance).extensions != C5961l.h()) {
                MessageType messagetype = this.instance;
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(AbstractC5955f<MessageType, Type> abstractC5955f) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(abstractC5955f);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(AbstractC5955f<MessageType, List<Type>> abstractC5955f) {
            return ((ExtendableMessage) this.instance).getExtensionCount(abstractC5955f);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(AbstractC5955f<MessageType, Type> abstractC5955f) {
            return ((ExtendableMessage) this.instance).hasExtension(abstractC5955f);
        }

        void internalSetExtensionSet(C5961l<ExtensionDescriptor> c5961l) {
            copyOnWrite();
            ((ExtendableMessage) this.instance).extensions = c5961l;
        }

        public final <Type> BuilderType setExtension(AbstractC5955f<MessageType, Type> abstractC5955f, Type type) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().z(checkIsLite.descriptor, checkIsLite.toFieldSetType(type));
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(AbstractC5955f<MessageType, List<Type>> abstractC5955f, int i11) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(abstractC5955f, i11);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).isMutable()) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.v();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(AbstractC5955f<MessageType, List<Type>> abstractC5955f, int i11, Type type) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            copyOnWrite();
            ensureExtensionsAreMutable().A(checkIsLite.descriptor, i11, checkIsLite.singularToFieldSetType(type));
            return this;
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        <Type> Type getExtension(AbstractC5955f<MessageType, Type> abstractC5955f);

        <Type> Type getExtension(AbstractC5955f<MessageType, List<Type>> abstractC5955f, int i11);

        <Type> int getExtensionCount(AbstractC5955f<MessageType, List<Type>> abstractC5955f);

        <Type> boolean hasExtension(AbstractC5955f<MessageType, Type> abstractC5955f);

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    /* loaded from: classes9.dex */
    static final class ExtensionDescriptor implements C5961l.b<ExtensionDescriptor> {
        final Internal.b<?> enumTypeMap;
        final boolean isPacked;
        final boolean isRepeated;
        final int number;
        final WireFormat$FieldType type;

        ExtensionDescriptor(Internal.b<?> bVar, int i11, WireFormat$FieldType wireFormat$FieldType, boolean z11, boolean z12) {
            this.enumTypeMap = bVar;
            this.number = i11;
            this.type = wireFormat$FieldType;
            this.isRepeated = z11;
            this.isPacked = z12;
        }

        public Internal.b<?> getEnumType() {
            return this.enumTypeMap;
        }

        @Override // com.google.protobuf.C5961l.b
        public Q getLiteJavaType() {
            return this.type.getJavaType();
        }

        @Override // com.google.protobuf.C5961l.b
        public WireFormat$FieldType getLiteType() {
            return this.type;
        }

        @Override // com.google.protobuf.C5961l.b
        public int getNumber() {
            return this.number;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C5961l.b
        public void internalMergeFrom(Object obj, Object obj2) {
            ((Builder) obj).mergeFrom((Builder) obj2);
        }

        @Override // com.google.protobuf.C5961l.b
        public boolean internalMessageIsImmutable(Object obj) {
            return obj instanceof MessageLite;
        }

        @Override // com.google.protobuf.C5961l.b
        public boolean isPacked() {
            return this.isPacked;
        }

        @Override // com.google.protobuf.C5961l.b
        public boolean isRepeated() {
            return this.isRepeated;
        }

        @Override // java.lang.Comparable
        public int compareTo(ExtensionDescriptor extensionDescriptor) {
            return this.number - extensionDescriptor.number;
        }
    }

    /* loaded from: classes9.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends AbstractC5955f<ContainingType, Type> {
        final ContainingType containingTypeDefaultInstance;
        final Type defaultValue;
        final ExtensionDescriptor descriptor;
        final MessageLite messageDefaultInstance;

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, ExtensionDescriptor extensionDescriptor, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (extensionDescriptor.getLiteType() == WireFormat$FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.containingTypeDefaultInstance = containingtype;
            this.defaultValue = type;
            this.messageDefaultInstance = messageLite;
            this.descriptor = extensionDescriptor;
        }

        Object fromFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularFromFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != Q.ENUM) {
                return obj;
            }
            ProtobufArrayList protobufArrayList = new ProtobufArrayList();
            List list = (List) obj;
            protobufArrayList.ensureCapacity(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                protobufArrayList.add(singularFromFieldSetType(it.next()));
            }
            protobufArrayList.makeImmutable();
            return protobufArrayList;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.containingTypeDefaultInstance;
        }

        @Override // com.google.protobuf.AbstractC5955f
        public Type getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.google.protobuf.AbstractC5955f
        public WireFormat$FieldType getLiteType() {
            return this.descriptor.getLiteType();
        }

        @Override // com.google.protobuf.AbstractC5955f
        public MessageLite getMessageDefaultInstance() {
            return this.messageDefaultInstance;
        }

        @Override // com.google.protobuf.AbstractC5955f
        public int getNumber() {
            return this.descriptor.getNumber();
        }

        @Override // com.google.protobuf.AbstractC5955f
        public boolean isRepeated() {
            return this.descriptor.isRepeated;
        }

        Object singularFromFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == Q.ENUM ? this.descriptor.enumTypeMap.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        Object singularToFieldSetType(Object obj) {
            return this.descriptor.getLiteJavaType() == Q.ENUM ? Integer.valueOf(((Internal.a) obj).getNumber()) : obj;
        }

        Object toFieldSetType(Object obj) {
            if (!this.descriptor.isRepeated()) {
                return singularToFieldSetType(obj);
            }
            if (this.descriptor.getLiteJavaType() != Q.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(singularToFieldSetType(it.next()));
            }
            return arrayList;
        }
    }

    /* loaded from: classes9.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60119a;

        static {
            int[] iArr = new int[Q.values().length];
            f60119a = iArr;
            try {
                iArr[Q.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60119a[Q.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BUILD_MESSAGE_INFO;
        public static final b GET_DEFAULT_INSTANCE;
        public static final b GET_MEMOIZED_IS_INITIALIZED;
        public static final b GET_PARSER;
        public static final b NEW_BUILDER;
        public static final b NEW_MUTABLE_INSTANCE;
        public static final b SET_MEMOIZED_IS_INITIALIZED;

        static {
            b bVar = new b("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = bVar;
            b bVar2 = new b("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = bVar2;
            b bVar3 = new b("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = bVar3;
            b bVar4 = new b("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = bVar4;
            b bVar5 = new b("NEW_BUILDER", 4);
            NEW_BUILDER = bVar5;
            b bVar6 = new b("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = bVar6;
            b bVar7 = new b("GET_PARSER", 6);
            GET_PARSER = bVar7;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>, T> GeneratedExtension<MessageType, T> checkIsLite(AbstractC5955f<MessageType, T> abstractC5955f) {
        if (abstractC5955f.isLite()) {
            return (GeneratedExtension) abstractC5955f;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t2) throws InvalidProtocolBufferException {
        if (t2 == null || t2.isInitialized()) {
            return t2;
        }
        M newUninitializedMessageException = t2.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(newUninitializedMessageException.getMessage()).setUnfinishedMessage(t2);
    }

    private int computeSerializedSize(J<?> j11) {
        if (j11 != null) {
            return j11.getSerializedSize(this);
        }
        H a11 = H.a();
        a11.getClass();
        return a11.b(getClass()).getSerializedSize(this);
    }

    protected static Internal.BooleanList emptyBooleanList() {
        return BooleanArrayList.emptyList();
    }

    protected static Internal.DoubleList emptyDoubleList() {
        return DoubleArrayList.emptyList();
    }

    protected static Internal.FloatList emptyFloatList() {
        return FloatArrayList.emptyList();
    }

    protected static Internal.IntList emptyIntList() {
        return IntArrayList.emptyList();
    }

    protected static Internal.LongList emptyLongList() {
        return LongArrayList.emptyList();
    }

    protected static <E> Internal.e<E> emptyProtobufList() {
        return ProtobufArrayList.emptyList();
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == O.c()) {
            this.unknownFields = O.j();
        }
    }

    static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t2 = (T) defaultInstanceMap.get(cls);
        if (t2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t2 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e11) {
                throw new IllegalStateException("Class initialization cannot fail.", e11);
            }
        }
        if (t2 != null) {
            return t2;
        }
        T t11 = (T) ((GeneratedMessageLite) UnsafeUtil.k(cls)).getDefaultInstanceForType();
        if (t11 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t11);
        return t11;
    }

    static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e11);
        }
    }

    static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e11);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$IntList] */
    protected static Internal.IntList mutableCopy(Internal.IntList intList) {
        return intList.mutableCopyWithCapacity2(intList.size() * 2);
    }

    protected static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new RawMessageInfo(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.b<?> bVar, int i11, WireFormat$FieldType wireFormat$FieldType, boolean z11, Class cls) {
        return new GeneratedExtension<>(containingtype, ProtobufArrayList.emptyList(), messageLite, new ExtensionDescriptor(bVar, i11, wireFormat$FieldType, true, z11), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.b<?> bVar, int i11, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new ExtensionDescriptor(bVar, i11, wireFormat$FieldType, false, false), cls);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t2, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t2, inputStream, C5957h.b()));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t2, CodedInputStream.newInstance(byteBuffer), c5957h));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t2, InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            CodedInputStream newInstance = CodedInputStream.newInstance(new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            T t11 = (T) parsePartialFrom(t2, newInstance, c5957h);
            try {
                newInstance.checkLastTagWas(0);
                return t11;
            } catch (InvalidProtocolBufferException e11) {
                throw e11.setUnfinishedMessage(t11);
            }
        } catch (InvalidProtocolBufferException e12) {
            if (e12.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e12);
            }
            throw e12;
        } catch (IOException e13) {
            throw new InvalidProtocolBufferException(e13);
        }
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t2, CodedInputStream codedInputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        T t11 = (T) t2.newMutableInstance();
        try {
            J c11 = H.a().c(t11);
            c11.mergeFrom(t11, CodedInputStreamReader.forCodedInput(codedInputStream), c5957h);
            c11.makeImmutable(t11);
            return t11;
        } catch (InvalidProtocolBufferException e11) {
            e = e11;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t11);
        } catch (M e12) {
            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(t11);
        } catch (IOException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw new InvalidProtocolBufferException(e13).setUnfinishedMessage(t11);
        } catch (RuntimeException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw e14;
        }
    }

    protected static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t2) {
        t2.markImmutable();
        defaultInstanceMap.put(cls, t2);
    }

    Object buildMessageInfo() throws Exception {
        return dynamicMethod(b.BUILD_MESSAGE_INFO, null, null);
    }

    void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int computeHashCode() {
        H a11 = H.a();
        a11.getClass();
        return a11.b(getClass()).hashCode(this);
    }

    protected final <MessageType2 extends GeneratedMessageLite<MessageType2, BuilderType2>, BuilderType2 extends Builder<MessageType2, BuilderType2>> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(b.NEW_BUILDER, null, null);
    }

    protected abstract Object dynamicMethod(b bVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        H a11 = H.a();
        a11.getClass();
        return a11.b(getClass()).equals(this, (GeneratedMessageLite) obj);
    }

    int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.MessageLite
    public final E<MessageType> getParserForType() {
        return (E) dynamicMethod(b.GET_PARSER, null, null);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    int getSerializedSize(J j11) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(j11);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException(Ej.b.a(computeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(j11);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.AbstractMessageLite, com.google.protobuf.MessageLite, com.google.protobuf.A
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void makeImmutable() {
        H a11 = H.a();
        a11.getClass();
        a11.b(getClass()).makeImmutable(this);
        markImmutable();
    }

    void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    protected void mergeLengthDelimitedField(int i11, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        O o11 = this.unknownFields;
        o11.a();
        if (i11 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        o11.l((i11 << 3) | 2, byteString);
    }

    protected final void mergeUnknownFields(O o11) {
        this.unknownFields = O.i(this.unknownFields, o11);
    }

    protected void mergeVarintField(int i11, int i12) {
        ensureUnknownFieldsInitialized();
        O o11 = this.unknownFields;
        o11.a();
        if (i11 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        o11.l(i11 << 3, Long.valueOf(i12));
    }

    MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(b.NEW_MUTABLE_INSTANCE, null, null);
    }

    protected boolean parseUnknownField(int i11, CodedInputStream codedInputStream) throws IOException {
        if ((i11 & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.g(i11, codedInputStream);
    }

    void setMemoizedHashCode(int i11) {
        this.memoizedHashCode = i11;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    void setMemoizedSerializedSize(int i11) {
        if (i11 < 0) {
            throw new IllegalStateException(Ej.b.a(i11, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i11 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        return B.d(this, super.toString());
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        H a11 = H.a();
        a11.getClass();
        a11.b(getClass()).writeTo(this, CodedOutputStreamWriter.forCodedOutput(codedOutputStream));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t2, boolean z11) {
        byte byteValue = ((Byte) t2.dynamicMethod(b.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        H a11 = H.a();
        a11.getClass();
        boolean isInitialized = a11.b(t2.getClass()).isInitialized(t2);
        if (z11) {
            t2.dynamicMethod(b.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t2 : null, null);
        }
        return isInitialized;
    }

    protected final <MessageType2 extends GeneratedMessageLite<MessageType2, BuilderType2>, BuilderType2 extends Builder<MessageType2, BuilderType2>> BuilderType2 createBuilder(MessageType2 messagetype2) {
        return (BuilderType2) createBuilder().mergeFrom((Builder) messagetype2);
    }

    @Override // com.google.protobuf.AbstractMessageLite, com.google.protobuf.MessageLite
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(b.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(b.NEW_BUILDER, null, null);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((Builder) dynamicMethod(b.NEW_BUILDER, null, null)).mergeFrom((Builder) this);
    }

    /* loaded from: classes9.dex */
    protected static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {
        private final T defaultInstance;

        public DefaultInstanceBasedParser(T t2) {
            this.defaultInstance = t2;
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.E
        public T parsePartialFrom(CodedInputStream codedInputStream, C5957h c5957h) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.defaultInstance, codedInputStream, c5957h);
        }

        @Override // com.google.protobuf.AbstractParser
        /* renamed from: parsePartialFrom, reason: merged with bridge method [inline-methods] */
        public T mo42parsePartialFrom(byte[] bArr, int i11, int i12, C5957h c5957h) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.parsePartialFrom(this.defaultInstance, bArr, i11, i12, c5957h);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$LongList] */
    protected static Internal.LongList mutableCopy(Internal.LongList longList) {
        return longList.mutableCopyWithCapacity2(longList.size() * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t2, byteBuffer, C5957h.b());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t2, InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t2, inputStream, c5957h));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t2, byteString, C5957h.b()));
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected C5961l<ExtensionDescriptor> extensions = C5961l.h();

        /* loaded from: classes9.dex */
        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<ExtensionDescriptor, Object>> f60118a;

            a(ExtendableMessage extendableMessage) {
                Iterator<Map.Entry<ExtensionDescriptor, Object>> u11 = extendableMessage.extensions.u();
                this.f60118a = u11;
                if (u11.hasNext()) {
                    u11.next();
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, GeneratedExtension<?, ?> generatedExtension, C5957h c5957h, int i11) throws IOException {
            parseExtension(codedInputStream, c5957h, generatedExtension, (i11 << 3) | 2, i11);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, C5957h c5957h, GeneratedExtension<?, ?> generatedExtension) throws IOException {
            MessageLite messageLite = (MessageLite) this.extensions.i(generatedExtension.descriptor);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, c5957h);
            ensureExtensionsAreMutable().z(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(builder.build()));
        }

        private <MessageType2 extends MessageLite> void mergeMessageSetExtensionFromCodedStream(MessageType2 messagetype2, CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            int i11 = 0;
            ByteString byteString = null;
            GeneratedExtension generatedExtension = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
                if (readTag == 16) {
                    i11 = codedInputStream.readUInt32();
                    if (i11 != 0) {
                        generatedExtension = c5957h.a(i11, messagetype2);
                    }
                } else if (readTag == 26) {
                    if (i11 == 0 || generatedExtension == null) {
                        byteString = codedInputStream.readBytes();
                    } else {
                        eagerlyMergeMessageSetExtension(codedInputStream, generatedExtension, c5957h, i11);
                        byteString = null;
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(12);
            if (byteString == null || i11 == 0) {
                return;
            }
            if (generatedExtension != null) {
                mergeMessageSetExtensionFromBytes(byteString, c5957h, generatedExtension);
            } else {
                mergeLengthDelimitedField(i11, byteString);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean parseExtension(CodedInputStream codedInputStream, C5957h c5957h, GeneratedExtension<?, ?> generatedExtension, int i11, int i12) throws IOException {
            boolean z11;
            Object build;
            MessageLite messageLite;
            int i13 = i11 & 7;
            boolean z12 = false;
            if (generatedExtension != null) {
                if (i13 == C5961l.o(generatedExtension.descriptor.getLiteType(), false)) {
                    z11 = false;
                } else {
                    ExtensionDescriptor extensionDescriptor = generatedExtension.descriptor;
                    if (extensionDescriptor.isRepeated && extensionDescriptor.type.isPackable() && i13 == C5961l.o(generatedExtension.descriptor.getLiteType(), true)) {
                        z11 = true;
                    }
                }
                if (!z12) {
                    return parseUnknownField(i11, codedInputStream);
                }
                ensureExtensionsAreMutable();
                if (z11) {
                    int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                    if (generatedExtension.descriptor.getLiteType() == WireFormat$FieldType.ENUM) {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            Object findValueByNumber = generatedExtension.descriptor.getEnumType().findValueByNumber(codedInputStream.readEnum());
                            if (findValueByNumber == null) {
                                return true;
                            }
                            this.extensions.a(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(findValueByNumber));
                        }
                    } else {
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.extensions.a(generatedExtension.descriptor, C5961l.y(codedInputStream, generatedExtension.descriptor.getLiteType()));
                        }
                    }
                    codedInputStream.popLimit(pushLimit);
                    return true;
                }
                int i14 = a.f60119a[generatedExtension.descriptor.getLiteJavaType().ordinal()];
                if (i14 == 1) {
                    MessageLite.Builder builder = (generatedExtension.descriptor.isRepeated() || (messageLite = (MessageLite) this.extensions.i(generatedExtension.descriptor)) == null) ? null : messageLite.toBuilder();
                    if (builder == null) {
                        builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (generatedExtension.descriptor.getLiteType() == WireFormat$FieldType.GROUP) {
                        codedInputStream.readGroup(generatedExtension.getNumber(), builder, c5957h);
                    } else {
                        codedInputStream.readMessage(builder, c5957h);
                    }
                    build = builder.build();
                } else if (i14 != 2) {
                    build = C5961l.y(codedInputStream, generatedExtension.descriptor.getLiteType());
                } else {
                    int readEnum = codedInputStream.readEnum();
                    Object findValueByNumber2 = generatedExtension.descriptor.getEnumType().findValueByNumber(readEnum);
                    if (findValueByNumber2 == null) {
                        mergeVarintField(i12, readEnum);
                        return true;
                    }
                    build = findValueByNumber2;
                }
                if (generatedExtension.descriptor.isRepeated()) {
                    this.extensions.a(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(build));
                    return true;
                }
                this.extensions.z(generatedExtension.descriptor, generatedExtension.singularToFieldSetType(build));
                return true;
            }
            z11 = false;
            z12 = true;
            if (!z12) {
            }
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        C5961l<ExtensionDescriptor> ensureExtensionsAreMutable() {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        protected boolean extensionsAreInitialized() {
            return this.extensions.s();
        }

        protected int extensionsSerializedSize() {
            return this.extensions.n();
        }

        protected int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.j();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite] */
        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(AbstractC5955f<MessageType, Type> abstractC5955f) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            Object i11 = this.extensions.i(checkIsLite.descriptor);
            return i11 == null ? checkIsLite.defaultValue : (Type) checkIsLite.fromFieldSetType(i11);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(AbstractC5955f<MessageType, List<Type>> abstractC5955f) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.m(checkIsLite.descriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(AbstractC5955f<MessageType, Type> abstractC5955f) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            return this.extensions.p(checkIsLite.descriptor);
        }

        protected final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.r()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.w(messagetype.extensions);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.GeneratedMessageLite$Builder, com.google.protobuf.MessageLite$Builder] */
        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return newBuilderForType();
        }

        protected ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this);
        }

        protected ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this);
        }

        protected <MessageType2 extends MessageLite> boolean parseUnknownField(MessageType2 messagetype2, CodedInputStream codedInputStream, C5957h c5957h, int i11) throws IOException {
            int i12 = i11 >>> 3;
            return parseExtension(codedInputStream, c5957h, c5957h.a(i12, messagetype2), i11, i12);
        }

        protected <MessageType2 extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType2 messagetype2, CodedInputStream codedInputStream, C5957h c5957h, int i11) throws IOException {
            if (i11 != 11) {
                return (i11 & 7) == 2 ? parseUnknownField(messagetype2, codedInputStream, c5957h, i11) : codedInputStream.skipField(i11);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype2, codedInputStream, c5957h);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.GeneratedMessageLite$Builder, com.google.protobuf.MessageLite$Builder] */
        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(AbstractC5955f<MessageType, List<Type>> abstractC5955f, int i11) {
            GeneratedExtension<MessageType, ?> checkIsLite = GeneratedMessageLite.checkIsLite(abstractC5955f);
            verifyExtensionContainingType(checkIsLite);
            return (Type) checkIsLite.singularFromFieldSetType(this.extensions.l(checkIsLite.descriptor, i11));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$FloatList] */
    protected static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        return floatList.mutableCopyWithCapacity2(floatList.size() * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t2, byteString, c5957h));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$DoubleList] */
    protected static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        return doubleList.mutableCopyWithCapacity2(doubleList.size() * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t2, bArr, 0, bArr.length, C5957h.b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$BooleanList] */
    protected static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        return booleanList.mutableCopyWithCapacity2(booleanList.size() * 2);
    }

    protected static <E> Internal.e<E> mutableCopy(Internal.e<E> eVar) {
        return eVar.mutableCopyWithCapacity2(eVar.size() * 2);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t2, bArr, 0, bArr.length, c5957h));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t2, CodedInputStream.newInstance(inputStream), C5957h.b()));
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t2, byte[] bArr, int i11, int i12, C5957h c5957h) throws InvalidProtocolBufferException {
        if (i12 == 0) {
            return t2;
        }
        T t11 = (T) t2.newMutableInstance();
        try {
            J c11 = H.a().c(t11);
            c11.mergeFrom(t11, bArr, i11, i11 + i12, new C5951b.C0915b(c5957h));
            c11.makeImmutable(t11);
            return t11;
        } catch (InvalidProtocolBufferException e11) {
            InvalidProtocolBufferException invalidProtocolBufferException = e11;
            if (invalidProtocolBufferException.getThrownFromInputStream()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.setUnfinishedMessage(t11);
        } catch (M e12) {
            throw new InvalidProtocolBufferException(e12.getMessage()).setUnfinishedMessage(t11);
        } catch (IOException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw new InvalidProtocolBufferException(e13).setUnfinishedMessage(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t11);
        }
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, InputStream inputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t2, CodedInputStream.newInstance(inputStream), c5957h));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t2, codedInputStream, C5957h.b());
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t2, CodedInputStream codedInputStream, C5957h c5957h) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t2, codedInputStream, c5957h));
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t2, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t2, codedInputStream, C5957h.b());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t2, ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        T t11 = (T) parsePartialFrom(t2, newCodedInput, c5957h);
        try {
            newCodedInput.checkLastTagWas(0);
            return t11;
        } catch (InvalidProtocolBufferException e11) {
            throw e11.setUnfinishedMessage(t11);
        }
    }
}

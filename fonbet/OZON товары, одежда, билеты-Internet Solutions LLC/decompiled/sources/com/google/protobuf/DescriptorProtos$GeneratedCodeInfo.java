package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends GeneratedMessageLite<DescriptorProtos$GeneratedCodeInfo, Builder> implements DescriptorProtos$GeneratedCodeInfoOrBuilder {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static volatile E<DescriptorProtos$GeneratedCodeInfo> PARSER;
    private Internal.e<Annotation> annotation_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Annotation extends GeneratedMessageLite<Annotation, Builder> implements AnnotationOrBuilder {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static volatile E<Annotation> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SEMANTIC_FIELD_NUMBER = 5;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private int begin_;
        private int bitField0_;
        private int end_;
        private int semantic_;
        private int pathMemoizedSerializedSize = -1;
        private Internal.IntList path_ = GeneratedMessageLite.emptyIntList();
        private String sourceFile_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder addAllPath(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Annotation) this.instance).addAllPath(iterable);
                return this;
            }

            public Builder addPath(int i11) {
                copyOnWrite();
                ((Annotation) this.instance).addPath(i11);
                return this;
            }

            public Builder clearBegin() {
                copyOnWrite();
                ((Annotation) this.instance).clearBegin();
                return this;
            }

            public Builder clearEnd() {
                copyOnWrite();
                ((Annotation) this.instance).clearEnd();
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((Annotation) this.instance).clearPath();
                return this;
            }

            public Builder clearSemantic() {
                copyOnWrite();
                ((Annotation) this.instance).clearSemantic();
                return this;
            }

            public Builder clearSourceFile() {
                copyOnWrite();
                ((Annotation) this.instance).clearSourceFile();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getBegin() {
                return ((Annotation) this.instance).getBegin();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getEnd() {
                return ((Annotation) this.instance).getEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getPath(int i11) {
                return ((Annotation) this.instance).getPath(i11);
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public int getPathCount() {
                return ((Annotation) this.instance).getPathCount();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public List<Integer> getPathList() {
                return Collections.unmodifiableList(((Annotation) this.instance).getPathList());
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public Semantic getSemantic() {
                return ((Annotation) this.instance).getSemantic();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public String getSourceFile() {
                return ((Annotation) this.instance).getSourceFile();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public ByteString getSourceFileBytes() {
                return ((Annotation) this.instance).getSourceFileBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasBegin() {
                return ((Annotation) this.instance).hasBegin();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasEnd() {
                return ((Annotation) this.instance).hasEnd();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSemantic() {
                return ((Annotation) this.instance).hasSemantic();
            }

            @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
            public boolean hasSourceFile() {
                return ((Annotation) this.instance).hasSourceFile();
            }

            public Builder setBegin(int i11) {
                copyOnWrite();
                ((Annotation) this.instance).setBegin(i11);
                return this;
            }

            public Builder setEnd(int i11) {
                copyOnWrite();
                ((Annotation) this.instance).setEnd(i11);
                return this;
            }

            public Builder setPath(int i11, int i12) {
                copyOnWrite();
                ((Annotation) this.instance).setPath(i11, i12);
                return this;
            }

            public Builder setSemantic(Semantic semantic) {
                copyOnWrite();
                ((Annotation) this.instance).setSemantic(semantic);
                return this;
            }

            public Builder setSourceFile(String str) {
                copyOnWrite();
                ((Annotation) this.instance).setSourceFile(str);
                return this;
            }

            public Builder setSourceFileBytes(ByteString byteString) {
                copyOnWrite();
                ((Annotation) this.instance).setSourceFileBytes(byteString);
                return this;
            }

            private Builder() {
                super(Annotation.DEFAULT_INSTANCE);
            }
        }

        public enum Semantic implements Internal.a {
            NONE(0),
            SET(1),
            ALIAS(2);

            public static final int ALIAS_VALUE = 2;
            public static final int NONE_VALUE = 0;
            public static final int SET_VALUE = 1;
            private static final Internal.b<Semantic> internalValueMap = new Internal.b<Semantic>() { // from class: com.google.protobuf.DescriptorProtos.GeneratedCodeInfo.Annotation.Semantic.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.protobuf.Internal.b
                public Semantic findValueByNumber(int i11) {
                    return Semantic.forNumber(i11);
                }
            };
            private final int value;

            private static final class SemanticVerifier implements Internal.c {
                static final Internal.c INSTANCE = new SemanticVerifier();

                private SemanticVerifier() {
                }

                @Override // com.google.protobuf.Internal.c
                public boolean isInRange(int i11) {
                    return Semantic.forNumber(i11) != null;
                }
            }

            Semantic(int i11) {
                this.value = i11;
            }

            public static Semantic forNumber(int i11) {
                if (i11 == 0) {
                    return NONE;
                }
                if (i11 == 1) {
                    return SET;
                }
                if (i11 != 2) {
                    return null;
                }
                return ALIAS;
            }

            public static Internal.b<Semantic> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.c internalGetVerifier() {
                return SemanticVerifier.INSTANCE;
            }

            @Override // com.google.protobuf.Internal.a
            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Semantic valueOf(int i11) {
                return forNumber(i11);
            }
        }

        static {
            Annotation annotation = new Annotation();
            DEFAULT_INSTANCE = annotation;
            GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
        }

        private Annotation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractMessageLite.addAll(iterable, this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i11) {
            ensurePathIsMutable();
            this.path_.addInt(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBegin() {
            this.bitField0_ &= -3;
            this.begin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -5;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSemantic() {
            this.bitField0_ &= -9;
            this.semantic_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceFile() {
            this.bitField0_ &= -2;
            this.sourceFile_ = getDefaultInstance().getSourceFile();
        }

        private void ensurePathIsMutable() {
            Internal.IntList intList = this.path_;
            if (intList.isModifiable()) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static Annotation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<Annotation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBegin(int i11) {
            this.bitField0_ |= 2;
            this.begin_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i11) {
            this.bitField0_ |= 4;
            this.end_ = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i11, int i12) {
            ensurePathIsMutable();
            this.path_.setInt(i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSemantic(Semantic semantic) {
            this.semantic_ = semantic.getNumber();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFile(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.sourceFile_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFileBytes(ByteString byteString) {
            this.sourceFile_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new Annotation();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002\u0005᠌\u0003", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_", "semantic_", Semantic.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<Annotation> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (Annotation.class) {
                        try {
                            e11 = PARSER;
                            if (e11 == null) {
                                e11 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = e11;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return e11;
                case 6:
                    return (byte) 1;
                default:
                    throw null;
            }
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getBegin() {
            return this.begin_;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getEnd() {
            return this.end_;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getPath(int i11) {
            return this.path_.getInt(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public Semantic getSemantic() {
            Semantic forNumber = Semantic.forNumber(this.semantic_);
            return forNumber == null ? Semantic.NONE : forNumber;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public String getSourceFile() {
            return this.sourceFile_;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public ByteString getSourceFileBytes() {
            return ByteString.copyFromUtf8(this.sourceFile_);
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasSemantic() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfo.AnnotationOrBuilder
        public boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Annotation annotation) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static Annotation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Annotation parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static Annotation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Annotation parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static Annotation parseFrom(InputStream inputStream) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static Annotation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Annotation parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface AnnotationOrBuilder extends A {
        int getBegin();

        /* synthetic */ MessageLite getDefaultInstanceForType();

        int getEnd();

        int getPath(int i11);

        int getPathCount();

        List<Integer> getPathList();

        Annotation.Semantic getSemantic();

        String getSourceFile();

        ByteString getSourceFileBytes();

        boolean hasBegin();

        boolean hasEnd();

        boolean hasSemantic();

        boolean hasSourceFile();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$GeneratedCodeInfo, Builder> implements DescriptorProtos$GeneratedCodeInfoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllAnnotation(Iterable<? extends Annotation> iterable) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAllAnnotation(iterable);
            return this;
        }

        public Builder addAnnotation(Annotation annotation) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(annotation);
            return this;
        }

        public Builder clearAnnotation() {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).clearAnnotation();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public Annotation getAnnotation(int i11) {
            return ((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotation(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public int getAnnotationCount() {
            return ((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotationCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
        public List<Annotation> getAnnotationList() {
            return Collections.unmodifiableList(((DescriptorProtos$GeneratedCodeInfo) this.instance).getAnnotationList());
        }

        public Builder removeAnnotation(int i11) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).removeAnnotation(i11);
            return this;
        }

        public Builder setAnnotation(int i11, Annotation annotation) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).setAnnotation(i11, annotation);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$GeneratedCodeInfo.DEFAULT_INSTANCE);
        }

        public Builder addAnnotation(int i11, Annotation annotation) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(i11, annotation);
            return this;
        }

        public Builder setAnnotation(int i11, Annotation.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).setAnnotation(i11, builder.build());
            return this;
        }

        public Builder addAnnotation(Annotation.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(builder.build());
            return this;
        }

        public Builder addAnnotation(int i11, Annotation.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$GeneratedCodeInfo) this.instance).addAnnotation(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$GeneratedCodeInfo.class, descriptorProtos$GeneratedCodeInfo);
    }

    private DescriptorProtos$GeneratedCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
        ensureAnnotationIsMutable();
        AbstractMessageLite.addAll(iterable, this.annotation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(annotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnotation() {
        this.annotation_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAnnotationIsMutable() {
        Internal.e<Annotation> eVar = this.annotation_;
        if (eVar.isModifiable()) {
            return;
        }
        this.annotation_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$GeneratedCodeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnnotation(int i11) {
        ensureAnnotationIsMutable();
        this.annotation_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnotation(int i11, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.set(i11, annotation);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$GeneratedCodeInfo();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$GeneratedCodeInfo> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$GeneratedCodeInfo.class) {
                    try {
                        e11 = PARSER;
                        if (e11 == null) {
                            e11 = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = e11;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return e11;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
    public Annotation getAnnotation(int i11) {
        return this.annotation_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$GeneratedCodeInfoOrBuilder
    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public AnnotationOrBuilder getAnnotationOrBuilder(int i11) {
        return this.annotation_.get(i11);
    }

    public List<? extends AnnotationOrBuilder> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    public static Builder newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(int i11, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(i11, annotation);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}

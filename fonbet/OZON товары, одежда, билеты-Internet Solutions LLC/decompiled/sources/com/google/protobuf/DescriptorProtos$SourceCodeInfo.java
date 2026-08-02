package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$SourceCodeInfo, Builder> implements DescriptorProtos$SourceCodeInfoOrBuilder {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile E<DescriptorProtos$SourceCodeInfo> PARSER;
    private byte memoizedIsInitialized = 2;
    private Internal.e<Location> location_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$SourceCodeInfo, Builder> implements DescriptorProtos$SourceCodeInfoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllLocation(Iterable<? extends Location> iterable) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addAllLocation(iterable);
            return this;
        }

        public Builder addLocation(Location location) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(location);
            return this;
        }

        public Builder clearLocation() {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).clearLocation();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public Location getLocation(int i11) {
            return ((DescriptorProtos$SourceCodeInfo) this.instance).getLocation(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public int getLocationCount() {
            return ((DescriptorProtos$SourceCodeInfo) this.instance).getLocationCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
        public List<Location> getLocationList() {
            return Collections.unmodifiableList(((DescriptorProtos$SourceCodeInfo) this.instance).getLocationList());
        }

        public Builder removeLocation(int i11) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).removeLocation(i11);
            return this;
        }

        public Builder setLocation(int i11, Location location) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).setLocation(i11, location);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$SourceCodeInfo.DEFAULT_INSTANCE);
        }

        public Builder addLocation(int i11, Location location) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(i11, location);
            return this;
        }

        public Builder setLocation(int i11, Location.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).setLocation(i11, builder.build());
            return this;
        }

        public Builder addLocation(Location.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(builder.build());
            return this;
        }

        public Builder addLocation(int i11, Location.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$SourceCodeInfo) this.instance).addLocation(i11, builder.build());
            return this;
        }
    }

    public static final class Location extends GeneratedMessageLite<Location, Builder> implements LocationOrBuilder {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static volatile E<Location> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int pathMemoizedSerializedSize = -1;
        private int spanMemoizedSerializedSize = -1;
        private Internal.IntList path_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList span_ = GeneratedMessageLite.emptyIntList();
        private String leadingComments_ = "";
        private String trailingComments_ = "";
        private Internal.e<String> leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<Location, Builder> implements LocationOrBuilder {
            /* synthetic */ Builder(C5954e c5954e) {
                this();
            }

            public Builder addAllLeadingDetachedComments(Iterable<String> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllLeadingDetachedComments(iterable);
                return this;
            }

            public Builder addAllPath(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllPath(iterable);
                return this;
            }

            public Builder addAllSpan(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((Location) this.instance).addAllSpan(iterable);
                return this;
            }

            public Builder addLeadingDetachedComments(String str) {
                copyOnWrite();
                ((Location) this.instance).addLeadingDetachedComments(str);
                return this;
            }

            public Builder addLeadingDetachedCommentsBytes(ByteString byteString) {
                copyOnWrite();
                ((Location) this.instance).addLeadingDetachedCommentsBytes(byteString);
                return this;
            }

            public Builder addPath(int i11) {
                copyOnWrite();
                ((Location) this.instance).addPath(i11);
                return this;
            }

            public Builder addSpan(int i11) {
                copyOnWrite();
                ((Location) this.instance).addSpan(i11);
                return this;
            }

            public Builder clearLeadingComments() {
                copyOnWrite();
                ((Location) this.instance).clearLeadingComments();
                return this;
            }

            public Builder clearLeadingDetachedComments() {
                copyOnWrite();
                ((Location) this.instance).clearLeadingDetachedComments();
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((Location) this.instance).clearPath();
                return this;
            }

            public Builder clearSpan() {
                copyOnWrite();
                ((Location) this.instance).clearSpan();
                return this;
            }

            public Builder clearTrailingComments() {
                copyOnWrite();
                ((Location) this.instance).clearTrailingComments();
                return this;
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public String getLeadingComments() {
                return ((Location) this.instance).getLeadingComments();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingCommentsBytes() {
                return ((Location) this.instance).getLeadingCommentsBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public String getLeadingDetachedComments(int i11) {
                return ((Location) this.instance).getLeadingDetachedComments(i11);
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public ByteString getLeadingDetachedCommentsBytes(int i11) {
                return ((Location) this.instance).getLeadingDetachedCommentsBytes(i11);
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getLeadingDetachedCommentsCount() {
                return ((Location) this.instance).getLeadingDetachedCommentsCount();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public List<String> getLeadingDetachedCommentsList() {
                return Collections.unmodifiableList(((Location) this.instance).getLeadingDetachedCommentsList());
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getPath(int i11) {
                return ((Location) this.instance).getPath(i11);
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getPathCount() {
                return ((Location) this.instance).getPathCount();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public List<Integer> getPathList() {
                return Collections.unmodifiableList(((Location) this.instance).getPathList());
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getSpan(int i11) {
                return ((Location) this.instance).getSpan(i11);
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public int getSpanCount() {
                return ((Location) this.instance).getSpanCount();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public List<Integer> getSpanList() {
                return Collections.unmodifiableList(((Location) this.instance).getSpanList());
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public String getTrailingComments() {
                return ((Location) this.instance).getTrailingComments();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public ByteString getTrailingCommentsBytes() {
                return ((Location) this.instance).getTrailingCommentsBytes();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public boolean hasLeadingComments() {
                return ((Location) this.instance).hasLeadingComments();
            }

            @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
            public boolean hasTrailingComments() {
                return ((Location) this.instance).hasTrailingComments();
            }

            public Builder setLeadingComments(String str) {
                copyOnWrite();
                ((Location) this.instance).setLeadingComments(str);
                return this;
            }

            public Builder setLeadingCommentsBytes(ByteString byteString) {
                copyOnWrite();
                ((Location) this.instance).setLeadingCommentsBytes(byteString);
                return this;
            }

            public Builder setLeadingDetachedComments(int i11, String str) {
                copyOnWrite();
                ((Location) this.instance).setLeadingDetachedComments(i11, str);
                return this;
            }

            public Builder setPath(int i11, int i12) {
                copyOnWrite();
                ((Location) this.instance).setPath(i11, i12);
                return this;
            }

            public Builder setSpan(int i11, int i12) {
                copyOnWrite();
                ((Location) this.instance).setSpan(i11, i12);
                return this;
            }

            public Builder setTrailingComments(String str) {
                copyOnWrite();
                ((Location) this.instance).setTrailingComments(str);
                return this;
            }

            public Builder setTrailingCommentsBytes(ByteString byteString) {
                copyOnWrite();
                ((Location) this.instance).setTrailingCommentsBytes(byteString);
                return this;
            }

            private Builder() {
                super(Location.DEFAULT_INSTANCE);
            }
        }

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            GeneratedMessageLite.registerDefaultInstance(Location.class, location);
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeadingDetachedComments(Iterable<String> iterable) {
            ensureLeadingDetachedCommentsIsMutable();
            AbstractMessageLite.addAll(iterable, this.leadingDetachedComments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractMessageLite.addAll(iterable, this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpan(Iterable<? extends Integer> iterable) {
            ensureSpanIsMutable();
            AbstractMessageLite.addAll(iterable, this.span_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedComments(String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedCommentsBytes(ByteString byteString) {
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i11) {
            ensurePathIsMutable();
            this.path_.addInt(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpan(int i11) {
            ensureSpanIsMutable();
            this.span_.addInt(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingComments() {
            this.bitField0_ &= -2;
            this.leadingComments_ = getDefaultInstance().getLeadingComments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingDetachedComments() {
            this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpan() {
            this.span_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrailingComments() {
            this.bitField0_ &= -3;
            this.trailingComments_ = getDefaultInstance().getTrailingComments();
        }

        private void ensureLeadingDetachedCommentsIsMutable() {
            Internal.e<String> eVar = this.leadingDetachedComments_;
            if (eVar.isModifiable()) {
                return;
            }
            this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(eVar);
        }

        private void ensurePathIsMutable() {
            Internal.IntList intList = this.path_;
            if (intList.isModifiable()) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureSpanIsMutable() {
            Internal.IntList intList = this.span_;
            if (intList.isModifiable()) {
                return;
            }
            this.span_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<Location> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingComments(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.leadingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingCommentsBytes(ByteString byteString) {
            this.leadingComments_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingDetachedComments(int i11, String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.set(i11, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i11, int i12) {
            ensurePathIsMutable();
            this.path_.setInt(i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpan(int i11, int i12) {
            ensureSpanIsMutable();
            this.span_.setInt(i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingComments(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.trailingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingCommentsBytes(ByteString byteString) {
            this.trailingComments_ = byteString.toStringUtf8();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            C5954e c5954e = null;
            switch (C5954e.f60203a[bVar.ordinal()]) {
                case 1:
                    return new Location();
                case 2:
                    return new Builder(c5954e);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<Location> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (Location.class) {
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

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public String getLeadingComments() {
            return this.leadingComments_;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public ByteString getLeadingCommentsBytes() {
            return ByteString.copyFromUtf8(this.leadingComments_);
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public String getLeadingDetachedComments(int i11) {
            return this.leadingDetachedComments_.get(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public ByteString getLeadingDetachedCommentsBytes(int i11) {
            return ByteString.copyFromUtf8(this.leadingDetachedComments_.get(i11));
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public List<String> getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getPath(int i11) {
            return this.path_.getInt(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public List<Integer> getPathList() {
            return this.path_;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getSpan(int i11) {
            return this.span_.getInt(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public int getSpanCount() {
            return this.span_.size();
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public List<Integer> getSpanList() {
            return this.span_;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public String getTrailingComments() {
            return this.trailingComments_;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public ByteString getTrailingCommentsBytes() {
            return ByteString.copyFromUtf8(this.trailingComments_);
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfo.LocationOrBuilder
        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(Location location) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Location parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static Location parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Location parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface LocationOrBuilder extends A {
        /* synthetic */ MessageLite getDefaultInstanceForType();

        String getLeadingComments();

        ByteString getLeadingCommentsBytes();

        String getLeadingDetachedComments(int i11);

        ByteString getLeadingDetachedCommentsBytes(int i11);

        int getLeadingDetachedCommentsCount();

        List<String> getLeadingDetachedCommentsList();

        int getPath(int i11);

        int getPathCount();

        List<Integer> getPathList();

        int getSpan(int i11);

        int getSpanCount();

        List<Integer> getSpanList();

        String getTrailingComments();

        ByteString getTrailingCommentsBytes();

        boolean hasLeadingComments();

        boolean hasTrailingComments();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$SourceCodeInfo.class, descriptorProtos$SourceCodeInfo);
    }

    private DescriptorProtos$SourceCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocation(Iterable<? extends Location> iterable) {
        ensureLocationIsMutable();
        AbstractMessageLite.addAll(iterable, this.location_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLocationIsMutable() {
        Internal.e<Location> eVar = this.location_;
        if (eVar.isModifiable()) {
            return;
        }
        this.location_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$SourceCodeInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocation(int i11) {
        ensureLocationIsMutable();
        this.location_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(int i11, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.set(i11, location);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$SourceCodeInfo();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$SourceCodeInfo> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$SourceCodeInfo.class) {
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
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw null;
        }
    }

    @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public Location getLocation(int i11) {
        return this.location_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public int getLocationCount() {
        return this.location_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$SourceCodeInfoOrBuilder
    public List<Location> getLocationList() {
        return this.location_;
    }

    public LocationOrBuilder getLocationOrBuilder(int i11) {
        return this.location_.get(i11);
    }

    public List<? extends LocationOrBuilder> getLocationOrBuilderList() {
        return this.location_;
    }

    public static Builder newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(int i11, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(i11, location);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}

package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$DescriptorProto;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto;
import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$ServiceDescriptorProto;
import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FileDescriptorProto extends GeneratedMessageLite<DescriptorProtos$FileDescriptorProto, Builder> implements DescriptorProtos$FileDescriptorProtoOrBuilder {
    private static final DescriptorProtos$FileDescriptorProto DEFAULT_INSTANCE;
    public static final int DEPENDENCY_FIELD_NUMBER = 3;
    public static final int EDITION_FIELD_NUMBER = 14;
    public static final int ENUM_TYPE_FIELD_NUMBER = 5;
    public static final int EXTENSION_FIELD_NUMBER = 7;
    public static final int MESSAGE_TYPE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    public static final int OPTION_DEPENDENCY_FIELD_NUMBER = 15;
    public static final int PACKAGE_FIELD_NUMBER = 2;
    private static volatile E<DescriptorProtos$FileDescriptorProto> PARSER = null;
    public static final int PUBLIC_DEPENDENCY_FIELD_NUMBER = 10;
    public static final int SERVICE_FIELD_NUMBER = 6;
    public static final int SOURCE_CODE_INFO_FIELD_NUMBER = 9;
    public static final int SYNTAX_FIELD_NUMBER = 12;
    public static final int WEAK_DEPENDENCY_FIELD_NUMBER = 11;
    private int bitField0_;
    private int edition_;
    private DescriptorProtos$FileOptions options_;
    private DescriptorProtos$SourceCodeInfo sourceCodeInfo_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private String package_ = "";
    private Internal.e<String> dependency_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.IntList publicDependency_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList weakDependency_ = GeneratedMessageLite.emptyIntList();
    private Internal.e<String> optionDependency_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$DescriptorProto> messageType_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$EnumDescriptorProto> enumType_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$ServiceDescriptorProto> service_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.e<DescriptorProtos$FieldDescriptorProto> extension_ = GeneratedMessageLite.emptyProtobufList();
    private String syntax_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<DescriptorProtos$FileDescriptorProto, Builder> implements DescriptorProtos$FileDescriptorProtoOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllDependency(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllDependency(iterable);
            return this;
        }

        public Builder addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllEnumType(iterable);
            return this;
        }

        public Builder addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllExtension(iterable);
            return this;
        }

        public Builder addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllMessageType(iterable);
            return this;
        }

        public Builder addAllOptionDependency(Iterable<String> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllOptionDependency(iterable);
            return this;
        }

        public Builder addAllPublicDependency(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllPublicDependency(iterable);
            return this;
        }

        public Builder addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllService(iterable);
            return this;
        }

        public Builder addAllWeakDependency(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addAllWeakDependency(iterable);
            return this;
        }

        public Builder addDependency(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addDependency(str);
            return this;
        }

        public Builder addDependencyBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addDependencyBytes(byteString);
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addOptionDependency(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addOptionDependency(str);
            return this;
        }

        public Builder addOptionDependencyBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addOptionDependencyBytes(byteString);
            return this;
        }

        public Builder addPublicDependency(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addPublicDependency(i11);
            return this;
        }

        public Builder addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public Builder addWeakDependency(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addWeakDependency(i11);
            return this;
        }

        public Builder clearDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearDependency();
            return this;
        }

        public Builder clearEdition() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearEdition();
            return this;
        }

        public Builder clearEnumType() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearEnumType();
            return this;
        }

        public Builder clearExtension() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearExtension();
            return this;
        }

        public Builder clearMessageType() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearMessageType();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearName();
            return this;
        }

        public Builder clearOptionDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearOptionDependency();
            return this;
        }

        public Builder clearOptions() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearOptions();
            return this;
        }

        public Builder clearPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearPackage();
            return this;
        }

        public Builder clearPublicDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearPublicDependency();
            return this;
        }

        public Builder clearService() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearService();
            return this;
        }

        public Builder clearSourceCodeInfo() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearSourceCodeInfo();
            return this;
        }

        public Builder clearSyntax() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearSyntax();
            return this;
        }

        public Builder clearWeakDependency() {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).clearWeakDependency();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getDependency(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependency(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getDependencyBytes(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyBytes(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<String> getDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getDependencyList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$Edition getEdition() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getEdition();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$EnumDescriptorProto getEnumType(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getEnumType(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getEnumTypeCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getEnumTypeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getEnumTypeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$FieldDescriptorProto getExtension(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getExtension(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getExtensionCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getExtensionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getExtensionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$DescriptorProto getMessageType(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getMessageType(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getMessageTypeCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getMessageTypeCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getMessageTypeList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getName() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getNameBytes() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getNameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getOptionDependency(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getOptionDependency(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getOptionDependencyBytes(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getOptionDependencyBytes(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getOptionDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getOptionDependencyCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<String> getOptionDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getOptionDependencyList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$FileOptions getOptions() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getPackage() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getPackageBytes() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPackageBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getPublicDependency(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependency(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getPublicDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependencyCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<Integer> getPublicDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getPublicDependencyList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$ServiceDescriptorProto getService(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getService(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getServiceCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getServiceCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getServiceList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getSourceCodeInfo();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public String getSyntax() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getSyntax();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public ByteString getSyntaxBytes() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getSyntaxBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getWeakDependency(int i11) {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependency(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public int getWeakDependencyCount() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependencyCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public List<Integer> getWeakDependencyList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileDescriptorProto) this.instance).getWeakDependencyList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasEdition() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasEdition();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasName() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasName();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasOptions() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasOptions();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasPackage() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasSourceCodeInfo() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasSourceCodeInfo();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
        public boolean hasSyntax() {
            return ((DescriptorProtos$FileDescriptorProto) this.instance).hasSyntax();
        }

        public Builder mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).mergeOptions(descriptorProtos$FileOptions);
            return this;
        }

        public Builder mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).mergeSourceCodeInfo(descriptorProtos$SourceCodeInfo);
            return this;
        }

        public Builder removeEnumType(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeEnumType(i11);
            return this;
        }

        public Builder removeExtension(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeExtension(i11);
            return this;
        }

        public Builder removeMessageType(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeMessageType(i11);
            return this;
        }

        public Builder removeService(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).removeService(i11);
            return this;
        }

        public Builder setDependency(int i11, String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setDependency(i11, str);
            return this;
        }

        public Builder setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setEdition(descriptorProtos$Edition);
            return this;
        }

        public Builder setEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setEnumType(i11, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder setExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setExtension(i11, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder setMessageType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setMessageType(i11, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setOptionDependency(int i11, String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setOptionDependency(i11, str);
            return this;
        }

        public Builder setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setOptions(descriptorProtos$FileOptions);
            return this;
        }

        public Builder setPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setPackage(str);
            return this;
        }

        public Builder setPackageBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setPackageBytes(byteString);
            return this;
        }

        public Builder setPublicDependency(int i11, int i12) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setPublicDependency(i11, i12);
            return this;
        }

        public Builder setService(int i11, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setService(i11, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public Builder setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSourceCodeInfo(descriptorProtos$SourceCodeInfo);
            return this;
        }

        public Builder setSyntax(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSyntax(str);
            return this;
        }

        public Builder setSyntaxBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSyntaxBytes(byteString);
            return this;
        }

        public Builder setWeakDependency(int i11, int i12) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setWeakDependency(i11, i12);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FileDescriptorProto.DEFAULT_INSTANCE);
        }

        public Builder addEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(i11, descriptorProtos$EnumDescriptorProto);
            return this;
        }

        public Builder addExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(i11, descriptorProtos$FieldDescriptorProto);
            return this;
        }

        public Builder addMessageType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(i11, descriptorProtos$DescriptorProto);
            return this;
        }

        public Builder addService(int i11, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(i11, descriptorProtos$ServiceDescriptorProto);
            return this;
        }

        public Builder setEnumType(int i11, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setEnumType(i11, builder.build());
            return this;
        }

        public Builder setExtension(int i11, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setExtension(i11, builder.build());
            return this;
        }

        public Builder setMessageType(int i11, DescriptorProtos$DescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setMessageType(i11, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setOptions(DescriptorProtos$FileOptions.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setOptions((DescriptorProtos$FileOptions) builder.build());
            return this;
        }

        public Builder setService(int i11, DescriptorProtos$ServiceDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setService(i11, builder.build());
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setSourceCodeInfo(DescriptorProtos$SourceCodeInfo.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).setSourceCodeInfo((DescriptorProtos$SourceCodeInfo) builder.build());
            return this;
        }

        public Builder addEnumType(DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(builder.build());
            return this;
        }

        public Builder addExtension(DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(builder.build());
            return this;
        }

        public Builder addMessageType(DescriptorProtos$DescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(builder.build());
            return this;
        }

        public Builder addService(DescriptorProtos$ServiceDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(builder.build());
            return this;
        }

        public Builder addEnumType(int i11, DescriptorProtos$EnumDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addEnumType(i11, builder.build());
            return this;
        }

        public Builder addExtension(int i11, DescriptorProtos$FieldDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addExtension(i11, builder.build());
            return this;
        }

        public Builder addMessageType(int i11, DescriptorProtos$DescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addMessageType(i11, builder.build());
            return this;
        }

        public Builder addService(int i11, DescriptorProtos$ServiceDescriptorProto.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileDescriptorProto) this.instance).addService(i11, builder.build());
            return this;
        }
    }

    static {
        DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto = new DescriptorProtos$FileDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorProto.class, descriptorProtos$FileDescriptorProto);
    }

    private DescriptorProtos$FileDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDependency(Iterable<String> iterable) {
        ensureDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.dependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        ensureEnumTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.enumType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureExtensionIsMutable();
        AbstractMessageLite.addAll(iterable, this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessageType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureMessageTypeIsMutable();
        AbstractMessageLite.addAll(iterable, this.messageType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptionDependency(Iterable<String> iterable) {
        ensureOptionDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.optionDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPublicDependency(Iterable<? extends Integer> iterable) {
        ensurePublicDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.publicDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllService(Iterable<? extends DescriptorProtos$ServiceDescriptorProto> iterable) {
        ensureServiceIsMutable();
        AbstractMessageLite.addAll(iterable, this.service_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWeakDependency(Iterable<? extends Integer> iterable) {
        ensureWeakDependencyIsMutable();
        AbstractMessageLite.addAll(iterable, this.weakDependency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependency(String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDependencyBytes(ByteString byteString) {
        ensureDependencyIsMutable();
        this.dependency_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessageType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptionDependency(String str) {
        str.getClass();
        ensureOptionDependencyIsMutable();
        this.optionDependency_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptionDependencyBytes(ByteString byteString) {
        ensureOptionDependencyIsMutable();
        this.optionDependency_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPublicDependency(int i11) {
        ensurePublicDependencyIsMutable();
        this.publicDependency_.addInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWeakDependency(int i11) {
        ensureWeakDependencyIsMutable();
        this.weakDependency_.addInt(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDependency() {
        this.dependency_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEdition() {
        this.bitField0_ &= -33;
        this.edition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.enumType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageType() {
        this.messageType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptionDependency() {
        this.optionDependency_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackage() {
        this.bitField0_ &= -3;
        this.package_ = getDefaultInstance().getPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPublicDependency() {
        this.publicDependency_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearService() {
        this.service_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceCodeInfo() {
        this.sourceCodeInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.bitField0_ &= -17;
        this.syntax_ = getDefaultInstance().getSyntax();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeakDependency() {
        this.weakDependency_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureDependencyIsMutable() {
        Internal.e<String> eVar = this.dependency_;
        if (eVar.isModifiable()) {
            return;
        }
        this.dependency_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureEnumTypeIsMutable() {
        Internal.e<DescriptorProtos$EnumDescriptorProto> eVar = this.enumType_;
        if (eVar.isModifiable()) {
            return;
        }
        this.enumType_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureExtensionIsMutable() {
        Internal.e<DescriptorProtos$FieldDescriptorProto> eVar = this.extension_;
        if (eVar.isModifiable()) {
            return;
        }
        this.extension_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureMessageTypeIsMutable() {
        Internal.e<DescriptorProtos$DescriptorProto> eVar = this.messageType_;
        if (eVar.isModifiable()) {
            return;
        }
        this.messageType_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureOptionDependencyIsMutable() {
        Internal.e<String> eVar = this.optionDependency_;
        if (eVar.isModifiable()) {
            return;
        }
        this.optionDependency_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensurePublicDependencyIsMutable() {
        Internal.IntList intList = this.publicDependency_;
        if (intList.isModifiable()) {
            return;
        }
        this.publicDependency_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureServiceIsMutable() {
        Internal.e<DescriptorProtos$ServiceDescriptorProto> eVar = this.service_;
        if (eVar.isModifiable()) {
            return;
        }
        this.service_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    private void ensureWeakDependencyIsMutable() {
        Internal.IntList intList = this.weakDependency_;
        if (intList.isModifiable()) {
            return;
        }
        this.weakDependency_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static DescriptorProtos$FileDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        DescriptorProtos$FileOptions descriptorProtos$FileOptions2 = this.options_;
        if (descriptorProtos$FileOptions2 == null || descriptorProtos$FileOptions2 == DescriptorProtos$FileOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$FileOptions;
        } else {
            this.options_ = ((DescriptorProtos$FileOptions.Builder) DescriptorProtos$FileOptions.newBuilder(this.options_).mergeFrom((DescriptorProtos$FileOptions.Builder) descriptorProtos$FileOptions)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo2 = this.sourceCodeInfo_;
        if (descriptorProtos$SourceCodeInfo2 == null || descriptorProtos$SourceCodeInfo2 == DescriptorProtos$SourceCodeInfo.getDefaultInstance()) {
            this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        } else {
            this.sourceCodeInfo_ = ((DescriptorProtos$SourceCodeInfo.Builder) DescriptorProtos$SourceCodeInfo.newBuilder(this.sourceCodeInfo_).mergeFrom((DescriptorProtos$SourceCodeInfo.Builder) descriptorProtos$SourceCodeInfo)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FileDescriptorProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumType(int i11) {
        ensureEnumTypeIsMutable();
        this.enumType_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i11) {
        ensureExtensionIsMutable();
        this.extension_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessageType(int i11) {
        ensureMessageTypeIsMutable();
        this.messageType_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeService(int i11) {
        ensureServiceIsMutable();
        this.service_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDependency(int i11, String str) {
        str.getClass();
        ensureDependencyIsMutable();
        this.dependency_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEdition(DescriptorProtos$Edition descriptorProtos$Edition) {
        this.edition_ = descriptorProtos$Edition.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.set(i11, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i11, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.set(i11, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        this.name_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptionDependency(int i11, String str) {
        str.getClass();
        ensureOptionDependencyIsMutable();
        this.optionDependency_.set(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        descriptorProtos$FileOptions.getClass();
        this.options_ = descriptorProtos$FileOptions;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackage(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.package_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageBytes(ByteString byteString) {
        this.package_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPublicDependency(int i11, int i12) {
        ensurePublicDependencyIsMutable();
        this.publicDependency_.setInt(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setService(int i11, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.set(i11, descriptorProtos$ServiceDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceCodeInfo(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        descriptorProtos$SourceCodeInfo.getClass();
        this.sourceCodeInfo_ = descriptorProtos$SourceCodeInfo;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.syntax_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxBytes(ByteString byteString) {
        this.syntax_ = byteString.toStringUtf8();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeakDependency(int i11, int i12) {
        ensureWeakDependencyIsMutable();
        this.weakDependency_.setInt(i11, i12);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileDescriptorProto();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\b\u0006\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004Л\u0005Л\u0006Л\u0007Л\bᐉ\u0002\tᐉ\u0003\n\u0016\u000b\u0016\fဈ\u0004\u000e᠌\u0005\u000f\u001a", new Object[]{"bitField0_", "name_", "package_", "dependency_", "messageType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "service_", DescriptorProtos$ServiceDescriptorProto.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "sourceCodeInfo_", "publicDependency_", "weakDependency_", "syntax_", "edition_", DescriptorProtos$Edition.internalGetVerifier(), "optionDependency_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FileDescriptorProto> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FileDescriptorProto.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getDependency(int i11) {
        return this.dependency_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public ByteString getDependencyBytes(int i11) {
        return ByteString.copyFromUtf8(this.dependency_.get(i11));
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getDependencyCount() {
        return this.dependency_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<String> getDependencyList() {
        return this.dependency_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$Edition getEdition() {
        DescriptorProtos$Edition forNumber = DescriptorProtos$Edition.forNumber(this.edition_);
        return forNumber == null ? DescriptorProtos$Edition.EDITION_UNKNOWN : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$EnumDescriptorProto getEnumType(int i11) {
        return this.enumType_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public DescriptorProtos$EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(int i11) {
        return this.enumType_.get(i11);
    }

    public List<? extends DescriptorProtos$EnumDescriptorProtoOrBuilder> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$FieldDescriptorProto getExtension(int i11) {
        return this.extension_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getExtensionCount() {
        return this.extension_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public DescriptorProtos$FieldDescriptorProtoOrBuilder getExtensionOrBuilder(int i11) {
        return this.extension_.get(i11);
    }

    public List<? extends DescriptorProtos$FieldDescriptorProtoOrBuilder> getExtensionOrBuilderList() {
        return this.extension_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$DescriptorProto getMessageType(int i11) {
        return this.messageType_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getMessageTypeCount() {
        return this.messageType_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$DescriptorProto> getMessageTypeList() {
        return this.messageType_;
    }

    public DescriptorProtos$DescriptorProtoOrBuilder getMessageTypeOrBuilder(int i11) {
        return this.messageType_.get(i11);
    }

    public List<? extends DescriptorProtos$DescriptorProtoOrBuilder> getMessageTypeOrBuilderList() {
        return this.messageType_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getOptionDependency(int i11) {
        return this.optionDependency_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public ByteString getOptionDependencyBytes(int i11) {
        return ByteString.copyFromUtf8(this.optionDependency_.get(i11));
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getOptionDependencyCount() {
        return this.optionDependency_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<String> getOptionDependencyList() {
        return this.optionDependency_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$FileOptions getOptions() {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = this.options_;
        return descriptorProtos$FileOptions == null ? DescriptorProtos$FileOptions.getDefaultInstance() : descriptorProtos$FileOptions;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getPackage() {
        return this.package_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public ByteString getPackageBytes() {
        return ByteString.copyFromUtf8(this.package_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getPublicDependency(int i11) {
        return this.publicDependency_.getInt(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getPublicDependencyCount() {
        return this.publicDependency_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<Integer> getPublicDependencyList() {
        return this.publicDependency_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$ServiceDescriptorProto getService(int i11) {
        return this.service_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getServiceCount() {
        return this.service_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<DescriptorProtos$ServiceDescriptorProto> getServiceList() {
        return this.service_;
    }

    public DescriptorProtos$ServiceDescriptorProtoOrBuilder getServiceOrBuilder(int i11) {
        return this.service_.get(i11);
    }

    public List<? extends DescriptorProtos$ServiceDescriptorProtoOrBuilder> getServiceOrBuilderList() {
        return this.service_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public DescriptorProtos$SourceCodeInfo getSourceCodeInfo() {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = this.sourceCodeInfo_;
        return descriptorProtos$SourceCodeInfo == null ? DescriptorProtos$SourceCodeInfo.getDefaultInstance() : descriptorProtos$SourceCodeInfo;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public String getSyntax() {
        return this.syntax_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public ByteString getSyntaxBytes() {
        return ByteString.copyFromUtf8(this.syntax_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getWeakDependency(int i11) {
        return this.weakDependency_.getInt(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public int getWeakDependencyCount() {
        return this.weakDependency_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public List<Integer> getWeakDependencyList() {
        return this.weakDependency_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasEdition() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasOptions() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasPackage() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasSourceCodeInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileDescriptorProtoOrBuilder
    public boolean hasSyntax() {
        return (this.bitField0_ & 16) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(int i11, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(i11, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i11, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i11, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessageType(int i11, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureMessageTypeIsMutable();
        this.messageType_.add(i11, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addService(int i11, DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        descriptorProtos$ServiceDescriptorProto.getClass();
        ensureServiceIsMutable();
        this.service_.add(i11, descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FileDescriptorProto parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}

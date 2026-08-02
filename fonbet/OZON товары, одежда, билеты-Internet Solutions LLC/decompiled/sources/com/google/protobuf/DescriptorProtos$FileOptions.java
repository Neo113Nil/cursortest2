package com.google.protobuf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FeatureSet;
import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class DescriptorProtos$FileOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FileOptions, Builder> implements DescriptorProtos$FileOptionsOrBuilder {
    public static final int CC_ENABLE_ARENAS_FIELD_NUMBER = 31;
    public static final int CC_GENERIC_SERVICES_FIELD_NUMBER = 16;
    public static final int CSHARP_NAMESPACE_FIELD_NUMBER = 37;
    private static final DescriptorProtos$FileOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 23;
    public static final int FEATURES_FIELD_NUMBER = 50;
    public static final int GO_PACKAGE_FIELD_NUMBER = 11;
    public static final int JAVA_GENERATE_EQUALS_AND_HASH_FIELD_NUMBER = 20;
    public static final int JAVA_GENERIC_SERVICES_FIELD_NUMBER = 17;
    public static final int JAVA_MULTIPLE_FILES_FIELD_NUMBER = 10;
    public static final int JAVA_OUTER_CLASSNAME_FIELD_NUMBER = 8;
    public static final int JAVA_PACKAGE_FIELD_NUMBER = 1;
    public static final int JAVA_STRING_CHECK_UTF8_FIELD_NUMBER = 27;
    public static final int OBJC_CLASS_PREFIX_FIELD_NUMBER = 36;
    public static final int OPTIMIZE_FOR_FIELD_NUMBER = 9;
    private static volatile E<DescriptorProtos$FileOptions> PARSER = null;
    public static final int PHP_CLASS_PREFIX_FIELD_NUMBER = 40;
    public static final int PHP_METADATA_NAMESPACE_FIELD_NUMBER = 44;
    public static final int PHP_NAMESPACE_FIELD_NUMBER = 41;
    public static final int PY_GENERIC_SERVICES_FIELD_NUMBER = 18;
    public static final int RUBY_PACKAGE_FIELD_NUMBER = 45;
    public static final int SWIFT_PREFIX_FIELD_NUMBER = 39;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean ccGenericServices_;
    private boolean deprecated_;
    private DescriptorProtos$FeatureSet features_;
    private boolean javaGenerateEqualsAndHash_;
    private boolean javaGenericServices_;
    private boolean javaMultipleFiles_;
    private boolean javaStringCheckUtf8_;
    private boolean pyGenericServices_;
    private byte memoizedIsInitialized = 2;
    private String javaPackage_ = "";
    private String javaOuterClassname_ = "";
    private int optimizeFor_ = 1;
    private String goPackage_ = "";
    private boolean ccEnableArenas_ = true;
    private String objcClassPrefix_ = "";
    private String csharpNamespace_ = "";
    private String swiftPrefix_ = "";
    private String phpClassPrefix_ = "";
    private String phpNamespace_ = "";
    private String phpMetadataNamespace_ = "";
    private String rubyPackage_ = "";
    private Internal.e<DescriptorProtos$UninterpretedOption> uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<DescriptorProtos$FileOptions, Builder> implements DescriptorProtos$FileOptionsOrBuilder {
        /* synthetic */ Builder(C5954e c5954e) {
            this();
        }

        public Builder addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addAllUninterpretedOption(iterable);
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(descriptorProtos$UninterpretedOption);
            return this;
        }

        public Builder clearCcEnableArenas() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearCcEnableArenas();
            return this;
        }

        public Builder clearCcGenericServices() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearCcGenericServices();
            return this;
        }

        public Builder clearCsharpNamespace() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearCsharpNamespace();
            return this;
        }

        public Builder clearDeprecated() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearDeprecated();
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearFeatures();
            return this;
        }

        public Builder clearGoPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearGoPackage();
            return this;
        }

        @Deprecated
        public Builder clearJavaGenerateEqualsAndHash() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaGenerateEqualsAndHash();
            return this;
        }

        public Builder clearJavaGenericServices() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaGenericServices();
            return this;
        }

        public Builder clearJavaMultipleFiles() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaMultipleFiles();
            return this;
        }

        public Builder clearJavaOuterClassname() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaOuterClassname();
            return this;
        }

        public Builder clearJavaPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaPackage();
            return this;
        }

        public Builder clearJavaStringCheckUtf8() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearJavaStringCheckUtf8();
            return this;
        }

        public Builder clearObjcClassPrefix() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearObjcClassPrefix();
            return this;
        }

        public Builder clearOptimizeFor() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearOptimizeFor();
            return this;
        }

        public Builder clearPhpClassPrefix() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPhpClassPrefix();
            return this;
        }

        public Builder clearPhpMetadataNamespace() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPhpMetadataNamespace();
            return this;
        }

        public Builder clearPhpNamespace() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPhpNamespace();
            return this;
        }

        public Builder clearPyGenericServices() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearPyGenericServices();
            return this;
        }

        public Builder clearRubyPackage() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearRubyPackage();
            return this;
        }

        public Builder clearSwiftPrefix() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearSwiftPrefix();
            return this;
        }

        public Builder clearUninterpretedOption() {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).clearUninterpretedOption();
            return this;
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getCcEnableArenas() {
            return ((DescriptorProtos$FileOptions) this.instance).getCcEnableArenas();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getCcGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).getCcGenericServices();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getCsharpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).getCsharpNamespace();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getCsharpNamespaceBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getCsharpNamespaceBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getDeprecated() {
            return ((DescriptorProtos$FileOptions) this.instance).getDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public DescriptorProtos$FeatureSet getFeatures() {
            return ((DescriptorProtos$FileOptions) this.instance).getFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getGoPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).getGoPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getGoPackageBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getGoPackageBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        @Deprecated
        public boolean getJavaGenerateEqualsAndHash() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaGenerateEqualsAndHash();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaGenericServices();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaMultipleFiles() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaMultipleFiles();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getJavaOuterClassname() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaOuterClassname();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getJavaOuterClassnameBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaOuterClassnameBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getJavaPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getJavaPackageBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaPackageBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getJavaStringCheckUtf8() {
            return ((DescriptorProtos$FileOptions) this.instance).getJavaStringCheckUtf8();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getObjcClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).getObjcClassPrefix();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getObjcClassPrefixBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getObjcClassPrefixBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public OptimizeMode getOptimizeFor() {
            return ((DescriptorProtos$FileOptions) this.instance).getOptimizeFor();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpClassPrefix();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getPhpClassPrefixBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpClassPrefixBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpMetadataNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpMetadataNamespace();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getPhpMetadataNamespaceBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpMetadataNamespaceBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getPhpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpNamespace();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getPhpNamespaceBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getPhpNamespaceBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean getPyGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).getPyGenericServices();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getRubyPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).getRubyPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getRubyPackageBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getRubyPackageBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public String getSwiftPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).getSwiftPrefix();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public ByteString getSwiftPrefixBytes() {
            return ((DescriptorProtos$FileOptions) this.instance).getSwiftPrefixBytes();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
            return ((DescriptorProtos$FileOptions) this.instance).getUninterpretedOption(i11);
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public int getUninterpretedOptionCount() {
            return ((DescriptorProtos$FileOptions) this.instance).getUninterpretedOptionCount();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
            return Collections.unmodifiableList(((DescriptorProtos$FileOptions) this.instance).getUninterpretedOptionList());
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCcEnableArenas() {
            return ((DescriptorProtos$FileOptions) this.instance).hasCcEnableArenas();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCcGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).hasCcGenericServices();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasCsharpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).hasCsharpNamespace();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasDeprecated() {
            return ((DescriptorProtos$FileOptions) this.instance).hasDeprecated();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasFeatures() {
            return ((DescriptorProtos$FileOptions) this.instance).hasFeatures();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasGoPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).hasGoPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        @Deprecated
        public boolean hasJavaGenerateEqualsAndHash() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaGenerateEqualsAndHash();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaGenericServices();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaMultipleFiles() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaMultipleFiles();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaOuterClassname() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaOuterClassname();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasJavaStringCheckUtf8() {
            return ((DescriptorProtos$FileOptions) this.instance).hasJavaStringCheckUtf8();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasObjcClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).hasObjcClassPrefix();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasOptimizeFor() {
            return ((DescriptorProtos$FileOptions) this.instance).hasOptimizeFor();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpClassPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPhpClassPrefix();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpMetadataNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPhpMetadataNamespace();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPhpNamespace() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPhpNamespace();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasPyGenericServices() {
            return ((DescriptorProtos$FileOptions) this.instance).hasPyGenericServices();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasRubyPackage() {
            return ((DescriptorProtos$FileOptions) this.instance).hasRubyPackage();
        }

        @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
        public boolean hasSwiftPrefix() {
            return ((DescriptorProtos$FileOptions) this.instance).hasSwiftPrefix();
        }

        public Builder mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).mergeFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder removeUninterpretedOption(int i11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).removeUninterpretedOption(i11);
            return this;
        }

        public Builder setCcEnableArenas(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCcEnableArenas(z11);
            return this;
        }

        public Builder setCcGenericServices(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCcGenericServices(z11);
            return this;
        }

        public Builder setCsharpNamespace(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCsharpNamespace(str);
            return this;
        }

        public Builder setCsharpNamespaceBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setCsharpNamespaceBytes(byteString);
            return this;
        }

        public Builder setDeprecated(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setDeprecated(z11);
            return this;
        }

        public Builder setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setFeatures(descriptorProtos$FeatureSet);
            return this;
        }

        public Builder setGoPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setGoPackage(str);
            return this;
        }

        public Builder setGoPackageBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setGoPackageBytes(byteString);
            return this;
        }

        @Deprecated
        public Builder setJavaGenerateEqualsAndHash(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaGenerateEqualsAndHash(z11);
            return this;
        }

        public Builder setJavaGenericServices(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaGenericServices(z11);
            return this;
        }

        public Builder setJavaMultipleFiles(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaMultipleFiles(z11);
            return this;
        }

        public Builder setJavaOuterClassname(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaOuterClassname(str);
            return this;
        }

        public Builder setJavaOuterClassnameBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaOuterClassnameBytes(byteString);
            return this;
        }

        public Builder setJavaPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaPackage(str);
            return this;
        }

        public Builder setJavaPackageBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaPackageBytes(byteString);
            return this;
        }

        public Builder setJavaStringCheckUtf8(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setJavaStringCheckUtf8(z11);
            return this;
        }

        public Builder setObjcClassPrefix(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setObjcClassPrefix(str);
            return this;
        }

        public Builder setObjcClassPrefixBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setObjcClassPrefixBytes(byteString);
            return this;
        }

        public Builder setOptimizeFor(OptimizeMode optimizeMode) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setOptimizeFor(optimizeMode);
            return this;
        }

        public Builder setPhpClassPrefix(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpClassPrefix(str);
            return this;
        }

        public Builder setPhpClassPrefixBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpClassPrefixBytes(byteString);
            return this;
        }

        public Builder setPhpMetadataNamespace(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpMetadataNamespace(str);
            return this;
        }

        public Builder setPhpMetadataNamespaceBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpMetadataNamespaceBytes(byteString);
            return this;
        }

        public Builder setPhpNamespace(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpNamespace(str);
            return this;
        }

        public Builder setPhpNamespaceBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPhpNamespaceBytes(byteString);
            return this;
        }

        public Builder setPyGenericServices(boolean z11) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setPyGenericServices(z11);
            return this;
        }

        public Builder setRubyPackage(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setRubyPackage(str);
            return this;
        }

        public Builder setRubyPackageBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setRubyPackageBytes(byteString);
            return this;
        }

        public Builder setSwiftPrefix(String str) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setSwiftPrefix(str);
            return this;
        }

        public Builder setSwiftPrefixBytes(ByteString byteString) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setSwiftPrefixBytes(byteString);
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        private Builder() {
            super(DescriptorProtos$FileOptions.DEFAULT_INSTANCE);
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(i11, descriptorProtos$UninterpretedOption);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder setFeatures(DescriptorProtos$FeatureSet.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setFeatures((DescriptorProtos$FeatureSet) builder.build());
            return this;
        }

        public Builder setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).setUninterpretedOption(i11, builder.build());
            return this;
        }

        public Builder addUninterpretedOption(DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(builder.build());
            return this;
        }

        public Builder addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption.Builder builder) {
            copyOnWrite();
            ((DescriptorProtos$FileOptions) this.instance).addUninterpretedOption(i11, builder.build());
            return this;
        }
    }

    public enum OptimizeMode implements Internal.a {
        SPEED(1),
        CODE_SIZE(2),
        LITE_RUNTIME(3);

        public static final int CODE_SIZE_VALUE = 2;
        public static final int LITE_RUNTIME_VALUE = 3;
        public static final int SPEED_VALUE = 1;
        private static final Internal.b<OptimizeMode> internalValueMap = new Internal.b<OptimizeMode>() { // from class: com.google.protobuf.DescriptorProtos.FileOptions.OptimizeMode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.b
            public OptimizeMode findValueByNumber(int i11) {
                return OptimizeMode.forNumber(i11);
            }
        };
        private final int value;

        private static final class OptimizeModeVerifier implements Internal.c {
            static final Internal.c INSTANCE = new OptimizeModeVerifier();

            private OptimizeModeVerifier() {
            }

            @Override // com.google.protobuf.Internal.c
            public boolean isInRange(int i11) {
                return OptimizeMode.forNumber(i11) != null;
            }
        }

        OptimizeMode(int i11) {
            this.value = i11;
        }

        public static OptimizeMode forNumber(int i11) {
            if (i11 == 1) {
                return SPEED;
            }
            if (i11 == 2) {
                return CODE_SIZE;
            }
            if (i11 != 3) {
                return null;
            }
            return LITE_RUNTIME;
        }

        public static Internal.b<OptimizeMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.c internalGetVerifier() {
            return OptimizeModeVerifier.INSTANCE;
        }

        @Override // com.google.protobuf.Internal.a
        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static OptimizeMode valueOf(int i11) {
            return forNumber(i11);
        }
    }

    static {
        DescriptorProtos$FileOptions descriptorProtos$FileOptions = new DescriptorProtos$FileOptions();
        DEFAULT_INSTANCE = descriptorProtos$FileOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileOptions.class, descriptorProtos$FileOptions);
    }

    private DescriptorProtos$FileOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractMessageLite.addAll(iterable, this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcEnableArenas() {
        this.bitField0_ &= -2049;
        this.ccEnableArenas_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCcGenericServices() {
        this.bitField0_ &= -129;
        this.ccGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCsharpNamespace() {
        this.bitField0_ &= -8193;
        this.csharpNamespace_ = getDefaultInstance().getCsharpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -1025;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = null;
        this.bitField0_ &= -524289;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoPackage() {
        this.bitField0_ &= -65;
        this.goPackage_ = getDefaultInstance().getGoPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenerateEqualsAndHash() {
        this.bitField0_ &= -9;
        this.javaGenerateEqualsAndHash_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaGenericServices() {
        this.bitField0_ &= -257;
        this.javaGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaMultipleFiles() {
        this.bitField0_ &= -5;
        this.javaMultipleFiles_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaOuterClassname() {
        this.bitField0_ &= -3;
        this.javaOuterClassname_ = getDefaultInstance().getJavaOuterClassname();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaPackage() {
        this.bitField0_ &= -2;
        this.javaPackage_ = getDefaultInstance().getJavaPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJavaStringCheckUtf8() {
        this.bitField0_ &= -17;
        this.javaStringCheckUtf8_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearObjcClassPrefix() {
        this.bitField0_ &= -4097;
        this.objcClassPrefix_ = getDefaultInstance().getObjcClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptimizeFor() {
        this.bitField0_ &= -33;
        this.optimizeFor_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpClassPrefix() {
        this.bitField0_ &= -32769;
        this.phpClassPrefix_ = getDefaultInstance().getPhpClassPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpMetadataNamespace() {
        this.bitField0_ &= -131073;
        this.phpMetadataNamespace_ = getDefaultInstance().getPhpMetadataNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhpNamespace() {
        this.bitField0_ &= -65537;
        this.phpNamespace_ = getDefaultInstance().getPhpNamespace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPyGenericServices() {
        this.bitField0_ &= -513;
        this.pyGenericServices_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRubyPackage() {
        this.bitField0_ &= -262145;
        this.rubyPackage_ = getDefaultInstance().getRubyPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwiftPrefix() {
        this.bitField0_ &= -16385;
        this.swiftPrefix_ = getDefaultInstance().getSwiftPrefix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        Internal.e<DescriptorProtos$UninterpretedOption> eVar = this.uninterpretedOption_;
        if (eVar.isModifiable()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(eVar);
    }

    public static DescriptorProtos$FileOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet2 = this.features_;
        if (descriptorProtos$FeatureSet2 == null || descriptorProtos$FeatureSet2 == DescriptorProtos$FeatureSet.getDefaultInstance()) {
            this.features_ = descriptorProtos$FeatureSet;
        } else {
            this.features_ = ((DescriptorProtos$FeatureSet.Builder) DescriptorProtos$FeatureSet.newBuilder(this.features_).mergeFrom((DescriptorProtos$FeatureSet.Builder) descriptorProtos$FeatureSet)).buildPartial();
        }
        this.bitField0_ |= 524288;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<DescriptorProtos$FileOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i11) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcEnableArenas(boolean z11) {
        this.bitField0_ |= 2048;
        this.ccEnableArenas_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCcGenericServices(boolean z11) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_PATTERN;
        this.ccGenericServices_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 8192;
        this.csharpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCsharpNamespaceBytes(ByteString byteString) {
        this.csharpNamespace_ = byteString.toStringUtf8();
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z11) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_ALL;
        this.deprecated_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(DescriptorProtos$FeatureSet descriptorProtos$FeatureSet) {
        descriptorProtos$FeatureSet.getClass();
        this.features_ = descriptorProtos$FeatureSet;
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackage(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.goPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoPackageBytes(ByteString byteString) {
        this.goPackage_ = byteString.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenerateEqualsAndHash(boolean z11) {
        this.bitField0_ |= 8;
        this.javaGenerateEqualsAndHash_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaGenericServices(boolean z11) {
        this.bitField0_ |= 256;
        this.javaGenericServices_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaMultipleFiles(boolean z11) {
        this.bitField0_ |= 4;
        this.javaMultipleFiles_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassname(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.javaOuterClassname_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaOuterClassnameBytes(ByteString byteString) {
        this.javaOuterClassname_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.javaPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaPackageBytes(ByteString byteString) {
        this.javaPackage_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJavaStringCheckUtf8(boolean z11) {
        this.bitField0_ |= 16;
        this.javaStringCheckUtf8_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.objcClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setObjcClassPrefixBytes(ByteString byteString) {
        this.objcClassPrefix_ = byteString.toStringUtf8();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptimizeFor(OptimizeMode optimizeMode) {
        this.optimizeFor_ = optimizeMode.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.phpClassPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpClassPrefixBytes(ByteString byteString) {
        this.phpClassPrefix_ = byteString.toStringUtf8();
        this.bitField0_ |= 32768;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 131072;
        this.phpMetadataNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpMetadataNamespaceBytes(ByteString byteString) {
        this.phpMetadataNamespace_ = byteString.toStringUtf8();
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespace(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.phpNamespace_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhpNamespaceBytes(ByteString byteString) {
        this.phpNamespace_ = byteString.toStringUtf8();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPyGenericServices(boolean z11) {
        this.bitField0_ |= UserVerificationMethods.USER_VERIFY_NONE;
        this.pyGenericServices_ = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackage(String str) {
        str.getClass();
        this.bitField0_ |= 262144;
        this.rubyPackage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRubyPackageBytes(ByteString byteString) {
        this.rubyPackage_ = byteString.toStringUtf8();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefix(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.swiftPrefix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwiftPrefixBytes(ByteString byteString) {
        this.swiftPrefix_ = byteString.toStringUtf8();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i11, descriptorProtos$UninterpretedOption);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        C5954e c5954e = null;
        switch (C5954e.f60203a[bVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileOptions();
            case 2:
                return new Builder(c5954e);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0015\u0000\u0001\u0001ϧ\u0015\u0000\u0001\u0002\u0001ဈ\u0000\bဈ\u0001\t᠌\u0005\nဇ\u0002\u000bဈ\u0006\u0010ဇ\u0007\u0011ဇ\b\u0012ဇ\t\u0014ဇ\u0003\u0017ဇ\n\u001bဇ\u0004\u001fဇ\u000b$ဈ\f%ဈ\r'ဈ\u000e(ဈ\u000f)ဈ\u0010,ဈ\u0011-ဈ\u00122ᐉ\u0013ϧЛ", new Object[]{"bitField0_", "javaPackage_", "javaOuterClassname_", "optimizeFor_", OptimizeMode.internalGetVerifier(), "javaMultipleFiles_", "goPackage_", "ccGenericServices_", "javaGenericServices_", "pyGenericServices_", "javaGenerateEqualsAndHash_", "deprecated_", "javaStringCheckUtf8_", "ccEnableArenas_", "objcClassPrefix_", "csharpNamespace_", "swiftPrefix_", "phpClassPrefix_", "phpNamespace_", "phpMetadataNamespace_", "rubyPackage_", "features_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<DescriptorProtos$FileOptions> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (DescriptorProtos$FileOptions.class) {
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

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getCcEnableArenas() {
        return this.ccEnableArenas_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getCcGenericServices() {
        return this.ccGenericServices_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getCsharpNamespace() {
        return this.csharpNamespace_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getCsharpNamespaceBytes() {
        return ByteString.copyFromUtf8(this.csharpNamespace_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getDeprecated() {
        return this.deprecated_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public DescriptorProtos$FeatureSet getFeatures() {
        DescriptorProtos$FeatureSet descriptorProtos$FeatureSet = this.features_;
        return descriptorProtos$FeatureSet == null ? DescriptorProtos$FeatureSet.getDefaultInstance() : descriptorProtos$FeatureSet;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getGoPackage() {
        return this.goPackage_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getGoPackageBytes() {
        return ByteString.copyFromUtf8(this.goPackage_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    @Deprecated
    public boolean getJavaGenerateEqualsAndHash() {
        return this.javaGenerateEqualsAndHash_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getJavaGenericServices() {
        return this.javaGenericServices_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getJavaMultipleFiles() {
        return this.javaMultipleFiles_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getJavaOuterClassname() {
        return this.javaOuterClassname_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getJavaOuterClassnameBytes() {
        return ByteString.copyFromUtf8(this.javaOuterClassname_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getJavaPackage() {
        return this.javaPackage_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getJavaPackageBytes() {
        return ByteString.copyFromUtf8(this.javaPackage_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getJavaStringCheckUtf8() {
        return this.javaStringCheckUtf8_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getObjcClassPrefix() {
        return this.objcClassPrefix_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getObjcClassPrefixBytes() {
        return ByteString.copyFromUtf8(this.objcClassPrefix_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public OptimizeMode getOptimizeFor() {
        OptimizeMode forNumber = OptimizeMode.forNumber(this.optimizeFor_);
        return forNumber == null ? OptimizeMode.SPEED : forNumber;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getPhpClassPrefix() {
        return this.phpClassPrefix_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getPhpClassPrefixBytes() {
        return ByteString.copyFromUtf8(this.phpClassPrefix_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getPhpMetadataNamespace() {
        return this.phpMetadataNamespace_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getPhpMetadataNamespaceBytes() {
        return ByteString.copyFromUtf8(this.phpMetadataNamespace_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getPhpNamespace() {
        return this.phpNamespace_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getPhpNamespaceBytes() {
        return ByteString.copyFromUtf8(this.phpNamespace_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean getPyGenericServices() {
        return this.pyGenericServices_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getRubyPackage() {
        return this.rubyPackage_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getRubyPackageBytes() {
        return ByteString.copyFromUtf8(this.rubyPackage_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public String getSwiftPrefix() {
        return this.swiftPrefix_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public ByteString getSwiftPrefixBytes() {
        return ByteString.copyFromUtf8(this.swiftPrefix_);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public DescriptorProtos$UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(int i11) {
        return this.uninterpretedOption_.get(i11);
    }

    public List<? extends DescriptorProtos$UninterpretedOptionOrBuilder> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasCcEnableArenas() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasCcGenericServices() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasCsharpNamespace() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasDeprecated() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_ALL) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasFeatures() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasGoPackage() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    @Deprecated
    public boolean hasJavaGenerateEqualsAndHash() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaGenericServices() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaMultipleFiles() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaOuterClassname() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaPackage() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasJavaStringCheckUtf8() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasObjcClassPrefix() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasOptimizeFor() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPhpClassPrefix() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPhpMetadataNamespace() {
        return (this.bitField0_ & 131072) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPhpNamespace() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasPyGenericServices() {
        return (this.bitField0_ & UserVerificationMethods.USER_VERIFY_NONE) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasRubyPackage() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // com.google.protobuf.DescriptorProtos$FileOptionsOrBuilder
    public boolean hasSwiftPrefix() {
        return (this.bitField0_ & 16384) != 0;
    }

    public static Builder newBuilder(DescriptorProtos$FileOptions descriptorProtos$FileOptions) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileOptions);
    }

    public static DescriptorProtos$FileOptions parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i11, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i11, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FileOptions parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileOptions parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static DescriptorProtos$FileOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$FileOptions parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (DescriptorProtos$FileOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}

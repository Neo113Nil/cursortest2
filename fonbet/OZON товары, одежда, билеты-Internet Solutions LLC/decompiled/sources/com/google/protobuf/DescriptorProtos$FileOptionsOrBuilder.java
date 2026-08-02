package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;

/* loaded from: classes9.dex */
public interface DescriptorProtos$FileOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<DescriptorProtos$FileOptions, DescriptorProtos$FileOptions.Builder> {
    boolean getCcEnableArenas();

    boolean getCcGenericServices();

    String getCsharpNamespace();

    ByteString getCsharpNamespaceBytes();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    boolean getDeprecated();

    DescriptorProtos$FeatureSet getFeatures();

    String getGoPackage();

    ByteString getGoPackageBytes();

    @Deprecated
    boolean getJavaGenerateEqualsAndHash();

    boolean getJavaGenericServices();

    boolean getJavaMultipleFiles();

    String getJavaOuterClassname();

    ByteString getJavaOuterClassnameBytes();

    String getJavaPackage();

    ByteString getJavaPackageBytes();

    boolean getJavaStringCheckUtf8();

    String getObjcClassPrefix();

    ByteString getObjcClassPrefixBytes();

    DescriptorProtos$FileOptions.OptimizeMode getOptimizeFor();

    String getPhpClassPrefix();

    ByteString getPhpClassPrefixBytes();

    String getPhpMetadataNamespace();

    ByteString getPhpMetadataNamespaceBytes();

    String getPhpNamespace();

    ByteString getPhpNamespaceBytes();

    boolean getPyGenericServices();

    String getRubyPackage();

    ByteString getRubyPackageBytes();

    String getSwiftPrefix();

    ByteString getSwiftPrefixBytes();

    DescriptorProtos$UninterpretedOption getUninterpretedOption(int i11);

    int getUninterpretedOptionCount();

    List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList();

    boolean hasCcEnableArenas();

    boolean hasCcGenericServices();

    boolean hasCsharpNamespace();

    boolean hasDeprecated();

    boolean hasFeatures();

    boolean hasGoPackage();

    @Deprecated
    boolean hasJavaGenerateEqualsAndHash();

    boolean hasJavaGenericServices();

    boolean hasJavaMultipleFiles();

    boolean hasJavaOuterClassname();

    boolean hasJavaPackage();

    boolean hasJavaStringCheckUtf8();

    boolean hasObjcClassPrefix();

    boolean hasOptimizeFor();

    boolean hasPhpClassPrefix();

    boolean hasPhpMetadataNamespace();

    boolean hasPhpNamespace();

    boolean hasPyGenericServices();

    boolean hasRubyPackage();

    boolean hasSwiftPrefix();

    @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder, com.google.protobuf.A
    /* synthetic */ boolean isInitialized();
}

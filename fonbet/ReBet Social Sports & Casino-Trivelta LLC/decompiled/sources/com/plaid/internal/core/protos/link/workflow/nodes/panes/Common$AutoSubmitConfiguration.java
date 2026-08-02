package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class Common$AutoSubmitConfiguration extends GeneratedMessageLite<Common$AutoSubmitConfiguration, c> implements MessageLiteOrBuilder {
    public static final int AUTO_SUBMIT_BEHAVIOR_FIELD_NUMBER = 1;
    private static final Common$AutoSubmitConfiguration DEFAULT_INSTANCE;
    private static volatile Parser<Common$AutoSubmitConfiguration> PARSER = null;
    public static final int TEXT_VALIDATION_FIELD_NUMBER = 2;
    private static final Internal.ListAdapter.Converter<Integer, b> autoSubmitBehavior_converter_ = new a();
    private int autoSubmitBehaviorMemoizedSerializedSize;
    private Internal.IntList autoSubmitBehavior_ = GeneratedMessageLite.emptyIntList();
    private int bitField0_;
    private Common$TextInputValidation textValidation_;

    public class a implements Internal.ListAdapter.Converter<Integer, b> {
        @Override // com.google.protobuf.Internal.ListAdapter.Converter
        public final b convert(Integer num) {
            b forNumber = b.forNumber(num.intValue());
            return forNumber == null ? b.UNRECOGNIZED : forNumber;
        }
    }

    public enum b implements Internal.EnumLite {
        FORM_AUTO_SUBMIT_BEHAVIOR_UNKNOWN(0),
        FORM_AUTO_SUBMIT_BEHAVIOR_ON_PASTE(1),
        FORM_AUTO_SUBMIT_BEHAVIOR_ON_TYPE(2),
        UNRECOGNIZED(-1);

        public static final int FORM_AUTO_SUBMIT_BEHAVIOR_ON_PASTE_VALUE = 1;
        public static final int FORM_AUTO_SUBMIT_BEHAVIOR_ON_TYPE_VALUE = 2;
        public static final int FORM_AUTO_SUBMIT_BEHAVIOR_UNKNOWN_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40049b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40051a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration$b$b, reason: collision with other inner class name */
        public static final class C0563b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final C0563b f40052a = new C0563b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return b.forNumber(i10) != null;
            }
        }

        b(int i10) {
            this.f40051a = i10;
        }

        public static b forNumber(int i10) {
            if (i10 == 0) {
                return FORM_AUTO_SUBMIT_BEHAVIOR_UNKNOWN;
            }
            if (i10 == 1) {
                return FORM_AUTO_SUBMIT_BEHAVIOR_ON_PASTE;
            }
            if (i10 != 2) {
                return null;
            }
            return FORM_AUTO_SUBMIT_BEHAVIOR_ON_TYPE;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f40049b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0563b.f40052a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40051a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }
    }

    public static final class c extends GeneratedMessageLite.Builder<Common$AutoSubmitConfiguration, c> implements MessageLiteOrBuilder {
        public c() {
            super(Common$AutoSubmitConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$AutoSubmitConfiguration common$AutoSubmitConfiguration = new Common$AutoSubmitConfiguration();
        DEFAULT_INSTANCE = common$AutoSubmitConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Common$AutoSubmitConfiguration.class, common$AutoSubmitConfiguration);
    }

    private Common$AutoSubmitConfiguration() {
    }

    private void addAllAutoSubmitBehavior(Iterable<? extends b> iterable) {
        ensureAutoSubmitBehaviorIsMutable();
        Iterator<? extends b> it = iterable.iterator();
        while (it.hasNext()) {
            this.autoSubmitBehavior_.addInt(it.next().getNumber());
        }
    }

    private void addAllAutoSubmitBehaviorValue(Iterable<Integer> iterable) {
        ensureAutoSubmitBehaviorIsMutable();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            this.autoSubmitBehavior_.addInt(it.next().intValue());
        }
    }

    private void addAutoSubmitBehavior(b bVar) {
        bVar.getClass();
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.addInt(bVar.getNumber());
    }

    private void addAutoSubmitBehaviorValue(int i10) {
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.addInt(i10);
    }

    private void clearAutoSubmitBehavior() {
        this.autoSubmitBehavior_ = GeneratedMessageLite.emptyIntList();
    }

    private void clearTextValidation() {
        this.textValidation_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAutoSubmitBehaviorIsMutable() {
        Internal.IntList intList = this.autoSubmitBehavior_;
        if (intList.isModifiable()) {
            return;
        }
        this.autoSubmitBehavior_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static Common$AutoSubmitConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTextValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        Common$TextInputValidation common$TextInputValidation2 = this.textValidation_;
        if (common$TextInputValidation2 == null || common$TextInputValidation2 == Common$TextInputValidation.getDefaultInstance()) {
            this.textValidation_ = common$TextInputValidation;
        } else {
            this.textValidation_ = Common$TextInputValidation.newBuilder(this.textValidation_).mergeFrom((Common$TextInputValidation.a) common$TextInputValidation).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AutoSubmitConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AutoSubmitConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$AutoSubmitConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutoSubmitBehavior(int i10, b bVar) {
        bVar.getClass();
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.setInt(i10, bVar.getNumber());
    }

    private void setAutoSubmitBehaviorValue(int i10, int i11) {
        ensureAutoSubmitBehaviorIsMutable();
        this.autoSubmitBehavior_.setInt(i10, i11);
    }

    private void setTextValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        this.textValidation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$AutoSubmitConfiguration();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002ဉ\u0000", new Object[]{"bitField0_", "autoSubmitBehavior_", "textValidation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AutoSubmitConfiguration> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$AutoSubmitConfiguration.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public b getAutoSubmitBehavior(int i10) {
        b forNumber = b.forNumber(this.autoSubmitBehavior_.getInt(i10));
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getAutoSubmitBehaviorCount() {
        return this.autoSubmitBehavior_.size();
    }

    public List<b> getAutoSubmitBehaviorList() {
        return new Internal.ListAdapter(this.autoSubmitBehavior_, autoSubmitBehavior_converter_);
    }

    public int getAutoSubmitBehaviorValue(int i10) {
        return this.autoSubmitBehavior_.getInt(i10);
    }

    public List<Integer> getAutoSubmitBehaviorValueList() {
        return this.autoSubmitBehavior_;
    }

    public Common$TextInputValidation getTextValidation() {
        Common$TextInputValidation common$TextInputValidation = this.textValidation_;
        return common$TextInputValidation == null ? Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public boolean hasTextValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(common$AutoSubmitConfiguration);
    }

    public static Common$AutoSubmitConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AutoSubmitConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$AutoSubmitConfiguration parseFrom(ByteString byteString) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$AutoSubmitConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AutoSubmitConfiguration parseFrom(byte[] bArr) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AutoSubmitConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$AutoSubmitConfiguration parseFrom(InputStream inputStream) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AutoSubmitConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AutoSubmitConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AutoSubmitConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AutoSubmitConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}

package org.chromium.net.httpflags;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class BaseFeatureOverrides extends GeneratedMessageLite<BaseFeatureOverrides, Builder> implements BaseFeatureOverridesOrBuilder {
    private static final BaseFeatureOverrides DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile Parser<BaseFeatureOverrides> PARSER;
    private MapFieldLite<String, FeatureState> featureStates_ = MapFieldLite.emptyMapField();

    public interface FeatureStateOrBuilder extends MessageLiteOrBuilder {
        boolean containsParams(String key);

        boolean getEnabled();

        @Deprecated
        Map<String, ByteString> getParams();

        int getParamsCount();

        Map<String, ByteString> getParamsMap();

        ByteString getParamsOrDefault(String key, ByteString defaultValue);

        ByteString getParamsOrThrow(String key);

        boolean hasEnabled();
    }

    private BaseFeatureOverrides() {
    }

    public static final class FeatureState extends GeneratedMessageLite<FeatureState, Builder> implements FeatureStateOrBuilder {
        private static final FeatureState DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile Parser<FeatureState> PARSER;
        private int bitField0_;
        private boolean enabled_;
        private MapFieldLite<String, ByteString> params_ = MapFieldLite.emptyMapField();

        private FeatureState() {
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean value) {
            this.bitField0_ |= 1;
            this.enabled_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.bitField0_ &= -2;
            this.enabled_ = false;
        }

        private static final class ParamsDefaultEntryHolder {
            static final MapEntryLite<String, ByteString> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.BYTES, ByteString.EMPTY);

            private ParamsDefaultEntryHolder() {
            }
        }

        private MapFieldLite<String, ByteString> internalGetParams() {
            return this.params_;
        }

        private MapFieldLite<String, ByteString> internalGetMutableParams() {
            if (!this.params_.isMutable()) {
                this.params_ = this.params_.mutableCopy();
            }
            return this.params_;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public int getParamsCount() {
            return internalGetParams().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean containsParams(String key) {
            key.getClass();
            return internalGetParams().containsKey(key);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        @Deprecated
        public Map<String, ByteString> getParams() {
            return getParamsMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public Map<String, ByteString> getParamsMap() {
            return Collections.unmodifiableMap(internalGetParams());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public ByteString getParamsOrDefault(String key, ByteString defaultValue) {
            key.getClass();
            MapFieldLite<String, ByteString> internalGetParams = internalGetParams();
            return internalGetParams.containsKey(key) ? internalGetParams.get(key) : defaultValue;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public ByteString getParamsOrThrow(String key) {
            key.getClass();
            MapFieldLite<String, ByteString> internalGetParams = internalGetParams();
            if (!internalGetParams.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return internalGetParams.get(key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, ByteString> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        public static FeatureState parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureState parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureState parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureState parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureState parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FeatureState parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FeatureState parseFrom(InputStream input) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureState parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FeatureState parseDelimitedFrom(InputStream input) throws IOException {
            return (FeatureState) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureState parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FeatureState) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FeatureState parseFrom(CodedInputStream input) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FeatureState parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FeatureState prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureState, Builder> implements FeatureStateOrBuilder {
            private Builder() {
                super(FeatureState.DEFAULT_INSTANCE);
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean hasEnabled() {
                return ((FeatureState) this.instance).hasEnabled();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean getEnabled() {
                return ((FeatureState) this.instance).getEnabled();
            }

            public Builder setEnabled(boolean value) {
                copyOnWrite();
                ((FeatureState) this.instance).setEnabled(value);
                return this;
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((FeatureState) this.instance).clearEnabled();
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public int getParamsCount() {
                return ((FeatureState) this.instance).getParamsMap().size();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean containsParams(String key) {
                key.getClass();
                return ((FeatureState) this.instance).getParamsMap().containsKey(key);
            }

            public Builder clearParams() {
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().clear();
                return this;
            }

            public Builder removeParams(String key) {
                key.getClass();
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().remove(key);
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            @Deprecated
            public Map<String, ByteString> getParams() {
                return getParamsMap();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public Map<String, ByteString> getParamsMap() {
                return Collections.unmodifiableMap(((FeatureState) this.instance).getParamsMap());
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public ByteString getParamsOrDefault(String key, ByteString defaultValue) {
                key.getClass();
                Map<String, ByteString> paramsMap = ((FeatureState) this.instance).getParamsMap();
                return paramsMap.containsKey(key) ? paramsMap.get(key) : defaultValue;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public ByteString getParamsOrThrow(String key) {
                key.getClass();
                Map<String, ByteString> paramsMap = ((FeatureState) this.instance).getParamsMap();
                if (!paramsMap.containsKey(key)) {
                    throw new IllegalArgumentException();
                }
                return paramsMap.get(key);
            }

            public Builder putParams(String key, ByteString value) {
                key.getClass();
                value.getClass();
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().put(key, value);
                return this;
            }

            public Builder putAllParams(Map<String, ByteString> values) {
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().putAll(values);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            Parser parser;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new FeatureState();
                case 2:
                    return new Builder();
                case 3:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", ParamsDefaultEntryHolder.defaultEntry});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FeatureState> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (FeatureState.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
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

        static {
            FeatureState featureState = new FeatureState();
            DEFAULT_INSTANCE = featureState;
            GeneratedMessageLite.registerDefaultInstance(FeatureState.class, featureState);
        }

        public static FeatureState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FeatureState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: org.chromium.net.httpflags.BaseFeatureOverrides$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static final class FeatureStatesDefaultEntryHolder {
        static final MapEntryLite<String, FeatureState> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, FeatureState.getDefaultInstance());

        private FeatureStatesDefaultEntryHolder() {
        }
    }

    private MapFieldLite<String, FeatureState> internalGetFeatureStates() {
        return this.featureStates_;
    }

    private MapFieldLite<String, FeatureState> internalGetMutableFeatureStates() {
        if (!this.featureStates_.isMutable()) {
            this.featureStates_ = this.featureStates_.mutableCopy();
        }
        return this.featureStates_;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public int getFeatureStatesCount() {
        return internalGetFeatureStates().size();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public boolean containsFeatureStates(String key) {
        key.getClass();
        return internalGetFeatureStates().containsKey(key);
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    @Deprecated
    public Map<String, FeatureState> getFeatureStates() {
        return getFeatureStatesMap();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public Map<String, FeatureState> getFeatureStatesMap() {
        return Collections.unmodifiableMap(internalGetFeatureStates());
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrDefault(String key, FeatureState defaultValue) {
        key.getClass();
        MapFieldLite<String, FeatureState> internalGetFeatureStates = internalGetFeatureStates();
        return internalGetFeatureStates.containsKey(key) ? internalGetFeatureStates.get(key) : defaultValue;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrThrow(String key) {
        key.getClass();
        MapFieldLite<String, FeatureState> internalGetFeatureStates = internalGetFeatureStates();
        if (!internalGetFeatureStates.containsKey(key)) {
            throw new IllegalArgumentException();
        }
        return internalGetFeatureStates.get(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FeatureState> getMutableFeatureStatesMap() {
        return internalGetMutableFeatureStates();
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BaseFeatureOverrides parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BaseFeatureOverrides parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BaseFeatureOverrides parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static BaseFeatureOverrides parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static BaseFeatureOverrides parseFrom(InputStream input) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BaseFeatureOverrides parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream input) throws IOException {
        return (BaseFeatureOverrides) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BaseFeatureOverrides) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static BaseFeatureOverrides parseFrom(CodedInputStream input) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static BaseFeatureOverrides parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(BaseFeatureOverrides prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<BaseFeatureOverrides, Builder> implements BaseFeatureOverridesOrBuilder {
        private Builder() {
            super(BaseFeatureOverrides.DEFAULT_INSTANCE);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public int getFeatureStatesCount() {
            return ((BaseFeatureOverrides) this.instance).getFeatureStatesMap().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public boolean containsFeatureStates(String key) {
            key.getClass();
            return ((BaseFeatureOverrides) this.instance).getFeatureStatesMap().containsKey(key);
        }

        public Builder clearFeatureStates() {
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().clear();
            return this;
        }

        public Builder removeFeatureStates(String key) {
            key.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().remove(key);
            return this;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        @Deprecated
        public Map<String, FeatureState> getFeatureStates() {
            return getFeatureStatesMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public Map<String, FeatureState> getFeatureStatesMap() {
            return Collections.unmodifiableMap(((BaseFeatureOverrides) this.instance).getFeatureStatesMap());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrDefault(String key, FeatureState defaultValue) {
            key.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            return featureStatesMap.containsKey(key) ? featureStatesMap.get(key) : defaultValue;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrThrow(String key) {
            key.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            if (!featureStatesMap.containsKey(key)) {
                throw new IllegalArgumentException();
            }
            return featureStatesMap.get(key);
        }

        public Builder putFeatureStates(String key, FeatureState value) {
            key.getClass();
            value.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().put(key, value);
            return this;
        }

        public Builder putAllFeatureStates(Map<String, FeatureState> values) {
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().putAll(values);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        Parser parser;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
            case 1:
                return new BaseFeatureOverrides();
            case 2:
                return new Builder();
            case 3:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", FeatureStatesDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BaseFeatureOverrides> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (BaseFeatureOverrides.class) {
                    parser = PARSER;
                    if (parser == null) {
                        parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        PARSER = parser;
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

    static {
        BaseFeatureOverrides baseFeatureOverrides = new BaseFeatureOverrides();
        DEFAULT_INSTANCE = baseFeatureOverrides;
        GeneratedMessageLite.registerDefaultInstance(BaseFeatureOverrides.class, baseFeatureOverrides);
    }

    public static BaseFeatureOverrides getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<BaseFeatureOverrides> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}

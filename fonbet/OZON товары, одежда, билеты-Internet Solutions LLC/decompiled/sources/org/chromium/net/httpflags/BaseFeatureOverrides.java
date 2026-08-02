package org.chromium.net.httpflags;

import com.google.protobuf.A;
import com.google.protobuf.ByteString;
import com.google.protobuf.C5957h;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.E;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat$FieldType;
import com.google.protobuf.u;
import com.google.protobuf.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class BaseFeatureOverrides extends GeneratedMessageLite<BaseFeatureOverrides, Builder> implements BaseFeatureOverridesOrBuilder {
    private static final BaseFeatureOverrides DEFAULT_INSTANCE;
    public static final int FEATURE_STATES_FIELD_NUMBER = 1;
    private static volatile E<BaseFeatureOverrides> PARSER;
    private v<String, FeatureState> featureStates_ = v.e();

    public static final class Builder extends GeneratedMessageLite.Builder<BaseFeatureOverrides, Builder> implements BaseFeatureOverridesOrBuilder {
        /* synthetic */ Builder(int i11) {
            this();
        }

        public Builder clearFeatureStates() {
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().clear();
            return this;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public boolean containsFeatureStates(String str) {
            str.getClass();
            return ((BaseFeatureOverrides) this.instance).getFeatureStatesMap().containsKey(str);
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        @Deprecated
        public Map<String, FeatureState> getFeatureStates() {
            return getFeatureStatesMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public int getFeatureStatesCount() {
            return ((BaseFeatureOverrides) this.instance).getFeatureStatesMap().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public Map<String, FeatureState> getFeatureStatesMap() {
            return Collections.unmodifiableMap(((BaseFeatureOverrides) this.instance).getFeatureStatesMap());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrDefault(String str, FeatureState featureState) {
            str.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            return featureStatesMap.containsKey(str) ? featureStatesMap.get(str) : featureState;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
        public FeatureState getFeatureStatesOrThrow(String str) {
            str.getClass();
            Map<String, FeatureState> featureStatesMap = ((BaseFeatureOverrides) this.instance).getFeatureStatesMap();
            if (featureStatesMap.containsKey(str)) {
                return featureStatesMap.get(str);
            }
            throw new IllegalArgumentException();
        }

        public Builder putAllFeatureStates(Map<String, FeatureState> map) {
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().putAll(map);
            return this;
        }

        public Builder putFeatureStates(String str, FeatureState featureState) {
            str.getClass();
            featureState.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().put(str, featureState);
            return this;
        }

        public Builder removeFeatureStates(String str) {
            str.getClass();
            copyOnWrite();
            ((BaseFeatureOverrides) this.instance).getMutableFeatureStatesMap().remove(str);
            return this;
        }

        private Builder() {
            super(BaseFeatureOverrides.DEFAULT_INSTANCE);
        }
    }

    public static final class FeatureState extends GeneratedMessageLite<FeatureState, Builder> implements FeatureStateOrBuilder {
        private static final FeatureState DEFAULT_INSTANCE;
        public static final int ENABLED_FIELD_NUMBER = 1;
        public static final int PARAMS_FIELD_NUMBER = 2;
        private static volatile E<FeatureState> PARSER;
        private int bitField0_;
        private boolean enabled_;
        private v<String, ByteString> params_ = v.e();

        /* loaded from: classes10.dex */
        public static final class Builder extends GeneratedMessageLite.Builder<FeatureState, Builder> implements FeatureStateOrBuilder {
            /* synthetic */ Builder(int i11) {
                this();
            }

            public Builder clearEnabled() {
                copyOnWrite();
                ((FeatureState) this.instance).clearEnabled();
                return this;
            }

            public Builder clearParams() {
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().clear();
                return this;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean containsParams(String str) {
                str.getClass();
                return ((FeatureState) this.instance).getParamsMap().containsKey(str);
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean getEnabled() {
                return ((FeatureState) this.instance).getEnabled();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            @Deprecated
            public Map<String, ByteString> getParams() {
                return getParamsMap();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public int getParamsCount() {
                return ((FeatureState) this.instance).getParamsMap().size();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public Map<String, ByteString> getParamsMap() {
                return Collections.unmodifiableMap(((FeatureState) this.instance).getParamsMap());
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public ByteString getParamsOrDefault(String str, ByteString byteString) {
                str.getClass();
                Map<String, ByteString> paramsMap = ((FeatureState) this.instance).getParamsMap();
                return paramsMap.containsKey(str) ? paramsMap.get(str) : byteString;
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public ByteString getParamsOrThrow(String str) {
                str.getClass();
                Map<String, ByteString> paramsMap = ((FeatureState) this.instance).getParamsMap();
                if (paramsMap.containsKey(str)) {
                    return paramsMap.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
            public boolean hasEnabled() {
                return ((FeatureState) this.instance).hasEnabled();
            }

            public Builder putAllParams(Map<String, ByteString> map) {
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().putAll(map);
                return this;
            }

            public Builder putParams(String str, ByteString byteString) {
                str.getClass();
                byteString.getClass();
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().put(str, byteString);
                return this;
            }

            public Builder removeParams(String str) {
                str.getClass();
                copyOnWrite();
                ((FeatureState) this.instance).getMutableParamsMap().remove(str);
                return this;
            }

            public Builder setEnabled(boolean z11) {
                copyOnWrite();
                ((FeatureState) this.instance).setEnabled(z11);
                return this;
            }

            private Builder() {
                super(FeatureState.DEFAULT_INSTANCE);
            }
        }

        /* loaded from: classes10.dex */
        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final u<String, ByteString> f78698a = u.d(WireFormat$FieldType.STRING, "", WireFormat$FieldType.BYTES, ByteString.EMPTY);
        }

        static {
            FeatureState featureState = new FeatureState();
            DEFAULT_INSTANCE = featureState;
            GeneratedMessageLite.registerDefaultInstance(FeatureState.class, featureState);
        }

        private FeatureState() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnabled() {
            this.bitField0_ &= -2;
            this.enabled_ = false;
        }

        public static FeatureState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, ByteString> getMutableParamsMap() {
            return internalGetMutableParams();
        }

        private v<String, ByteString> internalGetMutableParams() {
            if (!this.params_.i()) {
                this.params_ = this.params_.m();
            }
            return this.params_;
        }

        private v<String, ByteString> internalGetParams() {
            return this.params_;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static E<FeatureState> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnabled(boolean z11) {
            this.bitField0_ |= 1;
            this.enabled_ = z11;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean containsParams(String str) {
            str.getClass();
            return internalGetParams().containsKey(str);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
            E e11;
            switch (a.f78699a[bVar.ordinal()]) {
                case 1:
                    return new FeatureState();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"bitField0_", "enabled_", "params_", a.f78698a});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    E<FeatureState> e12 = PARSER;
                    if (e12 != null) {
                        return e12;
                    }
                    synchronized (FeatureState.class) {
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
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        @Deprecated
        public Map<String, ByteString> getParams() {
            return getParamsMap();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public int getParamsCount() {
            return internalGetParams().size();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public Map<String, ByteString> getParamsMap() {
            return Collections.unmodifiableMap(internalGetParams());
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public ByteString getParamsOrDefault(String str, ByteString byteString) {
            str.getClass();
            v<String, ByteString> internalGetParams = internalGetParams();
            return internalGetParams.containsKey(str) ? internalGetParams.get(str) : byteString;
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public ByteString getParamsOrThrow(String str) {
            str.getClass();
            v<String, ByteString> internalGetParams = internalGetParams();
            if (internalGetParams.containsKey(str)) {
                return internalGetParams.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // org.chromium.net.httpflags.BaseFeatureOverrides.FeatureStateOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FeatureState featureState) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(featureState);
        }

        public static FeatureState parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static FeatureState parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
        }

        public static FeatureState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static FeatureState parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
        }

        public static FeatureState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureState parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
        }

        public static FeatureState parseFrom(InputStream inputStream) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureState parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
        }

        public static FeatureState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureState parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
            return (FeatureState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
        }
    }

    public interface FeatureStateOrBuilder extends A {
        boolean containsParams(String str);

        /* synthetic */ MessageLite getDefaultInstanceForType();

        boolean getEnabled();

        @Deprecated
        Map<String, ByteString> getParams();

        int getParamsCount();

        Map<String, ByteString> getParamsMap();

        ByteString getParamsOrDefault(String str, ByteString byteString);

        ByteString getParamsOrThrow(String str);

        boolean hasEnabled();

        @Override // com.google.protobuf.A
        /* synthetic */ boolean isInitialized();
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f78699a;

        static {
            int[] iArr = new int[GeneratedMessageLite.b.values().length];
            f78699a = iArr;
            try {
                iArr[GeneratedMessageLite.b.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78699a[GeneratedMessageLite.b.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78699a[GeneratedMessageLite.b.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78699a[GeneratedMessageLite.b.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78699a[GeneratedMessageLite.b.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78699a[GeneratedMessageLite.b.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78699a[GeneratedMessageLite.b.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final u<String, FeatureState> f78700a = u.d(WireFormat$FieldType.STRING, "", WireFormat$FieldType.MESSAGE, FeatureState.getDefaultInstance());
    }

    static {
        BaseFeatureOverrides baseFeatureOverrides = new BaseFeatureOverrides();
        DEFAULT_INSTANCE = baseFeatureOverrides;
        GeneratedMessageLite.registerDefaultInstance(BaseFeatureOverrides.class, baseFeatureOverrides);
    }

    private BaseFeatureOverrides() {
    }

    public static BaseFeatureOverrides getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, FeatureState> getMutableFeatureStatesMap() {
        return internalGetMutableFeatureStates();
    }

    private v<String, FeatureState> internalGetFeatureStates() {
        return this.featureStates_;
    }

    private v<String, FeatureState> internalGetMutableFeatureStates() {
        if (!this.featureStates_.i()) {
            this.featureStates_ = this.featureStates_.m();
        }
        return this.featureStates_;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static E<BaseFeatureOverrides> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public boolean containsFeatureStates(String str) {
        str.getClass();
        return internalGetFeatureStates().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.b bVar, Object obj, Object obj2) {
        E e11;
        switch (a.f78699a[bVar.ordinal()]) {
            case 1:
                return new BaseFeatureOverrides();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"featureStates_", b.f78700a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                E<BaseFeatureOverrides> e12 = PARSER;
                if (e12 != null) {
                    return e12;
                }
                synchronized (BaseFeatureOverrides.class) {
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
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    @Deprecated
    public Map<String, FeatureState> getFeatureStates() {
        return getFeatureStatesMap();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public int getFeatureStatesCount() {
        return internalGetFeatureStates().size();
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public Map<String, FeatureState> getFeatureStatesMap() {
        return Collections.unmodifiableMap(internalGetFeatureStates());
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrDefault(String str, FeatureState featureState) {
        str.getClass();
        v<String, FeatureState> internalGetFeatureStates = internalGetFeatureStates();
        return internalGetFeatureStates.containsKey(str) ? internalGetFeatureStates.get(str) : featureState;
    }

    @Override // org.chromium.net.httpflags.BaseFeatureOverridesOrBuilder
    public FeatureState getFeatureStatesOrThrow(String str) {
        str.getClass();
        v<String, FeatureState> internalGetFeatureStates = internalGetFeatureStates();
        if (internalGetFeatureStates.containsKey(str)) {
            return internalGetFeatureStates.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static Builder newBuilder(BaseFeatureOverrides baseFeatureOverrides) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(baseFeatureOverrides);
    }

    public static BaseFeatureOverrides parseDelimitedFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static BaseFeatureOverrides parseFrom(ByteBuffer byteBuffer, C5957h c5957h) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, c5957h);
    }

    public static BaseFeatureOverrides parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BaseFeatureOverrides parseFrom(ByteString byteString, C5957h c5957h) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, c5957h);
    }

    public static BaseFeatureOverrides parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BaseFeatureOverrides parseFrom(byte[] bArr, C5957h c5957h) throws InvalidProtocolBufferException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, c5957h);
    }

    public static BaseFeatureOverrides parseFrom(InputStream inputStream) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseFeatureOverrides parseFrom(InputStream inputStream, C5957h c5957h) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, c5957h);
    }

    public static BaseFeatureOverrides parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BaseFeatureOverrides parseFrom(CodedInputStream codedInputStream, C5957h c5957h) throws IOException {
        return (BaseFeatureOverrides) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, c5957h);
    }
}

package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Common$Box extends GeneratedMessageLite<Common$Box, d> implements MessageLiteOrBuilder {
    public static final int AS_FIELD_NUMBER = 7;
    public static final int BORDER_BOTTOM_FIELD_NUMBER = 4;
    public static final int BORDER_COLOR_FIELD_NUMBER = 8;
    public static final int BORDER_LEFT_FIELD_NUMBER = 5;
    public static final int BORDER_RIGHT_FIELD_NUMBER = 3;
    public static final int BORDER_TOP_FIELD_NUMBER = 2;
    public static final int COMPONENTS_FIELD_NUMBER = 1;
    private static final Common$Box DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 6;
    public static final int FLEX_DIRECTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_BEHAVIOR_FIELD_NUMBER = 11;
    public static final int JUSTIFY_CONTENT_FIELD_NUMBER = 9;
    private static volatile Parser<Common$Box> PARSER;
    private int as_;
    private int borderBottom_;
    private int borderColor_;
    private int borderLeft_;
    private int borderRight_;
    private int borderTop_;
    private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();
    private int display_;
    private int flexDirection_;
    private int heightBehavior_;
    private int justifyContent_;

    public enum a implements Internal.EnumLite {
        AS_DIV(0),
        AS_SPAN(1),
        UNRECOGNIZED(-1);

        public static final int AS_DIV_VALUE = 0;
        public static final int AS_SPAN_VALUE = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final C0564a f40053b = new C0564a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40055a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$a$a, reason: collision with other inner class name */
        public class C0564a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final a findValueByNumber(int i10) {
                return a.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40056a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return a.forNumber(i10) != null;
            }
        }

        a(int i10) {
            this.f40055a = i10;
        }

        public static a forNumber(int i10) {
            if (i10 == 0) {
                return AS_DIV;
            }
            if (i10 != 1) {
                return null;
            }
            return AS_SPAN;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return f40053b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40056a;
        }

        @Deprecated
        public static a valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40055a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum b implements Internal.EnumLite {
        BORDER_NONE(0),
        BORDER_STANDARD(1),
        UNRECOGNIZED(-1);

        public static final int BORDER_NONE_VALUE = 0;
        public static final int BORDER_STANDARD_VALUE = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40057b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40059a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$b$b, reason: collision with other inner class name */
        public static final class C0565b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final C0565b f40060a = new C0565b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return b.forNumber(i10) != null;
            }
        }

        b(int i10) {
            this.f40059a = i10;
        }

        public static b forNumber(int i10) {
            if (i10 == 0) {
                return BORDER_NONE;
            }
            if (i10 != 1) {
                return null;
            }
            return BORDER_STANDARD;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f40057b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0565b.f40060a;
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40059a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum c implements Internal.EnumLite {
        BORDER_COLOR_CONTRAST_DEFAULT(0),
        BORDER_COLOR_CONTRAST_LOW(1),
        BORDER_COLOR_CONTRAST_HIGH(2),
        BORDER_COLOR_STATE_DEFAULT(3),
        BORDER_COLOR_STATE_ERROR(4),
        BORDER_COLOR_STATE_INFO(5),
        BORDER_COLOR_STATE_SUCCESS(6),
        BORDER_COLOR_STATE_WARNING(7),
        BORDER_COLOR_STATUS_DEFAULT(8),
        BORDER_COLOR_STATUS_ERROR(9),
        BORDER_COLOR_STATUS_INFO(10),
        BORDER_COLOR_STATUS_SUCCESS(11),
        BORDER_COLOR_STATUS_WARNING(12),
        UNRECOGNIZED(-1);

        public static final int BORDER_COLOR_CONTRAST_DEFAULT_VALUE = 0;
        public static final int BORDER_COLOR_CONTRAST_HIGH_VALUE = 2;
        public static final int BORDER_COLOR_CONTRAST_LOW_VALUE = 1;
        public static final int BORDER_COLOR_STATE_DEFAULT_VALUE = 3;
        public static final int BORDER_COLOR_STATE_ERROR_VALUE = 4;
        public static final int BORDER_COLOR_STATE_INFO_VALUE = 5;
        public static final int BORDER_COLOR_STATE_SUCCESS_VALUE = 6;
        public static final int BORDER_COLOR_STATE_WARNING_VALUE = 7;
        public static final int BORDER_COLOR_STATUS_DEFAULT_VALUE = 8;
        public static final int BORDER_COLOR_STATUS_ERROR_VALUE = 9;
        public static final int BORDER_COLOR_STATUS_INFO_VALUE = 10;
        public static final int BORDER_COLOR_STATUS_SUCCESS_VALUE = 11;
        public static final int BORDER_COLOR_STATUS_WARNING_VALUE = 12;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40061b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40063a;

        public class a implements Internal.EnumLiteMap<c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final c findValueByNumber(int i10) {
                return c.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40064a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return c.forNumber(i10) != null;
            }
        }

        c(int i10) {
            this.f40063a = i10;
        }

        public static c forNumber(int i10) {
            switch (i10) {
                case 0:
                    return BORDER_COLOR_CONTRAST_DEFAULT;
                case 1:
                    return BORDER_COLOR_CONTRAST_LOW;
                case 2:
                    return BORDER_COLOR_CONTRAST_HIGH;
                case 3:
                    return BORDER_COLOR_STATE_DEFAULT;
                case 4:
                    return BORDER_COLOR_STATE_ERROR;
                case 5:
                    return BORDER_COLOR_STATE_INFO;
                case 6:
                    return BORDER_COLOR_STATE_SUCCESS;
                case 7:
                    return BORDER_COLOR_STATE_WARNING;
                case 8:
                    return BORDER_COLOR_STATUS_DEFAULT;
                case 9:
                    return BORDER_COLOR_STATUS_ERROR;
                case 10:
                    return BORDER_COLOR_STATUS_INFO;
                case 11:
                    return BORDER_COLOR_STATUS_SUCCESS;
                case 12:
                    return BORDER_COLOR_STATUS_WARNING;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<c> internalGetValueMap() {
            return f40061b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40064a;
        }

        @Deprecated
        public static c valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40063a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class d extends GeneratedMessageLite.Builder<Common$Box, d> implements MessageLiteOrBuilder {
        public d() {
            super(Common$Box.DEFAULT_INSTANCE);
        }
    }

    public enum e implements Internal.EnumLite {
        DISPLAY_INLINE(0),
        DISPLAY_BLOCK(1),
        DISPLAY_INLINE_BLOCK(2),
        DISPLAY_FLEX(3),
        DISPLAY_INLINE_FLEX(4),
        DISPLAY_GRID(5),
        DISPLAY_INLINE_GRID(6),
        UNRECOGNIZED(-1);

        public static final int DISPLAY_BLOCK_VALUE = 1;
        public static final int DISPLAY_FLEX_VALUE = 3;
        public static final int DISPLAY_GRID_VALUE = 5;
        public static final int DISPLAY_INLINE_BLOCK_VALUE = 2;
        public static final int DISPLAY_INLINE_FLEX_VALUE = 4;
        public static final int DISPLAY_INLINE_GRID_VALUE = 6;
        public static final int DISPLAY_INLINE_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40065b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40067a;

        public class a implements Internal.EnumLiteMap<e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final e findValueByNumber(int i10) {
                return e.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40068a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return e.forNumber(i10) != null;
            }
        }

        e(int i10) {
            this.f40067a = i10;
        }

        public static e forNumber(int i10) {
            switch (i10) {
                case 0:
                    return DISPLAY_INLINE;
                case 1:
                    return DISPLAY_BLOCK;
                case 2:
                    return DISPLAY_INLINE_BLOCK;
                case 3:
                    return DISPLAY_FLEX;
                case 4:
                    return DISPLAY_INLINE_FLEX;
                case 5:
                    return DISPLAY_GRID;
                case 6:
                    return DISPLAY_INLINE_GRID;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<e> internalGetValueMap() {
            return f40065b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40068a;
        }

        @Deprecated
        public static e valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40067a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum f implements Internal.EnumLite {
        HEIGHT_BEHAVIOR_DEFAULT(0),
        HEIGHT_BEHAVIOR_100_PERCENT(1),
        UNRECOGNIZED(-1);

        public static final int HEIGHT_BEHAVIOR_100_PERCENT_VALUE = 1;
        public static final int HEIGHT_BEHAVIOR_DEFAULT_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40069b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40071a;

        public class a implements Internal.EnumLiteMap<f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final f findValueByNumber(int i10) {
                return f.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40072a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return f.forNumber(i10) != null;
            }
        }

        f(int i10) {
            this.f40071a = i10;
        }

        public static f forNumber(int i10) {
            if (i10 == 0) {
                return HEIGHT_BEHAVIOR_DEFAULT;
            }
            if (i10 != 1) {
                return null;
            }
            return HEIGHT_BEHAVIOR_100_PERCENT;
        }

        public static Internal.EnumLiteMap<f> internalGetValueMap() {
            return f40069b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40072a;
        }

        @Deprecated
        public static f valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40071a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$Box common$Box = new Common$Box();
        DEFAULT_INSTANCE = common$Box;
        GeneratedMessageLite.registerDefaultInstance(Common$Box.class, common$Box);
    }

    private Common$Box() {
    }

    private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
        ensureComponentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
    }

    private void addComponents(int i10, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.add(i10, common$FlexibleComponent);
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearBorderBottom() {
        this.borderBottom_ = 0;
    }

    private void clearBorderColor() {
        this.borderColor_ = 0;
    }

    private void clearBorderLeft() {
        this.borderLeft_ = 0;
    }

    private void clearBorderRight() {
        this.borderRight_ = 0;
    }

    private void clearBorderTop() {
        this.borderTop_ = 0;
    }

    private void clearComponents() {
        this.components_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisplay() {
        this.display_ = 0;
    }

    private void clearFlexDirection() {
        this.flexDirection_ = 0;
    }

    private void clearHeightBehavior() {
        this.heightBehavior_ = 0;
    }

    private void clearJustifyContent() {
        this.justifyContent_ = 0;
    }

    private void ensureComponentsIsMutable() {
        Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$Box getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Box parseDelimitedFrom(InputStream inputStream) {
        return (Common$Box) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Box parseFrom(ByteString byteString) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Box> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeComponents(int i10) {
        ensureComponentsIsMutable();
        this.components_.remove(i10);
    }

    private void setAs(a aVar) {
        this.as_ = aVar.getNumber();
    }

    private void setAsValue(int i10) {
        this.as_ = i10;
    }

    private void setBorderBottom(b bVar) {
        this.borderBottom_ = bVar.getNumber();
    }

    private void setBorderBottomValue(int i10) {
        this.borderBottom_ = i10;
    }

    private void setBorderColor(c cVar) {
        this.borderColor_ = cVar.getNumber();
    }

    private void setBorderColorValue(int i10) {
        this.borderColor_ = i10;
    }

    private void setBorderLeft(b bVar) {
        this.borderLeft_ = bVar.getNumber();
    }

    private void setBorderLeftValue(int i10) {
        this.borderLeft_ = i10;
    }

    private void setBorderRight(b bVar) {
        this.borderRight_ = bVar.getNumber();
    }

    private void setBorderRightValue(int i10) {
        this.borderRight_ = i10;
    }

    private void setBorderTop(b bVar) {
        this.borderTop_ = bVar.getNumber();
    }

    private void setBorderTopValue(int i10) {
        this.borderTop_ = i10;
    }

    private void setComponents(int i10, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.set(i10, common$FlexibleComponent);
    }

    private void setDisplay(e eVar) {
        this.display_ = eVar.getNumber();
    }

    private void setDisplayValue(int i10) {
        this.display_ = i10;
    }

    private void setFlexDirection(EnumC3598u enumC3598u) {
        this.flexDirection_ = enumC3598u.getNumber();
    }

    private void setFlexDirectionValue(int i10) {
        this.flexDirection_ = i10;
    }

    private void setHeightBehavior(f fVar) {
        this.heightBehavior_ = fVar.getNumber();
    }

    private void setHeightBehaviorValue(int i10) {
        this.heightBehavior_ = i10;
    }

    private void setJustifyContent(EnumC3596s enumC3596s) {
        this.justifyContent_ = enumC3596s.getNumber();
    }

    private void setJustifyContentValue(int i10) {
        this.justifyContent_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Box();
            case 2:
                return new d();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\f\b\f\t\f\n\f\u000b\f", new Object[]{"components_", Common$FlexibleComponent.class, "borderTop_", "borderRight_", "borderBottom_", "borderLeft_", "display_", "as_", "borderColor_", "justifyContent_", "flexDirection_", "heightBehavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Box> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$Box.class) {
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

    public a getAs() {
        a forNumber = a.forNumber(this.as_);
        return forNumber == null ? a.UNRECOGNIZED : forNumber;
    }

    public int getAsValue() {
        return this.as_;
    }

    public b getBorderBottom() {
        b forNumber = b.forNumber(this.borderBottom_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getBorderBottomValue() {
        return this.borderBottom_;
    }

    public c getBorderColor() {
        c forNumber = c.forNumber(this.borderColor_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    public int getBorderColorValue() {
        return this.borderColor_;
    }

    public b getBorderLeft() {
        b forNumber = b.forNumber(this.borderLeft_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getBorderLeftValue() {
        return this.borderLeft_;
    }

    public b getBorderRight() {
        b forNumber = b.forNumber(this.borderRight_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getBorderRightValue() {
        return this.borderRight_;
    }

    public b getBorderTop() {
        b forNumber = b.forNumber(this.borderTop_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getBorderTopValue() {
        return this.borderTop_;
    }

    public Common$FlexibleComponent getComponents(int i10) {
        return this.components_.get(i10);
    }

    public int getComponentsCount() {
        return this.components_.size();
    }

    public List<Common$FlexibleComponent> getComponentsList() {
        return this.components_;
    }

    public InterfaceC3600w getComponentsOrBuilder(int i10) {
        return this.components_.get(i10);
    }

    public List<? extends InterfaceC3600w> getComponentsOrBuilderList() {
        return this.components_;
    }

    public e getDisplay() {
        e forNumber = e.forNumber(this.display_);
        return forNumber == null ? e.UNRECOGNIZED : forNumber;
    }

    public int getDisplayValue() {
        return this.display_;
    }

    public EnumC3598u getFlexDirection() {
        EnumC3598u forNumber = EnumC3598u.forNumber(this.flexDirection_);
        return forNumber == null ? EnumC3598u.UNRECOGNIZED : forNumber;
    }

    public int getFlexDirectionValue() {
        return this.flexDirection_;
    }

    public f getHeightBehavior() {
        f forNumber = f.forNumber(this.heightBehavior_);
        return forNumber == null ? f.UNRECOGNIZED : forNumber;
    }

    public int getHeightBehaviorValue() {
        return this.heightBehavior_;
    }

    public EnumC3596s getJustifyContent() {
        EnumC3596s forNumber = EnumC3596s.forNumber(this.justifyContent_);
        return forNumber == null ? EnumC3596s.UNRECOGNIZED : forNumber;
    }

    public int getJustifyContentValue() {
        return this.justifyContent_;
    }

    private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.add(common$FlexibleComponent);
    }

    public static d newBuilder(Common$Box common$Box) {
        return DEFAULT_INSTANCE.createBuilder(common$Box);
    }

    public static Common$Box parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Box parseFrom(CodedInputStream codedInputStream) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Box parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(InputStream inputStream) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Box parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(ByteBuffer byteBuffer) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Box parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Box parseFrom(byte[] bArr) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Box parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

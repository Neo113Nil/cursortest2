package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Common$TextContent extends GeneratedMessageLite<Common$TextContent, c> implements MessageLiteOrBuilder {
    public static final int ALIGN_FIELD_NUMBER = 5;
    public static final int AS_FIELD_NUMBER = 1;
    public static final int CASING_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 4;
    public static final int CONTRAST_FIELD_NUMBER = 8;
    private static final Common$TextContent DEFAULT_INSTANCE;
    public static final int FONT_FIELD_NUMBER = 6;
    public static final int LINE_HEIGHT_FIELD_NUMBER = 9;
    private static volatile Parser<Common$TextContent> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WEIGHT_FIELD_NUMBER = 3;
    private int align_;
    private int as_;
    private int bitField0_;
    private int casing_;
    private Common$AttributedLocalizedString content_;
    private int contrast_;
    private int font_;
    private int lineHeight_;
    private int size_;
    private int weight_;

    public enum a implements Internal.EnumLite {
        ALIGN_START(0),
        ALIGN_END(1),
        ALIGN_LEFT(2),
        ALIGN_RIGHT(3),
        ALIGN_CENTER(4),
        UNRECOGNIZED(-1);

        public static final int ALIGN_CENTER_VALUE = 4;
        public static final int ALIGN_END_VALUE = 1;
        public static final int ALIGN_LEFT_VALUE = 2;
        public static final int ALIGN_RIGHT_VALUE = 3;
        public static final int ALIGN_START_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final C0575a f40138b = new C0575a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40140a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$a$a, reason: collision with other inner class name */
        public class C0575a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final a findValueByNumber(int i10) {
                return a.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40141a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return a.forNumber(i10) != null;
            }
        }

        a(int i10) {
            this.f40140a = i10;
        }

        public static a forNumber(int i10) {
            if (i10 == 0) {
                return ALIGN_START;
            }
            if (i10 == 1) {
                return ALIGN_END;
            }
            if (i10 == 2) {
                return ALIGN_LEFT;
            }
            if (i10 == 3) {
                return ALIGN_RIGHT;
            }
            if (i10 != 4) {
                return null;
            }
            return ALIGN_CENTER;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return f40138b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40141a;
        }

        @Deprecated
        public static a valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40140a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum b implements Internal.EnumLite {
        AS_CODE(0),
        AS_H1(1),
        AS_H2(2),
        AS_H3(3),
        AS_H4(4),
        AS_H5(5),
        AS_H6(6),
        AS_P(7),
        AS_SMALL(8),
        AS_SPAN(9),
        UNRECOGNIZED(-1);

        public static final int AS_CODE_VALUE = 0;
        public static final int AS_H1_VALUE = 1;
        public static final int AS_H2_VALUE = 2;
        public static final int AS_H3_VALUE = 3;
        public static final int AS_H4_VALUE = 4;
        public static final int AS_H5_VALUE = 5;
        public static final int AS_H6_VALUE = 6;
        public static final int AS_P_VALUE = 7;
        public static final int AS_SMALL_VALUE = 8;
        public static final int AS_SPAN_VALUE = 9;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40142b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40144a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$b$b, reason: collision with other inner class name */
        public static final class C0576b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final C0576b f40145a = new C0576b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return b.forNumber(i10) != null;
            }
        }

        b(int i10) {
            this.f40144a = i10;
        }

        public static b forNumber(int i10) {
            switch (i10) {
                case 0:
                    return AS_CODE;
                case 1:
                    return AS_H1;
                case 2:
                    return AS_H2;
                case 3:
                    return AS_H3;
                case 4:
                    return AS_H4;
                case 5:
                    return AS_H5;
                case 6:
                    return AS_H6;
                case 7:
                    return AS_P;
                case 8:
                    return AS_SMALL;
                case 9:
                    return AS_SPAN;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f40142b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0576b.f40145a;
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40144a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class c extends GeneratedMessageLite.Builder<Common$TextContent, c> implements MessageLiteOrBuilder {
        public c() {
            super(Common$TextContent.DEFAULT_INSTANCE);
        }
    }

    public enum d implements Internal.EnumLite {
        CASING_NONE(0),
        CASING_CAPITALIZE(1),
        CASING_LOWERCASE(2),
        CASING_UPPERCASE(3),
        UNRECOGNIZED(-1);

        public static final int CASING_CAPITALIZE_VALUE = 1;
        public static final int CASING_LOWERCASE_VALUE = 2;
        public static final int CASING_NONE_VALUE = 0;
        public static final int CASING_UPPERCASE_VALUE = 3;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40146b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40148a;

        public class a implements Internal.EnumLiteMap<d> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final d findValueByNumber(int i10) {
                return d.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40149a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return d.forNumber(i10) != null;
            }
        }

        d(int i10) {
            this.f40148a = i10;
        }

        public static d forNumber(int i10) {
            if (i10 == 0) {
                return CASING_NONE;
            }
            if (i10 == 1) {
                return CASING_CAPITALIZE;
            }
            if (i10 == 2) {
                return CASING_LOWERCASE;
            }
            if (i10 != 3) {
                return null;
            }
            return CASING_UPPERCASE;
        }

        public static Internal.EnumLiteMap<d> internalGetValueMap() {
            return f40146b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40149a;
        }

        @Deprecated
        public static d valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40148a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum e implements Internal.EnumLite {
        CONTRAST_DEFAULT(0),
        CONTRAST_LOW(1),
        CONTRAST_HIGH(2),
        CONTRAST_INVERSE_DEFAULT(3),
        CONTRAST_INVERSE_LOW(4),
        CONTRAST_INVERSE_HIGH(5),
        UNRECOGNIZED(-1);

        public static final int CONTRAST_DEFAULT_VALUE = 0;
        public static final int CONTRAST_HIGH_VALUE = 2;
        public static final int CONTRAST_INVERSE_DEFAULT_VALUE = 3;
        public static final int CONTRAST_INVERSE_HIGH_VALUE = 5;
        public static final int CONTRAST_INVERSE_LOW_VALUE = 4;
        public static final int CONTRAST_LOW_VALUE = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40150b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40152a;

        public class a implements Internal.EnumLiteMap<e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final e findValueByNumber(int i10) {
                return e.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40153a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return e.forNumber(i10) != null;
            }
        }

        e(int i10) {
            this.f40152a = i10;
        }

        public static e forNumber(int i10) {
            if (i10 == 0) {
                return CONTRAST_DEFAULT;
            }
            if (i10 == 1) {
                return CONTRAST_LOW;
            }
            if (i10 == 2) {
                return CONTRAST_HIGH;
            }
            if (i10 == 3) {
                return CONTRAST_INVERSE_DEFAULT;
            }
            if (i10 == 4) {
                return CONTRAST_INVERSE_LOW;
            }
            if (i10 != 5) {
                return null;
            }
            return CONTRAST_INVERSE_HIGH;
        }

        public static Internal.EnumLiteMap<e> internalGetValueMap() {
            return f40150b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40153a;
        }

        @Deprecated
        public static e valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40152a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum f implements Internal.EnumLite {
        FONT_SANS(0),
        FONT_MONO(1),
        UNRECOGNIZED(-1);

        public static final int FONT_MONO_VALUE = 1;
        public static final int FONT_SANS_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40154b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40156a;

        public class a implements Internal.EnumLiteMap<f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final f findValueByNumber(int i10) {
                return f.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40157a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return f.forNumber(i10) != null;
            }
        }

        f(int i10) {
            this.f40156a = i10;
        }

        public static f forNumber(int i10) {
            if (i10 == 0) {
                return FONT_SANS;
            }
            if (i10 != 1) {
                return null;
            }
            return FONT_MONO;
        }

        public static Internal.EnumLiteMap<f> internalGetValueMap() {
            return f40154b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40157a;
        }

        @Deprecated
        public static f valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40156a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public enum g implements Internal.EnumLite {
        FONT_WEIGHT_NORMAL(0),
        FONT_WEIGHT_BOLD(1),
        FONT_WEIGHT_MEDIUM(2),
        FONT_WEIGHT_SEMI_BOLD(3),
        FONT_WEIGHT_EXTRA_BOLD(4),
        UNRECOGNIZED(-1);

        public static final int FONT_WEIGHT_BOLD_VALUE = 1;
        public static final int FONT_WEIGHT_EXTRA_BOLD_VALUE = 4;
        public static final int FONT_WEIGHT_MEDIUM_VALUE = 2;
        public static final int FONT_WEIGHT_NORMAL_VALUE = 0;
        public static final int FONT_WEIGHT_SEMI_BOLD_VALUE = 3;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40158b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40160a;

        public class a implements Internal.EnumLiteMap<g> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final g findValueByNumber(int i10) {
                return g.forNumber(i10);
            }
        }

        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final b f40161a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return g.forNumber(i10) != null;
            }
        }

        g(int i10) {
            this.f40160a = i10;
        }

        public static g forNumber(int i10) {
            if (i10 == 0) {
                return FONT_WEIGHT_NORMAL;
            }
            if (i10 == 1) {
                return FONT_WEIGHT_BOLD;
            }
            if (i10 == 2) {
                return FONT_WEIGHT_MEDIUM;
            }
            if (i10 == 3) {
                return FONT_WEIGHT_SEMI_BOLD;
            }
            if (i10 != 4) {
                return null;
            }
            return FONT_WEIGHT_EXTRA_BOLD;
        }

        public static Internal.EnumLiteMap<g> internalGetValueMap() {
            return f40158b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f40161a;
        }

        @Deprecated
        public static g valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40160a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$TextContent common$TextContent = new Common$TextContent();
        DEFAULT_INSTANCE = common$TextContent;
        GeneratedMessageLite.registerDefaultInstance(Common$TextContent.class, common$TextContent);
    }

    private Common$TextContent() {
    }

    private void clearAlign() {
        this.align_ = 0;
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearCasing() {
        this.casing_ = 0;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContrast() {
        this.contrast_ = 0;
    }

    private void clearFont() {
        this.font_ = 0;
    }

    private void clearLineHeight() {
        this.lineHeight_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearWeight() {
        this.weight_ = 0;
    }

    public static Common$TextContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextContent parseFrom(ByteString byteString) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TextContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlign(a aVar) {
        this.align_ = aVar.getNumber();
    }

    private void setAlignValue(int i10) {
        this.align_ = i10;
    }

    private void setAs(b bVar) {
        this.as_ = bVar.getNumber();
    }

    private void setAsValue(int i10) {
        this.as_ = i10;
    }

    private void setCasing(d dVar) {
        this.casing_ = dVar.getNumber();
    }

    private void setCasingValue(int i10) {
        this.casing_ = i10;
    }

    private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void setContrast(e eVar) {
        this.contrast_ = eVar.getNumber();
    }

    private void setContrastValue(int i10) {
        this.contrast_ = i10;
    }

    private void setFont(f fVar) {
        this.font_ = fVar.getNumber();
    }

    private void setFontValue(int i10) {
        this.font_ = i10;
    }

    private void setLineHeight(int i10) {
        this.lineHeight_ = i10;
    }

    private void setSize(int i10) {
        this.size_ = i10;
    }

    private void setWeight(g gVar) {
        this.weight_ = gVar.getNumber();
    }

    private void setWeightValue(int i10) {
        this.weight_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TextContent();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004ဉ\u0000\u0005\f\u0006\f\u0007\f\b\f\t\u000b", new Object[]{"bitField0_", "as_", "size_", "weight_", "content_", "align_", "font_", "casing_", "contrast_", "lineHeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextContent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$TextContent.class) {
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

    public a getAlign() {
        a forNumber = a.forNumber(this.align_);
        return forNumber == null ? a.UNRECOGNIZED : forNumber;
    }

    public int getAlignValue() {
        return this.align_;
    }

    public b getAs() {
        b forNumber = b.forNumber(this.as_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getAsValue() {
        return this.as_;
    }

    public d getCasing() {
        d forNumber = d.forNumber(this.casing_);
        return forNumber == null ? d.UNRECOGNIZED : forNumber;
    }

    public int getCasingValue() {
        return this.casing_;
    }

    public Common$AttributedLocalizedString getContent() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public e getContrast() {
        e forNumber = e.forNumber(this.contrast_);
        return forNumber == null ? e.UNRECOGNIZED : forNumber;
    }

    public int getContrastValue() {
        return this.contrast_;
    }

    public f getFont() {
        f forNumber = f.forNumber(this.font_);
        return forNumber == null ? f.UNRECOGNIZED : forNumber;
    }

    public int getFontValue() {
        return this.font_;
    }

    public int getLineHeight() {
        return this.lineHeight_;
    }

    public int getSize() {
        return this.size_;
    }

    public g getWeight() {
        g forNumber = g.forNumber(this.weight_);
        return forNumber == null ? g.UNRECOGNIZED : forNumber;
    }

    public int getWeightValue() {
        return this.weight_;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(Common$TextContent common$TextContent) {
        return DEFAULT_INSTANCE.createBuilder(common$TextContent);
    }

    public static Common$TextContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(InputStream inputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TextContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(byte[] bArr) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

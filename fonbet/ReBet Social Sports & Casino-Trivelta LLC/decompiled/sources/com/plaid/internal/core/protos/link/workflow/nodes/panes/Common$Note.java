package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.EnumC3631g;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Common$Note extends GeneratedMessageLite<Common$Note, a> implements MessageLiteOrBuilder {
    private static final Common$Note DEFAULT_INSTANCE;
    public static final int FIXED_WIDTH_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 6;
    private static volatile Parser<Common$Note> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 7;
    public static final int SMALL_SIZE_FIELD_NUMBER = 4;
    public static final int SOLID_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean fixedWidth_;
    private int icon_;
    private int size_;
    private boolean smallSize_;
    private boolean solid_;
    private Common$LocalizedString text_;
    private int type_;

    public static final class a extends GeneratedMessageLite.Builder<Common$Note, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$Note.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Note common$Note = new Common$Note();
        DEFAULT_INSTANCE = common$Note;
        GeneratedMessageLite.registerDefaultInstance(Common$Note.class, common$Note);
    }

    private Common$Note() {
    }

    private void clearFixedWidth() {
        this.fixedWidth_ = false;
    }

    private void clearIcon() {
        this.icon_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearSmallSize() {
        this.smallSize_ = false;
    }

    private void clearSolid() {
        this.solid_ = false;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static Common$Note getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.text_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Note parseDelimitedFrom(InputStream inputStream) {
        return (Common$Note) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Note parseFrom(ByteString byteString) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Note> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFixedWidth(boolean z10) {
        this.fixedWidth_ = z10;
    }

    private void setIcon(EnumC3631g enumC3631g) {
        this.icon_ = enumC3631g.getNumber();
    }

    private void setIconValue(int i10) {
        this.icon_ = i10;
    }

    private void setSize(D d10) {
        this.size_ = d10.getNumber();
    }

    private void setSizeValue(int i10) {
        this.size_ = i10;
    }

    private void setSmallSize(boolean z10) {
        this.smallSize_ = z10;
    }

    private void setSolid(boolean z10) {
        this.solid_ = z10;
    }

    private void setText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setType(E e10) {
        this.type_ = e10.getNumber();
    }

    private void setTypeValue(int i10) {
        this.type_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Note();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007\u0006\f\u0007\f", new Object[]{"bitField0_", "text_", "type_", "fixedWidth_", "smallSize_", "solid_", "icon_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Note> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$Note.class) {
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

    public boolean getFixedWidth() {
        return this.fixedWidth_;
    }

    public EnumC3631g getIcon() {
        EnumC3631g forNumber = EnumC3631g.forNumber(this.icon_);
        return forNumber == null ? EnumC3631g.UNRECOGNIZED : forNumber;
    }

    public int getIconValue() {
        return this.icon_;
    }

    public D getSize() {
        D forNumber = D.forNumber(this.size_);
        return forNumber == null ? D.UNRECOGNIZED : forNumber;
    }

    public int getSizeValue() {
        return this.size_;
    }

    public boolean getSmallSize() {
        return this.smallSize_;
    }

    public boolean getSolid() {
        return this.solid_;
    }

    public Common$LocalizedString getText() {
        Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public E getType() {
        E forNumber = E.forNumber(this.type_);
        return forNumber == null ? E.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(Common$Note common$Note) {
        return DEFAULT_INSTANCE.createBuilder(common$Note);
    }

    public static Common$Note parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Note parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Note parseFrom(CodedInputStream codedInputStream) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Note parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Note parseFrom(InputStream inputStream) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Note parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Note parseFrom(ByteBuffer byteBuffer) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Note parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Note parseFrom(byte[] bArr) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Note parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

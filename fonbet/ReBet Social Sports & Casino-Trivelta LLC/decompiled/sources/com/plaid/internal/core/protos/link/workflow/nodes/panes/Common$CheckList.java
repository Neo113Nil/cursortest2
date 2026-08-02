package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Common$CheckList extends GeneratedMessageLite<Common$CheckList, a> implements MessageLiteOrBuilder {
    public static final int CONTAINER_STYLE_FIELD_NUMBER = 4;
    private static final Common$CheckList DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile Parser<Common$CheckList> PARSER;
    private int bitField0_;
    private int containerStyle_;
    private Common$LocalizedString header_;
    private String id_ = "";
    private Internal.ProtobufList<Common$CheckListItem> items_ = GeneratedMessageLite.emptyProtobufList();

    public static final class a extends GeneratedMessageLite.Builder<Common$CheckList, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$CheckList.DEFAULT_INSTANCE);
        }
    }

    public enum b implements Internal.EnumLite {
        CONTAINER_STYLE_UNKNOWN(0),
        CONTAINER_STYLE_BACKGROUND_CARD(1),
        CONTAINER_STYLE_TRANSPARENT(2),
        UNRECOGNIZED(-1);

        public static final int CONTAINER_STYLE_BACKGROUND_CARD_VALUE = 1;
        public static final int CONTAINER_STYLE_TRANSPARENT_VALUE = 2;
        public static final int CONTAINER_STYLE_UNKNOWN_VALUE = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final a f40077b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final int f40079a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i10) {
                return b.forNumber(i10);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CheckList$b$b, reason: collision with other inner class name */
        public static final class C0567b implements Internal.EnumVerifier {

            /* renamed from: a, reason: collision with root package name */
            public static final C0567b f40080a = new C0567b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i10) {
                return b.forNumber(i10) != null;
            }
        }

        b(int i10) {
            this.f40079a = i10;
        }

        public static b forNumber(int i10) {
            if (i10 == 0) {
                return CONTAINER_STYLE_UNKNOWN;
            }
            if (i10 == 1) {
                return CONTAINER_STYLE_BACKGROUND_CARD;
            }
            if (i10 != 2) {
                return null;
            }
            return CONTAINER_STYLE_TRANSPARENT;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return f40077b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0567b.f40080a;
        }

        @Deprecated
        public static b valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f40079a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$CheckList common$CheckList = new Common$CheckList();
        DEFAULT_INSTANCE = common$CheckList;
        GeneratedMessageLite.registerDefaultInstance(Common$CheckList.class, common$CheckList);
    }

    private Common$CheckList() {
    }

    private void addAllItems(Iterable<? extends Common$CheckListItem> iterable) {
        ensureItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.items_);
    }

    private void addItems(int i10, Common$CheckListItem common$CheckListItem) {
        common$CheckListItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i10, common$CheckListItem);
    }

    private void clearContainerStyle() {
        this.containerStyle_ = 0;
    }

    private void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        Internal.ProtobufList<Common$CheckListItem> protobufList = this.items_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.items_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$CheckList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeHeader(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.header_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$CheckList parseDelimitedFrom(InputStream inputStream) {
        return (Common$CheckList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CheckList parseFrom(ByteString byteString) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$CheckList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeItems(int i10) {
        ensureItemsIsMutable();
        this.items_.remove(i10);
    }

    private void setContainerStyle(b bVar) {
        this.containerStyle_ = bVar.getNumber();
    }

    private void setContainerStyleValue(int i10) {
        this.containerStyle_ = i10;
    }

    private void setHeader(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.header_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setItems(int i10, Common$CheckListItem common$CheckListItem) {
        common$CheckListItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i10, common$CheckListItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C3588j.f40405a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$CheckList();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003ဉ\u0000\u0004\f", new Object[]{"bitField0_", "id_", "items_", Common$CheckListItem.class, "header_", "containerStyle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$CheckList> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$CheckList.class) {
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

    public b getContainerStyle() {
        b forNumber = b.forNumber(this.containerStyle_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getContainerStyleValue() {
        return this.containerStyle_;
    }

    public Common$LocalizedString getHeader() {
        Common$LocalizedString common$LocalizedString = this.header_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$CheckListItem getItems(int i10) {
        return this.items_.get(i10);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<Common$CheckListItem> getItemsList() {
        return this.items_;
    }

    public r getItemsOrBuilder(int i10) {
        return this.items_.get(i10);
    }

    public List<? extends r> getItemsOrBuilderList() {
        return this.items_;
    }

    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addItems(Common$CheckListItem common$CheckListItem) {
        common$CheckListItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(common$CheckListItem);
    }

    public static a newBuilder(Common$CheckList common$CheckList) {
        return DEFAULT_INSTANCE.createBuilder(common$CheckList);
    }

    public static Common$CheckList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(CodedInputStream codedInputStream) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$CheckList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(InputStream inputStream) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$CheckList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(ByteBuffer byteBuffer) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$CheckList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$CheckList parseFrom(byte[] bArr) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$CheckList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$CheckList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}

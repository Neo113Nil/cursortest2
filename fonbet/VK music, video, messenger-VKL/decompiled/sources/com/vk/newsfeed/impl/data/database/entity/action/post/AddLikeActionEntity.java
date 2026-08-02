package com.vk.newsfeed.impl.data.database.entity.action.post;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.fpf0;
import xsna.j5g;
import xsna.zrp;

/* compiled from: AddLikeActionEntity.kt */
/* loaded from: classes4.dex */
public final class AddLikeActionEntity extends Message {
    public static final a b = new a(FieldEncoding.LENGTH_DELIMITED, fpf0.a(AddLikeActionEntity.class), "type.googleapis.com/models.AddLikeActionEntity", Syntax.PROTO_3, null, "tools/prototools/schema/post_actions.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    private final String accessKey;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    private final long itemId;

    @WireField(adapter = "com.vk.newsfeed.impl.data.database.entity.action.post.LikableItemTypeEntity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    private final LikableItemTypeEntity itemType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    private final Long ownerId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    private final Integer reactionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    private final String ref;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    private final String trackCode;

    @WireField(adapter = "com.vk.newsfeed.impl.data.database.entity.action.post.AddLikeActionEntity$TriggerTypeEntity#ADAPTER", tag = 8)
    private final TriggerTypeEntity triggerType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddLikeActionEntity.kt */
    public static final class TriggerTypeEntity implements WireEnum {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TriggerTypeEntity[] $VALUES;
        public static final ProtoAdapter<TriggerTypeEntity> ADAPTER;
        public static final TriggerTypeEntity BUTTON;
        public static final b Companion;
        public static final TriggerTypeEntity DOUBLE_TAP;
        public static final TriggerTypeEntity REACTIONS_MODAL;
        public static final TriggerTypeEntity REACTIONS_POPUP;
        private final int value;

        /* compiled from: AddLikeActionEntity.kt */
        public static final class a extends EnumAdapter<TriggerTypeEntity> {
            @Override // com.squareup.wire.EnumAdapter
            public final TriggerTypeEntity fromValue(int i) {
                TriggerTypeEntity.Companion.getClass();
                if (i == 0) {
                    return TriggerTypeEntity.BUTTON;
                }
                if (i == 1) {
                    return TriggerTypeEntity.DOUBLE_TAP;
                }
                if (i == 2) {
                    return TriggerTypeEntity.REACTIONS_MODAL;
                }
                if (i != 3) {
                    return null;
                }
                return TriggerTypeEntity.REACTIONS_POPUP;
            }
        }

        /* compiled from: AddLikeActionEntity.kt */
        public static final class b {
        }

        static {
            TriggerTypeEntity triggerTypeEntity = new TriggerTypeEntity("BUTTON", 0, 0);
            BUTTON = triggerTypeEntity;
            TriggerTypeEntity triggerTypeEntity2 = new TriggerTypeEntity("DOUBLE_TAP", 1, 1);
            DOUBLE_TAP = triggerTypeEntity2;
            TriggerTypeEntity triggerTypeEntity3 = new TriggerTypeEntity("REACTIONS_MODAL", 2, 2);
            REACTIONS_MODAL = triggerTypeEntity3;
            TriggerTypeEntity triggerTypeEntity4 = new TriggerTypeEntity("REACTIONS_POPUP", 3, 3);
            REACTIONS_POPUP = triggerTypeEntity4;
            TriggerTypeEntity[] triggerTypeEntityArr = {triggerTypeEntity, triggerTypeEntity2, triggerTypeEntity3, triggerTypeEntity4};
            $VALUES = triggerTypeEntityArr;
            $ENTRIES = new asp(triggerTypeEntityArr);
            Companion = new b();
            ADAPTER = new a(fpf0.a(TriggerTypeEntity.class), Syntax.PROTO_3, triggerTypeEntity);
        }

        public TriggerTypeEntity(String str, int i, int i2) {
            this.value = i2;
        }

        public static TriggerTypeEntity valueOf(String str) {
            return (TriggerTypeEntity) Enum.valueOf(TriggerTypeEntity.class, str);
        }

        public static TriggerTypeEntity[] values() {
            return (TriggerTypeEntity[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public AddLikeActionEntity() {
        this((LikableItemTypeEntity) null, 0L, (Long) null, (Integer) null, (String) null, (String) null, (String) null, (TriggerTypeEntity) null, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }

    public static AddLikeActionEntity a(AddLikeActionEntity addLikeActionEntity) {
        LikableItemTypeEntity likableItemTypeEntity = addLikeActionEntity.itemType;
        long j = addLikeActionEntity.itemId;
        Long l = addLikeActionEntity.ownerId;
        Integer num = addLikeActionEntity.reactionId;
        String str = addLikeActionEntity.accessKey;
        String str2 = addLikeActionEntity.ref;
        String str3 = addLikeActionEntity.trackCode;
        TriggerTypeEntity triggerTypeEntity = addLikeActionEntity.triggerType;
        addLikeActionEntity.getClass();
        return new AddLikeActionEntity(likableItemTypeEntity, j, l, num, str, str2, str3, triggerTypeEntity, ByteString.d);
    }

    public final String d() {
        return this.accessKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AddLikeActionEntity)) {
            return false;
        }
        AddLikeActionEntity addLikeActionEntity = (AddLikeActionEntity) obj;
        return epx.f(unknownFields(), addLikeActionEntity.unknownFields()) && this.itemType == addLikeActionEntity.itemType && this.itemId == addLikeActionEntity.itemId && epx.f(this.ownerId, addLikeActionEntity.ownerId) && epx.f(this.reactionId, addLikeActionEntity.reactionId) && epx.f(this.accessKey, addLikeActionEntity.accessKey) && epx.f(this.ref, addLikeActionEntity.ref) && epx.f(this.trackCode, addLikeActionEntity.trackCode) && this.triggerType == addLikeActionEntity.triggerType;
    }

    public final long g() {
        return this.itemId;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int a2 = bh10.a((this.itemType.hashCode() + (unknownFields().hashCode() * 37)) * 37, 37, this.itemId);
        Long l = this.ownerId;
        int hashCode = (a2 + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.reactionId;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.accessKey;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ref;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.trackCode;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        TriggerTypeEntity triggerTypeEntity = this.triggerType;
        int hashCode6 = hashCode5 + (triggerTypeEntity != null ? triggerTypeEntity.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    public final LikableItemTypeEntity i() {
        return this.itemType;
    }

    public final Long j() {
        return this.ownerId;
    }

    public final Integer k() {
        return this.reactionId;
    }

    public final String l() {
        return this.ref;
    }

    public final TriggerTypeEntity n() {
        return this.triggerType;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public final String r() {
        return this.trackCode;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("itemType=" + this.itemType);
        arrayList.add("itemId=" + this.itemId);
        if (this.ownerId != null) {
            arrayList.add("ownerId=" + this.ownerId);
        }
        if (this.reactionId != null) {
            arrayList.add("reactionId=" + this.reactionId);
        }
        if (this.accessKey != null) {
            arrayList.add("accessKey=" + Internal.sanitize(this.accessKey));
        }
        if (this.ref != null) {
            arrayList.add("ref=" + Internal.sanitize(this.ref));
        }
        if (this.trackCode != null) {
            arrayList.add("trackCode=" + Internal.sanitize(this.trackCode));
        }
        if (this.triggerType != null) {
            arrayList.add("triggerType=" + this.triggerType);
        }
        return j5g.g0(arrayList, ", ", "AddLikeActionEntity{", "}", 0, null, 56);
    }

    public /* synthetic */ AddLikeActionEntity(LikableItemTypeEntity likableItemTypeEntity, long j, Long l, Integer num, String str, String str2, String str3, TriggerTypeEntity triggerTypeEntity, int i) {
        this((i & 1) != 0 ? LikableItemTypeEntity.POST : likableItemTypeEntity, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : triggerTypeEntity, ByteString.d);
    }

    public AddLikeActionEntity(LikableItemTypeEntity likableItemTypeEntity, long j, Long l, Integer num, String str, String str2, String str3, TriggerTypeEntity triggerTypeEntity, ByteString byteString) {
        super(b, byteString);
        this.itemType = likableItemTypeEntity;
        this.itemId = j;
        this.ownerId = l;
        this.reactionId = num;
        this.accessKey = str;
        this.ref = str2;
        this.trackCode = str3;
        this.triggerType = triggerTypeEntity;
    }

    /* compiled from: AddLikeActionEntity.kt */
    public static final class a extends ProtoAdapter<AddLikeActionEntity> {
        @Override // com.squareup.wire.ProtoAdapter
        public final AddLikeActionEntity decode(ProtoReader protoReader) {
            LikableItemTypeEntity likableItemTypeEntity;
            Integer num;
            Long l;
            LikableItemTypeEntity likableItemTypeEntity2 = LikableItemTypeEntity.POST;
            long beginMessage = protoReader.beginMessage();
            Long l2 = null;
            long j = 0;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            TriggerTypeEntity triggerTypeEntity = null;
            LikableItemTypeEntity likableItemTypeEntity3 = likableItemTypeEntity2;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    return new AddLikeActionEntity(likableItemTypeEntity3, j, l2, num2, str, str2, str3, triggerTypeEntity, protoReader.endMessageAndGetUnknownFields(beginMessage));
                }
                switch (nextTag) {
                    case 1:
                        likableItemTypeEntity = likableItemTypeEntity3;
                        num = num2;
                        try {
                            likableItemTypeEntity3 = LikableItemTypeEntity.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            l = l2;
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            break;
                        }
                        num2 = num;
                        break;
                    case 2:
                        likableItemTypeEntity = likableItemTypeEntity3;
                        num = num2;
                        j = ProtoAdapter.INT64.decode(protoReader).longValue();
                        likableItemTypeEntity3 = likableItemTypeEntity;
                        num2 = num;
                        break;
                    case 3:
                        l2 = ProtoAdapter.INT64.decode(protoReader);
                        break;
                    case 4:
                        num2 = ProtoAdapter.INT32.decode(protoReader);
                        break;
                    case 5:
                        str = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 6:
                        str2 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 7:
                        str3 = ProtoAdapter.STRING.decode(protoReader);
                        break;
                    case 8:
                        try {
                            triggerTypeEntity = TriggerTypeEntity.ADAPTER.decode(protoReader);
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            likableItemTypeEntity = likableItemTypeEntity3;
                            num = num2;
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            break;
                        }
                    default:
                        protoReader.readUnknownField(nextTag);
                        likableItemTypeEntity = likableItemTypeEntity3;
                        num = num2;
                        l = l2;
                        l2 = l;
                        likableItemTypeEntity3 = likableItemTypeEntity;
                        num2 = num;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AddLikeActionEntity addLikeActionEntity) {
            AddLikeActionEntity addLikeActionEntity2 = addLikeActionEntity;
            if (addLikeActionEntity2.i() != LikableItemTypeEntity.POST) {
                LikableItemTypeEntity.ADAPTER.encodeWithTag(protoWriter, 1, (int) addLikeActionEntity2.i());
            }
            if (addLikeActionEntity2.g() != 0) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(addLikeActionEntity2.g()));
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, (int) addLikeActionEntity2.j());
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, (int) addLikeActionEntity2.k());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 5, (int) addLikeActionEntity2.d());
            protoAdapter.encodeWithTag(protoWriter, 6, (int) addLikeActionEntity2.l());
            protoAdapter.encodeWithTag(protoWriter, 7, (int) addLikeActionEntity2.r());
            TriggerTypeEntity.ADAPTER.encodeWithTag(protoWriter, 8, (int) addLikeActionEntity2.n());
            protoWriter.writeBytes(addLikeActionEntity2.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AddLikeActionEntity addLikeActionEntity) {
            AddLikeActionEntity addLikeActionEntity2 = addLikeActionEntity;
            int n = addLikeActionEntity2.unknownFields().n();
            if (addLikeActionEntity2.i() != LikableItemTypeEntity.POST) {
                n += LikableItemTypeEntity.ADAPTER.encodedSizeWithTag(1, addLikeActionEntity2.i());
            }
            if (addLikeActionEntity2.g() != 0) {
                n += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(addLikeActionEntity2.g()));
            }
            int encodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(4, addLikeActionEntity2.k()) + ProtoAdapter.INT64.encodedSizeWithTag(3, addLikeActionEntity2.j()) + n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return TriggerTypeEntity.ADAPTER.encodedSizeWithTag(8, addLikeActionEntity2.n()) + protoAdapter.encodedSizeWithTag(7, addLikeActionEntity2.r()) + protoAdapter.encodedSizeWithTag(6, addLikeActionEntity2.l()) + protoAdapter.encodedSizeWithTag(5, addLikeActionEntity2.d()) + encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AddLikeActionEntity redact(AddLikeActionEntity addLikeActionEntity) {
            return AddLikeActionEntity.a(addLikeActionEntity);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ReverseProtoWriter reverseProtoWriter, AddLikeActionEntity addLikeActionEntity) {
            AddLikeActionEntity addLikeActionEntity2 = addLikeActionEntity;
            reverseProtoWriter.writeBytes(addLikeActionEntity2.unknownFields());
            TriggerTypeEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 8, (int) addLikeActionEntity2.n());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(reverseProtoWriter, 7, (int) addLikeActionEntity2.r());
            protoAdapter.encodeWithTag(reverseProtoWriter, 6, (int) addLikeActionEntity2.l());
            protoAdapter.encodeWithTag(reverseProtoWriter, 5, (int) addLikeActionEntity2.d());
            ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, (int) addLikeActionEntity2.k());
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(reverseProtoWriter, 3, (int) addLikeActionEntity2.j());
            if (addLikeActionEntity2.g() != 0) {
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(addLikeActionEntity2.g()));
            }
            if (addLikeActionEntity2.i() != LikableItemTypeEntity.POST) {
                LikableItemTypeEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) addLikeActionEntity2.i());
            }
        }
    }
}

package com.vk.newsfeed.impl.data.database.entity.action.post;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import okio.ByteString;
import xsna.bh10;
import xsna.epx;
import xsna.fpf0;
import xsna.j5g;

/* compiled from: DeleteLikeActionEntity.kt */
/* loaded from: classes4.dex */
public final class DeleteLikeActionEntity extends Message {
    public static final a b = new a(FieldEncoding.LENGTH_DELIMITED, fpf0.a(DeleteLikeActionEntity.class), "type.googleapis.com/models.DeleteLikeActionEntity", Syntax.PROTO_3, null, "tools/prototools/schema/post_actions.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    private final String accessKey;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    private final long itemId;

    @WireField(adapter = "com.vk.newsfeed.impl.data.database.entity.action.post.LikableItemTypeEntity#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    private final LikableItemTypeEntity itemType;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    private final Long ownerId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    private final String ref;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    private final String trackCode;

    public DeleteLikeActionEntity() {
        this((LikableItemTypeEntity) null, 0L, (Long) null, (String) null, (String) null, (String) null, 127);
    }

    public static DeleteLikeActionEntity a(DeleteLikeActionEntity deleteLikeActionEntity) {
        LikableItemTypeEntity likableItemTypeEntity = deleteLikeActionEntity.itemType;
        long j = deleteLikeActionEntity.itemId;
        Long l = deleteLikeActionEntity.ownerId;
        String str = deleteLikeActionEntity.accessKey;
        String str2 = deleteLikeActionEntity.ref;
        String str3 = deleteLikeActionEntity.trackCode;
        deleteLikeActionEntity.getClass();
        return new DeleteLikeActionEntity(likableItemTypeEntity, j, l, str, str2, str3, ByteString.d);
    }

    public final String d() {
        return this.accessKey;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteLikeActionEntity)) {
            return false;
        }
        DeleteLikeActionEntity deleteLikeActionEntity = (DeleteLikeActionEntity) obj;
        return epx.f(unknownFields(), deleteLikeActionEntity.unknownFields()) && this.itemType == deleteLikeActionEntity.itemType && this.itemId == deleteLikeActionEntity.itemId && epx.f(this.ownerId, deleteLikeActionEntity.ownerId) && epx.f(this.accessKey, deleteLikeActionEntity.accessKey) && epx.f(this.ref, deleteLikeActionEntity.ref) && epx.f(this.trackCode, deleteLikeActionEntity.trackCode);
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
        String str = this.accessKey;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ref;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.trackCode;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    public final LikableItemTypeEntity i() {
        return this.itemType;
    }

    public final Long j() {
        return this.ownerId;
    }

    public final String k() {
        return this.ref;
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
        if (this.accessKey != null) {
            arrayList.add("accessKey=" + Internal.sanitize(this.accessKey));
        }
        if (this.ref != null) {
            arrayList.add("ref=" + Internal.sanitize(this.ref));
        }
        if (this.trackCode != null) {
            arrayList.add("trackCode=" + Internal.sanitize(this.trackCode));
        }
        return j5g.g0(arrayList, ", ", "DeleteLikeActionEntity{", "}", 0, null, 56);
    }

    public /* synthetic */ DeleteLikeActionEntity(LikableItemTypeEntity likableItemTypeEntity, long j, Long l, String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? LikableItemTypeEntity.POST : likableItemTypeEntity, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, ByteString.d);
    }

    public DeleteLikeActionEntity(LikableItemTypeEntity likableItemTypeEntity, long j, Long l, String str, String str2, String str3, ByteString byteString) {
        super(b, byteString);
        this.itemType = likableItemTypeEntity;
        this.itemId = j;
        this.ownerId = l;
        this.accessKey = str;
        this.ref = str2;
        this.trackCode = str3;
    }

    /* compiled from: DeleteLikeActionEntity.kt */
    public static final class a extends ProtoAdapter<DeleteLikeActionEntity> {
        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteLikeActionEntity decode(ProtoReader protoReader) {
            LikableItemTypeEntity likableItemTypeEntity = LikableItemTypeEntity.POST;
            long beginMessage = protoReader.beginMessage();
            Long l = null;
            long j = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                LikableItemTypeEntity likableItemTypeEntity2 = likableItemTypeEntity;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new DeleteLikeActionEntity(likableItemTypeEntity2, j, l, str, str2, str3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                likableItemTypeEntity = LikableItemTypeEntity.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 2:
                            j = ProtoAdapter.INT64.decode(protoReader).longValue();
                            break;
                        case 3:
                            l = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            str2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteLikeActionEntity deleteLikeActionEntity) {
            DeleteLikeActionEntity deleteLikeActionEntity2 = deleteLikeActionEntity;
            if (deleteLikeActionEntity2.i() != LikableItemTypeEntity.POST) {
                LikableItemTypeEntity.ADAPTER.encodeWithTag(protoWriter, 1, (int) deleteLikeActionEntity2.i());
            }
            if (deleteLikeActionEntity2.g() != 0) {
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(deleteLikeActionEntity2.g()));
            }
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, (int) deleteLikeActionEntity2.j());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, (int) deleteLikeActionEntity2.d());
            protoAdapter.encodeWithTag(protoWriter, 5, (int) deleteLikeActionEntity2.k());
            protoAdapter.encodeWithTag(protoWriter, 6, (int) deleteLikeActionEntity2.r());
            protoWriter.writeBytes(deleteLikeActionEntity2.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteLikeActionEntity deleteLikeActionEntity) {
            DeleteLikeActionEntity deleteLikeActionEntity2 = deleteLikeActionEntity;
            int n = deleteLikeActionEntity2.unknownFields().n();
            if (deleteLikeActionEntity2.i() != LikableItemTypeEntity.POST) {
                n += LikableItemTypeEntity.ADAPTER.encodedSizeWithTag(1, deleteLikeActionEntity2.i());
            }
            if (deleteLikeActionEntity2.g() != 0) {
                n += ProtoAdapter.INT64.encodedSizeWithTag(2, Long.valueOf(deleteLikeActionEntity2.g()));
            }
            int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, deleteLikeActionEntity2.j()) + n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(6, deleteLikeActionEntity2.r()) + protoAdapter.encodedSizeWithTag(5, deleteLikeActionEntity2.k()) + protoAdapter.encodedSizeWithTag(4, deleteLikeActionEntity2.d()) + encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteLikeActionEntity redact(DeleteLikeActionEntity deleteLikeActionEntity) {
            return DeleteLikeActionEntity.a(deleteLikeActionEntity);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ReverseProtoWriter reverseProtoWriter, DeleteLikeActionEntity deleteLikeActionEntity) {
            DeleteLikeActionEntity deleteLikeActionEntity2 = deleteLikeActionEntity;
            reverseProtoWriter.writeBytes(deleteLikeActionEntity2.unknownFields());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(reverseProtoWriter, 6, (int) deleteLikeActionEntity2.r());
            protoAdapter.encodeWithTag(reverseProtoWriter, 5, (int) deleteLikeActionEntity2.k());
            protoAdapter.encodeWithTag(reverseProtoWriter, 4, (int) deleteLikeActionEntity2.d());
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(reverseProtoWriter, 3, (int) deleteLikeActionEntity2.j());
            if (deleteLikeActionEntity2.g() != 0) {
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(deleteLikeActionEntity2.g()));
            }
            if (deleteLikeActionEntity2.i() != LikableItemTypeEntity.POST) {
                LikableItemTypeEntity.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) deleteLikeActionEntity2.i());
            }
        }
    }
}

package com.vk.core.store.entity.models;

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
import xsna.epx;
import xsna.fpf0;
import xsna.j5g;
import xsna.shy;

/* compiled from: NotificationMention.kt */
/* loaded from: classes17.dex */
public final class NotificationMention extends Message {
    public static final a b = new a(FieldEncoding.LENGTH_DELIMITED, fpf0.a(NotificationMention.class), "type.googleapis.com/models.NotificationMention", Syntax.PROTO_3, null, "tools/prototools/schema/notification_mention.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    private final int msgCnvId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    private final int notificationId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    private final String notificationTagId;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotificationMention() {
        this(r2, (String) null, r2, 15);
        int i = 0;
    }

    public static NotificationMention a(NotificationMention notificationMention) {
        int i = notificationMention.notificationId;
        String str = notificationMention.notificationTagId;
        int i2 = notificationMention.msgCnvId;
        notificationMention.getClass();
        return new NotificationMention(i, str, i2, ByteString.d);
    }

    public final int d() {
        return this.msgCnvId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationMention)) {
            return false;
        }
        NotificationMention notificationMention = (NotificationMention) obj;
        return epx.f(unknownFields(), notificationMention.unknownFields()) && this.notificationId == notificationMention.notificationId && epx.f(this.notificationTagId, notificationMention.notificationTagId) && this.msgCnvId == notificationMention.msgCnvId;
    }

    public final int g() {
        return this.notificationId;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int a2 = shy.a(this.notificationId, unknownFields().hashCode() * 37, 37);
        String str = this.notificationTagId;
        int hashCode = Integer.hashCode(this.msgCnvId) + ((a2 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String i() {
        return this.notificationTagId;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("notificationId=" + this.notificationId);
        if (this.notificationTagId != null) {
            arrayList.add("notificationTagId=" + Internal.sanitize(this.notificationTagId));
        }
        arrayList.add("msgCnvId=" + this.msgCnvId);
        return j5g.g0(arrayList, ", ", "NotificationMention{", "}", 0, null, 56);
    }

    public /* synthetic */ NotificationMention(int i, String str, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? 0 : i2, ByteString.d);
    }

    public NotificationMention(int i, String str, int i2, ByteString byteString) {
        super(b, byteString);
        this.notificationId = i;
        this.notificationTagId = str;
        this.msgCnvId = i2;
    }

    /* compiled from: NotificationMention.kt */
    public static final class a extends ProtoAdapter<NotificationMention> {
        @Override // com.squareup.wire.ProtoAdapter
        public final NotificationMention decode(ProtoReader protoReader) {
            long beginMessage = protoReader.beginMessage();
            int i = 0;
            String str = null;
            int i2 = 0;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    return new NotificationMention(i, str, i2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                }
                if (nextTag == 2) {
                    i = ProtoAdapter.INT32.decode(protoReader).intValue();
                } else if (nextTag == 3) {
                    str = ProtoAdapter.STRING.decode(protoReader);
                } else if (nextTag != 4) {
                    protoReader.readUnknownField(nextTag);
                } else {
                    i2 = ProtoAdapter.INT32.decode(protoReader).intValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, NotificationMention notificationMention) {
            NotificationMention notificationMention2 = notificationMention;
            if (notificationMention2.g() != 0) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, (int) Integer.valueOf(notificationMention2.g()));
            }
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) notificationMention2.i());
            if (notificationMention2.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, (int) Integer.valueOf(notificationMention2.d()));
            }
            protoWriter.writeBytes(notificationMention2.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(NotificationMention notificationMention) {
            NotificationMention notificationMention2 = notificationMention;
            int n = notificationMention2.unknownFields().n();
            if (notificationMention2.g() != 0) {
                n += ProtoAdapter.INT32.encodedSizeWithTag(2, Integer.valueOf(notificationMention2.g()));
            }
            int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(3, notificationMention2.i()) + n;
            return notificationMention2.d() != 0 ? ProtoAdapter.INT32.encodedSizeWithTag(4, Integer.valueOf(notificationMention2.d())) + encodedSizeWithTag : encodedSizeWithTag;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NotificationMention redact(NotificationMention notificationMention) {
            return NotificationMention.a(notificationMention);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ReverseProtoWriter reverseProtoWriter, NotificationMention notificationMention) {
            NotificationMention notificationMention2 = notificationMention;
            reverseProtoWriter.writeBytes(notificationMention2.unknownFields());
            if (notificationMention2.d() != 0) {
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, (int) Integer.valueOf(notificationMention2.d()));
            }
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) notificationMention2.i());
            if (notificationMention2.g() != 0) {
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, (int) Integer.valueOf(notificationMention2.g()));
            }
        }
    }
}

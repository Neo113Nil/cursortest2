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
import java.util.List;
import kotlin.collections.EmptyList;
import okio.ByteString;
import xsna.epx;
import xsna.fpf0;
import xsna.j5g;

/* compiled from: NotificationMentions.kt */
/* loaded from: classes17.dex */
public final class NotificationMentions extends Message {
    public static final a b = new a(FieldEncoding.LENGTH_DELIMITED, fpf0.a(NotificationMentions.class), "type.googleapis.com/models.NotificationMentions", Syntax.PROTO_3, null, "tools/prototools/schema/notification_mention.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.vk.core.store.entity.models.NotificationMention#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    private final List<NotificationMention> mention;

    public NotificationMentions() {
        this((List) null, 3);
    }

    public static NotificationMentions a(NotificationMentions notificationMentions, ArrayList arrayList) {
        ByteString unknownFields = notificationMentions.unknownFields();
        notificationMentions.getClass();
        return new NotificationMentions(arrayList, unknownFields);
    }

    public final List<NotificationMention> d() {
        return this.mention;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationMentions)) {
            return false;
        }
        NotificationMentions notificationMentions = (NotificationMentions) obj;
        return epx.f(unknownFields(), notificationMentions.unknownFields()) && epx.f(this.mention, notificationMentions.mention);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.mention.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final /* synthetic */ Message.Builder newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.mention.isEmpty()) {
            arrayList.add("mention=" + this.mention);
        }
        return j5g.g0(arrayList, ", ", "NotificationMentions{", "}", 0, null, 56);
    }

    public NotificationMentions(List<NotificationMention> list, ByteString byteString) {
        super(b, byteString);
        this.mention = Internal.immutableCopyOf("mention", list);
    }

    /* compiled from: NotificationMentions.kt */
    public static final class a extends ProtoAdapter<NotificationMentions> {
        @Override // com.squareup.wire.ProtoAdapter
        public final NotificationMentions decode(ProtoReader protoReader) {
            ArrayList arrayList = new ArrayList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    return new NotificationMentions(arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                }
                if (nextTag == 1) {
                    arrayList.add(NotificationMention.b.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, NotificationMentions notificationMentions) {
            NotificationMentions notificationMentions2 = notificationMentions;
            NotificationMention.b.asRepeated().encodeWithTag(protoWriter, 1, (int) notificationMentions2.d());
            protoWriter.writeBytes(notificationMentions2.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(NotificationMentions notificationMentions) {
            NotificationMentions notificationMentions2 = notificationMentions;
            return NotificationMention.b.asRepeated().encodedSizeWithTag(1, notificationMentions2.d()) + notificationMentions2.unknownFields().n();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NotificationMentions redact(NotificationMentions notificationMentions) {
            return new NotificationMentions((List<NotificationMention>) Internal.m38redactElements(notificationMentions.d(), NotificationMention.b), ByteString.d);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ReverseProtoWriter reverseProtoWriter, NotificationMentions notificationMentions) {
            NotificationMentions notificationMentions2 = notificationMentions;
            reverseProtoWriter.writeBytes(notificationMentions2.unknownFields());
            NotificationMention.b.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) notificationMentions2.d());
        }
    }

    public NotificationMentions(List list, int i) {
        this((List<NotificationMention>) ((i & 1) != 0 ? EmptyList.b : list), ByteString.d);
    }
}

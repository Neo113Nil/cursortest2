package com.vk.core.store.entity.models;

import androidx.core.app.NotificationCompat;
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

/* compiled from: StoriesEventsStack.kt */
/* loaded from: classes17.dex */
public final class StoriesEventsStack extends Message {
    public static final a b = new a(FieldEncoding.LENGTH_DELIMITED, fpf0.a(StoriesEventsStack.class), "type.googleapis.com/models.StoriesEventsStack", Syntax.PROTO_3, null, "tools/prototools/schema/stories_event_stack.proto");
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    private final List<String> event;

    public StoriesEventsStack() {
        this((ArrayList) null, 3);
    }

    public static StoriesEventsStack a(StoriesEventsStack storiesEventsStack) {
        List<String> list = storiesEventsStack.event;
        storiesEventsStack.getClass();
        return new StoriesEventsStack(list, ByteString.d);
    }

    public final List<String> d() {
        return this.event;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoriesEventsStack)) {
            return false;
        }
        StoriesEventsStack storiesEventsStack = (StoriesEventsStack) obj;
        return epx.f(unknownFields(), storiesEventsStack.unknownFields()) && epx.f(this.event, storiesEventsStack.event);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.event.hashCode() + (unknownFields().hashCode() * 37);
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
        if (!this.event.isEmpty()) {
            arrayList.add("event=" + Internal.sanitize(this.event));
        }
        return j5g.g0(arrayList, ", ", "StoriesEventsStack{", "}", 0, null, 56);
    }

    public StoriesEventsStack(List<String> list, ByteString byteString) {
        super(b, byteString);
        this.event = Internal.immutableCopyOf(NotificationCompat.CATEGORY_EVENT, list);
    }

    /* compiled from: StoriesEventsStack.kt */
    public static final class a extends ProtoAdapter<StoriesEventsStack> {
        @Override // com.squareup.wire.ProtoAdapter
        public final StoriesEventsStack decode(ProtoReader protoReader) {
            ArrayList arrayList = new ArrayList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    return new StoriesEventsStack(arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                }
                if (nextTag == 1) {
                    arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, StoriesEventsStack storiesEventsStack) {
            StoriesEventsStack storiesEventsStack2 = storiesEventsStack;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, (int) storiesEventsStack2.d());
            protoWriter.writeBytes(storiesEventsStack2.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(StoriesEventsStack storiesEventsStack) {
            StoriesEventsStack storiesEventsStack2 = storiesEventsStack;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, storiesEventsStack2.d()) + storiesEventsStack2.unknownFields().n();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StoriesEventsStack redact(StoriesEventsStack storiesEventsStack) {
            return StoriesEventsStack.a(storiesEventsStack);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ReverseProtoWriter reverseProtoWriter, StoriesEventsStack storiesEventsStack) {
            StoriesEventsStack storiesEventsStack2 = storiesEventsStack;
            reverseProtoWriter.writeBytes(storiesEventsStack2.unknownFields());
            ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) storiesEventsStack2.d());
        }
    }

    public StoriesEventsStack(ArrayList arrayList, int i) {
        this((List<String>) ((i & 1) != 0 ? EmptyList.b : arrayList), ByteString.d);
    }
}

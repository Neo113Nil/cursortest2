package com.vk.network.eventhub.api;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import okio.ByteString;
import org.json.JSONObject;
import xsna.asp;
import xsna.bpn0;
import xsna.emb;
import xsna.epx;
import xsna.h1j;
import xsna.jw5;
import xsna.yni0;
import xsna.zq70;
import xsna.zrp;

/* compiled from: Message.kt */
/* loaded from: classes3.dex */
public abstract class Message implements Comparable<Message> {
    public static final AtomicLong e = new AtomicLong(0);
    public final byte[] b;
    public final Priority c = Priority.BASIC;
    public final long d = SystemClock.uptimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Message.kt */
    public static final class Priority {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Priority[] $VALUES;
        public static final Priority BASIC;
        public static final Priority URGENT;

        static {
            Priority priority = new Priority("URGENT", 0);
            URGENT = priority;
            Priority priority2 = new Priority("BASIC", 1);
            BASIC = priority2;
            Priority[] priorityArr = {priority, priority2};
            $VALUES = priorityArr;
            $ENTRIES = new asp(priorityArr);
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) $VALUES.clone();
        }
    }

    /* compiled from: Message.kt */
    public static final class a {
        public static b a(byte b, JSONObject jSONObject) {
            return new b(b, new JSONObject().put("id", Message.e.incrementAndGet()).put("method", "execute").put("params", new JSONObject().put("command", jSONObject)));
        }
    }

    public Message(byte[] bArr) {
        this.b = bArr;
    }

    public abstract JSONObject a();

    public abstract byte c();

    @Override // java.lang.Comparable
    public final int compareTo(Message message) {
        Message message2 = message;
        int compareTo = this.c.compareTo(message2.c);
        return compareTo == 0 ? epx.h(this.d, message2.d) : compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return Arrays.equals(this.b, message.b) && c() == message.c() && this.c == message.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Byte.hashCode(c()) + (Arrays.hashCode(this.b) * 31)) * 31);
    }

    /* compiled from: Message.kt */
    public static final class b extends Message {
        public final bpn0 f;

        public b(ByteString byteString) {
            super(byteString.z());
            this.f = new bpn0(new h1j(this, 22));
        }

        @Override // com.vk.network.eventhub.api.Message
        public final JSONObject a() {
            return (JSONObject) this.f.getValue();
        }

        @Override // com.vk.network.eventhub.api.Message
        public final byte c() {
            return this.b[0];
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("JsonMessage(service=");
            byte[] bArr = this.b;
            sb.append((Object) yni0.a(bArr[0]));
            sb.append(", jo=");
            sb.append(zq70.m(2, bArr));
            sb.append(')');
            return sb.toString();
        }

        public b(byte b, JSONObject jSONObject) {
            super(jw5.x(new byte[]{b}, jSONObject.toString().getBytes(emb.b)));
            this.f = new bpn0(new h1j(this, 22));
        }
    }
}

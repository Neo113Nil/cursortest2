package com.vk.voip.ui.push;

import androidx.core.app.NotificationCompat;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.o25;
import xsna.zrp;

/* compiled from: AddressedMessageProvider.kt */
/* loaded from: classes7.dex */
public final class AddressedMessageProvider {

    /* compiled from: AddressedMessageProvider.kt */
    public static final class AddressedMessage {
        public final Type a;
        public final UserId b;
        public final JSONObject c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AddressedMessageProvider.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type CALL;
            public static final Type CALL_FINISHED;
            public static final a Companion;
            public static final Type MISSED_CALL;
            private final String type;

            /* compiled from: AddressedMessageProvider.kt */
            public static final class a {
            }

            static {
                Type type = new Type("CALL", 0, NotificationCompat.CATEGORY_CALL);
                CALL = type;
                Type type2 = new Type("MISSED_CALL", 1, NotificationCompat.CATEGORY_MISSED_CALL);
                MISSED_CALL = type2;
                Type type3 = new Type("CALL_FINISHED", 2, "call_finished");
                CALL_FINISHED = type3;
                Type[] typeArr = {type, type2, type3};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
                Companion = new a();
            }

            public Type(String str, int i, String str2) {
                this.type = str2;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }

            public final String h() {
                return this.type;
            }
        }

        public AddressedMessage(Type type, UserId userId, JSONObject jSONObject, String str) {
            this.a = type;
            this.b = userId;
            this.c = jSONObject;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressedMessage)) {
                return false;
            }
            AddressedMessage addressedMessage = (AddressedMessage) obj;
            return this.a == addressedMessage.a && epx.f(this.b, addressedMessage.b) && epx.f(this.c, addressedMessage.c) && epx.f(this.d, addressedMessage.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b.b)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AddressedMessage(type=");
            sb.append(this.a);
            sb.append(", toUserId=");
            sb.append(this.b);
            sb.append(", payload=");
            sb.append(this.c);
            sb.append(", source=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public static AddressedMessage a(String str, JSONObject jSONObject) {
        AddressedMessage.Type type;
        try {
            UserId userId = new UserId(jSONObject.getLong("to_id"));
            AddressedMessage.Type.a aVar = AddressedMessage.Type.Companion;
            String optString = jSONObject.optString("type", "");
            aVar.getClass();
            AddressedMessage.Type[] values = AddressedMessage.Type.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    type = AddressedMessage.Type.CALL;
                    break;
                }
                type = values[i];
                if (epx.f(type.h(), optString)) {
                    break;
                }
                i++;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("body");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return new AddressedMessage(type, userId, optJSONObject, str);
        } catch (Throwable unused) {
            return new AddressedMessage(AddressedMessage.Type.CALL, o25.a().c(), jSONObject, str);
        }
    }
}

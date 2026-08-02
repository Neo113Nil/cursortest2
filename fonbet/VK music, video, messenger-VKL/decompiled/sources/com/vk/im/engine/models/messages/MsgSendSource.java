package com.vk.im.engine.models.messages;

import androidx.annotation.Keep;
import com.vk.im.engine.models.conversations.BotButton;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pq8;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MsgSendSource.kt */
@Keep
/* loaded from: classes2.dex */
public abstract class MsgSendSource {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgSendSource.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BotKbd;
        public static final Type Carousel;
        public static final Type MarusiaSource;
        public static final Type UserInput;

        static {
            Type type = new Type("UserInput", 0);
            UserInput = type;
            Type type2 = new Type("BotKbd", 1);
            BotKbd = type2;
            Type type3 = new Type("Carousel", 2);
            Carousel = type3;
            Type type4 = new Type("MarusiaSource", 3);
            MarusiaSource = type4;
            Type[] typeArr = {type, type2, type3, type4};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: MsgSendSource.kt */
    public static final class a extends b {
    }

    /* compiled from: MsgSendSource.kt */
    public static abstract class b extends MsgSendSource {
        public final BotButton a;
        public final pq8 b;

        public b(BotButton botButton, pq8 pq8Var) {
            super(null);
            this.a = botButton;
            this.b = pq8Var;
        }

        public pq8 a() {
            return this.b;
        }
    }

    /* compiled from: MsgSendSource.kt */
    public static final class c extends b {
        public final pq8.a c;

        public c(BotButton botButton, pq8.a aVar) {
            super(botButton, aVar);
            this.c = aVar;
        }

        @Override // com.vk.im.engine.models.messages.MsgSendSource.b
        public final pq8 a() {
            return this.c;
        }
    }

    /* compiled from: MsgSendSource.kt */
    public static final class d extends MsgSendSource {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            super(null);
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MarusiaSource(skill=");
            sb.append(this.a);
            sb.append(", intent=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: MsgSendSource.kt */
    public static final class e extends MsgSendSource {
        public static final e a = new e(null);
    }

    public /* synthetic */ MsgSendSource(zcl zclVar) {
        this();
    }

    private MsgSendSource() {
    }
}

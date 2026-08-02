package com.vk.im.engine.external;

import xsna.asp;
import xsna.zrp;

/* compiled from: ImMsgPushSettingsProvider.kt */
/* loaded from: classes.dex */
public interface ImMsgPushSettingsProvider {

    /* compiled from: ImMsgPushSettingsProvider.kt */
    public interface OnEnabledUpdateListener {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImMsgPushSettingsProvider.kt */
        public static final class Source {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source IN_APP;
            public static final Source SYSTEM;

            static {
                Source source = new Source("SYSTEM", 0);
                SYSTEM = source;
                Source source2 = new Source("IN_APP", 1);
                IN_APP = source2;
                Source[] sourceArr = {source, source2};
                $VALUES = sourceArr;
                $ENTRIES = new asp(sourceArr);
            }

            public Source() {
                throw null;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImMsgPushSettingsProvider.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CALLS_INCOMING;
        public static final Type CALLS_OUTGOING;
        public static final Type CHATS;
        public static final Type COMMUNITY_CHANNELS;
        public static final Type COMMUNITY_CHANNELS_MESSAGES;
        public static final Type PRIVATE_MESSAGES;

        static {
            Type type = new Type("PRIVATE_MESSAGES", 0);
            PRIVATE_MESSAGES = type;
            Type type2 = new Type("CHATS", 1);
            CHATS = type2;
            Type type3 = new Type("COMMUNITY_CHANNELS_MESSAGES", 2);
            COMMUNITY_CHANNELS_MESSAGES = type3;
            Type type4 = new Type("COMMUNITY_CHANNELS", 3);
            COMMUNITY_CHANNELS = type4;
            Type type5 = new Type("CALLS_INCOMING", 4);
            CALLS_INCOMING = type5;
            Type type6 = new Type("CALLS_OUTGOING", 5);
            CALLS_OUTGOING = type6;
            Type[] typeArr = {type, type2, type3, type4, type5, type6};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static zrp<Type> h() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    void a(OnEnabledUpdateListener onEnabledUpdateListener);

    void b(OnEnabledUpdateListener onEnabledUpdateListener);

    /* compiled from: ImMsgPushSettingsProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final C1111a a = new C1111a();

        /* compiled from: ImMsgPushSettingsProvider.kt */
        /* renamed from: com.vk.im.engine.external.ImMsgPushSettingsProvider$a$a, reason: collision with other inner class name */
        public static final class C1111a implements ImMsgPushSettingsProvider {
            @Override // com.vk.im.engine.external.ImMsgPushSettingsProvider
            public final void a(OnEnabledUpdateListener onEnabledUpdateListener) {
            }

            @Override // com.vk.im.engine.external.ImMsgPushSettingsProvider
            public final void b(OnEnabledUpdateListener onEnabledUpdateListener) {
            }
        }
    }
}

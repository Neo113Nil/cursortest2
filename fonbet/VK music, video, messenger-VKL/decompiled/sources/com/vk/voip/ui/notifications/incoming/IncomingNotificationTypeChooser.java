package com.vk.voip.ui.notifications.incoming;

import android.content.Context;
import xsna.asp;
import xsna.zrp;

/* compiled from: IncomingNotificationTypeChooser.kt */
/* loaded from: classes7.dex */
public final class IncomingNotificationTypeChooser {
    public final Context a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IncomingNotificationTypeChooser.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CUSTOM_VIEW;
        public static final Type INCOMING_CALL_VIEW;
        public static final Type SYSTEM_DECORATED_CUSTOM_VIEW;

        static {
            Type type = new Type("CUSTOM_VIEW", 0);
            CUSTOM_VIEW = type;
            Type type2 = new Type("SYSTEM_DECORATED_CUSTOM_VIEW", 1);
            SYSTEM_DECORATED_CUSTOM_VIEW = type2;
            Type type3 = new Type("INCOMING_CALL_VIEW", 2);
            INCOMING_CALL_VIEW = type3;
            Type[] typeArr = {type, type2, type3};
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

    public IncomingNotificationTypeChooser(Context context) {
        this.a = context;
    }
}

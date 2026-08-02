package com.braze.ui.inappmessage;

import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppMessageOperation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation;", "", "<init>", "(Ljava/lang/String;I)V", "DISPLAY_NOW", "DISPLAY_LATER", "DISCARD", "REENQUEUE", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InAppMessageOperation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InAppMessageOperation[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InAppMessageOperation DISPLAY_NOW = new InAppMessageOperation("DISPLAY_NOW", 0);
    public static final InAppMessageOperation DISPLAY_LATER = new InAppMessageOperation("DISPLAY_LATER", 1);
    public static final InAppMessageOperation DISCARD = new InAppMessageOperation("DISCARD", 2);
    public static final InAppMessageOperation REENQUEUE = new InAppMessageOperation("REENQUEUE", 3);

    private static final /* synthetic */ InAppMessageOperation[] $values() {
        return new InAppMessageOperation[]{DISPLAY_NOW, DISPLAY_LATER, DISCARD, REENQUEUE};
    }

    @JvmStatic
    public static final InAppMessageOperation fromValue(String str) {
        return INSTANCE.fromValue(str);
    }

    public static EnumEntries<InAppMessageOperation> getEntries() {
        return $ENTRIES;
    }

    private InAppMessageOperation(String str, int i) {
    }

    static {
        InAppMessageOperation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: InAppMessageOperation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/inappmessage/InAppMessageOperation$Companion;", "", "<init>", "()V", "fromValue", "Lcom/braze/ui/inappmessage/InAppMessageOperation;", "value", "", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InAppMessageOperation fromValue(String value) {
            Object obj;
            Iterator<E> it = InAppMessageOperation.getEntries().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String name = ((InAppMessageOperation) next).name();
                if (value != null) {
                    Locale US = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US, "US");
                    obj = value.toUpperCase(US);
                    Intrinsics.checkNotNullExpressionValue(obj, "toUpperCase(...)");
                }
                if (Intrinsics.areEqual(name, obj)) {
                    obj = next;
                    break;
                }
            }
            return (InAppMessageOperation) obj;
        }
    }

    public static InAppMessageOperation valueOf(String str) {
        return (InAppMessageOperation) Enum.valueOf(InAppMessageOperation.class, str);
    }

    public static InAppMessageOperation[] values() {
        return (InAppMessageOperation[]) $VALUES.clone();
    }
}

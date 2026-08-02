package com.vk.id.onetap.common.icon.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/id/onetap/common/icon/style/InternalVKIconSizeStyle;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "NORMAL", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIconSizeStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InternalVKIconSizeStyle[] $VALUES;
    public static final InternalVKIconSizeStyle SMALL = new InternalVKIconSizeStyle("SMALL", 0);
    public static final InternalVKIconSizeStyle NORMAL = new InternalVKIconSizeStyle("NORMAL", 1);

    private static final /* synthetic */ InternalVKIconSizeStyle[] $values() {
        return new InternalVKIconSizeStyle[]{SMALL, NORMAL};
    }

    static {
        InternalVKIconSizeStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InternalVKIconSizeStyle(String str, int i11) {
    }

    public static InternalVKIconSizeStyle valueOf(String str) {
        return (InternalVKIconSizeStyle) Enum.valueOf(InternalVKIconSizeStyle.class, str);
    }

    public static InternalVKIconSizeStyle[] values() {
        return (InternalVKIconSizeStyle[]) $VALUES.clone();
    }
}

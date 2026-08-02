package com.vk.id.onetap.common.icon.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/id/onetap/common/icon/style/InternalVKIconColorStyle;", "", "<init>", "(Ljava/lang/String;I)V", "WHITE", "BLUE", "onetap-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InternalVKIconColorStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InternalVKIconColorStyle[] $VALUES;
    public static final InternalVKIconColorStyle WHITE = new InternalVKIconColorStyle("WHITE", 0);
    public static final InternalVKIconColorStyle BLUE = new InternalVKIconColorStyle("BLUE", 1);

    private static final /* synthetic */ InternalVKIconColorStyle[] $values() {
        return new InternalVKIconColorStyle[]{WHITE, BLUE};
    }

    static {
        InternalVKIconColorStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private InternalVKIconColorStyle(String str, int i11) {
    }

    public static InternalVKIconColorStyle valueOf(String str) {
        return (InternalVKIconColorStyle) Enum.valueOf(InternalVKIconColorStyle.class, str);
    }

    public static InternalVKIconColorStyle[] values() {
        return (InternalVKIconColorStyle[]) $VALUES.clone();
    }
}

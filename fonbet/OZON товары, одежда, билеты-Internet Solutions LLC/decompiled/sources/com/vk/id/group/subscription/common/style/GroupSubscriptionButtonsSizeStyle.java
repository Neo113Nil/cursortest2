package com.vk.id.group.subscription.common.style;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0007\u0012\u0004\b\r\u0010\u000b\u001a\u0004\b\f\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/vk/id/group/subscription/common/style/GroupSubscriptionButtonsSizeStyle;", "", "", "heightDp", "textSizeSp", "<init>", "(Ljava/lang/String;III)V", "I", "getHeightDp", "()I", "getHeightDp$annotations", "()V", "getTextSizeSp", "getTextSizeSp$annotations", "DEFAULT", "SMALL_32", "SMALL_34", "SMALL_36", "SMALL_38", "MEDIUM_40", "MEDIUM_42", "MEDIUM_44", "MEDIUM_46", "LARGE_48", "LARGE_50", "LARGE_52", "LARGE_54", "LARGE_56", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class GroupSubscriptionButtonsSizeStyle {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GroupSubscriptionButtonsSizeStyle[] $VALUES;
    private final int heightDp;
    private final int textSizeSp;
    public static final GroupSubscriptionButtonsSizeStyle DEFAULT = new GroupSubscriptionButtonsSizeStyle("DEFAULT", 0, 44, 14);
    public static final GroupSubscriptionButtonsSizeStyle SMALL_32 = new GroupSubscriptionButtonsSizeStyle("SMALL_32", 1, 32, 14);
    public static final GroupSubscriptionButtonsSizeStyle SMALL_34 = new GroupSubscriptionButtonsSizeStyle("SMALL_34", 2, 34, 14);
    public static final GroupSubscriptionButtonsSizeStyle SMALL_36 = new GroupSubscriptionButtonsSizeStyle("SMALL_36", 3, 36, 14);
    public static final GroupSubscriptionButtonsSizeStyle SMALL_38 = new GroupSubscriptionButtonsSizeStyle("SMALL_38", 4, 38, 14);
    public static final GroupSubscriptionButtonsSizeStyle MEDIUM_40 = new GroupSubscriptionButtonsSizeStyle("MEDIUM_40", 5, 40, 16);
    public static final GroupSubscriptionButtonsSizeStyle MEDIUM_42 = new GroupSubscriptionButtonsSizeStyle("MEDIUM_42", 6, 42, 16);
    public static final GroupSubscriptionButtonsSizeStyle MEDIUM_44 = new GroupSubscriptionButtonsSizeStyle("MEDIUM_44", 7, 44, 16);
    public static final GroupSubscriptionButtonsSizeStyle MEDIUM_46 = new GroupSubscriptionButtonsSizeStyle("MEDIUM_46", 8, 46, 16);
    public static final GroupSubscriptionButtonsSizeStyle LARGE_48 = new GroupSubscriptionButtonsSizeStyle("LARGE_48", 9, 48, 18);
    public static final GroupSubscriptionButtonsSizeStyle LARGE_50 = new GroupSubscriptionButtonsSizeStyle("LARGE_50", 10, 50, 17);
    public static final GroupSubscriptionButtonsSizeStyle LARGE_52 = new GroupSubscriptionButtonsSizeStyle("LARGE_52", 11, 52, 17);
    public static final GroupSubscriptionButtonsSizeStyle LARGE_54 = new GroupSubscriptionButtonsSizeStyle("LARGE_54", 12, 54, 17);
    public static final GroupSubscriptionButtonsSizeStyle LARGE_56 = new GroupSubscriptionButtonsSizeStyle("LARGE_56", 13, 56, 17);

    private static final /* synthetic */ GroupSubscriptionButtonsSizeStyle[] $values() {
        return new GroupSubscriptionButtonsSizeStyle[]{DEFAULT, SMALL_32, SMALL_34, SMALL_36, SMALL_38, MEDIUM_40, MEDIUM_42, MEDIUM_44, MEDIUM_46, LARGE_48, LARGE_50, LARGE_52, LARGE_54, LARGE_56};
    }

    static {
        GroupSubscriptionButtonsSizeStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private GroupSubscriptionButtonsSizeStyle(String str, int i11, int i12, int i13) {
        this.heightDp = i12;
        this.textSizeSp = i13;
    }

    public static GroupSubscriptionButtonsSizeStyle valueOf(String str) {
        return (GroupSubscriptionButtonsSizeStyle) Enum.valueOf(GroupSubscriptionButtonsSizeStyle.class, str);
    }

    public static GroupSubscriptionButtonsSizeStyle[] values() {
        return (GroupSubscriptionButtonsSizeStyle[]) $VALUES.clone();
    }

    public final int getHeightDp() {
        return this.heightDp;
    }

    public final int getTextSizeSp() {
        return this.textSizeSp;
    }
}

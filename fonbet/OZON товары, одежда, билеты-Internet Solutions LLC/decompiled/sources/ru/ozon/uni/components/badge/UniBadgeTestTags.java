package ru.ozon.uni.components.badge;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.utils.UniTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "LeftIcon", "Text", "Chevron", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniBadgeTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UniBadgeTestTags[] $VALUES;

    @NotNull
    private static final UniTestTagParameter<UniBadgeTestTags> LeftIconName;

    /* renamed from: Parameters, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UniBadgeTestTags Container = new UniBadgeTestTags("Container", 0);
    public static final UniBadgeTestTags LeftIcon = new UniBadgeTestTags("LeftIcon", 1);
    public static final UniBadgeTestTags Text = new UniBadgeTestTags("Text", 2);
    public static final UniBadgeTestTags Chevron = new UniBadgeTestTags("Chevron", 3);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/components/badge/UniBadgeTestTags$Parameters;", "", "<init>", "()V", "LeftIconName", "Lru/ozon/uni/utils/UniTestTagParameter;", "Lru/ozon/uni/components/badge/UniBadgeTestTags;", "getLeftIconName", "()Lru/ozon/uni/utils/UniTestTagParameter;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.components.badge.UniBadgeTestTags$Parameters, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UniTestTagParameter<UniBadgeTestTags> getLeftIconName() {
            return UniBadgeTestTags.LeftIconName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ UniBadgeTestTags[] $values() {
        return new UniBadgeTestTags[]{Container, LeftIcon, Text, Chevron};
    }

    static {
        UniBadgeTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        LeftIconName = new UniTestTagParameter<>("leftIconName");
    }

    private UniBadgeTestTags(String str, int i11) {
    }

    @NotNull
    public static a<UniBadgeTestTags> getEntries() {
        return $ENTRIES;
    }

    public static UniBadgeTestTags valueOf(String str) {
        return (UniBadgeTestTags) Enum.valueOf(UniBadgeTestTags.class, str);
    }

    public static UniBadgeTestTags[] values() {
        return (UniBadgeTestTags[]) $VALUES.clone();
    }
}

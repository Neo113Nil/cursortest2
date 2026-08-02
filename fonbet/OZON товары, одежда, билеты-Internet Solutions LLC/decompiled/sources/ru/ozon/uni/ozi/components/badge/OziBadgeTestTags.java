package ru.ozon.uni.ozi.components.badge;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/badge/OziBadgeTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "StartGraphic", "Label", "Chevron", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziBadgeTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziBadgeTestTags[] $VALUES;

    /* renamed from: Parameters, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final OziTestTagParameter<OziBadgeTestTags> StartGraphicName;
    public static final OziBadgeTestTags Container = new OziBadgeTestTags("Container", 0);
    public static final OziBadgeTestTags StartGraphic = new OziBadgeTestTags("StartGraphic", 1);
    public static final OziBadgeTestTags Label = new OziBadgeTestTags("Label", 2);
    public static final OziBadgeTestTags Chevron = new OziBadgeTestTags("Chevron", 3);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/badge/OziBadgeTestTags$Parameters;", "", "<init>", "()V", "StartGraphicName", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "Lru/ozon/uni/ozi/components/badge/OziBadgeTestTags;", "getStartGraphicName", "()Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.ozi.components.badge.OziBadgeTestTags$Parameters, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziTestTagParameter<OziBadgeTestTags> getStartGraphicName() {
            return OziBadgeTestTags.StartGraphicName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OziBadgeTestTags[] $values() {
        return new OziBadgeTestTags[]{Container, StartGraphic, Label, Chevron};
    }

    static {
        OziBadgeTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        StartGraphicName = new OziTestTagParameter<>("startGraphicName");
    }

    private OziBadgeTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziBadgeTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziBadgeTestTags valueOf(String str) {
        return (OziBadgeTestTags) Enum.valueOf(OziBadgeTestTags.class, str);
    }

    public static OziBadgeTestTags[] values() {
        return (OziBadgeTestTags[]) $VALUES.clone();
    }
}

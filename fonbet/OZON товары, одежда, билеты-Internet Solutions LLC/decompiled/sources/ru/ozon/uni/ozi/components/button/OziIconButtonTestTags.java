package ru.ozon.uni.ozi.components.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/button/OziIconButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "Icon", "Loader", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIconButtonTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziIconButtonTestTags> IconName;

    /* renamed from: Parameters, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OziIconButtonTestTags Container = new OziIconButtonTestTags("Container", 0);
    public static final OziIconButtonTestTags Icon = new OziIconButtonTestTags("Icon", 1);
    public static final OziIconButtonTestTags Loader = new OziIconButtonTestTags("Loader", 2);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/button/OziIconButtonTestTags$Parameters;", "", "<init>", "()V", "IconName", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "Lru/ozon/uni/ozi/components/button/OziIconButtonTestTags;", "getIconName", "()Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.ozi.components.button.OziIconButtonTestTags$Parameters, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziTestTagParameter<OziIconButtonTestTags> getIconName() {
            return OziIconButtonTestTags.IconName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OziIconButtonTestTags[] $values() {
        return new OziIconButtonTestTags[]{Container, Icon, Loader};
    }

    static {
        OziIconButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        IconName = new OziTestTagParameter<>("iconButtonIconName");
    }

    private OziIconButtonTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziIconButtonTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziIconButtonTestTags valueOf(String str) {
        return (OziIconButtonTestTags) Enum.valueOf(OziIconButtonTestTags.class, str);
    }

    public static OziIconButtonTestTags[] values() {
        return (OziIconButtonTestTags[]) $VALUES.clone();
    }
}

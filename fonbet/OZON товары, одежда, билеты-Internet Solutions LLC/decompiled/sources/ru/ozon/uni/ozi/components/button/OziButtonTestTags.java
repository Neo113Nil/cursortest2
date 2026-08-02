package ru.ozon.uni.ozi.components.button;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/button/OziButtonTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "Icon", "Title", "Subtitle", "Loader", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziButtonTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziButtonTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziButtonTestTags> IconName;

    /* renamed from: Parameters, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OziButtonTestTags Container = new OziButtonTestTags("Container", 0);
    public static final OziButtonTestTags Icon = new OziButtonTestTags("Icon", 1);
    public static final OziButtonTestTags Title = new OziButtonTestTags("Title", 2);
    public static final OziButtonTestTags Subtitle = new OziButtonTestTags("Subtitle", 3);
    public static final OziButtonTestTags Loader = new OziButtonTestTags("Loader", 4);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/uni/ozi/components/button/OziButtonTestTags$Parameters;", "", "<init>", "()V", "IconName", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "Lru/ozon/uni/ozi/components/button/OziButtonTestTags;", "getIconName", "()Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.ozi.components.button.OziButtonTestTags$Parameters, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziTestTagParameter<OziButtonTestTags> getIconName() {
            return OziButtonTestTags.IconName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OziButtonTestTags[] $values() {
        return new OziButtonTestTags[]{Container, Icon, Title, Subtitle, Loader};
    }

    static {
        OziButtonTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        IconName = new OziTestTagParameter<>("buttonIconName");
    }

    private OziButtonTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziButtonTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziButtonTestTags valueOf(String str) {
        return (OziButtonTestTags) Enum.valueOf(OziButtonTestTags.class, str);
    }

    public static OziButtonTestTags[] values() {
        return (OziButtonTestTags[]) $VALUES.clone();
    }
}

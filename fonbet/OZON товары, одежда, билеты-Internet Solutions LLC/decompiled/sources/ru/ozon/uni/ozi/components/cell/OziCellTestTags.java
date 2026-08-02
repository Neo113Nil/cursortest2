package ru.ozon.uni.ozi.components.cell;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/ozi/components/cell/OziCellTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "Separator", "CenterIcon", "CenterBadge", "CenterTitle", "CenterSubtitle", "EndIcon", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziCellTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziCellTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziCellTestTags> CenterIconName;

    @NotNull
    private static final OziTestTagParameter<OziCellTestTags> EndIconName;

    /* renamed from: Parameters, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OziCellTestTags Container = new OziCellTestTags("Container", 0);
    public static final OziCellTestTags Separator = new OziCellTestTags("Separator", 1);
    public static final OziCellTestTags CenterIcon = new OziCellTestTags("CenterIcon", 2);
    public static final OziCellTestTags CenterBadge = new OziCellTestTags("CenterBadge", 3);
    public static final OziCellTestTags CenterTitle = new OziCellTestTags("CenterTitle", 4);
    public static final OziCellTestTags CenterSubtitle = new OziCellTestTags("CenterSubtitle", 5);
    public static final OziCellTestTags EndIcon = new OziCellTestTags("EndIcon", 6);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/cell/OziCellTestTags$Parameters;", "", "<init>", "()V", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "Lru/ozon/uni/ozi/components/cell/OziCellTestTags;", "EndIconName", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "getEndIconName", "()Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.ozi.components.cell.OziCellTestTags$Parameters, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziTestTagParameter<OziCellTestTags> getEndIconName() {
            return OziCellTestTags.EndIconName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OziCellTestTags[] $values() {
        return new OziCellTestTags[]{Container, Separator, CenterIcon, CenterBadge, CenterTitle, CenterSubtitle, EndIcon};
    }

    static {
        OziCellTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        CenterIconName = new OziTestTagParameter<>("cellCenterIconName");
        EndIconName = new OziTestTagParameter<>("cellEndIconName");
    }

    private OziCellTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziCellTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziCellTestTags valueOf(String str) {
        return (OziCellTestTags) Enum.valueOf(OziCellTestTags.class, str);
    }

    public static OziCellTestTags[] values() {
        return (OziCellTestTags[]) $VALUES.clone();
    }
}

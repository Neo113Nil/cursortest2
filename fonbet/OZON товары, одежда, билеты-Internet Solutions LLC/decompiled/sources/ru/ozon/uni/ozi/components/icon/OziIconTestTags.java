package ru.ozon.uni.ozi.components.icon;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagParameter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/ozi/components/icon/OziIconTestTags;", "", "", "<init>", "(Ljava/lang/String;I)V", "Parameters", "Container", "BackgroundImage", "Paranja", "Graphic", "Label", "EmptyIcon", "Shimmer", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziIconTestTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziIconTestTags[] $VALUES;

    @NotNull
    private static final OziTestTagParameter<OziIconTestTags> BackgroundImageName;

    @NotNull
    private static final OziTestTagParameter<OziIconTestTags> IconName;

    /* renamed from: Parameters, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final OziIconTestTags Container = new OziIconTestTags("Container", 0);
    public static final OziIconTestTags BackgroundImage = new OziIconTestTags("BackgroundImage", 1);
    public static final OziIconTestTags Paranja = new OziIconTestTags("Paranja", 2);
    public static final OziIconTestTags Graphic = new OziIconTestTags("Graphic", 3);
    public static final OziIconTestTags Label = new OziIconTestTags("Label", 4);
    public static final OziIconTestTags EmptyIcon = new OziIconTestTags("EmptyIcon", 5);
    public static final OziIconTestTags Shimmer = new OziIconTestTags("Shimmer", 6);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/icon/OziIconTestTags$Parameters;", "", "<init>", "()V", "IconName", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "Lru/ozon/uni/ozi/components/icon/OziIconTestTags;", "getIconName", "()Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "BackgroundImageName", "getBackgroundImageName", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.ozi.components.icon.OziIconTestTags$Parameters, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziTestTagParameter<OziIconTestTags> getBackgroundImageName() {
            return OziIconTestTags.BackgroundImageName;
        }

        @NotNull
        public final OziTestTagParameter<OziIconTestTags> getIconName() {
            return OziIconTestTags.IconName;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ OziIconTestTags[] $values() {
        return new OziIconTestTags[]{Container, BackgroundImage, Paranja, Graphic, Label, EmptyIcon, Shimmer};
    }

    static {
        OziIconTestTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        IconName = new OziTestTagParameter<>("iconName");
        BackgroundImageName = new OziTestTagParameter<>("backgroundImageName");
    }

    private OziIconTestTags(String str, int i11) {
    }

    @NotNull
    public static a<OziIconTestTags> getEntries() {
        return $ENTRIES;
    }

    public static OziIconTestTags valueOf(String str) {
        return (OziIconTestTags) Enum.valueOf(OziIconTestTags.class, str);
    }

    public static OziIconTestTags[] values() {
        return (OziIconTestTags[]) $VALUES.clone();
    }
}

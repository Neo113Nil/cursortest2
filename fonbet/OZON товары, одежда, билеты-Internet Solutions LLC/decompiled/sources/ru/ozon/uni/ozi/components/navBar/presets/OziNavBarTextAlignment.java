package ru.ozon.uni.ozi.components.navBar.presets;

import Sc.o;
import Xc.a;
import Xc.b;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarTextAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "Le1/b$b;", "contentAlignment$uni_release", "()Le1/b$b;", "contentAlignment", "LV1/h;", "textAlignment-e0LSkKk$uni_release", "()I", "textAlignment", "Leading", "Center", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarTextAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ OziNavBarTextAlignment[] $VALUES;
    public static final OziNavBarTextAlignment Leading = new OziNavBarTextAlignment("Leading", 0);
    public static final OziNavBarTextAlignment Center = new OziNavBarTextAlignment("Center", 1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OziNavBarTextAlignment.values().length];
            try {
                iArr[OziNavBarTextAlignment.Leading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OziNavBarTextAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ OziNavBarTextAlignment[] $values() {
        return new OziNavBarTextAlignment[]{Leading, Center};
    }

    static {
        OziNavBarTextAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private OziNavBarTextAlignment(String str, int i11) {
    }

    public static OziNavBarTextAlignment valueOf(String str) {
        return (OziNavBarTextAlignment) Enum.valueOf(OziNavBarTextAlignment.class, str);
    }

    public static OziNavBarTextAlignment[] values() {
        return (OziNavBarTextAlignment[]) $VALUES.clone();
    }

    @NotNull
    public final InterfaceC6250b.InterfaceC0966b contentAlignment$uni_release() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return InterfaceC6250b.a.k();
        }
        if (i11 == 2) {
            return InterfaceC6250b.a.g();
        }
        throw new o();
    }

    /* renamed from: textAlignment-e0LSkKk$uni_release, reason: not valid java name */
    public final int m3119textAlignmente0LSkKk$uni_release() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return 5;
        }
        if (i11 == 2) {
            return 3;
        }
        throw new o();
    }
}

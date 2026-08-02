package ru.ozon.uni.android.ds.compose.component.textarea;

import S0.InterfaceC3967k;
import U7.l;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;", "toStyle$uni_release", "(LS0/k;I)Lru/ozon/uni/android/ds/compose/component/textarea/DsTextAreaStyle;", "toStyle", "DEFAULT", "SUCCESS", "ERROR", "DISABLED", "READ_ONLY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTextAreaStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DsTextAreaStatus[] $VALUES;
    public static final DsTextAreaStatus DEFAULT = new DsTextAreaStatus("DEFAULT", 0);
    public static final DsTextAreaStatus SUCCESS = new DsTextAreaStatus("SUCCESS", 1);
    public static final DsTextAreaStatus ERROR = new DsTextAreaStatus("ERROR", 2);
    public static final DsTextAreaStatus DISABLED = new DsTextAreaStatus("DISABLED", 3);
    public static final DsTextAreaStatus READ_ONLY = new DsTextAreaStatus("READ_ONLY", 4);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DsTextAreaStatus.values().length];
            try {
                iArr[DsTextAreaStatus.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DsTextAreaStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DsTextAreaStatus.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DsTextAreaStatus.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DsTextAreaStatus.READ_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DsTextAreaStatus[] $values() {
        return new DsTextAreaStatus[]{DEFAULT, SUCCESS, ERROR, DISABLED, READ_ONLY};
    }

    static {
        DsTextAreaStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private DsTextAreaStatus(String str, int i11) {
    }

    public static DsTextAreaStatus valueOf(String str) {
        return (DsTextAreaStatus) Enum.valueOf(DsTextAreaStatus.class, str);
    }

    public static DsTextAreaStatus[] values() {
        return (DsTextAreaStatus[]) $VALUES.clone();
    }

    @NotNull
    public final DsTextAreaStyle toStyle$uni_release(InterfaceC3967k interfaceC3967k, int i11) {
        DsTextAreaStyle m1828default;
        interfaceC3967k.o(-224949094);
        int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i12 == 1) {
            interfaceC3967k.o(-425208086);
            m1828default = DsTextAreaStyle.INSTANCE.m1828default(interfaceC3967k, 6);
            interfaceC3967k.k();
        } else if (i12 == 2) {
            interfaceC3967k.o(-425206646);
            m1828default = DsTextAreaStyle.INSTANCE.success(interfaceC3967k, 6);
            interfaceC3967k.k();
        } else if (i12 == 3) {
            interfaceC3967k.o(-425205272);
            m1828default = DsTextAreaStyle.INSTANCE.error(interfaceC3967k, 6);
            interfaceC3967k.k();
        } else if (i12 == 4) {
            interfaceC3967k.o(-425203861);
            m1828default = DsTextAreaStyle.INSTANCE.disabled(interfaceC3967k, 6);
            interfaceC3967k.k();
        } else {
            if (i12 != 5) {
                throw l.c(interfaceC3967k, -425209418);
            }
            interfaceC3967k.o(-425202325);
            m1828default = DsTextAreaStyle.INSTANCE.readOnly(interfaceC3967k, 6);
            interfaceC3967k.k();
        }
        interfaceC3967k.k();
        return m1828default;
    }
}

package androidx.compose.foundation.layout;

import xsna.asp;
import xsna.ozl;
import xsna.zrp;

/* compiled from: FlowLayoutOverflow.kt */
@ozl
/* loaded from: classes11.dex */
public abstract class FlowLayoutOverflow {
    public final OverflowType a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlowLayoutOverflow.kt */
    public static final class OverflowType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OverflowType[] $VALUES;
        public static final OverflowType Clip;
        public static final OverflowType ExpandIndicator;
        public static final OverflowType ExpandOrCollapseIndicator;
        public static final OverflowType Visible;

        static {
            OverflowType overflowType = new OverflowType("Visible", 0);
            Visible = overflowType;
            OverflowType overflowType2 = new OverflowType("Clip", 1);
            Clip = overflowType2;
            OverflowType overflowType3 = new OverflowType("ExpandIndicator", 2);
            ExpandIndicator = overflowType3;
            OverflowType overflowType4 = new OverflowType("ExpandOrCollapseIndicator", 3);
            ExpandOrCollapseIndicator = overflowType4;
            OverflowType[] overflowTypeArr = {overflowType, overflowType2, overflowType3, overflowType4};
            $VALUES = overflowTypeArr;
            $ENTRIES = new asp(overflowTypeArr);
        }

        public OverflowType() {
            throw null;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    /* compiled from: FlowLayoutOverflow.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflow(OverflowType overflowType) {
        this.a = overflowType;
    }
}

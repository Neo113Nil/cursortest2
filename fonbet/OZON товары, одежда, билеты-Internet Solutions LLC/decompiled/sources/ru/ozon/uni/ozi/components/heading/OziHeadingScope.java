package ru.ozon.uni.ozi.components.heading;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ozon/uni/ozi/components/heading/OziHeadingScope;", "", "<init>", "()V", "AddonMarker", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziHeadingScope {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/ozi/components/heading/OziHeadingScope$AddonMarker;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "End", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AddonMarker {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AddonMarker[] $VALUES;
        public static final AddonMarker Top = new AddonMarker("Top", 0);
        public static final AddonMarker End = new AddonMarker("End", 1);

        private static final /* synthetic */ AddonMarker[] $values() {
            return new AddonMarker[]{Top, End};
        }

        static {
            AddonMarker[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private AddonMarker(String str, int i11) {
        }

        public static AddonMarker valueOf(String str) {
            return (AddonMarker) Enum.valueOf(AddonMarker.class, str);
        }

        public static AddonMarker[] values() {
            return (AddonMarker[]) $VALUES.clone();
        }
    }
}

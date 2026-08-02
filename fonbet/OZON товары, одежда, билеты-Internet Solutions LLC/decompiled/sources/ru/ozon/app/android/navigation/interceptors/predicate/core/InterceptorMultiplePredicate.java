package ru.ozon.app.android.navigation.interceptors.predicate.core;

import Sc.o;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate;", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "mode", "Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "getMode", "()Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "predicates", "", "getPredicates", "()[Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorPredicate;", "invoke", "", "Mode", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InterceptorMultiplePredicate extends InterceptorPredicate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean invoke(@NotNull InterceptorMultiplePredicate interceptorMultiplePredicate) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[interceptorMultiplePredicate.getMode().ordinal()];
            if (i11 == 1) {
                for (InterceptorPredicate interceptorPredicate : interceptorMultiplePredicate.getPredicates()) {
                    if (interceptorPredicate.invoke()) {
                        return true;
                    }
                }
                return false;
            }
            if (i11 != 2) {
                throw new o();
            }
            for (InterceptorPredicate interceptorPredicate2 : interceptorMultiplePredicate.getPredicates()) {
                if (!interceptorPredicate2.invoke()) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/navigation/interceptors/predicate/core/InterceptorMultiplePredicate$Mode;", "", "<init>", "(Ljava/lang/String;I)V", "ANY", "ALL", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ANY = new Mode("ANY", 0);
        public static final Mode ALL = new Mode("ALL", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{ANY, ALL};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Mode(String str, int i11) {
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    Mode getMode();

    @NotNull
    InterceptorPredicate[] getPredicates();

    @Override // ru.ozon.app.android.navigation.interceptors.predicate.core.InterceptorPredicate
    boolean invoke();
}

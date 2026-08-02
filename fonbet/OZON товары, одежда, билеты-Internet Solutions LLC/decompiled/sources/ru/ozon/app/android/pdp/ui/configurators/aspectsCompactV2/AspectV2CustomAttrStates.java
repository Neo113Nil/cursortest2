package ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.R$attr;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u001c\u0010\u0003\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectV2CustomAttrStates;", "", "", "isProbably", "()Z", "setProbably", "(Z)V", "Companion", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AspectV2CustomAttrStates {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/AspectV2CustomAttrStates$Companion;", "", "<init>", "()V", "STATE_PROBABLY_DISABLED", "", "getSTATE_PROBABLY_DISABLED", "()I", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int STATE_PROBABLY_DISABLED = R$attr.state_partially_disabled;

        private Companion() {
        }

        public final int getSTATE_PROBABLY_DISABLED() {
            return STATE_PROBABLY_DISABLED;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static int[] customDrawableState(@NotNull AspectV2CustomAttrStates aspectV2CustomAttrStates) {
            ArrayList arrayList = new ArrayList();
            if (aspectV2CustomAttrStates.isProbably()) {
                arrayList.add(Integer.valueOf(AspectV2CustomAttrStates.INSTANCE.getSTATE_PROBABLY_DISABLED()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                return C7714v.T0(arrayList);
            }
            return null;
        }
    }

    boolean isProbably();
}

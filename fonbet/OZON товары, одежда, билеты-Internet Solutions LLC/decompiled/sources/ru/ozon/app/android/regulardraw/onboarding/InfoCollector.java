package ru.ozon.app.android.regulardraw.onboarding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.onboarding.OnboardingModel;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003BE\u0012\u0014\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\u0005\u0012&\u0010\u0007\u001a\"\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0007\u001a\"\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00028\u00000\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/onboarding/InfoCollector;", "T", "Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;", "", "requiredTypes", "", "Ljava/lang/Class;", "onInfoCollected", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V", "collectedInfo", "", "addInfo", "info", "(Lru/ozon/app/android/regulardraw/onboarding/OnboardingModel;)V", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InfoCollector<T extends OnboardingModel> {

    @NotNull
    private final Map<Class<? extends T>, T> collectedInfo;

    @NotNull
    private final Function1<Map<Class<? extends T>, ? extends T>, Unit> onInfoCollected;

    @NotNull
    private final Set<Class<? extends T>> requiredTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public InfoCollector(@NotNull Set<? extends Class<? extends T>> requiredTypes, @NotNull Function1<? super Map<Class<? extends T>, ? extends T>, Unit> onInfoCollected) {
        Intrinsics.checkNotNullParameter(requiredTypes, "requiredTypes");
        Intrinsics.checkNotNullParameter(onInfoCollected, "onInfoCollected");
        this.requiredTypes = requiredTypes;
        this.onInfoCollected = onInfoCollected;
        this.collectedInfo = new LinkedHashMap();
    }

    public final void addInfo(@NotNull T info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Class<?> cls = info.getClass();
        if (this.requiredTypes.contains(cls)) {
            this.collectedInfo.put(cls, info);
        }
        if (this.collectedInfo.size() == this.requiredTypes.size()) {
            this.onInfoCollected.invoke(this.collectedInfo);
            this.collectedInfo.clear();
        }
    }
}

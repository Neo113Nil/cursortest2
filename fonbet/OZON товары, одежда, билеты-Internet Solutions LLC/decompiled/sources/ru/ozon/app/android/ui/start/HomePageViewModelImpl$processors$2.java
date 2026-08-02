package ru.ozon.app.android.ui.start;

import Vc.a;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ui.start.launch.LauncherStateDialogProcessor;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/LinkedList;", "Lru/ozon/app/android/ui/start/launch/LauncherStateDialogProcessor;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/LinkedList;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class HomePageViewModelImpl$processors$2 extends AbstractC7737t implements Function0<LinkedList<LauncherStateDialogProcessor>> {
    final /* synthetic */ Set<LauncherStateDialogProcessor> $dialogProcessors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomePageViewModelImpl$processors$2(Set<LauncherStateDialogProcessor> set) {
        super(0);
        this.$dialogProcessors = set;
    }

    @Override // kotlin.jvm.functions.Function0
    public final LinkedList<LauncherStateDialogProcessor> invoke() {
        return new LinkedList<>(C7714v.I0(new Comparator() { // from class: ru.ozon.app.android.ui.start.HomePageViewModelImpl$processors$2$invoke$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t2, T t11) {
                return a.b(Integer.valueOf(((LauncherStateDialogProcessor) t11).getPriority()), Integer.valueOf(((LauncherStateDialogProcessor) t2).getPriority()));
            }
        }, this.$dialogProcessors));
    }
}

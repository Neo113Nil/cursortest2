package bo.app;

import com.braze.Constants;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0003B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lbo/app/o6;", "", "Lbo/app/y2;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/y2;", "nextFallbackTriggeredAction", "", "fallbackActions", "<init>", "(Ljava/util/List;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class o6 {
    public static final a b = new a(null);
    private static final Comparator<y2> c = new Comparator() { // from class: bo.app.o6$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int a2;
            a2 = o6.a((y2) obj, (y2) obj2);
            return a2;
        }
    };
    private final PriorityQueue<y2> a;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lbo/app/o6$a;", "", "", "INITIAL_TRIGGER_CAPACITY", "I", "Ljava/util/Comparator;", "Lbo/app/y2;", "kotlin.jvm.PlatformType", "triggeredActionComparator", "Ljava/util/Comparator;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public o6(List<? extends y2> fallbackActions) {
        Intrinsics.checkNotNullParameter(fallbackActions, "fallbackActions");
        PriorityQueue<y2> priorityQueue = new PriorityQueue<>(12, c);
        this.a = priorityQueue;
        priorityQueue.addAll(fallbackActions);
    }

    public final y2 a() {
        return this.a.poll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(y2 actionA, y2 actionB) {
        Intrinsics.checkNotNullParameter(actionA, "actionA");
        Intrinsics.checkNotNullParameter(actionB, "actionB");
        int u = actionA.f().u();
        int u2 = actionB.f().u();
        if (u > u2) {
            return -1;
        }
        if (u < u2) {
            return 1;
        }
        return actionA.getId().compareTo(actionB.getId());
    }
}

package bo.app;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0011"}, d2 = {"Lbo/app/f1;", "Lbo/app/w1;", "", "c", "", "normalSleepDurationMs", Constants.BRAZE_PUSH_CONTENT_KEY, "", "b", "()Z", "isBackingOff", "()I", "newSleepDurationAfterFailure", "maxSleepDurationMs", "defaultNormalSleepDurationMs", "<init>", "(II)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class f1 implements w1 {
    public static final a e = new a(null);
    private final int a;
    private final int b;
    private final Random c;
    private int d;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000bJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lbo/app/f1$a;", "", "Ljava/util/Random;", "random", "", "valueA", "valueB", Constants.BRAZE_PUSH_CONTENT_KEY, "minimumSleepTimeMs", "I", "getMinimumSleepTimeMs$annotations", "()V", "scaleFactor", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int a(Random random, int valueA, int valueB) {
            Intrinsics.checkNotNullParameter(random, "random");
            return random.nextInt(Math.abs(valueA - valueB) + 1) + Math.min(valueA, valueB);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.IntRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.IntRef intRef) {
            super(0);
            this.b = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Sleep time too small: " + this.b.element + " increasing to 250";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Computing new sleep delay. Previous sleep delay: ", Integer.valueOf(f1.this.d));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.IntRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Ref.IntRef intRef) {
            super(0);
            this.c = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New sleep duration: " + f1.this.d + " ms. Default sleep duration: " + this.c.element + " ms. Max sleep: " + f1.this.a + " ms.";
        }
    }

    public f1(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = new Random();
    }

    public void c() {
        this.d = 0;
    }

    @Override // bo.app.w1
    public int a() {
        return a(this.b);
    }

    public boolean b() {
        return this.d != 0;
    }

    public int a(int normalSleepDurationMs) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = normalSleepDurationMs;
        if (normalSleepDurationMs < 250) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(intRef), 3, (Object) null);
            intRef.element = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        if (this.d == 0) {
            this.d = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new c(), 3, (Object) null);
        this.d = Math.min(this.a, e.a(this.c, Math.max(intRef.element, this.d), this.d * 3));
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(intRef), 3, (Object) null);
        return this.d;
    }

    public /* synthetic */ f1(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? (int) TimeUnit.SECONDS.toMillis(1L) : i2);
    }
}

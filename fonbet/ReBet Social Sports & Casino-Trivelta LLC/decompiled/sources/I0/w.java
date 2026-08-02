package I0;

import Ph.InterfaceC1484x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class w {

    public static final class a extends w {

        /* renamed from: a, reason: collision with root package name */
        public final Function2 f5297a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1484x f5298b;

        /* renamed from: c, reason: collision with root package name */
        public final D f5299c;

        /* renamed from: d, reason: collision with root package name */
        public final CoroutineContext f5300d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, InterfaceC1484x ack, D d10, CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f5297a = transform;
            this.f5298b = ack;
            this.f5299c = d10;
            this.f5300d = callerContext;
        }

        public final InterfaceC1484x a() {
            return this.f5298b;
        }

        public final CoroutineContext b() {
            return this.f5300d;
        }

        public D c() {
            return this.f5299c;
        }

        public final Function2 d() {
            return this.f5297a;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public w() {
    }
}

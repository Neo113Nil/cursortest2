package D7;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends D7.a {

    /* renamed from: j, reason: collision with root package name */
    public static final a f2576j = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final M6.c a(d0 producer, l0 settableProducerContext, J7.d listener) {
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new d(producer, settableProducerContext, listener, null);
        }

        public a() {
        }
    }

    public /* synthetic */ d(d0 d0Var, l0 l0Var, J7.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, dVar);
    }

    public d(d0 d0Var, l0 l0Var, J7.d dVar) {
        super(d0Var, l0Var, dVar);
    }
}

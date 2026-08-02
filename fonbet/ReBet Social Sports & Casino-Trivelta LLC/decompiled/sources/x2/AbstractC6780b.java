package x2;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import u2.C6487a;
import u2.C6488b;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6780b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f67822a = new a(null);

    /* renamed from: x2.b$a */
    public static final class a {

        /* renamed from: x2.b$a$a, reason: collision with other inner class name */
        public static final class C0965a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Context f67823d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0965a(Context context) {
                super(1);
                this.f67823d = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6782d invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C6782d(this.f67823d);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC6780b a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C6487a c6487a = C6487a.f65958a;
            c6487a.a();
            if (c6487a.a() >= 5) {
                return new C6785g(context);
            }
            if (c6487a.b() >= 9) {
                return (AbstractC6780b) C6488b.f65961a.a(context, "MeasurementManager", new C0965a(context));
            }
            return null;
        }

        public a() {
        }
    }

    public abstract Object a(AbstractC6779a abstractC6779a, Continuation continuation);

    public abstract Object b(Continuation continuation);

    public abstract Object c(Uri uri, InputEvent inputEvent, Continuation continuation);

    public abstract Object d(AbstractC6791m abstractC6791m, Continuation continuation);

    public abstract Object e(Uri uri, Continuation continuation);

    public abstract Object f(AbstractC6792n abstractC6792n, Continuation continuation);

    public abstract Object g(AbstractC6793o abstractC6793o, Continuation continuation);
}

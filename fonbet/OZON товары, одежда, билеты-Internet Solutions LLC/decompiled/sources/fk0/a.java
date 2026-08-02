package fk0;

import Sc.k;
import Sc.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f63623a;

    /* renamed from: fk0.a$a, reason: collision with other inner class name */
    private static final class C1029a extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private static final String[] f63624a = {"android.widget.", "android.webkit.", "android.app."};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1029a(@NotNull Context context) {
            super(LayoutInflater.from(context), context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.LayoutInflater
        @NotNull
        public final LayoutInflater cloneInContext(@NotNull Context newContext) {
            Intrinsics.checkNotNullParameter(newContext, "newContext");
            return new C1029a(newContext);
        }

        @Override // android.view.LayoutInflater
        @NotNull
        protected final View onCreateView(@NotNull String name, @NotNull AttributeSet attrs) {
            View createView;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            String[] strArr = f63624a;
            for (int i11 = 0; i11 < 3; i11++) {
                try {
                    createView = createView(name, strArr[i11], attrs);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            View onCreateView = super.onCreateView(name, attrs);
            Intrinsics.checkNotNullExpressionValue(onCreateView, "onCreateView(...)");
            return onCreateView;
        }
    }

    static final class b extends AbstractC7737t implements Function0<C1029a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f63625b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(0);
            this.f63625b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1029a invoke() {
            return new C1029a(this.f63625b);
        }
    }

    public a(@NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        this.f63623a = k.a(n.SYNCHRONIZED, new b(activityContext));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @NotNull
    public final View a(int i11, g gVar) {
        View inflate = ((C1029a) this.f63623a.getValue()).inflate(i11, (ViewGroup) gVar, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }
}

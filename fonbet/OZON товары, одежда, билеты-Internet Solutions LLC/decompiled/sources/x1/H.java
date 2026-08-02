package x1;

import android.view.MotionEvent;
import c2.C5728b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class H {

    static final class a extends AbstractC7737t implements Function1<MotionEvent, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5728b f104830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5728b c5728b) {
            super(1);
            this.f104830b = c5728b;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean dispatchTouchEvent;
            MotionEvent motionEvent2 = motionEvent;
            int actionMasked = motionEvent2.getActionMasked();
            C5728b c5728b = this.f104830b;
            switch (actionMasked) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    dispatchTouchEvent = c5728b.dispatchTouchEvent(motionEvent2);
                    break;
                default:
                    dispatchTouchEvent = c5728b.dispatchGenericMotionEvent(motionEvent2);
                    break;
            }
            return Boolean.valueOf(dispatchTouchEvent);
        }
    }

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull C5728b c5728b) {
        G g10 = new G();
        g10.f104820a = new a(c5728b);
        K k11 = new K();
        g10.c(k11);
        c5728b.s(k11);
        return eVar.l0(g10);
    }
}

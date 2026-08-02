package td0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;

/* loaded from: classes3.dex */
final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final OzonTextInput f99436a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f99437b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7735q f99438c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull OzonTextInput view, @NotNull String trackAction, @NotNull Function1<? super String, Unit> trackFocus) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackAction, "trackAction");
        Intrinsics.checkNotNullParameter(trackFocus, "trackFocus");
        this.f99436a = view;
        this.f99437b = trackAction;
        this.f99438c = (C7735q) trackFocus;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (view2 == this.f99436a) {
            this.f99438c.invoke(this.f99437b);
        }
    }
}

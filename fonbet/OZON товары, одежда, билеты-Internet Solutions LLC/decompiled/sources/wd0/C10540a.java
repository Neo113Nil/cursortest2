package wd0;

import Jb0.z;
import androidx.fragment.app.G;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.component.sheet.SheetView;
import vd0.InterfaceC10308a;
import yd0.C10886a;

/* renamed from: wd0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10540a implements InterfaceC10308a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f104393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SheetView f104394b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final z f104395c;

    /* renamed from: d, reason: collision with root package name */
    private C10886a f104396d;

    public C10540a(@NotNull r activity, @NotNull SheetView sheetView, @NotNull z loaderBinding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sheetView, "sheetView");
        Intrinsics.checkNotNullParameter(loaderBinding, "loaderBinding");
        this.f104393a = activity;
        this.f104394b = sheetView;
        this.f104395c = loaderBinding;
    }

    public final void a(boolean z11) {
        C10886a c10886a = this.f104396d;
        if (c10886a != null) {
            c10886a.b(z11);
        }
    }

    public final void b() {
        this.f104396d = new C10886a(this.f104395c, false);
        G supportFragmentManager = this.f104393a.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Q p11 = supportFragmentManager.p();
        Intrinsics.checkNotNullExpressionValue(p11, "beginTransaction()");
        p11.d(this.f104394b, "SheetViewDialog");
        p11.i();
    }

    @Override // vd0.InterfaceC10308a
    public final void dismiss() {
        C10886a c10886a = this.f104396d;
        if (c10886a != null) {
            c10886a.a();
        }
        this.f104396d = null;
        this.f104394b.dismiss();
    }
}

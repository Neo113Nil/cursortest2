package ec0;

import Bc0.l;
import Bc0.m;
import Sc.InterfaceC4008j;
import Sc.n;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import kc0.InterfaceC7643a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import wd0.C10540a;
import xe.C10727i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lec0/h;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final y0 f62133a;

    public static final class a extends AbstractC7737t implements Function0<z0.b> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f62135c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(0);
            this.f62135c = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final z0.b invoke() {
            return new g(h.this, this.f62135c);
        }
    }

    public h() {
        super(R.layout.fragment_ozon_id_merge_account);
        a aVar = new a(this);
        InterfaceC4008j a11 = Sc.k.a(n.NONE, new l(new Bc0.k(this)));
        this.f62133a = b0.b(this, N.b(j.class), new m(a11), new Bc0.n(a11), aVar);
    }

    public static void t(h hVar, EntryDTO.SubmitButtonDTO submitButtonDTO) {
        ((j) hVar.f62133a.getValue()).e1(submitButtonDTO.getAction(), submitButtonDTO.getData());
    }

    public static final j u(h hVar) {
        return (j) hVar.f62133a.getValue();
    }

    public static final void v(h hVar, InterfaceC7643a.b bVar) {
        ((C10540a) Oc0.b.a(hVar, bVar.b(), new e(1, (j) hVar.f62133a.getValue(), j.class, "onUrlLinkClicked", "onUrlLinkClicked(Ljava/lang/String;)V", 0), new f(hVar, bVar))).b();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Jb0.n a11 = Jb0.n.a(view);
        j jVar = (j) this.f62133a.getValue();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new C6344b(viewLifecycleOwner, null, jVar, this, a11), 3);
    }
}

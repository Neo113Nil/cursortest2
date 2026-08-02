package ve;

import android.R;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24915a;

    /* renamed from: b, reason: collision with root package name */
    public final ze.a f24916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList images = new ArrayList();
        this.f24915a = images;
        Intrinsics.checkNotNullParameter(images, "images");
        ze.a aVar = new ze.a();
        aVar.f25922a = images;
        this.f24916b = aVar;
        aVar.f25924c = this;
        aVar.f25923b = new r7.a(17, this);
    }

    public final void a() {
        ze.a builder = this.f24916b;
        builder.getClass();
        ArrayList arrayList = builder.f25922a;
        if (getParent() != null) {
            ViewParent parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        ze.b bVar = new ze.b();
        bVar.f25925a = builder;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        if (arrayList.isEmpty()) {
            io.sentry.android.core.w0.m("b", "Images list cannot be empty! Viewer ignored.");
            return;
        }
        ze.g gVar = new ze.g(context);
        gVar.setParams(builder);
        gVar.setOnDismissListener(bVar);
        gVar.b(arrayList);
        bVar.f25927c = gVar;
        androidx.appcompat.app.k kVar = new androidx.appcompat.app.k(context, R.style.Theme.Translucent.NoTitleBar);
        kVar.setView(bVar.f25927c);
        kVar.setOnKeyListener(bVar);
        androidx.appcompat.app.l create = kVar.create();
        create.setOnDismissListener(new sd.i(3, bVar));
        bVar.f25926b = create;
        create.show();
    }
}

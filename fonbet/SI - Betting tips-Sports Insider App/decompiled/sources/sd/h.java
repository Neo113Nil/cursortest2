package sd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.x0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public List f23481a;

    /* renamed from: b, reason: collision with root package name */
    public com.android.billingclient.api.i f23482b;

    @Override // androidx.recyclerview.widget.x0
    public final int getItemCount() {
        return this.f23481a.size();
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemViewType(int i5) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onBindViewHolder(d2 d2Var, int i5) {
        lc.e eVar;
        g holder = (g) d2Var;
        List list = this.f23481a;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i5 == -1 || i5 >= list.size() || (eVar = (lc.e) list.get(i5)) == null) {
            return;
        }
        holder.b(eVar);
    }

    @Override // androidx.recyclerview.widget.x0
    public final d2 onCreateViewHolder(ViewGroup parent, int i5) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        FrameLayout view = new FrameLayout(parent.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(io.sentry.config.a.o(16), io.sentry.config.a.o(8), io.sentry.config.a.o(16), io.sentry.config.a.o(8));
        view.setPadding(io.sentry.config.a.o(2), io.sentry.config.a.o(2), io.sentry.config.a.o(2), io.sentry.config.a.o(2));
        view.setLayoutParams(layoutParams);
        View appCompatImageView = new AppCompatImageView(parent.getContext(), null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(io.sentry.config.a.o(96), io.sentry.config.a.o(96));
        layoutParams2.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams2);
        appCompatImageView.setTag("iv");
        appCompatImageView.setBackgroundColor(-3355444);
        view.addView(appCompatImageView);
        Intrinsics.checkNotNullParameter(view, "view");
        g gVar = new g(view);
        gVar.itemView.setOnClickListener(new xe.g(1000L, new fg.d(14, gVar, this)));
        return gVar;
    }
}

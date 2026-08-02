package T8;

import T8.g;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.ui.views.GifView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class p extends o {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11344a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Function2 f11345b = a.f11346d;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11346d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke(ViewGroup parent, g.a aVar) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
            P8.h c10 = P8.h.c(LayoutInflater.from(parent.getContext()), parent, false);
            TextView textView = c10.f8894k;
            O8.k kVar = O8.k.f8390a;
            textView.setTextColor(kVar.h().w());
            c10.f8888e.setTextColor(kVar.h().w());
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(\n               …or)\n                    }");
            FrameLayout b10 = c10.b();
            Intrinsics.checkNotNullExpressionValue(b10, "binding.root");
            return new p(b10);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 a() {
            return p.f11345b;
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // T8.o
    public void b(Object obj) {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        StaggeredGridLayoutManager.c cVar = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
        if (cVar != null) {
            cVar.g(true);
        }
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        RecyclerView.r rVar = layoutParams2 instanceof RecyclerView.r ? (RecyclerView.r) layoutParams2 : null;
        if (rVar != null) {
            ((ViewGroup.MarginLayoutParams) rVar).width = Resources.getSystem().getDisplayMetrics().widthPixels;
        }
        User user = obj instanceof User ? (User) obj : null;
        if (user == null) {
            return;
        }
        P8.h a10 = P8.h.a(this.itemView);
        a10.f8894k.setText(user.getDisplayName());
        a10.f8888e.setText('@' + user.getUsername());
        a10.f8895l.setVisibility(user.getVerified() ? 0 : 8);
        a10.f8886c.m(user.getBannerUrl());
        a10.f8893j.m(user.getAvatarUrl());
    }

    @Override // T8.o
    public void d() {
        P8.h a10 = P8.h.a(this.itemView);
        for (GifView gifView : CollectionsKt.listOf((Object[]) new GifView[]{a10.f8886c, a10.f8893j})) {
            gifView.setGifCallback(null);
            gifView.u();
        }
    }
}

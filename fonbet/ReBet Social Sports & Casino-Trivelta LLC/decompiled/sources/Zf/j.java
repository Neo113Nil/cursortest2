package Zf;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.load.engine.q;
import com.zoho.livechat.android.ui.customviews.ZoomableImageView;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od.n;

/* loaded from: classes4.dex */
public final class j extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    public List f14825c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14826d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f14827e;

    public static final class a implements L4.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ud.l f14828a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f14829b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.zoho.livechat.android.models.a f14830c;

        public a(ud.l lVar, j jVar, com.zoho.livechat.android.models.a aVar) {
            this.f14828a = lVar;
            this.f14829b = jVar;
            this.f14830c = aVar;
        }

        @Override // L4.g
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean f(Drawable resource, Object model, M4.j jVar, com.bumptech.glide.load.a dataSource, boolean z10) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            this.f14828a.f66328b.setImageDrawable(resource);
            if (!Intrinsics.areEqual(this.f14829b.f14826d, this.f14830c.c())) {
                return true;
            }
            this.f14829b.f14827e.invoke();
            return true;
        }

        @Override // L4.g
        public boolean k(q qVar, Object obj, M4.j target, boolean z10) {
            Intrinsics.checkNotNullParameter(target, "target");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ImageTest, ImageAdapter, onLoadFailed ");
            sb2.append(qVar != null ? qVar.getMessage() : null);
            LiveChatUtil.log(sb2.toString());
            return false;
        }
    }

    public j(List imagesItemList, String str, Function0 onOpenedImageResourceLoaded) {
        Intrinsics.checkNotNullParameter(imagesItemList, "imagesItemList");
        Intrinsics.checkNotNullParameter(onOpenedImageResourceLoaded, "onOpenedImageResourceLoaded");
        this.f14825c = imagesItemList;
        this.f14826d = str;
        this.f14827e = onOpenedImageResourceLoaded;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup container, int i10, Object item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        container.removeView((LinearLayout) item);
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        return this.f14825c.size();
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup container, int i10) {
        Intrinsics.checkNotNullParameter(container, "container");
        ud.l c10 = ud.l.c(LayoutInflater.from(container.getContext()));
        Intrinsics.checkNotNullExpressionValue(c10, "inflate(...)");
        c10.f66328b.setScaleType(ImageView.ScaleType.MATRIX);
        c10.f66328b.n();
        com.zoho.livechat.android.models.a aVar = (com.zoho.livechat.android.models.a) this.f14825c.get(i10);
        wd.d dVar = wd.d.f67581a;
        ZoomableImageView zoomableImageView = c10.f66328b;
        File a10 = aVar.a();
        a aVar2 = new a(c10, this, aVar);
        String absolutePath = aVar.a().getAbsolutePath();
        int d10 = androidx.core.content.res.k.d(container.getContext().getResources(), n.f59933m, container.getContext().getTheme());
        Intrinsics.checkNotNull(zoomableImageView);
        wd.d.K(zoomableImageView, a10, null, false, false, aVar2, Integer.valueOf(d10), null, absolutePath, null, true, null, 2716, null);
        container.addView(c10.b());
        LinearLayout b10 = c10.b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        return b10;
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object any) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(any, "any");
        return view == any;
    }

    @Override // androidx.viewpager.widget.a
    public void n(ViewGroup container, int i10, Object item) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    public final void u(List messagesList) {
        Intrinsics.checkNotNullParameter(messagesList, "messagesList");
        this.f14825c = messagesList;
        j();
    }
}

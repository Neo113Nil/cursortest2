package pe0;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import B4.V;
import De.C2862e;
import Jd.z;
import Z.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import ce0.InterfaceC5817a;
import j.C7232a;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import we0.C10551g;
import we0.p;
import ze0.InterfaceC11117a;

/* renamed from: pe0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8913i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f80464a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC5817a f80465b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC11117a f80466c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private M0<p> f80467d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final x0<C10551g> f80468e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x0<z> f80469f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final x0<Boolean> f80470g;

    /* renamed from: pe0.i$a */
    public static final class a {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return Float.compare(0.0f, 0.0f) == 0;
        }

        public final int hashCode() {
            return Pk0.b.a(0.0f, Boolean.hashCode(false) * 31, 961);
        }

        @NotNull
        public final String toString() {
            return "RenderState(isVisible=false, angle=0.0, location=null, onClickAction=null)";
        }
    }

    /* renamed from: pe0.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bitmap f80471a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a f80472b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f80473c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final PointF f80474d;

        /* renamed from: e, reason: collision with root package name */
        private final float f80475e;

        public b(Bitmap content, float f7) {
            a renderState = new a();
            String id2 = UUID.randomUUID().toString();
            PointF contentAnchor = new PointF(0.5f, 0.5f);
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(renderState, "renderState");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(contentAnchor, "contentAnchor");
            this.f80471a = content;
            this.f80472b = renderState;
            this.f80473c = id2;
            this.f80474d = contentAnchor;
            this.f80475e = f7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f80471a, bVar.f80471a) && Intrinsics.d(this.f80472b, bVar.f80472b) && Intrinsics.d(this.f80473c, bVar.f80473c) && Intrinsics.d(this.f80474d, bVar.f80474d) && Float.compare(this.f80475e, bVar.f80475e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f80475e) + ((this.f80474d.hashCode() + G.g.a((this.f80472b.hashCode() + (this.f80471a.hashCode() * 31)) * 31, 31, this.f80473c)) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UiElement(content=");
            sb2.append(this.f80471a);
            sb2.append(", renderState=");
            sb2.append(this.f80472b);
            sb2.append(", id=");
            sb2.append(this.f80473c);
            sb2.append(", contentAnchor=");
            sb2.append(this.f80474d);
            sb2.append(", zIndex=");
            return V.b(this.f80475e, ")", sb2);
        }
    }

    /* renamed from: pe0.i$c */
    public static final class c {
    }

    public C8913i(M0 initLocationUpdatesFlow, Context context, InterfaceC5817a cameraController, InterfaceC11117a projectionController, C2862e scope, ViewGroup mapView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        c viewRenderer = new c();
        new LinkedHashMap();
        Intrinsics.checkNotNullParameter(initLocationUpdatesFlow, "initLocationUpdatesFlow");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(projectionController, "projectionController");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(viewRenderer, "viewRenderer");
        this.f80464a = context;
        this.f80465b = cameraController;
        this.f80466c = projectionController;
        this.f80467d = initLocationUpdatesFlow;
        Intrinsics.checkNotNullParameter(context, "context");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream openRawResource = context.getResources().openRawResource(R.raw.map_user_marker_anim);
        try {
            BitmapFactory.decodeStream(openRawResource, null, options);
            Vd0.b.a(openRawResource, null);
            this.f80468e = O0.a(null);
            a(0.0f, R.drawable.search_user_pin_arrow);
            a(1.0f, R.drawable.search_user_pin_static);
            ae0.k.b(context);
            ae0.k.b(context);
            ae0.k.b(context);
            ae0.k.b(context);
            r paddings = new r();
            Intrinsics.checkNotNullParameter(paddings, "paddings");
            this.f80469f = O0.a(new z());
            this.f80470g = O0.a(Boolean.FALSE);
        } finally {
        }
    }

    private final void a(float f7, int i11) {
        Drawable a11 = C7232a.a(this.f80464a, i11);
        Intrinsics.f(a11);
        new b(androidx.core.graphics.drawable.b.b(a11, 0, 0, 7), f7);
    }

    public final void b(boolean z11) {
        this.f80470g.setValue(Boolean.valueOf(z11));
    }
}

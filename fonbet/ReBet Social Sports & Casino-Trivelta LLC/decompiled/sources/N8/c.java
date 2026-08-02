package N8;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.giphy.sdk.analytics.models.Attribute;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: q, reason: collision with root package name */
    public static final a f7914q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final String f7915r = c.class.getSimpleName();

    /* renamed from: s, reason: collision with root package name */
    public static String f7916s = "n/a";

    /* renamed from: a, reason: collision with root package name */
    public boolean f7917a;

    /* renamed from: b, reason: collision with root package name */
    public int f7918b;

    /* renamed from: c, reason: collision with root package name */
    public int f7919c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f7920d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f7921e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f7922f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f7923g;

    /* renamed from: h, reason: collision with root package name */
    public N8.b f7924h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7925i;

    /* renamed from: j, reason: collision with root package name */
    public k f7926j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7927k;

    /* renamed from: l, reason: collision with root package name */
    public F8.e f7928l;

    /* renamed from: m, reason: collision with root package name */
    public String f7929m;

    /* renamed from: n, reason: collision with root package name */
    public String f7930n;

    /* renamed from: o, reason: collision with root package name */
    public String f7931o;

    /* renamed from: p, reason: collision with root package name */
    public final b f7932p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            c.f7916s = str;
        }

        public a() {
        }
    }

    public static final class b extends RecyclerView.v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            c.this.i();
        }
    }

    /* renamed from: N8.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0162c extends FunctionReferenceImpl implements Function0 {
        public C0162c(Object obj) {
            super(0, obj, c.class, "updateTracking", "updateTracking()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m8invoke() {
            ((c) this.receiver).i();
        }
    }

    public c(boolean z10, int i10, int i11) {
        this.f7917a = z10;
        this.f7918b = i10;
        this.f7919c = i11;
        this.f7921e = new Rect();
        this.f7922f = new Rect();
        this.f7923g = new Rect();
        this.f7925i = new ArrayList();
        this.f7926j = new k();
        this.f7927k = true;
        this.f7928l = E8.a.f3012a.e();
        this.f7929m = "";
        this.f7932p = new b();
    }

    public final void b(RecyclerView recyclerView, N8.b gifTrackingCallback) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(gifTrackingCallback, "gifTrackingCallback");
        this.f7920d = recyclerView;
        this.f7924h = gifTrackingCallback;
        recyclerView.n(this.f7932p);
        this.f7930n = d(recyclerView.getLayoutManager());
    }

    public final float c(View view) {
        if (!view.getGlobalVisibleRect(this.f7921e)) {
            return 0.0f;
        }
        RecyclerView recyclerView = this.f7920d;
        if (recyclerView != null) {
            recyclerView.getGlobalVisibleRect(this.f7923g);
        }
        Rect rect = this.f7921e;
        rect.top = Math.max(rect.top, this.f7923g.top + this.f7918b);
        Rect rect2 = this.f7921e;
        rect2.bottom = Math.min(rect2.bottom, this.f7923g.bottom - this.f7919c);
        view.getHitRect(this.f7922f);
        int width = this.f7921e.width() * this.f7921e.height();
        int width2 = this.f7922f.width() * this.f7922f.height();
        float f10 = width / width2;
        if (width2 <= 0) {
            return 0.0f;
        }
        return Math.min(f10, 1.0f);
    }

    public final String d(RecyclerView.q qVar) {
        if (qVar instanceof LinearLayoutManager) {
            return Attribute.INSTANCE.getLAYOUT_TYPE_CAROUSEL();
        }
        if (qVar instanceof GridLayoutManager) {
            return Attribute.INSTANCE.getLAYOUT_TYPE_GRID();
        }
        if (qVar instanceof StaggeredGridLayoutManager) {
            return Attribute.INSTANCE.getLAYOUT_TYPE_GRID();
        }
        return null;
    }

    public final String e() {
        return this.f7929m;
    }

    public final boolean f(int i10) {
        N8.b bVar = this.f7924h;
        return bVar != null && bVar.b(i10, new C0162c(this));
    }

    public final void g() {
        if (this.f7927k) {
            this.f7926j.a();
            Iterator it = this.f7925i.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    public boolean h(m media, ActionType actionType) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        String analyticsResponsePayload = media.getAnalyticsResponsePayload();
        if (analyticsResponsePayload == null || analyticsResponsePayload.length() == 0) {
            return false;
        }
        if (actionType == ActionType.SEEN) {
            k kVar = this.f7926j;
            String id2 = media.getId();
            String responseId = media.getResponseId();
            if (responseId == null) {
                responseId = "";
            }
            if (!kVar.b(id2, responseId)) {
                return false;
            }
        }
        F8.e eVar = this.f7928l;
        String str = this.f7929m;
        String id3 = media.getId();
        EventType eventType = media.getEventType();
        String tid = media.getTid();
        String str2 = this.f7930n;
        Integer position = media.getPosition();
        eVar.d(str, analyticsResponsePayload, null, eventType, id3, tid, actionType, null, str2, position != null ? position.intValue() : -1, this.f7931o);
        return true;
    }

    public final void i() {
        RecyclerView recyclerView;
        if (this.f7927k && (recyclerView = this.f7920d) != null) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View view = recyclerView.getChildAt(i10);
                int m02 = recyclerView.m0(recyclerView.getChildAt(i10));
                if (m02 != -1 && f(m02)) {
                    N8.b bVar = this.f7924h;
                    m a10 = bVar != null ? bVar.a(m02) : null;
                    if (a10 != null) {
                        Intrinsics.checkNotNullExpressionValue(view, "view");
                        float c10 = c(view);
                        if (this.f7917a && c10 == 1.0f) {
                            if (h(a10, ActionType.SEEN)) {
                                i.e(this, a10.getBottleDataTags(), view);
                                i.e(this, a10.getInjectedPixels(), view);
                            } else {
                                List injectedPixels = a10.getInjectedPixels();
                                if (injectedPixels != null && !injectedPixels.isEmpty()) {
                                    k kVar = this.f7926j;
                                    String id2 = a10.getId();
                                    String responseId = a10.getResponseId();
                                    if (responseId == null) {
                                        responseId = "";
                                    }
                                    if (kVar.b(id2, responseId)) {
                                        i.e(this, a10.getInjectedPixels(), view);
                                    }
                                }
                            }
                        }
                        Iterator it = this.f7925i.iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.b.a(it.next());
                            throw null;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public /* synthetic */ c(boolean z10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? true : z10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11);
    }
}

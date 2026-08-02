package ge;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.c1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.g1;
import androidx.recyclerview.widget.k1;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.z1;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t extends g1 {

    /* renamed from: c, reason: collision with root package name */
    public int f10002c;

    /* renamed from: d, reason: collision with root package name */
    public String f10003d;

    /* renamed from: e, reason: collision with root package name */
    public String f10004e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f10005f;

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f10006g;

    /* renamed from: h, reason: collision with root package name */
    public int f10007h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f10000a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f10001b = new Paint(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f10008i = new AtomicBoolean(false);

    public final Bitmap a(View view, boolean z5) {
        WeakReference weakReference;
        Bitmap bitmap;
        if (z5 && (weakReference = this.f10006g) != null && (bitmap = (Bitmap) weakReference.get()) != null) {
            return bitmap;
        }
        AtomicBoolean atomicBoolean = this.f10008i;
        if (atomicBoolean.get()) {
            return null;
        }
        atomicBoolean.set(true);
        try {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view.measure(makeMeasureSpec, makeMeasureSpec);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            this.f10006g = new WeakReference(createBitmap);
            this.f10007h = createBitmap.getWidth() / 2;
            return createBitmap;
        } catch (Exception unused) {
            return null;
        } finally {
            atomicBoolean.set(false);
        }
    }

    public final View b(RecyclerView recyclerView, String str) {
        WeakReference weakReference;
        View view;
        TextView textView;
        WeakReference weakReference2 = this.f10005f;
        if ((weakReference2 != null ? (View) weakReference2.get() : null) == null) {
            this.f10005f = new WeakReference(LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.decor_header, (ViewGroup) null, false));
        }
        if (str != null && (weakReference = this.f10005f) != null && (view = (View) weakReference.get()) != null && (textView = (TextView) view.findViewById(R.id.tv_decor_date_live)) != null) {
            textView.setText(str);
        }
        WeakReference weakReference3 = this.f10005f;
        if (weakReference3 != null) {
            return (View) weakReference3.get();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, z1 state) {
        d2 d2Var;
        Bitmap a7;
        boolean z5;
        Bitmap a10;
        Object next;
        View view;
        String str;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(canvas, recyclerView, state);
        if (state.b() >= 5 && recyclerView.getAdapter() != null) {
            k1 layoutManager = recyclerView.getLayoutManager();
            Unit unit = null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                boolean reverseLayout = linearLayoutManager.getReverseLayout();
                this.f10000a = reverseLayout;
                int findLastVisibleItemPosition = reverseLayout ? linearLayoutManager.findLastVisibleItemPosition() : linearLayoutManager.findFirstVisibleItemPosition();
                if (findLastVisibleItemPosition <= -1) {
                    return;
                }
                x0 adapter = recyclerView.getAdapter();
                k kVar = adapter instanceof k ? (k) adapter : null;
                hc.f fVar = (kVar == null || findLastVisibleItemPosition == -1 || kVar.f9978a.isEmpty()) ? null : (hc.f) CollectionsKt.G(findLastVisibleItemPosition, kVar.f9978a);
                if (fVar == null) {
                    return;
                }
                if (fVar instanceof hc.c) {
                    str = this.f10003d;
                } else if (fVar instanceof nc.b) {
                    str = ((nc.b) fVar).toDdMmmYy();
                } else if (!(fVar instanceof hc.b)) {
                    return;
                } else {
                    str = ((hc.b) fVar).f10488a;
                }
                this.f10004e = str;
            }
            this.f10002c = recyclerView.getWidth() / 2;
            bg.r f6 = bg.q.f(new c1(recyclerView), new a2.f(6, recyclerView));
            f1.a predicate = new f1.a(21);
            Intrinsics.checkNotNullParameter(f6, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            bg.g gVar = new bg.g(f6, true, predicate);
            bg.f fVar2 = new bg.f(gVar);
            while (fVar2.hasNext()) {
                d2 d2Var2 = (d2) fVar2.next();
                if (d2Var2 != null && (view = d2Var2.itemView) != null) {
                    view.setAlpha(1.0f);
                }
            }
            if (this.f10000a) {
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                bg.f fVar3 = new bg.f(gVar);
                if (fVar3.hasNext()) {
                    next = fVar3.next();
                    while (fVar3.hasNext()) {
                        next = fVar3.next();
                    }
                } else {
                    next = null;
                }
                d2Var = (d2) next;
            } else {
                d2Var = (d2) bg.q.d(gVar);
            }
            Paint paint = this.f10001b;
            boolean z7 = false;
            if (d2Var != null) {
                float y5 = d2Var.itemView.getY();
                d2Var.itemView.setAlpha(y5 >= 0.0f ? 1.0f : 0.0f);
                String str2 = this.f10004e;
                if (str2 == null && this.f10003d == null) {
                    return;
                }
                if (z.j(this.f10003d, str2, false)) {
                    z5 = false;
                } else {
                    this.f10003d = this.f10004e;
                    z5 = true;
                }
                View b10 = b(recyclerView, this.f10003d);
                if (b10 != null && (a10 = a(b10, !z5)) != null) {
                    float f10 = this.f10002c - this.f10007h;
                    canvas.drawBitmap(a10, f10 < 0.0f ? 0.0f : f10 - 1.0f, (0.0f > y5 || y5 > ((float) a10.getHeight())) ? 0.0f : y5 - a10.getHeight(), paint);
                    unit = Unit.f19194a;
                }
                if (unit != null) {
                    return;
                }
            }
            String str3 = this.f10003d;
            if ((str3 == null && this.f10004e != null) || (!Intrinsics.areEqual(str3, this.f10004e) && this.f10004e != null)) {
                this.f10003d = this.f10004e;
                z7 = true;
            }
            View b11 = b(recyclerView, this.f10003d);
            if (b11 == null || (a7 = a(b11, !z7)) == null) {
                return;
            }
            float f11 = this.f10002c - this.f10007h;
            canvas.drawBitmap(a7, f11 < 0.0f ? 0.0f : f11 - 1.0f, 0.0f, paint);
            Unit unit2 = Unit.f19194a;
        }
    }
}

package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.sports.insider.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final h P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f260a;

    /* renamed from: b, reason: collision with root package name */
    public final l f261b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f262c;

    /* renamed from: d, reason: collision with root package name */
    public final int f263d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f264e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f265f;

    /* renamed from: g, reason: collision with root package name */
    public AlertController$RecycleListView f266g;

    /* renamed from: h, reason: collision with root package name */
    public View f267h;

    /* renamed from: i, reason: collision with root package name */
    public int f268i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f269k;

    /* renamed from: l, reason: collision with root package name */
    public int f270l;

    /* renamed from: m, reason: collision with root package name */
    public int f271m;

    /* renamed from: o, reason: collision with root package name */
    public Button f273o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f274p;
    public Message q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f275r;

    /* renamed from: s, reason: collision with root package name */
    public Button f276s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f277t;

    /* renamed from: u, reason: collision with root package name */
    public Message f278u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f279v;

    /* renamed from: w, reason: collision with root package name */
    public Button f280w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f281x;

    /* renamed from: y, reason: collision with root package name */
    public Message f282y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f283z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f272n = false;
    public int B = 0;
    public int I = -1;
    public final b Q = new b(this);

    public j(Context context, l lVar, Window window) {
        this.f260a = context;
        this.f261b = lVar;
        this.f262c = window;
        h hVar = new h();
        hVar.f256b = new WeakReference(lVar);
        this.P = hVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, i.a.f10834e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.K = obtainStyledAttributes.getResourceId(4, 0);
        this.L = obtainStyledAttributes.getResourceId(5, 0);
        this.M = obtainStyledAttributes.getResourceId(7, 0);
        this.N = obtainStyledAttributes.getResourceId(3, 0);
        this.O = obtainStyledAttributes.getBoolean(6, true);
        this.f263d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        lVar.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i5, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.P.obtainMessage(i5, onClickListener) : null;
        if (i5 == -3) {
            this.f281x = charSequence;
            this.f282y = obtainMessage;
            this.f283z = drawable;
        } else if (i5 == -2) {
            this.f277t = charSequence;
            this.f278u = obtainMessage;
            this.f279v = drawable;
        } else {
            if (i5 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f274p = charSequence;
            this.q = obtainMessage;
            this.f275r = drawable;
        }
    }
}

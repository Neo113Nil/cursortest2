package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.AbstractC2082d0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import l.AbstractC5335a;
import l.f;
import l.j;
import m.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A, reason: collision with root package name */
    public NestedScrollView f16433A;

    /* renamed from: C, reason: collision with root package name */
    public Drawable f16435C;

    /* renamed from: D, reason: collision with root package name */
    public ImageView f16436D;

    /* renamed from: E, reason: collision with root package name */
    public TextView f16437E;

    /* renamed from: F, reason: collision with root package name */
    public TextView f16438F;

    /* renamed from: G, reason: collision with root package name */
    public View f16439G;

    /* renamed from: H, reason: collision with root package name */
    public ListAdapter f16440H;

    /* renamed from: J, reason: collision with root package name */
    public int f16442J;

    /* renamed from: K, reason: collision with root package name */
    public int f16443K;

    /* renamed from: L, reason: collision with root package name */
    public int f16444L;

    /* renamed from: M, reason: collision with root package name */
    public int f16445M;

    /* renamed from: N, reason: collision with root package name */
    public int f16446N;

    /* renamed from: O, reason: collision with root package name */
    public int f16447O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f16448P;

    /* renamed from: R, reason: collision with root package name */
    public Handler f16450R;

    /* renamed from: a, reason: collision with root package name */
    public final Context f16452a;

    /* renamed from: b, reason: collision with root package name */
    public final r f16453b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f16454c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16455d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f16456e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f16457f;

    /* renamed from: g, reason: collision with root package name */
    public ListView f16458g;

    /* renamed from: h, reason: collision with root package name */
    public View f16459h;

    /* renamed from: i, reason: collision with root package name */
    public int f16460i;

    /* renamed from: j, reason: collision with root package name */
    public int f16461j;

    /* renamed from: k, reason: collision with root package name */
    public int f16462k;

    /* renamed from: l, reason: collision with root package name */
    public int f16463l;

    /* renamed from: m, reason: collision with root package name */
    public int f16464m;

    /* renamed from: o, reason: collision with root package name */
    public Button f16466o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f16467p;

    /* renamed from: q, reason: collision with root package name */
    public Message f16468q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f16469r;

    /* renamed from: s, reason: collision with root package name */
    public Button f16470s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f16471t;

    /* renamed from: u, reason: collision with root package name */
    public Message f16472u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f16473v;

    /* renamed from: w, reason: collision with root package name */
    public Button f16474w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f16475x;

    /* renamed from: y, reason: collision with root package name */
    public Message f16476y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f16477z;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16465n = false;

    /* renamed from: B, reason: collision with root package name */
    public int f16434B = 0;

    /* renamed from: I, reason: collision with root package name */
    public int f16441I = -1;

    /* renamed from: Q, reason: collision with root package name */
    public int f16449Q = 0;

    /* renamed from: S, reason: collision with root package name */
    public final View.OnClickListener f16451S = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        public final int f16478a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16479b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.RecycleListView);
            this.f16479b = obtainStyledAttributes.getDimensionPixelOffset(j.f55180D1, -1);
            this.f16478a = obtainStyledAttributes.getDimensionPixelOffset(j.f55184E1, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f16478a, getPaddingRight(), z11 ? getPaddingBottom() : this.f16479b);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f16466o || (message3 = alertController.f16468q) == null) ? (view != alertController.f16470s || (message2 = alertController.f16472u) == null) ? (view != alertController.f16474w || (message = alertController.f16476y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f16450R.obtainMessage(1, alertController2.f16453b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: A, reason: collision with root package name */
        public int f16481A;

        /* renamed from: B, reason: collision with root package name */
        public int f16482B;

        /* renamed from: C, reason: collision with root package name */
        public int f16483C;

        /* renamed from: E, reason: collision with root package name */
        public boolean f16485E;

        /* renamed from: F, reason: collision with root package name */
        public boolean f16486F;

        /* renamed from: H, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f16488H;

        /* renamed from: I, reason: collision with root package name */
        public Cursor f16489I;

        /* renamed from: J, reason: collision with root package name */
        public String f16490J;

        /* renamed from: K, reason: collision with root package name */
        public String f16491K;

        /* renamed from: L, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f16492L;

        /* renamed from: a, reason: collision with root package name */
        public final Context f16494a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f16495b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f16497d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f16499f;

        /* renamed from: g, reason: collision with root package name */
        public View f16500g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f16501h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f16502i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f16503j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f16504k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f16505l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f16506m;
        public boolean[] mCheckedItems;
        public CharSequence[] mItems;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f16507n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f16508o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f16509p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f16510q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f16512s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f16513t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f16514u;

        /* renamed from: v, reason: collision with root package name */
        public ListAdapter f16515v;

        /* renamed from: w, reason: collision with root package name */
        public DialogInterface.OnClickListener f16516w;

        /* renamed from: x, reason: collision with root package name */
        public int f16517x;

        /* renamed from: y, reason: collision with root package name */
        public View f16518y;

        /* renamed from: z, reason: collision with root package name */
        public int f16519z;

        /* renamed from: c, reason: collision with root package name */
        public int f16496c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f16498e = 0;

        /* renamed from: D, reason: collision with root package name */
        public boolean f16484D = false;

        /* renamed from: G, reason: collision with root package name */
        public int f16487G = -1;

        /* renamed from: M, reason: collision with root package name */
        public boolean f16493M = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f16511r = true;

        public class a extends ArrayAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f16520a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f16520a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.mCheckedItems;
                if (zArr != null && zArr[i10]) {
                    this.f16520a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        public class C0339b extends CursorAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final int f16522a;

            /* renamed from: b, reason: collision with root package name */
            public final int f16523b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f16524c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ AlertController f16525d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0339b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f16524c = recycleListView;
                this.f16525d = alertController;
                Cursor cursor2 = getCursor();
                this.f16522a = cursor2.getColumnIndexOrThrow(b.this.f16490J);
                this.f16523b = cursor2.getColumnIndexOrThrow(b.this.f16491K);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f16522a));
                this.f16524c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f16523b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f16495b.inflate(this.f16525d.f16445M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AlertController f16527a;

            public c(AlertController alertController) {
                this.f16527a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f16516w.onClick(this.f16527a.f16453b, i10);
                if (b.this.f16486F) {
                    return;
                }
                this.f16527a.f16453b.dismiss();
            }
        }

        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ RecycleListView f16529a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AlertController f16530b;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f16529a = recycleListView;
                this.f16530b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.mCheckedItems;
                if (zArr != null) {
                    zArr[i10] = this.f16529a.isItemChecked(i10);
                }
                b.this.f16488H.onClick(this.f16530b.f16453b, i10, this.f16529a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f16494a = context;
            this.f16495b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f16500g;
            if (view != null) {
                alertController.l(view);
            } else {
                CharSequence charSequence = this.f16499f;
                if (charSequence != null) {
                    alertController.q(charSequence);
                }
                Drawable drawable = this.f16497d;
                if (drawable != null) {
                    alertController.n(drawable);
                }
                int i10 = this.f16496c;
                if (i10 != 0) {
                    alertController.m(i10);
                }
                int i11 = this.f16498e;
                if (i11 != 0) {
                    alertController.m(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f16501h;
            if (charSequence2 != null) {
                alertController.o(charSequence2);
            }
            CharSequence charSequence3 = this.f16502i;
            if (charSequence3 == null && this.f16503j == null) {
                alertController2 = alertController;
            } else {
                alertController.k(-1, charSequence3, this.f16504k, null, this.f16503j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f16505l;
            if (charSequence4 != null || this.f16506m != null) {
                alertController2.k(-2, charSequence4, this.f16507n, null, this.f16506m);
            }
            CharSequence charSequence5 = this.f16508o;
            if (charSequence5 != null || this.f16509p != null) {
                alertController2.k(-3, charSequence5, this.f16510q, null, this.f16509p);
            }
            if (this.mItems != null || this.f16489I != null || this.f16515v != null) {
                b(alertController2);
            }
            View view2 = this.f16518y;
            if (view2 != null) {
                if (this.f16484D) {
                    alertController2.t(view2, this.f16519z, this.f16481A, this.f16482B, this.f16483C);
                    return;
                } else {
                    alertController2.s(view2);
                    return;
                }
            }
            int i12 = this.f16517x;
            if (i12 != 0) {
                alertController2.r(i12);
            }
        }

        public final void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f16495b.inflate(alertController.f16444L, (ViewGroup) null);
            if (!this.f16485E) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f16486F ? alertController2.f16446N : alertController2.f16447O;
                if (bVar.f16489I != null) {
                    listAdapter = new SimpleCursorAdapter(bVar.f16494a, i10, bVar.f16489I, new String[]{bVar.f16490J}, new int[]{R.id.text1});
                } else {
                    listAdapter = bVar.f16515v;
                    if (listAdapter == null) {
                        listAdapter = new d(bVar.f16494a, i10, R.id.text1, bVar.mItems);
                    }
                }
            } else if (this.f16489I == null) {
                bVar = this;
                listAdapter = bVar.new a(this.f16494a, alertController.f16445M, R.id.text1, this.mItems, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                listAdapter = bVar.new C0339b(bVar.f16494a, bVar.f16489I, false, recycleListView, alertController2);
            }
            alertController2.f16440H = listAdapter;
            alertController2.f16441I = bVar.f16487G;
            if (bVar.f16516w != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f16488H != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f16492L;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f16486F) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f16485E) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f16458g = recycleListView;
        }
    }

    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference f16532a;

        public c(DialogInterface dialogInterface) {
            this.f16532a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f16532a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f16452a = context;
        this.f16453b = rVar;
        this.f16454c = window;
        this.f16450R = new c(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.AlertDialog, AbstractC5335a.f54996k, 0);
        this.f16442J = obtainStyledAttributes.getResourceId(j.f55386z, 0);
        this.f16443K = obtainStyledAttributes.getResourceId(j.f55170B, 0);
        this.f16444L = obtainStyledAttributes.getResourceId(j.f55178D, 0);
        this.f16445M = obtainStyledAttributes.getResourceId(j.f55182E, 0);
        this.f16446N = obtainStyledAttributes.getResourceId(j.f55190G, 0);
        this.f16447O = obtainStyledAttributes.getResourceId(j.f55174C, 0);
        this.f16448P = obtainStyledAttributes.getBoolean(j.f55186F, true);
        this.f16455d = obtainStyledAttributes.getDimensionPixelSize(j.f55166A, 0);
        obtainStyledAttributes.recycle();
        rVar.h(1);
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

    public static boolean z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5335a.f54995j, typedValue, true);
        return typedValue.data != 0;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f16474w;
        }
        if (i10 == -2) {
            return this.f16470s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f16466o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f16452a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f16458g;
    }

    public void f() {
        this.f16453b.setContentView(j());
        y();
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16433A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f16433A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public final ViewGroup i(View view, View view2) {
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

    public final int j() {
        int i10 = this.f16443K;
        return i10 == 0 ? this.f16442J : this.f16449Q == 1 ? i10 : this.f16442J;
    }

    public void k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f16450R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f16475x = charSequence;
            this.f16476y = message;
            this.f16477z = drawable;
        } else if (i10 == -2) {
            this.f16471t = charSequence;
            this.f16472u = message;
            this.f16473v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f16467p = charSequence;
            this.f16468q = message;
            this.f16469r = drawable;
        }
    }

    public void l(View view) {
        this.f16439G = view;
    }

    public void m(int i10) {
        this.f16435C = null;
        this.f16434B = i10;
        ImageView imageView = this.f16436D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f16436D.setImageResource(this.f16434B);
            }
        }
    }

    public void n(Drawable drawable) {
        this.f16435C = drawable;
        this.f16434B = 0;
        ImageView imageView = this.f16436D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f16436D.setImageDrawable(drawable);
            }
        }
    }

    public void o(CharSequence charSequence) {
        this.f16457f = charSequence;
        TextView textView = this.f16438F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f16454c.findViewById(f.f55118w);
        View findViewById2 = this.f16454c.findViewById(f.f55117v);
        AbstractC2082d0.A0(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void q(CharSequence charSequence) {
        this.f16456e = charSequence;
        TextView textView = this.f16437E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(int i10) {
        this.f16459h = null;
        this.f16460i = i10;
        this.f16465n = false;
    }

    public void s(View view) {
        this.f16459h = view;
        this.f16460i = 0;
        this.f16465n = false;
    }

    public void t(View view, int i10, int i11, int i12, int i13) {
        this.f16459h = view;
        this.f16460i = 0;
        this.f16465n = true;
        this.f16461j = i10;
        this.f16462k = i11;
        this.f16463l = i12;
        this.f16464m = i13;
    }

    public final void u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f16466o = button;
        button.setOnClickListener(this.f16451S);
        if (TextUtils.isEmpty(this.f16467p) && this.f16469r == null) {
            this.f16466o.setVisibility(8);
            i10 = 0;
        } else {
            this.f16466o.setText(this.f16467p);
            Drawable drawable = this.f16469r;
            if (drawable != null) {
                int i11 = this.f16455d;
                drawable.setBounds(0, 0, i11, i11);
                this.f16466o.setCompoundDrawables(this.f16469r, null, null, null);
            }
            this.f16466o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f16470s = button2;
        button2.setOnClickListener(this.f16451S);
        if (TextUtils.isEmpty(this.f16471t) && this.f16473v == null) {
            this.f16470s.setVisibility(8);
        } else {
            this.f16470s.setText(this.f16471t);
            Drawable drawable2 = this.f16473v;
            if (drawable2 != null) {
                int i12 = this.f16455d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f16470s.setCompoundDrawables(this.f16473v, null, null, null);
            }
            this.f16470s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f16474w = button3;
        button3.setOnClickListener(this.f16451S);
        if (TextUtils.isEmpty(this.f16475x) && this.f16477z == null) {
            this.f16474w.setVisibility(8);
        } else {
            this.f16474w.setText(this.f16475x);
            Drawable drawable3 = this.f16477z;
            if (drawable3 != null) {
                int i13 = this.f16455d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f16474w.setCompoundDrawables(this.f16477z, null, null, null);
            }
            this.f16474w.setVisibility(0);
            i10 |= 4;
        }
        if (z(this.f16452a)) {
            if (i10 == 1) {
                b(this.f16466o);
            } else if (i10 == 2) {
                b(this.f16470s);
            } else if (i10 == 4) {
                b(this.f16474w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f16454c.findViewById(f.f55119x);
        this.f16433A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f16433A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f16438F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f16457f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f16433A.removeView(this.f16438F);
        if (this.f16458g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f16433A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f16433A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f16458g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void w(ViewGroup viewGroup) {
        View view = this.f16459h;
        if (view == null) {
            view = this.f16460i != 0 ? LayoutInflater.from(this.f16452a).inflate(this.f16460i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !a(view)) {
            this.f16454c.setFlags(PKIFailureInfo.unsupportedVersion, PKIFailureInfo.unsupportedVersion);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f16454c.findViewById(f.f55110o);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f16465n) {
            frameLayout.setPadding(this.f16461j, this.f16462k, this.f16463l, this.f16464m);
        }
        if (this.f16458g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    public final void x(ViewGroup viewGroup) {
        if (this.f16439G != null) {
            viewGroup.addView(this.f16439G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f16454c.findViewById(f.f55094P).setVisibility(8);
            return;
        }
        this.f16436D = (ImageView) this.f16454c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f16456e) || !this.f16448P) {
            this.f16454c.findViewById(f.f55094P).setVisibility(8);
            this.f16436D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f16454c.findViewById(f.f55106k);
        this.f16437E = textView;
        textView.setText(this.f16456e);
        int i10 = this.f16434B;
        if (i10 != 0) {
            this.f16436D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f16435C;
        if (drawable != null) {
            this.f16436D.setImageDrawable(drawable);
        } else {
            this.f16437E.setPadding(this.f16436D.getPaddingLeft(), this.f16436D.getPaddingTop(), this.f16436D.getPaddingRight(), this.f16436D.getPaddingBottom());
            this.f16436D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f16454c.findViewById(f.f55116u);
        View findViewById4 = findViewById3.findViewById(f.f55095Q);
        View findViewById5 = findViewById3.findViewById(f.f55109n);
        View findViewById6 = findViewById3.findViewById(f.f55107l);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(f.f55111p);
        w(viewGroup);
        View findViewById7 = viewGroup.findViewById(f.f55095Q);
        View findViewById8 = viewGroup.findViewById(f.f55109n);
        View findViewById9 = viewGroup.findViewById(f.f55107l);
        ViewGroup i10 = i(findViewById7, findViewById4);
        ViewGroup i11 = i(findViewById8, findViewById5);
        ViewGroup i12 = i(findViewById9, findViewById6);
        v(i11);
        u(i12);
        x(i10);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (i10 == null || i10.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (i12 == null || i12.getVisibility() == 8) ? false : true;
        if (!z12 && i11 != null && (findViewById2 = i11.findViewById(f.f55090L)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f16433A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f16457f == null && this.f16458g == null) ? null : i10.findViewById(f.f55093O);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (i11 != null && (findViewById = i11.findViewById(f.f55091M)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f16458g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f16458g;
            if (view == null) {
                view = this.f16433A;
            }
            if (view != null) {
                p(i11, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f16458g;
        if (listView2 == null || (listAdapter = this.f16440H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f16441I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }
}

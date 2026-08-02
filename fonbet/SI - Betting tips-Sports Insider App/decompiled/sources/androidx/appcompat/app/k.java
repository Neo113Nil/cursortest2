package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class k {
    private final g P;
    private final int mTheme;

    public k(Context context) {
        this(context, l.b(context, 0));
    }

    public l create() {
        AlertController$RecycleListView alertController$RecycleListView;
        ListAdapter listAdapter;
        l lVar = new l(this.P.f229a, this.mTheme);
        g gVar = this.P;
        View view = gVar.f234f;
        ContextThemeWrapper contextThemeWrapper = gVar.f229a;
        j jVar = lVar.f299a;
        if (view != null) {
            jVar.G = view;
        } else {
            CharSequence charSequence = gVar.f233e;
            if (charSequence != null) {
                jVar.f264e = charSequence;
                TextView textView = jVar.E;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = gVar.f232d;
            if (drawable != null) {
                jVar.C = drawable;
                jVar.B = 0;
                ImageView imageView = jVar.D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    jVar.D.setImageDrawable(drawable);
                }
            }
            int i5 = gVar.f231c;
            if (i5 != 0) {
                jVar.C = null;
                jVar.B = i5;
                ImageView imageView2 = jVar.D;
                if (imageView2 != null) {
                    if (i5 != 0) {
                        imageView2.setVisibility(0);
                        jVar.D.setImageResource(jVar.B);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = gVar.f235g;
        if (charSequence2 != null) {
            jVar.f265f = charSequence2;
            TextView textView2 = jVar.F;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = gVar.f236h;
        if (charSequence3 != null || gVar.f237i != null) {
            jVar.c(-1, charSequence3, gVar.j, gVar.f237i);
        }
        CharSequence charSequence4 = gVar.f238k;
        if (charSequence4 != null || gVar.f239l != null) {
            jVar.c(-2, charSequence4, gVar.f240m, gVar.f239l);
        }
        CharSequence charSequence5 = gVar.f241n;
        if (charSequence5 != null || gVar.f242o != null) {
            jVar.c(-3, charSequence5, gVar.f243p, gVar.f242o);
        }
        if (gVar.f247u != null || gVar.J != null || gVar.f248v != null) {
            AlertController$RecycleListView alertController$RecycleListView2 = (AlertController$RecycleListView) gVar.f230b.inflate(jVar.K, (ViewGroup) null);
            if (!gVar.F) {
                alertController$RecycleListView = alertController$RecycleListView2;
                int i10 = gVar.G ? jVar.M : jVar.N;
                if (gVar.J != null) {
                    listAdapter = new SimpleCursorAdapter(contextThemeWrapper, i10, gVar.J, new String[]{gVar.K}, new int[]{R.id.text1});
                } else {
                    ListAdapter listAdapter2 = gVar.f248v;
                    if (listAdapter2 == null) {
                        listAdapter2 = new i(contextThemeWrapper, i10, R.id.text1, gVar.f247u);
                    }
                    listAdapter = listAdapter2;
                }
            } else if (gVar.J == null) {
                listAdapter = new c(gVar, contextThemeWrapper, jVar.L, gVar.f247u, alertController$RecycleListView2);
                alertController$RecycleListView = alertController$RecycleListView2;
            } else {
                listAdapter = new d(gVar, contextThemeWrapper, gVar.J, alertController$RecycleListView2, jVar);
                alertController$RecycleListView = alertController$RecycleListView2;
            }
            jVar.H = listAdapter;
            jVar.I = gVar.H;
            if (gVar.f249w != null) {
                alertController$RecycleListView.setOnItemClickListener(new e(gVar, jVar));
            } else if (gVar.I != null) {
                alertController$RecycleListView.setOnItemClickListener(new f(gVar, alertController$RecycleListView, jVar));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = gVar.M;
            if (onItemSelectedListener != null) {
                alertController$RecycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (gVar.G) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (gVar.F) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            jVar.f266g = alertController$RecycleListView;
        }
        View view2 = gVar.f251y;
        if (view2 == null) {
            int i11 = gVar.f250x;
            if (i11 != 0) {
                jVar.f267h = null;
                jVar.f268i = i11;
                jVar.f272n = false;
            }
        } else if (gVar.D) {
            int i12 = gVar.f252z;
            int i13 = gVar.A;
            int i14 = gVar.B;
            int i15 = gVar.C;
            jVar.f267h = view2;
            jVar.f268i = 0;
            jVar.f272n = true;
            jVar.j = i12;
            jVar.f269k = i13;
            jVar.f270l = i14;
            jVar.f271m = i15;
        } else {
            jVar.f267h = view2;
            jVar.f268i = 0;
            jVar.f272n = false;
        }
        lVar.setCancelable(this.P.q);
        if (this.P.q) {
            lVar.setCanceledOnTouchOutside(true);
        }
        lVar.setOnCancelListener(this.P.f244r);
        lVar.setOnDismissListener(this.P.f245s);
        DialogInterface.OnKeyListener onKeyListener = this.P.f246t;
        if (onKeyListener != null) {
            lVar.setOnKeyListener(onKeyListener);
        }
        return lVar;
    }

    @NonNull
    public Context getContext() {
        return this.P.f229a;
    }

    public k setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f248v = listAdapter;
        gVar.f249w = onClickListener;
        return this;
    }

    public k setCancelable(boolean z5) {
        this.P.q = z5;
        return this;
    }

    public k setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        g gVar = this.P;
        gVar.J = cursor;
        gVar.K = str;
        gVar.f249w = onClickListener;
        return this;
    }

    public k setCustomTitle(View view) {
        this.P.f234f = view;
        return this;
    }

    public k setIcon(int i5) {
        this.P.f231c = i5;
        return this;
    }

    public k setIconAttribute(int i5) {
        TypedValue typedValue = new TypedValue();
        this.P.f229a.getTheme().resolveAttribute(i5, typedValue, true);
        this.P.f231c = typedValue.resourceId;
        return this;
    }

    @Deprecated
    public k setInverseBackgroundForced(boolean z5) {
        this.P.getClass();
        return this;
    }

    public k setItems(int i5, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f247u = gVar.f229a.getResources().getTextArray(i5);
        this.P.f249w = onClickListener;
        return this;
    }

    public k setMessage(int i5) {
        g gVar = this.P;
        gVar.f235g = gVar.f229a.getText(i5);
        return this;
    }

    public k setMultiChoiceItems(int i5, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        g gVar = this.P;
        gVar.f247u = gVar.f229a.getResources().getTextArray(i5);
        g gVar2 = this.P;
        gVar2.I = onMultiChoiceClickListener;
        gVar2.E = zArr;
        gVar2.F = true;
        return this;
    }

    public k setNegativeButton(int i5, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f238k = gVar.f229a.getText(i5);
        this.P.f240m = onClickListener;
        return this;
    }

    public k setNegativeButtonIcon(Drawable drawable) {
        this.P.f239l = drawable;
        return this;
    }

    public k setNeutralButton(int i5, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f241n = gVar.f229a.getText(i5);
        this.P.f243p = onClickListener;
        return this;
    }

    public k setNeutralButtonIcon(Drawable drawable) {
        this.P.f242o = drawable;
        return this;
    }

    public k setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.P.f244r = onCancelListener;
        return this;
    }

    public k setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.P.f245s = onDismissListener;
        return this;
    }

    public k setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P.M = onItemSelectedListener;
        return this;
    }

    public k setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.P.f246t = onKeyListener;
        return this;
    }

    public k setPositiveButton(int i5, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f236h = gVar.f229a.getText(i5);
        this.P.j = onClickListener;
        return this;
    }

    public k setPositiveButtonIcon(Drawable drawable) {
        this.P.f237i = drawable;
        return this;
    }

    public k setRecycleOnMeasureEnabled(boolean z5) {
        this.P.getClass();
        return this;
    }

    public k setSingleChoiceItems(int i5, int i10, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f247u = gVar.f229a.getResources().getTextArray(i5);
        g gVar2 = this.P;
        gVar2.f249w = onClickListener;
        gVar2.H = i10;
        gVar2.G = true;
        return this;
    }

    public k setTitle(int i5) {
        g gVar = this.P;
        gVar.f233e = gVar.f229a.getText(i5);
        return this;
    }

    public k setView(int i5) {
        g gVar = this.P;
        gVar.f251y = null;
        gVar.f250x = i5;
        gVar.D = false;
        return this;
    }

    public l show() {
        l create = create();
        create.show();
        return create;
    }

    public k(Context context, int i5) {
        this.P = new g(new ContextThemeWrapper(context, l.b(context, i5)));
        this.mTheme = i5;
    }

    public k setIcon(Drawable drawable) {
        this.P.f232d = drawable;
        return this;
    }

    public k setMessage(CharSequence charSequence) {
        this.P.f235g = charSequence;
        return this;
    }

    public k setTitle(CharSequence charSequence) {
        this.P.f233e = charSequence;
        return this;
    }

    public k setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f247u = charSequenceArr;
        gVar.f249w = onClickListener;
        return this;
    }

    public k setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f238k = charSequence;
        gVar.f240m = onClickListener;
        return this;
    }

    public k setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f241n = charSequence;
        gVar.f243p = onClickListener;
        return this;
    }

    public k setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f236h = charSequence;
        gVar.j = onClickListener;
        return this;
    }

    public k setView(View view) {
        g gVar = this.P;
        gVar.f251y = view;
        gVar.f250x = 0;
        gVar.D = false;
        return this;
    }

    public k setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        g gVar = this.P;
        gVar.f247u = charSequenceArr;
        gVar.I = onMultiChoiceClickListener;
        gVar.E = zArr;
        gVar.F = true;
        return this;
    }

    public k setSingleChoiceItems(Cursor cursor, int i5, String str, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.J = cursor;
        gVar.f249w = onClickListener;
        gVar.H = i5;
        gVar.K = str;
        gVar.G = true;
        return this;
    }

    @Deprecated
    public k setView(View view, int i5, int i10, int i11, int i12) {
        g gVar = this.P;
        gVar.f251y = view;
        gVar.f250x = 0;
        gVar.D = true;
        gVar.f252z = i5;
        gVar.A = i10;
        gVar.B = i11;
        gVar.C = i12;
        return this;
    }

    public k setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        g gVar = this.P;
        gVar.J = cursor;
        gVar.I = onMultiChoiceClickListener;
        gVar.L = str;
        gVar.K = str2;
        gVar.F = true;
        return this;
    }

    public k setSingleChoiceItems(CharSequence[] charSequenceArr, int i5, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f247u = charSequenceArr;
        gVar.f249w = onClickListener;
        gVar.H = i5;
        gVar.G = true;
        return this;
    }

    public k setSingleChoiceItems(ListAdapter listAdapter, int i5, DialogInterface.OnClickListener onClickListener) {
        g gVar = this.P;
        gVar.f248v = listAdapter;
        gVar.f249w = onClickListener;
        gVar.H = i5;
        gVar.G = true;
        return this;
    }
}

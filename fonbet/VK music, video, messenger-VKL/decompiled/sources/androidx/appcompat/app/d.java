package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.b33;
import xsna.iut0;

/* compiled from: AlertDialog.java */
/* loaded from: classes11.dex */
public class d extends b33 implements DialogInterface {
    public final AlertController h;

    /* compiled from: AlertDialog.java */
    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(@NonNull Context context) {
            this(context, d.n(0, context));
        }

        public a a(boolean z) {
            this.a.m = false;
            return this;
        }

        public a b(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.q = charSequenceArr;
            bVar.s = onClickListener;
            return this;
        }

        public a c(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        @NonNull
        public d create() {
            ListAdapter listAdapter;
            AlertController.b bVar = this.a;
            ContextThemeWrapper contextThemeWrapper = bVar.a;
            ContextThemeWrapper contextThemeWrapper2 = bVar.a;
            d dVar = new d(contextThemeWrapper, this.b);
            View view = bVar.e;
            AlertController alertController = dVar.h;
            if (view != null) {
                alertController.x = view;
            } else {
                CharSequence charSequence = bVar.d;
                if (charSequence != null) {
                    alertController.d = charSequence;
                    TextView textView = alertController.v;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.t = drawable;
                    ImageView imageView = alertController.u;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.u.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f;
            if (charSequence2 != null) {
                alertController.e = charSequence2;
                TextView textView2 = alertController.w;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.g;
            if (charSequence3 != null) {
                alertController.c(-1, charSequence3, bVar.h);
            }
            CharSequence charSequence4 = bVar.i;
            if (charSequence4 != null) {
                alertController.c(-2, charSequence4, bVar.j);
            }
            CharSequence charSequence5 = bVar.k;
            if (charSequence5 != null) {
                alertController.c(-3, charSequence5, bVar.l);
            }
            if (bVar.q != null || bVar.r != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.B, (ViewGroup) null);
                if (bVar.w) {
                    listAdapter = new androidx.appcompat.app.a(bVar, contextThemeWrapper2, alertController.C, bVar.q, recycleListView);
                } else {
                    int i = bVar.x ? alertController.D : alertController.E;
                    ListAdapter listAdapter2 = bVar.r;
                    if (listAdapter2 == null) {
                        listAdapter2 = new AlertController.d(contextThemeWrapper2, i, R.id.text1, bVar.q);
                    }
                    listAdapter = listAdapter2;
                }
                alertController.y = listAdapter;
                alertController.z = bVar.y;
                if (bVar.s != null) {
                    recycleListView.setOnItemClickListener(new b(bVar, alertController));
                } else if (bVar.z != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, recycleListView, alertController));
                }
                if (bVar.x) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.w) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f = recycleListView;
            }
            View view2 = bVar.u;
            if (view2 != null) {
                alertController.g = view2;
                alertController.h = 0;
                alertController.i = false;
            } else {
                int i2 = bVar.t;
                if (i2 != 0) {
                    alertController.g = null;
                    alertController.h = i2;
                    alertController.i = false;
                }
            }
            dVar.setCancelable(bVar.m);
            if (bVar.m) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(bVar.n);
            dVar.setOnDismissListener(bVar.o);
            g gVar = bVar.p;
            if (gVar != null) {
                dVar.setOnKeyListener(gVar);
            }
            return dVar;
        }

        public a d(@Nullable CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }

        public void e(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.a;
            bVar.q = charSequenceArr;
            bVar.z = onMultiChoiceClickListener;
            bVar.v = zArr;
            bVar.w = true;
        }

        public a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = charSequence;
            bVar.j = onClickListener;
            return this;
        }

        public void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.k = charSequence;
            bVar.l = onClickListener;
        }

        @NonNull
        public Context getContext() {
            return this.a.a;
        }

        public final void h(DialogInterface.OnCancelListener onCancelListener) {
            this.a.n = onCancelListener;
        }

        public a i(DialogInterface.OnDismissListener onDismissListener) {
            this.a.o = onDismissListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = charSequence;
            bVar.h = onClickListener;
            return this;
        }

        public void k(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.q = charSequenceArr;
            bVar.s = onClickListener;
            bVar.y = i;
            bVar.x = true;
        }

        public a l(int i) {
            AlertController.b bVar = this.a;
            bVar.u = null;
            bVar.t = i;
            return this;
        }

        public d m() {
            d create = create();
            create.show();
            return create;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            bVar.j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = bVar.a.getText(i);
            bVar.h = onClickListener;
            return this;
        }

        public a setTitle(@Nullable CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.a;
            bVar.u = view;
            bVar.t = 0;
            return this;
        }

        public a(@NonNull Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, d.n(i, context)));
            this.b = i;
        }
    }

    public d(@NonNull ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, n(i, contextThemeWrapper));
        this.h = new AlertController(getContext(), this, getWindow());
    }

    public static int n(int i, @NonNull Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.vkontakte.android.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // xsna.b33, xsna.y8i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.h;
        alertController.b.setContentView(alertController.A);
        Context context = alertController.a;
        Window window = alertController.c;
        View findViewById2 = window.findViewById(com.vkontakte.android.R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(com.vkontakte.android.R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(com.vkontakte.android.R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(com.vkontakte.android.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(com.vkontakte.android.R.id.customPanel);
        View view = alertController.g;
        if (view == null) {
            view = alertController.h != 0 ? LayoutInflater.from(context).inflate(alertController.h, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !AlertController.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(com.vkontakte.android.R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(com.vkontakte.android.R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(com.vkontakte.android.R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(com.vkontakte.android.R.id.buttonPanel);
        ViewGroup b = AlertController.b(findViewById6, findViewById3);
        ViewGroup b2 = AlertController.b(findViewById7, findViewById4);
        ViewGroup b3 = AlertController.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(com.vkontakte.android.R.id.scrollView);
        alertController.s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(R.id.message);
        alertController.w = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.s.removeView(alertController.w);
                if (alertController.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.s.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.s);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(R.id.button1);
        alertController.j = button;
        AlertController.a aVar = alertController.H;
        button.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.k)) {
            alertController.j.setVisibility(8);
            i = 0;
        } else {
            alertController.j.setText(alertController.k);
            alertController.j.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) b3.findViewById(R.id.button2);
        alertController.m = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.n)) {
            alertController.m.setVisibility(8);
        } else {
            alertController.m.setText(alertController.n);
            alertController.m.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) b3.findViewById(R.id.button3);
        alertController.p = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.q)) {
            alertController.p.setVisibility(8);
        } else {
            alertController.p.setText(alertController.q);
            alertController.p.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.vkontakte.android.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = alertController.j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = alertController.m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = alertController.p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (alertController.x != null) {
            b.addView(alertController.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(com.vkontakte.android.R.id.title_template).setVisibility(8);
        } else {
            alertController.u = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(alertController.d) || !alertController.F) {
                window.findViewById(com.vkontakte.android.R.id.title_template).setVisibility(8);
                alertController.u.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(com.vkontakte.android.R.id.alertTitle);
                alertController.v = textView2;
                textView2.setText(alertController.d);
                Drawable drawable = alertController.t;
                if (drawable != null) {
                    alertController.u.setImageDrawable(drawable);
                } else {
                    alertController.v.setPadding(alertController.u.getPaddingLeft(), alertController.u.getPaddingTop(), alertController.u.getPaddingRight(), alertController.u.getPaddingBottom());
                    alertController.u.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b3.getVisibility() != 8;
        if (!z3 && (findViewById = b2.findViewById(com.vkontakte.android.R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = alertController.s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.e == null && alertController.f == null) ? null : b.findViewById(com.vkontakte.android.R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(com.vkontakte.android.R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f;
        if (recycleListView != null && (!z3 || i2 == 0)) {
            recycleListView.setPadding(recycleListView.getPaddingLeft(), i2 != 0 ? recycleListView.getPaddingTop() : recycleListView.b, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.c);
        }
        if (!z2) {
            View view2 = alertController.f;
            if (view2 == null) {
                view2 = alertController.s;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(com.vkontakte.android.R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(com.vkontakte.android.R.id.scrollIndicatorDown);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.f;
        if (recycleListView2 == null || (listAdapter = alertController.y) == null) {
            return;
        }
        recycleListView2.setAdapter(listAdapter);
        int i4 = alertController.z;
        if (i4 > -1) {
            recycleListView2.setItemChecked(i4, true);
            recycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.h.s;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.h.s;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // xsna.b33, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.h;
        alertController.d = charSequence;
        TextView textView = alertController.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

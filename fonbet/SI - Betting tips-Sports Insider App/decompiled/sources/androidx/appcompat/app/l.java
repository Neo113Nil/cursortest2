package androidx.appcompat.app;

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
import androidx.appcompat.widget.k2;
import androidx.core.view.z0;
import androidx.core.widget.NestedScrollView;
import com.sports.insider.R;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends n0 implements DialogInterface {

    /* renamed from: a, reason: collision with root package name */
    public final j f299a;

    public l(ContextThemeWrapper contextThemeWrapper, int i5) {
        super(contextThemeWrapper, b(contextThemeWrapper, i5));
        this.f299a = new j(getContext(), this, getWindow());
    }

    public static int b(Context context, int i5) {
        if (((i5 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.n0, e.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i5;
        View view;
        int i10;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        j jVar = this.f299a;
        jVar.f261b.setContentView(jVar.J);
        Context context = jVar.f260a;
        Window window = jVar.f262c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = jVar.f267h;
        if (view2 == null) {
            view2 = jVar.f268i != 0 ? LayoutInflater.from(context).inflate(jVar.f268i, viewGroup, false) : null;
        }
        boolean z5 = view2 != null;
        if (!z5 || !j.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z5) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (jVar.f272n) {
                frameLayout.setPadding(jVar.j, jVar.f269k, jVar.f270l, jVar.f271m);
            }
            if (jVar.f266g != null) {
                ((LinearLayout.LayoutParams) ((k2) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b10 = j.b(findViewById6, findViewById3);
        ViewGroup b11 = j.b(findViewById7, findViewById4);
        ViewGroup b12 = j.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        jVar.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        jVar.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b11.findViewById(android.R.id.message);
        jVar.F = textView;
        if (textView != null) {
            CharSequence charSequence = jVar.f265f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                jVar.A.removeView(jVar.F);
                if (jVar.f266g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) jVar.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(jVar.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(jVar.f266g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b11.setVisibility(8);
                }
            }
        }
        int i11 = jVar.f263d;
        Button button = (Button) b12.findViewById(android.R.id.button1);
        jVar.f273o = button;
        b bVar = jVar.Q;
        button.setOnClickListener(bVar);
        if (TextUtils.isEmpty(jVar.f274p) && jVar.f275r == null) {
            jVar.f273o.setVisibility(8);
            i5 = 0;
        } else {
            jVar.f273o.setText(jVar.f274p);
            Drawable drawable = jVar.f275r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i11, i11);
                jVar.f273o.setCompoundDrawables(jVar.f275r, null, null, null);
            }
            jVar.f273o.setVisibility(0);
            i5 = 1;
        }
        Button button2 = (Button) b12.findViewById(android.R.id.button2);
        jVar.f276s = button2;
        button2.setOnClickListener(bVar);
        if (TextUtils.isEmpty(jVar.f277t) && jVar.f279v == null) {
            jVar.f276s.setVisibility(8);
        } else {
            jVar.f276s.setText(jVar.f277t);
            Drawable drawable2 = jVar.f279v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i11, i11);
                jVar.f276s.setCompoundDrawables(jVar.f279v, null, null, null);
            }
            jVar.f276s.setVisibility(0);
            i5 |= 2;
        }
        Button button3 = (Button) b12.findViewById(android.R.id.button3);
        jVar.f280w = button3;
        button3.setOnClickListener(bVar);
        if (TextUtils.isEmpty(jVar.f281x) && jVar.f283z == null) {
            jVar.f280w.setVisibility(8);
            view = null;
        } else {
            jVar.f280w.setText(jVar.f281x);
            Drawable drawable3 = jVar.f283z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i11, i11);
                view = null;
                jVar.f280w.setCompoundDrawables(jVar.f283z, null, null, null);
            } else {
                view = null;
            }
            jVar.f280w.setVisibility(0);
            i5 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i5 == 1) {
                Button button4 = jVar.f273o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i5 == 2) {
                Button button5 = jVar.f276s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i5 == 4) {
                Button button6 = jVar.f280w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i5 == 0) {
            b12.setVisibility(8);
        }
        if (jVar.G != null) {
            b10.addView(jVar.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            jVar.D = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(jVar.f264e) || !jVar.O) {
                window.findViewById(R.id.title_template).setVisibility(8);
                jVar.D.setVisibility(8);
                b10.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                jVar.E = textView2;
                textView2.setText(jVar.f264e);
                int i12 = jVar.B;
                if (i12 != 0) {
                    jVar.D.setImageResource(i12);
                } else {
                    Drawable drawable4 = jVar.C;
                    if (drawable4 != null) {
                        jVar.D.setImageDrawable(drawable4);
                    } else {
                        jVar.E.setPadding(jVar.D.getPaddingLeft(), jVar.D.getPaddingTop(), jVar.D.getPaddingRight(), jVar.D.getPaddingBottom());
                        jVar.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z7 = viewGroup.getVisibility() != 8;
        int i13 = (b10 == null || b10.getVisibility() == 8) ? 0 : 1;
        boolean z10 = b12.getVisibility() != 8;
        if (!z10 && (findViewById = b11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i13 != 0) {
            NestedScrollView nestedScrollView2 = jVar.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (jVar.f265f == null && jVar.f266g == null) ? view : b10.findViewById(R.id.titleDividerNoCustom);
            i10 = 0;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            i10 = 0;
            View findViewById10 = b11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = jVar.f266g;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z10 || i13 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i13 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f200a, alertController$RecycleListView.getPaddingRight(), z10 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f201b);
            }
        }
        if (!z7) {
            View view3 = jVar.f266g;
            if (view3 == null) {
                view3 = jVar.A;
            }
            if (view3 != null) {
                int i14 = z10 ? 2 : i10;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = z0.f1413a;
                androidx.core.view.r0.b(view3, i13 | i14, 3);
                if (findViewById11 != null) {
                    b11.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b11.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = jVar.f266g;
        if (alertController$RecycleListView2 == null || (listAdapter = jVar.H) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i15 = jVar.I;
        if (i15 > -1) {
            alertController$RecycleListView2.setItemChecked(i15, true);
            alertController$RecycleListView2.setSelection(i15);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f299a.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i5, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f299a.A;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.app.n0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        j jVar = this.f299a;
        jVar.f264e = charSequence;
        TextView textView = jVar.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

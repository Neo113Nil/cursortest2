package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class xm extends wb0 implements DialogInterface {
    public final vm g;

    public xm(Context context, int i) {
        super(context, f(i, context));
        this.g = new vm(getContext(), this, getWindow());
    }

    public static int f(int i, Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void g(int i, String str, DialogInterface.OnClickListener onClickListener) {
        this.g.c(i, str, onClickListener);
    }

    @Override // defpackage.wb0, defpackage.cc3, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        vm vmVar = this.g;
        vmVar.b.setContentView(vmVar.z);
        Context context = vmVar.a;
        Window window = vmVar.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = vmVar.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !vm.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (vmVar.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (vmVar.f != null) {
                ((LinearLayout.LayoutParams) ((z7b) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = vm.b(findViewById6, findViewById3);
        ViewGroup b2 = vm.b(findViewById7, findViewById4);
        ViewGroup b3 = vm.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        vmVar.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        vmVar.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        vmVar.v = textView;
        if (textView != null) {
            CharSequence charSequence = vmVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                vmVar.r.removeView(vmVar.v);
                if (vmVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) vmVar.r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(vmVar.r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(vmVar.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(android.R.id.button1);
        vmVar.i = button;
        cb cbVar = vmVar.G;
        button.setOnClickListener(cbVar);
        boolean isEmpty = TextUtils.isEmpty(vmVar.j);
        Button button2 = vmVar.i;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(vmVar.j);
            vmVar.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) b3.findViewById(android.R.id.button2);
        vmVar.l = button3;
        button3.setOnClickListener(cbVar);
        boolean isEmpty2 = TextUtils.isEmpty(vmVar.m);
        Button button4 = vmVar.l;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(vmVar.m);
            vmVar.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) b3.findViewById(android.R.id.button3);
        vmVar.o = button5;
        button5.setOnClickListener(cbVar);
        boolean isEmpty3 = TextUtils.isEmpty(vmVar.p);
        Button button6 = vmVar.o;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(vmVar.p);
            vmVar.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = vmVar.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = vmVar.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = vmVar.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (vmVar.w != null) {
            b.addView(vmVar.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            vmVar.t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(vmVar.d) || !vmVar.E) {
                window.findViewById(R.id.title_template).setVisibility(8);
                vmVar.t.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                vmVar.u = textView2;
                textView2.setText(vmVar.d);
                Drawable drawable = vmVar.s;
                if (drawable != null) {
                    vmVar.t.setImageDrawable(drawable);
                } else {
                    vmVar.u.setPadding(vmVar.t.getPaddingLeft(), vmVar.t.getPaddingTop(), vmVar.t.getPaddingRight(), vmVar.t.getPaddingBottom());
                    vmVar.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b3.getVisibility() != 8;
        if (!z3 && (findViewById = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = vmVar.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (vmVar.e == null && vmVar.f == null) ? null : b.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = vmVar.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = vmVar.f;
            if (view2 == null) {
                view2 = vmVar.r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = bsk.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = vmVar.f;
        if (alertController$RecycleListView2 == null || (listAdapter = vmVar.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = vmVar.y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.r;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.wb0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        vm vmVar = this.g;
        vmVar.d = charSequence;
        TextView textView = vmVar.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

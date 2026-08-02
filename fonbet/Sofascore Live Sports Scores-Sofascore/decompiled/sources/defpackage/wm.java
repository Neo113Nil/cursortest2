package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class wm {
    public final sm a;
    public final int b;

    public wm(@NonNull Context context, int i) {
        this.a = new sm(new ContextThemeWrapper(context, xm.f(i, context)));
        this.b = i;
    }

    @NonNull
    public xm create() {
        ListAdapter listAdapter;
        sm smVar = this.a;
        ContextThemeWrapper contextThemeWrapper = smVar.a;
        ContextThemeWrapper contextThemeWrapper2 = smVar.a;
        xm xmVar = new xm(contextThemeWrapper, this.b);
        View view = smVar.e;
        vm vmVar = xmVar.g;
        if (view != null) {
            vmVar.w = view;
        } else {
            CharSequence charSequence = smVar.d;
            if (charSequence != null) {
                vmVar.d = charSequence;
                TextView textView = vmVar.u;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = smVar.c;
            if (drawable != null) {
                vmVar.s = drawable;
                ImageView imageView = vmVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    vmVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = smVar.f;
        if (charSequence2 != null) {
            vmVar.e = charSequence2;
            TextView textView2 = vmVar.v;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = smVar.g;
        if (charSequence3 != null) {
            vmVar.c(-1, charSequence3, smVar.h);
        }
        CharSequence charSequence4 = smVar.i;
        if (charSequence4 != null) {
            vmVar.c(-2, charSequence4, smVar.j);
        }
        if (smVar.l != null || smVar.m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) smVar.b.inflate(vmVar.A, (ViewGroup) null);
            if (smVar.q) {
                listAdapter = new pm(smVar, contextThemeWrapper2, vmVar.B, smVar.l, alertController$RecycleListView);
            } else {
                int i = smVar.r ? vmVar.C : vmVar.D;
                listAdapter = smVar.m;
                if (listAdapter == null) {
                    listAdapter = new um(contextThemeWrapper2, i, R.id.text1, smVar.l);
                }
            }
            vmVar.x = listAdapter;
            vmVar.y = smVar.s;
            if (smVar.n != null) {
                alertController$RecycleListView.setOnItemClickListener(new qm(smVar, vmVar));
            } else if (smVar.t != null) {
                alertController$RecycleListView.setOnItemClickListener(new rm(smVar, alertController$RecycleListView, vmVar));
            }
            if (smVar.r) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (smVar.q) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            vmVar.f = alertController$RecycleListView;
        }
        View view2 = smVar.o;
        if (view2 != null) {
            vmVar.g = view2;
            vmVar.h = false;
        }
        xmVar.setCancelable(true);
        xmVar.setCanceledOnTouchOutside(true);
        xmVar.setOnCancelListener(null);
        xmVar.setOnDismissListener(null);
        xec xecVar = smVar.k;
        if (xecVar != null) {
            xmVar.setOnKeyListener(xecVar);
        }
        return xmVar;
    }

    @NonNull
    public Context getContext() {
        return this.a.a;
    }

    public wm setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        sm smVar = this.a;
        smVar.i = smVar.a.getText(i);
        smVar.j = onClickListener;
        return this;
    }

    public wm setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        sm smVar = this.a;
        smVar.g = smVar.a.getText(i);
        smVar.h = onClickListener;
        return this;
    }

    public wm setTitle(@Nullable CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public wm setView(View view) {
        this.a.o = view;
        return this;
    }

    public wm(Context context) {
        this(context, xm.f(0, context));
    }
}

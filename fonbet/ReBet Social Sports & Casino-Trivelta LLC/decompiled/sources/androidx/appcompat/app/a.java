package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;
import l.AbstractC5335a;
import m.r;

/* loaded from: classes.dex */
public class a extends r implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final AlertController f16533f;

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0340a {

        /* renamed from: a, reason: collision with root package name */
        public final AlertController.b f16534a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16535b;

        public C0340a(Context context) {
            this(context, a.k(context, 0));
        }

        public C0340a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16515v = listAdapter;
            bVar.f16516w = onClickListener;
            return this;
        }

        public C0340a b(boolean z10) {
            this.f16534a.f16511r = z10;
            return this;
        }

        public C0340a c(View view) {
            this.f16534a.f16500g = view;
            return this;
        }

        @NonNull
        public a create() {
            a aVar = new a(this.f16534a.f16494a, this.f16535b);
            this.f16534a.a(aVar.f16533f);
            aVar.setCancelable(this.f16534a.f16511r);
            if (this.f16534a.f16511r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f16534a.f16512s);
            aVar.setOnDismissListener(this.f16534a.f16513t);
            DialogInterface.OnKeyListener onKeyListener = this.f16534a.f16514u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public C0340a d(Drawable drawable) {
            this.f16534a.f16497d = drawable;
            return this;
        }

        public C0340a e(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.mItems = charSequenceArr;
            bVar.f16516w = onClickListener;
            return this;
        }

        public C0340a f(int i10) {
            AlertController.b bVar = this.f16534a;
            bVar.f16501h = bVar.f16494a.getText(i10);
            return this;
        }

        public C0340a g(CharSequence charSequence) {
            this.f16534a.f16501h = charSequence;
            return this;
        }

        @NonNull
        public Context getContext() {
            return this.f16534a.f16494a;
        }

        public C0340a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16505l = charSequence;
            bVar.f16507n = onClickListener;
            return this;
        }

        public C0340a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16508o = charSequence;
            bVar.f16510q = onClickListener;
            return this;
        }

        public C0340a j(DialogInterface.OnCancelListener onCancelListener) {
            this.f16534a.f16512s = onCancelListener;
            return this;
        }

        public C0340a k(DialogInterface.OnDismissListener onDismissListener) {
            this.f16534a.f16513t = onDismissListener;
            return this;
        }

        public C0340a l(DialogInterface.OnKeyListener onKeyListener) {
            this.f16534a.f16514u = onKeyListener;
            return this;
        }

        public C0340a m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16502i = charSequence;
            bVar.f16504k = onClickListener;
            return this;
        }

        public C0340a n(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16515v = listAdapter;
            bVar.f16516w = onClickListener;
            bVar.f16487G = i10;
            bVar.f16486F = true;
            return this;
        }

        public C0340a o(int i10) {
            AlertController.b bVar = this.f16534a;
            bVar.f16499f = bVar.f16494a.getText(i10);
            return this;
        }

        public a p() {
            a create = create();
            create.show();
            return create;
        }

        public C0340a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16505l = bVar.f16494a.getText(i10);
            this.f16534a.f16507n = onClickListener;
            return this;
        }

        public C0340a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f16534a;
            bVar.f16502i = bVar.f16494a.getText(i10);
            this.f16534a.f16504k = onClickListener;
            return this;
        }

        public C0340a setTitle(CharSequence charSequence) {
            this.f16534a.f16499f = charSequence;
            return this;
        }

        public C0340a setView(View view) {
            AlertController.b bVar = this.f16534a;
            bVar.f16518y = view;
            bVar.f16517x = 0;
            bVar.f16484D = false;
            return this;
        }

        public C0340a(@NonNull Context context, int i10) {
            this.f16534a = new AlertController.b(new ContextThemeWrapper(context, a.k(context, i10)));
            this.f16535b = i10;
        }
    }

    public a(Context context, int i10) {
        super(context, k(context, i10));
        this.f16533f = new AlertController(getContext(), this, getWindow());
    }

    public static int k(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC5335a.f54997l, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i10) {
        return this.f16533f.c(i10);
    }

    public ListView j() {
        return this.f16533f.e();
    }

    public void l(View view) {
        this.f16533f.s(view);
    }

    @Override // m.r, androidx.activity.q, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16533f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f16533f.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f16533f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // m.r, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f16533f.q(charSequence);
    }
}

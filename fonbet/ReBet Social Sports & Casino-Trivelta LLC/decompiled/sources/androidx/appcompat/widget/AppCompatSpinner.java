package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import l.AbstractC5335a;
import n.AbstractC5596a;
import x0.AbstractC6773b;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {

    @SuppressLint({"ResourceType"})
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C2049d f16921a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16922b;

    /* renamed from: c, reason: collision with root package name */
    public L f16923c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f16924d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16925e;

    /* renamed from: f, reason: collision with root package name */
    public g f16926f;

    /* renamed from: g, reason: collision with root package name */
    public int f16927g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f16928h;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public boolean f16929a;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f16929a ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f16929a = parcel.readByte() != 0;
        }
    }

    public class a extends L {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f f16930i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, f fVar) {
            super(view);
            this.f16930i = fVar;
        }

        @Override // androidx.appcompat.widget.L
        public r.f b() {
            return this.f16930i;
        }

        @Override // androidx.appcompat.widget.L
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class c {
        public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (AbstractC6773b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class d implements g, DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public androidx.appcompat.app.a f16933a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f16934b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f16935c;

        public d() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void d(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void dismiss() {
            androidx.appcompat.app.a aVar = this.f16933a;
            if (aVar != null) {
                aVar.dismiss();
                this.f16933a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence e() {
            return this.f16935c;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public Drawable f() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void g(CharSequence charSequence) {
            this.f16935c = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void h(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void i(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public boolean isShowing() {
            androidx.appcompat.app.a aVar = this.f16933a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void j(int i10, int i11) {
            if (this.f16934b == null) {
                return;
            }
            a.C0340a c0340a = new a.C0340a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f16935c;
            if (charSequence != null) {
                c0340a.setTitle(charSequence);
            }
            androidx.appcompat.app.a create = c0340a.n(this.f16934b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.f16933a = create;
            ListView j10 = create.j();
            j10.setTextDirection(i10);
            j10.setTextAlignment(i11);
            this.f16933a.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public int k() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void l(ListAdapter listAdapter) {
            this.f16934b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i10, this.f16934b.getItemId(i10));
            }
            dismiss();
        }
    }

    public static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public SpinnerAdapter f16937a;

        /* renamed from: b, reason: collision with root package name */
        public ListAdapter f16938b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f16937a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f16938b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f16938b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f16938b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f16937a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class f extends M implements g {

        /* renamed from: I, reason: collision with root package name */
        public CharSequence f16939I;

        /* renamed from: J, reason: collision with root package name */
        public ListAdapter f16940J;

        /* renamed from: K, reason: collision with root package name */
        public final Rect f16941K;

        /* renamed from: L, reason: collision with root package name */
        public int f16942L;

        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppCompatSpinner f16944a;

            public a(AppCompatSpinner appCompatSpinner) {
                this.f16944a = appCompatSpinner;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.f16940J.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.U(AppCompatSpinner.this)) {
                    f.this.dismiss();
                } else {
                    f.this.S();
                    f.super.show();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f16947a;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f16947a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f16947a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f16941K = new Rect();
            B(AppCompatSpinner.this);
            I(true);
            O(0);
            K(new a(AppCompatSpinner.this));
        }

        public void S() {
            int i10;
            Drawable f10 = f();
            if (f10 != null) {
                f10.getPadding(AppCompatSpinner.this.f16928h);
                i10 = l0.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f16928h.right : -AppCompatSpinner.this.f16928h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f16928h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f16927g;
            if (i11 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.f16940J, f());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f16928h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (a10 > i13) {
                    a10 = i13;
                }
                D(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                D((width - paddingLeft) - paddingRight);
            } else {
                D(i11);
            }
            d(l0.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - x()) - T()) : i10 + paddingLeft + T());
        }

        public int T() {
            return this.f16942L;
        }

        public boolean U(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f16941K);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public CharSequence e() {
            return this.f16939I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void g(CharSequence charSequence) {
            this.f16939I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void i(int i10) {
            this.f16942L = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public void j(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            S();
            H(2);
            super.show();
            ListView n10 = n();
            n10.setChoiceMode(1);
            n10.setTextDirection(i10);
            n10.setTextAlignment(i11);
            P(AppCompatSpinner.this.getSelectedItemPosition());
            if (isShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.M, androidx.appcompat.widget.AppCompatSpinner.g
        public void l(ListAdapter listAdapter) {
            super.l(listAdapter);
            this.f16940J = listAdapter;
        }
    }

    public interface g {
        void a(Drawable drawable);

        int b();

        void d(int i10);

        void dismiss();

        CharSequence e();

        Drawable f();

        void g(CharSequence charSequence);

        void h(int i10);

        void i(int i10);

        boolean isShowing();

        void j(int i10, int i11);

        int k();

        void l(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54980M);
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f16928h);
        Rect rect = this.f16928h;
        return i11 + rect.left + rect.right;
    }

    public void b() {
        this.f16926f.j(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            c2049d.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f16926f;
        return gVar != null ? gVar.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f16926f;
        return gVar != null ? gVar.k() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f16926f != null ? this.f16927g : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f16926f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f16926f;
        return gVar != null ? gVar.f() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f16922b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f16926f;
        return gVar != null ? gVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            return c2049d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            return c2049d.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f16926f;
        if (gVar == null || !gVar.isShowing()) {
            return;
        }
        this.f16926f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f16926f == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f16929a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        g gVar = this.f16926f;
        savedState.f16929a = gVar != null && gVar.isShowing();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        L l10 = this.f16923c;
        if (l10 == null || !l10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.f16926f;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.isShowing()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            c2049d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            c2049d.g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f16926f;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.i(i10);
            this.f16926f.d(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f16926f;
        if (gVar != null) {
            gVar.h(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f16926f != null) {
            this.f16927g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f16926f;
        if (gVar != null) {
            gVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(AbstractC5596a.b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f16926f;
        if (gVar != null) {
            gVar.g(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            c2049d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2049d c2049d = this.f16921a;
        if (c2049d != null) {
            c2049d.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f16925e) {
            this.f16924d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f16926f != null) {
            Context context = this.f16922b;
            if (context == null) {
                context = getContext();
            }
            this.f16926f.l(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.AppCompatSpinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11, Resources.Theme theme) {
        super(context, attributeSet, i10);
        TypedArray typedArray;
        this.f16928h = new Rect();
        W.a(this, getContext());
        a0 v10 = a0.v(context, attributeSet, l.j.Spinner, i10, 0);
        this.f16921a = new C2049d(this);
        if (theme != null) {
            this.f16922b = new androidx.appcompat.view.d(context, theme);
        } else {
            int n10 = v10.n(l.j.f55273a2, 0);
            if (n10 != 0) {
                this.f16922b = new androidx.appcompat.view.d(context, n10);
            } else {
                this.f16922b = context;
            }
        }
        ?? r11 = -1;
        TypedArray typedArray2 = null;
        try {
            if (i11 == -1) {
                try {
                    typedArray = context.obtainStyledAttributes(attributeSet, ATTRS_ANDROID_SPINNERMODE, i10, 0);
                    try {
                        boolean hasValue = typedArray.hasValue(0);
                        r11 = typedArray;
                        if (hasValue) {
                            i11 = typedArray.getInt(0, 0);
                            r11 = typedArray;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                        r11 = typedArray;
                    }
                } catch (Exception e11) {
                    e = e11;
                    typedArray = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (typedArray2 != null) {
                        typedArray2.recycle();
                    }
                    throw th;
                }
                r11.recycle();
            }
            if (i11 == 0) {
                d dVar = new d();
                this.f16926f = dVar;
                dVar.g(v10.o(l.j.f55264Y1));
            } else if (i11 == 1) {
                f fVar = new f(this.f16922b, attributeSet, i10);
                a0 v11 = a0.v(this.f16922b, attributeSet, l.j.Spinner, i10, 0);
                this.f16927g = v11.m(l.j.f55268Z1, -2);
                fVar.a(v11.g(l.j.f55260X1));
                fVar.g(v10.o(l.j.f55264Y1));
                v11.x();
                this.f16926f = fVar;
                this.f16923c = new a(this, fVar);
            }
            CharSequence[] q10 = v10.q(l.j.f55256W1);
            if (q10 != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, q10);
                arrayAdapter.setDropDownViewResource(l.g.f55141t);
                setAdapter(arrayAdapter);
            }
            v10.x();
            this.f16925e = true;
            SpinnerAdapter spinnerAdapter = this.f16924d;
            if (spinnerAdapter != null) {
                setAdapter(spinnerAdapter);
                this.f16924d = null;
            }
            this.f16921a.e(attributeSet, i10);
        } catch (Throwable th3) {
            th = th3;
            typedArray2 = r11;
        }
    }
}

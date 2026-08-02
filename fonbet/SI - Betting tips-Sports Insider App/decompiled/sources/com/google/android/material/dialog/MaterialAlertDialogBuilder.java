package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.k;
import androidx.appcompat.app.l;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import n.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialAlertDialogBuilder extends k {
    private static final int DEF_STYLE_ATTR = 2130968622;
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    private Drawable background;

    @NonNull
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(@NonNull Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(@NonNull Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context wrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? wrap : new d(wrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(@NonNull Context context) {
        TypedValue resolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    private static int getOverridingThemeResId(@NonNull Context context, int i5) {
        return i5 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i5;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public l create() {
        l create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(decorView.getElevation());
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.backgroundInsets));
        return create;
    }

    public Drawable getBackground() {
        return this.background;
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int i5) {
        this.backgroundInsets.bottom = i5;
        return this;
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int i5) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i5;
            return this;
        }
        this.backgroundInsets.right = i5;
        return this;
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetStart(int i5) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i5;
            return this;
        }
        this.backgroundInsets.left = i5;
        return this;
    }

    @NonNull
    public MaterialAlertDialogBuilder setBackgroundInsetTop(int i5) {
        this.backgroundInsets.top = i5;
        return this;
    }

    public MaterialAlertDialogBuilder(@NonNull Context context, int i5) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i5));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i10 = DEF_STYLE_ATTR;
        int i11 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i10, i11);
        int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, R.styleable.MaterialAlertDialog, i10, i11);
        int color2 = obtainStyledAttributes.getColor(R.styleable.MaterialAlertDialog_backgroundTint, color);
        obtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i10, i11);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.background = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        super.setAdapter(listAdapter, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setCancelable(boolean z5) {
        super.setCancelable(z5);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, @NonNull String str) {
        super.setCursor(cursor, onClickListener, str);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setCustomTitle(View view) {
        super.setCustomTitle(view);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setIconAttribute(int i5) {
        super.setIconAttribute(i5);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setNegativeButtonIcon(Drawable drawable) {
        super.setNegativeButtonIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setNeutralButtonIcon(Drawable drawable) {
        super.setNeutralButtonIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setPositiveButtonIcon(Drawable drawable) {
        super.setPositiveButtonIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setIcon(int i5) {
        super.setIcon(i5);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setItems(int i5, DialogInterface.OnClickListener onClickListener) {
        super.setItems(i5, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setMessage(int i5) {
        super.setMessage(i5);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setNegativeButton(int i5, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i5, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setNeutralButton(int i5, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(i5, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setPositiveButton(int i5, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i5, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setTitle(int i5) {
        super.setTitle(i5);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setView(int i5) {
        super.setView(i5);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setIcon(Drawable drawable) {
        super.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        super.setItems(charSequenceArr, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setMultiChoiceItems(int i5, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.setMultiChoiceItems(i5, zArr, onMultiChoiceClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(charSequence, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setView(View view) {
        super.setView(view);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(int i5, int i10, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(i5, i10, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setMultiChoiceItems(Cursor cursor, @NonNull String str, @NonNull String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int i5, @NonNull String str, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(cursor, i5, str, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArr, int i5, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(charSequenceArr, i5, onClickListener);
        return this;
    }

    @Override // androidx.appcompat.app.k
    @NonNull
    public MaterialAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i5, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(listAdapter, i5, onClickListener);
        return this;
    }
}

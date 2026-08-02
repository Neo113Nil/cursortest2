package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c4;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.w;
import androidx.vectordrawable.graphics.drawable.c;
import androidx.vectordrawable.graphics.drawable.f;
import androidx.vectordrawable.graphics.drawable.g;
import androidx.vectordrawable.graphics.drawable.h;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import d9.e;
import f0.l;
import h8.b;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.sentry.android.core.w0;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class MaterialCheckBox extends w {
    private static final int[][] CHECKBOX_STATES;
    private static final int[] ERROR_STATE_SET;

    @SuppressLint({"DiscouragedApi"})
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;
    private Drawable buttonDrawable;
    private Drawable buttonIconDrawable;
    ColorStateList buttonIconTintList;

    @NonNull
    private PorterDuff.Mode buttonIconTintMode;
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;
    private CharSequence customStateDescription;
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private ColorStateList materialThemeColorsTintList;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;

    @NonNull
    private final LinkedHashSet<OnCheckedStateChangedListener> onCheckedStateChangedListeners;

    @NonNull
    private final LinkedHashSet<OnErrorChangedListener> onErrorChangedListeners;
    private final h transitionToUnchecked;
    private final c transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] INDETERMINATE_STATE_SET = {R.attr.state_indeterminate};

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(@NonNull MaterialCheckBox materialCheckBox, int i5);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface OnErrorChangedListener {
        void onErrorChanged(@NonNull MaterialCheckBox materialCheckBox, boolean z5);
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.checkbox.MaterialCheckBox.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        };
        int checkedState;

        @NonNull
        private String getCheckedStateString() {
            int i5 = this.checkedState;
            return i5 != 1 ? i5 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            return e.l(sb2, getCheckedStateString(), "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeValue(Integer.valueOf(this.checkedState));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.checkedState = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i5 = R.attr.state_error;
        ERROR_STATE_SET = new int[]{i5};
        CHECKBOX_STATES = new int[][]{new int[]{android.R.attr.state_enabled, i5}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", ConstantDeviceInfo.APP_PLATFORM);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i5 = this.checkedState;
        return i5 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i5 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = CHECKBOX_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, com.sports.insider.R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, com.sports.insider.R.attr.colorError);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.buttonTintList;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private boolean isButtonDrawableLegacy(c4 c4Var) {
        return c4Var.f722b.getResourceId(R.styleable.MaterialCheckBox_android_button, 0) == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && c4Var.f722b.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, getButtonTintMode());
        this.buttonIconDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        h hVar;
        d dVar;
        if (this.usingMaterialButtonDrawable) {
            h hVar2 = this.transitionToUnchecked;
            if (hVar2 != null) {
                c cVar = this.transitionToUncheckedCallback;
                if (cVar != null) {
                    Drawable drawable = hVar2.f2803a;
                    if (drawable != null) {
                        g.c((AnimatedVectorDrawable) drawable, cVar.getPlatformCallback());
                    }
                    ArrayList arrayList = hVar2.f2799e;
                    if (arrayList != null) {
                        arrayList.remove(cVar);
                        if (hVar2.f2799e.size() == 0 && (dVar = hVar2.f2798d) != null) {
                            hVar2.f2796b.f2791b.removeListener(dVar);
                            hVar2.f2798d = null;
                        }
                    }
                }
                h hVar3 = this.transitionToUnchecked;
                c cVar2 = this.transitionToUncheckedCallback;
                if (cVar2 == null) {
                    hVar3.getClass();
                } else {
                    Drawable drawable2 = hVar3.f2803a;
                    if (drawable2 != null) {
                        g.b((AnimatedVectorDrawable) drawable2, cVar2.getPlatformCallback());
                    } else {
                        if (hVar3.f2799e == null) {
                            hVar3.f2799e = new ArrayList();
                        }
                        if (!hVar3.f2799e.contains(cVar2)) {
                            hVar3.f2799e.add(cVar2);
                            if (hVar3.f2798d == null) {
                                hVar3.f2798d = new d(3, hVar3);
                            }
                            hVar3.f2796b.f2791b.addListener(hVar3.f2798d);
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.buttonDrawable;
                if (!(drawable3 instanceof AnimatedStateListDrawable) || (hVar = this.transitionToUnchecked) == null) {
                    return;
                }
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, hVar, false);
                ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(R.id.indeterminate, R.id.unchecked, this.transitionToUnchecked, false);
            }
        }
    }

    private void updateButtonTints() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.buttonDrawable;
        if (drawable != null && (colorStateList2 = this.buttonTintList) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.buttonIconDrawable;
        if (drawable2 == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    public void addOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.add(onErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.checkedState == 1;
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(onCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = DrawableUtils.getCheckedState(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.centerIfNoTextEnabled || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.errorAccessibilityLabel));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checkedState = getCheckedState();
        return savedState;
    }

    public void removeOnCheckedStateChangedListener(@NonNull OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(@NonNull OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.remove(onErrorChangedListener);
    }

    @Override // androidx.appcompat.widget.w, android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(b.n(getContext(), i5));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int i5) {
        setButtonIconDrawable(b.n(getContext(), i5));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.centerIfNoTextEnabled = z5;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i5) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i5) {
            this.checkedState = i5;
            super.setChecked(i5 == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            LinkedHashSet<OnCheckedStateChangedListener> linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                Iterator<OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onCheckedStateChangedListener(this, this.checkedState);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i5) {
        setErrorAccessibilityLabel(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setErrorShown(boolean z5) {
        if (this.errorShown == z5) {
            return;
        }
        this.errorShown = z5;
        refreshDrawableState();
        Iterator<OnErrorChangedListener> it = this.onErrorChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onErrorChanged(this, this.errorShown);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.useMaterialThemeColors = z5;
        if (z5) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.sports.insider.R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.w, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i5) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, DEF_STYLE_RES), attributeSet, i5);
        h hVar;
        int next;
        Context context2;
        TypedArray typedArray;
        this.onErrorChangedListeners = new LinkedHashSet<>();
        this.onCheckedStateChangedListeners = new LinkedHashSet<>();
        Context context3 = getContext();
        int i10 = R.drawable.mtrl_checkbox_button_checked_unchecked;
        if (Build.VERSION.SDK_INT >= 24) {
            hVar = new h(context3, 0);
            Resources resources = context3.getResources();
            Resources.Theme theme = context3.getTheme();
            ThreadLocal threadLocal = l.f9293a;
            Drawable drawable = resources.getDrawable(i10, theme);
            drawable.setCallback(hVar.f2800f);
            new f(drawable.getConstantState());
            hVar.f2803a = drawable;
        } else {
            int i11 = h.f2795g;
            try {
                XmlResourceParser xml = context3.getResources().getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    Resources resources2 = context3.getResources();
                    Resources.Theme theme2 = context3.getTheme();
                    h hVar2 = new h(context3, 0);
                    hVar2.inflate(resources2, xml, asAttributeSet, theme2);
                    hVar = hVar2;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException e7) {
                w0.e("AnimatedVDCompat", "parser error", e7);
                hVar = null;
                this.transitionToUnchecked = hVar;
                this.transitionToUncheckedCallback = new c() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
                    @Override // androidx.vectordrawable.graphics.drawable.c
                    public void onAnimationEnd(Drawable drawable2) {
                        ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
                        if (colorStateList != null) {
                            drawable2.setTintList(colorStateList);
                        }
                    }

                    @Override // androidx.vectordrawable.graphics.drawable.c
                    public void onAnimationStart(Drawable drawable2) {
                        super.onAnimationStart(drawable2);
                        MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                        ColorStateList colorStateList = materialCheckBox.buttonTintList;
                        if (colorStateList != null) {
                            drawable2.setTint(colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                        }
                    }
                };
                context2 = getContext();
                this.buttonDrawable = getButtonDrawable();
                this.buttonTintList = getSuperButtonTintList();
                setSupportButtonTintList(null);
                c4 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialCheckBox, i5, DEF_STYLE_RES, new int[0]);
                Drawable b10 = obtainTintedStyledAttributes.b(R.styleable.MaterialCheckBox_buttonIcon);
                typedArray = obtainTintedStyledAttributes.f722b;
                this.buttonIconDrawable = b10;
                if (this.buttonDrawable != null) {
                    super.setButtonDrawable((Drawable) null);
                    this.buttonDrawable = b.n(context2, R.drawable.mtrl_checkbox_button);
                    this.usingMaterialButtonDrawable = true;
                    if (this.buttonIconDrawable == null) {
                    }
                }
                this.buttonIconTintList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.MaterialCheckBox_buttonIconTint);
                this.buttonIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
                this.useMaterialThemeColors = typedArray.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
                this.centerIfNoTextEnabled = typedArray.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
                this.errorShown = typedArray.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
                this.errorAccessibilityLabel = typedArray.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
                if (typedArray.hasValue(R.styleable.MaterialCheckBox_checkedState)) {
                }
                obtainTintedStyledAttributes.g();
                refreshButtonDrawable();
            } catch (XmlPullParserException e9) {
                w0.e("AnimatedVDCompat", "parser error", e9);
                hVar = null;
                this.transitionToUnchecked = hVar;
                this.transitionToUncheckedCallback = new c() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
                    @Override // androidx.vectordrawable.graphics.drawable.c
                    public void onAnimationEnd(Drawable drawable2) {
                        ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
                        if (colorStateList != null) {
                            drawable2.setTintList(colorStateList);
                        }
                    }

                    @Override // androidx.vectordrawable.graphics.drawable.c
                    public void onAnimationStart(Drawable drawable2) {
                        super.onAnimationStart(drawable2);
                        MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                        ColorStateList colorStateList = materialCheckBox.buttonTintList;
                        if (colorStateList != null) {
                            drawable2.setTint(colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                        }
                    }
                };
                context2 = getContext();
                this.buttonDrawable = getButtonDrawable();
                this.buttonTintList = getSuperButtonTintList();
                setSupportButtonTintList(null);
                c4 obtainTintedStyledAttributes2 = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialCheckBox, i5, DEF_STYLE_RES, new int[0]);
                Drawable b102 = obtainTintedStyledAttributes2.b(R.styleable.MaterialCheckBox_buttonIcon);
                typedArray = obtainTintedStyledAttributes2.f722b;
                this.buttonIconDrawable = b102;
                if (this.buttonDrawable != null) {
                }
                this.buttonIconTintList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes2, R.styleable.MaterialCheckBox_buttonIconTint);
                this.buttonIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
                this.useMaterialThemeColors = typedArray.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
                this.centerIfNoTextEnabled = typedArray.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
                this.errorShown = typedArray.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
                this.errorAccessibilityLabel = typedArray.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
                if (typedArray.hasValue(R.styleable.MaterialCheckBox_checkedState)) {
                }
                obtainTintedStyledAttributes2.g();
                refreshButtonDrawable();
            }
        }
        this.transitionToUnchecked = hVar;
        this.transitionToUncheckedCallback = new c() { // from class: com.google.android.material.checkbox.MaterialCheckBox.1
            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(Drawable drawable2) {
                ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
                if (colorStateList != null) {
                    drawable2.setTintList(colorStateList);
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationStart(Drawable drawable2) {
                super.onAnimationStart(drawable2);
                MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
                ColorStateList colorStateList = materialCheckBox.buttonTintList;
                if (colorStateList != null) {
                    drawable2.setTint(colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
                }
            }
        };
        context2 = getContext();
        this.buttonDrawable = getButtonDrawable();
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList(null);
        c4 obtainTintedStyledAttributes22 = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialCheckBox, i5, DEF_STYLE_RES, new int[0]);
        Drawable b1022 = obtainTintedStyledAttributes22.b(R.styleable.MaterialCheckBox_buttonIcon);
        typedArray = obtainTintedStyledAttributes22.f722b;
        this.buttonIconDrawable = b1022;
        if (this.buttonDrawable != null && ThemeEnforcement.isMaterial3Theme(context2) && isButtonDrawableLegacy(obtainTintedStyledAttributes22)) {
            super.setButtonDrawable((Drawable) null);
            this.buttonDrawable = b.n(context2, R.drawable.mtrl_checkbox_button);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = b.n(context2, R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.buttonIconTintList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes22, R.styleable.MaterialCheckBox_buttonIconTint);
        this.buttonIconTintMode = ViewUtils.parseTintMode(typedArray.getInt(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = typedArray.getBoolean(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.centerIfNoTextEnabled = typedArray.getBoolean(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.errorShown = typedArray.getBoolean(R.styleable.MaterialCheckBox_errorShown, false);
        this.errorAccessibilityLabel = typedArray.getText(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArray.hasValue(R.styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArray.getInt(R.styleable.MaterialCheckBox_checkedState, 0));
        }
        obtainTintedStyledAttributes22.g();
        refreshButtonDrawable();
    }
}

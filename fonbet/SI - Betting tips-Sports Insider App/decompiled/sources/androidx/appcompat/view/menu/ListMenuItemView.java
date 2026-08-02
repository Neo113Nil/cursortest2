package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.c4;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements a0, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public p f416a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f417b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f418c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f419d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f420e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f421f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f422g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f423h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f424i;
    public final Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public final int f425k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f426l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f427m;

    /* renamed from: n, reason: collision with root package name */
    public final Drawable f428n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f429o;

    /* renamed from: p, reason: collision with root package name */
    public LayoutInflater f430p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c4 f6 = c4.f(getContext(), attributeSet, i.a.f10846s, R.attr.listMenuViewStyle, 0);
        this.j = f6.b(5);
        TypedArray typedArray = f6.f722b;
        this.f425k = typedArray.getResourceId(1, -1);
        this.f427m = typedArray.getBoolean(7, false);
        this.f426l = context;
        this.f428n = f6.b(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f429o = obtainStyledAttributes.hasValue(0);
        f6.g();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f430p == null) {
            this.f430p = LayoutInflater.from(getContext());
        }
        return this.f430p;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f422g;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f423h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f423h.getLayoutParams();
        rect.top = this.f423h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.a0
    public p getItemData() {
        return this.f416a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r11 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    @Override // androidx.appcompat.view.menu.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize(p pVar, int i5) {
        boolean z5;
        String sb2;
        boolean z7;
        this.f416a = pVar;
        boolean isVisible = pVar.isVisible();
        n nVar = pVar.f529n;
        int i10 = 0;
        setVisibility(isVisible ? 0 : 8);
        setTitle(pVar.f521e);
        setCheckable(pVar.isCheckable());
        if (nVar.isShortcutsVisible()) {
            if ((nVar.isQwertyMode() ? pVar.j : pVar.f524h) != 0) {
                z5 = true;
                nVar.isQwertyMode();
                if (z5) {
                    p pVar2 = this.f416a;
                    n nVar2 = pVar2.f529n;
                    if (nVar2.isShortcutsVisible()) {
                        if ((nVar2.isQwertyMode() ? pVar2.j : pVar2.f524h) != 0) {
                            z7 = true;
                        }
                    }
                    z7 = false;
                }
                i10 = 8;
                if (i10 == 0) {
                    TextView textView = this.f421f;
                    p pVar3 = this.f416a;
                    n nVar3 = pVar3.f529n;
                    char c2 = nVar3.isQwertyMode() ? pVar3.j : pVar3.f524h;
                    if (c2 == 0) {
                        sb2 = "";
                    } else {
                        Resources resources = nVar3.getContext().getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(nVar3.getContext()).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i11 = nVar3.isQwertyMode() ? pVar3.f526k : pVar3.f525i;
                        p.c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb3);
                        p.c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb3);
                        p.c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb3);
                        p.c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb3);
                        p.c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb3);
                        p.c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb3);
                        if (c2 == '\b') {
                            sb3.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c2 == '\n') {
                            sb3.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c2 != ' ') {
                            sb3.append(c2);
                        } else {
                            sb3.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb2 = sb3.toString();
                    }
                    textView.setText(sb2);
                }
                if (this.f421f.getVisibility() != i10) {
                    this.f421f.setVisibility(i10);
                }
                setIcon(pVar.getIcon());
                setEnabled(pVar.isEnabled());
                setSubMenuArrowVisible(pVar.hasSubMenu());
                setContentDescription(pVar.q);
            }
        }
        z5 = false;
        nVar.isQwertyMode();
        if (z5) {
        }
        i10 = 8;
        if (i10 == 0) {
        }
        if (this.f421f.getVisibility() != i10) {
        }
        setIcon(pVar.getIcon());
        setEnabled(pVar.isEnabled());
        setSubMenuArrowVisible(pVar.hasSubMenu());
        setContentDescription(pVar.q);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f419d = textView;
        int i5 = this.f425k;
        if (i5 != -1) {
            textView.setTextAppearance(this.f426l, i5);
        }
        this.f421f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f422g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f428n);
        }
        this.f423h = (ImageView) findViewById(R.id.group_divider);
        this.f424i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        if (this.f417b != null && this.f427m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f417b.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i5, i10);
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f418c == null && this.f420e == null) {
            return;
        }
        if ((this.f416a.f538x & 4) != 0) {
            if (this.f418c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f418c = radioButton;
                LinearLayout linearLayout = this.f424i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f418c;
            view = this.f420e;
        } else {
            if (this.f420e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f420e = checkBox;
                LinearLayout linearLayout2 = this.f424i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f420e;
            view = this.f418c;
        }
        if (z5) {
            compoundButton.setChecked(this.f416a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f420e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f418c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if ((this.f416a.f538x & 4) != 0) {
            if (this.f418c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f418c = radioButton;
                LinearLayout linearLayout = this.f424i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f418c;
        } else {
            if (this.f420e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f420e = checkBox;
                LinearLayout linearLayout2 = this.f424i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f420e;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.q = z5;
        this.f427m = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f423h;
        if (imageView != null) {
            imageView.setVisibility((this.f429o || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z5 = this.f416a.f529n.getOptionalIconsVisible() || this.q;
        if (z5 || this.f427m) {
            ImageView imageView = this.f417b;
            if (imageView == null && drawable == null && !this.f427m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f417b = imageView2;
                LinearLayout linearLayout = this.f424i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f427m) {
                this.f417b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f417b;
            if (!z5) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f417b.getVisibility() != 0) {
                this.f417b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f419d.getVisibility() != 8) {
                this.f419d.setVisibility(8);
            }
        } else {
            this.f419d.setText(charSequence);
            if (this.f419d.getVisibility() != 0) {
                this.f419d.setVisibility(0);
            }
        }
    }
}

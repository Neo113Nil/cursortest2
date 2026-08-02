package s2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.core.view.AbstractC5307b;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceMenuItemC9585b extends MenuItem {
    AbstractC5307b a();

    @NonNull
    InterfaceMenuItemC9585b b(AbstractC5307b abstractC5307b);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setAlphabeticShortcut(char c11, int i11);

    @Override // android.view.MenuItem
    @NonNull
    InterfaceMenuItemC9585b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setNumericShortcut(char c11, int i11);

    @Override // android.view.MenuItem
    @NonNull
    MenuItem setShortcut(char c11, char c12, int i11, int i12);

    @Override // android.view.MenuItem
    @NonNull
    InterfaceMenuItemC9585b setTooltipText(CharSequence charSequence);
}

package com.vk.core.compose.component.cell.content;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.fvr;
import xsna.gzs;
import xsna.l5g;
import xsna.lg90;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public final class k {
    public static v a(ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, ButtonSize buttonSize, String str, lg90 lg90Var, l5g l5gVar, lg90 lg90Var2, boolean z, String str2, com.vk.core.compose.component.semantics.a aVar, gzs gzsVar, androidx.compose.runtime.a aVar2, int i, int i2, int i3) {
        ButtonAppearance buttonAppearance2;
        ButtonStyle buttonStyle2 = (i3 & 1) != 0 ? ButtonStyle.Primary : buttonStyle;
        if ((i3 & 2) != 0) {
            fvr.n();
            buttonAppearance2 = com.vk.core.compose.component.defaults.c.d;
        } else {
            buttonAppearance2 = buttonAppearance;
        }
        ButtonSize buttonSize2 = (i3 & 4) != 0 ? ButtonSize.Small : buttonSize;
        String str3 = (i3 & 8) != 0 ? null : str;
        lg90 lg90Var3 = (i3 & 16) != 0 ? null : lg90Var;
        l5g l5gVar2 = (i3 & 32) != 0 ? null : l5gVar;
        lg90 lg90Var4 = (i3 & 256) != 0 ? null : lg90Var2;
        boolean z2 = (i3 & 2048) != 0 ? true : z;
        String str4 = (i3 & 8192) != 0 ? null : str2;
        com.vk.core.compose.component.semantics.a aVar3 = (i3 & 16384) != 0 ? null : aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1891134425, i, i2, "com.vk.core.compose.component.cell.content.Cell.Right.Action.Button.Companion.invoke (Cell.kt:601)");
        }
        int i4 = i << 3;
        int i5 = (i4 & 1879048192) | (i4 & 112) | 6 | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | SQLiteDatabase.OPEN_PRIVATECACHE | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | 1073741824;
        int i6 = ((i >> 27) & 14) | ((i2 << 3) & 3670016);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(492099649, i5, i6, "com.vk.core.compose.component.cell.content.remember (CommonButtonImpl.kt:209)");
        }
        int i7 = i5 << 3;
        v a = w.a(buttonStyle2, buttonAppearance2, buttonSize2, str3, str4, lg90Var3, l5gVar2, lg90Var4, z2, aVar3, gzsVar, aVar2, ((i5 >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | (57344 & i5) | 2097152 | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), ((i5 >> 27) & 14) | 8 | ((i6 << 3) & 112) | ((i6 >> 3) & 458752), 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}

package com.vk.core.compose.component.datetime;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.input.InputSelect$State;
import java.util.Date;
import xsna.crx0;
import xsna.e7h;
import xsna.fai0;
import xsna.fh9;
import xsna.gre;
import xsna.gzs;
import xsna.k9x;
import xsna.o83;
import xsna.q6x;
import xsna.zak0;

/* compiled from: DateTimePickerState.kt */
/* loaded from: classes17.dex */
public final class i {
    public static final DateTimePickerState a(Date date, InputSelect$State inputSelect$State, k9x k9xVar, fai0 fai0Var, DateTimePickerState.UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy, androidx.compose.runtime.a aVar, int i, int i2) {
        fai0 fai0Var2;
        DateTimePickerState.UpdateValueFromDialogsStrategy updateValueFromDialogsStrategy2;
        Object obj = (i2 & 1) != 0 ? null : date;
        if ((i2 & 2) != 0) {
            inputSelect$State = null;
        }
        if ((i2 & 4) != 0) {
            k9xVar = c.d;
        }
        k9x k9xVar2 = k9xVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-544470953, i, -1, "com.vk.core.compose.component.datetime.rememberDateTimePickerState (DateTimePickerState.kt:34)");
        }
        aVar.K(749436442);
        Object[] objArr = new Object[0];
        fh9 C = q6x.C(new o83(k9xVar2, fai0Var, updateValueFromDialogsStrategy, 2), new gre(3));
        boolean z = true;
        boolean y = aVar.y(obj) | aVar.y(k9xVar2) | ((((i & 7168) ^ 3072) > 2048 && aVar.y(fai0Var)) || (i & 3072) == 2048);
        if ((((57344 & i) ^ 24576) <= 16384 || !aVar.o(updateValueFromDialogsStrategy.ordinal())) && (i & 24576) != 16384) {
            z = false;
        }
        boolean z2 = y | z;
        Object x = aVar.x();
        if (z2 || x == a.C0011a.a) {
            fai0Var2 = fai0Var;
            updateValueFromDialogsStrategy2 = updateValueFromDialogsStrategy;
            e7h e7hVar = new e7h(obj, k9xVar2, fai0Var2, updateValueFromDialogsStrategy2, 1);
            aVar.R(e7hVar);
            x = e7hVar;
        } else {
            fai0Var2 = fai0Var;
            updateValueFromDialogsStrategy2 = updateValueFromDialogsStrategy;
        }
        DateTimePickerState dateTimePickerState = (DateTimePickerState) crx0.D(objArr, C, (gzs) x, aVar, 0);
        ((zak0) dateTimePickerState.c).setValue(k9xVar2);
        ((zak0) dateTimePickerState.d).setValue(fai0Var2);
        ((zak0) dateTimePickerState.b).setValue(inputSelect$State);
        aVar.j();
        dateTimePickerState.g = updateValueFromDialogsStrategy2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return dateTimePickerState;
    }
}

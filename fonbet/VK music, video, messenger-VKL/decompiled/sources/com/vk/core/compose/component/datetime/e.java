package com.vk.core.compose.component.datetime;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.input.InputSelect$State;
import java.util.Date;
import xsna.b44;
import xsna.crx0;
import xsna.fai0;
import xsna.fh9;
import xsna.g6;
import xsna.gzs;
import xsna.k9x;
import xsna.ldi;
import xsna.q6x;
import xsna.zak0;

/* compiled from: DatePickerState.kt */
/* loaded from: classes17.dex */
public final class e {
    public static final d a(Date date, InputSelect$State inputSelect$State, k9x k9xVar, fai0 fai0Var, androidx.compose.runtime.a aVar, int i) {
        if ((i & 1) != 0) {
            date = null;
        }
        if ((i & 2) != 0) {
            inputSelect$State = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1775981636, 0, -1, "com.vk.core.compose.component.datetime.rememberDatePickerState (DatePickerState.kt:22)");
        }
        aVar.K(1616344068);
        Object[] objArr = new Object[0];
        fh9 C = q6x.C(new g6(9, k9xVar, fai0Var), new ldi((byte) 0, 2));
        boolean y = aVar.y(date) | aVar.y(k9xVar) | aVar.y(fai0Var);
        Object x = aVar.x();
        if (y || x == a.C0011a.a) {
            x = new b44(date, k9xVar, fai0Var, 1);
            aVar.R(x);
        }
        d dVar = (d) crx0.D(objArr, C, (gzs) x, aVar, 0);
        ((zak0) dVar.c).setValue(k9xVar);
        ((zak0) dVar.d).setValue(fai0Var);
        ((zak0) dVar.b).setValue(inputSelect$State);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return dVar;
    }
}

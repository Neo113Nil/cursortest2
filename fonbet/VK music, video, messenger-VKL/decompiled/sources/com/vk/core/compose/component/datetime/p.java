package com.vk.core.compose.component.datetime;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.b;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a71;
import xsna.alb0;
import xsna.bqv0;
import xsna.crx0;
import xsna.e3;
import xsna.epx;
import xsna.fh9;
import xsna.gzs;
import xsna.ir;
import xsna.k9x;
import xsna.kai;
import xsna.kuo0;
import xsna.lzk;
import xsna.n87;
import xsna.q630;
import xsna.q9o0;
import xsna.rgy;
import xsna.s3q0;
import xsna.sg50;
import xsna.u7d;
import xsna.uey;
import xsna.uki;
import xsna.uuo0;
import xsna.wql0;
import xsna.wzs;
import xsna.y3l0;
import xsna.you0;
import xsna.zak0;

/* compiled from: VkDateTimePicker.kt */
/* loaded from: classes17.dex */
public final class p {

    /* compiled from: VkDateTimePicker.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            DateTimePickerState dateTimePickerState = (DateTimePickerState) this.receiver;
            dateTimePickerState.getClass();
            ((zak0) dateTimePickerState.k).setValue(DateTimePickerState.DialogState.Closed.b);
            return s3q0.a;
        }
    }

    /* compiled from: VkDateTimePicker.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            DateTimePickerState dateTimePickerState = (DateTimePickerState) this.receiver;
            dateTimePickerState.getClass();
            ((zak0) dateTimePickerState.k).setValue(DateTimePickerState.DialogState.Closed.b);
            return s3q0.a;
        }
    }

    public static final void a(final DateTimePickerState dateTimePickerState, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(935394882);
        if ((i & 6) == 0) {
            i2 = (M.J(dateTimePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(935394882, i2, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog (VkDateTimePicker.kt:81)");
            }
            k9x k9xVar = (k9x) ((zak0) dateTimePickerState.c).getValue();
            q9o0 a2 = o.a(dateTimePickerState, M, i2 & 14);
            Date date = (Date) dateTimePickerState.h.getValue();
            you0.a(6, M, kai.c(1329314773, new e3(16, dateTimePickerState, lzk.p(date != null ? Long.valueOf(c.c(date)) : null, k9xVar, a2, M)), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.epu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    com.vk.core.compose.component.datetime.p.a(DateTimePickerState.this, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final DateTimePickerState dateTimePickerState, final q630 q630Var, SemanticsConfiguration semanticsConfiguration, rgy rgyVar, uey ueyVar, sg50 sg50Var, boolean z, EditingMode editingMode, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        SemanticsConfiguration semanticsConfiguration2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        final rgy rgyVar2;
        final uey ueyVar2;
        final EditingMode editingMode2;
        final boolean z3;
        final SemanticsConfiguration semanticsConfiguration3;
        final sg50 sg50Var2;
        androidx.compose.runtime.f s;
        SemanticsConfiguration semanticsConfiguration4;
        androidx.compose.runtime.a M = aVar.M(1535414551);
        if ((i & 6) == 0) {
            i3 = (M.J(dateTimePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            semanticsConfiguration2 = semanticsConfiguration;
            i3 |= M.J(semanticsConfiguration2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= M.J(null) ? 2048 : 1024;
            }
            i4 = 1794048 | i3;
            i5 = i2 & 128;
            if (i5 == 0) {
                i4 = 14376960 | i3;
            } else if ((12582912 & i) == 0) {
                z2 = z;
                i4 |= M.l(z2) ? 8388608 : 4194304;
                i6 = i2 & 256;
                int i8 = 100663296;
                if (i6 == 0) {
                    if ((100663296 & i) == 0) {
                        i8 = M.o(editingMode == null ? -1 : editingMode.ordinal()) ? 67108864 : 33554432;
                    }
                    if (M.t(i4 & 1, (38347923 & i4) == 38347922)) {
                        M.h();
                        rgyVar2 = rgyVar;
                        ueyVar2 = ueyVar;
                        editingMode2 = editingMode;
                        z3 = z2;
                        semanticsConfiguration3 = semanticsConfiguration2;
                        sg50Var2 = sg50Var;
                    } else {
                        if (i7 != 0) {
                            semanticsConfiguration2 = null;
                        }
                        rgy rgyVar3 = new rgy(3, 0, 123);
                        uey ueyVar3 = uey.d;
                        Object x = M.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x == c0012a) {
                            x = ir.h(M);
                        }
                        sg50 sg50Var3 = (sg50) x;
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            semanticsConfiguration4 = semanticsConfiguration2;
                            sg50Var2 = sg50Var3;
                            editingMode2 = EditingMode.Keyboard;
                        } else {
                            semanticsConfiguration4 = semanticsConfiguration2;
                            sg50Var2 = sg50Var3;
                            editingMode2 = editingMode;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1535414551, i4, -1, "com.vk.core.compose.component.datetime.VkDateTimePicker (VkDateTimePicker.kt:47)");
                        }
                        int i9 = i4 & 14;
                        boolean z4 = i9 == 4;
                        Object x2 = M.x();
                        if (z4 || x2 == c0012a) {
                            x2 = new y3l0(dateTimePickerState, 25);
                            M.R(x2);
                        }
                        int i10 = i4 << 3;
                        SemanticsConfiguration semanticsConfiguration5 = semanticsConfiguration4;
                        z3 = z2;
                        bqv0.c(dateTimePickerState, (gzs) x2, q630Var, semanticsConfiguration5, null, rgyVar3, sg50Var2, z3, editingMode2, M, (i10 & 1879048192) | (i10 & 896) | i9 | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10));
                        c(dateTimePickerState, M, i9);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        rgyVar2 = rgyVar3;
                        semanticsConfiguration3 = semanticsConfiguration5;
                        ueyVar2 = ueyVar3;
                    }
                    s = M.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.dpu0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                com.vk.core.compose.component.datetime.p.b(DateTimePickerState.this, q630Var, semanticsConfiguration3, rgyVar2, ueyVar2, sg50Var2, z3, editingMode2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i4 |= i8;
                if (M.t(i4 & 1, (38347923 & i4) == 38347922)) {
                }
                s = M.s();
                if (s == null) {
                }
            }
            z2 = z;
            i6 = i2 & 256;
            int i82 = 100663296;
            if (i6 == 0) {
            }
            i4 |= i82;
            if (M.t(i4 & 1, (38347923 & i4) == 38347922)) {
            }
            s = M.s();
            if (s == null) {
            }
        }
        semanticsConfiguration2 = semanticsConfiguration;
        if ((i2 & 8) == 0) {
        }
        i4 = 1794048 | i3;
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 256;
        int i822 = 100663296;
        if (i6 == 0) {
        }
        i4 |= i822;
        if (M.t(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        s = M.s();
        if (s == null) {
        }
    }

    public static final void c(DateTimePickerState dateTimePickerState, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-871891339);
        if ((i & 6) == 0) {
            i2 = (M.J(dateTimePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-871891339, i2, -1, "com.vk.core.compose.component.datetime.VkDateTimePickerDialog (VkDateTimePicker.kt:69)");
            }
            DateTimePickerState.DialogState dialogState = (DateTimePickerState.DialogState) ((zak0) dateTimePickerState.k).getValue();
            if (epx.f(dialogState, DateTimePickerState.DialogState.Closed.b)) {
                M.K(-368948871);
                M.j();
            } else if (epx.f(dialogState, DateTimePickerState.DialogState.DatePicker.b)) {
                M.K(-368947602);
                a(dateTimePickerState, M, i2 & 14);
                M.j();
            } else {
                if (!(dialogState instanceof DateTimePickerState.DialogState.TimePicker)) {
                    throw alb0.c(-368951054, M);
                }
                M.K(-368945573);
                d(dateTimePickerState, (DateTimePickerState.DialogState.TimePicker) dialogState, M, i2 & 14);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a71(dateTimePickerState, i, 3);
        }
    }

    public static final void d(DateTimePickerState dateTimePickerState, DateTimePickerState.DialogState.TimePicker timePicker, androidx.compose.runtime.a aVar, int i) {
        int i2;
        final int i3;
        final int i4;
        androidx.compose.runtime.a M = aVar.M(1828936296);
        if ((i & 6) == 0) {
            i2 = (M.J(dateTimePickerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(timePicker) : M.y(timePicker) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1828936296, i2, -1, "com.vk.core.compose.component.datetime.VkTimePickerDialog (VkDateTimePicker.kt:113)");
            }
            Date date = (Date) dateTimePickerState.i.getValue();
            if (date != null) {
                b.C0739b c0739b = h.a;
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                i3 = calendar.get(11);
            } else {
                i3 = 0;
            }
            Date date2 = (Date) dateTimePickerState.i.getValue();
            if (date2 != null) {
                b.C0739b c0739b2 = h.a;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date2);
                i4 = calendar2.get(12);
            } else {
                i4 = 0;
            }
            float f = kuo0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-972868615, 0, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
            }
            final boolean is24HourFormat = DateFormat.is24HourFormat((Context) M.r(AndroidCompositionLocals_androidKt.b));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1237715277, 0, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:587)");
            }
            Object[] objArr = new Object[0];
            fh9 fh9Var = new fh9(new uki(5), new wql0(6));
            boolean o = M.o(i3) | M.o(i4) | M.l(is24HourFormat);
            Object x = M.x();
            if (o || x == a.C0011a.a) {
                x = new gzs() { // from class: xsna.buo0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return new uuo0(i3, i4, is24HourFormat);
                    }
                };
                M.R(x);
            }
            uuo0 uuo0Var = (uuo0) crx0.D(objArr, fh9Var, (gzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            you0.a(6, M, kai.c(1466069749, new n87(dateTimePickerState, timePicker, uuo0Var, 10), M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u7d(dateTimePickerState, timePicker, i, 2);
        }
    }
}

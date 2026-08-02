package androidx.compose.ui.window;

import java.util.ArrayList;
import java.util.List;
import xsna.cp10;
import xsna.dp10;
import xsna.e43;
import xsna.ep10;
import xsna.izs;
import xsna.jgp;
import xsna.s3q0;
import xsna.tra0;
import xsna.zo10;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class AndroidPopup_androidKt$SimpleStack$1$1 implements cp10 {
    public static final AndroidPopup_androidKt$SimpleStack$1$1 a = new AndroidPopup_androidKt$SimpleStack$1$1();

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        int size = list.size();
        jgp jgpVar = jgp.b;
        if (size == 0) {
            return ep10Var.Q(0, 0, jgpVar, new izs<tra0.a, s3q0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.1
                @Override // xsna.izs
                public final /* bridge */ /* synthetic */ s3q0 invoke(tra0.a aVar) {
                    return s3q0.a;
                }
            });
        }
        if (size == 1) {
            final tra0 N = list.get(0).N(j);
            return ep10Var.Q(N.b, N.c, jgpVar, new izs<tra0.a, s3q0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.2
                {
                    super(1);
                }

                @Override // xsna.izs
                public final s3q0 invoke(tra0.a aVar) {
                    tra0.a.x(aVar, tra0.this, 0, 0);
                    return s3q0.a;
                }
            });
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            tra0 N2 = list.get(i3).N(j);
            i = Math.max(i, N2.b);
            i2 = Math.max(i2, N2.c);
            arrayList.add(N2);
        }
        return ep10Var.Q(i, i2, jgpVar, new izs<tra0.a, s3q0>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public final s3q0 invoke(tra0.a aVar) {
                tra0.a aVar2 = aVar;
                int h = e43.h(arrayList);
                if (h >= 0) {
                    int i4 = 0;
                    while (true) {
                        tra0.a.x(aVar2, arrayList.get(i4), 0, 0);
                        if (i4 == h) {
                            break;
                        }
                        i4++;
                    }
                }
                return s3q0.a;
            }
        });
    }
}

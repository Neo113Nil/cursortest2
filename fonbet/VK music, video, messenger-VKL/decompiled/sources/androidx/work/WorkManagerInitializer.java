package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import xsna.awx0;
import xsna.dwx0;
import xsna.lzw;
import xsna.m100;

/* loaded from: classes12.dex */
public final class WorkManagerInitializer implements lzw<awx0> {
    static {
        m100.d("WrkMgrInitializer");
    }

    @Override // xsna.lzw
    @NonNull
    public final awx0 create(@NonNull Context context) {
        m100.c().getClass();
        dwx0.i(context, new a(new a.C0091a()));
        return dwx0.h(context);
    }

    @Override // xsna.lzw
    @NonNull
    public final List<Class<? extends lzw<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}

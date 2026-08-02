package androidx.work;

import Q2.AbstractC1508t;
import Q2.L;
import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements H2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23711a = AbstractC1508t.i("WrkMgrInitializer");

    @Override // H2.b
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // H2.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public L create(Context context) {
        AbstractC1508t.e().a(f23711a, "Initializing WorkManager with default configuration.");
        L.j(context, new a.C0414a().a());
        return L.h(context);
    }
}

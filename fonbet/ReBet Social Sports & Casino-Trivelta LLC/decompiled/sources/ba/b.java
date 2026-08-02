package ba;

import android.content.Context;
import android.os.AsyncTask;
import ba.AbstractC2414a;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.common.C3173f;

/* loaded from: classes2.dex */
public final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f25012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC2414a.InterfaceC0433a f25013b;

    public b(Context context, AbstractC2414a.InterfaceC0433a interfaceC0433a) {
        this.f25012a = context;
        this.f25013b = interfaceC0433a;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            AbstractC2414a.a(this.f25012a);
            return 0;
        } catch (C3172e e10) {
            return Integer.valueOf(e10.f32609a);
        } catch (C3173f e11) {
            return Integer.valueOf(e11.b());
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        C3171d c3171d;
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f25013b.a();
            return;
        }
        Context context = this.f25012a;
        C3171d c3171d2 = AbstractC2414a.f25008a;
        int intValue = num.intValue();
        c3171d = AbstractC2414a.f25008a;
        this.f25013b.b(num.intValue(), c3171d.d(context, intValue, "pi"));
    }
}

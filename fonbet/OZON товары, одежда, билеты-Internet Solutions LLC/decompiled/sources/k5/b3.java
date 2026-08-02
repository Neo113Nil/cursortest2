package k5;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class b3 implements InterfaceC7587y0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f70716a;

    b3(@NonNull Context context) {
        this.f70716a = context;
    }

    @NonNull
    public final ArrayList<InterfaceC7496b0> a() {
        ArrayList<InterfaceC7496b0> arrayList = new ArrayList<>();
        Context context = this.f70716a;
        Iterator it = new V0(context).a().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C7490I) d3.a(((Integer) it.next()).intValue(), context)).b().iterator();
            while (it2.hasNext()) {
                InterfaceC7496b0 interfaceC7496b0 = (InterfaceC7496b0) it2.next();
                if (!arrayList.contains(interfaceC7496b0) && interfaceC7496b0.w() != L0.f16default) {
                    arrayList.add(interfaceC7496b0);
                }
            }
        }
        return arrayList;
    }
}

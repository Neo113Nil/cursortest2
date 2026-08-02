package w0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import w0.N;

/* loaded from: classes8.dex */
final class x extends AbstractC7737t implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Z1.b>>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f103314b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w f103315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(N n11, w wVar) {
        super(1);
        this.f103314b = n11;
        this.f103315c = wVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<Pair<? extends Integer, ? extends Z1.b>> invoke(Integer num) {
        N.c b11 = this.f103314b.b(num.intValue());
        int a11 = b11.a();
        ArrayList<Pair<? extends Integer, ? extends Z1.b>> arrayList = new ArrayList<>(b11.b().size());
        List<C10387c> b12 = b11.b();
        int size = b12.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int b13 = (int) b12.get(i12).b();
            arrayList.add(new Pair<>(Integer.valueOf(a11), Z1.b.a(this.f103315c.a(i11, b13))));
            a11++;
            i11 += b13;
        }
        return arrayList;
    }
}

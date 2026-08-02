package s7;

import com.google.android.gms.measurement.internal.zzoh;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements Function {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c2 f22673a = new c2();

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return Long.valueOf(((zzoh) obj).f5802b);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}

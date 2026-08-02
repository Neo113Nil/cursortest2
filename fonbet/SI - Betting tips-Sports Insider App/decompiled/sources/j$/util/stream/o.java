package j$.util.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final class o extends j5 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18009b;

    /* renamed from: c, reason: collision with root package name */
    public Object f18010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(b bVar, n5 n5Var, int i5) {
        super(n5Var);
        this.f18009b = i5;
        this.f18010c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(n5 n5Var) {
        super(n5Var);
        this.f18009b = 0;
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public void end() {
        switch (this.f18009b) {
            case 0:
                this.f18010c = null;
                this.f17941a.end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.n5
    public void c(long j) {
        switch (this.f18009b) {
            case 0:
                this.f18010c = new HashSet();
                this.f17941a.c(-1L);
                break;
            case 1:
            default:
                super.c(j);
                break;
            case 2:
                this.f17941a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f18009b) {
            case 0:
                if (!((Set) this.f18010c).contains(obj)) {
                    ((Set) this.f18010c).add(obj);
                    this.f17941a.accept((n5) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((s) this.f18010c).f18068t).accept(obj);
                this.f17941a.accept((n5) obj);
                break;
            case 2:
                if (((Predicate) ((s) this.f18010c).f18068t).test(obj)) {
                    this.f17941a.accept((n5) obj);
                    break;
                }
                break;
            case 3:
                this.f17941a.accept((n5) ((Function) ((s) this.f18010c).f18068t).apply(obj));
                break;
            case 4:
                this.f17941a.accept(((ToIntFunction) ((w0) this.f18010c).f18121t).applyAsInt(obj));
                break;
            case 5:
                this.f17941a.accept(((ToLongFunction) ((g1) this.f18010c).f17909t).applyAsLong(obj));
                break;
            default:
                this.f17941a.accept(((ToDoubleFunction) ((x) this.f18010c).f18140t).applyAsDouble(obj));
                break;
        }
    }
}

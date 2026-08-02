package d00;

import d00.C6018d;
import hi.InterfaceC6958a;
import j20.InterfaceC7243a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import n20.i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00020\n0\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld00/e;", "Ln20/i;", "Lk20/g;", "storage", "Lj20/a;", "", "config", "(Lk20/g;)Lj20/a;", "", "Lm20/a;", "Ll20/c;", "viewMappers", "(Lk20/g;)[Lm20/a;", "Lk20/e;", "Lhi/a;", "widgetComponent", "(Lk20/g;)[Lk20/e;", "composer-compose-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: d00.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6019e extends i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6018d.a<InterfaceC7243a<? extends Object>> f60968a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6018d<Object> f60969b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6019e(C6018d.a<InterfaceC7243a<? extends Object>> aVar, C6018d<Object> c6018d, String str, String str2, long[] jArr) {
        super(str, str2, jArr);
        this.f60968a = aVar;
        this.f60969b = c6018d;
    }

    @Override // n20.i
    public InterfaceC7243a<? extends Object> config(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return this.f60968a.get(storage);
    }

    @Override // n20.i
    public InterfaceC8046a<?, ? extends l20.c>[] viewMappers(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        C6018d<Object> c6018d = this.f60969b;
        int size = c6018d.g().size();
        InterfaceC8046a<?, ? extends l20.c>[] interfaceC8046aArr = new InterfaceC8046a[size];
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC8046aArr[i11] = c6018d.g().get(i11).get(storage);
        }
        return interfaceC8046aArr;
    }

    @Override // n20.i
    public C7473e<? extends InterfaceC6958a>[] widgetComponent(C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        C6018d<Object> c6018d = this.f60969b;
        if (c6018d.j().isEmpty()) {
            return new C7473e[0];
        }
        int size = c6018d.j().size();
        C7473e<? extends InterfaceC6958a>[] c7473eArr = new C7473e[size];
        for (int i11 = 0; i11 < size; i11++) {
            c7473eArr[i11] = c6018d.j().get(i11).get(storage);
        }
        return c7473eArr;
    }
}

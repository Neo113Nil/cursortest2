package kotlin.sequences;

import com.vk.id.internal.auth.app.SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C7714v;

/* loaded from: classes10.dex */
public final class C implements Sequence<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7747g f71870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1 f71871b;

    C(C7747g c7747g, SilentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1 silentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1) {
        this.f71870a = c7747g;
        this.f71871b = silentAuthServicesProvider$getSilentAuthServices$$inlined$sortedByDescending$1;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<Object> iterator() {
        ArrayList D11 = l.D(this.f71870a);
        C7714v.G0(this.f71871b, D11);
        return D11.iterator();
    }
}

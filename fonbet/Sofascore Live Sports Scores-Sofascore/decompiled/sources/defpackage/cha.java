package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class cha extends aha {
    public final c j;
    public final List k;
    public final int l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cha(yea yeaVar, c cVar) {
        super(yeaVar, cVar, (String) null, 12);
        yeaVar.getClass();
        this.j = cVar;
        List S0 = CollectionsKt.S0(cVar.a.keySet());
        this.k = S0;
        this.l = S0.size() * 2;
        this.m = -1;
    }

    @Override // defpackage.aha, defpackage.o4
    public final b F(String str) {
        str.getClass();
        return this.m % 2 == 0 ? qfa.c(str) : (b) rub.a(str, this.j);
    }

    @Override // defpackage.aha, defpackage.o4
    public final String R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return (String) this.k.get(i / 2);
    }

    @Override // defpackage.aha, defpackage.o4
    public final b T() {
        return this.j;
    }

    @Override // defpackage.aha
    /* renamed from: Y */
    public final c T() {
        return this.j;
    }

    @Override // defpackage.aha, defpackage.o4, defpackage.uf3
    public final void c(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // defpackage.aha, defpackage.uf3
    public final int o(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}

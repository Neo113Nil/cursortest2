package n2;

import d1.C3985a;
import e1.AbstractC4134a;
import e1.InterfaceC4148o;
import e1.J;
import e1.Z;
import e2.C4163e;
import e2.s;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5663a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final J f56948a = new J();

    public static C3985a d(J j10, int i10) {
        CharSequence charSequence = null;
        C3985a.b bVar = null;
        while (i10 > 0) {
            AbstractC4134a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int v10 = j10.v();
            int v11 = j10.v();
            int i11 = v10 - 8;
            String I10 = Z.I(j10.f(), j10.g(), i11);
            j10.c0(i11);
            i10 = (i10 - 8) - i11;
            if (v11 == 1937011815) {
                bVar = e.p(I10);
            } else if (v11 == 1885436268) {
                charSequence = e.r(null, I10.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.o(charSequence).a() : e.m(charSequence);
    }

    @Override // e2.s
    public void a(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC4148o interfaceC4148o) {
        this.f56948a.Z(bArr, i11 + i10);
        this.f56948a.b0(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f56948a.a() > 0) {
            AbstractC4134a.b(this.f56948a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int v10 = this.f56948a.v();
            if (this.f56948a.v() == 1987343459) {
                arrayList.add(d(this.f56948a, v10 - 8));
            } else {
                this.f56948a.c0(v10 - 8);
            }
        }
        interfaceC4148o.accept(new C4163e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // e2.s
    public int c() {
        return 2;
    }
}

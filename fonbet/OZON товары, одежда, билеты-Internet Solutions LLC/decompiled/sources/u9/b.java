package u9;

import androidx.recyclerview.widget.m;

/* loaded from: classes9.dex */
final class b implements g {
    @Override // u9.g
    public final void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (true) {
            if (!hVar.h()) {
                break;
            }
            sb2.append(hVar.c());
            hVar.f100410f++;
            if (j.g(hVar.f100410f, 5, hVar.d()) != 5) {
                hVar.n(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int a11 = hVar.a() + length + 1;
        hVar.p(a11);
        boolean z11 = hVar.g().a() - a11 > 0;
        if (hVar.h() || z11) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb2.setCharAt(0, (char) ((length / m.e.DEFAULT_SWIPE_ANIMATION_DURATION) + 249));
                sb2.insert(1, (char) (length % m.e.DEFAULT_SWIPE_ANIMATION_DURATION));
            }
        }
        int length2 = sb2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            int a12 = (((hVar.a() + 1) * 149) % 255) + 1 + sb2.charAt(i11);
            if (a12 > 255) {
                a12 -= 256;
            }
            hVar.q((char) a12);
        }
    }
}

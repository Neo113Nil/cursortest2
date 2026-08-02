package t2;

import android.media.MediaCodecInfo;
import com.google.common.collect.AbstractC3445z;

/* renamed from: t2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6414p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC6414p0 f65490a = new InterfaceC6414p0() { // from class: t2.o0
        @Override // t2.InterfaceC6414p0
        public final AbstractC3445z b(String str) {
            return InterfaceC6414p0.c(str);
        }
    };

    static /* synthetic */ AbstractC3445z c(final String str) {
        AbstractC3445z h10 = AbstractC6416q0.h(str);
        AbstractC3445z n10 = AbstractC3445z.n(com.google.common.collect.I.d(h10, new Ra.o() { // from class: t2.n0
            @Override // Ra.o
            public final boolean apply(Object obj) {
                boolean m10;
                m10 = AbstractC6416q0.m((MediaCodecInfo) obj, str);
                return m10;
            }
        }));
        return n10.isEmpty() ? h10 : n10;
    }

    AbstractC3445z b(String str);
}

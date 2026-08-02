package androidx.media3.exoplayer.source;

import com.google.common.collect.AbstractC3445z;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.source.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2210k implements InterfaceC2209j {
    @Override // androidx.media3.exoplayer.source.InterfaceC2209j
    public d0 a(List list, List list2) {
        return new C2208i(list, list2);
    }

    @Override // androidx.media3.exoplayer.source.InterfaceC2209j
    public d0 empty() {
        return new C2208i(AbstractC3445z.t(), AbstractC3445z.t());
    }
}

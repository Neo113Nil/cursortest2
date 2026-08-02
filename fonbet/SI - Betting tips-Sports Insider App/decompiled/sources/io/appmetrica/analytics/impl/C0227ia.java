package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ia, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227ia implements N9 {

    /* renamed from: a, reason: collision with root package name */
    public final J8 f13939a = new J8();

    @NotNull
    public final C0071c9[] a(@Nullable byte[] bArr) {
        int i5 = 0;
        if (bArr == null) {
            return new C0071c9[0];
        }
        Map<String, byte[]> model = this.f13939a.toModel(bArr);
        C0071c9[] c0071c9Arr = new C0071c9[model.size()];
        for (Object obj : model.entrySet()) {
            int i10 = i5 + 1;
            if (i5 < 0) {
                kotlin.collections.u.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C0071c9 c0071c9 = new C0071c9();
            c0071c9.f13507a = ((String) entry.getKey()).getBytes(Charsets.UTF_8);
            c0071c9.f13508b = (byte[]) entry.getValue();
            c0071c9Arr[i5] = c0071c9;
            i5 = i10;
        }
        return c0071c9Arr;
    }
}

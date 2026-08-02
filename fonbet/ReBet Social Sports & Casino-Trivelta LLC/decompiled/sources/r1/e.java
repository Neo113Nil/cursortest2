package r1;

import android.net.Uri;
import e1.AbstractC4134a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f63751a;

    public class a extends LinkedHashMap {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f63752a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f63752a = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f63752a;
        }
    }

    public e(int i10) {
        this.f63751a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f63751a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f63751a.put((Uri) AbstractC4134a.e(uri), (byte[]) AbstractC4134a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f63751a.remove(AbstractC4134a.e(uri));
    }
}

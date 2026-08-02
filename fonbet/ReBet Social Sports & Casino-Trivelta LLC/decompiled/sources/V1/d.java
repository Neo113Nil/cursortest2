package V1;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f12339b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12340c;
    public final String[] children;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12341d;
    private final i[] subFrames;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f12339b = str;
        this.f12340c = z10;
        this.f12341d = z11;
        this.children = strArr;
        this.subFrames = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f12340c == dVar.f12340c && this.f12341d == dVar.f12341d && Objects.equals(this.f12339b, dVar.f12339b) && Arrays.equals(this.children, dVar.children) && Arrays.equals(this.subFrames, dVar.subFrames)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f12340c ? 1 : 0)) * 31) + (this.f12341d ? 1 : 0)) * 31;
        String str = this.f12339b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}

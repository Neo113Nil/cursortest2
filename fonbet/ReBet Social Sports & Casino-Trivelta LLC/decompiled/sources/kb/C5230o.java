package kb;

import com.google.firebase.auth.MultiFactorResolver;

/* renamed from: kb.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5230o extends C5226k {

    /* renamed from: b, reason: collision with root package name */
    public MultiFactorResolver f54409b;

    public C5230o(String str, String str2, MultiFactorResolver multiFactorResolver) {
        super(str, str2);
        this.f54409b = multiFactorResolver;
    }

    public MultiFactorResolver b() {
        return this.f54409b;
    }
}

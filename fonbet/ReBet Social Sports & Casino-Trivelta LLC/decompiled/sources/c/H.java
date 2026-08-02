package c;

import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.surt.guardian.utils.Logger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import zc.C6957c;

/* loaded from: classes.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C6957c f26429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C6957c c6957c) {
        super(0);
        this.f26429d = c6957c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return IntegrityManagerFactory.create(this.f26429d.f68669a);
        } catch (Exception e10) {
            Logger.f41582a.f("AttestationManager", "Play Integrity not available: " + e10.getMessage());
            return null;
        }
    }
}

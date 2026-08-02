package c;

import com.surt.guardian.GuardianSDK;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: c.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2465s extends ContinuationImpl {

    /* renamed from: n, reason: collision with root package name */
    public GuardianSDK f26665n;

    /* renamed from: o, reason: collision with root package name */
    public String f26666o;

    /* renamed from: p, reason: collision with root package name */
    public C2443g0 f26667p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26668q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f26669r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26670s;

    /* renamed from: t, reason: collision with root package name */
    public int f26671t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2465s(GuardianSDK guardianSDK, Continuation continuation) {
        super(continuation);
        this.f26670s = guardianSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26669r = obj;
        this.f26671t |= Integer.MIN_VALUE;
        return GuardianSDK.access$collectDeviceData(this.f26670s, null, null, null, false, this);
    }
}

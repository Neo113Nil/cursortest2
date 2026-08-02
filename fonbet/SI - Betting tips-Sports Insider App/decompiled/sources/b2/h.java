package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f2979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f2980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f2981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f2982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.collections.l f2983e;

    public /* synthetic */ h(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, j jVar, boolean z5, kotlin.collections.l lVar) {
        this.f2979a = booleanRef;
        this.f2980b = booleanRef2;
        this.f2981c = jVar;
        this.f2982d = z5;
        this.f2983e = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y1.l entry = (y1.l) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f2979a.element = true;
        this.f2980b.element = true;
        this.f2981c.m(entry, this.f2982d, this.f2983e);
        return Unit.f19194a;
    }
}

package bd;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: bd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2418b implements InterfaceC2417a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25014a;

    public AbstractC2418b(boolean z10) {
        this.f25014a = z10;
    }

    public boolean b() {
        return this.f25014a;
    }

    @Override // bd.InterfaceC2417a
    public void disable() {
        this.f25014a = false;
    }

    @Override // bd.InterfaceC2417a
    public void enable() {
        this.f25014a = true;
    }

    public /* synthetic */ AbstractC2418b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }
}

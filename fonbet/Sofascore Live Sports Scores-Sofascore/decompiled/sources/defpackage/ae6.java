package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ae6 extends Throwable {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ae6(String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        int i = this.a;
        return this;
    }
}

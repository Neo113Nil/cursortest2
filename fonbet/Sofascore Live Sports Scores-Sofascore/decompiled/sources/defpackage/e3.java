package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public interface e3 extends fk4 {
    @Override // defpackage.fk4
    default void b(String str) {
        str.getClass();
        e().a(new el3(str));
    }

    default of2 build() {
        return new of2(e().a);
    }

    ef0 e();

    e3 l();
}

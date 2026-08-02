package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class mjk extends ljk {
    public static final void b(int i, String str, String str2) {
        StringBuilder q = mz1.q(i, "Expected ", str2, " at index ", ", but was '");
        q.append(str.charAt(i));
        q.append('\'');
        throw new IllegalArgumentException(q.toString());
    }
}

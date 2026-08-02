package defpackage;

import java.util.function.Function;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class nvo implements Function {
    public static final /* synthetic */ nvo b = new nvo(0);
    public static final /* synthetic */ nvo c = new nvo(1);
    public static final /* synthetic */ nvo d = new nvo(2);
    public final /* synthetic */ int a;

    public /* synthetic */ nvo(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.a) {
        }
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}

package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class myf {
    public static final myf a;
    public static final myf b;
    public static final myf c;
    public static final /* synthetic */ myf[] d;

    static {
        myf myfVar = new myf("AUTOMATIC", 0);
        a = myfVar;
        myf myfVar2 = new myf("HARDWARE", 1);
        b = myfVar2;
        myf myfVar3 = new myf("SOFTWARE", 2);
        c = myfVar3;
        d = new myf[]{myfVar, myfVar2, myfVar3};
    }

    public static myf valueOf(String str) {
        return (myf) Enum.valueOf(myf.class, str);
    }

    public static myf[] values() {
        return (myf[]) d.clone();
    }
}

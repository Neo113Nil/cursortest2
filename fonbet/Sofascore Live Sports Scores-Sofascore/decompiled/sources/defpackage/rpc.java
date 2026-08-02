package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rpc {
    public static final rpc a;
    public static final rpc b;
    public static final rpc c;
    public static final /* synthetic */ rpc[] d;
    public static final /* synthetic */ kp5 e;

    static {
        rpc rpcVar = new rpc("LIVE", 0);
        a = rpcVar;
        rpc rpcVar2 = new rpc("UPCOMING", 1);
        b = rpcVar2;
        rpc rpcVar3 = new rpc("FINISHED", 2);
        c = rpcVar3;
        rpc[] rpcVarArr = {rpcVar, rpcVar2, rpcVar3};
        d = rpcVarArr;
        e = new kp5(rpcVarArr);
    }

    public static rpc valueOf(String str) {
        return (rpc) Enum.valueOf(rpc.class, str);
    }

    public static rpc[] values() {
        return (rpc[]) d.clone();
    }
}

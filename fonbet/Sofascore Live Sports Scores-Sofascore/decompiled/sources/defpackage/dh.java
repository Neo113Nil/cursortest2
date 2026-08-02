package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class dh implements mt8, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public dh(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        return this.isTopLevel == dhVar.isTopLevel && this.arity == dhVar.arity && this.flags == dhVar.flags && Intrinsics.c(this.receiver, dhVar.receiver) && Intrinsics.c(this.owner, dhVar.owner) && this.name.equals(dhVar.name) && this.signature.equals(dhVar.signature);
    }

    @Override // defpackage.mt8
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? duf.a.getOrCreateKotlinPackage(cls, "") : duf.a.getOrCreateKotlinClass(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((dmi.c(dmi.c((hashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return duf.a.renderLambdaToString(this);
    }

    public dh(Class cls, String str) {
        this(0, 0, cls, nh2.NO_RECEIVER, "<init>", str);
    }
}

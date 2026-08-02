package kotlin.jvm.internal;

import ag.b;
import ag.e;
import ag.v;
import ag.w;
import ag.z;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import uf.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class CallableReference implements b, Serializable {
    public static final Object NO_RECEIVER = NoReceiver.INSTANCE;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class NoReceiver implements Serializable {
        private static final NoReceiver INSTANCE = new NoReceiver();

        private NoReceiver() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // ag.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // ag.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract b computeReflected();

    @Override // ag.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.getOrCreateKotlinPackage(cls) : Reflection.getOrCreateKotlinClass(cls);
    }

    @Override // ag.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public b getReflected() {
        b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new a();
    }

    @Override // ag.b
    public v getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // ag.b
    public List<w> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // ag.b
    public z getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // ag.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // ag.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // ag.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // ag.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z5) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z5;
    }
}

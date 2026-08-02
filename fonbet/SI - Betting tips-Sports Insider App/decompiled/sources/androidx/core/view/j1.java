package androidx.core.view;

import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class j1 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    k2 mDispachedInsets;
    private final int mDispatchMode = 0;

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract void onEnd(s1 s1Var);

    public abstract void onPrepare(s1 s1Var);

    public abstract k2 onProgress(k2 k2Var, List list);

    public abstract i1 onStart(s1 s1Var, i1 i1Var);
}
